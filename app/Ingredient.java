package app;

public class Ingredient {
    private final String name;
    private final double volumeOfOneKilogram;

    Ingredient(String name, double volumeOfOneKilogram) {
        this.name = name;
        this.volumeOfOneKilogram = volumeOfOneKilogram;
    }

    public String getName() {
        return name;
    }

    public double getVolumeOfOneKilogram() {
        return volumeOfOneKilogram;
    }
}