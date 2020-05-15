package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;

/* renamed from: jvy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jvy {

    /* renamed from: a */
    private static final Logger f23385a = ght.m13171a("AddAccount", "IntentResolveHelper");

    /* renamed from: a */
    public static Intent m17406a(Context context, Intent intent) {
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 0)) {
            if (resolveInfo.activityInfo != null) {
                String str = resolveInfo.activityInfo.packageName;
                f23385a.mo25414c("Found activity to handle action %s", intent.getAction());
                if ("com.google.android.gms".equals(str) || rfz.m33557a(context).mo24610b(str)) {
                    intent.setComponent(new ComponentName(str, resolveInfo.activityInfo.name));
                    return intent;
                }
            }
        }
        f23385a.mo25414c("Failed to resolve activity for action %s", intent.getAction());
        return null;
    }
}
