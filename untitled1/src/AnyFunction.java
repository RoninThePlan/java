import java.util.function.Function;


    public class AnyFunction implements CalculatedFunction {

        CalculatedFunction op;

        public AnyFunction(CalculatedFunction op){
            this.op = op;
        }

        @Override
        public double f(double x) {
            return op.f(x);
        }
    }

/*
public class AnyFunction implements CalculatedFunction {

    private Function<Double,Double> function;
    public AnyFunction(Function<Double,Double> function) {
        this.function = function;
    }

    @Override
    public double f(double x) {
       return function.apply(x);
    }
    }
    */