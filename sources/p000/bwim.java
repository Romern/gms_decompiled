package p000;

/* renamed from: bwim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bwim implements bxvp {
    UNKNOWN(0),
    SMALL(1),
    MEDIUM(2),
    LARGE(3);
    

    /* renamed from: e */
    private final int f159650e;

    private bwim(int i) {
        this.f159650e = i;
    }

    /* renamed from: a */
    public static bwim m121993a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return SMALL;
        }
        if (i == 2) {
            return MEDIUM;
        }
        if (i != 3) {
            return null;
        }
        return LARGE;
    }

    /* renamed from: b */
    public static bxvr m121994b() {
        return bwil.f159644a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f159650e;
    }

    public final String toString() {
        return Integer.toString(this.f159650e);
    }
}
