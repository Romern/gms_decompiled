package p000;

/* renamed from: bpzs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpzs implements bxvp {
    UNKNOWN_RESULT(0),
    SERVICE_STARTED(1),
    FLAG_DISABLED(2),
    PACKAGE_STOPPED(3),
    PACKAGE_DISABLED(4),
    PACKAGE_MISSING(5),
    START_SERVICE_FAILED(6),
    NO_PERMISSION(7),
    THROTTLED(8),
    NOT_ALLOWED(9),
    BROADCAST_SENT(10),
    START_SERVICE_UNKNOWN_ERROR(11),
    UNRECOGNIZED(-1);
    

    /* renamed from: n */
    private final int f140102n;

    private bpzs(int i) {
        this.f140102n = i;
    }

    /* renamed from: a */
    public static bpzs m112446a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_RESULT;
            case 1:
                return SERVICE_STARTED;
            case 2:
                return FLAG_DISABLED;
            case 3:
                return PACKAGE_STOPPED;
            case 4:
                return PACKAGE_DISABLED;
            case 5:
                return PACKAGE_MISSING;
            case 6:
                return START_SERVICE_FAILED;
            case 7:
                return NO_PERMISSION;
            case 8:
                return THROTTLED;
            case 9:
                return NOT_ALLOWED;
            case 10:
                return BROADCAST_SENT;
            case 11:
                return START_SERVICE_UNKNOWN_ERROR;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m112447b() {
        return bpzr.f140087a;
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f140102n;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
