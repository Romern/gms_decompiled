package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: bxjn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxjn {
    /* renamed from: a */
    public static int m122776a(int i) {
        if (i == -1) {
            return 1;
        }
        if (i == 0) {
            return 2;
        }
        if (i == 301) {
            return 303;
        }
        switch (i) {
            case ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR:
                return 203;
            case 202:
                return 204;
            case 203:
                return 205;
            case 204:
                return BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR;
            case 205:
                return BaseMfiEventCallback.TYPE_EXPIRED_MFI;
            default:
                switch (i) {
                    case ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE:
                        return 403;
                    case ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED:
                        return 404;
                    case 403:
                        return 405;
                    default:
                        return 0;
                }
        }
    }
}
