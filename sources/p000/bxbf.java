package p000;

/* renamed from: bxbf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bxbf implements bxvp {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    UNAUTHENTICATED(16),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    DO_NOT_USE_RESERVED_FOR_FUTURE_EXPANSION_USE_DEFAULT_IN_SWITCH_INSTEAD_(20);
    

    /* renamed from: s */
    public final int f161807s;

    private bxbf(int i) {
        this.f161807s = i;
    }

    /* renamed from: a */
    public static bxbf m122514a(int i) {
        if (i == 20) {
            return DO_NOT_USE_RESERVED_FOR_FUTURE_EXPANSION_USE_DEFAULT_IN_SWITCH_INSTEAD_;
        }
        switch (i) {
            case 0:
                return OK;
            case 1:
                return CANCELLED;
            case 2:
                return UNKNOWN;
            case 3:
                return INVALID_ARGUMENT;
            case 4:
                return DEADLINE_EXCEEDED;
            case 5:
                return NOT_FOUND;
            case 6:
                return ALREADY_EXISTS;
            case 7:
                return PERMISSION_DENIED;
            case 8:
                return RESOURCE_EXHAUSTED;
            case 9:
                return FAILED_PRECONDITION;
            case 10:
                return ABORTED;
            case 11:
                return OUT_OF_RANGE;
            case 12:
                return UNIMPLEMENTED;
            case 13:
                return INTERNAL;
            case 14:
                return UNAVAILABLE;
            case 15:
                return DATA_LOSS;
            case 16:
                return UNAUTHENTICATED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m122515b() {
        return bxbe.f161787a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f161807s;
    }

    public final String toString() {
        return Integer.toString(this.f161807s);
    }
}
