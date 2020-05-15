package p000;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;

/* renamed from: zvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zvn {

    /* renamed from: a */
    public static final String f56031a = stn.m36304a("ro.product.device", "");

    /* renamed from: a */
    public static caaq m46574a(Context context) {
        if (yww.f54717a == -1) {
            sre.m36089i(context);
            sre.m36088h(context);
            sre.m36087g(context);
            yww.f54717a = (!sre.m36081a(context.getResources()) || yww.m44953a(context)) ? (TextUtils.isEmpty(Build.PRODUCT) || !Build.PRODUCT.startsWith("glass_")) ? 1 : 6 : 2;
        }
        return yyh.m45003a(Build.MANUFACTURER, Build.MODEL, Settings.Secure.getString(context.getContentResolver(), "android_id"), caap.m126421a(yww.f54717a), 3);
    }
}
