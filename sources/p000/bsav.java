package p000;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: bsav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsav {

    /* renamed from: a */
    public final HttpURLConnection f143908a;

    /* renamed from: b */
    public final boolean f143909b;

    /* renamed from: c */
    public boolean f143910c;

    /* renamed from: d */
    public boolean f143911d;

    public bsav(String str, boolean z) {
        this.f143909b = z;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            this.f143908a = httpURLConnection;
            httpURLConnection.setConnectTimeout(30000);
            this.f143908a.setReadTimeout(30000);
            this.f143908a.setRequestProperty("User-Agent", "GoogleMobile/1.0");
            if (z) {
                this.f143908a.setDoOutput(true);
                this.f143908a.setChunkedStreamingMode(0);
            }
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 16);
            sb.append("post=");
            sb.append(z);
            sb.append(", url=");
            sb.append(str);
            IOException iOException = new IOException(sb.toString());
            iOException.initCause(e);
            throw iOException;
        }
    }

    /* renamed from: a */
    public final void mo70101a(String str, String str2) {
        if (!"Content-Length".equals(str) && !"Transfer-Encoding".equals(str)) {
            this.f143908a.setRequestProperty(str, str2);
        }
    }
}
