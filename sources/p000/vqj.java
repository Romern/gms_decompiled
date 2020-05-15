package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.felicanetworks.mfc.C0126R;

/* renamed from: vqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vqj extends vrs {
    /* renamed from: a */
    public final CharSequence mo28739a(Context context) {
        return context.getString(C0126R.string.gearhead_app_name);
    }

    /* renamed from: a */
    public final String mo28740a() {
        return "com.google.android.projection.gearhead";
    }

    /* renamed from: b */
    public final ComponentName mo28741b(Context context) {
        return m41125a(context, "com.google.android.projection.gearhead");
    }

    /* renamed from: c */
    public final int mo28743c() {
        return 2;
    }

    /* renamed from: c */
    public final boolean mo28744c(Context context) {
        return true;
    }

    /* renamed from: d */
    public final boolean mo28745d(Context context) {
        vuk.m41322a();
        PackageManager packageManager = context.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.projection.gearhead", 0);
            if (packageManager.resolveActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER").setPackage("com.google.android.projection.gearhead"), 0) == null || ((long) packageInfo.versionCode) < ccul.m131705d()) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: b */
    public final Intent mo28742b() {
        return m41127b("com.google.android.projection.gearhead");
    }
}
