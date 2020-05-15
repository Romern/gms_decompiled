package p000;

import com.felicanetworks.mfc.FelicaException;

/* renamed from: btup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class btup implements bxvr {

    /* renamed from: a */
    static final bxvr f150513a = new btup();

    private btup() {
    }

    /* renamed from: a */
    public final boolean mo3213a(int i) {
        if (i == 20 || i == 21) {
            return true;
        }
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            default:
                switch (i) {
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                        return true;
                    default:
                        switch (i) {
                            case FelicaException.TYPE_MFC_NOT_FOUND:
                            case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                            case 62:
                            case 63:
                            case 64:
                                return true;
                            default:
                                return false;
                        }
                }
        }
    }
}
