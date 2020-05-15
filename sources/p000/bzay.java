package p000;

/* renamed from: bzay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bzay implements bxvp {
    FAST_PAIR_FEATURE_UNKNOWN(0),
    SILENCE_MODE(1),
    WIRELESS_CHARGING(2);
    

    /* renamed from: d */
    public final int f169240d;

    private bzay(int i) {
        this.f169240d = i;
    }

    /* renamed from: a */
    public static bzay m125601a(int i) {
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
    public static bxvr m125602b() {
        return bzax.f169235a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f169240d;
    }

    public final String toString() {
        return Integer.toString(this.f169240d);
    }
}
