package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.customtabsclient.shared.KeepAliveService;

/* renamed from: ciqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciqv {

    /* renamed from: a */
    private static String f191266a;

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e0, code lost:
        if (r6.contains(r10) != false) goto L_0x00e2;
     */
    /* renamed from: a */
    public static String m150907a(Context context) {
        String str;
        String str2 = f191266a;
        if (str2 != null) {
            return str2;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        if (resolveActivity != null) {
            str = resolveActivity.activityInfo.packageName;
        } else {
            str = null;
        }
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction("android.support.customtabs.action.CustomTabsService");
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            f191266a = null;
        } else if (arrayList.size() == 1) {
            f191266a = (String) arrayList.get(0);
        } else {
            if (!TextUtils.isEmpty(str)) {
                try {
                    List<ResolveInfo> queryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent, 64);
                    if (queryIntentActivities2 != null && queryIntentActivities2.size() != 0) {
                        Iterator<ResolveInfo> it = queryIntentActivities2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ResolveInfo next = it.next();
                            IntentFilter intentFilter = next.filter;
                            if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && next.activityInfo != null) {
                                break;
                            }
                        }
                    }
                } catch (RuntimeException e) {
                    Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
                }
                if (arrayList.contains(str)) {
                    f191266a = str;
                }
            }
            String str3 = "com.android.chrome";
            if (!arrayList.contains(str3)) {
                str3 = "com.chrome.beta";
                if (!arrayList.contains(str3)) {
                    str3 = "com.chrome.dev";
                    if (!arrayList.contains(str3)) {
                        str3 = "com.google.android.apps.chrome";
                    }
                }
            }
            f191266a = str3;
        }
        return f191266a;
    }

    /* renamed from: a */
    public static void m150908a(Context context, Intent intent) {
        intent.putExtra("android.support.customtabs.extra.KEEP_ALIVE", new Intent().setClassName(context.getPackageName(), KeepAliveService.class.getCanonicalName()));
    }
}
