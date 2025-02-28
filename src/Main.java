public class Main
{
    public static void main(String[] args) {
        Point p = new Point();
        p.x = 1.8;
        p.y = 3.6;
        System.out.println(p);
        Point p1 = new Point();
        Segment s = new Segment();
        s.a=p;
        s.b=p1;
        System.out.println(s.length());
    }
   }