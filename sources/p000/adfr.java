package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: adfr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adfr {
    /* renamed from: a */
    public static boolean m50317a(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.google.android.instantapps.supervisor", 128);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m50319b(Context context) {
        return adfk.m50305a() == 0 && !m50317a(context);
    }

    /* renamed from: a */
    public static boolean m50318a(Context context, adfs adfs) {
        int i;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.instantapps.supervisor", 128);
        if (((long) packageInfo.versionCode) >= cepl.f183185a.mo6606a().mo79517A()) {
            if (!(packageInfo.applicationInfo == null || packageInfo.applicationInfo.metaData == null)) {
                if (cepu.f183241a.mo6606a().mo79572c()) {
                    i = packageInfo.applicationInfo.metaData.getInt("com.google.android.instantapps.supervisor.min_gcore_version");
                } else {
                    i = 0;
                }
                if (i == 0) {
                    i = packageInfo.applicationInfo.metaData.getInt("com.google.android.gms.version");
                }
                if (i != 0) {
                    if (srr.m36143a(rfi.f42869b) >= srr.m36143a(i)) {
                        return true;
                    }
                    adfs.mo33429c("Supervisor requires newer gms", new Object[0]);
                    return false;
                }
            }
            return false;
        }
        adfs.mo33429c("Supervisor version is not supported", new Object[0]);
        return false;
    }
}
