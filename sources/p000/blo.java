package p000;

import java.security.cert.X509Certificate;

/* renamed from: blo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class blo extends blp {

    /* renamed from: a */
    private final byte[] f5113a;

    public blo(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f5113a = bArr;
    }

    public final byte[] getEncoded() {
        return this.f5113a;
    }
}
