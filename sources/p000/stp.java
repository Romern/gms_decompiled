package p000;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: stp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class stp {
    /* renamed from: a */
    public static URLConnection m36306a(URL url, int i) {
        shr.m35316b(i);
        return url.openConnection();
    }

    /* renamed from: a */
    public static void m36307a(HttpURLConnection httpURLConnection) {
        shr.m35312a();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
