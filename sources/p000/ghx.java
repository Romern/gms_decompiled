package p000;

import android.text.TextUtils;

/* renamed from: ghx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ghx {
    /* renamed from: a */
    public static String m13173a(String str, Boolean bool) {
        sdo.m34977c(str);
        String str2 = !m13175a(bool) ? "http" : "https";
        StringBuilder sb = new StringBuilder(str2.length() + 3 + String.valueOf(str).length());
        sb.append(str2);
        sb.append("://");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m13174a(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Long l) {
        StringBuilder sb = new StringBuilder(str);
        sb.append('=');
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str2);
        }
        if (m13175a(bool)) {
            sb.append(";HttpOnly");
        }
        if (m13175a(bool2)) {
            sb.append(";Secure");
        }
        if (!TextUtils.isEmpty(str3)) {
            sb.append(";Domain=");
            sb.append(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            sb.append(";Path=");
            sb.append(str4);
        }
        if (l != null && l.longValue() > 0) {
            sb.append(";Max-Age=");
            sb.append(l);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static boolean m13175a(Boolean bool) {
        return bool != null && bool.booleanValue();
    }
}
