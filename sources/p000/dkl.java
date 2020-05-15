package p000;

import java.security.cert.X509Certificate;

/* renamed from: dkl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dkl extends dkm {

    /* renamed from: a */
    private final byte[] f13416a;

    public dkl(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f13416a = bArr;
    }

    public final byte[] getEncoded() {
        return this.f13416a;
    }
}
