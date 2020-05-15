package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: adbk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adbk implements bxvr {

    /* renamed from: a */
    public static final bxvr f61320a = new adbk();

    private adbk() {
    }

    /* renamed from: a */
    public final boolean mo3213a(int i) {
        if (!(i == 0 || i == 1 || i == 2 || i == 3 || i == 101)) {
            switch (i) {
                case ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR:
                case 202:
                case 203:
                case 204:
                case 205:
                case BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR:
                case BaseMfiEventCallback.TYPE_EXPIRED_MFI:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
