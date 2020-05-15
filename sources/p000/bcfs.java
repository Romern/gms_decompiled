package p000;

import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: bcfs */
final /* synthetic */ class bcfs implements C1228nu {

    /* renamed from: a */
    private final bxvd f104087a;

    public bcfs(bxvd bxvd) {
        this.f104087a = bxvd;
    }

    /* renamed from: a */
    public final void mo9443a(Object obj) {
        int i;
        bxvd bxvd = this.f104087a;
        int intValue = ((Integer) obj).intValue();
        if (intValue == 201) {
            i = 203;
        } else if (intValue == 202) {
            i = 204;
        } else if (intValue == 301) {
            i = 303;
        } else if (intValue != 371) {
            switch (intValue) {
                case 0:
                    i = 2;
                    break;
                case 1:
                    i = 3;
                    break;
                case 2:
                    i = 4;
                    break;
                case 3:
                    i = 5;
                    break;
                case 4:
                    i = 6;
                    break;
                case 5:
                    i = 7;
                    break;
                case 6:
                    i = 8;
                    break;
                case 7:
                    i = 9;
                    break;
                case 8:
                    i = 10;
                    break;
                case 9:
                    i = 11;
                    break;
                case 10:
                    i = 12;
                    break;
                default:
                    switch (intValue) {
                        case 51:
                            i = 53;
                            break;
                        case 52:
                            i = 54;
                            break;
                        case 53:
                            i = 55;
                            break;
                        case 54:
                            i = 56;
                            break;
                        case 55:
                            i = 57;
                            break;
                        case FelicaException.TYPE_ACTIVATE_FAILED:
                            i = 58;
                            break;
                        case 57:
                            i = 59;
                            break;
                        case FelicaException.TYPE_OFFLINE_CANCELED:
                            i = 60;
                            break;
                        case FelicaException.TYPE_NOW_EXECUTING_FALP:
                            i = 61;
                            break;
                        case FelicaException.TYPE_MFC_NOT_FOUND:
                            i = 62;
                            break;
                        case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                            i = 63;
                            break;
                        case 62:
                            i = 64;
                            break;
                        case 63:
                            i = 65;
                            break;
                        case 64:
                            i = 66;
                            break;
                        case KeyInformation.AES128_DES56:
                            i = 67;
                            break;
                        case 66:
                            i = 68;
                            break;
                        case KeyInformation.AES128_DES112:
                            i = 69;
                            break;
                        default:
                            switch (intValue) {
                                case 101:
                                    i = ErrorInfo.TYPE_SDU_COMMUNICATIONERROR;
                                    break;
                                case 102:
                                    i = ErrorInfo.TYPE_SDU_FAILED;
                                    break;
                                case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                                    i = ErrorInfo.TYPE_SDU_MEMORY_FULL;
                                    break;
                                case ErrorInfo.TYPE_SDU_FAILED:
                                    i = 106;
                                    break;
                                case ErrorInfo.TYPE_SDU_MEMORY_FULL:
                                    i = 107;
                                    break;
                                case 106:
                                    i = 108;
                                    break;
                                case 107:
                                    i = 109;
                                    break;
                                case 108:
                                    i = 110;
                                    break;
                                case 109:
                                    i = 111;
                                    break;
                                case 110:
                                    i = AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
                                    break;
                                case 111:
                                    i = 113;
                                    break;
                                case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS /*112*/:
                                    i = 114;
                                    break;
                                case 113:
                                    i = 115;
                                    break;
                                case 114:
                                    i = 116;
                                    break;
                                case 115:
                                    i = 117;
                                    break;
                                case 116:
                                    i = 118;
                                    break;
                                default:
                                    switch (intValue) {
                                        case 131:
                                            i = 133;
                                            break;
                                        case 132:
                                            i = 134;
                                            break;
                                        case 133:
                                            i = 135;
                                            break;
                                        case 134:
                                            i = 136;
                                            break;
                                        case 135:
                                            i = 137;
                                            break;
                                        case 136:
                                            i = 138;
                                            break;
                                        case 137:
                                            i = 139;
                                            break;
                                        case 138:
                                            i = 140;
                                            break;
                                        case 139:
                                            i = 141;
                                            break;
                                        case 140:
                                            i = 142;
                                            break;
                                        default:
                                            switch (intValue) {
                                                case MfiClientException.TYPE_MFICLIENT_NOT_FOUND:
                                                    i = MfiClientException.TYPE_MFICLIENT_STARTED;
                                                    break;
                                                case MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED:
                                                    i = MfiClientException.TYPE_MFICLIENT_NOT_STARTED;
                                                    break;
                                                case MfiClientException.TYPE_MFICLIENT_STARTED:
                                                    i = MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA;
                                                    break;
                                                case MfiClientException.TYPE_MFICLIENT_NOT_STARTED:
                                                    i = MfiClientException.TYPE_NO_ACCOUNT_INFO;
                                                    break;
                                                case MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA:
                                                    i = MfiClientException.TYPE_CARD_NOT_CACHED;
                                                    break;
                                                case MfiClientException.TYPE_NO_ACCOUNT_INFO:
                                                    i = MfiClientException.TYPE_ILLEGAL_CARD_OPERATION;
                                                    break;
                                                default:
                                                    switch (intValue) {
                                                        case 221:
                                                            i = 223;
                                                            break;
                                                        case 222:
                                                            i = AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD;
                                                            break;
                                                        case 223:
                                                            i = 225;
                                                            break;
                                                        case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD /*224*/:
                                                            i = 226;
                                                            break;
                                                        case 225:
                                                            i = 227;
                                                            break;
                                                        case 226:
                                                            i = 228;
                                                            break;
                                                        case 227:
                                                            i = 229;
                                                            break;
                                                        case 228:
                                                            i = 230;
                                                            break;
                                                        default:
                                                            switch (intValue) {
                                                                case 341:
                                                                    i = 343;
                                                                    break;
                                                                case 342:
                                                                    i = 344;
                                                                    break;
                                                                case 343:
                                                                    i = 345;
                                                                    break;
                                                                case 344:
                                                                    i = 346;
                                                                    break;
                                                                case 345:
                                                                    i = 347;
                                                                    break;
                                                                case 346:
                                                                    i = 348;
                                                                    break;
                                                                case 347:
                                                                    i = 349;
                                                                    break;
                                                                case 348:
                                                                    i = 350;
                                                                    break;
                                                                default:
                                                                    i = 0;
                                                                    break;
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else {
            i = 373;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bqhp bqhp = (bqhp) bxvd.f164949b;
        bqhp bqhp2 = bqhp.f140683q;
        if (i != 1) {
            bqhp.f140691g = i - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
