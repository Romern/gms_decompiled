package p000;

/* renamed from: bxll */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bxll implements bxvp {
    UNKNOWN_DAY_TYPE(0),
    WEEKDAY(1),
    WEEKEND(2),
    HOLIDAY(3);
    

    /* renamed from: e */
    private final int f163858e;

    private bxll(int i) {
        this.f163858e = i;
    }

    /* renamed from: a */
    public static bxll m122837a(int i) {
        if (i == 0) {
            return UNKNOWN_DAY_TYPE;
        }
        if (i == 1) {
            return WEEKDAY;
        }
        if (i == 2) {
            return WEEKEND;
        }
        if (i != 3) {
            return null;
        }
        return HOLIDAY;
    }

    /* renamed from: b */
    public static bxvr m122838b() {
        return bxlk.f163852a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f163858e;
    }

    public final String toString() {
        return Integer.toString(this.f163858e);
    }
}
