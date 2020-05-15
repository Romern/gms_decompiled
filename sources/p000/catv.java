package p000;

import java.util.Arrays;
import javax.net.ssl.SSLSocket;

/* renamed from: catv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class catv {

    /* renamed from: a */
    public static final catv f175967a;

    /* renamed from: b */
    public static final catv f175968b;

    /* renamed from: c */
    public static final catv f175969c = new catu(false).mo74855a();

    /* renamed from: h */
    private static final catq[] f175970h = {catq.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, catq.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, catq.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, catq.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, catq.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, catq.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, catq.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, catq.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, catq.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, catq.TLS_RSA_WITH_AES_128_GCM_SHA256, catq.TLS_RSA_WITH_AES_128_CBC_SHA, catq.TLS_RSA_WITH_AES_256_CBC_SHA, catq.TLS_RSA_WITH_3DES_EDE_CBC_SHA};

    /* renamed from: d */
    public final boolean f175971d;

    /* renamed from: e */
    public final boolean f175972e;

    /* renamed from: f */
    public final String[] f175973f;

    /* renamed from: g */
    public final String[] f175974g;

    static {
        catu catu = new catu(true);
        catq[] catqArr = f175970h;
        if (catu.f175963a) {
            String[] strArr = new String[catqArr.length];
            for (int i = 0; i < catqArr.length; i++) {
                strArr[i] = catqArr[i].f175954aS;
            }
            catu.mo74857a(strArr);
            catu.mo74856a(cauq.TLS_1_2, cauq.TLS_1_1, cauq.TLS_1_0);
            catu.mo74858b();
            f175967a = catu.mo74855a();
            catu catu2 = new catu(f175967a);
            catu2.mo74856a(cauq.TLS_1_0);
            catu2.mo74858b();
            f175968b = catu2.mo74855a();
            return;
        }
        throw new IllegalStateException("no cipher suites for cleartext connections");
    }

    public catv(catu catu) {
        this.f175971d = catu.f175963a;
        this.f175973f = catu.f175964b;
        this.f175974g = catu.f175965c;
        this.f175972e = catu.f175966d;
    }

    /* renamed from: a */
    private static boolean m127190a(String[] strArr, String[] strArr2) {
        if (!(strArr2 == null || (r1 = strArr.length) == 0 || strArr2.length == 0)) {
            for (String str : strArr) {
                if (cavk.m127317a(strArr2, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof catv)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        catv catv = (catv) obj;
        boolean z = this.f175971d;
        if (z == catv.f175971d) {
            return !z || (Arrays.equals(this.f175973f, catv.f175973f) && Arrays.equals(this.f175974g, catv.f175974g) && this.f175972e == catv.f175972e);
        }
        return false;
    }

    public final int hashCode() {
        if (this.f175971d) {
            return ((((Arrays.hashCode(this.f175973f) + 527) * 31) + Arrays.hashCode(this.f175974g)) * 31) + (this.f175972e ^ true ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        String str;
        if (!this.f175971d) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f175973f;
        int i = 0;
        String str2 = "[all enabled]";
        if (strArr != null) {
            catq[] catqArr = new catq[strArr.length];
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.f175973f;
                if (i2 >= strArr2.length) {
                    break;
                }
                catqArr[i2] = catq.m127184b(strArr2[i2]);
                i2++;
            }
            str = cavk.m127307a(catqArr).toString();
        } else {
            str = str2;
        }
        String[] strArr3 = this.f175974g;
        if (strArr3 != null) {
            cauq[] cauqArr = new cauq[strArr3.length];
            while (true) {
                String[] strArr4 = this.f175974g;
                if (i >= strArr4.length) {
                    break;
                }
                cauqArr[i] = cauq.m127256a(strArr4[i]);
                i++;
            }
            str2 = cavk.m127307a(cauqArr).toString();
        }
        boolean z = this.f175972e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 72 + String.valueOf(str2).length());
        sb.append("ConnectionSpec(cipherSuites=");
        sb.append(str);
        sb.append(", tlsVersions=");
        sb.append(str2);
        sb.append(", supportsTlsExtensions=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo74860a(SSLSocket sSLSocket) {
        if (!this.f175971d) {
            return false;
        }
        String[] strArr = this.f175974g;
        if (strArr != null && !m127190a(strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f175973f;
        if (strArr2 == null || m127190a(strArr2, sSLSocket.getEnabledCipherSuites())) {
            return true;
        }
        return false;
    }
}
