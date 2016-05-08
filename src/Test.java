/**
 * Created by Magdalena Polak on 04.05.2016.
 */
import java.util.Comparator;
import java.util.Iterator;
public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        TwoFourTree tree = new TwoFourTree();
        tadd(tree);

        System.out.println(tree.toString());
        System.out.println("");
        tfind(tree);
        System.out.println(tree.toString());
        MAXMIN(tree);
        System.out.println(tree.toString());
        System.out.println("max_node: " + tree.findNodeLargest(tree.getRoot()));
        System.out.println("min_node: " + tree.findNodeSmallest(tree.getRoot()));
        System.out.println("min: " + tree.findSmallest());
        System.out.println("max: " + tree.findLargest());



    }

    public static void tremove(TwoFourTree t) {

        //t.clear();
        //t.add(new ta(50));
        t.add(new ta(15));
        t.add(new ta(16));
        t.add(new ta(23));
        t.add(new ta(10));
        //t.add(new ta(44));
        //t.add(new ta(47));
        //t.add(new ta(30));
        //t.add(new ta(80));
        //t.add(new ta(66));

        System.out.println(t);
        System.out.println(t.size());
        System.out.println(t.remove(new ta(34)));
        System.out.println(t.size());

    }

    public static void tdiff(TwoFourTree t) {
        TwoFourTree nt = new TwoFourTree();
        nt.add(new ta(41));
        nt.add(new ta(119));


        t.clear();
        t.add(new ta(50));
        t.add(new ta(40));
        t.add(new ta(41));
        t.add(new ta(119));
        t.differenceWith(nt);

    }

    public static void tmerge() {

        TwoFourTree t = new TwoFourTree();

        //t.testMerge(); //XXX

        System.out.println(t.toString());

    }


    public static void removeElem() {
        TwoFourTree t = new TwoFourTree();

        t.add(new ta(1));
        t.add(new ta(2));
        t.add(new ta(3));

        //t.test(); //XXX

        System.out.println(t.toString());
    }
    public static void tfindLT(TwoFourTree t) {

        //Edge casese
        // System.out.println(t.findLT(new ta(119)));
        // System.out.println(t.findLT(new ta(120)));
        //	   System.out.println(t.findLT(new ta(0)));
        //System.out.println(t.findLT(null));


     //   System.out.println(t.findLT(" "));
        System.out.println(t.findLT(new ta(40)));
        System.out.println(t.findLT(new ta(42)));
        System.out.println(t.findLT(new ta(49)));
        System.out.println(t.findLT(new ta(73)));
        System.out.println(t.findLT(new ta(66)));
        System.out.println(t.findLT(new ta(90)));
        System.out.println(t.findLT(new ta(49)));
        System.out.println(t.findLT(new ta(60)));
        System.out.println(t.findLT(new ta(61)));
        System.out.println(t.findLT(new ta(62)));
    }
    public static void MAXMIN(TwoFourTree t) {
        System.out.println(t.findNodeLargest(t.getRoot()));
       // System.out.println(t.findNodeSmallest(t.getRoot()));

    }

    public static void tunion() {
        TwoFourTree nt = new TwoFourTree();
        nt.add(new ta(45));
        nt.add(new ta(42));
        nt.add(new ta(43));

        TwoFourTree tt = new TwoFourTree();
        tt.add(new ta(88));
        tt.add(new ta(87));
        tt.add(new ta(79));

        tt.unionWith(nt);
        System.out.println(tt.toString());
    }

    public static void tintersect() {

        TwoFourTree nt = new TwoFourTree();

        nt.add(new ta(45));
        nt.add(new ta(42));
        nt.add(new ta(43));
        nt.add(new ta(49));
        nt.add(new ta(34));
        nt.add(new ta(99));

        TwoFourTree tt = new TwoFourTree();

        tt.add(new ta(45));
        tt.add(new ta(42));
        tt.add(new ta(43));
        tt.add(new ta(99));
        tt.add(new ta(88));
        tt.add(new ta(88));
        tt.add(new ta(79));

        nt.intersectWith(tt);

        System.out.println(nt.toString());

        System.out.println(nt.size());
        nt.clear();
        nt.intersectWith(tt);
        System.out.println(nt.toString());

    }

    public static void titer(TwoFourTree t) {
        Iterator iter = t.iterator(new ta(98));

        System.out.println(iter.next());
        System.out.println(iter.hasNext());
        System.out.println(iter.next());
        System.out.println(iter.hasNext());
        System.out.println(iter.next());
        System.out.println(iter.hasNext());
        //	   System.out.println(iter.next());


        //	iter = t.iterator(new ta(1000));
        iter = t.iterator(new ta(119));
        System.out.println(iter.next());
        System.out.println(iter.hasNext());
        iter = t.iterator();
        System.out.println(iter.next());


    }

    public static void tsubset(TwoFourTree t) {
        TwoFourTree nt = new TwoFourTree();

        System.out.println(nt.size());
        //Empty set test
        System.out.println(nt.subsetOf(t));


        nt.add(new ta(45));
        nt.add(new ta(42));
        nt.add(new ta(43));
        nt.add(new ta(49));
        nt.add(new ta(34));
        nt.add(new ta(99));
        nt.add(new ta(109));
        nt.add(new ta(60));
        nt.add(new ta(61));
        nt.add(new ta(62));
        nt.add(new ta(31));
        nt.add(new ta(44));
        nt.add(new ta(47));
        nt.add(new ta(30));
        nt.add(new ta(80));

        System.out.println(nt.size());
        System.out.println(nt.subsetOf(t)); //true


        System.out.println(nt.belongsTo(new ta(1)) == false);

        //nt.add(new ta(1));
        //System.out.println(nt.subsetOf(t) == false);

        //nt.add(new ta(1011));
        //System.out.println(nt.subsetOf(t) == false);

        nt.add(new ta(85));
        System.out.println(nt.subsetOf(t) == false);


    }

    public static void tsize(TwoFourTree t) {
        System.out.println(t.size());

    }

    public static void tclear(TwoFourTree t) {
        t.clear();
    }

    public static void tfindG(TwoFourTree t) {

        System.out.println(t.findG(new ta(45))); //47
        System.out.println(t.findG(new ta(46)));//47
        System.out.println(t.findG(new ta(47)));//49
        System.out.println(t.findG(new ta(70)));//71
        System.out.println(t.findG(new ta(71)));//72
        System.out.println(t.findG(new ta(72)));//73
        System.out.println(t.findG(new ta(73)));//80


        System.out.println(t.findG(new ta(119)));//null
        System.out.println(t.findG(new ta(30)));//32
        System.out.println(t.findG(new ta(29)));//30
        System.out.println(t.findG(new ta(45))); //root   //47
        System.out.println(t.findG(new ta(72))); //root   //73
        System.out.println(t.findG(new ta(80)));//89

    }

    public static void tfindGE(TwoFourTree t) {

        System.out.println(t.findGE(null));
    }

    public static void tfind(TwoFourTree t) {

        System.out.println(t.find(new ta(18)));
        System.out.println(t.find(new ta(28)));


    }

    public static void tadd(TwoFourTree t) {

        t.add(new ta(20));
        t.add(new ta(10));
        t.add(new ta(15));
        t.add(new ta(18));
        t.add(new ta(25));
        t.add(new ta(16));
        t.add(new ta(12));
        t.add(new ta(5));
        t.add(new ta(2));

    }

    //Do not allow doubles
    public static void taddDoubles(TwoFourTree t) {

        t.add(50);
        t.add(40);
        t.add(60);
        t.add(30);
        t.add(70);
        System.out.println(t.add(40) == false);
    }

    public static void testBelongs(TwoFourTree t) {
        //Test root
        tadd(t);

        //Test level1
        System.out.println(t.belongsTo(new ta(61)));
        System.out.println(t.belongsTo(new ta(45)));


        //Leftmost level1
        System.out.println(t.belongsTo(new ta(34)));
        System.out.println(t.belongsTo(new ta(41)));

        //Leaf last leve
        System.out.println(t.belongsTo(new ta(72)));


        System.out.println(t.belongsTo(new ta(0)) == false);
        System.out.println(t.belongsTo(new ta(68)) == false);
        System.out.println(t.belongsTo(new ta(20)) == false);
        System.out.println(t.belongsTo(new ta(11)) == false);
        System.out.println(t.belongsTo(new ta(1000)) == false);
    }

    public static void tgetComp(TwoFourTree tree) {
        System.out.println(tree.comparator());
    }

    public static void tComp(TwoFourTree tree) {


        System.out.println(tree.comparator());
        System.out.println("");

        Comparator<ta> c = new TreeComparator<ta>();
        ta a = new ta(1);

        ta b = new ta(2);

        System.out.println(c.compare(a, b));
        System.out.println(c.compare(b, a));
    }
}