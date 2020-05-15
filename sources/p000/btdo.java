package p000;

/* renamed from: btdo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum btdo implements bxvp {
    UNKNOWN_LIST_OPTION(0),
    INCLUDE_DELETED(1),
    INCLUDE_MEMBERSHIP_COUNT(2),
    GDATA_COMPATIBILITY_MODE(3),
    INCLUDE_SYNTHETIC_GROUPS(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private final int f148423g;

    private btdo(int i) {
        this.f148423g = i;
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f148423g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }
}
