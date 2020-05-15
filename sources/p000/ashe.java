package p000;

import android.app.StatsManager;
import android.os.Build;

/* renamed from: ashe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ashe {
    /* renamed from: a */
    public static int[] m74125a(qxq qxq) {
        int i = Build.VERSION.SDK_INT;
        try {
            long[] registeredExperimentIds = ((StatsManager) rpr.m34216b().getSystemService("stats")).getRegisteredExperimentIds();
            if (registeredExperimentIds == null) {
                qxq.mo24383c("NullExperimentsList").mo24359a();
                return new int[0];
            }
            int length = registeredExperimentIds.length;
            if (length != 0) {
                qxq.mo24383c("NonEmptyExperimentsList").mo24359a();
            } else {
                qxq.mo24383c("EmptyExperimentsList").mo24359a();
            }
            int[] iArr = new int[length];
            for (int i2 = 0; i2 < registeredExperimentIds.length; i2++) {
                iArr[i2] = (int) registeredExperimentIds[i2];
            }
            return iArr;
        } catch (StatsManager.StatsUnavailableException e) {
            qxq.mo24383c("StatsManagerError").mo24359a();
            return new int[0];
        }
    }
}
