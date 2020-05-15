package p000;

import android.text.TextUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: fog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fog {
    /* renamed from: a */
    public static fjm m12072a(fnt fnt, String str) {
        sdo.m34959a(fnt);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new HashMap();
        try {
            String valueOf = String.valueOf(str);
            Map a = srw.m36166a(new URI(valueOf.length() == 0 ? new String("?") : "?".concat(valueOf)), "UTF-8");
            fjm fjm = new fjm();
            fjm.f16735e = (String) a.get("utm_content");
            fjm.f16733c = (String) a.get("utm_medium");
            fjm.f16731a = (String) a.get("utm_campaign");
            fjm.f16732b = (String) a.get("utm_source");
            fjm.f16734d = (String) a.get("utm_term");
            fjm.f16736f = (String) a.get("utm_id");
            fjm.f16737g = (String) a.get("anid");
            fjm.f16738h = (String) a.get("gclid");
            fjm.f16739i = (String) a.get("dclid");
            fjm.f16740j = (String) a.get("aclid");
            return fjm;
        } catch (URISyntaxException e) {
            fnt.mo10934d("No valid campaign data found", e);
            return null;
        }
    }

    /* renamed from: b */
    public static long m12078b(String str) {
        if (str != null) {
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e) {
            }
        }
        return 0;
    }

    /* renamed from: c */
    public static MessageDigest m12079c(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m12080d(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("http:")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m12073a(Locale locale) {
        if (locale != null) {
            String language = locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                StringBuilder sb = new StringBuilder();
                sb.append(language.toLowerCase(locale));
                if (!TextUtils.isEmpty(locale.getCountry())) {
                    sb.append("-");
                    sb.append(locale.getCountry().toLowerCase(locale));
                }
                return sb.toString();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Map m12074a(String str) {
        HashMap hashMap = new HashMap();
        for (String str2 : str.split("&")) {
            String[] split = str2.split("=", 3);
            int length = split.length;
            String str3 = null;
            if (length > 1) {
                hashMap.put(split[0], !TextUtils.isEmpty(split[1]) ? split[1] : null);
                if (length == 3 && !TextUtils.isEmpty(split[1]) && !hashMap.containsKey(split[1])) {
                    String str4 = split[1];
                    if (!TextUtils.isEmpty(split[2])) {
                        str3 = split[2];
                    }
                    hashMap.put(str4, str3);
                }
            } else if (length == 1 && split[0].length() != 0) {
                hashMap.put(split[0], null);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m12075a(Map map, String str, String str2) {
        if (str2 != null && !map.containsKey(str)) {
            map.put(str, str2);
        }
    }

    /* renamed from: a */
    public static void m12076a(Map map, String str, Map map2) {
        m12075a(map, str, (String) map2.get(str));
    }

    /* renamed from: a */
    public static boolean m12077a(double d, String str) {
        int i;
        if (d <= 0.0d || d >= 100.0d) {
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            i = 0;
            for (int length = str.length() - 1; length >= 0; length--) {
                char charAt = str.charAt(length);
                i = ((i << 6) & 65535) + charAt + (charAt << 14);
                int i2 = i >> 21;
                if ((266338304 & i) != 0) {
                    i ^= i2 & 127;
                }
            }
        } else {
            i = 1;
        }
        if (((double) (i % 10000)) < d * 100.0d) {
            return false;
        }
        return true;
    }
}
