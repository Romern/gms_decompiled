package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: byuh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class byuh implements bxvr {

    /* renamed from: a */
    static final bxvr f168293a = new byuh();

    private byuh() {
    }

    /* renamed from: a */
    public final boolean mo3213a(int i) {
        if (i == 100) {
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
                return true;
            default:
                switch (i) {
                    case BaseMfiEventCallback.TYPE_UNKNOWN_ERROR:
                    case ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR:
                    case 202:
                    case 203:
                        return true;
                    default:
                        return false;
                }
        }
    }
}
