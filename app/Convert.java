package app;

import app.fluid.Fluid;
import app.fluid.Type;

public class Convert {

    public Unit destinyUnit;
    public Fluid fluid;

    Ingredient ingredientEtanol = new Ingredient("Etanol", 1.5152);
    Ingredient ingredientWater = new Ingredient("Woda", 1);
    Ingredient ingredientEmpty = new Ingredient("Empty", 1);

    Convert(Fluid fluid, Unit destinyUnit) {
        this.fluid = fluid;
        this.destinyUnit = destinyUnit;
    }

    public double calculate() {

        double result;
        if (fluid.getType() == Type.ALCOHOL) {
            if (fluid.getUnit().isWeight() && !destinyUnit.isWeight()) {
                result = ((fluid.getValue() / ingredientEtanol.getVolumeOfOneKilogram()) * fluid.getUnit().getValue()) / destinyUnit.getValue();
            } else if (!fluid.getUnit().isWeight() && destinyUnit.isWeight()) {
                result = ((fluid.getValue() * ingredientEtanol.getVolumeOfOneKilogram()) * fluid.getUnit().getValue()) / destinyUnit.getValue();
            } else {
                result = (fluid.getValue() * fluid.getUnit().getValue()) / destinyUnit.getValue();
            }
        } else if (fluid.getType() == Type.WATER) {
            if (fluid.getUnit().isWeight() && !destinyUnit.isWeight()) {
                result = ((fluid.getValue() / ingredientWater.getVolumeOfOneKilogram()) * fluid.getUnit().getValue()) / destinyUnit.getValue();
            } else if (!fluid.getUnit().isWeight() && destinyUnit.isWeight()) {
                result = ((fluid.getValue() * ingredientWater.getVolumeOfOneKilogram()) * fluid.getUnit().getValue()) / destinyUnit.getValue();
            } else {
                result = (fluid.getValue() * fluid.getUnit().getValue()) / destinyUnit.getValue();
            }
        } else if (fluid.getType() == Type.SOLUTION) {
            if (fluid.getUnit().isWeight() && !destinyUnit.isWeight()) {
                result = ((fluid.getValue() / ingredientEmpty.getVolumeOfOneKilogram()) * fluid.getUnit().getValue()) / destinyUnit.getValue();
            } else if (!fluid.getUnit().isWeight() && destinyUnit.isWeight()) {
                result = ((fluid.getValue() * ingredientEmpty.getVolumeOfOneKilogram()) * fluid.getUnit().getValue()) / destinyUnit.getValue();
            } else {
                result = (fluid.getValue() * fluid.getUnit().getValue()) / destinyUnit.getValue();
            }
        } else {
            result = -1;
        }
        return Math.round(result * 100.0) / 100.0;
    }
}