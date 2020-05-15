package p000;

import android.content.Context;
import android.os.Binder;

/* renamed from: bhcd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhcd {
    /* renamed from: a */
    public static int m100623a(Context context) {
        int callingPid = Binder.getCallingPid();
        int callingUid = Binder.getCallingUid();
        if (svr.m36484b(context).mo26170a("android.permission.ACCESS_FINE_LOCATION", callingPid, callingUid) != 0) {
            return svr.m36484b(context).mo26170a("android.permission.ACCESS_COARSE_LOCATION", callingPid, callingUid) == 0 ? 1 : 0;
        }
        return 2;
    }
}
