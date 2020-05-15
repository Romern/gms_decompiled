package p000;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: fkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fkw extends fkj {

    /* renamed from: a */
    private final fjl f16825a = new fjl();

    public fkw(fkm fkm) {
        super(fkm);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo10890a() {
        String c;
        String b;
        fje i = mo10944i();
        if (i.f16710e == null) {
            synchronized (i) {
                if (i.f16710e == null) {
                    fjl fjl = new fjl();
                    PackageManager packageManager = i.f16707b.getPackageManager();
                    String packageName = i.f16707b.getPackageName();
                    fjl.f16729c = packageName;
                    fjl.f16730d = packageManager.getInstallerPackageName(packageName);
                    String str = null;
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(i.f16707b.getPackageName(), 0);
                        if (packageInfo != null) {
                            CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (!TextUtils.isEmpty(applicationLabel)) {
                                packageName = applicationLabel.toString();
                            }
                            try {
                                str = packageInfo.versionName;
                            } catch (PackageManager.NameNotFoundException e) {
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e2) {
                        String valueOf = String.valueOf(packageName);
                        Log.e("GAv4", valueOf.length() == 0 ? new String("Error retrieving package info: appName set to ") : "Error retrieving package info: appName set to ".concat(valueOf));
                        fjl.f16727a = packageName;
                        fjl.f16728b = str;
                        i.f16710e = fjl;
                        i.f16710e.mo10877a(this.f16825a);
                        foh m = mo10948m();
                        c = m.mo11063c();
                        if (c != null) {
                        }
                        b = m.mo11062b();
                        if (b == null) {
                        }
                    }
                    fjl.f16727a = packageName;
                    fjl.f16728b = str;
                    i.f16710e = fjl;
                }
            }
        }
        i.f16710e.mo10877a(this.f16825a);
        foh m2 = mo10948m();
        c = m2.mo11063c();
        if (c != null) {
            this.f16825a.f16727a = c;
        }
        b = m2.mo11062b();
        if (b == null) {
            this.f16825a.f16728b = b;
        }
    }

    /* renamed from: b */
    public final fjl mo10988b() {
        mo10954t();
        return this.f16825a;
    }
}
