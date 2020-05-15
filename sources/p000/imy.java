package p000;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Pattern;

/* renamed from: imy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class imy {

    /* renamed from: a */
    private static final Logger f21371a = new Logger("AuthUtil", "UrlChecker");

    /* renamed from: b */
    private final Pattern f21372b;

    public imy(Pattern pattern) {
        this.f21372b = pattern;
    }

    /* renamed from: a */
    public static imy m15745a(String str) {
        return new imy(Pattern.compile(str));
    }

    /* renamed from: c */
    private static final void m15746c(String str) {
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            String path = uri.getPath();
            StringBuilder sb = new StringBuilder(String.valueOf(scheme).length() + 3 + String.valueOf(host).length() + String.valueOf(path).length());
            sb.append(scheme);
            sb.append("://");
            sb.append(host);
            sb.append(path);
            String sb2 = sb.toString();
            Logger Logger = f21371a;
            String valueOf = String.valueOf(sb2);
            Logger.mo25414c(valueOf.length() == 0 ? new String("Untrusted URL: ") : "Untrusted URL: ".concat(valueOf), new Object[0]);
        } catch (URISyntaxException e) {
            Logger logger2 = f21371a;
            String valueOf2 = String.valueOf(e.getMessage());
            logger2.mo25414c(valueOf2.length() == 0 ? new String("Untrusted URL with URISyntaxException: ") : "Untrusted URL with URISyntaxException: ".concat(valueOf2), new Object[0]);
        }
    }

    /* renamed from: b */
    public final boolean mo13153b(String str) {
        if (str == null) {
            return false;
        }
        boolean find = this.f21372b.matcher(str).find();
        if (!find) {
            m15746c(str);
        }
        return find;
    }
}
