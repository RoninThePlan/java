import java.util.Random;

public class MonteCarloMethod extends Integral {

    int n;
    public MonteCarloMethod(double upperLimit, double lowerLimit, CalculatedFunction _calculatedFunction, int n) {
        super(upperLimit, lowerLimit, _calculatedFunction);
        this.n=n;
    }

    @Override
    public double Calculate() {
        double result=0;
        double dx=upperLimit-lowerLimit;
        Random rnd =  new Random();
        for (int i = 0; i < n; i++) {
        result+= _calculatedFunction.f(rnd.nextDouble(lowerLimit, upperLimit));
        }
        result=(result*dx)/n;
        return result;
    }
}
