package p000;

import android.os.Build;
import java.util.Locale;

/* renamed from: adwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adwl {
    /* renamed from: b */
    public static String m51284b(Locale locale) {
        String a = m51282a(locale);
        return a == null ? "und" : a;
    }

    /* renamed from: a */
    public static String m51282a(Locale locale) {
        int i = Build.VERSION.SDK_INT;
        return locale.toLanguageTag();
    }

    /* renamed from: b */
    public static Locale m51285b(String str) {
        Locale a = m51283a(str);
        return a == null ? new Locale("") : a;
    }

    /* renamed from: a */
    public static Locale m51283a(String str) {
        int i = Build.VERSION.SDK_INT;
        return Locale.forLanguageTag(str);
    }
}
