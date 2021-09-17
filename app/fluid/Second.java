package app.fluid;

import app.Unit;

public class Second extends Fluid{
    public Second(Type type, Unit unit, double value, double concentration) {
        super(type, unit, value, concentration);
    }
    public Second(Type type, Unit unit, double value) {
        super(type, unit, value);
    }
    public Second(Type type, Unit unit) {
        super(type, unit);
    }
}