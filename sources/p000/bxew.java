package p000;

/* renamed from: bxew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bxew implements bxvp {
    UNKNOWN_TIME_FENCE_TRIGGER_TYPE(0),
    ABSOLUTE_INTERVAL(1),
    DAILY_INTERVAL(2),
    WEEKEND_INTERVAL(3),
    WEEKDAY_INTERVAL(4),
    SUNDAY_INTERVAL(5),
    MONDAY_INTERVAL(6),
    TUESDAY_INTERVAL(7),
    WEDNESDAY_INTERVAL(8),
    THURSDAY_INTERVAL(9),
    FRIDAY_INTERVAL(10),
    SATURDAY_INTERVAL(11),
    AFTER_LOCAL_TIME(12);
    

    /* renamed from: n */
    public final int f163146n;

    private bxew(int i) {
        this.f163146n = i;
    }

    /* renamed from: a */
    public static bxew m122643a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_TIME_FENCE_TRIGGER_TYPE;
            case 1:
                return ABSOLUTE_INTERVAL;
            case 2:
                return DAILY_INTERVAL;
            case 3:
                return WEEKEND_INTERVAL;
            case 4:
                return WEEKDAY_INTERVAL;
            case 5:
                return SUNDAY_INTERVAL;
            case 6:
                return MONDAY_INTERVAL;
            case 7:
                return TUESDAY_INTERVAL;
            case 8:
                return WEDNESDAY_INTERVAL;
            case 9:
                return THURSDAY_INTERVAL;
            case 10:
                return FRIDAY_INTERVAL;
            case 11:
                return SATURDAY_INTERVAL;
            case 12:
                return AFTER_LOCAL_TIME;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m122644b() {
        return bxev.f163131a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f163146n;
    }

    public final String toString() {
        return Integer.toString(this.f163146n);
    }
}
