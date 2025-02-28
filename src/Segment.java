public class Segment {
    public Point a, b;
    public double length() {
        return Math.hypot(a.x - b.x, a.y - b.y);
    }
}
