# Data-mining-Plagiarism-Check
A Java program to check Plagiarisms between multiple documents using the method of Shingling,MinHashing and Locality Sensitive Hashing

README -
----------------------------
COEN 281 Programming Assignment 1 
Submitted by,

Shruti Jagadeesh Bhat
W1587845
----------------------------
Assumptions:
- If a file is empty, it is skipped from the computations.
- All the test files, (eg: t1*.dat and .txt) files are assumed to be in the same folder as the mentioned path - "/home/mwang2/test/coen281"

----------------------------
Self - submission details:

[sbhat1@linux10610 ~]$ perl Autotest 1
sbhat1
P1/
P1/Makefile
P1/P1.java
P1/README.txt
gmake under /DCNFS/users/student/sbhat1/AutoTestDir/sbhat1/P1
javac P1.java
time java P1 < /home/mwang2/test/coen281/t10.dat >> out

real	0m0.501s
user	0m0.979s
sys	0m0.065s
time java P1 < /home/mwang2/test/coen281/t11.dat >> out

real	0m0.239s
user	0m0.377s
sys	0m0.037s
time java P1 < /home/mwang2/test/coen281/t19.dat >> out
Wrong file Error: File either doesnt exist or broken! Skipping the file: /home/mwang2/test/coen281/@gamil.com
Empty Bound!

real	0m0.112s
user	0m0.096s
sys	0m0.024s
[sbhat1@linux10610 ~]$ 

----------------------------
References;
Code snippet of transpose of an ArrayList<> Matrix from Stack Overflow.
Text Book - Mining of Massive data sets

My Test Outputs:
grafikos@MacBook-Pro src % javac P1.java    
grafikos@MacBook-Pro src % java P1 < t10.dat
Empty File! Skipping the file: f3.txt
Wrong file Error: File either doesnt exist or broken! Skipping the file: @gmail.com
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

SET OF UNIQUE SHINGLES:

[f2 tradit, 2 traditi,  traditio, tradition, raditiona, aditional, ditional , itional r, tional re, ional rel, onal rela, nal relat, al relati, l relatio,  relation, relationa, elational, lational , ational d, tional da, ional dat, onal data, nal datab, al databa, l databas,  database, databases, atabases , tabases w, abases wi, bases wit, ases with, ses with , es with s, s with st,  with sta, with stat, ith stati, th static, h static ,  static s, static sc, tatic sch, atic sche, tic schem, ic schema, c schemas,  schemas , schemas a, chemas ar, hemas are, emas are , mas are d, as are de, s are des,  are desi, are desig, re design, e designe,  designed, designed , esigned f, signed fo, igned for, gned for , ned for c, ed for co, d for con,  for cons, for consi, or consis, r consist,  consiste, consisten, onsistenc, nsistency, sistency , istency a, stency an, tency and, ency and , ncy and s, cy and su, y and sup,  and supp, and suppo, nd suppor, d support,  support , support c, upport co, pport com, port comp, ort compl, rt comple, t complex,  complex , complex t, omplex tr, mplex tra, plex tran, lex trans, ex transa, x transac,  transact, transacti, ransactio, ansaction, nsactions, sactions , actions a, ctions an, tions and, ions and , ons and d, ns and de, s and den,  and deno, and denor, nd denorm, d denorma,  denormal, denormali, enormaliz, normalize, ormalized, rmalized , malized t, alized to, lized to , ized to s, zed to sp, ed to spe, d to spee,  to speed, to speed , o speed u,  speed up, speed up , peed up q, eed up qu, ed up que, d up quer,  up query, up queryi, p queryin,  querying, querying , uerying b, erying by, rying by , ying by t, ing by ti, ng by tim, g by time,  by time , by time c, y time co,  time con, time cons, ime consu, me consum, e consumi,  consumin, consuming, onsuming , nsuming p, suming pr, uming pre, ming prem, ing prema, ng premat, g premate,  premater, premateri, remateria, ematerial, materiali, aterializ, terializa, erializat, rializati, ializatio, alization, lization , ization t, zation to, ation to , tion to p, ion to pr, on to pre, n to pred,  to predi, to predic, o predict,  predict , predict t, redict th, edict the, dict the , ict the q, ct the qu, t the que,  the quer, the queri, he querie, e queries,  queries , queries i, ueries in, eries int, ries into, ies into , es into a, s into an,  into an , into an o, nto an on, to an onl, o an onli,  an onlin, an online, n online ,  online a, online an, nline ana, line anal, ine analy, ne analyt, e analyti,  analytic, analytic , nalytic p, alytic pr, lytic pro, ytic proc, tic proce, ic proces, c process,  processi, processin, rocessing, ocessing , cessing o, essing ol, ssing ola, sing olap, ing olap , ng olap c, g olap cu,  olap cub, olap cube, lap cube , ap cube b, p cube bu,  cube but, cube but , ube but n, be but no, e but not,  but not , but not s, ut not sc, t not sca,  not scal, not scale, ot scale , t scale w,  scale we, scale wel, cale well, ale well , le well w, e well wi,  well wit, well with, ell with , ll with t, l with th,  with the, with the , ith the s, th the si, h the siz,  the size, the size , f9 rdf da, 9 rdf dat,  rdf data, rdf data , df data m, f data mo,  data mod, data mode, ata model, ta model , a model t,  model tr, model tri, odel trip, del tripl, el triple, l triple ,  triple o, triple or, riple or , iple or t, ple or th, le or thr, e or thre,  or three, or three , r three c,  three co, three col, hree colu, ree colum, ee column, e column ,  column f, column fo, olumn for, lumn form, umn forma, mn format, n format ,  format s, format sp, ormat spo, rmat spo , mat spo s, at spo su, t spo sub,  spo subj, spo subje, po subjec, o subject,  subject , subject p, ubject pr, bject pre, ject pred, ect predi, ct predic, t predica,  predicat, predicate, redicate , edicate o, dicate ob, icate obj, cate obje, ate objec, te object, e object ,  object t, object th, bject thr, ject thre, ect three, ct three , t three p,  three pi, three pie, hree piec, ree piece, ee pieces, e pieces ,  pieces o, pieces of, ieces of , eces of i, ces of in, es of inf, s of info,  of infor, of inform, f informa,  informat, informati, nformatio, formation, ormation , rmation a, mation ar, ation are, tion are , ion are a, on are al, n are all,  are all , are all t, re all th, e all tha,  all that, all that', ll that's, l that's ,  that's n, that's ne, hat's nee, at's need, t's neede, 's needed, s needed ,  needed i, needed in, eeded in , eded in o, ded in or, ed in ord, d in orde,  in order, in order , n order t,  order to, order to , rder to f, der to fu, er to ful, r to full,  to fully, to fully , o fully d,  fully de, fully def, ully defi, lly defin, ly define, y define ,  define a, define a , efine a s, fine a si, ine a sin, ne a sing, e a singl,  a single, a single ,  single b, single bi, ingle bit, ngle bit , gle bit o, le bit of, e bit of ,  bit of k, bit of kn, it of kno, t of know,  of knowl, of knowle, f knowled,  knowledg, knowledge, nowledge , owledge e, wledge ea, ledge eac, edge each, dge each , ge each t, e each tr,  each tri, each trip, ach tripl, ch triple, h triple ,  triple i, triple is, riple is , iple is c, ple is co, le is com, e is comp,  is compl, is comple, s complet,  complete, complete , omplete a, mplete an, plete and, lete and , ete and u, te and un, e and uni,  and uniq, and uniqu, nd unique, d unique ,  unique f, unique fa, nique fac, ique fact, que fact , ue fact a, e fact an,  fact and, fact and , act and a, ct and al, t and all,  and allo, and allow, nd allow , d allow h,  allow hu, allow hum, llow huma, low human, ow human , w human u,  human un, human und, uman unde, man under, an unders, n underst,  understa, understan, nderstand, derstandi, erstandin, rstanding, standing , tanding a, anding an, nding and, ding and , ing and m, ng and me, g and mea,  and mean, and meani, nd meanin, d meaning,  meaning , meaning t, eaning to, aning to , ning to b, ing to be, ng to be , g to be i,  to be in, to be int, o be inte,  be inter, be interp, e interpr,  interpre, interpret, nterprete, terpreted, erpreted , rpreted c, preted co, reted con, eted cons, ted consi, ed consis, d consist, onsistent, nsistentl, sistently, istently , stently a, tently an, ently and, ntly and , tly and m, ly and me, y and mec,  and mech, and mecha, nd mechan, d mechani,  mechanic, mechanica, echanical, chanicall, hanically, anically , nically e, ically ea, cally eac, ally each, lly each , ly each t, y each tr,  triple c, triple ca, riple can, iple can , ple can b, le can be, e can be ,  can be j, can be jo, an be joi, n be join,  be joine, be joined, e joined ,  joined w, joined wi, oined wit, ined with, ned with , ed with o, d with ot,  with oth, with othe, ith other, th other , h other r,  other rd, other rdf, ther rdf , her rdf t, er rdf tr, r rdf tri,  rdf trip, rdf tripl, df triple, f triples,  triples , triples b, riples bu, iples but, ples but , les but s, es but st, s but sti,  but stil, but still, ut still , t still r,  still re, still ret, till reta, ill retai, ll retain, l retains,  retains , retains i, etains it, tains its, ains its , ins its o, ns its ow, s its own,  its own , its own u, ts own un, s own uni,  own uniq, own uniqu, wn unique, n unique ,  unique m, unique me, nique mea, ique mean, que meani, ue meanin, e meaning, meaning n, eaning no, aning nod, ning node, ing nodes, ng nodes , g nodes a,  nodes an, nodes and, odes and , des and r, es and re, s and rel,  and rela, and relat, nd relati, d relatio, relations, elationsh, lationshi, ationship, tionships, ionships , onships a, nships ar, ships are, hips are , ips are f, ps are fi, s are fir,  are firs, are first, re first , e first c,  first cl, first cla, irst clas, rst class, st class , t class e,  class en, class ent, lass enti, ass entit, ss entiti, s entitie,  entities, entities , ntities a, tities an, ities and, ties and , ies and e, es and ea, s and eac,  and each, and each , nd each t, d each tr, ple can s, le can st, e can sta,  can stan, can stand, an stand , n stand o,  stand on, stand on , tand on i, and on it, nd on its, d on its ,  on its o, on its ow, n its own, its own a, ts own as, s own as ,  own as a, own as a , wn as a p, n as a pi,  as a pie, as a piec, s a piece,  a piece , a piece o,  piece of, piece of , iece of m, ece of me, ce of mea, e of mean,  of meani, of meanin, f meaning,  meaningf, meaningfu, eaningful, aningful , ningful d, ingful da, ngful dat, gful data, ful data , empty fil, mpty file, f1 most d, 1 most da,  most dat, most data, ost data , st data a, t data an,  data ana, data anal, ata analy, ta analys, a analysi,  analysis, analysis , nalysis i, alysis is, lysis is , ysis is c, sis is co, is is com, s is comp,  is compa, is compar, s compara,  comparat, comparati, omparativ, mparative, parative , arative n, rative ne, ative new, tive new , ive new n, ve new no, e new non,  new non , new non r, ew non re, w non rel,  non rela, non relat, on relati, n relatio, tabases o, abases or, bases or , ases or n, ses or no, es or nos, s or nosq,  or nosql, or nosql , r nosql o,  nosql or, nosql ori, osql orig, sql origi, ql origin, l origin ,  origin f, origin fr, rigin fro, igin from, gin from , in from g, n from go,  from goo, from goog, rom googl, om google, m google',  google's, google's , oogle's b, ogle's bi, gle's big, le's bigt, e's bigta, 's bigtab, s bigtabl,  bigtable, bigtable , igtable o, gtable or, table or , able or a, ble or am, le or ama, e or amaz,  or amazo, or amazon, r amazon',  amazon's, amazon's , mazon's d, azon's dy, zon's dyn, on's dyna, n's dynam, 's dynamo, s dynamo ,  dynamo s, dynamo st, ynamo sto, namo stor, amo store, mo store , o store h,  store hu, store hug, tore huge, ore huge , re huge u, e huge un,  huge uns, huge unst, uge unstr, ge unstru, e unstruc,  unstruct, unstructu, nstructur, structure, tructured, ructured , uctured d, ctured da, tured dat, ured data, red data , ed data a, d data an,  data and, data and , ata and p, ta and pr, a and pro,  and prov, and provi, nd provid, d provide,  provide , provide e, rovide ev, ovide eve, vide even, ide event, de eventu, e eventua,  eventual, eventual , ventual c, entual co, ntual con, tual cons, ual consi, al consis, l consist, istency b, stency bu, tency but, ency but , ncy but n, cy but no, y but not, but not a, ut not ab, t not abs,  not abso, not absol, ot absolu, t absolut,  absolute, absolute , bsolute c, solute co, olute con, lute cons, ute consi, te consis, e consist, istency p, stency pr, tency pro, ency prov, ncy provi, cy provid, y provide, rovide en, ovide eno, vide enou, ide enoug, de enough, e enough ,  enough s, enough st, nough str, ough stru, ugh struc, gh struct, h structu,  structur, tructure , ructure t, ucture to, cture to , ture to o, ure to or, re to org, e to orga,  to organ, to organi, o organiz,  organize, organize , rganize d, ganize da, anize dat, nize data, ize data , ze data b, e data bu,  data but, data but , ata but d, ta but do, a but do ,  but do n, but do no, ut do not, t do not ,  do not r, do not re, o not req,  not requ, not requi, ot requir, t require,  require , require t, equire th, quire the, uire the , ire the e, re the ex, e the exa,  the exac, the exact, he exact , e exact s,  exact sc, exact sch, xact sche, act schem, ct schema, t schema ,  schema o, schema of, chema of , hema of t, ema of th, ma of the, a of the ,  of the d, of the da, f the dat,  the data, the data , he data b, e data be,  data bef, data befo, ata befor, ta before, a before ,  before s, before st, efore sto, fore stor, ore stori, re storin, e storing,  storing , storing i, toring it, oring it , s1 you ca, 1 you can,  you can , you can c, ou can cr, u can cre,  can crea, can creat, an create, n create ,  create f, create fo, reate fou, eate four, ate four , te four k, e four ki,  four kin, four kind, our kinds, ur kinds , r kinds o,  kinds of, kinds of , inds of c, nds of ch, ds of cha, s of char,  of chart, of charts, f charts ,  charts m, charts mo, harts mod, arts modi, rts modif, ts modifi, s modifie,  modified, modified , odified b, dified by, ified by , fied by s, ied by sh, ed by shr, d by shru,  by shrut, by shruti, y shrutil,  shrutili, shrutilif, hrutilift, rutilift , utilift c, tilift ch, ilift cha, lift char, ift chart, ft chartp, t chartpr,  chartpro, chartprof, hartprofi, artprofit, rtprofit , tprofit c, profit ch, rofit cha, ofit char, fit chart, it chartc, t chartcl,  chartcla, chartclas, hartclass, artclassi, rtclassif, tclassifi, classific, lassifica, assificat, ssificati, sificatio, ification, fication , ication m, cation ma, ation mat, tion matr, ion matri, on matrix, n matrix ,  matrix c, matrix cr, atrix cro, trix cros, rix cross, ix cross , x cross v,  cross va, cross val, ross vali, oss valid, ss valida, s validat,  validati, validatio, alidation, lidation , idation r, dation re, ation rep, tion repo, ion repor, on report, n reportt,  reportth, reportthe, eportthe , portthe f, ortthe fi, rtthe fir, tthe firs, the first, he first , e first t,  first th, first thr, irst thre, rst three, st three , t three c,  three ch, three cha, hree char, ree chart, ee charts, e charts ,  charts u, charts us, harts use, arts use , rts use t, ts use th, s use the,  use the , use the i, se the in, e the inp,  the inpu, the input, he input , e input s,  input se, input sel, nput sele, put selec, ut select, t selecti,  selectio, selection, election , lection t, ection ta, ction tab, tion tab , ion tab t, on tab to, n tab to ,  tab to d, tab to de, ab to def, b to defi,  to defin, to define, o define ,  define t, define th, efine the, fine the , ine the d, ne the da, e the dat, he data t, e data th,  data tha, data that, ata that , ta that i, a that is,  that is , that is u, hat is us, at is use, t is used,  is used , is used f, s used fo,  used for, used for , sed for g, ed for ge, d for gen,  for gene, for gener, or genera, r generat,  generati, generatin, enerating, nerating , erating t, rating th, ating the, ting the , ing the c, ng the ch, g the cha,  the char, the chart, he chart , e chart t,  chart th, chart the, hart the , art the c, rt the cr, t the cro,  the cros, the cross, he cross , e cross v, idation c, dation ch, ation cha, tion char, ion chart, on chart , n chart i,  chart is, chart is , hart is c, art is cr, rt is cre, t is crea,  is creat, is create, s created,  created , created b, reated by, eated by , ated by u, ted by us, ed by usi, d by usin,  by using, by using , y using a,  using ad, using add, sing addi, ing addit, ng additi, g additio,  addition, additiona, dditional, itional i, tional in, ional inp, onal inpu, nal input, al inputs, l inputs ,  inputs a, inputs av, nputs ava, puts avai, uts avail, ts availa, s availab,  availabl, available, vailable , ailable o, ilable on, lable on , able on t, ble on th, le on the, e on the ,  on the c, on the cr, n the cro, idation t, dation ta, ation tab, ion tab f, on tab fo, n tab for,  tab for , tab for m, ab for mo, b for mor,  for more, for more , or more i, r more in,  more inf, more info, ore infor, re inform, e informa, rmation s, mation se, ation see, tion see , ion see c, on see cr, n see cro,  see cros, see cross, ee cross , idation a, dation an, ation ana, tion anal, ion analy, on analys, n analysi, nalysis s, alysis se, lysis ser, ysis serv, sis servi, is servic, s service,  services, services , ervices d, rvices da, vices dat, ices data, ces data , es data m, s data mi,  data min, data mini, ata minin, ta mining, a mining ,  mining f, mining fo, ining for, ning for , ing for m, ng for mo, g for mor, mation ab, ation abo, tion abou, ion about, on about , n about h,  about ho, about how, bout how , out how t, ut how to, t how to ,  how to u, how to us, ow to use, w to use ,  to use t, to use th, o use the, use the m, se the mi, e the min,  the mini, the minin, he mining, e mining ,  mining a, mining ac, ining acc, ning accu, ing accur, ng accura, g accurac,  accuracy, accuracy , ccuracy c, curacy ch, uracy cha, racy char, acy chart, cy chart , y chart s,  chart se, chart see, hart see , art see t, rt see te, t see tes,  see test, see testi, ee testin, e testing,  testing , testing a, esting an, sting and, ting and , ing and v, ng and va, g and val,  and vali, and valid, nd valida, d validat, idation d, dation da, ation dat, tion data, ion data , on data m, n data mi, similar t, imilar tr, milar tra, ilar trad, lar tradi, ar tradit, r traditi]

SHINGLE-DOCUMENT MATRIX:
| 1 0 0 0 0 0 |
| 1 0 0 0 0 0 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 1 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 1 0 1 0 1 |
| 1 0 0 1 0 1 |
| 1 0 0 1 0 1 |
| 1 0 0 1 0 1 |
| 1 0 0 1 0 1 |
| 1 0 0 1 0 1 |
| 1 0 0 1 0 1 |
| 1 0 0 1 0 1 |
| 1 0 0 1 0 1 |
| 1 0 0 1 0 1 |
| 1 0 0 1 0 1 |
| 1 0 0 1 0 1 |
| 1 0 0 1 0 1 |
| 1 0 0 1 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 1 0 1 0 1 |
| 1 1 0 1 0 1 |
| 1 0 0 1 0 1 |
| 1 0 0 1 0 1 |
| 1 0 0 1 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 1 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 1 0 0 0 0 1 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 1 0 |
| 0 1 0 0 1 0 |
| 0 1 0 0 1 0 |
| 0 1 0 0 1 0 |
| 0 1 0 0 1 0 |
| 0 1 0 0 1 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 1 0 0 0 0 |
| 0 0 1 0 0 0 |
| 0 0 1 0 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 1 0 |
| 0 0 0 1 1 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 1 0 |
| 0 0 0 1 1 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 1 0 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 1 0 |
| 0 0 0 0 0 1 |
| 0 0 0 0 0 1 |
| 0 0 0 0 0 1 |
| 0 0 0 0 0 1 |
| 0 0 0 0 0 1 |
| 0 0 0 0 0 1 |
| 0 0 0 0 0 1 |

RANDOMIZED MIN HASH VALUES:
[125, 33, 1184, 1195, 431, 1222, 450, 1022, 299, 1318, 147, 1412, 64, 1238, 355, 945, 1080, 262, 125, 660, 484, 148, 201, 1224, 722, 113, 603, 38, 936, 395, 547, 197, 508, 338, 936, 342, 351, 918, 578, 346, 1059, 839, 558, 221, 893, 685, 862, 1011, 1357, 439, 958, 886, 506, 485, 751, 791, 932, 762, 132, 210, 176, 899, 1400, 932, 599, 407, 584, 1020, 435, 127, 334, 282, 1495, 924, 1420, 754, 1106, 844, 89, 230, 1341, 614, 1176, 1296, 780, 248, 545, 1368, 905, 574, 312, 962, 130, 1014, 1428, 601, 777, 642, 603, 1086]

SIGNATURE MATRIX :
4  3  67  13  6  4  
1  12  487  3  8  1  
0  1  823  6  4  0  
7  1  585  3  23  7  
7  0  615  4  7  7  
10  0  1204  5  0  10  
9  3  5  1  0  9  
22  9  280  2  4  6  
14  2  1  6  2  14  
6  0  922  4  0  6  
0  0  955  0  4  0  
1  1  752  5  16  1  
0  0  1151  2  5  0  
7  1  628  0  1  7  
4  1  118  9  7  4  
1  4  433  7  4  1  
2  9  856  4  4  2  
3  0  540  8  0  3  
16  0  241  15  4  16  
19  0  785  2  0  19  
2  0  469  2  2  2  
2  6  1069  1  4  2  
5  1  853  2  1  5  
4  0  1241  4  1  4  
10  0  281  5  4  10  
6  1  240  3  6  6  
2  0  186  1  0  2  
2  4  106  2  3  2  
6  0  307  2  4  6  
0  1  685  18  15  0  
2  4  755  1  1  2  
1  3  430  2  1  1  
0  1  419  2  5  0  
1  2  246  5  0  1  
0  5  330  6  0  0  
2  7  1064  12  1  13  
1  1  81  1  9  1  
3  0  207  0  1  3  
3  1  586  15  0  3  
3  4  227  9  5  3  
13  0  690  0  3  13  
3  0  64  0  1  3  
0  1  709  10  2  0  
0  6  125  1  0  0  
0  4  259  10  0  0  
2  10  672  2  5  2  
0  1  225  1  0  0  
4  1  152  7  3  4  
1  0  807  1  1  1  
9  1  739  4  0  9  
6  4  1213  0  7  6  
6  1  178  1  1  6  
3  1  808  3  5  3  
0  1  2  2  3  0  
0  0  151  0  1  0  
3  3  438  5  1  3  
0  0  987  0  10  0  
6  3  320  1  0  6  
8  1  93  0  4  8  
4  4  822  0  1  4  
1  10  679  6  5  1  
8  3  117  11  0  8  
2  0  732  4  1  2  
7  0  633  2  15  7  
3  0  664  2  3  3  
1  6  657  0  7  1  
0  4  333  7  1  0  
11  0  8  5  10  11  
1  0  112  4  2  1  
1  3  1168  3  4  1  
0  2  1140  4  9  0  
0  1  74  0  5  0  
1  4  428  5  0  1  
13  1  472  2  0  13  
2  2  723  7  4  2  
3  6  349  1  2  3  
0  3  669  11  7  0  
16  4  844  7  5  16  
0  1  881  6  0  0  
14  1  12  6  4  14  
6  6  260  5  0  6  
2  4  477  2  0  2  
0  2  224  0  10  0  
4  1  193  1  2  4  
1  1  553  6  1  1  
2  4  681  10  1  2  
20  3  958  10  11  20  
0  2  337  2  0  0  
5  0  43  5  1  5  
0  5  801  1  3  0  
8  7  11  6  0  8  
9  1  974  9  1  9  
3  1  889  1  1  3  
0  6  74  0  9  0  
0  0  652  0  0  0  
10  0  384  12  0  10  
3  6  516  8  3  3  
8  3  611  0  0  8  
2  11  735  2  7  2  
0  1  423  0  0  0  
     



