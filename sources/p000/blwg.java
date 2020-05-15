package p000;

/* renamed from: blwg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum blwg implements bxvp {
    UNKNOWN_CARD_TYPE(0),
    AMEX(1),
    DINERS_CLUB(2),
    DISCOVER(3),
    JCB(4),
    MASTERCARD(5),
    PROXY(6),
    SOLO(7),
    VISA(8),
    ELO(9),
    INTERAC(10),
    EFTPOS(11),
    PRIVATE_LABEL(12),
    MAESTRO(13),
    UNIONPAY(14),
    FELICA(15);
    

    /* renamed from: q */
    public static final bxvq f127941q = new blwe();

    /* renamed from: r */
    public final int f127943r;

    private blwg(int i) {
        this.f127943r = i;
    }

    /* renamed from: a */
    public static blwg m107710a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CARD_TYPE;
            case 1:
                return AMEX;
            case 2:
                return DINERS_CLUB;
            case 3:
                return DISCOVER;
            case 4:
                return JCB;
            case 5:
                return MASTERCARD;
            case 6:
                return PROXY;
            case 7:
                return SOLO;
            case 8:
                return VISA;
            case 9:
                return ELO;
            case 10:
                return INTERAC;
            case 11:
                return EFTPOS;
            case 12:
                return PRIVATE_LABEL;
            case 13:
                return MAESTRO;
            case 14:
                return UNIONPAY;
            case 15:
                return FELICA;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m107711b() {
        return blwf.f127924a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f127943r;
    }

    public final String toString() {
        return Integer.toString(this.f127943r);
    }
}
