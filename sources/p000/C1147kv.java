package p000;

import android.content.pm.PackageInfo;
import android.os.Build;

/* renamed from: kv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1147kv {
    /* renamed from: a */
    public static long m18618a(PackageInfo packageInfo) {
        int i = Build.VERSION.SDK_INT;
        return packageInfo.getLongVersionCode();
    }
}
