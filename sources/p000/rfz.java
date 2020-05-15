package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: rfz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rfz {

    /* renamed from: a */
    private static rfz f42896a;

    /* renamed from: b */
    private final Context f42897b;

    /* renamed from: c */
    private volatile String f42898c;

    public rfz(Context context) {
        this.f42897b = context.getApplicationContext();
    }

    /* renamed from: a */
    static final rfl m33556a(PackageInfo packageInfo, rfl... rflArr) {
        if (packageInfo.signatures != null) {
            if (packageInfo.signatures.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            rfm rfm = new rfm(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < rflArr.length; i++) {
                if (rflArr[i].equals(rfm)) {
                    return rflArr[i];
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final boolean m33558b(PackageInfo packageInfo, boolean z) {
        rfl rfl;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (!z) {
                rfl = m33556a(packageInfo, rfq.f42880a[0]);
            } else {
                rfl = m33556a(packageInfo, rfq.f42880a);
            }
            if (rfl != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private final rfu m33559c(int i) {
        String[] a = svr.m36484b(this.f42897b).mo26175a(i);
        if (a == null || (r0 = a.length) == 0) {
            return rfu.m33527a("no pkgs");
        }
        rfu rfu = null;
        for (String str : a) {
            try {
                rfu = m33562d(svr.m36484b(this.f42897b).f45245a.getPackageManager().getPackageInfo(str, 64));
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(str);
                rfu = rfu.m33527a(valueOf.length() == 0 ? new String("no pkg ") : "no pkg ".concat(valueOf));
            }
            if (rfu.f42886b) {
                break;
            }
        }
        return rfu;
    }

    /* renamed from: d */
    private final rfu m33562d(PackageInfo packageInfo) {
        return m33560c(packageInfo, false);
    }

    /* renamed from: b */
    public final boolean mo24608b(int i) {
        return m33559c(i).f42886b;
    }

    /* renamed from: b */
    public final boolean mo24609b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m33558b(packageInfo, false)) {
            return true;
        }
        if (m33558b(packageInfo, true)) {
            if (rfy.m33550g(this.f42897b)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    /* renamed from: a */
    public static rfz m33557a(Context context) {
        sdo.m34959a(context);
        synchronized (rfz.class) {
            if (f42896a == null) {
                rfr.m33523a(context);
                f42896a = new rfz(context);
            }
        }
        return f42896a;
    }

    /* renamed from: c */
    private final rfu m33560c(PackageInfo packageInfo, boolean z) {
        boolean g = rfy.m33550g(this.f42897b);
        if (packageInfo == null) {
            return rfu.m33527a("null pkg");
        }
        if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
            return rfu.m33527a("single cert required");
        }
        rfm rfm = new rfm(packageInfo.signatures[0].toByteArray());
        String str = packageInfo.packageName;
        rfu a = rfr.m33522a(str, rfm, g, z);
        return (!a.f42886b || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 2) == 0 || !rfr.m33522a(str, rfm, false, true).f42886b) ? a : rfu.m33527a("debuggable release cert app rejected");
    }

    /* renamed from: b */
    public final boolean mo24610b(String str) {
        return m33561c(str).f42886b;
    }

    /* renamed from: a */
    public final void mo24604a(int i) {
        try {
            m33559c(i).mo24603b();
        } catch (SecurityException e) {
            m33559c(i).mo24603b();
            Log.e("GoogleSignatureVerifier", "flaky result", e);
        }
    }

    /* renamed from: a */
    public final void mo24605a(String str) {
        try {
            m33561c(str).mo24603b();
        } catch (SecurityException e) {
            m33561c(str).mo24603b();
            Log.e("GoogleSignatureVerifier", "flaky result", e);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rfz.a(android.content.pm.PackageInfo, boolean):boolean
     arg types: [android.content.pm.PackageInfo, int]
     candidates:
      rfz.a(android.content.pm.PackageInfo, rfl[]):rfl
      rfz.a(android.content.pm.PackageInfo, boolean):boolean */
    /* renamed from: a */
    public final boolean mo24606a(PackageInfo packageInfo) {
        return mo24607a(packageInfo, false);
    }

    /* renamed from: a */
    public final boolean mo24607a(PackageInfo packageInfo, boolean z) {
        return m33560c(packageInfo, z).f42886b;
    }

    /* renamed from: c */
    private final rfu m33561c(String str) {
        if (str == null) {
            return rfu.m33527a("null pkg");
        }
        if (str.equals(this.f42898c)) {
            return rfu.f42885a;
        }
        try {
            rfu d = m33562d(svr.m36484b(this.f42897b).mo26176b(str, 64));
            if (d.f42886b) {
                this.f42898c = str;
            }
            return d;
        } catch (PackageManager.NameNotFoundException e) {
            return rfu.m33527a(str.length() == 0 ? new String("no pkg ") : "no pkg ".concat(str));
        }
    }

    /* renamed from: c */
    public final boolean mo24611c(PackageInfo packageInfo) {
        String str = packageInfo.packageName;
        packageInfo.packageName = "com.google.android.gms.chimera";
        rfu c = m33560c(packageInfo, true);
        packageInfo.packageName = str;
        return c.f42886b;
    }
}
