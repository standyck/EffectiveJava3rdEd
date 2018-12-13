import java.util.Collection;
import java.util.Iterator;
import java.util.EnumSet;

class Dice {
    //Let's to a d4
    enum Face { ONE, TWO, THREE, FOUR }

    public static void bad() {
        Collection<Face> faces = EnumSet.allOf(Face.class);

        for(Iterator<Face> i = faces.iterator(); i.hasNext();) {
            for(Iterator<Face> j = faces.iterator(); j.hasNext();) {
                System.out.println("\t" + i.next() + " " + j.next());
            }
        }
    }

    public static void good() {
        Collection<Face> faces = EnumSet.allOf(Face.class);

        for(Face d1 : faces) {
            for(Face d2 : faces) {
                System.out.println("\t" + d1 + " " + d2);
            }
        }
    }

    public static void main (String[] args) {
        System.out.println("bad:");
        bad();

        System.out.println("better:");
        good();
    }
}