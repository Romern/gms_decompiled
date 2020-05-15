package p000;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import javax.net.ssl.X509TrustManager;

/* renamed from: pif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pif implements X509TrustManager {

    /* renamed from: a */
    public static final pif[] f39208a = {new pif()};

    /* renamed from: b */
    private static final X509Certificate[] f39209b = new X509Certificate[0];

    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw new CertificateException("checkClientTrusted was called. Not supported.");
    }

    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        int length = x509CertificateArr.length;
        if (length == 1) {
            X509Certificate x509Certificate = x509CertificateArr[0];
            x509Certificate.checkValidity();
            if (x509Certificate.getNotAfter().after(new Date(new Date().getTime() + 172800000))) {
                DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(3, 3);
                dateTimeInstance.setTimeZone(TimeZone.getTimeZone("UTC"));
                throw new CertificateException(String.format("Peer certificate has excessive lifetime. notBefore=%s, notAfter=%s.", dateTimeInstance.format(x509Certificate.getNotBefore()), dateTimeInstance.format(x509Certificate.getNotAfter())));
            }
            return;
        }
        throw new CertificateException(String.format(Locale.ROOT, "checkServerTrusted called with chain.length of %d (should be 1)", Integer.valueOf(length)));
    }

    public final X509Certificate[] getAcceptedIssuers() {
        return f39209b;
    }
}
