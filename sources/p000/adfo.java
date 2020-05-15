package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;

/* renamed from: adfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adfo {
    /* renamed from: a */
    public static Intent m50308a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.addFlags(268435456);
        return intent;
    }

    /* renamed from: a */
    public static Intent m50309a(String str, String str2, long j) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setClassName("com.google.android.instantapps.supervisor", "com.google.android.instantapps.supervisor.UrlHandler");
        intent.setFlags(268435456);
        intent.putExtra("com.google.android.gms.instantapps.API_CALLER_PKG", str2);
        intent.putExtra("com.google.android.gms.instantapps.API_CALL_TIME_MS", j);
        return intent;
    }

    /* renamed from: a */
    public static boolean m50310a(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities;
        return (intent == null || (queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0)) == null || queryIntentActivities.isEmpty()) ? false : true;
    }
}
