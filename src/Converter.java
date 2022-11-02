public interface Converter {
    Value convert(Value v, Unit u) throws MismatchedUnitException, ClassCastException;
}
