package p000;

/* renamed from: bydk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bydk {
    /* renamed from: a */
    public static /* synthetic */ String m124682a(int i) {
        if (i == 1) {
            return "ERR_NET_DOWN";
        }
        if (i == 6) {
            return "ERR_HEARTBEAT_ACK_TIMEOUT";
        }
        if (i == 3) {
            return "ERR_UNKNOWN_HOST";
        }
        if (i == 4) {
            return "ERR_AUTH";
        }
        if (i == 10) {
            return "ERR_UNKNOWN";
        }
        if (i == 11) {
            return "ERR_DISABLED";
        }
        switch (i) {
            case 14:
                return "ERR_PROTOCOL";
            case 15:
                return "ERR_SERVICE_END";
            case 16:
                return "ERR_IO_CONNECTING";
            case 17:
                return "ERR_MANUAL";
            case 18:
                return "ERR_REMOTE_CLOSE";
            case 19:
                return "ERR_IO_RST";
            case 20:
                return "ERR_IO_FIN";
            case 21:
                return "ERR_IO_WRITE";
            case 22:
                return "ERR_UNREACHABLE_HOST";
            case 23:
                return "ERR_UNREACHABLE_PORT";
            case 24:
                return "ERR_CONNECTION_TIMEOUT";
            case 25:
                return "ERR_CONNECTION_REFUSED_REMOTELY";
            case 26:
                return "ERR_SSL_EXCEPTION";
            case 27:
                return "ERR_CLOSE_BY_NEW_CONNECTION";
            case 28:
                return "ERR_IO_RST_HB";
            case 29:
                return "ERR_MCS_RECONNECT_REQUEST";
            case 30:
                return "ERR_CLOSE_BY_USER_UNLOCKED";
            default:
                return "null";
        }
    }
}
