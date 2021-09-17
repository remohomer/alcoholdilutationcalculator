package app;

public enum Unit {
    GRAM("Gramy", 1, true),
    KILOGRAM("Kilogramy", 1000, true),
    MILILITR("Mililitry", 1, false),
    LITR("Litry", 1000, false),
    GLASS("Szklanki", 250, false),
    SPOON("Łyżki", 15, false),
    TEASPOON("Łyżeczki", 5, false),
    NULL("Brak", -1, false);

    private final String name;
    private final double value;
    private  boolean isWeight;

    Unit(Unit unit) {
        this.name = unit.name;
        this.value = unit.value;
        this.isWeight = unit.isWeight;
    }

    Unit(String name, double value, boolean isWeight) {
        this.name = name;
        this.value = value;
        this.isWeight = isWeight;
    }

    public String getName() {
        return name;
    }

    public boolean isWeight() {
        return isWeight;
    }

    public double getValue () {
        return value;
    }
}