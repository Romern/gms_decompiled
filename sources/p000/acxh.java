package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

/* renamed from: acxh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acxh {

    /* renamed from: a */
    public final Intent f61009a;

    /* renamed from: b */
    private final Context f61010b;

    public acxh(Context context, Intent intent) {
        this.f61009a = intent;
        this.f61010b = context;
    }

    /* renamed from: a */
    public final boolean mo33192a() {
        if ("android.intent.action.PACKAGE_REPLACED".equals(this.f61009a.getAction())) {
            return true;
        }
        if (!"android.intent.action.PACKAGE_CHANGED".equals(this.f61009a.getAction()) || !mo33195d()) {
            return "android.intent.action.PACKAGE_ADDED".equals(this.f61009a.getAction());
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo33193b() {
        return !cemw.m137396d() ? "android.intent.action.PACKAGE_REMOVED".equals(this.f61009a.getAction()) && this.f61009a.getBooleanExtra("android.intent.extra.REPLACING", false) : "android.intent.action.PACKAGE_REMOVED".equals(this.f61009a.getAction()) && this.f61009a.getBooleanExtra("android.intent.extra.REPLACING", false) && !this.f61009a.getBooleanExtra("android.intent.extra.DATA_REMOVED", false);
    }

    /* renamed from: c */
    public final String mo33194c() {
        Uri data = this.f61009a.getData();
        if (data != null) {
            return data.getSchemeSpecificPart();
        }
        return null;
    }

    /* renamed from: d */
    public final boolean mo33195d() {
        String c = mo33194c();
        try {
            return this.f61010b.getPackageManager().getApplicationInfo(c, 0).enabled;
        } catch (PackageManager.NameNotFoundException e) {
            absg.m48195b(e, "Could not get app info for %s", c);
            return false;
        }
    }
}
