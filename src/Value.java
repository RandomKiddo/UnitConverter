public class Value {
    private double value;
    private Unit unit;
    public Value(double val, Unit u) {
        this.value = val;
        this.unit = u;
    }
    public double getValue() { return this.value; }
    public Unit getUnit() { return unit; }
    @Override public String toString() { return "" + this.value + this.unit; }
}