package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;

/* renamed from: sqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sqr {
    /* renamed from: a */
    public static int m35996a(Context context, String str) {
        return m35997a(m35999b(context, str));
    }

    /* renamed from: b */
    public static PackageInfo m35999b(Context context, String str) {
        try {
            return svr.m36484b(context).mo26176b(str, 128);
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m36000c(Context context, String str) {
        if ("com.google.android.gms".equals(str) && m35998a()) {
            return false;
        }
        try {
            if ((svr.m36484b(context).mo26172a(str, 0).flags & 2097152) != 0) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: a */
    public static int m35997a(PackageInfo packageInfo) {
        Bundle bundle;
        if (packageInfo == null || packageInfo.applicationInfo == null || (bundle = packageInfo.applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }

    /* renamed from: a */
    public static boolean m35998a() {
        return rtc.m34382b() && rtc.f43639a == Process.myUid();
    }
}
