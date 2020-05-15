package p000;

import com.felicanetworks.sdu.ErrorInfo;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: bqab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqab {
    /* renamed from: a */
    public static int m112459a(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 200) {
            return 202;
        }
        switch (i) {
            case 100:
                return 102;
            case 101:
                return ErrorInfo.TYPE_SDU_COMMUNICATIONERROR;
            case 102:
                return ErrorInfo.TYPE_SDU_FAILED;
            case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                return ErrorInfo.TYPE_SDU_MEMORY_FULL;
            case ErrorInfo.TYPE_SDU_FAILED:
                return 106;
            case ErrorInfo.TYPE_SDU_MEMORY_FULL:
                return 107;
            case 106:
                return 108;
            case 107:
                return 109;
            case 108:
                return 110;
            case 109:
                return 111;
            case 110:
                return AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
            case 111:
                return 113;
            default:
                switch (i) {
                    case 300:
                        return 302;
                    case ErrorInfo.TYPE_FSC_HTTP_ERROR:
                        return 303;
                    case 302:
                        return 304;
                    case 303:
                        return 305;
                    case 304:
                        return 306;
                    case 305:
                        return 307;
                    case 306:
                        return 308;
                    case 307:
                        return 309;
                    case 308:
                        return 310;
                    case 309:
                        return 311;
                    case 310:
                        return 312;
                    case 311:
                        return 313;
                    case 312:
                        return 314;
                    case 313:
                        return 315;
                    case 314:
                        return 316;
                    case 315:
                        return 317;
                    case 316:
                        return 318;
                    case 317:
                        return 319;
                    default:
                        switch (i) {
                            case 1000:
                                return 1002;
                            case 1001:
                                return 1003;
                            case 1002:
                                return 1004;
                            case 1003:
                                return 1005;
                            case 1004:
                                return 1006;
                            case 1005:
                                return 1007;
                            case 1006:
                                return 1008;
                            case 1007:
                                return 1009;
                            case 1008:
                                return 1010;
                            case 1009:
                                return 1011;
                            case 1010:
                                return 1012;
                            default:
                                return 0;
                        }
                }
        }
    }
}
