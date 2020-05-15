package p000;

/* renamed from: btdx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum btdx implements bxvp {
    UNKNOWN_PROFILE_STATE(0),
    ADMIN_BLOCKED(1),
    DELETED(2),
    CORE_ID(3),
    DASHER_ADMIN_DISABLED(4),
    USER_TO_USER_BLOCKED(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: h */
    private final int f148472h;

    private btdx(int i) {
        this.f148472h = i;
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f148472h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }
}
