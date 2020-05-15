package p000;

/* renamed from: btjb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum btjb implements bxvp {
    UNKNOWN(0),
    FRAUD(1),
    STATUS_UPDATE(2),
    ACTION_REQUIRED(3),
    PAYMENT_CARD_BALANCE(4),
    GIFT_CARD_BALANCE(5),
    REWARDS(6),
    CARD_LINKED_OFFERS(7),
    CUSTOMER_SUPPORT(8),
    UNRECOGNIZED(-1);
    

    /* renamed from: k */
    private final int f149079k;

    private btjb(int i) {
        this.f149079k = i;
    }

    /* renamed from: a */
    public static btjb m116830a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return FRAUD;
            case 2:
                return STATUS_UPDATE;
            case 3:
                return ACTION_REQUIRED;
            case 4:
                return PAYMENT_CARD_BALANCE;
            case 5:
                return GIFT_CARD_BALANCE;
            case 6:
                return REWARDS;
            case 7:
                return CARD_LINKED_OFFERS;
            case 8:
                return CUSTOMER_SUPPORT;
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
            return this.f149079k;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
