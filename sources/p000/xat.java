package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: xat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xat {
    /* renamed from: a */
    public static int m42575a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 150) {
            return MfiClientException.TYPE_MFICLIENT_NOT_FOUND;
        }
        if (i == 200) {
            return ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR;
        }
        switch (i) {
            case 100:
                return 101;
            case 101:
                return 102;
            case 102:
                return ErrorInfo.TYPE_SDU_COMMUNICATIONERROR;
            case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                return ErrorInfo.TYPE_SDU_FAILED;
            case ErrorInfo.TYPE_SDU_FAILED:
                return ErrorInfo.TYPE_SDU_MEMORY_FULL;
            default:
                return 0;
        }
    }
}
