public class InSystemConverter implements Converter {
    @Override public Value convert(Value v, Unit u) throws MismatchedUnitException, ClassCastException {
        if (!v.getUnit().getClass().equals(u.getClass())) {
            throw new MismatchedUnitException(v.getUnit(), u);
        }
        double val = 0;
        if (u.getClass().toString().equals("SimpleUnit")) {
            SimpleUnit su = (SimpleUnit)u;
            val = v.getValue() * (1.0 / ((SimpleUnit)(v.getUnit())).getFactor());
            val *= su.getFactor();
        } else {
            ComplexUnit cu = (ComplexUnit)u;
            val = v.getValue() - ((ComplexUnit)v.getUnit()).getAdditiveFactor();
            val /= ((ComplexUnit)v.getUnit()).getMultiplicativeFactor();
            val *= cu.getMultiplicativeFactor();
            val += cu.getAdditiveFactor();
        }
        return new Value(val, u);
    }
}
