package p000;

/* renamed from: bopw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bopw implements bxvp {
    UNKNOWN(0),
    LU_CLICKED(1),
    ON_CREATE_ENTRY_ACTIVITY(2),
    ON_NEW_INTENT_ENTRY_ACTIVITY(3),
    HANDLE_CHAT_INTENT(4),
    ON_CREATE_VIEW_WEB_APP_FRAGMENT(5),
    AIDL_SERVICE_CONNECTED(6),
    WEBVIEW_LOAD_URL_INDEX_PAGE(7),
    CHECK_REGISTRATION(8),
    CONVERSATION_ID_RECEIVED(9),
    WEBVIEW_LOADING_RES_JS_BUNDLE(10),
    WEBVIEW_LOADING_RES_INDEX_PAGE(11),
    WEB_APP_LOADED_JS_STARTED(12),
    WEB_APP_UI_DISPLAYED_ALL_DONE(13),
    ATTEMPT_PARSE_ARGS_IN_UI_PROCESS(14),
    PARSE_ARGS_IN_UI_PROCESS_SUCCESS(15),
    REGISTERED_BROADCAST_RECEIVERS(16),
    BIND_WITH_MESSAGING_SERVICE(17),
    ADD_JS_INTERFACES(18),
    ON_RESUME_WEB_APP_FRAGMENT(19),
    ACCOUNT_CONTEXT_RECEIVED(20),
    PREBUNDLE_INTERCEPT_HTML(21),
    PREBUNDLE_INTERCEPT_JS(22),
    PREBUNDLE_INTERCEPT_LOCALE_AGNOSTIC_JS(23),
    PREBUNDLE_INTERCEPT_LOCALE_DATA_JS(24),
    PREBUNDLE_INTERCEPT_LOCALE_AGNOSTIC_HTML(25),
    PREBUNDLE_INTERCEPT_CSS(26),
    SKIP_PREBUNDLE_UNSUPPORTED_LOCALE(27),
    FAILED_TO_LOAD_PREBUNDLED_ASSET(28),
    INITIATE_LIGHTER_INSTANCE(29),
    HAS_UPGRADED_TO_LIGHTER(30),
    ON_USER_LEAVE_HINT(31),
    UNRECOGNIZED(-1);
    

    /* renamed from: H */
    private final int f134217H;

    private bopw(int i) {
        this.f134217H = i;
    }

    /* renamed from: a */
    public static bopw m111434a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return LU_CLICKED;
            case 2:
                return ON_CREATE_ENTRY_ACTIVITY;
            case 3:
                return ON_NEW_INTENT_ENTRY_ACTIVITY;
            case 4:
                return HANDLE_CHAT_INTENT;
            case 5:
                return ON_CREATE_VIEW_WEB_APP_FRAGMENT;
            case 6:
                return AIDL_SERVICE_CONNECTED;
            case 7:
                return WEBVIEW_LOAD_URL_INDEX_PAGE;
            case 8:
                return CHECK_REGISTRATION;
            case 9:
                return CONVERSATION_ID_RECEIVED;
            case 10:
                return WEBVIEW_LOADING_RES_JS_BUNDLE;
            case 11:
                return WEBVIEW_LOADING_RES_INDEX_PAGE;
            case 12:
                return WEB_APP_LOADED_JS_STARTED;
            case 13:
                return WEB_APP_UI_DISPLAYED_ALL_DONE;
            case 14:
                return ATTEMPT_PARSE_ARGS_IN_UI_PROCESS;
            case 15:
                return PARSE_ARGS_IN_UI_PROCESS_SUCCESS;
            case 16:
                return REGISTERED_BROADCAST_RECEIVERS;
            case 17:
                return BIND_WITH_MESSAGING_SERVICE;
            case 18:
                return ADD_JS_INTERFACES;
            case 19:
                return ON_RESUME_WEB_APP_FRAGMENT;
            case 20:
                return ACCOUNT_CONTEXT_RECEIVED;
            case 21:
                return PREBUNDLE_INTERCEPT_HTML;
            case 22:
                return PREBUNDLE_INTERCEPT_JS;
            case 23:
                return PREBUNDLE_INTERCEPT_LOCALE_AGNOSTIC_JS;
            case 24:
                return PREBUNDLE_INTERCEPT_LOCALE_DATA_JS;
            case 25:
                return PREBUNDLE_INTERCEPT_LOCALE_AGNOSTIC_HTML;
            case 26:
                return PREBUNDLE_INTERCEPT_CSS;
            case 27:
                return SKIP_PREBUNDLE_UNSUPPORTED_LOCALE;
            case 28:
                return FAILED_TO_LOAD_PREBUNDLED_ASSET;
            case 29:
                return INITIATE_LIGHTER_INSTANCE;
            case 30:
                return HAS_UPGRADED_TO_LIGHTER;
            case 31:
                return ON_USER_LEAVE_HINT;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m111435b() {
        return bopv.f134182a;
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f134217H;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
