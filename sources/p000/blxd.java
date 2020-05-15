package p000;

import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: blxd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blxd {
    /* renamed from: a */
    public static int m107743a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (i == 5) {
            return 6;
        }
        if (i == 6) {
            return 7;
        }
        if (i == 25) {
            return 26;
        }
        if (i == 26) {
            return 27;
        }
        if (i == 34) {
            return 35;
        }
        if (i == 35) {
            return 36;
        }
        if (i == 47) {
            return 48;
        }
        if (i == 48) {
            return 49;
        }
        if (i == 62) {
            return 63;
        }
        if (i == 63) {
            return 64;
        }
        switch (i) {
            case 6:
                return 7;
            case 21:
                return 22;
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                return 46;
            case 98:
                return 99;
            case 102:
                return ErrorInfo.TYPE_SDU_COMMUNICATIONERROR;
            case 109:
                return 110;
            case 149:
                return MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED;
            case MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED:
                return MfiClientException.TYPE_MFICLIENT_NOT_FOUND;
            case MfiClientException.TYPE_MFICLIENT_NOT_FOUND:
                return MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED;
            case MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED:
                return MfiClientException.TYPE_MFICLIENT_STARTED;
            case MfiClientException.TYPE_MFICLIENT_STARTED:
                return MfiClientException.TYPE_MFICLIENT_NOT_STARTED;
            case MfiClientException.TYPE_MFICLIENT_NOT_STARTED:
                return MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA;
            case MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA:
                return MfiClientException.TYPE_NO_ACCOUNT_INFO;
            case MfiClientException.TYPE_NO_ACCOUNT_INFO:
                return MfiClientException.TYPE_CARD_NOT_CACHED;
            case MfiClientException.TYPE_CARD_NOT_CACHED:
                return MfiClientException.TYPE_ILLEGAL_CARD_OPERATION;
            case 164:
                return 165;
            case 182:
                return 183;
            case 189:
                return 190;
            case 190:
                return 191;
            case 191:
                return AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC;
            case BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE:
                return BaseMfiEventCallback.TYPE_INTERRUPTED_ERROR;
            case 287:
                return 288;
            case 296:
                return 297;
            case 305:
                return 306;
            case 311:
                return 312;
            case 316:
                return 317;
            case 326:
                return 327;
            case 328:
                return 329;
            case 329:
                return 330;
            case 330:
                return 331;
            case 331:
                return 332;
            case 332:
                return 333;
            case 333:
                return 334;
            case 337:
                return 338;
            case 339:
                return 340;
            case 342:
                return 343;
            case 343:
                return 344;
            case 344:
                return 345;
            case 345:
                return 346;
            case 348:
                return 349;
            default:
                switch (i) {
                    case 13:
                        return 14;
                    case 14:
                        return 15;
                    case 15:
                        return 16;
                    default:
                        switch (i) {
                            case ErrorInfo.TYPE_SDU_FAILED:
                                return ErrorInfo.TYPE_SDU_MEMORY_FULL;
                            case ErrorInfo.TYPE_SDU_MEMORY_FULL:
                                return 106;
                            case 106:
                                return 107;
                            default:
                                switch (i) {
                                    case 111:
                                        return AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
                                    case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS /*112*/:
                                        return 113;
                                    case 113:
                                        return 114;
                                    case 114:
                                        return 115;
                                    case 115:
                                        return 116;
                                    default:
                                        switch (i) {
                                            case 118:
                                                return 119;
                                            case 119:
                                                return 120;
                                            case 120:
                                                return 121;
                                            default:
                                                switch (i) {
                                                    case 125:
                                                        return 126;
                                                    case 126:
                                                        return 127;
                                                    case 127:
                                                        return 128;
                                                    case 128:
                                                        return 129;
                                                    default:
                                                        return 0;
                                                }
                                        }
                                }
                        }
                }
        }
    }
}
