package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: xag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum xag implements bxvp {
    TYPE_RESERVED_DO_NOT_USE(0),
    TYPE_APPID_VALIDATED_ALLOW(1),
    TYPE_APPID_VALIDATED_DENY(2),
    TYPE_APPID_VALIDATION_FAILED(3),
    TYPE_SERVER_SET_TIMEOUT_REACHED(50),
    TYPE_NFC_ADAPTER_PROGRAMMATICALLY_ENABLED(100),
    TYPE_NFC_ADAPTER_PROGRAMMATICALLY_DISABLED(101),
    TYPE_NFC_U2F_TAG_DISCOVERED(102),
    TYPE_NFC_NON_U2F_TAG_DISCOVERED(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR),
    TYPE_NFC_TAG_LOST(ErrorInfo.TYPE_SDU_FAILED),
    TYPE_NFC_REORDER_HANDLES(ErrorInfo.TYPE_SDU_MEMORY_FULL),
    TYPE_NFC_APPLET_SELECT_FAILED(106),
    TYPE_BLUETOOTH_PROGRAMMATICALLY_ADAPTER_ENABLED(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR),
    TYPE_BLUETOOTH_PROGRAMMATICALLY_ADAPTER_DISABLED(ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR),
    TYPE_BLUETOOTH_BONDED_U2F_DEVICE_FOUND(202),
    TYPE_BLUETOOTH_UNBONDED_U2F_DEVICE_FOUND(203),
    TYPE_BLUETOOTH_USER_REQUESTS_PAIRING(204),
    TYPE_BLUETOOTH_PAIRING_SUCCESS(205),
    TYPE_BLUETOOTH_PAIRING_FAILURE(BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR),
    TYPE_BLUETOOTH_USER_REQUESTS_RETRY_PAIRING(BaseMfiEventCallback.TYPE_EXPIRED_MFI),
    TYPE_BLUETOOTH_START_AUTHENTICATION(208),
    TYPE_BLUETOOTH_CONNECTION_FAILED(BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA),
    TYPE_BLUETOOTH_CONNECTION_SUCCEEDED(BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA),
    TYPE_BLUETOOTH_TUP_NEEDED(BaseMfiEventCallback.TYPE_CARD_NOT_ACTIVE),
    TYPE_BLUETOOTH_APPLET_SELECT_FAILED(BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD),
    TYPE_FINGERPRINT_PENDING(300),
    TYPE_FINGERPRINT_RECOGNIZED(ErrorInfo.TYPE_FSC_HTTP_ERROR),
    TYPE_FINGERPRINT_NOT_RECOGNIZED(302),
    TYPE_FINGERPRINT_MOVED_TOO_FAST(303),
    TYPE_SCREEN_LOCK_SELECTED(400),
    TYPE_SCREEN_LOCK_RECOGNIZED(ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE),
    TYPE_SCREEN_LOCK_NOT_RECOGNIZED(ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED),
    TYPE_USB_APPLET_SELECT_FAILED(500);
    

    /* renamed from: H */
    public final int f51740H;

    private xag(int i) {
        this.f51740H = i;
    }

    /* renamed from: a */
    public static xag m42556a(int i) {
        if (i == 0) {
            return TYPE_RESERVED_DO_NOT_USE;
        }
        if (i == 1) {
            return TYPE_APPID_VALIDATED_ALLOW;
        }
        if (i == 2) {
            return TYPE_APPID_VALIDATED_DENY;
        }
        if (i == 3) {
            return TYPE_APPID_VALIDATION_FAILED;
        }
        if (i == 50) {
            return TYPE_SERVER_SET_TIMEOUT_REACHED;
        }
        if (i == 500) {
            return TYPE_USB_APPLET_SELECT_FAILED;
        }
        switch (i) {
            case 100:
                return TYPE_NFC_ADAPTER_PROGRAMMATICALLY_ENABLED;
            case 101:
                return TYPE_NFC_ADAPTER_PROGRAMMATICALLY_DISABLED;
            case 102:
                return TYPE_NFC_U2F_TAG_DISCOVERED;
            case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                return TYPE_NFC_NON_U2F_TAG_DISCOVERED;
            case ErrorInfo.TYPE_SDU_FAILED:
                return TYPE_NFC_TAG_LOST;
            case ErrorInfo.TYPE_SDU_MEMORY_FULL:
                return TYPE_NFC_REORDER_HANDLES;
            case 106:
                return TYPE_NFC_APPLET_SELECT_FAILED;
            default:
                switch (i) {
                    case BaseMfiEventCallback.TYPE_UNKNOWN_ERROR:
                        return TYPE_BLUETOOTH_PROGRAMMATICALLY_ADAPTER_ENABLED;
                    case ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR:
                        return TYPE_BLUETOOTH_PROGRAMMATICALLY_ADAPTER_DISABLED;
                    case 202:
                        return TYPE_BLUETOOTH_BONDED_U2F_DEVICE_FOUND;
                    case 203:
                        return TYPE_BLUETOOTH_UNBONDED_U2F_DEVICE_FOUND;
                    case 204:
                        return TYPE_BLUETOOTH_USER_REQUESTS_PAIRING;
                    case 205:
                        return TYPE_BLUETOOTH_PAIRING_SUCCESS;
                    case BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR:
                        return TYPE_BLUETOOTH_PAIRING_FAILURE;
                    case BaseMfiEventCallback.TYPE_EXPIRED_MFI:
                        return TYPE_BLUETOOTH_USER_REQUESTS_RETRY_PAIRING;
                    case 208:
                        return TYPE_BLUETOOTH_START_AUTHENTICATION;
                    case BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA:
                        return TYPE_BLUETOOTH_CONNECTION_FAILED;
                    case BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA:
                        return TYPE_BLUETOOTH_CONNECTION_SUCCEEDED;
                    case BaseMfiEventCallback.TYPE_CARD_NOT_ACTIVE:
                        return TYPE_BLUETOOTH_TUP_NEEDED;
                    case BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD:
                        return TYPE_BLUETOOTH_APPLET_SELECT_FAILED;
                    default:
                        switch (i) {
                            case 300:
                                return TYPE_FINGERPRINT_PENDING;
                            case ErrorInfo.TYPE_FSC_HTTP_ERROR:
                                return TYPE_FINGERPRINT_RECOGNIZED;
                            case 302:
                                return TYPE_FINGERPRINT_NOT_RECOGNIZED;
                            case 303:
                                return TYPE_FINGERPRINT_MOVED_TOO_FAST;
                            default:
                                switch (i) {
                                    case 400:
                                        return TYPE_SCREEN_LOCK_SELECTED;
                                    case ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE:
                                        return TYPE_SCREEN_LOCK_RECOGNIZED;
                                    case ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED:
                                        return TYPE_SCREEN_LOCK_NOT_RECOGNIZED;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    /* renamed from: b */
    public static bxvr m42557b() {
        return xaf.f51705a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f51740H;
    }

    public final String toString() {
        return Integer.toString(this.f51740H);
    }
}
