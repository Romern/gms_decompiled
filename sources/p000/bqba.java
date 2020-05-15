package p000;

/* renamed from: bqba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bqba implements bxvp {
    UNKNOWN(0),
    INVALID_SHARD_NAME(1),
    SHARD_DELETE_FAILED(2),
    INVALID_SHARD_FORMAT(3),
    SHARD_OPEN_FAILED(4),
    CRC_MISMATCH(5),
    SHARD_READ_FAILED(6),
    WORK_DIR_DISAPPEARED(7),
    WORK_DIR_LIST_ERROR(8),
    UNRECOGNIZED(-1);
    

    /* renamed from: k */
    private final int f140209k;

    private bqba(int i) {
        this.f140209k = i;
    }

    /* renamed from: a */
    public static bqba m112495a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return INVALID_SHARD_NAME;
            case 2:
                return SHARD_DELETE_FAILED;
            case 3:
                return INVALID_SHARD_FORMAT;
            case 4:
                return SHARD_OPEN_FAILED;
            case 5:
                return CRC_MISMATCH;
            case 6:
                return SHARD_READ_FAILED;
            case 7:
                return WORK_DIR_DISAPPEARED;
            case 8:
                return WORK_DIR_LIST_ERROR;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m112496b() {
        return bqaz.f140197a;
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f140209k;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
