/** StdIo.java */
/*Submitted by
* Shruti Jagadeesh Bhat,
* W1587845 , Santa Clara Unviersity*/
import java.io.*;
import java.nio.file.Paths;
import java.util.*;

public class P1 {
   public static int fileListSize = 0;
   public static int shingleSetSize = 0;
    public static int docsetRowSize = 0;
    public static int docsetColSize = 0;
    public static double sim = 0.8; //similarity
    public static int bands = 20;
    public static int rows = 5;
    public static double t =0;
    public static int buckets = 200;
    public static int hashes = 100; //number of hash functions, make it 100
    public static  List<Integer> aRand = new LinkedList<>();
    public static List<Integer> bRand = new LinkedList<>();

    public static void main(String[ ] args) throws IOException,IllegalArgumentException,FileNotFoundException {

        List<String> filecontentList = new LinkedList<>();
        Random rand = new Random();

        Scanner in = new Scanner(new InputStreamReader(System.in));
        String s = "";

        String fileContent;
        StringBuilder sb = null;

        // Collect the file data and store it in a list

        int ind=0;
        while ( in.hasNext() ) {
            // read from the text files inside the data file ---------------------------
            try {
                s = in.next();
		String base = "/home/mwang2/test/coen281/";
                s = base+s;
                File file = new File(s);
                Paths.get(s);
                // read from the text files inside the data file ---------------------------
                if ((!file.exists() || file.toString().isEmpty())) {
                    System.err.println("Wrong file Error: File either doesnt exist or broken! Skipping the file: " + s);
                    continue;

                }
            } catch (Exception e) {
                System.err.println("Wrong file Error: File either doesnt exist or broken! Skipping the file: " + s);
                continue;
            }

            String[] files = s.replace("( )+"," ").split(" ");

            for(String f :files){
                try {

                    try{
                        File fi = new File(f);
                        if(fi.exists() && !fi.isDirectory()) {
                            // do something
                        }
                        if(fi.length() == 0){
                            System.err.println("Empty File! Skipping the file: "+f);
                            continue;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid File path!!");
                        e.printStackTrace();
                    }

                    String filePath = new File(f).getAbsolutePath();
                    filePath.concat(f);
                    FileReader fr = new FileReader(f);
                    BufferedReader reader = new BufferedReader(fr);

                    // reset the string builder for every file
                    sb = new StringBuilder();

                    while ((fileContent = reader.readLine()) != null){
                        fileContent = fileContent.replaceAll("(?:--|[\\[\\]{}():+-/\\\\])", " ");
                      fileContent = fileContent.replaceAll("( )+"," ");
                        if(fileContent.length() != 0){
                            sb.append(fileContent);

                        }
                    }
                    filecontentList.add(ind,sb.toString().toLowerCase()); //linked list of content  of each file as strings
                    ind++;
                } catch (Exception e) {

                    e.printStackTrace();
                }
            }

        }

        fileListSize = filecontentList.size();


        // Shingling ---------------------------
        int k = 9; //Shingling with k =9
        ArrayList<ArrayList<String>> fileShingArrLst = new ArrayList<>(); // 2D matrix consisting of ever file's shingles array
        ArrayList<String> temp = null;
        List<String> shingleSetList = new LinkedList<>(); //for ordered set list

        for (String fcl:filecontentList) {
            temp = new ArrayList<>();
            for (int i = 0; i <= fcl.length() - k; i++){
                String substr = fcl.substring(i, i + k);
                temp.add(substr);
                if(!shingleSetList.contains(substr)){
                    shingleSetList.add(substr);
                }

            }
            fileShingArrLst.add(temp );
        }

        shingleSetSize = shingleSetList.size();

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" +
                ">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        //PRINT SHINGLES
        System.out.println("\nSET OF UNIQUE SHINGLES:\n");
        System.out.print(shingleSetList);



        // DOCUMENT - TERM MATRIX
        ArrayList<ArrayList<Integer>> docMatrix = new ArrayList<>();

        int val = 0;
        int count1 = 0;
        ArrayList<Integer> rowVals = new ArrayList<>();
        ArrayList<Integer> colVals = new ArrayList<>();

        // Set-Document Shingling matrix

        for (ArrayList<String> fcl:fileShingArrLst) { //col //0-5
                colVals =new ArrayList<>();
                colVals.clear();
                for(String shi:shingleSetList){//row - set reference  0-1650

                    if(fcl.contains(shi)){
                        val = 1;
                    }else{
                        val =0;
                    }
                colVals.add(val);//list
            }
            docMatrix.add(colVals);//add the 1651 values for each file
        }

        docMatrix = transpose(docMatrix);
        docsetRowSize = docMatrix.size(); //same as shingleSetSize
        docsetColSize = fileListSize;


        //print shingle-document matrix

        System.out.println("\n\nSHINGLE-DOCUMENT MATRIX:");
        for (int i=0;i<docMatrix.size();i++) {
            System.out.print("| ");
            for(int j=0;j<docMatrix.get(i).size();j++) {
                System.out.print(docMatrix.get(i).get(j)+" ");
            }
            System.out.println("|");
        }

        //randomize the values of a , b and create random hashfunctions;
        ArrayList<ArrayList<Integer>> hashfuncList = new ArrayList<>();
        ArrayList<Integer> colHashList = new ArrayList<>();



        // a and b random value generation
        if(docsetRowSize > 0){
            for(int i=0;i<hashes;i++){
                aRand.add(rand.nextInt(docsetRowSize));
            }
            for(int i=0;i<hashes;i++){
                bRand.add(rand.nextInt(docsetRowSize));
            }
        }
        else{
            System.err.println("Empty Bound!");
        }


        //create random has fuction lists using hashPermuteRows() function
        for(int i=0;i<hashes;i++){ //each hash is a column
            colHashList.clear();
            for(int j=0;j<shingleSetSize;j++){
                colHashList.add(hashPermuteRows(aRand.get(i),bRand.get(i),j,shingleSetSize));
            }
            hashfuncList.add(colHashList); //outer X inner loop size
        }
        hashfuncList = transpose(hashfuncList);

        //initialization of minhashes with max value
        ArrayList<ArrayList<Integer>> minHashSlot = new ArrayList<>();
        int[][] minHashMx = new int[fileListSize][hashes];

        for(int f=0;f<fileListSize;f++){
            for(int h=0;h<hashes;h++){
                minHashMx[f][h]=Integer.MAX_VALUE;
            }
        }

        ArrayList<Integer> infList = new ArrayList<>();
        for(int c=0;c<fileListSize;c++){//columns are as many as files
            infList.add(Integer.MAX_VALUE);
        }
        for(int h =0;h<hashes;h++){ //rows are the hashes
            minHashSlot.add(infList);
        }

        //creating sigmatrix from these hashfunctions:
        ArrayList<Integer> hashValues = new ArrayList<>();
        Random ra = new Random();

        for(int row =0;row<docsetRowSize;row++){
            ArrayList<Integer> hCurr = new ArrayList<>();
            for(Integer r : hashfuncList.get(row)){
                hCurr.add(hashPermuteRows(ra.nextInt(shingleSetSize),ra.nextInt(shingleSetSize),row,shingleSetSize));
                hashValues = hCurr;
            }
            for(int col=0;col<fileListSize;col++){
                if(docMatrix.get(row).get(col) == 1){
                    for (int hi=0;hi<hCurr.size();hi++) {
                       ArrayList<Integer> slot = new ArrayList<>();

                        if((int)hCurr.get(hi) < minHashMx[col][hi]){//rows : hi
                            minHashMx[col][hi] = hCurr.get(hi);
                            slot.add(hCurr.get(hi)); // [---,---,] ; [ [,,,,,] , [,,,,] , [,,,] ]
                        }
                        minHashSlot.get(hi).set(col,hCurr.get(hi));
                    }
                }

            }
        }

        //print hashvalues
        System.out.println("\nRANDOMIZED MIN HASH VALUES:");
        System.out.print(hashValues);
        System.out.println();

        //print minhashslot
        ArrayList<ArrayList<Integer>> minHashTable = new ArrayList<>();
        System.out.println("\nSIGNATURE MATRIX :");
       for(int h=0;h<hashes;h++){
           for (int f =0;f<fileListSize;f++) {
               System.out.print(minHashMx[f][h]+"  ");
            }
           System.out.println();
        }

        //LSH

        int minHashMxSize = fileListSize*hashes;
        int[][] slicedMx = new int[fileListSize][hashes];

        Random rnd = new Random();
        int ar = 0; int br =0;
        HashMap<Integer, Integer> hashMapCols = new HashMap<>(); //row int and col Integer
        List<int[]> columns = new LinkedList<>();

        //retrieve only columns
        for(int i=0;i<fileListSize;i++){
            columns.add(minHashMx[i]);
        }

        ar = rnd.nextInt(hashes);
        br = rnd.nextInt(hashes);
        List<int[]> bandSlice = new LinkedList<>();
        List<int[]> rowSlice = new LinkedList<>();

//        Hashfunction family
        double d1=0.2;
        double d2=0.8;
        double p1=0.997;
        double p2 =0.003;

    } //end of main()

    public static int getHash(int key){
        return key%buckets; //bucket size
    }

    public static Integer hashPermuteRows(Integer aRand, Integer bRand,int currentRow, int size){
        Integer h = ((aRand * currentRow) + bRand) % size;
        return h;
    }

    //Reference: Stackoverflow.com answered by account "the_dover" :
    public static ArrayList<ArrayList<Integer>> transpose (ArrayList<ArrayList<Integer>> matrixIn){
        ArrayList<ArrayList<Integer>> matrixOut = new ArrayList<>();
        int rowCount = matrixIn.size();
        int colCount = 0;

        //find max width
        for(int i = 0; i < rowCount; i++){
            ArrayList<Integer> row = matrixIn.get(i);
            int rowSize = row.size();
            if(rowSize > colCount){
                colCount = rowSize;
            }
        }
        //for each row in matrix
        for (int r = 0; r < rowCount; r++){
            ArrayList<Integer> innerIn = matrixIn.get(r);

            //for each item in that row
            for (int c = 0; c < colCount; c++){

                //add it to the outgoing matrix
                //get matrixOut[c], or create it
                ArrayList<Integer> matrixOutRow = new ArrayList<>();
                if (r != 0) {
                    try{
                        matrixOutRow = matrixOut.get(c);
                    }catch(java.lang.IndexOutOfBoundsException e){
                        System.out.println("Transposition error!\n"
                                + "could not get matrixOut at index "
                                + c + " - out of bounds" +e);
                        matrixOutRow.add(null);
                    }
                }
                //add innerIn[c]
                try{
                    matrixOutRow.add(innerIn.get(c));
                }catch (java.lang.IndexOutOfBoundsException e){
                    matrixOutRow.add(null);
                }

                //reset to matrixOut[c]
                try {
                    matrixOut.set(c,matrixOutRow);
                }catch(java.lang.IndexOutOfBoundsException e){
                    matrixOut.add(matrixOutRow);
                }
            }
        }
        return matrixOut;
    }

}







