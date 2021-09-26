package app;

public class Ingredient {
    private final String name;
    private final double volumeToWeightRatio;

    Ingredient(String name, double volumeToWeightRatio) {
        this.name = name;
        this.volumeToWeightRatio = volumeToWeightRatio;
    }

    public String getName() {
        return name;
    }

    public double getVolumeToWeightRatio() {
        return volumeToWeightRatio;
    }
}