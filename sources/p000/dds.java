package p000;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: dds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dds {

    /* renamed from: a */
    private static final bnsp f12954a = ddp.m8201a("SharedMiscUtils");

    /* renamed from: a */
    public static bmxv m8204a(Intent intent) {
        Uri data = intent.getData();
        if (!m8208a(data)) {
            bnsl bnsl = (bnsl) f12954a.mo68388c();
            bnsl.mo68432a("dds", "a", 64, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Invalid scheme.");
            return bmvz.f131120a;
        }
        String replaceAll = data.getSchemeSpecificPart().replaceAll("\\s+", "");
        if (!TextUtils.isEmpty(replaceAll)) {
            return bmxv.m108566b(replaceAll);
        }
        bnsl bnsl2 = (bnsl) f12954a.mo68388c();
        bnsl2.mo68432a("dds", "a", 70, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68420a("%s info is missing in scheme.", "tel");
        return bmvz.f131120a;
    }

    /* renamed from: b */
    public static String m8209b(String str) {
        return str.length() == 0 ? new String("com.google.android.gms.matchstick.call.") : "com.google.android.gms.matchstick.call.".concat(str);
    }

    /* renamed from: b */
    public static boolean m8210b(Context context) {
        AccountManager accountManager = (AccountManager) context.getSystemService("account");
        if (accountManager != null) {
            Account[] accounts = accountManager.getAccounts();
            for (Account account : accounts) {
                if (account.name.equals("Duo") && account.type.equals("com.google.android.gms.matchstick")) {
                    return true;
                }
            }
        } else {
            bnsl bnsl = (bnsl) f12954a.mo68387b();
            bnsl.mo68404a(bnsk.MEDIUM);
            bnsl.mo68432a("dds", "b", 114, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to get account manager.");
        }
        return false;
    }

    /* renamed from: a */
    private static bmxv m8205a(Uri uri, String str) {
        if (!m8208a(uri)) {
            bnsl bnsl = (bnsl) f12954a.mo68388c();
            bnsl.mo68432a("dds", "a", 64, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Invalid scheme.");
            return bmvz.f131120a;
        }
        String replaceAll = uri.getSchemeSpecificPart().replaceAll("\\s+", "");
        if (!TextUtils.isEmpty(replaceAll)) {
            return bmxv.m108566b(replaceAll);
        }
        bnsl bnsl2 = (bnsl) f12954a.mo68388c();
        bnsl2.mo68432a("dds", "a", 70, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68420a("%s info is missing in scheme.", str);
        return bmvz.f131120a;
    }

    /* renamed from: a */
    public static String m8206a(String str) {
        return str.length() == 0 ? new String("com.google.android.apps.tachyon.") : "com.google.android.apps.tachyon.".concat(str);
    }

    /* renamed from: a */
    public static boolean m8207a(Context context) {
        AccountManager accountManager = (AccountManager) context.getSystemService("account");
        if (accountManager != null) {
            Account[] accounts = accountManager.getAccounts();
            for (Account account : accounts) {
                if (account.name.equals("Duo") && account.type.equals("com.google.android.apps.tachyon")) {
                    return true;
                }
            }
        } else {
            bnsl bnsl = (bnsl) f12954a.mo68387b();
            bnsl.mo68404a(bnsk.MEDIUM);
            bnsl.mo68432a("dds", "a", 96, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to get account manager.");
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m8208a(Uri uri) {
        return uri != null && ("tel".equals(uri.getScheme()) || "mailto".equals(uri.getScheme()));
    }
}
