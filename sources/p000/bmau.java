package p000;

import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: bmau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmau {
    /* renamed from: a */
    public static int m107847a(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
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
                    case ErrorInfo.TYPE_SDU_MEMORY_FULL:
                        return ErrorInfo.TYPE_SDU_MEMORY_FULL;
                    default:
                        return 0;
                }
            }
        }
        return i2;
    }
}
