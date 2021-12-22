package edu.kirkwood;

public enum Bonus {
    STAFF(0.02),
    MANAGER(0.04),
    EXECUTIVE(0.06);

    private final double percent;

    Bonus(double percent) {
        this.percent = percent;
    }

    public double getPercent() {
        return percent;
    }

    public static double byRole(Role r) {
        double bonusPercent = 0.0d;

        switch(r) {
            case EXECUTIVE:
                bonusPercent = EXECUTIVE.getPercent();
                break;
            case MANAGER:
                bonusPercent = MANAGER.getPercent();
                break;
            case STAFF:
                bonusPercent = STAFF.getPercent();
                break;
        }
        return bonusPercent;
    }
}
