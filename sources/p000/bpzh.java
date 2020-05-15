package p000;

/* renamed from: bpzh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpzh implements bxvp {
    QUERY(0),
    QUERY_UNIVERSAL(1),
    SUGGEST(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f139996e;

    private bpzh(int i) {
        this.f139996e = i;
    }

    /* renamed from: a */
    public static bpzh m112427a(int i) {
        if (i == 0) {
            return QUERY;
        }
        if (i == 1) {
            return QUERY_UNIVERSAL;
        }
        if (i != 2) {
            return null;
        }
        return SUGGEST;
    }

    /* renamed from: b */
    public static bxvr m112428b() {
        return bpzg.f139990a;
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f139996e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
