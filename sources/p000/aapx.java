package p000;

/* renamed from: aapx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum aapx implements bxvp {
    CAUSE_UNKNOWN(0),
    GOOGLE_HTTP_CLIENT(1),
    CLOUD_MESSAGE_SENT(2),
    CLOUD_MESSAGE_RECEIVED(3),
    ALARM_MANAGER(4),
    EXECUTION_CALLBACK(5),
    DEVICE_CHARGING(6),
    CLIENT_LIB(7),
    NETWORK_CONNECTED(8),
    CONTENT_URI_UPDATED(9),
    DOZE_MAINTENANCE_WINDOW(10),
    DOZE_LIGHT_MAINTENANCE_WINDOW(11),
    REACHABILITY_CHANGED(12),
    INVOKE_ALL(13),
    DEVICE_IDLE(14);
    

    /* renamed from: p */
    public final int f28863p;

    private aapx(int i) {
        this.f28863p = i;
    }

    /* renamed from: a */
    public static aapx m21801a(int i) {
        switch (i) {
            case 0:
                return CAUSE_UNKNOWN;
            case 1:
                return GOOGLE_HTTP_CLIENT;
            case 2:
                return CLOUD_MESSAGE_SENT;
            case 3:
                return CLOUD_MESSAGE_RECEIVED;
            case 4:
                return ALARM_MANAGER;
            case 5:
                return EXECUTION_CALLBACK;
            case 6:
                return DEVICE_CHARGING;
            case 7:
                return CLIENT_LIB;
            case 8:
                return NETWORK_CONNECTED;
            case 9:
                return CONTENT_URI_UPDATED;
            case 10:
                return DOZE_MAINTENANCE_WINDOW;
            case 11:
                return DOZE_LIGHT_MAINTENANCE_WINDOW;
            case 12:
                return REACHABILITY_CHANGED;
            case 13:
                return INVOKE_ALL;
            case 14:
                return DEVICE_IDLE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m21802b() {
        return aapw.f28846a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f28863p;
    }

    public final String toString() {
        return Integer.toString(this.f28863p);
    }
}
