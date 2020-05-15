package p000;

import java.util.Arrays;
import java.util.List;

/* renamed from: cigx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cigx {

    /* renamed from: a */
    public static final cigx f190271a;

    /* renamed from: f */
    private static final cigv[] f190272f = {cigv.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, cigv.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, cigv.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, cigv.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, cigv.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, cigv.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, cigv.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, cigv.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, cigv.TLS_DHE_DSS_WITH_AES_128_CBC_SHA, cigv.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, cigv.TLS_RSA_WITH_AES_128_GCM_SHA256, cigv.TLS_RSA_WITH_AES_128_CBC_SHA, cigv.TLS_RSA_WITH_AES_256_CBC_SHA, cigv.TLS_RSA_WITH_3DES_EDE_CBC_SHA};

    /* renamed from: b */
    final boolean f190273b;

    /* renamed from: c */
    public final String[] f190274c;

    /* renamed from: d */
    public final String[] f190275d;

    /* renamed from: e */
    public final boolean f190276e;

    static {
        cigw cigw = new cigw(true);
        cigw.mo86089a(f190272f);
        cigw.mo86090a(cihk.TLS_1_2, cihk.TLS_1_1, cihk.TLS_1_0);
        cigw.mo86092b();
        f190271a = cigw.mo86088a();
        cigw cigw2 = new cigw(f190271a);
        cigw2.mo86090a(cihk.TLS_1_0);
        cigw2.mo86092b();
        cigw2.mo86088a();
        new cigw(false).mo86088a();
    }

    public cigx(cigw cigw) {
        this.f190273b = cigw.f190267a;
        this.f190274c = cigw.f190268b;
        this.f190275d = cigw.f190269c;
        this.f190276e = cigw.f190270d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cigx)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        cigx cigx = (cigx) obj;
        boolean z = this.f190273b;
        if (z == cigx.f190273b) {
            return !z || (Arrays.equals(this.f190274c, cigx.f190274c) && Arrays.equals(this.f190275d, cigx.f190275d) && this.f190276e == cigx.f190276e);
        }
        return false;
    }

    public final int hashCode() {
        if (this.f190273b) {
            return ((((Arrays.hashCode(this.f190274c) + 527) * 31) + Arrays.hashCode(this.f190275d)) * 31) + (this.f190276e ^ true ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List list;
        String str;
        if (!this.f190273b) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f190274c;
        int i = 0;
        if (strArr != null) {
            cigv[] cigvArr = new cigv[strArr.length];
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.f190274c;
                if (i2 >= strArr2.length) {
                    break;
                }
                cigvArr[i2] = cigv.m150278b(strArr2[i2]);
                i2++;
            }
            list = cihl.m150312a(cigvArr);
        } else {
            list = null;
        }
        if (list != null) {
            str = list.toString();
        } else {
            str = "[use default]";
        }
        cihk[] cihkArr = new cihk[this.f190275d.length];
        while (true) {
            String[] strArr3 = this.f190275d;
            if (i < strArr3.length) {
                cihkArr[i] = cihk.m150311a(strArr3[i]);
                i++;
            } else {
                String valueOf = String.valueOf(cihl.m150312a(cihkArr));
                boolean z = this.f190276e;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 72 + String.valueOf(valueOf).length());
                sb.append("ConnectionSpec(cipherSuites=");
                sb.append(str);
                sb.append(", tlsVersions=");
                sb.append(valueOf);
                sb.append(", supportsTlsExtensions=");
                sb.append(z);
                sb.append(")");
                return sb.toString();
            }
        }
    }
}
