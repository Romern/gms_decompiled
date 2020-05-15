package p000;

/* renamed from: btnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum btnv implements bxvp {
    UNKNOWN_ACTIVATION_METHOD_TYPE(0),
    SMS(1),
    EMAIL(2),
    PLACE_CALL(3),
    RECEIVE_CALL(4),
    WEB_URL(5),
    APP(6),
    ISSUER_STATEMENT(7),
    UNRECOGNIZED(-1);
    

    /* renamed from: j */
    private final int f149699j;

    private btnv(int i) {
        this.f149699j = i;
    }

    /* renamed from: a */
    public static btnv m116964a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ACTIVATION_METHOD_TYPE;
            case 1:
                return SMS;
            case 2:
                return EMAIL;
            case 3:
                return PLACE_CALL;
            case 4:
                return RECEIVE_CALL;
            case 5:
                return WEB_URL;
            case 6:
                return APP;
            case 7:
                return ISSUER_STATEMENT;
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
            return this.f149699j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
