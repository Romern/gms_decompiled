package p000;

import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: bzvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bzvp implements bxvr {

    /* renamed from: a */
    static final bxvr f171539a = new bzvp();

    private bzvp() {
    }

    /* renamed from: a */
    public final boolean mo3213a(int i) {
        if (i == 200 || i == 201 || i == 600 || i == 601) {
            return true;
        }
        switch (i) {
            case 1:
            case 400:
            case 500:
            case 700:
            case 800:
            case 900:
            case 1000:
            case 1101:
            case 1200:
            case 1700:
            case 1800:
            case 1902:
            case 2000:
                return true;
            default:
                switch (i) {
                    case 100:
                    case 101:
                    case 102:
                    case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                    case ErrorInfo.TYPE_SDU_FAILED:
                        return true;
                    default:
                        switch (i) {
                            case 300:
                            case ErrorInfo.TYPE_FSC_HTTP_ERROR:
                            case 302:
                            case 303:
                            case 304:
                            case 305:
                            case 306:
                                return true;
                            default:
                                switch (i) {
                                    case 1300:
                                    case 1301:
                                    case 1302:
                                        return true;
                                    default:
                                        switch (i) {
                                            case 1600:
                                            case 1601:
                                            case 1602:
                                                return true;
                                            default:
                                                return false;
                                        }
                                }
                        }
                }
        }
    }
}
