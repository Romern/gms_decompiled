package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;

/* renamed from: yub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yub {

    /* renamed from: a */
    private static final srn f54631a = zvt.m46581a();

    /* renamed from: a */
    public static IntentFilter m44842a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_DATA_CLEARED");
        intentFilter.addDataScheme("package");
        return intentFilter;
    }

    /* renamed from: b */
    public static String m44845b(Intent intent) {
        Uri data = intent.getData();
        bmxy.m108581a(data);
        String schemeSpecificPart = data.getSchemeSpecificPart();
        bmxy.m108588a(!schemeSpecificPart.isEmpty());
        return schemeSpecificPart;
    }

    /* renamed from: c */
    public static int m44846c(Intent intent) {
        return intent.getIntExtra("android.intent.extra.UID", 0);
    }

    /* renamed from: a */
    public static boolean m44843a(Context context, String str) {
        try {
            return context.getPackageManager().getApplicationInfo(str, 0).enabled;
        } catch (PackageManager.NameNotFoundException e) {
            ((bnsl) f54631a.mo68388c()).mo68420a("Couldn't find package %s in PM.  Assuming uninstalled", str);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m44844a(Intent intent) {
        return intent.getBooleanExtra("android.intent.extra.REPLACING", false);
    }
}
