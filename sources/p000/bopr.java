package p000;

import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: bopr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bopr {
    /* renamed from: a */
    public static int m111427a(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: b */
    public static int m111428b(int i) {
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
            case 31:
                return 33;
            case 32:
                return 34;
            case 33:
                return 35;
            case 34:
                return 36;
            case 35:
                return 37;
            case 36:
                return 38;
            case FelicaException.TYPE_NOT_CLOSED:
                return 39;
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                return 40;
            case FelicaException.TYPE_USED_BY_OTHER_APP:
                return 41;
            case FelicaException.TYPE_PUSH_FAILED:
                return 42;
            case 41:
                return 43;
            case FelicaException.TYPE_ALREADY_ACTIVATED:
                return 44;
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                return 45;
            case FelicaException.TYPE_RESET_FAILED:
                return 46;
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                return 47;
            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                return 48;
            case 47:
                return 49;
            case 48:
                return 50;
            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                return 51;
            case 50:
                return 52;
            case 51:
                return 53;
            case 52:
                return 54;
            case 53:
                return 55;
            case 54:
                return 56;
            case 55:
                return 57;
            case FelicaException.TYPE_ACTIVATE_FAILED:
                return 58;
            case 57:
                return 59;
            case FelicaException.TYPE_OFFLINE_CANCELED:
                return 60;
            case FelicaException.TYPE_NOW_EXECUTING_FALP:
                return 61;
            case FelicaException.TYPE_MFC_NOT_FOUND:
                return 62;
            case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                return 63;
            case 62:
                return 64;
            case 63:
                return 65;
            case 64:
                return 66;
            case KeyInformation.AES128_DES56:
                return 67;
            case 66:
                return 68;
            case KeyInformation.AES128_DES112:
                return 69;
            case 68:
                return 70;
            case 69:
                return 71;
            case 70:
                return 72;
            case 71:
                return 73;
            case 72:
                return 74;
            case 73:
                return 75;
            case 74:
                return 76;
            case 75:
                return 77;
            case 76:
                return 78;
            case 77:
            default:
                return 0;
            case 78:
                return 80;
            case KeyInformation.AES128:
                return 81;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_LONG_MESSAGE /*80*/:
                return 82;
        }
    }
}
