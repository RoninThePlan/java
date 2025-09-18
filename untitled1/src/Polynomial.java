import java.util.ArrayList;
import java.util.List;

public class Polynomial implements CalculatedFunction
{
    double[] Wielomian;

    public Polynomial(double[] wielomian) {
        Wielomian = wielomian;
    }


    @Override
    public double f(double x) {
        double result = 0.0;
        for (double w : Wielomian)
            result = result * x + w;

        return result;
    }
}
