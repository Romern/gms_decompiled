package p000;

/* renamed from: bszx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bszx implements bxvp {
    GCORE_MSG_TYPE_UNSPECIFIED(0),
    GCORE_MSG_TYPE_PLAN_STATUS_UPDATED(1),
    GCORE_MSG_TYPE_UPSELL_OFFER(2),
    GCORE_MSG_TYPE_ACCOUNT_ALERT(3),
    GCORE_MSG_TYPE_OUT_OF_DATA(4),
    GCORE_MSG_TYPE_EXPIRATION_REMINDER(5),
    GCORE_MSG_TYPE_BALANCE_UPDATE(6),
    GCORE_MSG_TYPE_PURCHASE(7),
    GCORE_MSG_TYPE_SETUP(8),
    GCORE_MSG_TYPE_DAILY_UPDATE(9),
    GCORE_MSG_TYPE_PAYGO(10),
    GCORE_MSG_TYPE_OTHER(100),
    GCORE_MSG_TYPE_HIDDEN(101),
    UNRECOGNIZED(-1);
    

    /* renamed from: o */
    private final int f147912o;

    private bszx(int i) {
        this.f147912o = i;
    }

    /* renamed from: a */
    public static bszx m116352a(int i) {
        if (i == 100) {
            return GCORE_MSG_TYPE_OTHER;
        }
        if (i == 101) {
            return GCORE_MSG_TYPE_HIDDEN;
        }
        switch (i) {
            case 0:
                return GCORE_MSG_TYPE_UNSPECIFIED;
            case 1:
                return GCORE_MSG_TYPE_PLAN_STATUS_UPDATED;
            case 2:
                return GCORE_MSG_TYPE_UPSELL_OFFER;
            case 3:
                return GCORE_MSG_TYPE_ACCOUNT_ALERT;
            case 4:
                return GCORE_MSG_TYPE_OUT_OF_DATA;
            case 5:
                return GCORE_MSG_TYPE_EXPIRATION_REMINDER;
            case 6:
                return GCORE_MSG_TYPE_BALANCE_UPDATE;
            case 7:
                return GCORE_MSG_TYPE_PURCHASE;
            case 8:
                return GCORE_MSG_TYPE_SETUP;
            case 9:
                return GCORE_MSG_TYPE_DAILY_UPDATE;
            case 10:
                return GCORE_MSG_TYPE_PAYGO;
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
            return this.f147912o;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
