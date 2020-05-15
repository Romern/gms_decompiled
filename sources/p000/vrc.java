package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;

/* renamed from: vrc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vrc extends vrs {

    /* renamed from: a */
    private final String f49837a;

    public vrc(String str) {
        bmxy.m108581a(str);
        this.f49837a = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ApplicationInfo mo28760a(PackageManager packageManager) {
        try {
            return packageManager.getApplicationInfo(this.f49837a, 128);
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    /* renamed from: a */
    public final String mo28740a() {
        return this.f49837a;
    }

    /* renamed from: b */
    public final ComponentName mo28741b(Context context) {
        return m41125a(context, this.f49837a);
    }

    /* renamed from: c */
    public final int mo28743c() {
        return 1;
    }

    /* renamed from: d */
    public final boolean mo28745d(Context context) {
        return mo28744c(context);
    }

    /* renamed from: a */
    public final CharSequence mo28739a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ApplicationInfo a = mo28760a(packageManager);
        if (a != null) {
            return packageManager.getApplicationLabel(a);
        }
        return null;
    }

    /* renamed from: b */
    public final Intent mo28742b() {
        return m41127b(this.f49837a);
    }

    /* renamed from: c */
    public final boolean mo28744c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ApplicationInfo a = mo28760a(packageManager);
        ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.APPLICATION_PREFERENCES").setPackage(this.f49837a), 0);
        if (!(a == null || resolveActivity == null)) {
            if (vuv.m41427a(ccul.f179984a.mo6606a().mo76838c(), this.f49837a)) {
                return true;
            }
        }
        return false;
    }
}
