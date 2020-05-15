package p000;

import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: bokf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bokf implements bxvr {

    /* renamed from: a */
    static final bxvr f133399a = new bokf();

    private bokf() {
    }

    /* renamed from: a */
    public final boolean mo3213a(int i) {
        if (!(i == 0 || i == 1)) {
            switch (i) {
                case 100:
                case 101:
                case 102:
                case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                case ErrorInfo.TYPE_SDU_FAILED:
                case ErrorInfo.TYPE_SDU_MEMORY_FULL:
                case 106:
                case 107:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
