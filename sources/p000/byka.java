package p000;

/* renamed from: byka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum byka implements bxvp {
    UNKNOWN(0),
    ACCEPTED(1),
    REJECTED(2),
    DELTA_FAILURE(3);
    

    /* renamed from: e */
    private final int f166725e;

    private byka(int i) {
        this.f166725e = i;
    }

    /* renamed from: a */
    public static byka m124893a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ACCEPTED;
        }
        if (i == 2) {
            return REJECTED;
        }
        if (i != 3) {
            return null;
        }
        return DELTA_FAILURE;
    }

    /* renamed from: b */
    public static bxvr m124894b() {
        return byjz.f166719a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f166725e;
    }

    public final String toString() {
        return Integer.toString(this.f166725e);
    }
}
