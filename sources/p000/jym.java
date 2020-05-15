package p000;

import android.os.Build;
import android.webkit.CookieManager;
import java.net.URI;
import java.net.URISyntaxException;

/* renamed from: jym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jym {

    /* renamed from: a */
    private static final Logger f23532a = ght.m13171a("CookieReader");

    /* renamed from: b */
    private final CookieManager f23533b;

    public jym(CookieManager cookieManager) {
        this.f23533b = cookieManager;
    }

    /* renamed from: a */
    public static jym m17513a() {
        CookieManager instance = CookieManager.getInstance();
        rpr.m34216b();
        return new jym(instance);
    }

    /* renamed from: b */
    public final String mo14228b(String str) {
        try {
            return new URI(str).getHost();
        } catch (URISyntaxException e) {
            f23532a.mo25414c(String.format("Invalid URI: %s", str), new Object[0]);
            return str;
        }
    }

    /* renamed from: a */
    public final jyl mo14226a(String str) {
        String str2;
        int i;
        String cookie = this.f23533b.getCookie(str);
        String str3 = null;
        if (cookie != null) {
            String b = mo14228b(str);
            String[] split = cookie.split("\\;");
            str2 = null;
            String str4 = null;
            for (String str5 : split) {
                int indexOf = str5.indexOf(61);
                if (indexOf > 0 && (i = indexOf + 1) < str5.length()) {
                    String trim = str5.substring(0, indexOf).trim();
                    String trim2 = str5.substring(i).trim();
                    if ("oauth_token".equalsIgnoreCase(trim)) {
                        mo14227a(b, "oauth_token");
                        str3 = trim2;
                    }
                    if ("user_id".equalsIgnoreCase(trim)) {
                        mo14227a(b, "user_id");
                        str2 = trim2;
                    }
                    if ("GASC".equalsIgnoreCase(trim)) {
                        mo14227a(b, "GASC");
                        str4 = trim2;
                    }
                    if (!(str3 == null || str2 == null || str4 == null)) {
                        break;
                    }
                }
            }
        } else {
            str2 = null;
        }
        return new jyl(str3, str2);
    }

    /* renamed from: b */
    public final void mo14229b() {
        int i = Build.VERSION.SDK_INT;
        this.f23533b.removeAllCookies(null);
        this.f23533b.flush();
    }

    /* renamed from: a */
    public final void mo14227a(String str, String str2) {
        this.f23533b.setCookie(str, str2.concat("=;expires=Thu, 01 Jan 1970 00:00:00 UTC"));
    }
}
