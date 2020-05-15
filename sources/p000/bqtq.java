package p000;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;

/* renamed from: bqtq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqtq extends bqnq {
    public bqtq(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public static final bqod m113374a(bqsu bqsu) {
        byte[] bArr;
        KeyFactory keyFactory = (KeyFactory) bqvo.f141695g.mo69341a("RSA");
        bqsv bqsv = bqsu.f141574b;
        if (bqsv == null) {
            bqsv = bqsv.f141581e;
        }
        BigInteger bigInteger = new BigInteger(1, bqsv.f141585c.getKey());
        bqsv bqsv2 = bqsu.f141574b;
        if (bqsv2 == null) {
            bqsv2 = bqsv.f141581e;
        }
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger, new BigInteger(1, bqsv2.f141586d.getKey()), new BigInteger(1, bqsu.f141575c.getKey()), new BigInteger(1, bqsu.f141576d.getKey()), new BigInteger(1, bqsu.f141577e.getKey()), new BigInteger(1, bqsu.f141578f.getKey()), new BigInteger(1, bqsu.f141579g.getKey()), new BigInteger(1, bqsu.f141580h.getKey())));
        bqsv bqsv3 = bqsu.f141574b;
        if (bqsv3 == null) {
            bqsv3 = bqsv.f141581e;
        }
        bqst bqst = bqsv3.f141584b;
        if (bqst == null) {
            bqst = bqst.f141568b;
        }
        int b = bqry.m113304b(bqst.f141570a);
        if (b == 0) {
            b = 1;
        }
        bqwg bqwg = new bqwg(rSAPrivateCrtKey, bqua.m113406a(b));
        bqsv bqsv4 = bqsu.f141574b;
        if (bqsv4 == null) {
            bqsv4 = bqsv.f141581e;
        }
        BigInteger bigInteger2 = new BigInteger(1, bqsv4.f141585c.getKey());
        bqsv bqsv5 = bqsu.f141574b;
        if (bqsv5 == null) {
            bqsv5 = bqsv.f141581e;
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger2, new BigInteger(1, bqsv5.f141586d.getKey())));
        bqsv bqsv6 = bqsu.f141574b;
        if (bqsv6 == null) {
            bqsv6 = bqsv.f141581e;
        }
        bqst bqst2 = bqsv6.f141584b;
        if (bqst2 == null) {
            bqst2 = bqst.f141568b;
        }
        int b2 = bqry.m113304b(bqst2.f141570a);
        if (b2 == 0) {
            b2 = 1;
        }
        bqwh bqwh = new bqwh(rSAPublicKey, bqua.m113406a(b2));
        try {
            byte[] a = bqwg.mo69316a(bqts.f141620c);
            byte[] bArr2 = bqts.f141620c;
            BigInteger publicExponent = bqwh.f141714a.getPublicExponent();
            BigInteger modulus = bqwh.f141714a.getModulus();
            int bitLength = (modulus.bitLength() + 7) / 8;
            if (bitLength == a.length) {
                BigInteger a2 = bqwk.m113520a(a);
                if (a2.compareTo(modulus) < 0) {
                    byte[] a3 = bqwk.m113522a(a2.modPow(publicExponent, modulus), bitLength);
                    int i = bqwh.f141715b;
                    int i2 = bqwl.f141725a;
                    MessageDigest messageDigest = (MessageDigest) bqvo.f141692d.mo69341a(bqwk.m113524b(bqwh.f141715b));
                    messageDigest.update(bArr2);
                    byte[] digest = messageDigest.digest();
                    int i3 = i - 1;
                    if (i3 == 1) {
                        bArr = bqvz.m113508a("3031300d060960864801650304020105000420");
                    } else if (i3 == 3) {
                        bArr = bqvz.m113508a("3051300d060960864801650304020305000440");
                    } else {
                        String a4 = bqvx.m113499a(i);
                        StringBuilder sb = new StringBuilder(a4.length() + 17);
                        sb.append("Unsupported hash ");
                        sb.append(a4);
                        throw new GeneralSecurityException(sb.toString());
                    }
                    int length = bArr.length + digest.length;
                    if (bitLength >= length + 11) {
                        byte[] bArr3 = new byte[bitLength];
                        bArr3[0] = 0;
                        bArr3[1] = 1;
                        int i4 = 2;
                        int i5 = 0;
                        while (i5 < (bitLength - length) - 3) {
                            bArr3[i4] = -1;
                            i5++;
                            i4++;
                        }
                        int i6 = i4 + 1;
                        bArr3[i4] = 0;
                        int length2 = bArr.length;
                        System.arraycopy(bArr, 0, bArr3, i6, length2);
                        System.arraycopy(digest, 0, bArr3, i6 + length2, digest.length);
                        if (bqup.m113432a(a3, bArr3)) {
                            return bqwg;
                        }
                        throw new GeneralSecurityException("invalid signature");
                    }
                    throw new GeneralSecurityException("intended encoded message length too short");
                }
                throw new GeneralSecurityException("signature out of range");
            }
            throw new GeneralSecurityException("invalid signature's length");
        } catch (GeneralSecurityException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 83);
            sb2.append("Security bug: signing with private key followed by verifying with public key failed");
            sb2.append(valueOf);
            throw new RuntimeException(sb2.toString());
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo69296a(Object obj) {
        return m113374a((bqsu) obj);
    }
}
