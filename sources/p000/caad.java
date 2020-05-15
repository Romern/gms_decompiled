package p000;

/* renamed from: caad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum caad implements bxvp {
    RAW(0),
    DERIVED(1),
    CLEANED(2),
    CONVERTED(3);
    

    /* renamed from: e */
    public final int f172322e;

    private caad(int i) {
        this.f172322e = i;
    }

    /* renamed from: a */
    public static caad m126389a(int i) {
        if (i == 0) {
            return RAW;
        }
        if (i == 1) {
            return DERIVED;
        }
        if (i == 2) {
            return CLEANED;
        }
        if (i != 3) {
            return null;
        }
        return CONVERTED;
    }

    /* renamed from: b */
    public static bxvr m126391b() {
        return caac.f172316a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f172322e;
    }

    public final String toString() {
        return Integer.toString(this.f172322e);
    }
}
