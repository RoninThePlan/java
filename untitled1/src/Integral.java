public abstract class Integral {
    protected CalculatedFunction _calculatedFunction;
    protected double upperLimit;
    protected double lowerLimit;

    public Integral(double upperLimit , double lowerLimit, CalculatedFunction _calculatedFunction) {
        this.upperLimit = upperLimit;
        this.lowerLimit = lowerLimit;
        this._calculatedFunction = _calculatedFunction;
    }
    public abstract double Calculate();

}
