//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Polynomial poly = new Polynomial(new double[]{1.0,2.0,-8.0,-1.0});

       double i = poly.f(3.0);
       System.out.println(i);
       boolean result = testTrapezoidFunction(poly);
       System.out.println("Trapezoid Function test result= "+result);
       System.out.println(TestMonteCarlo(poly));
       CalculatedFunction anyFunc=new AnyFunction(x->Math.sin(x)*2);
       System.out.println(anyFunc);


    }
    public static boolean TestMonteCarlo(Polynomial poly) {
        double expected=39.0;
        Integral monteCarlo = new MonteCarloMethod(4,0,poly,100000);
        double test =monteCarlo.Calculate();
        System.out.println(test);
        return test == expected;
    }
public static boolean testTrapezoidFunction(Polynomial poly)
{
    double expected=39.0;
    Integral trapezoid = new TrapezoidMethod(4,0, poly,16);
    double test = trapezoid.Calculate();
    return test == expected;
}

}

