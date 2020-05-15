package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import java.io.IOException;

/* renamed from: bbfh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbfh {
    /* renamed from: a */
    public static SharedPreferences m87928a(Context context, String str, bmxv bmxv) {
        if (bmxv != null && bmxv.mo66813a()) {
            String valueOf = String.valueOf((String) bmxv.mo66814b());
            str = valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
        }
        return context.getSharedPreferences(str, 0);
    }

    /* renamed from: a */
    public static bxxc m87929a(SharedPreferences sharedPreferences, String str, bxxk bxxk) {
        String string = sharedPreferences.getString(str, null);
        if (string != null) {
            try {
                return m87930a(string, bxxk);
            } catch (bxwf e) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static bxxc m87930a(String str, bxxk bxxk) {
        try {
            return (bxxc) bxxk.mo73662b(Base64.decode(str, 3), bxus.m123743b());
        } catch (IllegalArgumentException e) {
            throw new bxwf("Unable to decode to byte array", new IOException(e));
        }
    }

    /* renamed from: a */
    public static String m87931a(bxxc bxxc) {
        return Base64.encodeToString(bxxc.serializeToBytes(), 3);
    }

    /* renamed from: a */
    public static void m87932a(SharedPreferences.Editor editor, String str) {
        editor.remove(str);
    }

    /* renamed from: a */
    public static void m87933a(SharedPreferences.Editor editor, String str, bxxc bxxc) {
        editor.putString(str, m87931a(bxxc));
    }

    /* renamed from: a */
    public static boolean m87934a(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.edit().remove(str).commit();
    }

    /* renamed from: a */
    public static boolean m87935a(SharedPreferences sharedPreferences, String str, bxxc bxxc) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        m87933a(edit, str, bxxc);
        return edit.commit();
    }
}
