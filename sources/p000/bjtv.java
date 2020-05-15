package p000;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: bjtv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjtv {
    /* renamed from: a */
    public static int m104614a(String str) {
        if (str.length() == 2) {
            if (str.equals("UK")) {
                str = "GB";
            }
            return (Character.toUpperCase(str.charAt(1)) - '@') | ((Character.toUpperCase(str.charAt(0)) - '@') << 5);
        }
        throw new IllegalArgumentException("CountryCode must have length of 2!");
    }

    /* renamed from: b */
    public static int m104616b(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return m104614a(str);
        } catch (IllegalArgumentException e) {
            return 858;
        }
    }

    /* renamed from: a */
    public static String m104615a(int i) {
        if (i == 0 || (i & -1024) != 0) {
            return "ZZ";
        }
        return String.format(Locale.US, "%c%c", Character.valueOf((char) (((i & 992) >> 5) + 64)), Character.valueOf((char) ((i & 31) + 64)));
    }
}
