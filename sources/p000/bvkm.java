package p000;

/* renamed from: bvkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bvkm implements bxvp {
    FAST_PAIR_FEATURE_UNKNOWN(0),
    SILENCE_MODE(1),
    WIRELESS_CHARGING(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f156443e;

    private bvkm(int i) {
        this.f156443e = i;
    }

    /* renamed from: a */
    public static bvkm m121206a(int i) {
        if (i == 0) {
            return FAST_PAIR_FEATURE_UNKNOWN;
        }
        if (i == 1) {
            return SILENCE_MODE;
        }
        if (i != 2) {
            return null;
        }
        return WIRELESS_CHARGING;
    }

    /* renamed from: b */
    public static bxvr m121207b() {
        return bvkl.f156437a;
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f156443e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
