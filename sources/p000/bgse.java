package p000;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;

/* renamed from: bgse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgse {
    static {
        sgj sgj = sgj.UNKNOWN;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: a */
    static long m99839a(Context context) {
        if (cezu.m138492m()) {
            return Math.max(0L, System.currentTimeMillis() - m99840b(context));
        }
        return -1;
    }

    /* renamed from: b */
    static long m99840b(Context context) {
        long j = -1;
        if (cezu.m138492m()) {
            int i = Build.VERSION.SDK_INT;
            for (AppOpsManager.PackageOps packageOps : ((AppOpsManager) context.getSystemService("appops")).getPackagesForOps(new String[]{"android:vibrate"})) {
                packageOps.getPackageName();
                for (AppOpsManager.OpEntry opEntry : packageOps.getOps()) {
                    j = Math.max(j, opEntry.getLastAccessTime(1));
                    opEntry.getLastAccessTime(1);
                }
            }
        }
        return j;
    }
}
