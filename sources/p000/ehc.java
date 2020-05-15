package p000;

/* renamed from: ehc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum ehc {
    ASYMMETRIC_KEY(1),
    SYMMETRIC_KEY(2),
    CUSTOM_KEY(3),
    UNKNOWN_KEY_TYPE(1000);
    

    /* renamed from: e */
    public final int f14909e;

    private ehc(int i) {
        this.f14909e = i;
    }

    /* renamed from: a */
    public static ehc m10410a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? UNKNOWN_KEY_TYPE : CUSTOM_KEY : SYMMETRIC_KEY : ASYMMETRIC_KEY;
    }

    /* renamed from: a */
    public static ehc m10411a(bqmb bqmb) {
        bqmb bqmb2 = bqmb.KEY_TYPE_UNSPECIFIED;
        int ordinal = bqmb.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return SYMMETRIC_KEY;
        }
        if (ordinal == 3 || ordinal == 4) {
            return ASYMMETRIC_KEY;
        }
        return ordinal != 5 ? UNKNOWN_KEY_TYPE : CUSTOM_KEY;
    }
}
