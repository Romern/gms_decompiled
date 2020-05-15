package p000;

import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: ddq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ddq {

    /* renamed from: a */
    private static final Pattern f12944a = Pattern.compile("\\.");

    /* renamed from: a */
    public static String m8202a(String str) {
        String lowerCase = str.trim().toLowerCase(Locale.getDefault());
        String[] split = lowerCase.split("@", 2);
        if (split.length != 2) {
            return lowerCase;
        }
        if (!"gmail.com".equals(split[1]) && !"googlemail.com".equals(split[1])) {
            return lowerCase;
        }
        return String.format("%s@%s", f12944a.matcher(split[0]).replaceAll(""), "gmail.com");
    }

    /* renamed from: a */
    public static boolean m8203a(String str, String str2) {
        if (str == null || str2 == null) {
            return str == str2;
        }
        return m8202a(str).equals(m8202a(str2));
    }
}
