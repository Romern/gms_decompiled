package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.identity.accounts.api.AccountData;

/* renamed from: aqqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqqk {
    /* renamed from: a */
    public static Intent m71970a(Context context, String str, String str2, boolean z) {
        ClientContext clientContext = new ClientContext();
        clientContext.f30212b = Process.myUid();
        clientContext.f30215e = context.getPackageName();
        Intent intent = null;
        if (sfr.m35174a(context, clientContext).mo25481a("com.google.android.hangouts.START_HANGOUT") != 0) {
            return null;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setType("vnd.google.android.hangouts/vnd.google.android.hangout_privileged");
        PackageManager packageManager = context.getPackageManager();
        intent2.setPackage("com.google.android.talk");
        if (packageManager.resolveActivity(intent2, 0) != null) {
            intent2.putExtra("account_name", str2);
            intent2.putExtra("start_video", z);
            intent = intent2;
        } else if (Log.isLoggable("BabelIntentUtils", 6)) {
            Log.e("BabelIntentUtils", "Intent not supported by Hangouts app");
        }
        if (intent != null) {
            intent.putExtra("participant_gaia", str);
        }
        return intent;
    }

    /* renamed from: b */
    public static Intent m71974b(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        String valueOf = String.valueOf(Uri.encode(str));
        intent.setData(Uri.parse(valueOf.length() == 0 ? new String("geo:0,0?q=") : "geo:0,0?q=".concat(valueOf)));
        return intent;
    }

    /* renamed from: a */
    public static Intent m71971a(String str) {
        Intent intent = new Intent("android.intent.action.DIAL");
        String valueOf = String.valueOf(str);
        intent.setData(Uri.parse(valueOf.length() == 0 ? new String("tel:") : "tel:".concat(valueOf)));
        return intent;
    }

    /* renamed from: a */
    public static Intent m71972a(String str, String str2) {
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
        intent.putExtra("fromAccountString", str2);
        return intent;
    }

    /* renamed from: a */
    public static void m71973a(Context context, Intent intent, String str, String str2) {
        AccountData accountData;
        PackageManager packageManager = context.getPackageManager();
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 0)) {
            if (!"com.android.chrome".equals(resolveInfo.activityInfo.packageName) && !"com.android.browser".equals(resolveInfo.activityInfo.packageName) && packageManager.checkSignatures("com.google.android.gms", resolveInfo.activityInfo.packageName) == 0) {
                intent.setPackage(resolveInfo.activityInfo.packageName);
                if (str != null) {
                    if (TextUtils.isEmpty(str2)) {
                        accountData = AccountData.m66749a(str);
                    } else {
                        accountData = AccountData.m66750a(str, str2);
                    }
                    acxv.m49971a(context, intent, accountData);
                    return;
                }
                return;
            }
        }
    }
}
