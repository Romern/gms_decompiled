package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.preference.PreferenceManager;
import android.provider.Telephony;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: aevx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aevx {
    /* renamed from: a */
    public static C1240of m52625a(Context context, String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String valueOf = String.valueOf(str);
        ResolveInfo resolveInfo = null;
        String string = defaultSharedPreferences.getString(valueOf.length() == 0 ? new String("default_share_app:") : "default_share_app:".concat(valueOf), null);
        if (string == null) {
            int i = Build.VERSION.SDK_INT;
            string = Telephony.Sms.getDefaultSmsPackage(context);
        }
        if (string != null) {
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (true) {
                if (it.hasNext()) {
                    ResolveInfo next = it.next();
                    ActivityInfo activityInfo = next.activityInfo;
                    if (activityInfo != null && string.equals(activityInfo.applicationInfo.packageName)) {
                        resolveInfo = next;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (resolveInfo != null) {
            queryIntentActivities.remove(resolveInfo);
        }
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo2 : queryIntentActivities) {
            if (resolveInfo != null) {
                arrayList.add(resolveInfo2);
            } else {
                resolveInfo = resolveInfo2;
            }
        }
        arrayList.add(0, resolveInfo);
        return C1240of.m19758a(resolveInfo, arrayList);
    }
}
