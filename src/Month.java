public enum Month {
    JANUARY {
        final int dayCount = 31;
    },
    FEBRUARY {
        final int dayCount = 28;
    },
    MARCH {
        final int dayCount = 31;
    },
    APRIL {
        final int dayCount = 30;
    },
    MAY {
        final int dayCount = 31;
    },
    JUNE {
        final int dayCount = 30;
    },
    JULY {
        final int dayCount = 31;
    },
    AUGUST {
        final int dayCount = 31;
    },
    SEPTEMBER {
        final int dayCount = 30;
    },
    OCTOBER {
        final int dayCount = 31;
    },
    NOVEMBER {
        final int dayCount = 30;
    },
    DECEMBER {
        final int dayCount = 31;
    };

    public Month next() {
        return values()[(ordinal() + 1) % values().length];
    }

}
