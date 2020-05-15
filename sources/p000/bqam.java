package p000;

/* renamed from: bqam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bqam implements bxvp {
    UNDEFINED(0),
    SUCCESS(1),
    FAILURE(2),
    IO_EXCEPTION(3),
    UNKNOWN_HOST_EXCEPTION(4),
    UNAVAILABLE(5),
    DEADLINE_EXCEEDED(6),
    UNRECOGNIZED(-1);
    

    /* renamed from: i */
    private final int f140146i;

    private bqam(int i) {
        this.f140146i = i;
    }

    /* renamed from: a */
    public static bqam m112472a(int i) {
        switch (i) {
            case 0:
                return UNDEFINED;
            case 1:
                return SUCCESS;
            case 2:
                return FAILURE;
            case 3:
                return IO_EXCEPTION;
            case 4:
                return UNKNOWN_HOST_EXCEPTION;
            case 5:
                return UNAVAILABLE;
            case 6:
                return DEADLINE_EXCEEDED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m112473b() {
        return bqal.f140136a;
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f140146i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
