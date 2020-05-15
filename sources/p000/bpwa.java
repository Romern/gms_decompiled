package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: bpwa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bpwa implements bxvr {

    /* renamed from: a */
    static final bxvr f139451a = new bpwa();

    private bpwa() {
    }

    /* renamed from: a */
    public final boolean mo3213a(int i) {
        switch (i) {
            case 0:
            case 10:
            case 15:
            case 20:
            case 25:
            case 31:
            case 50:
            case 55:
            case 70:
            case 99:
            case 100:
            case 110:
            case 120:
            case 198:
            case ErrorInfo.TYPE_SDU_UNKNOWN:
            case BaseMfiEventCallback.TYPE_UNKNOWN_ERROR:
            case 205:
            case BaseMfiEventCallback.TYPE_EXPIRED_MFI:
            case BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA:
            case 230:
            case 254:
            case 255:
                return true;
            default:
                return false;
        }
    }
}
