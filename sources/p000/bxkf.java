package p000;

/* renamed from: bxkf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bxkf implements bxvp {
    UNKNOWN(0),
    WEEKDAY(1),
    WEEKEND(2),
    HOLIDAY(3),
    MORNING(4),
    AFTERNOON(5),
    EVENING(6),
    NIGHT(7);
    

    /* renamed from: i */
    public final int f163722i;

    private bxkf(int i) {
        this.f163722i = i;
    }

    /* renamed from: a */
    public static bxkf m122796a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return WEEKDAY;
            case 2:
                return WEEKEND;
            case 3:
                return HOLIDAY;
            case 4:
                return MORNING;
            case 5:
                return AFTERNOON;
            case 6:
                return EVENING;
            case 7:
                return NIGHT;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m122797b() {
        return bxke.f163712a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f163722i;
    }

    public final String toString() {
        return Integer.toString(this.f163722i);
    }
}
