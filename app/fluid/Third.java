package app.fluid;

import app.Unit;

public class Third extends Fluid {
    public Third(Type type, Unit unit, double value, double concentration) {
        super(type, unit, value, concentration);
    }
    public Third(Type type, Unit unit, double value) {
        super(type, unit, value);
    }
    public Third(Type type, Unit unit) {
        super(type, unit);
    }
}