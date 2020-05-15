package p000;

import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: kwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kwt {
    /* renamed from: a */
    public static /* synthetic */ String m18677a(int i) {
        if (i == 22) {
            return "SCAN_PAYMENT_CARD";
        }
        if (i == 23) {
            return "FIX_PAYMENT_CARD";
        }
        if (i == 32) {
            return "SMS_OTP";
        }
        if (i == 503) {
            return "ALERT_DIALOG_DISPLAY";
        }
        if (i == 1003) {
            return "UPDATE_CREDENTIAL";
        }
        if (i == 10002) {
            return "NOOP";
        }
        switch (i) {
            case 1:
                return "UNRECOGNIZED";
            case 2:
                return "UNKNOWN";
            case 3:
                return "NO_REFERRER";
            case 4:
                return "FILL_PASSWORD";
            case 5:
                return "FILL_PASSWORD_MANUAL";
            case 6:
                return "FILL_PASSWORD_WARNING";
            case 7:
                return "FILL_PAYMENT_CARD";
            case 8:
                return "AUTH_AND_FILL";
            case 9:
                return "KEYBOARD_PAYMENT_CARD_FILL";
            case 10:
                return "KEYBOARD_CREDENTIAL_FILL";
            default:
                switch (i) {
                    case 12:
                        return "SETUP";
                    case 13:
                        return "SETUP_AND_FILL";
                    case 14:
                        return "SETUP_AND_SAVE";
                    case 15:
                        return "SETUP_AND_FILL_REVISED";
                    case 16:
                        return "SETUP_AND_SAVE_REVISED";
                    default:
                        switch (i) {
                            case 102:
                                return "SETTINGS";
                            case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                                return "SETTINGS_PASSWORD";
                            case ErrorInfo.TYPE_SDU_FAILED:
                                return "SETTINGS_POSTAL_ADDRESS";
                            case ErrorInfo.TYPE_SDU_MEMORY_FULL:
                                return "SETTINGS_BIOMETRICS";
                            default:
                                switch (i) {
                                    case 202:
                                        return "DEBUG_SETTINGS";
                                    case 203:
                                        return "DEBUG_INFO";
                                    case 204:
                                        return "DEBUG_INSTRUMENTATION_FILE_LIST";
                                    case 205:
                                        return "DEBUG_PHENOTYPE_FLAG_MANAGER";
                                    default:
                                        return "null";
                                }
                        }
                }
        }
    }
}
