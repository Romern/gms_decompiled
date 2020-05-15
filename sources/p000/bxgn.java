package p000;

/* renamed from: bxgn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bxgn implements bxvp {
    UNKNOWN_QUERY_FENCE_OPERATION_TYPE(0),
    ALL(1),
    KEYS(2);
    

    /* renamed from: d */
    public final int f163274d;

    private bxgn(int i) {
        this.f163274d = i;
    }

    /* renamed from: a */
    public static bxgn m122690a(int i) {
        if (i == 0) {
            return UNKNOWN_QUERY_FENCE_OPERATION_TYPE;
        }
        if (i == 1) {
            return ALL;
        }
        if (i != 2) {
            return null;
        }
        return KEYS;
    }

    /* renamed from: b */
    public static bxvr m122691b() {
        return bxgm.f163269a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f163274d;
    }

    public final String toString() {
        return Integer.toString(this.f163274d);
    }
}
