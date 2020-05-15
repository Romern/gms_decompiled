package p000;

import android.app.PendingIntent;
import android.os.Bundle;

/* renamed from: anuh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anuh {
    /* renamed from: a */
    public static void m65337a(Bundle bundle, String str, String str2, String str3, int i, String str4, String[] strArr, PendingIntent pendingIntent) {
        bundle.putString("authAccount", str);
        bundle.putString("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE", str2);
        bundle.putString("com.google.android.gms.plus.intent.extra.AUTHENTICATION_PACKAGE_NAME", str3);
        bundle.putInt("com.google.android.gms.plus.intent.extra.SIGN_UP_STATE", i);
        if (strArr != null) {
            bundle.putStringArray("request_visible_actions", strArr);
        }
        bundle.putString("com.google.android.gms.plus.intent.extra.AUTH_SCOPE_STRING", str4);
        bundle.putParcelable("com.google.android.gms.plus.intent.extra.AUTH_TOKEN_INTENT", pendingIntent);
    }

    /* renamed from: a */
    public static boolean m65338a(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("https://www.googleapis.com/auth/games")) {
                return true;
            }
            if (str.contains("plus.") && !str.endsWith("plus.me")) {
                return true;
            }
        }
        return false;
    }
}
