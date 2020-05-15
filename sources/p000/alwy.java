package p000;

import android.text.TextUtils;
import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: alwy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alwy {
    /* renamed from: a */
    public static Integer m62037a(alwa alwa, int i) {
        String a = alwa.mo40830a(i);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(a));
        } catch (NumberFormatException e) {
            Log.w("ContactData", String.format(Locale.US, "Invalid ID: %s[%d] = %s", alwa.f74432c, Integer.valueOf(i), a), e);
            return null;
        }
    }

    /* renamed from: b */
    public static String m62039b(String str) {
        if (m62038a(str)) {
            return str.substring(2);
        }
        return null;
    }

    /* renamed from: c */
    public static Set m62040c(String str) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        hashSet.add(str);
        return hashSet;
    }

    /* renamed from: d */
    public static boolean m62041d(String str) {
        return str != null && str.startsWith("f:");
    }

    /* renamed from: e */
    public static boolean m62042e(String str) {
        return str != null && str.startsWith("p:");
    }

    /* renamed from: f */
    public static String m62043f(String str) {
        if (m62041d(str)) {
            return str.substring(2);
        }
        return null;
    }

    /* renamed from: g */
    public static String m62044g(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("f:") : "f:".concat(valueOf);
    }

    /* renamed from: h */
    public static String m62045h(String str) {
        if (m62042e(str)) {
            return str.substring(2);
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m62038a(String str) {
        return str != null && str.startsWith("c:");
    }
}
