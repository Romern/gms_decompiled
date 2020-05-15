package p000;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: emq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class emq {
    /* renamed from: a */
    static int m10683a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Cannot determine apk version.", e);
        }
    }
}
