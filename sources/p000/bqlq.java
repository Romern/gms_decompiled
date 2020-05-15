package p000;

/* renamed from: bqlq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bqlq implements bxvp {
    INVOCATION_REASON_UNSPECIFIED(0),
    INITIALIZATION(1),
    PERIODIC(2),
    SLOW_PERIODIC(3),
    FAST_PERIODIC(4),
    EXPIRATION(5),
    FAILURE_RECOVERY(6),
    NEW_ACCOUNT(7),
    CHANGED_ACCOUNT(8),
    FEATURE_TOGGLED(9),
    SERVER_INITIATED(10),
    ADDRESS_CHANGE(11),
    SOFTWARE_UPDATE(12),
    MANUAL(13),
    CUSTOM_KEY_INVALIDATION(14),
    PROXIMITY_PERIODIC(15),
    UNRECOGNIZED(-1);
    

    /* renamed from: r */
    private final int f141154r;

    private bqlq(int i) {
        this.f141154r = i;
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f141154r;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }
}
