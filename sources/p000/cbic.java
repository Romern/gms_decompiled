package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: cbic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbic {
    /* renamed from: a */
    public static int m127877a(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: b */
    public static int m127878b(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case 12:
                return 14;
            case 13:
                return 15;
            case 14:
                return 16;
            case 15:
                return 17;
            case 16:
                return 18;
            case 17:
                return 19;
            case 18:
                return 20;
            case 19:
                return 21;
            case 20:
                return 22;
            case 21:
                return 23;
            case 22:
                return 24;
            case 23:
                return 25;
            case 24:
                return 26;
            case 25:
                return 27;
            case 26:
                return 28;
            case 27:
                return 29;
            case 28:
                return 30;
            case 29:
                return 31;
            case 30:
                return 32;
            default:
                switch (i) {
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
                    default:
                        switch (i) {
                            case MfiClientException.TYPE_MFICLIENT_NOT_FOUND:
                                return MfiClientException.TYPE_MFICLIENT_STARTED;
                            case MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED:
                                return MfiClientException.TYPE_MFICLIENT_NOT_STARTED;
                            case MfiClientException.TYPE_MFICLIENT_STARTED:
                                return MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA;
                            case MfiClientException.TYPE_MFICLIENT_NOT_STARTED:
                                return MfiClientException.TYPE_NO_ACCOUNT_INFO;
                            case MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA:
                                return MfiClientException.TYPE_CARD_NOT_CACHED;
                            case MfiClientException.TYPE_NO_ACCOUNT_INFO:
                                return MfiClientException.TYPE_ILLEGAL_CARD_OPERATION;
                            case MfiClientException.TYPE_CARD_NOT_CACHED:
                                return MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE;
                            case MfiClientException.TYPE_ILLEGAL_CARD_OPERATION:
                                return 160;
                            case MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE:
                                return 161;
                            default:
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
                                    case BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR:
                                        return 208;
                                    case BaseMfiEventCallback.TYPE_EXPIRED_MFI:
                                        return BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA;
                                    case 208:
                                        return BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA;
                                    case BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA:
                                        return BaseMfiEventCallback.TYPE_CARD_NOT_ACTIVE;
                                    case BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA:
                                        return BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD;
                                    case BaseMfiEventCallback.TYPE_CARD_NOT_ACTIVE:
                                        return BaseMfiEventCallback.TYPE_ISSUE_LIMIT_EXCEEDED;
                                    case BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD:
                                        return BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE;
                                    case BaseMfiEventCallback.TYPE_ISSUE_LIMIT_EXCEEDED:
                                        return BaseMfiEventCallback.TYPE_INTERRUPTED_ERROR;
                                    case BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE:
                                        return BaseMfiEventCallback.TYPE_OPSRV_ACCOUNT_ERROR;
                                    case BaseMfiEventCallback.TYPE_INTERRUPTED_ERROR:
                                        return BaseMfiEventCallback.TYPE_OPSRV_RESULT_ERROR;
                                    default:
                                        switch (i) {
                                            case 251:
                                                return 253;
                                            case 252:
                                                return 254;
                                            case 253:
                                                return 255;
                                            case 254:
                                                return PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                            default:
                                                switch (i) {
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
                                                    default:
                                                        switch (i) {
                                                            case 421:
                                                                return 423;
                                                            case 422:
                                                                return 424;
                                                            case 423:
                                                                return 425;
                                                            default:
                                                                switch (i) {
                                                                    case 441:
                                                                        return 443;
                                                                    case 442:
                                                                        return 444;
                                                                    case 443:
                                                                        return 445;
                                                                    case 444:
                                                                        return 446;
                                                                    case 445:
                                                                        return 447;
                                                                    case 446:
                                                                        return 448;
                                                                    case 447:
                                                                        return 449;
                                                                    case 448:
                                                                        return 450;
                                                                    case 449:
                                                                        return 451;
                                                                    case 450:
                                                                        return 452;
                                                                    case 451:
                                                                        return 453;
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
    }
}
