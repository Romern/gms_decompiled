package p000;

import android.net.Uri;
import android.webkit.URLUtil;
import java.util.regex.Pattern;

/* renamed from: becf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class becf {

    /* renamed from: a */
    public static final Pattern f106900a = Pattern.compile("^data:[-\\w]+/[-\\w]+;base64,");

    /* renamed from: a */
    static void m91769a(Uri uri) {
        if (uri != null) {
            String trim = uri.toString().trim();
            if (!trim.isEmpty() && !bmxx.m108577a(uri.getScheme())) {
                if (!URLUtil.isNetworkUrl(trim)) {
                    Object[] objArr = {uri.getScheme(), "<REDACTED>"};
                    return;
                }
                StringBuilder sb = new StringBuilder(64);
                sb.append(uri.getScheme());
                sb.append("://");
                if (!bmxx.m108577a(uri.getHost())) {
                    sb.append(uri.getHost());
                }
                if (uri.getPort() != -1) {
                    sb.append(":");
                    sb.append(uri.getPort());
                }
                sb.append("/<REDACTED>");
                sb.toString();
            }
        }
    }
}
