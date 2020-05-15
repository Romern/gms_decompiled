package p000;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

/* renamed from: rvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rvz extends ruq {
    public rvz() {
        super("Safeboot Condition");
    }

    /* renamed from: b */
    public static boolean m34545b() {
        try {
            return "com.google.android.gms.persistent".equals(ssy.m36271a());
        } catch (NoSuchMethodError e) {
            Log.e("Safeboot Condition", "Could not check if we were in persistent process.", e);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25185a(rvl rvl) {
        if (!cdng.m134176c() || !m34545b()) {
            return false;
        }
        if (cdng.m134177d()) {
            try {
                if (!rws.m34583a(rvl.f43760b).exists()) {
                    Log.i("Safeboot Condition", "No need to enter Safeboot.");
                    return false;
                }
            } catch (SecurityException e) {
                Log.w("Safeboot Condition", "Couldn't check if crash file existed.", e);
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) rvl.f43760b.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            return false;
        }
        rud a = rvl.mo25202a();
        if (a == null) {
            Log.e("Safeboot Condition", "Missing crash data");
            return false;
        }
        rvj rvj = rvl.f43766h;
        if (rvj == null) {
            Log.e("Safeboot Condition", "Missing current fixer");
            return false;
        }
        bnre i = rvl.mo25204b().listIterator();
        while (i.hasNext()) {
            ruk ruk = (ruk) i.next();
            if (ruk.f43702a.equals(rvj.mo25193a()) && ruk.f43705d > a.f43692e) {
                return false;
            }
        }
        return true;
    }
}
