package p000;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bjyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjyx {
    /* renamed from: a */
    public static int m104944a(int i, String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        int i2 = 0;
        while (matcher.region(0, i).find()) {
            i2++;
        }
        return i2;
    }

    /* renamed from: a */
    public static int m104945a(boolean z) {
        return z ? 31 : 12;
    }

    /* renamed from: b */
    public static boolean m104948b(String str) {
        if (str != null) {
            if (str.length() == 1) {
                return str.charAt(0) > '3';
            }
            if (str.length() == 2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static String m104946a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.length() > 2) {
            str = str.substring(0, 2);
        }
        return Integer.parseInt(str) > m104945a(z) ? str.substring(0, 1) : str;
    }

    /* renamed from: a */
    public static boolean m104947a(String str) {
        if (str != null) {
            if (str.length() == 1) {
                char charAt = str.charAt(0);
                return (charAt == '0' || charAt == '1') ? false : true;
            } else if (str.length() == 2) {
                return true;
            }
        }
        return false;
    }
}
