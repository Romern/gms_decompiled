package p000;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/* renamed from: tpc */
final /* synthetic */ class tpc implements bmxj {

    /* renamed from: a */
    private final PackageManager f46435a;

    public tpc(PackageManager packageManager) {
        this.f46435a = packageManager;
    }

    public final Object apply(Object obj) {
        PackageManager packageManager = this.f46435a;
        String str = ((ApplicationInfo) obj).packageName;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            if (applicationInfo == null) {
                return tpe.m37310a(str, str, null);
            }
            CharSequence applicationLabel = packageManager.getApplicationLabel(applicationInfo);
            return tpe.m37310a(str, applicationLabel != null ? applicationLabel.toString() : str, packageManager.getApplicationIcon(applicationInfo));
        } catch (PackageManager.NameNotFoundException e) {
            return tpe.m37310a(str, str, null);
        }
    }
}
