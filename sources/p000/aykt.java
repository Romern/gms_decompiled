package p000;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: aykt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aykt extends svq {
    public aykt(Context context) {
        super(context);
    }

    /* renamed from: b */
    public final void mo26178b(int i) {
        PackageManager packageManager = this.f45245a.getPackageManager();
        String[] packagesForUid = packageManager.getPackagesForUid(i);
        if (packagesForUid != null && packagesForUid.length > 0) {
            packageManager.isInstantApp(packagesForUid[0]);
        }
    }
}
