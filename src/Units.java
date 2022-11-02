interface Unit {
    String getLabel();
}

interface SimpleUnit extends Unit {
    double getFactor();
}

interface ComplexUnit extends Unit {
    double getMultiplicativeFactor();
    double getAdditiveFactor();
}

enum MassUnit implements SimpleUnit {
    KILOGRAMS("kg", 1000),
    HECTOGRAMS("hg", 100),
    DECAGRAMS("dag", 10),
    GRAMS("g", 1),
    DECIGRAMS("dg", 1.0/10),
    CENTIGRAMS("cg", 1.0/100),
    MILLIGRAMS("mg", 1.0/1000);

    private final String label;
    private final double factor;
    private MassUnit(String l, double f) {
        this.label = l;
        this.factor = f;
    }

    @Override public String getLabel() { return this.label; }
    @Override public double getFactor() { return this.factor; }
}

enum TemperatureUnit implements ComplexUnit {
    CELSIUS("˙C", 1, 0),
    FAHRENHEIT("˙F", 9.0/5.0, 32),
    KELVIN("K", 1, 273.15);

    private final String label;
    private final double mFactor;
    private final double aFactor;
    private TemperatureUnit(String l, double mf, double af) {
        this.label = l;
        this.mFactor = mf;
        this.aFactor = af;
    }

    @Override public String getLabel() { return this.label; }
    @Override public double getMultiplicativeFactor() { return this.mFactor; }
    @Override public double getAdditiveFactor() { return this.aFactor; }
}

enum DistanceUnit implements SimpleUnit {
    KILOMETERS("km", 1000),
    HECTOMETERS("hm", 100),
    DECAMETERS("dam", 10),
    METERS("m", 1),
    DECIMETERS("dm", 1.0/10),
    CENTIMETERS("cm", 1.0/100),
    MILLIMETERS("mm", 1.0/1000),
    MICROMETERS("µm", 1.0/1_000_000),
    NANOMETERS("nm", 1.0/1_000_000_000);

    private final String label;
    private final double factor;
    private DistanceUnit(String l, double f) {
        this.label = l;
        this.factor = f;
    }

    @Override public String getLabel() { return this.label; }
    @Override public double getFactor() { return this.factor; }
}

enum MetricTimeUnit implements SimpleUnit {
    SECONDS("s", 1),
    DECISECONDS("ds", 1.0/10),
    CENTISECONDS("cs", 1.0/100),
    MILLISECONDS("ms", 1.0/1000),
    MICROSECONDS("µs", 1.0/1_000_000),
    NANOSECONDS("ns", 1.0/1_000_000_000);

    private final String label;
    private final double factor;
    private MetricTimeUnit(String l, double f) {
        this.label = l;
        this.factor = f;
    }

    @Override public String getLabel() { return this.label; }
    @Override public double getFactor() { return this.factor; }
}

enum NaturalTimeUnit implements SimpleUnit {
    SECONDS("s", 1),
    MINUTES("min", 1.0/60),
    HOURS("hrs", 1.0/60/60),
    DAYS("days", 1.0/60/60/24),
    YEARS("yrs", 1.0/60/60/24/365.25);

    private final String label;
    private final double factor;
    private NaturalTimeUnit(String l, double f) {
        this.label = l;
        this.factor = f;
    }

    @Override public String getLabel() { return this.label; }
    @Override public double getFactor() { return this.factor; }
}