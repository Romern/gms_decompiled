package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: bzsd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bzsd implements bzsq {

    /* renamed from: a */
    public final HttpURLConnection f171224a;

    /* renamed from: b */
    public final bzrx f171225b;

    /* renamed from: c */
    public byte[] f171226c;

    /* renamed from: d */
    public long f171227d;

    /* renamed from: e */
    public bzsu f171228e;

    /* renamed from: f */
    public int f171229f = -1;

    public bzsd(HttpURLConnection httpURLConnection, String str, bzsa bzsa, bzrx bzrx) {
        this.f171224a = httpURLConnection;
        try {
            httpURLConnection.setRequestMethod(str);
            httpURLConnection.setReadTimeout(300000);
            httpURLConnection.setConnectTimeout(300000);
            httpURLConnection.setDoInput(true);
            this.f171225b = bzrx;
            if (bzrx != null) {
                httpURLConnection.setDoOutput(true);
                if (bzrx.mo20326g() >= 0) {
                    long g = bzrx.mo20326g() - bzrx.mo20323d();
                    if (g < 2147483647L) {
                        httpURLConnection.setFixedLengthStreamingMode((int) g);
                    } else {
                        httpURLConnection.setFixedLengthStreamingMode(g);
                    }
                } else {
                    httpURLConnection.setChunkedStreamingMode(0);
                }
            }
            for (String str2 : bzsa.mo74558a()) {
                for (String str3 : bzsa.mo74561b(str2)) {
                    httpURLConnection.addRequestProperty(str2, str3);
                }
            }
            this.f171226c = new byte[AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE];
        } catch (ProtocolException e) {
            throw new IllegalArgumentException("Invalid http method.", e);
        }
    }

    /* renamed from: a */
    public final bqgg mo74567a() {
        bqgh a = bqgh.m112796a(new bzsc(this));
        bqha bqha = new bqha();
        bqha.mo69262a("Scotty-Uploader-HttpUrlConnectionHttpClient-%d");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(bqha.m112820a(bqha));
        newSingleThreadExecutor.submit(a);
        newSingleThreadExecutor.shutdown();
        return a;
    }

    /* renamed from: a */
    public final synchronized void mo74568a(bzsu bzsu, int i) {
        this.f171228e = bzsu;
        if (i > 0) {
            this.f171229f = i;
        }
    }

    /* renamed from: b */
    public final bzsb mo74569b() {
        InputStream inputStream;
        bzsa bzsa;
        try {
            int responseCode = this.f171224a.getResponseCode();
            try {
                inputStream = this.f171224a.getInputStream();
            } catch (IOException e) {
                inputStream = this.f171224a.getErrorStream();
            }
            Map<String, List<String>> headerFields = this.f171224a.getHeaderFields();
            if (headerFields != null) {
                bzsa = new bzsa();
                for (String str : headerFields.keySet()) {
                    if (str != null) {
                        for (String str2 : headerFields.get(str)) {
                            bzsa.mo74562b(str, str2);
                        }
                    }
                }
            } else {
                bzsa = null;
            }
            return new bzsb(responseCode, bzsa, inputStream);
        } catch (IOException e2) {
            throw new bzss(bzsr.CONNECTION_ERROR, "Error while reading response code.", e2);
        }
    }

    /* renamed from: c */
    public final boolean mo74570c() {
        try {
            return this.f171225b.mo20327h();
        } catch (IOException e) {
            throw new bzss(bzsr.REQUEST_BODY_READ_ERROR, e);
        }
    }

    /* renamed from: d */
    public final long mo74571d() {
        return this.f171227d;
    }
}
