package p000;

import android.content.Context;
import android.os.Build;
import android.os.Handler;

/* renamed from: sss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class sss {

    /* renamed from: a */
    private static volatile sss f45101a = null;

    /* renamed from: a */
    public void mo26059a(ssr ssr, Handler handler) {
    }

    /* renamed from: a */
    public boolean mo26060a() {
        return false;
    }

    /* renamed from: b */
    public void mo26061b() {
    }

    /* renamed from: a */
    public static sss m36260a(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (svr.m36484b(context).mo26169a("android.permission.OBSERVE_GRANT_REVOKE_PERMISSIONS") == 0) {
            return new ssu(context.getPackageManager());
        }
        if (f45101a == null) {
            f45101a = new sss();
        }
        return f45101a;
    }
}
