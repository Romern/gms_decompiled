package p000;

import java.util.Locale;

/* renamed from: bebi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bebi {
    /* renamed from: a */
    public static boolean m91715a(long j) {
        return j < 281474976710656L && j >= 0;
    }

    /* renamed from: b */
    public static boolean m91719b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Null SSID.");
        } else if (str.indexOf(95) < 0) {
            return false;
        } else {
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            if (lowerCase.contains("_nomap") || lowerCase.contains("_optout")) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m91716a(long j, String str) {
        if (!m91715a(j)) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Invalid MAC Address: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if ((j & 2199023255552L) != 0) {
            return true;
        } else {
            return m91719b(str);
        }
    }

    /* renamed from: a */
    public static boolean m91717a(String str) {
        if (str == null || str.length() != 17) {
            return false;
        }
        int i = 0;
        while (i < str.length()) {
            int i2 = i + 1;
            if (i2 % 3 != 0) {
                if ((str.charAt(i) < '0' || str.charAt(i) > '9') && ((str.charAt(i) < 'A' || str.charAt(i) > 'F') && (str.charAt(i) < 'a' || str.charAt(i) > 'f'))) {
                    return false;
                }
            } else if (!(str.charAt(i) == '-' || str.charAt(i) == ':')) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m91718a(String str, String str2) {
        if (str != null && !m91717a(str)) {
            throw new IllegalArgumentException(str.length() == 0 ? new String("Invalid MAC Address: ") : "Invalid MAC Address: ".concat(str));
        } else if (str2 == null) {
            throw new IllegalArgumentException("Null SSID.");
        } else if (str == null || !"2367abefABEF".contains(str.substring(1, 2))) {
            return m91719b(str2);
        } else {
            return true;
        }
    }
}
