package p000;

/* renamed from: btob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum btob implements bxvp {
    CAPABILITY_UNKNOWN(0),
    CAPABILITY_VISA_PLC(1),
    CAPABILITY_MAESTRO(2),
    CAPABILITY_SAVE_TO_PLATFORM(3),
    CAPABILITY_VISA_ODA_REPERSO(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private final int f149732g;

    private btob(int i) {
        this.f149732g = i;
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f149732g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }
}
