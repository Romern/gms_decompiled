package p000;

/* renamed from: cbnw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cbnw implements bxvp {
    UNKNOWN_CLIENT(0),
    CONSTELLATION(1),
    RCS(2),
    ONE_TIME_VERIFICATION(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private final int f177771f;

    private cbnw(int i) {
        this.f177771f = i;
    }

    /* renamed from: a */
    public static cbnw m128030a(int i) {
        if (i == 0) {
            return UNKNOWN_CLIENT;
        }
        if (i == 1) {
            return CONSTELLATION;
        }
        if (i == 2) {
            return RCS;
        }
        if (i != 3) {
            return null;
        }
        return ONE_TIME_VERIFICATION;
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f177771f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
