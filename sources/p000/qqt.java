package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Base64;
import java.util.Locale;

/* renamed from: qqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qqt {

    /* renamed from: a */
    private static final sek f41963a = new sek("ChromeSync", "Common", "PasswordDomains");

    /* renamed from: a */
    public static bmxv m32666a(Context context, String str) {
        try {
            byte[] c = spn.m35875c(context, str, "SHA-512");
            if (c == null) {
                return bmvz.f131120a;
            }
            return bmxv.m108566b(String.format("android://%s@%s/", Base64.encodeToString(c, 10), str));
        } catch (PackageManager.NameNotFoundException e) {
            f41963a.mo25417e("Unable to find the package: %s.", e, str);
            return bmvz.f131120a;
        }
    }

    /* renamed from: b */
    public static boolean m32668b(String str) {
        return str.toLowerCase(Locale.US).startsWith("android://");
    }

    /* renamed from: c */
    public static String m32669c(String str) {
        bmxy.m108588a(m32668b(str));
        String host = Uri.parse(str).getHost();
        bmxy.m108581a(host);
        return host;
    }

    /* renamed from: a */
    public static String m32667a(String str) {
        Uri parse = Uri.parse(str);
        if (!m32668b(str)) {
            return bmxx.m108577a(parse.getPath()) ? parse.buildUpon().path("/").toString() : str;
        }
        String scheme = parse.getScheme();
        String authority = parse.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(scheme).length() + 4 + String.valueOf(authority).length());
        sb.append(scheme);
        sb.append("://");
        sb.append(authority);
        sb.append("/");
        return sb.toString();
    }
}
