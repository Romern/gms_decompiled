package p000;

import java.io.BufferedOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPOutputStream;

/* renamed from: anix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anix implements aniz {

    /* renamed from: a */
    private final aniw f76982a;

    public anix(aniw aniw) {
        this.f76982a = aniw;
    }

    /* renamed from: a */
    public final aniy mo25221a(bqzd bqzd, String str, String str2) {
        aniy aniy;
        String valueOf = String.valueOf(this.f76982a.f76981a);
        int a = bqyo.m113771a(bqzd.f142024e);
        if (a == 0) {
            a = 1;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append(valueOf);
        sb.append("?r=");
        sb.append(a - 1);
        String sb2 = sb.toString();
        if (cgem.m144893h()) {
            String valueOf2 = String.valueOf(sb2);
            int i = bqzd.f142026g;
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 14);
            sb3.append(valueOf2);
            sb3.append("&c=");
            sb3.append(i);
            sb2 = sb3.toString();
        }
        URL url = new URL(sb2);
        if (cgec.m144828c() || "https".equals(url.getProtocol())) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            try {
                httpURLConnection.setConnectTimeout(Math.max((int) cgem.m144887b(), 30000));
                httpURLConnection.setReadTimeout(Math.max((int) cgem.f186663a.mo6606a().mo83557n(), 30000));
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestProperty("Content-Type", "application/x-protobuf");
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                if (str2 != null && !str2.isEmpty()) {
                    httpURLConnection.setRequestProperty("X-SERVER-TOKEN", str2);
                }
                if (str != null && !str.isEmpty()) {
                    httpURLConnection.setRequestProperty("Authorization", str.length() == 0 ? new String("Bearer ") : "Bearer ".concat(str));
                }
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new BufferedOutputStream(httpURLConnection.getOutputStream()));
                bqzd.mo73638a(gZIPOutputStream);
                gZIPOutputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode >= 200 && responseCode < 300) {
                    aniy = aniy.m64552a((bqze) GeneratedMessageLite.m124016a(bqze.f142028f, boav.m111020a(httpURLConnection.getInputStream()), bxus.m123744c()), httpURLConnection.getHeaderFieldInt("Retry-After", 0), responseCode);
                } else if (responseCode != 401) {
                    aniy = aniy.m64551a(responseCode);
                } else {
                    aniy = aniy.m64550a();
                }
                return aniy;
            } finally {
                httpURLConnection.disconnect();
            }
        } else {
            String valueOf3 = String.valueOf(this.f76982a.f76981a);
            throw new IllegalArgumentException(valueOf3.length() == 0 ? new String("Cannot contact server without HTTPS: ") : "Cannot contact server without HTTPS: ".concat(valueOf3));
        }
    }
}
