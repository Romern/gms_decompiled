package p000;

import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: bxdc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxdc {
    /* renamed from: a */
    public static int m122593a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 100) {
            return i != 102 ? i != 104 ? i != 105 ? 0 : 106 : ErrorInfo.TYPE_SDU_MEMORY_FULL : ErrorInfo.TYPE_SDU_COMMUNICATIONERROR;
        }
        return 101;
    }
}
