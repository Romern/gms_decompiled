package p000;

/* renamed from: bkn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bkn implements bxvp {
    UNKNOWN_PERIOD(0),
    EVERY_24_HOURS(5),
    EVERY_4_HOURS(1),
    EVERY_1_HOUR(2),
    EVERY_30_MINUTES(3),
    EVERY_10_MINUTES(4);
    

    /* renamed from: g */
    public final int f5001g;

    private bkn(int i) {
        this.f5001g = i;
    }

    /* renamed from: a */
    public static bkn m3261a(int i) {
        if (i == 0) {
            return UNKNOWN_PERIOD;
        }
        if (i == 1) {
            return EVERY_4_HOURS;
        }
        if (i == 2) {
            return EVERY_1_HOUR;
        }
        if (i == 3) {
            return EVERY_30_MINUTES;
        }
        if (i == 4) {
            return EVERY_10_MINUTES;
        }
        if (i != 5) {
            return null;
        }
        return EVERY_24_HOURS;
    }

    /* renamed from: b */
    public static bxvr m3262b() {
        return bkm.f4993a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f5001g;
    }

    public final String toString() {
        return Integer.toString(this.f5001g);
    }
}
