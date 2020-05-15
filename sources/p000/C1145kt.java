package p000;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;

/* renamed from: kt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1145kt {
    /* renamed from: a */
    public static int m18540a(Context context, String str) {
        return m18541a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    /* renamed from: a */
    public static int m18541a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        int i3 = Build.VERSION.SDK_INT;
        String permissionToOp = AppOpsManager.permissionToOp(str);
        if (permissionToOp != null) {
            if (str2 == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                str2 = packagesForUid[0];
            }
            int i4 = Build.VERSION.SDK_INT;
            if (((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, str2) != 0) {
                return -2;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static int m18542a(Context context, String str, String str2) {
        if (Binder.getCallingPid() != Process.myPid()) {
            return m18541a(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
        }
        return -1;
    }
}
