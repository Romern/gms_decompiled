package p000;

/* renamed from: bxrs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bxrs implements bxvp {
    UNKNOWN(0),
    FLOW(1),
    PROMPT(2);
    

    /* renamed from: d */
    public final int f164598d;

    private bxrs(int i) {
        this.f164598d = i;
    }

    /* renamed from: a */
    public static bxrs m123045a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return FLOW;
        }
        if (i != 2) {
            return null;
        }
        return PROMPT;
    }

    /* renamed from: b */
    public static bxvr m123046b() {
        return bxrr.f164593a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f164598d;
    }

    public final String toString() {
        return Integer.toString(this.f164598d);
    }
}
