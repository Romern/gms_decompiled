package p000;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: qcd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qcd implements X509TrustManager {

    /* renamed from: a */
    private final X509TrustManager f40918a;

    public qcd(X509TrustManager x509TrustManager) {
        this.f40918a = x509TrustManager;
    }

    /* renamed from: a */
    private static X509Certificate[] m31840a(X509Certificate[] x509CertificateArr) {
        X509Certificate[] x509CertificateArr2 = new X509Certificate[x509CertificateArr.length];
        for (int i = 0; i < x509CertificateArr.length; i++) {
            x509CertificateArr2[i] = new qcc(x509CertificateArr[i]);
        }
        return x509CertificateArr2;
    }

    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.f40918a.checkClientTrusted(m31840a(x509CertificateArr), str);
    }

    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.f40918a.checkServerTrusted(m31840a(x509CertificateArr), str);
    }

    public final X509Certificate[] getAcceptedIssuers() {
        return this.f40918a.getAcceptedIssuers();
    }
}
