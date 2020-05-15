package p000;

import android.net.TrafficStats;
import com.felicanetworks.cmnctrl.net.DataParser;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: qce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qce {

    /* renamed from: c */
    private static final sek f40919c = qgn.m32143a("AuthdNetTimeProvider");

    /* renamed from: a */
    public int f40920a;

    /* renamed from: b */
    public int f40921b;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo23909a(HttpURLConnection httpURLConnection, X509TrustManager x509TrustManager, qdu qdu, long j) {
        qdu qdu2 = qdu;
        long j2 = j;
        if (qdu2.f41039i) {
            shr.m35316b(1032);
        } else {
            TrafficStats.setThreadStatsTag(1032);
        }
        qcd qcd = new qcd(x509TrustManager);
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init(null, new TrustManager[]{qcd}, null);
            SSLSocketFactory socketFactory = instance.getSocketFactory();
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            httpsURLConnection.setSSLSocketFactory(socketFactory);
            httpsURLConnection.setConnectTimeout(this.f40920a);
            httpsURLConnection.setReadTimeout(this.f40921b);
            httpsURLConnection.setInstanceFollowRedirects(false);
            httpsURLConnection.setUseCaches(false);
            httpsURLConnection.setRequestMethod(DataParser.CONNECT_TYPE_POST);
            httpsURLConnection.setRequestProperty("Content-type", "application/x-protobuffer");
            httpsURLConnection.setRequestProperty("Content-encoding", "gzip");
            httpsURLConnection.setRequestProperty("Accept-encoding", "gzip");
            httpsURLConnection.setDoOutput(true);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(httpsURLConnection.getOutputStream());
            bxvd da = qhg.f41336o.mo74144da();
            qhf qhf = qhf.f41317r;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            qhg qhg = (qhg) da.f164949b;
            qhf.getClass();
            qhg.f41339b = qhf;
            int i = qhg.f41338a | 1;
            qhg.f41338a = i;
            qhj qhj = qdu2.f41046p;
            if (qhj != null) {
                qhj.getClass();
                qhg.f41349l = qhj;
                qhg.f41338a = i | 2048;
                sek sek = f40919c;
                Object[] objArr = new Object[2];
                int a = qhi.m32172a(qhj.f41357b);
                if (a == 0) {
                    a = 1;
                }
                objArr[0] = Integer.valueOf(a - 1);
                objArr[1] = Integer.valueOf(qhj.f41358c);
                sek.mo25414c("Checkin reason type: %d attempt count: %d.", objArr);
            }
            bxvd da2 = qgu.f41220A.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            qgu qgu = (qgu) da2.f164949b;
            qhg qhg2 = (qhg) da.mo74062i();
            qhg2.getClass();
            qgu.f41235l = qhg2;
            qgu.f41224a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            ((qgu) da2.mo74062i()).mo73638a(gZIPOutputStream);
            gZIPOutputStream.close();
            try {
                qgv a2 = qdd.m31904a(qdu2, httpsURLConnection, httpsURLConnection.getResponseCode());
                if ((a2.f41252a & 2) != 0) {
                    long j3 = a2.f41254c;
                    f40919c.mo25412b("Network time: %d", Long.valueOf(j3));
                    Certificate[] serverCertificates = httpsURLConnection.getServerCertificates();
                    long j4 = Long.MAX_VALUE;
                    long j5 = Long.MIN_VALUE;
                    for (Certificate certificate : serverCertificates) {
                        if (certificate instanceof X509Certificate) {
                            X509Certificate x509Certificate = (X509Certificate) certificate;
                            Date notBefore = x509Certificate.getNotBefore();
                            if (notBefore != null) {
                                long time = notBefore.getTime();
                                if (time > j5) {
                                    j5 = time;
                                }
                            }
                            Date notAfter = x509Certificate.getNotAfter();
                            if (notAfter != null) {
                                long time2 = notAfter.getTime();
                                if (time2 < j4) {
                                    j4 = time2;
                                }
                            }
                        }
                    }
                    if (j3 > j4) {
                        SSLHandshakeException sSLHandshakeException = new SSLHandshakeException("Server certificate chain invalid");
                        String valueOf = String.valueOf(new Date(j4));
                        String valueOf2 = String.valueOf(new Date(j3));
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 59 + String.valueOf(valueOf2).length());
                        sb.append("Server certificate chain expired. NotAfter: ");
                        sb.append(valueOf);
                        sb.append(", server time: ");
                        sb.append(valueOf2);
                        throw ((SSLHandshakeException) sSLHandshakeException.initCause(new CertificateExpiredException(sb.toString())));
                    } else if (j3 < j5) {
                        SSLHandshakeException sSLHandshakeException2 = new SSLHandshakeException("Server certificate chain invalid");
                        String valueOf3 = String.valueOf(new Date(j5));
                        String valueOf4 = String.valueOf(new Date(j3));
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 66 + String.valueOf(valueOf4).length());
                        sb2.append("Server certificate chain not yet valid. NotBefore: ");
                        sb2.append(valueOf3);
                        sb2.append(", server time: ");
                        sb2.append(valueOf4);
                        throw ((SSLHandshakeException) sSLHandshakeException2.initCause(new CertificateNotYetValidException(sb2.toString())));
                    } else if (j3 > j2) {
                        qdd.m31906a(httpsURLConnection);
                        return j3;
                    } else {
                        String valueOf5 = String.valueOf(new Date(j2));
                        String valueOf6 = String.valueOf(new Date(j3));
                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf5).length() + 72 + String.valueOf(valueOf6).length());
                        sb3.append("Timestamp returned by server is in the past. Known past: ");
                        sb3.append(valueOf5);
                        sb3.append(", server time: ");
                        sb3.append(valueOf6);
                        throw new IOException(sb3.toString());
                    }
                } else {
                    throw new IOException("No timestamp in checkin server response");
                }
            } finally {
                stp.m36307a(httpsURLConnection);
                shr.m35312a();
            }
        } catch (KeyManagementException | NoSuchAlgorithmException e) {
            throw new IOException("Failed to initialize SSLContext", e);
        }
    }

    /* renamed from: a */
    public final long mo23910a(HttpURLConnection httpURLConnection, qdu qdu, long j) {
        X509TrustManager x509TrustManager;
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            int length = trustManagers.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    x509TrustManager = null;
                    break;
                }
                TrustManager trustManager = trustManagers[i];
                if (trustManager instanceof X509TrustManager) {
                    x509TrustManager = (X509TrustManager) trustManager;
                    break;
                }
                i++;
            }
            if (x509TrustManager != null) {
                return mo23909a(httpURLConnection, x509TrustManager, qdu, j);
            }
            throw new IOException("No default X.509 TrustManager installed");
        } catch (KeyStoreException | NoSuchAlgorithmException e) {
            throw new IOException("Failed to obtain default X.509 TrustManager", e);
        }
    }
}
