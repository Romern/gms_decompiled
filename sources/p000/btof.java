package p000;

/* renamed from: btof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum btof implements bxvp {
    NONE(0),
    TORINO(1),
    TOOGLE(2),
    AMEX_TSP(3),
    VISA_TSP(4),
    MASTERCARD_TSP(5),
    TOOGLE_DISCOVER(6),
    DISCOVER_TSP(7),
    EFTPOS_TSP(8),
    INTERAC_TSP(9),
    OBERTHUR_TSP(10),
    PAYPAL_TSP(11),
    APTEST_TSP(12),
    APTEST_SECONDARY_TSP(13),
    JCB_TSP(17),
    GEMALTO_TSP(18),
    ELO_TSP(19),
    RUPAY_TSP(20),
    JCB_F_TSP(14),
    IBM_F_TSP(15),
    DNP_F_TSP(16),
    UNRECOGNIZED(-1);
    

    /* renamed from: w */
    private final int f149758w;

    private btof(int i) {
        this.f149758w = i;
    }

    /* renamed from: a */
    public static btof m116979a(int i) {
        switch (i) {
            case 0:
                return NONE;
            case 1:
                return TORINO;
            case 2:
                return TOOGLE;
            case 3:
                return AMEX_TSP;
            case 4:
                return VISA_TSP;
            case 5:
                return MASTERCARD_TSP;
            case 6:
                return TOOGLE_DISCOVER;
            case 7:
                return DISCOVER_TSP;
            case 8:
                return EFTPOS_TSP;
            case 9:
                return INTERAC_TSP;
            case 10:
                return OBERTHUR_TSP;
            case 11:
                return PAYPAL_TSP;
            case 12:
                return APTEST_TSP;
            case 13:
                return APTEST_SECONDARY_TSP;
            case 14:
                return JCB_F_TSP;
            case 15:
                return IBM_F_TSP;
            case 16:
                return DNP_F_TSP;
            case 17:
                return JCB_TSP;
            case 18:
                return GEMALTO_TSP;
            case 19:
                return ELO_TSP;
            case 20:
                return RUPAY_TSP;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m116980b() {
        return btoe.f149734a;
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f149758w;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
