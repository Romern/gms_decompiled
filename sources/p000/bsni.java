package p000;

/* renamed from: bsni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bsni implements bxvp {
    UNKNOWN_FEATURE(0),
    BETTER_TOGETHER_HOST(1),
    BETTER_TOGETHER_CLIENT(2),
    EASY_UNLOCK_HOST(3),
    EASY_UNLOCK_CLIENT(4),
    MAGIC_TETHER_HOST(5),
    MAGIC_TETHER_CLIENT(6),
    SMS_CONNECT_HOST(7),
    SMS_CONNECT_CLIENT(8),
    UNRECOGNIZED(-1);
    

    /* renamed from: k */
    private final int f146254k;

    private bsni(int i) {
        this.f146254k = i;
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f146254k;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
