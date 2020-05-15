package p000;

/* renamed from: bqao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bqao implements bxvp {
    SYNC_TRIGGER_UNKNOWN(0),
    SYNC_TRIGGER_MANUAL(1),
    SYNC_TRIGGER_TIMER(2),
    SYNC_TRIGGER_SUBSCRIPTION(3),
    SYNC_TRIGGER_PUSH_NOTIFICATION(4),
    SYNC_TRIGGER_READ(5),
    SYNC_TRIGGER_WRITE(6),
    UNRECOGNIZED(-1);
    

    /* renamed from: i */
    private final int f140157i;

    private bqao(int i) {
        this.f140157i = i;
    }

    /* renamed from: a */
    public static bqao m112476a(int i) {
        switch (i) {
            case 0:
                return SYNC_TRIGGER_UNKNOWN;
            case 1:
                return SYNC_TRIGGER_MANUAL;
            case 2:
                return SYNC_TRIGGER_TIMER;
            case 3:
                return SYNC_TRIGGER_SUBSCRIPTION;
            case 4:
                return SYNC_TRIGGER_PUSH_NOTIFICATION;
            case 5:
                return SYNC_TRIGGER_READ;
            case 6:
                return SYNC_TRIGGER_WRITE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m112477b() {
        return bqan.f140147a;
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f140157i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
