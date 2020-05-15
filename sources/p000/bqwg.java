package p000;

import java.security.KeyFactory;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* renamed from: bqwg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqwg implements bqod {

    /* renamed from: a */
    private final RSAPrivateCrtKey f141711a;

    /* renamed from: b */
    private final RSAPublicKey f141712b;

    /* renamed from: c */
    private final String f141713c;

    public bqwg(RSAPrivateCrtKey rSAPrivateCrtKey, int i) {
        int i2 = bqwl.f141725a;
        bqwl.m113527b(rSAPrivateCrtKey.getModulus().bitLength());
        this.f141711a = rSAPrivateCrtKey;
        String a = bqvx.m113499a(i);
        StringBuilder sb = new StringBuilder(a.length() + 7);
        sb.append(a);
        sb.append("withRSA");
        this.f141713c = sb.toString();
        this.f141712b = (RSAPublicKey) ((KeyFactory) bqvo.f141695g.mo69341a("RSA")).generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
    }

    /* renamed from: a */
    public final byte[] mo69316a(byte[] bArr) {
        Signature signature = (Signature) bqvo.f141691c.mo69341a(this.f141713c);
        signature.initSign(this.f141711a);
        signature.update(bArr);
        byte[] sign = signature.sign();
        Signature signature2 = (Signature) bqvo.f141691c.mo69341a(this.f141713c);
        signature2.initVerify(this.f141712b);
        signature2.update(bArr);
        if (signature2.verify(sign)) {
            return sign;
        }
        throw new RuntimeException("Security bug: RSA signature computation error");
    }
}
