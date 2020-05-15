package p000;

/* renamed from: ahih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahih extends rjs {
    /* renamed from: a */
    public static String m55828a(int i) {
        if (i == 8025) {
            return "MISSING_SETTING_LOCATION_MUST_BE_ON";
        }
        if (i == 8050) {
            return "API_CONNECTION_FAILED_ALREADY_IN_USE";
        }
        switch (i) {
            case 8000:
                return "STATUS_NETWORK_NOT_CONNECTED";
            case 8001:
                return "STATUS_ALREADY_ADVERTISING";
            case 8002:
                return "STATUS_ALREADY_DISCOVERING";
            case 8003:
                return "STATUS_ALREADY_CONNECTED_TO_ENDPOINT";
            case 8004:
                return "STATUS_CONNECTION_REJECTED";
            case 8005:
                return "STATUS_NOT_CONNECTED_TO_ENDPOINT";
            default:
                switch (i) {
                    case 8007:
                        return "STATUS_RADIO_ERROR";
                    case 8008:
                        return "STATUS_ALREADY_HAVE_ACTIVE_STRATEGY";
                    case 8009:
                        return "STATUS_OUT_OF_ORDER_API_CALL";
                    case 8010:
                        return "STATUS_UNSUPPORTED_PAYLOAD_TYPE_FOR_STRATEGY";
                    case 8011:
                        return "STATUS_ENDPOINT_UNKNOWN";
                    case 8012:
                        return "STATUS_ENDPOINT_IO_ERROR";
                    case 8013:
                        return "STATUS_PAYLOAD_IO_ERROR";
                    case 8014:
                        return "STATUS_PAYLOAD_UNKNOWN";
                    default:
                        switch (i) {
                            case 8030:
                                return "MISSING_PERMISSION_BLUETOOTH";
                            case 8031:
                                return "MISSING_PERMISSION_BLUETOOTH_ADMIN";
                            case 8032:
                                return "MISSING_PERMISSION_ACCESS_WIFI_STATE";
                            case 8033:
                                return "MISSING_PERMISSION_CHANGE_WIFI_STATE";
                            case 8034:
                                return "MISSING_PERMISSION_ACCESS_COARSE_LOCATION";
                            case 8035:
                                return "MISSING_PERMISSION_RECORD_AUDIO";
                            case 8036:
                                return "MISSING_PERMISSION_ACCESS_FINE_LOCATION";
                            default:
                                return rjs.m33677c(i);
                        }
                }
        }
    }
}
