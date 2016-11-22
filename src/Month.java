public enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
    private int[] dayCount = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Month next() {
        return values()[(ordinal() + 1) % values().length];
    }

    public int getDayCount() {
        return dayCount[ordinal()];
    }
}
