package p000;

/* renamed from: btoa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum btoa implements bxvp {
    UNKNOWN_BUNDLE(0),
    VISA_BUNDLE(1),
    MASTERCARD_BUNDLE(2),
    AMEX_BUNDLE(3),
    OBSOLETE_GMSCORE_V7_AMEX_BUNDLE(11),
    AMEX_V2_BUNDLE(12),
    DISCOVER_BUNDLE(4),
    PROXY_MASTERCARD_BUNDLE(5),
    PROXY_DISCOVER_BUNDLE(6),
    CANONICAL_INTERAC_BUNDLE(7),
    CANONICAL_EFTPOS_BUNDLE(8),
    CANONICAL_MASTERCARD_BUNDLE(9),
    CANONICAL_VISA_BUNDLE(10),
    CANONICAL_DISCOVER_BUNDLE(13),
    FELICA_BUNDLE(14),
    JCB_BUNDLE(15),
    CANONICAL_FELICA_ID_BUNDLE(16),
    CANONICAL_FELICA_QUICPAY_BUNDLE(17),
    CANONICAL_FELICA_QUICPAY_APTEST_BUNDLE(19),
    CANONICAL_FELICA_ID_APTEST_BUNDLE(20),
    CANONICAL_ELO_BUNDLE(18),
    UNRECOGNIZED(-1);
    

    /* renamed from: w */
    private final int f149724w;

    private btoa(int i) {
        this.f149724w = i;
    }

    /* renamed from: a */
    public static btoa m116971a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_BUNDLE;
            case 1:
                return VISA_BUNDLE;
            case 2:
                return MASTERCARD_BUNDLE;
            case 3:
                return AMEX_BUNDLE;
            case 4:
                return DISCOVER_BUNDLE;
            case 5:
                return PROXY_MASTERCARD_BUNDLE;
            case 6:
                return PROXY_DISCOVER_BUNDLE;
            case 7:
                return CANONICAL_INTERAC_BUNDLE;
            case 8:
                return CANONICAL_EFTPOS_BUNDLE;
            case 9:
                return CANONICAL_MASTERCARD_BUNDLE;
            case 10:
                return CANONICAL_VISA_BUNDLE;
            case 11:
                return OBSOLETE_GMSCORE_V7_AMEX_BUNDLE;
            case 12:
                return AMEX_V2_BUNDLE;
            case 13:
                return CANONICAL_DISCOVER_BUNDLE;
            case 14:
                return FELICA_BUNDLE;
            case 15:
                return JCB_BUNDLE;
            case 16:
                return CANONICAL_FELICA_ID_BUNDLE;
            case 17:
                return CANONICAL_FELICA_QUICPAY_BUNDLE;
            case 18:
                return CANONICAL_ELO_BUNDLE;
            case 19:
                return CANONICAL_FELICA_QUICPAY_APTEST_BUNDLE;
            case 20:
                return CANONICAL_FELICA_ID_APTEST_BUNDLE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m116972b() {
        return btnz.f149700a;
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f149724w;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
