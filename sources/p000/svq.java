package p000;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Build;
import android.os.Process;

/* renamed from: svq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class svq {

    /* renamed from: a */
    public final Context f45245a;

    public svq(Context context) {
        this.f45245a = context;
    }

    /* renamed from: a */
    public final int mo26169a(String str) {
        return this.f45245a.checkCallingOrSelfPermission(str);
    }

    /* renamed from: b */
    public final PackageInfo mo26176b(String str, int i) {
        return this.f45245a.getPackageManager().getPackageInfo(str, i);
    }

    /* renamed from: b */
    public void mo26178b(int i) {
    }

    /* renamed from: c */
    public final C1240of mo26179c(String str) {
        ApplicationInfo applicationInfo = this.f45245a.getPackageManager().getApplicationInfo(str, 0);
        return C1240of.m19758a(this.f45245a.getPackageManager().getApplicationLabel(applicationInfo), this.f45245a.getPackageManager().getApplicationIcon(applicationInfo));
    }

    /* renamed from: d */
    public final boolean mo26180d(String str) {
        return this.f45245a.getPackageManager().hasSystemFeature(str);
    }

    /* renamed from: a */
    public final int mo26170a(String str, int i, int i2) {
        return this.f45245a.checkPermission(str, i, i2);
    }

    /* renamed from: b */
    public final CharSequence mo26177b(String str) {
        return this.f45245a.getPackageManager().getApplicationLabel(this.f45245a.getPackageManager().getApplicationInfo(str, 0));
    }

    /* renamed from: a */
    public final int mo26171a(String str, String str2) {
        return this.f45245a.getPackageManager().checkPermission(str, str2);
    }

    /* renamed from: a */
    public final ApplicationInfo mo26172a(String str, int i) {
        return this.f45245a.getPackageManager().getApplicationInfo(str, i);
    }

    /* renamed from: a */
    public final boolean mo26173a() {
        if (Binder.getCallingUid() == Process.myUid()) {
            return svp.m36471a(this.f45245a);
        }
        int i = Build.VERSION.SDK_INT;
        String nameForUid = this.f45245a.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid != null) {
            return this.f45245a.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo26174a(int i, String str) {
        int i2 = Build.VERSION.SDK_INT;
        try {
            ((AppOpsManager) this.f45245a.getSystemService("appops")).checkPackage(i, str);
            return true;
        } catch (SecurityException e) {
            return false;
        }
    }

    /* renamed from: a */
    public final String[] mo26175a(int i) {
        return this.f45245a.getPackageManager().getPackagesForUid(i);
    }
}
