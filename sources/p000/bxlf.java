package p000;

/* renamed from: bxlf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bxlf implements bxvp {
    UNKNOWN_DAY_PART(0),
    MORNING(1),
    AFTERNOON(2),
    EVENING(3),
    NIGHT(4);
    

    /* renamed from: f */
    private final int f163841f;

    private bxlf(int i) {
        this.f163841f = i;
    }

    /* renamed from: a */
    public static bxlf m122829a(int i) {
        if (i == 0) {
            return UNKNOWN_DAY_PART;
        }
        if (i == 1) {
            return MORNING;
        }
        if (i == 2) {
            return AFTERNOON;
        }
        if (i == 3) {
            return EVENING;
        }
        if (i != 4) {
            return null;
        }
        return NIGHT;
    }

    /* renamed from: b */
    public static bxvr m122830b() {
        return bxle.f163834a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f163841f;
    }

    public final String toString() {
        return Integer.toString(this.f163841f);
    }
}
