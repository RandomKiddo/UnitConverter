public class MismatchedUnitException extends Exception {
    public MismatchedUnitException(Unit expected, Unit actual) {
        super("Units do not match up; Expected " + expected.getClass() + ", recieved " + actual.getClass());
    }
}
