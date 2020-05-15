package p000;

/* renamed from: bxma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bxma implements bxvp {
    UNKNOWN_METER_TYPE(0),
    METERED(1),
    UNMETERED(2);
    

    /* renamed from: d */
    public final int f163918d;

    private bxma(int i) {
        this.f163918d = i;
    }

    /* renamed from: a */
    public static bxma m122856a(int i) {
        if (i == 0) {
            return UNKNOWN_METER_TYPE;
        }
        if (i == 1) {
            return METERED;
        }
        if (i != 2) {
            return null;
        }
        return UNMETERED;
    }

    /* renamed from: b */
    public static bxvr m122857b() {
        return bxlz.f163913a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f163918d;
    }

    public final String toString() {
        return Integer.toString(this.f163918d);
    }
}
