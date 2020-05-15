package p000;

import android.app.Application;
import android.content.pm.PackageManager;

/* renamed from: rib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rib {

    /* renamed from: a */
    private static final Logger f43029a = new Logger("CommonAccount", "PackageUtil");

    /* renamed from: a */
    public static bmxv m33626a(Application application, String str) {
        try {
            return bmxv.m108566b(application.getPackageManager().getApplicationIcon(str));
        } catch (PackageManager.NameNotFoundException e) {
            f43029a.mo25416d("Cannot find icon of package: %s", str, e);
            return bmvz.f131120a;
        }
    }

    /* renamed from: b */
    public static String m33627b(Application application, String str) {
        try {
            return svr.m36484b(application).mo26177b(str).toString();
        } catch (PackageManager.NameNotFoundException e) {
            f43029a.mo25416d("Cannot find label of package: %s", str, e);
            return "";
        }
    }
}
