package p000;

import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: byez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class byez implements bxvr {

    /* renamed from: a */
    static final bxvr f165991a = new byez();

    private byez() {
    }

    /* renamed from: a */
    public final boolean mo3213a(int i) {
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
                return true;
            default:
                switch (i) {
                    case 101:
                    case 102:
                    case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                        return true;
                    default:
                        return false;
                }
        }
    }
}
