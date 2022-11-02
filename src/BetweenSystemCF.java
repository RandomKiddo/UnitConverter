import java.security.KeyException;
import java.util.HashMap;

public class BetweenSystemCF {
    private HashMap<Pair<Unit, Unit>, Double> cf;
    private BetweenSystemCF() {
        this.cf = new HashMap<>();
        this.setHashMap();
    }
    public static BetweenSystemCF initialize() { return new BetweenSystemCF(); }
    private void setHashMap() {

    }
    public HashMap<Pair<Unit, Unit>, Double> getCF() { return this.cf; }
    public void get(Unit one, Unit two) throws KeyException {
        // Check one->two
        // Check two->one
    }
}

class Pair<T, U> {
    T t;
    U u;
    public Pair(T t1, U u1) { this.t = t1; this.u = u1; }
    public T getFirst() { return this.t; }
    public U getSecond() { return this.u; }
    public boolean equals(Pair<T, U> one, Pair<T, U> two) {
        return one.getFirst().getClass().toString().equals(two.getFirst().getClass().toString()) &&
                one.getSecond().getClass().toString().equals(two.getSecond().getClass().toString());
    }
}
