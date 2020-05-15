package p000;

/* renamed from: boom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum boom implements bxvp {
    UNKNOWN(0),
    UPDATE_DISABLED(1),
    SUCCESSFUL_UPDATE(2),
    FAILED_UPDATE(3),
    TIMEDOUT_UPDATE(4),
    SIM_CHANGE_EVENT(5),
    ACTIVE_SIM_SWITCH_EVENT(6),
    MODULE_INIT_EVENT(7),
    LOCALE_CHANGE_EVENT(8),
    UNRECOGNIZED(-1);
    

    /* renamed from: k */
    private final int f133950k;

    private boom(int i) {
        this.f133950k = i;
    }

    /* renamed from: a */
    public static boom m111394a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return UPDATE_DISABLED;
            case 2:
                return SUCCESSFUL_UPDATE;
            case 3:
                return FAILED_UPDATE;
            case 4:
                return TIMEDOUT_UPDATE;
            case 5:
                return SIM_CHANGE_EVENT;
            case 6:
                return ACTIVE_SIM_SWITCH_EVENT;
            case 7:
                return MODULE_INIT_EVENT;
            case 8:
                return LOCALE_CHANGE_EVENT;
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
            return this.f133950k;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
