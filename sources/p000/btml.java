package p000;

/* renamed from: btml */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum btml implements bxvp {
    UNKNOWN_SETUP_STEP_TYPE(0),
    COMPLETE_RETURN_SETUP_STEP_TYPE(1),
    COMPLETE_START_TOKENIZATION_SETUP_STEP_TYPE(2),
    WEB_VIEW_SETUP_STEP_TYPE(3),
    BENDER_SETUP_STEP_TYPE(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private final int f149509g;

    private btml(int i) {
        this.f149509g = i;
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f149509g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }
}
