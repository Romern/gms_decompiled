package p000;

/* renamed from: btrh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum btrh implements bxvp {
    UNKNOWN_DETAILS_CAPABILITY(0),
    SUPPORTS_INFERRED_RICH_DATA(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: d */
    private final int f150103d;

    private btrh(int i) {
        this.f150103d = i;
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f150103d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }
}
