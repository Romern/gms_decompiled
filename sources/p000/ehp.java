package p000;

/* renamed from: ehp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum ehp {
    ACTIVE_KEY(1),
    INACTIVE_KEY(2),
    DELETED(3),
    UNKNOWN_KEY(1000);
    

    /* renamed from: e */
    public final int f14994e;

    private ehp(int i) {
        this.f14994e = i;
    }

    /* renamed from: a */
    public static ehp m10432a(int i) {
        if (i == 1) {
            return ACTIVE_KEY;
        }
        if (i == 2) {
            return INACTIVE_KEY;
        }
        if (i != 3) {
            return UNKNOWN_KEY;
        }
        throw new ehy("Value=3 implies deleted and shouldn't be stored.");
    }

    /* renamed from: a */
    public static ehp m10433a(bqmh bqmh) {
        bqmh bqmh2 = bqmh.KEY_ACTION_UNSPECIFIED;
        int ordinal = bqmh.ordinal();
        if (ordinal == 1) {
            return ACTIVE_KEY;
        }
        if (ordinal != 2) {
            return ordinal != 3 ? UNKNOWN_KEY : DELETED;
        }
        return INACTIVE_KEY;
    }
}
