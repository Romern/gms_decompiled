package p000;

/* renamed from: ciow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum ciow implements bxvp {
    UNKNOWN(0),
    REPORT_STATUS(1),
    RESET(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f191159e;

    private ciow(int i) {
        this.f191159e = i;
    }

    /* renamed from: a */
    public static ciow m150679a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return REPORT_STATUS;
        }
        if (i != 2) {
            return null;
        }
        return RESET;
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f191159e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
