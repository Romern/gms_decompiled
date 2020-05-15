package p000;

/* renamed from: bqaq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bqaq implements bxvp {
    UNDEFINED(0),
    SUCCESS(1),
    EXECUTION_ERROR(2),
    NOT_STARTED(3),
    INTERRUPTED(4),
    CANCELLED(5),
    CALL_CREDENTIALS_ERROR(6),
    UNKNOWN_HOST(7),
    UNSUPPORTED_PROTOCOL(8),
    PENDING_LOCAL_CHANGES(9),
    CONNECT_EXCEPTION(10),
    UNAUTHENTICATED(11),
    UNAVAILABLE(12),
    DEADLINE_EXCEEDED(13),
    UNRECOGNIZED(-1);
    

    /* renamed from: p */
    private final int f140175p;

    private bqaq(int i) {
        this.f140175p = i;
    }

    /* renamed from: a */
    public static bqaq m112480a(int i) {
        switch (i) {
            case 0:
                return UNDEFINED;
            case 1:
                return SUCCESS;
            case 2:
                return EXECUTION_ERROR;
            case 3:
                return NOT_STARTED;
            case 4:
                return INTERRUPTED;
            case 5:
                return CANCELLED;
            case 6:
                return CALL_CREDENTIALS_ERROR;
            case 7:
                return UNKNOWN_HOST;
            case 8:
                return UNSUPPORTED_PROTOCOL;
            case 9:
                return PENDING_LOCAL_CHANGES;
            case 10:
                return CONNECT_EXCEPTION;
            case 11:
                return UNAUTHENTICATED;
            case 12:
                return UNAVAILABLE;
            case 13:
                return DEADLINE_EXCEEDED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m112481b() {
        return bqap.f140158a;
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f140175p;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
