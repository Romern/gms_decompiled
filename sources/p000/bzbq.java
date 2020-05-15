package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: bzbq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzbq {
    /* renamed from: a */
    public static int m125623a(int i) {
        if (i == -1) {
            return 1;
        }
        if (i == 0) {
            return 2;
        }
        if (i == 101) {
            return ErrorInfo.TYPE_SDU_COMMUNICATIONERROR;
        }
        if (i == 102) {
            return ErrorInfo.TYPE_SDU_FAILED;
        }
        if (i == 301) {
            return 303;
        }
        switch (i) {
            case 204:
                return BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR;
            case 205:
                return BaseMfiEventCallback.TYPE_EXPIRED_MFI;
            case BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR:
                return 208;
            default:
                return 0;
        }
    }
}
