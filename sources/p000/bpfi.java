package p000;

/* renamed from: bpfi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpfi implements bxvp {
    REMOTE_CONTROL_NOTIFICATION_FAILURE_UNKNOWN(0),
    REMOTE_CONTROL_NOTIFICATION_FAILED_TO_CONNECT(1),
    REMOTE_CONTROL_NOTIFICATION_FAILED_TO_JOIN_APPLICATION(2),
    REMOTE_CONTROL_NOTIFICATION_RECEIVED_INVALID_DEVICE_STATUS(3),
    REMOTE_CONTROL_NOTIFICATION_RECEIVED_INVALID_MEDIA_STATUS(4),
    REMOTE_CONTROL_NOTIFICATION_FAILED_TO_SET_MEDIA_NAMESPACE_CALLBACK(5),
    REMOTE_CONTROL_NOTIFICATION_FAILED_TO_REQUEST_RECEIVER_STATUS(6);
    

    /* renamed from: h */
    public final int f137403h;

    private bpfi(int i) {
        this.f137403h = i;
    }

    /* renamed from: a */
    public static bpfi m111867a(int i) {
        switch (i) {
            case 0:
                return REMOTE_CONTROL_NOTIFICATION_FAILURE_UNKNOWN;
            case 1:
                return REMOTE_CONTROL_NOTIFICATION_FAILED_TO_CONNECT;
            case 2:
                return REMOTE_CONTROL_NOTIFICATION_FAILED_TO_JOIN_APPLICATION;
            case 3:
                return REMOTE_CONTROL_NOTIFICATION_RECEIVED_INVALID_DEVICE_STATUS;
            case 4:
                return REMOTE_CONTROL_NOTIFICATION_RECEIVED_INVALID_MEDIA_STATUS;
            case 5:
                return REMOTE_CONTROL_NOTIFICATION_FAILED_TO_SET_MEDIA_NAMESPACE_CALLBACK;
            case 6:
                return REMOTE_CONTROL_NOTIFICATION_FAILED_TO_REQUEST_RECEIVER_STATUS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m111868b() {
        return bpfh.f137394a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f137403h;
    }

    public final String toString() {
        return Integer.toString(this.f137403h);
    }
}
