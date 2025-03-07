import java.util.Arrays;
public class Polygon {
    private Point[] points;
    public Polygon(Point[] points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "POLYGON("+"POINTS="+Arrays.toString(points)+")";
    }
}
