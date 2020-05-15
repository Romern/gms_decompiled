package p000;

import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: xaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum xaj implements bxvp {
    UNDEFINED_DO_NOT_USE(0),
    TYPE_INVOCATION_SCREEN_ON_SCAN(1),
    TYPE_INVOCATION_ZERO_PARTY_API(2),
    TYPE_CABLE_SCAN_STARTED(10),
    TYPE_CABLE_SCAN_ERROR_BLUETOOTH_DISABLED(11),
    TYPE_CABLE_SCAN_ERROR_BLE_SCANNING_UNSUPPORTED(12),
    TYPE_CABLE_CLIENT_EID_RESOLVED(20),
    TYPE_CABLE_CLIENT_EID_INVALID(21),
    TYPE_CABLE_ADVERTISEMENT_STARTED(30),
    TYPE_CABLE_ADVERTISEMENT_ERROR_BLE_ADVERTISING_UNSUPPORTED(31),
    TYPE_CABLE_ADVERTISEMENT_ERROR_AUTHENTICATOR_EID_INVALID(32),
    TYPE_CABLE_CLIENT_CONNECTED(40),
    TYPE_CABLE_CLIENT_HANDSHAKE_RECEIVED(41),
    TYPE_CABLE_CLIENT_HANDSHAKE_CLIENT_MAC_VALIDATED(42),
    TYPE_CABLE_CLIENT_HANDSHAKE_SENT(43),
    TYPE_CABLE_CLIENT_CONNECTION_TERMINATED_INVALID_CLIENT_MAC(44),
    TYPE_CABLE_CLIENT_CONNECTION_TERMINATED_INVALID_CLIENT_ENCRYPTION(45),
    TYPE_CABLE_CLIENT_CONNECTION_TERMINATED_CLIENT_DISCONNECTED(46),
    TYPE_CABLE_CLIENT_CONNECTION_TERMINATED_NOTIFICATION_UNREGISTERED(47),
    TYPE_CABLE_CLIENT_CONNECTION_TERMINATED_GATT_SERVER_CLOSED(48),
    TYPE_USER_SHOWN_NOTIFICATION(70),
    TYPE_USER_UNLOCKS_SCREEN(71),
    TYPE_USER_SHOWN_APPROVAL_PROMPT(72),
    TYPE_USER_DISMISSES_PROMPT(73),
    TYPE_USER_APPROVES_AUTHENTICATION(74),
    TYPE_USER_SHOWN_AUTHENTICATION_SUCCEEDED_VIEW(75),
    TYPE_USER_SHOWN_AUTHENTICATION_FAILED_VIEW(76),
    TYPE_USER_DENIES_AUTHENTICATION(77),
    TYPE_USER_SHOWN_AUTHENTICATION_DENIED_VIEW(78),
    TYPE_USER_VISITS_ACCOUNT_SETTINGS(79),
    TYPE_USER_SHOWN_NO_NEARBY_DEVICE_VIEW(80),
    TYPE_CABLE_CTAP_REQUEST_RECEIVED(100),
    TYPE_CABLE_CTAP_RESPONSE_SENT(101),
    TYPE_TIMEOUT_BLE_SCAN_DURATION_EXCEEDED(120),
    TYPE_TIMEOUT_BLE_ADVERTISEMENT_DURATION_EXCEEDED(121),
    TYPE_TIMEOUT_USER_INTERACTION_DURATION_EXCEEDED(122),
    TYPE_TIMEOUT_CLIENT_CONNECTION_DURATION_EXCEEDED(123);
    

    /* renamed from: L */
    public final int f51784L;

    private xaj(int i) {
        this.f51784L = i;
    }

    /* renamed from: a */
    public static xaj m42561a(int i) {
        if (i == 0) {
            return UNDEFINED_DO_NOT_USE;
        }
        if (i == 1) {
            return TYPE_INVOCATION_SCREEN_ON_SCAN;
        }
        if (i == 2) {
            return TYPE_INVOCATION_ZERO_PARTY_API;
        }
        if (i == 20) {
            return TYPE_CABLE_CLIENT_EID_RESOLVED;
        }
        if (i == 21) {
            return TYPE_CABLE_CLIENT_EID_INVALID;
        }
        if (i == 100) {
            return TYPE_CABLE_CTAP_REQUEST_RECEIVED;
        }
        if (i == 101) {
            return TYPE_CABLE_CTAP_RESPONSE_SENT;
        }
        switch (i) {
            case 10:
                return TYPE_CABLE_SCAN_STARTED;
            case 11:
                return TYPE_CABLE_SCAN_ERROR_BLUETOOTH_DISABLED;
            case 12:
                return TYPE_CABLE_SCAN_ERROR_BLE_SCANNING_UNSUPPORTED;
            default:
                switch (i) {
                    case 30:
                        return TYPE_CABLE_ADVERTISEMENT_STARTED;
                    case 31:
                        return TYPE_CABLE_ADVERTISEMENT_ERROR_BLE_ADVERTISING_UNSUPPORTED;
                    case 32:
                        return TYPE_CABLE_ADVERTISEMENT_ERROR_AUTHENTICATOR_EID_INVALID;
                    default:
                        switch (i) {
                            case FelicaException.TYPE_PUSH_FAILED:
                                return TYPE_CABLE_CLIENT_CONNECTED;
                            case 41:
                                return TYPE_CABLE_CLIENT_HANDSHAKE_RECEIVED;
                            case FelicaException.TYPE_ALREADY_ACTIVATED:
                                return TYPE_CABLE_CLIENT_HANDSHAKE_CLIENT_MAC_VALIDATED;
                            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                                return TYPE_CABLE_CLIENT_HANDSHAKE_SENT;
                            case FelicaException.TYPE_RESET_FAILED:
                                return TYPE_CABLE_CLIENT_CONNECTION_TERMINATED_INVALID_CLIENT_MAC;
                            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                                return TYPE_CABLE_CLIENT_CONNECTION_TERMINATED_INVALID_CLIENT_ENCRYPTION;
                            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                                return TYPE_CABLE_CLIENT_CONNECTION_TERMINATED_CLIENT_DISCONNECTED;
                            case 47:
                                return TYPE_CABLE_CLIENT_CONNECTION_TERMINATED_NOTIFICATION_UNREGISTERED;
                            case 48:
                                return TYPE_CABLE_CLIENT_CONNECTION_TERMINATED_GATT_SERVER_CLOSED;
                            default:
                                switch (i) {
                                    case 70:
                                        return TYPE_USER_SHOWN_NOTIFICATION;
                                    case 71:
                                        return TYPE_USER_UNLOCKS_SCREEN;
                                    case 72:
                                        return TYPE_USER_SHOWN_APPROVAL_PROMPT;
                                    case 73:
                                        return TYPE_USER_DISMISSES_PROMPT;
                                    case 74:
                                        return TYPE_USER_APPROVES_AUTHENTICATION;
                                    case 75:
                                        return TYPE_USER_SHOWN_AUTHENTICATION_SUCCEEDED_VIEW;
                                    case 76:
                                        return TYPE_USER_SHOWN_AUTHENTICATION_FAILED_VIEW;
                                    case 77:
                                        return TYPE_USER_DENIES_AUTHENTICATION;
                                    case 78:
                                        return TYPE_USER_SHOWN_AUTHENTICATION_DENIED_VIEW;
                                    case KeyInformation.AES128:
                                        return TYPE_USER_VISITS_ACCOUNT_SETTINGS;
                                    case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_LONG_MESSAGE /*80*/:
                                        return TYPE_USER_SHOWN_NO_NEARBY_DEVICE_VIEW;
                                    default:
                                        switch (i) {
                                            case 120:
                                                return TYPE_TIMEOUT_BLE_SCAN_DURATION_EXCEEDED;
                                            case 121:
                                                return TYPE_TIMEOUT_BLE_ADVERTISEMENT_DURATION_EXCEEDED;
                                            case 122:
                                                return TYPE_TIMEOUT_USER_INTERACTION_DURATION_EXCEEDED;
                                            case 123:
                                                return TYPE_TIMEOUT_CLIENT_CONNECTION_DURATION_EXCEEDED;
                                            default:
                                                return null;
                                        }
                                }
                        }
                }
        }
    }

    /* renamed from: b */
    public static bxvr m42562b() {
        return xai.f51745a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f51784L;
    }

    public final String toString() {
        return Integer.toString(this.f51784L);
    }
}
