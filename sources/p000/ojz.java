package p000;

import java.io.ByteArrayInputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;

/* renamed from: ojz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ojz implements X509KeyManager {

    /* renamed from: a */
    public final X509TrustManager f37823a;

    /* renamed from: b */
    private final PrivateKey f37824b;

    /* renamed from: c */
    private final X509Certificate f37825c;

    /* renamed from: d */
    private final X509Certificate f37826d;

    public ojz(PrivateKey privateKey, String str) {
        CertificateFactory instance = CertificateFactory.getInstance("X.509");
        bnsn bnsn = oka.f37827a;
        instance.getProvider();
        this.f37825c = (X509Certificate) instance.generateCertificate(new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8)));
        this.f37826d = (X509Certificate) instance.generateCertificate(new ByteArrayInputStream("-----BEGIN CERTIFICATE-----\nMIIDiTCCAnGgAwIBAgIJAMFO56WkVE1CMA0GCSqGSIb3DQEBBQUAMFsxCzAJBgNV\nBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlhMRYwFAYDVQQHDA1Nb3VudGFpbiBW\naWV3MR8wHQYDVQQKDBZHb29nbGUgQXV0b21vdGl2ZSBMaW5rMB4XDTE0MDYwNjE4\nMjgxOVoXDTQ0MDYwNTE4MjgxOVowWzELMAkGA1UEBhMCVVMxEzARBgNVBAgMCkNh\nbGlmb3JuaWExFjAUBgNVBAcMDU1vdW50YWluIFZpZXcxHzAdBgNVBAoMFkdvb2ds\nZSBBdXRvbW90aXZlIExpbmswggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIB\nAQDUH+iIbwwVb74NdI5eBv/ACFmh4ml/NOW7gUVWdYX50n8uQQsHHLCNIhk5VV2H\nhanvAZ/XXHPuVAPadE2HpnNqePKF/RDo4eJo/+rOief8gBYq/Z+OQTZeLdNm+GoI\nHBrEjU4Ms8IdLuFW0jF8LlIRgekjLHpc7duUl3QpwBlmAWQK40T/SZjprlmhyqfJ\ng1rxFdnGbrSibmCsTmb3m6WZyZUyrcwmd7t6q3pHbMABO+o02asPG/YPj/SJo4+i\nfb5/Nk56f3hH9pBiPKQXJnVUdVLKMXSRgydDBsGSBol4C0JL77MNDrMR5jdafJ4j\nmWmsa2+mnzoAv9AxEL9T0LiNAgMBAAGjUDBOMB0GA1UdDgQWBBS5dqvv8DPQiwrM\nfgn8xKR91k7wgjAfBgNVHSMEGDAWgBS5dqvv8DPQiwrMfgn8xKR91k7wgjAMBgNV\nHRMEBTADAQH/MA0GCSqGSIb3DQEBBQUAA4IBAQDKcnBsrbB0Jbz2VGJKP2lwYB6P\ndCTCCpQu7dVp61UQOX+zWfd2hnNMnLs/r1xPO+eyN0vmw7sD05phaIhbXVauKWZi\n9WqWHTaR+9s6CTyBOc1Mye0DMj+4vHt+WLmf0lYjkYUVYvR1EImX8ktXzkVmOqn+\ne30siqlZ8pQpsOgegIKfJ+pNQM8c3eXVv3KFMUgjZW33SziZL8IMsLvSO+1LtH37\nKqbTEMP6XUwVuZopgGvaHU74eT/WSRGlL7vX4OL5/UXXP4qsGH2Zp7uQlErv4H9j\nkMs37UL1vGb4M8RM7Eyu9/RulepSmqZUF+3i+3eby8iGq/3OWk9wgJf7AXnx\n-----END CERTIFICATE-----\n".getBytes(StandardCharsets.UTF_8)));
        this.f37824b = privateKey;
        KeyStore instance2 = KeyStore.getInstance(KeyStore.getDefaultType());
        X509TrustManager x509TrustManager = null;
        instance2.load(null, null);
        instance2.setCertificateEntry("GAL", this.f37826d);
        TrustManagerFactory instance3 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance3.init(instance2);
        TrustManager[] trustManagers = instance3.getTrustManagers();
        int length = trustManagers.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            TrustManager trustManager = trustManagers[i];
            if (trustManager instanceof X509TrustManager) {
                x509TrustManager = (X509TrustManager) trustManager;
                break;
            }
            i++;
        }
        if (x509TrustManager == null) {
            String valueOf = String.valueOf(Arrays.toString(trustManagers));
            throw new KeyManagementException(valueOf.length() == 0 ? new String("No X509TrustManager in among default TrustManagers: ") : "No X509TrustManager in among default TrustManagers: ".concat(valueOf));
        } else {
            this.f37823a = x509TrustManager;
        }
    }

    public final String chooseClientAlias(String[] strArr, Principal[] principalArr, Socket socket) {
        throw new UnsupportedOperationException("client alias should not be requested for server side");
    }

    public final String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
        if (str.equals("RSA")) {
            return "com.google.android.gms.car";
        }
        return null;
    }

    public final X509Certificate[] getCertificateChain(String str) {
        if (!str.equals("com.google.android.gms.car")) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Certificates requested for an unknown server alias ") : "Certificates requested for an unknown server alias ".concat(valueOf));
        }
        return new X509Certificate[]{this.f37825c, this.f37826d};
    }

    public final String[] getClientAliases(String str, Principal[] principalArr) {
        throw new UnsupportedOperationException("client aliases should not be requested for server side");
    }

    public final PrivateKey getPrivateKey(String str) {
        return this.f37824b;
    }

    public final String[] getServerAliases(String str, Principal[] principalArr) {
        if (!str.equals("RSA")) {
            return new String[0];
        }
        return new String[]{"com.google.android.gms.car"};
    }
}
