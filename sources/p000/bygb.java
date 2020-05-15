package p000;

/* renamed from: bygb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bygb implements bxvp {
    CONSENT_UNSPECIFIED(0),
    CONSENTED(1),
    DECLINED(2),
    NOT_REQUIRED(3),
    NOT_ASKED(4),
    REVOKED(5),
    INITIALIZED(6),
    PENDING(7),
    OPT_IN(8),
    OPT_OUT(9),
    UNRECOGNIZED(-1);
    

    /* renamed from: l */
    private final int f166106l;

    private bygb(int i) {
        this.f166106l = i;
    }

    /* renamed from: a */
    public static bygb m124774a(int i) {
        switch (i) {
            case 0:
                return CONSENT_UNSPECIFIED;
            case 1:
                return CONSENTED;
            case 2:
                return DECLINED;
            case 3:
                return NOT_REQUIRED;
            case 4:
                return NOT_ASKED;
            case 5:
                return REVOKED;
            case 6:
                return INITIALIZED;
            case 7:
                return PENDING;
            case 8:
                return OPT_IN;
            case 9:
                return OPT_OUT;
            default:
                return null;
        }
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f166106l;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
