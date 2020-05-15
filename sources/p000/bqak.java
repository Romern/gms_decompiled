package p000;

/* renamed from: bqak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bqak implements bxvp {
    UNDEFINED(0),
    AUTHENTICATED(1),
    IO_EXCEPTION(2),
    AUTH_EXCEPTION(3),
    USER_RECOVERABLE_AUTH_EXCEPTION(4),
    NETWORK_ERROR(5),
    BAD_AUTHENTICATION(6),
    AUTH_INTERNAL_ERROR(7),
    UNRECOGNIZED(-1);
    

    /* renamed from: j */
    private final int f140135j;

    private bqak(int i) {
        this.f140135j = i;
    }

    /* renamed from: a */
    public static bqak m112468a(int i) {
        switch (i) {
            case 0:
                return UNDEFINED;
            case 1:
                return AUTHENTICATED;
            case 2:
                return IO_EXCEPTION;
            case 3:
                return AUTH_EXCEPTION;
            case 4:
                return USER_RECOVERABLE_AUTH_EXCEPTION;
            case 5:
                return NETWORK_ERROR;
            case 6:
                return BAD_AUTHENTICATION;
            case 7:
                return AUTH_INTERNAL_ERROR;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m112469b() {
        return bqaj.f140124a;
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f140135j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
