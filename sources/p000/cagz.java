package p000;

/* renamed from: cagz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cagz implements bxvp {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4);
    

    /* renamed from: f */
    public final int f174516f;

    private cagz(int i) {
        this.f174516f = i;
    }

    /* renamed from: a */
    public static cagz m126622a(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return UNMETERED_ONLY;
        }
        if (i == 2) {
            return UNMETERED_OR_DAILY;
        }
        if (i == 3) {
            return FAST_IF_RADIO_AWAKE;
        }
        if (i != 4) {
            return null;
        }
        return NEVER;
    }

    /* renamed from: b */
    public static bxvr m126623b() {
        return cagy.f174509a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f174516f;
    }

    public final String toString() {
        return Integer.toString(this.f174516f);
    }
}
