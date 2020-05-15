package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: brru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brru {
    /* renamed from: a */
    private static final SharedPreferences m114513a(Context context, String str) {
        return context.getSharedPreferences(String.format("com.google.firebase.auth.internal.browserSignInSessionStore.%s", str), 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005e, code lost:
        return null;
     */
    /* renamed from: a */
    public static final synchronized brrt m114514a(Context context, String str, String str2) {
        synchronized (brru.class) {
            sdo.m34977c(str);
            sdo.m34977c(str2);
            SharedPreferences a = m114513a(context, str);
            String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", str2);
            String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2);
            String format3 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", str2);
            String string = a.getString(format, null);
            String string2 = a.getString(format2, null);
            String string3 = a.getString(format3, null);
            String string4 = a.getString("com.google.firebase.auth.api.gms.config.tenant.id", null);
            SharedPreferences.Editor edit = a.edit();
            edit.remove(format);
            edit.remove(format2);
            edit.remove(format3);
            edit.apply();
            if (string != null && string2 != null && string3 != null) {
                brrt brrt = new brrt(string, string2, string3, string4);
                return brrt;
            }
        }
    }

    /* renamed from: a */
    public static final synchronized void m114515a(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        synchronized (brru.class) {
            sdo.m34977c(str);
            sdo.m34977c(str2);
            sdo.m34977c(str3);
            SharedPreferences a = m114513a(context, str);
            SharedPreferences.Editor edit = a.edit();
            for (String str7 : a.getAll().keySet()) {
                edit.remove(str7);
            }
            edit.apply();
            SharedPreferences.Editor edit2 = a.edit();
            edit2.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", str2), str3);
            edit2.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2), str4);
            edit2.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", str2), str5);
            edit2.putString("com.google.firebase.auth.api.gms.config.tenant.id", str6);
            edit2.apply();
        }
    }
}
