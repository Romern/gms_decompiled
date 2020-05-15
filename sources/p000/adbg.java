package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: adbg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adbg implements bxvr {

    /* renamed from: a */
    public static final bxvr f61239a = new adbg();

    private adbg() {
    }

    /* renamed from: a */
    public final boolean mo3213a(int i) {
        if (!(i == 0 || i == 1)) {
            switch (i) {
                case 101:
                case 102:
                case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                case ErrorInfo.TYPE_SDU_FAILED:
                case ErrorInfo.TYPE_SDU_MEMORY_FULL:
                case 106:
                    break;
                default:
                    switch (i) {
                        case ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR:
                        case 202:
                        case 203:
                        case 204:
                        case 205:
                        case BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR:
                            break;
                        default:
                            switch (i) {
                                case ErrorInfo.TYPE_FSC_HTTP_ERROR:
                                case 302:
                                case 303:
                                case 304:
                                    break;
                                default:
                                    switch (i) {
                                        case ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE:
                                        case ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED:
                                        case 403:
                                        case 404:
                                            break;
                                        default:
                                            switch (i) {
                                                case 501:
                                                case 502:
                                                case 503:
                                                case 504:
                                                case 505:
                                                case 506:
                                                case 507:
                                                case 508:
                                                case 509:
                                                case 510:
                                                    break;
                                                default:
                                                    return false;
                                            }
                                    }
                            }
                    }
            }
        }
        return true;
    }
}
