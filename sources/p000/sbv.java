package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Locale;

/* renamed from: sbv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sbv {

    /* renamed from: a */
    private static final Uri f44038a;

    static {
        Uri parse = Uri.parse("https://plus.google.com/");
        f44038a = parse;
        parse.buildUpon().appendPath("circles").appendPath("find").build();
    }

    /* renamed from: a */
    public static Intent m34869a() {
        return rew.m33487a(null, null, new String[]{"com.google"}, true, true, 0);
    }

    /* renamed from: b */
    public static Intent m34879b(String str) {
        return m34872a(str, (String) null);
    }

    /* renamed from: b */
    public static Intent m34880b(String str, String str2) {
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        intent.setAction("com.google.android.gms.fitness.app_disconnected");
        intent.setType("vnd.google.android.fitness/app_disconnect");
        intent.putExtra("com.google.android.gms.fitness.disconnected_app", str);
        intent.putExtra("com.google.android.gms.fitness.disconnected_account", str2);
        return intent;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: a */
    public static Intent m34870a(Context context, String str) {
        Intent intent = new Intent("com.android.vending.billing.PURCHASE");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setPackage("com.android.vending");
        if (!TextUtils.isEmpty(null)) {
            intent.putExtra("authAccount", (String) null);
        }
        intent.putExtra("backend", 3);
        intent.putExtra("document_type", 1);
        intent.putExtra("full_docid", str);
        intent.putExtra("backend_docid", str);
        intent.putExtra("offer_type", 1);
        if (m34878a(context.getPackageManager(), intent)) {
            return intent;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse(String.format(Locale.US, "https://play.google.com/store/apps/details?id=%1$s&rdid=%1$s&rdot=%2$d", str, 1)));
        intent2.setPackage("com.android.vending");
        intent2.putExtra("use_direct_purchase", true);
        return intent2;
    }

    /* renamed from: a */
    public static Intent m34871a(String str) {
        Uri fromParts = Uri.fromParts("package", str, null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }

    /* renamed from: a */
    public static Intent m34872a(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", str);
        if (!TextUtils.isEmpty(str2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", str2);
        }
        intent.setData(appendQueryParameter.build());
        intent.setPackage("com.android.vending");
        intent.addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        return intent;
    }

    /* renamed from: a */
    public static Intent m34873a(String str, Scope[] scopeArr, boolean z) {
        Intent intent = new Intent("com.google.android.gms.signin.action.SIGN_IN");
        intent.putExtra("SIGN_IN_PACKAGE_NAME", str);
        intent.putExtra("SIGN_IN_SCOPE_ARRAY", scopeArr);
        intent.putExtra("SIGN_IN_SAVE_DEFAULT_ACCOUNT", z);
        return intent;
    }

    /* renamed from: a */
    public static void m34874a(Context context, String str, String str2) {
        Intent intent = new Intent("com.google.android.gms.common.SET_GMS_ACCOUNT");
        intent.putExtra("ACCOUNT_NAME", str);
        intent.putExtra("PACKAGE_NAME", str2);
        intent.setPackage("com.google.android.gms");
        context.sendBroadcast(intent, "com.google.android.gms.permission.INTERNAL_BROADCAST");
    }

    /* renamed from: a */
    public static void m34875a(Context context, String str, int[] iArr) {
        m34877a("com.google.android.gms", context, str, iArr);
        if (rfz.m33557a(context).mo24610b("com.google.android.googlequicksearchbox")) {
            m34877a("com.google.android.googlequicksearchbox", context, str, iArr);
        } else if (Log.isLoggable("GmsIntents", 5)) {
            Log.w("GmsIntents", "Google now certificate not valid. UDC settings broadcast will not be sent.");
        }
    }

    /* renamed from: a */
    public static void m34876a(Context context, boolean z) {
        context.sendBroadcast(new Intent("com.google.android.gms.icing.action.CONTACT_CHANGED").setPackage("com.google.android.gms").putExtra("com.google.android.gms.icing.extra.isSignificant", z));
    }

    /* renamed from: a */
    private static void m34877a(String str, Context context, String str2, int[] iArr) {
        context.sendBroadcast(new Intent("com.google.android.gms.udc.action.SETTING_CHANGED").setPackage(str).putExtra("com.google.android.gms.udc.extra.accountName", str2).putExtra("com.google.android.gms.udc.extra.settingIdList", iArr));
    }

    /* renamed from: a */
    public static boolean m34878a(PackageManager packageManager, Intent intent) {
        return packageManager.resolveActivity(intent, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != null;
    }
}
