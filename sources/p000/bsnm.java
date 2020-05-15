package p000;

/* renamed from: bsnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bsnm implements bxvp {
    UNKNOWN(0),
    AUTHZEN(1),
    BETTER_TOGETHER(2),
    FIDO(3),
    SMARTSETUP(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private final int f146303g;

    private bsnm(int i) {
        this.f146303g = i;
    }

    /* renamed from: a */
    public static bsnm m116012a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return AUTHZEN;
        }
        if (i == 2) {
            return BETTER_TOGETHER;
        }
        if (i == 3) {
            return FIDO;
        }
        if (i != 4) {
            return null;
        }
        return SMARTSETUP;
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f146303g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
