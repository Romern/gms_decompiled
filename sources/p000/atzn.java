package p000;

/* renamed from: atzn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum atzn implements bxvp {
    VALUE_TYPE_UNKNOWN(0),
    VALUE_TYPE_UNKNOWN_LIST(7),
    VALUE_TYPE_BOOLEAN(1),
    VALUE_TYPE_INT(2),
    VALUE_TYPE_LONG(3),
    VALUE_TYPE_STRING(4),
    VALUE_TYPE_BYTES(8),
    VALUE_TYPE_BUNDLE(9),
    VALUE_TYPE_CARD_INFO(5),
    VALUE_TYPE_CARD_INFOS(6),
    VALUE_TYPE_BUY_FLOW_CONFIG(10),
    VALUE_TYPE_ACCOUNT(11),
    VALUE_TYPE_ACCOUNT_INFO(12),
    VALUE_TYPE_TOKEN_STATUS(13),
    VALUE_TYPE_LIST_OF_BYTES(14),
    UNRECOGNIZED(-1);
    

    /* renamed from: q */
    private final int f91266q;

    private atzn(int i) {
        this.f91266q = i;
    }

    /* renamed from: a */
    public static atzn m76605a(int i) {
        switch (i) {
            case 0:
                return VALUE_TYPE_UNKNOWN;
            case 1:
                return VALUE_TYPE_BOOLEAN;
            case 2:
                return VALUE_TYPE_INT;
            case 3:
                return VALUE_TYPE_LONG;
            case 4:
                return VALUE_TYPE_STRING;
            case 5:
                return VALUE_TYPE_CARD_INFO;
            case 6:
                return VALUE_TYPE_CARD_INFOS;
            case 7:
                return VALUE_TYPE_UNKNOWN_LIST;
            case 8:
                return VALUE_TYPE_BYTES;
            case 9:
                return VALUE_TYPE_BUNDLE;
            case 10:
                return VALUE_TYPE_BUY_FLOW_CONFIG;
            case 11:
                return VALUE_TYPE_ACCOUNT;
            case 12:
                return VALUE_TYPE_ACCOUNT_INFO;
            case 13:
                return VALUE_TYPE_TOKEN_STATUS;
            case 14:
                return VALUE_TYPE_LIST_OF_BYTES;
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
            return this.f91266q;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
