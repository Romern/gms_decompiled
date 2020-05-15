package p000;

import android.webkit.CookieManager;
import java.net.URI;
import java.net.URISyntaxException;

/* renamed from: arpw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arpw {

    /* renamed from: b */
    private static final Logger f88107b = ascp.m73787a("CookieReader");

    /* renamed from: a */
    public final CookieManager f88108a = CookieManager.getInstance();

    /* renamed from: a */
    public static final String m73281a(String str) {
        try {
            String host = new URI(str).getHost();
            if (host != null) {
                return host;
            }
            f88107b.mo25414c(String.format("Invalid URI: %s", str), new Object[0]);
            return str;
        } catch (URISyntaxException e) {
            f88107b.mo25414c(String.format("Invalid URI: %s", str), new Object[0]);
            return str;
        }
    }

    /* renamed from: a */
    public final void mo48741a(String str, String str2) {
        this.f88108a.setCookie(str, str2.concat("=;expires=Thu, 01 Jan 1970 00:00:00 UTC"));
    }
}
