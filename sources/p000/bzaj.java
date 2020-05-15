package p000;

import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: bzaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzaj {
    /* renamed from: a */
    public static int m125580a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (i == 106) {
            return 107;
        }
        switch (i) {
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
