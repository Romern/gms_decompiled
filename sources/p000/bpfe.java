package p000;

/* renamed from: bpfe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpfe implements bxvp {
    REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_UNKNOWN(0),
    REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_USER_DISMISSED(1),
    REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_USER_STOPPED(2),
    REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_RECEIVER_OFFLINE(3),
    REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_SENDER_BECAME_PRIMARY(4),
    REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_RECEIVER_PRIVATE_MODE(5),
    REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_USER_DISABLE_FROM_SETTINGS(6),
    REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_CONNECTION_TO_GMSCORE_FAILED(7),
    REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_CONNECTION_TO_RECEIVER_FAILED(8),
    REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_NEW_SERVICE_STARTED(9),
    REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_INVALID_APPLICATION(10),
    REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_APPLICATION_DISCONNECTED(11),
    REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_NO_MEDIA_SESSION(12),
    REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_SERVICE_STOPPED(13),
    REMOTE_CONTROL_NOTIFICATION_CANCEL_SCEEN_OFF(14);
    

    /* renamed from: p */
    public final int f137392p;

    private bpfe(int i) {
        this.f137392p = i;
    }

    /* renamed from: a */
    public static bpfe m111861a(int i) {
        switch (i) {
            case 0:
                return REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_UNKNOWN;
            case 1:
                return REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_USER_DISMISSED;
            case 2:
                return REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_USER_STOPPED;
            case 3:
                return REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_RECEIVER_OFFLINE;
            case 4:
                return REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_SENDER_BECAME_PRIMARY;
            case 5:
                return REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_RECEIVER_PRIVATE_MODE;
            case 6:
                return REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_USER_DISABLE_FROM_SETTINGS;
            case 7:
                return REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_CONNECTION_TO_GMSCORE_FAILED;
            case 8:
                return REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_CONNECTION_TO_RECEIVER_FAILED;
            case 9:
                return REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_NEW_SERVICE_STARTED;
            case 10:
                return REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_INVALID_APPLICATION;
            case 11:
                return REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_APPLICATION_DISCONNECTED;
            case 12:
                return REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_NO_MEDIA_SESSION;
            case 13:
                return REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_SERVICE_STOPPED;
            case 14:
                return REMOTE_CONTROL_NOTIFICATION_CANCEL_SCEEN_OFF;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m111862b() {
        return bpfd.f137375a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f137392p;
    }

    public final String toString() {
        return Integer.toString(this.f137392p);
    }
}
