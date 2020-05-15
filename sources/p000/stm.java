package p000;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: stm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class stm {

    /* renamed from: a */
    public static final Pattern f45132a = Pattern.compile("\\$\\{(.*?)\\}");

    /* renamed from: a */
    public static String m36299a(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: b */
    public static String m36300b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: c */
    public static String m36301c(String str) {
        char charAt;
        char upperCase;
        if (str.length() == 0 || charAt == (upperCase = Character.toUpperCase((charAt = str.charAt(0))))) {
            return str;
        }
        String substring = str.substring(1);
        StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 1);
        sb.append(upperCase);
        sb.append(substring);
        return sb.toString();
    }

    /* renamed from: d */
    public static boolean m36302d(String str) {
        return str == null || str.trim().isEmpty();
    }
}
