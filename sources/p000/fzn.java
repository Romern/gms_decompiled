package p000;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* renamed from: fzn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fzn {
    /* renamed from: a */
    public static void m12801a(Intent intent, Intent intent2) {
        intent2.addFlags(intent.getFlags() & 2100293648);
    }

    /* renamed from: a */
    public static boolean m12802a(Context context, Intent intent) {
        return (intent == null || intent.resolveActivity(context.getPackageManager()) == null) ? false : true;
    }

    /* renamed from: a */
    public static boolean m12803a(Intent intent) {
        String dataString = intent.getDataString();
        return "android.intent.action.VIEW".equals(intent.getAction()) && !TextUtils.isEmpty(dataString) && dataString.startsWith("market://details") && intent.getBooleanExtra("overlay", false) && !TextUtils.isEmpty(intent.getStringExtra("callerId"));
    }

    /* renamed from: a */
    public static boolean m12804a(String str) {
        return str.startsWith("https://play.google.com/store/apps");
    }
}
