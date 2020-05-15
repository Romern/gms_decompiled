package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* renamed from: brla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brla {

    /* renamed from: a */
    public static final brla f142902a = new brla();

    /* renamed from: b */
    private final snf f142903b = snp.m35703a(1, 10);

    /* renamed from: a */
    private static String m114107a(String str) {
        return String.format("com.google.firebase.auth.VERIFICATION_PROOF.%s", str);
    }

    /* renamed from: b */
    public static final SharedPreferences m114109b(Context context) {
        return context.getSharedPreferences("com.google.firebase.auth.instantValidator", 0);
    }

    /* renamed from: c */
    private static String m114111c(String str) {
        return String.format("com.google.firebase.auth.DEVICE_PROOF.%s", str);
    }

    /* renamed from: e */
    private final synchronized void m114112e(Context context, String str) {
        this.f142903b.mo25814a(new brkz(context, str), 300000, TimeUnit.MILLISECONDS);
    }

    /* renamed from: d */
    public final synchronized void mo69678d(Context context, String str) {
        SharedPreferences.Editor edit = m114109b(context).edit();
        edit.remove(m114107a(str));
        edit.apply();
    }

    /* renamed from: a */
    private static String m114108a(String str, String str2) {
        return String.format("com.google.firebase.auth.UNOBFUSCATED_PHONE_NUMBER.%s.%s", str, str2);
    }

    /* renamed from: b */
    private static String m114110b(String str) {
        return String.format("com.google.firebase.auth.PROOF_EXPIRY.%s", str);
    }

    /* renamed from: c */
    public final synchronized void mo69677c(Context context, String str) {
        SharedPreferences b = m114109b(context);
        for (String str2 : b.getAll().keySet()) {
            if (str2.contains(str)) {
                b.edit().remove(str2).apply();
            }
        }
    }

    /* renamed from: a */
    public final synchronized String mo69670a(Context context, String str) {
        sdo.m34959a(context);
        sdo.m34977c(str);
        return m114109b(context).getString(m114107a(str), null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        return;
     */
    /* renamed from: b */
    public final synchronized void mo69676b(Context context, String str) {
        sdo.m34959a(context);
        sdo.m34977c(str);
        if (cdyc.m135274b()) {
            if (str.length() > 5 && !str.contains("*") && str.charAt(0) == '+') {
                int i = 1;
                while (i < str.length()) {
                    if (Character.isDigit(str.charAt(i))) {
                        i++;
                    }
                }
            }
        }
        SharedPreferences.Editor edit = m114109b(context).edit();
        edit.putBoolean(m114111c(str), true);
        edit.apply();
    }

    /* renamed from: a */
    public final synchronized String mo69671a(Context context, String str, String str2) {
        sdo.m34959a(context);
        sdo.m34977c(str);
        sdo.m34977c(str2);
        return m114109b(context).getString(m114108a(str, str2), null);
    }

    /* renamed from: a */
    public final synchronized void mo69672a(Context context) {
        m114109b(context).edit().clear().apply();
    }

    /* renamed from: a */
    public final synchronized void mo69673a(Context context, String str, String str2, long j) {
        sdo.m34959a(context);
        sdo.m34977c(str);
        sdo.m34977c(str2);
        SharedPreferences.Editor edit = m114109b(context).edit();
        edit.putString(m114107a(str), str2);
        edit.putLong(m114110b(str), j + System.currentTimeMillis());
        edit.apply();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: brla.a(android.content.Context, java.lang.String, boolean):boolean
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      brla.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      brla.a(android.content.Context, java.lang.String, boolean):boolean */
    /* renamed from: a */
    public final synchronized void mo69674a(Context context, String str, String str2, String str3) {
        sdo.m34977c(str);
        sdo.m34977c(str2);
        sdo.m34977c(str3);
        if (mo69675a(context, str3, false)) {
            SharedPreferences.Editor edit = m114109b(context).edit();
            String a = m114108a(str, str2);
            edit.putString(a, str3).apply();
            m114112e(context, a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
        return false;
     */
    /* renamed from: a */
    public final synchronized boolean mo69675a(Context context, String str, boolean z) {
        sdo.m34959a(context);
        sdo.m34977c(str);
        if (cdxz.f181891a.mo6606a().mo78434c()) {
            SharedPreferences b = m114109b(context);
            boolean z2 = b.getBoolean(m114111c(str), false);
            long j = b.getLong(m114110b(str), 0);
            if (!TextUtils.isEmpty(b.getString(m114107a(str), null)) && z2) {
                long currentTimeMillis = System.currentTimeMillis() + 300000;
                if (!z || (j != 0 && j >= currentTimeMillis)) {
                    return true;
                }
                mo69678d(context, str);
            }
        }
    }
}
