package p000;

/* renamed from: btaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum btaz implements bxvp {
    PLAN_TYPE_UNSPECIFIED(0),
    GENERIC(1),
    VDP(2),
    COMPOSITE(3),
    GOOGLE_ONE_MEMBERSHIP(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private final int f148079g;

    private btaz(int i) {
        this.f148079g = i;
    }

    /* renamed from: a */
    public static btaz m116383a(int i) {
        if (i == 0) {
            return PLAN_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return GENERIC;
        }
        if (i == 2) {
            return VDP;
        }
        if (i == 3) {
            return COMPOSITE;
        }
        if (i != 4) {
            return null;
        }
        return GOOGLE_ONE_MEMBERSHIP;
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f148079g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
