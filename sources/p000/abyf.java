package p000;

import android.net.Uri;
import android.webkit.URLUtil;

/* renamed from: abyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abyf {
    /* renamed from: a */
    public static void m48535a(String str) {
        sdo.m34959a((Object) str);
        Uri parse = Uri.parse(str);
        if (parse == null || !parse.isAbsolute()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
            sb.append("Invalid String passed as URL: '");
            sb.append(str);
            sb.append("'.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    public static void m48536b(String str) {
        sdo.m34959a((Object) str);
        if (!URLUtil.isHttpUrl(str) && !URLUtil.isHttpsUrl(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42);
            sb.append("Web URL must use http or https scheme: '");
            sb.append(str);
            sb.append("'.");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
