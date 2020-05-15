package p000;

import android.webkit.URLUtil;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: aoqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aoqr {
    /* renamed from: a */
    public static final HttpURLConnection m66289a(String str, int i) {
        if (URLUtil.isHttpsUrl(str) || URLUtil.isHttpUrl(str)) {
            URLConnection a = stp.m36306a(new URL(str), i);
            URLUtil.isHttpUrl(str);
            return (HttpsURLConnection) a;
        }
        throw new MalformedURLException("Recaptcha server url only allows using Http or Https.");
    }
}
