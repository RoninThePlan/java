import static java.lang.Math.abs;

public class TrapezoidMethod extends Integral
{
    int n;
    public TrapezoidMethod(double upperLimit, double lowerLimit, CalculatedFunction _calculatedFunction, int n) {
        super(upperLimit, lowerLimit, _calculatedFunction);
        this.n = n;
    }

    @Override
    public double Calculate() {

        double dx=abs((upperLimit-lowerLimit)/n);
        double result = (_calculatedFunction.f(lowerLimit)+_calculatedFunction.f(upperLimit))/2;
        double x_i;
        for(int i=1;i<n;i++) {
            x_i=lowerLimit+i*dx;
            result+=_calculatedFunction.f(x_i);
        }
        return dx*result;
    }
}
