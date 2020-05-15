package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: bodj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bodj implements bxvr {

    /* renamed from: a */
    static final bxvr f132701a = new bodj();

    private bodj() {
    }

    /* renamed from: a */
    public final boolean mo3213a(int i) {
        if (!(i == 0 || i == 1)) {
            switch (i) {
                case 100:
                case 101:
                case 102:
                case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                case ErrorInfo.TYPE_SDU_FAILED:
                case ErrorInfo.TYPE_SDU_MEMORY_FULL:
                    break;
                default:
                    switch (i) {
                        case BaseMfiEventCallback.TYPE_UNKNOWN_ERROR:
                        case ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR:
                        case 202:
                        case 203:
                        case 204:
                        case 205:
                            break;
                        default:
                            switch (i) {
                                case 300:
                                case ErrorInfo.TYPE_FSC_HTTP_ERROR:
                                case 302:
                                    break;
                                default:
                                    switch (i) {
                                        case 400:
                                        case ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE:
                                        case ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED:
                                        case 403:
                                            break;
                                        default:
                                            switch (i) {
                                                case 500:
                                                case 501:
                                                case 502:
                                                case 503:
                                                case 504:
                                                case 505:
                                                case 506:
                                                case 507:
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
