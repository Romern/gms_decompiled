package p000;

import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: bcfr */
final /* synthetic */ class bcfr implements C1228nu {

    /* renamed from: a */
    private final bxvd f104086a;

    public bcfr(bxvd bxvd) {
        this.f104086a = bxvd;
    }

    /* renamed from: a */
    public final void mo9443a(Object obj) {
        int i;
        bxvd bxvd = this.f104086a;
        switch (((Integer) obj).intValue()) {
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
            case 11:
                i = 13;
                break;
            case 12:
                i = 14;
                break;
            case 13:
                i = 15;
                break;
            case 14:
                i = 16;
                break;
            case 15:
                i = 17;
                break;
            case 16:
                i = 18;
                break;
            case 17:
                i = 19;
                break;
            case 18:
                i = 20;
                break;
            case 19:
                i = 21;
                break;
            case 20:
                i = 22;
                break;
            case 21:
                i = 23;
                break;
            case 22:
                i = 24;
                break;
            case 23:
                i = 25;
                break;
            case 24:
                i = 26;
                break;
            case 25:
                i = 27;
                break;
            case 26:
                i = 28;
                break;
            case 27:
                i = 29;
                break;
            case 28:
                i = 30;
                break;
            case 29:
                i = 31;
                break;
            case 30:
                i = 32;
                break;
            case 31:
                i = 33;
                break;
            case 32:
                i = 34;
                break;
            case 33:
                i = 35;
                break;
            case 34:
                i = 36;
                break;
            case 35:
                i = 37;
                break;
            case 36:
                i = 38;
                break;
            case FelicaException.TYPE_NOT_CLOSED:
                i = 39;
                break;
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                i = 40;
                break;
            case FelicaException.TYPE_USED_BY_OTHER_APP:
                i = 41;
                break;
            case FelicaException.TYPE_PUSH_FAILED:
                i = 42;
                break;
            case 41:
                i = 43;
                break;
            case FelicaException.TYPE_ALREADY_ACTIVATED:
                i = 44;
                break;
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                i = 45;
                break;
            case FelicaException.TYPE_RESET_FAILED:
                i = 46;
                break;
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                i = 47;
                break;
            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                i = 48;
                break;
            case 47:
                i = 49;
                break;
            case 48:
                i = 50;
                break;
            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
            case 50:
            case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
            default:
                i = 0;
                break;
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
            case 68:
                i = 70;
                break;
            case 69:
                i = 71;
                break;
            case 70:
                i = 72;
                break;
            case 71:
                i = 73;
                break;
            case 72:
                i = 74;
                break;
            case 73:
                i = 75;
                break;
            case 74:
                i = 76;
                break;
            case 75:
                i = 77;
                break;
            case 76:
                i = 78;
                break;
            case 77:
                i = 79;
                break;
            case 78:
                i = 80;
                break;
            case KeyInformation.AES128:
                i = 81;
                break;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_LONG_MESSAGE /*80*/:
                i = 82;
                break;
            case 81:
                i = 83;
                break;
            case 82:
                i = 84;
                break;
            case 83:
                i = 85;
                break;
            case 84:
                i = 86;
                break;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bqhp bqhp = (bqhp) bxvd.f164949b;
        bqhp bqhp2 = bqhp.f140683q;
        if (i != 1) {
            bqhp.f140689e = i - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
