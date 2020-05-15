package p000;

/* renamed from: btre */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum btre implements bxvp {
    UNKNOWN_APPLET(0),
    VISA_PAYWAVE_APPLET(1),
    MASTERCARD_MCBP_APPLET(2),
    AMEX_EXPRESS_PAY_APPLET(3),
    AMEX_EXPRESS_PAY2_APPLET(10),
    DISCOVER_APPLET(4),
    TOOGLE_MASTERCARD_PAYPASS_APPLET(5),
    TOOGLE_DISCOVER_ZIP_APPLET(6),
    CANONICAL_INTERAC_APPLET(7),
    CANONICAL_EFTPOS_APPLET(8),
    CANONICAL_DISCOVER_APPLET(9),
    CANONICAL_MASTERCARD_APPLET(11),
    CANONICAL_ELO_APPLET(12),
    UNRECOGNIZED(-1);
    

    /* renamed from: o */
    private final int f150088o;

    private btre(int i) {
        this.f150088o = i;
    }

    /* renamed from: a */
    public static btre m117061a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_APPLET;
            case 1:
                return VISA_PAYWAVE_APPLET;
            case 2:
                return MASTERCARD_MCBP_APPLET;
            case 3:
                return AMEX_EXPRESS_PAY_APPLET;
            case 4:
                return DISCOVER_APPLET;
            case 5:
                return TOOGLE_MASTERCARD_PAYPASS_APPLET;
            case 6:
                return TOOGLE_DISCOVER_ZIP_APPLET;
            case 7:
                return CANONICAL_INTERAC_APPLET;
            case 8:
                return CANONICAL_EFTPOS_APPLET;
            case 9:
                return CANONICAL_DISCOVER_APPLET;
            case 10:
                return AMEX_EXPRESS_PAY2_APPLET;
            case 11:
                return CANONICAL_MASTERCARD_APPLET;
            case 12:
                return CANONICAL_ELO_APPLET;
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
            return this.f150088o;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
