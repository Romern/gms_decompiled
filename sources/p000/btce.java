package p000;

/* renamed from: btce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum btce implements bxvp {
    PROFILE_JOIN_UNSPECIFIED(0),
    PHONE_JOIN(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: d */
    private final int f148262d;

    private btce(int i) {
        this.f148262d = i;
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f148262d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }
}
