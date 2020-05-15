package p000;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* renamed from: aore */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aore {
    /* renamed from: a */
    public static void m66306a(StringBuilder sb, String str, String str2) {
        try {
            sb.append("&");
            sb.append(URLEncoder.encode(str, "UTF-8"));
            sb.append("=");
            if (str2 == null) {
                str2 = "";
            }
            sb.append(URLEncoder.encode(str2, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }
}
