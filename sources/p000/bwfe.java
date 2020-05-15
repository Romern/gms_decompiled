package p000;

/* renamed from: bwfe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bwfe implements bxvp {
    EVENT_NAME_UNKNOWN(0),
    EVENT_NAME_SESSION_START(1),
    EVENT_NAME_SESSION_END(2),
    EVENT_NAME_CONTEXT_START(3),
    EVENT_NAME_CONTEXT_END(4),
    EVENT_NAME_CONTEXT_RESUMED(11),
    EVENT_NAME_FIELD_FOCUSED_START(5),
    EVENT_NAME_FIELD_FOCUSED_END(6),
    EVENT_NAME_EXPANDED_START(7),
    EVENT_NAME_EXPANDED_END(8),
    EVENT_NAME_API_REQUEST_START(9),
    EVENT_NAME_API_REQUEST_END(10),
    EVENT_NAME_WEB_VIEW_PAGE_LOAD_START(12),
    EVENT_NAME_WEB_VIEW_PAGE_LOAD_END(13),
    EVENT_NAME_APP_VALIDATION_START(14),
    EVENT_NAME_APP_VALIDATION_END(15),
    EVENT_XPC_CALL_START(16),
    EVENT_XPC_CALL_END(17),
    EVENT_NAME_CONFIGURATION(1000),
    EVENT_NAME_IMPRESSION(1001),
    EVENT_NAME_CLICK(1002),
    EVENT_NAME_FIELD_VALUE_CHANGED(1003),
    EVENT_NAME_FIELD_CLIENT_VALIDATION_ERROR(1004),
    EVENT_NAME_FIELD_SERVER_VALIDATION_ERROR(1005),
    EVENT_NAME_LANDING_MESSAGE_JAVASCRIPT_INJECTED(1006),
    EVENT_NAME_LANDING_MESSAGE_CALLBACK_RECEIVED(1007),
    EVENT_NAME_UNHANDLED_ERROR(1008),
    EVENT_NAME_PREFETCHED_INITIALIZE(1009),
    EVENT_NAME_REDIRECT_FORM_HOST_KILLED(1010),
    EVENT_XPC_CALL_SINGLE(1011),
    EVENT_NAME_WEB_VIEW_AUTH(1012),
    EVENT_NAME_DATA_URI_IMAGE_DECODED(1013),
    EVENT_NAME_IMPRESSION_NOT_CALCULATED(1014),
    EVENT_NAME_FINGERPRINT_AUTH(1015);
    

    /* renamed from: I */
    public final int f159083I;

    private bwfe(int i) {
        this.f159083I = i;
    }

    /* renamed from: a */
    public static bwfe m121902a(int i) {
        switch (i) {
            case 0:
                return EVENT_NAME_UNKNOWN;
            case 1:
                return EVENT_NAME_SESSION_START;
            case 2:
                return EVENT_NAME_SESSION_END;
            case 3:
                return EVENT_NAME_CONTEXT_START;
            case 4:
                return EVENT_NAME_CONTEXT_END;
            case 5:
                return EVENT_NAME_FIELD_FOCUSED_START;
            case 6:
                return EVENT_NAME_FIELD_FOCUSED_END;
            case 7:
                return EVENT_NAME_EXPANDED_START;
            case 8:
                return EVENT_NAME_EXPANDED_END;
            case 9:
                return EVENT_NAME_API_REQUEST_START;
            case 10:
                return EVENT_NAME_API_REQUEST_END;
            case 11:
                return EVENT_NAME_CONTEXT_RESUMED;
            case 12:
                return EVENT_NAME_WEB_VIEW_PAGE_LOAD_START;
            case 13:
                return EVENT_NAME_WEB_VIEW_PAGE_LOAD_END;
            case 14:
                return EVENT_NAME_APP_VALIDATION_START;
            case 15:
                return EVENT_NAME_APP_VALIDATION_END;
            case 16:
                return EVENT_XPC_CALL_START;
            case 17:
                return EVENT_XPC_CALL_END;
            default:
                switch (i) {
                    case 1000:
                        return EVENT_NAME_CONFIGURATION;
                    case 1001:
                        return EVENT_NAME_IMPRESSION;
                    case 1002:
                        return EVENT_NAME_CLICK;
                    case 1003:
                        return EVENT_NAME_FIELD_VALUE_CHANGED;
                    case 1004:
                        return EVENT_NAME_FIELD_CLIENT_VALIDATION_ERROR;
                    case 1005:
                        return EVENT_NAME_FIELD_SERVER_VALIDATION_ERROR;
                    case 1006:
                        return EVENT_NAME_LANDING_MESSAGE_JAVASCRIPT_INJECTED;
                    case 1007:
                        return EVENT_NAME_LANDING_MESSAGE_CALLBACK_RECEIVED;
                    case 1008:
                        return EVENT_NAME_UNHANDLED_ERROR;
                    case 1009:
                        return EVENT_NAME_PREFETCHED_INITIALIZE;
                    case 1010:
                        return EVENT_NAME_REDIRECT_FORM_HOST_KILLED;
                    case 1011:
                        return EVENT_XPC_CALL_SINGLE;
                    case 1012:
                        return EVENT_NAME_WEB_VIEW_AUTH;
                    case 1013:
                        return EVENT_NAME_DATA_URI_IMAGE_DECODED;
                    case 1014:
                        return EVENT_NAME_IMPRESSION_NOT_CALCULATED;
                    case 1015:
                        return EVENT_NAME_FINGERPRINT_AUTH;
                    default:
                        return null;
                }
        }
    }

    /* renamed from: b */
    public static bxvr m121903b() {
        return bwfd.f159047a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f159083I;
    }

    public final String toString() {
        return Integer.toString(this.f159083I);
    }
}
