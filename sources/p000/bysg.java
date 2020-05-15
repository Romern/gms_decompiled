package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: bysg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bysg {
    /* renamed from: a */
    public static int m125261a(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = BaseMfiEventCallback.TYPE_UNKNOWN_ERROR;
                        if (i != 200) {
                            switch (i) {
                                case 100:
                                    return 100;
                                case 101:
                                    return 101;
                                case 102:
                                    return 102;
                                case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                                    return ErrorInfo.TYPE_SDU_COMMUNICATIONERROR;
                                case ErrorInfo.TYPE_SDU_FAILED:
                                    return ErrorInfo.TYPE_SDU_FAILED;
                                default:
                                    return 0;
                            }
                        }
                    }
                }
            }
        }
        return i2;
    }
}
