package p000;

/* renamed from: bvac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bvac implements bxvp {
    OPERATION_STATUS_UNKNOWN(0),
    OPERATION_STATUS_ACTIVE(1),
    OPERATION_STATUS_CANCELLED(2),
    OPERATION_STATUS_FINISHED(3),
    OPERATION_STATUS_FAILED(4),
    OPERATION_STATUS_MISSING(5),
    OPERATION_STATUS_PENDING(6),
    OPERATION_STATUS_STARTING(7),
    OPERATION_STATUS_UPDATE_FAILED(8);
    

    /* renamed from: j */
    public final int f155464j;

    private bvac(int i) {
        this.f155464j = i;
    }

    /* renamed from: a */
    public static bvac m120825a(int i) {
        switch (i) {
            case 0:
                return OPERATION_STATUS_UNKNOWN;
            case 1:
                return OPERATION_STATUS_ACTIVE;
            case 2:
                return OPERATION_STATUS_CANCELLED;
            case 3:
                return OPERATION_STATUS_FINISHED;
            case 4:
                return OPERATION_STATUS_FAILED;
            case 5:
                return OPERATION_STATUS_MISSING;
            case 6:
                return OPERATION_STATUS_PENDING;
            case 7:
                return OPERATION_STATUS_STARTING;
            case 8:
                return OPERATION_STATUS_UPDATE_FAILED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m120826b() {
        return bvab.f155453a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f155464j;
    }

    public final String toString() {
        return Integer.toString(this.f155464j);
    }
}
