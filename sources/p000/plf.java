package p000;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import javax.net.ssl.X509TrustManager;

/* renamed from: plf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class plf implements X509TrustManager {

    /* renamed from: a */
    public static final plf[] f39582a = {new plf()};

    /* renamed from: b */
    private static final X509Certificate[] f39583b = new X509Certificate[0];

    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw new CertificateException("checkClientTrusted was called. Not supported.");
    }

    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        if (x509CertificateArr == null || x509CertificateArr.length == 0) {
            throw new IllegalArgumentException("The device certificate chain is null or empty");
        }
        int a = pkv.m30751a(Arrays.asList(x509CertificateArr));
        if (a != 0) {
            StringBuilder sb = new StringBuilder(47);
            sb.append("Untrusted device certificate, code: ");
            sb.append(a);
            throw new CertificateException(sb.toString());
        }
    }

    public final X509Certificate[] getAcceptedIssuers() {
        return f39583b;
    }
}
