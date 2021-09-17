package app.fluid;

import app.Unit;

public class First extends Fluid{
    public First(Type type, Unit unit, double value, double concentration) {
        super(type, unit, value, concentration);
    }
    public First(Type type, Unit unit, double value) {
        super(type, unit, value);
    }
    public First(Type type, Unit unit) {
        super(type, unit);
    }
}