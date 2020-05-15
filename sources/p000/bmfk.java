package p000;

/* renamed from: bmfk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bmfk implements bxvp {
    CARD_CLASS_DEBIT(1),
    CARD_CLASS_PREPAID(2),
    CARD_NETWORK_AMEX(3),
    CARD_NETWORK_DISCOVER(4),
    CARD_NETWORK_INTERAC(9),
    CARD_NETWORK_JCB(5),
    CARD_NETWORK_MASTERCARD(6),
    CARD_NETWORK_VISA(7),
    CARD_NETWORK_TOKEN_DISABLED(8);
    

    /* renamed from: j */
    public final int f129115j;

    private bmfk(int i) {
        this.f129115j = i;
    }

    /* renamed from: a */
    public static bmfk m107976a(int i) {
        switch (i) {
            case 1:
                return CARD_CLASS_DEBIT;
            case 2:
                return CARD_CLASS_PREPAID;
            case 3:
                return CARD_NETWORK_AMEX;
            case 4:
                return CARD_NETWORK_DISCOVER;
            case 5:
                return CARD_NETWORK_JCB;
            case 6:
                return CARD_NETWORK_MASTERCARD;
            case 7:
                return CARD_NETWORK_VISA;
            case 8:
                return CARD_NETWORK_TOKEN_DISABLED;
            case 9:
                return CARD_NETWORK_INTERAC;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m107977b() {
        return bmfj.f129104a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f129115j;
    }

    public final String toString() {
        return Integer.toString(this.f129115j);
    }
}
