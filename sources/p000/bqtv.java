package p000;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;

/* renamed from: bqtv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqtv extends bqnq {
    public bqtv(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public static final bqod m113390a(bqsy bqsy) {
        bqsy bqsy2 = bqsy;
        KeyFactory keyFactory = (KeyFactory) bqvo.f141695g.mo69341a("RSA");
        bqsz bqsz = bqsy2.f141600b;
        if (bqsz == null) {
            bqsz = bqsz.f141607e;
        }
        BigInteger bigInteger = new BigInteger(1, bqsz.f141611c.getKey());
        bqsz bqsz2 = bqsy2.f141600b;
        if (bqsz2 == null) {
            bqsz2 = bqsz.f141607e;
        }
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger, new BigInteger(1, bqsz2.f141612d.getKey()), new BigInteger(1, bqsy2.f141601c.getKey()), new BigInteger(1, bqsy2.f141602d.getKey()), new BigInteger(1, bqsy2.f141603e.getKey()), new BigInteger(1, bqsy2.f141604f.getKey()), new BigInteger(1, bqsy2.f141605g.getKey()), new BigInteger(1, bqsy2.f141606h.getKey())));
        bqsz bqsz3 = bqsy2.f141600b;
        if (bqsz3 == null) {
            bqsz3 = bqsz.f141607e;
        }
        bqsx bqsx = bqsz3.f141610b;
        if (bqsx == null) {
            bqsx = bqsx.f141592d;
        }
        int b = bqry.m113304b(bqsx.f141594a);
        if (b == 0) {
            b = 1;
        }
        int a = bqua.m113406a(b);
        int b2 = bqry.m113304b(bqsx.f141595b);
        if (b2 == 0) {
            b2 = 1;
        }
        bqwi bqwi = new bqwi(rSAPrivateCrtKey, a, bqua.m113406a(b2), bqsx.f141596c);
        bqsz bqsz4 = bqsy2.f141600b;
        if (bqsz4 == null) {
            bqsz4 = bqsz.f141607e;
        }
        BigInteger bigInteger2 = new BigInteger(1, bqsz4.f141611c.getKey());
        bqsz bqsz5 = bqsy2.f141600b;
        if (bqsz5 == null) {
            bqsz5 = bqsz.f141607e;
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger2, new BigInteger(1, bqsz5.f141612d.getKey())));
        int b3 = bqry.m113304b(bqsx.f141594a);
        if (b3 == 0) {
            b3 = 1;
        }
        int a2 = bqua.m113406a(b3);
        int b4 = bqry.m113304b(bqsx.f141595b);
        if (b4 == 0) {
            b4 = 1;
        }
        bqwj bqwj = new bqwj(rSAPublicKey, a2, bqua.m113406a(b4), bqsx.f141596c);
        try {
            byte[] a3 = bqwi.mo69316a(bqtx.f141621c);
            byte[] bArr = bqtx.f141621c;
            BigInteger publicExponent = bqwj.f141721a.getPublicExponent();
            BigInteger modulus = bqwj.f141721a.getModulus();
            int bitLength = modulus.bitLength();
            int bitLength2 = (modulus.bitLength() + 6) / 8;
            if ((bitLength + 7) / 8 == a3.length) {
                BigInteger a4 = bqwk.m113520a(a3);
                if (a4.compareTo(modulus) < 0) {
                    byte[] a5 = bqwk.m113522a(a4.modPow(publicExponent, modulus), bitLength2);
                    int bitLength3 = modulus.bitLength() - 1;
                    int i = bqwl.f141725a;
                    MessageDigest messageDigest = (MessageDigest) bqvo.f141692d.mo69341a(bqwk.m113524b(bqwj.f141723c));
                    byte[] digest = messageDigest.digest(bArr);
                    int digestLength = messageDigest.getDigestLength();
                    int length = a5.length;
                    if (length < bqwj.f141722b + digestLength + 2) {
                        throw new GeneralSecurityException("inconsistent");
                    } else if (a5[length - 1] == -68) {
                        int i2 = length - digestLength;
                        int i3 = i2 - 1;
                        byte[] copyOf = Arrays.copyOf(a5, i3);
                        int length2 = copyOf.length;
                        byte[] copyOfRange = Arrays.copyOfRange(a5, length2, length2 + digestLength);
                        int i4 = 0;
                        while (true) {
                            int i5 = i2;
                            byte[] bArr2 = copyOf;
                            long j = (((long) length) * 8) - ((long) bitLength3);
                            if (((long) i4) >= j) {
                                byte[] a6 = bqwk.m113523a(copyOfRange, i3, bqwj.f141724d);
                                int length3 = a6.length;
                                byte[] bArr3 = new byte[length3];
                                for (int i6 = 0; i6 < length3; i6++) {
                                    bArr3[i6] = (byte) (a6[i6] ^ bArr2[i6]);
                                }
                                for (int i7 = 0; ((long) i7) <= j; i7++) {
                                    int i8 = i7 / 8;
                                    bArr3[i8] = (byte) (bArr3[i8] & ((1 << (7 - (i7 % 8))) ^ -1));
                                }
                                int i9 = 0;
                                while (true) {
                                    int i10 = bqwj.f141722b;
                                    int i11 = (i5 - i10) - 2;
                                    if (i9 >= i11) {
                                        if (bArr3[i11] == 1) {
                                            byte[] copyOfRange2 = Arrays.copyOfRange(bArr3, length3 - i10, length3);
                                            int i12 = digestLength + 8;
                                            byte[] bArr4 = new byte[(bqwj.f141722b + i12)];
                                            System.arraycopy(digest, 0, bArr4, 8, digest.length);
                                            System.arraycopy(copyOfRange2, 0, bArr4, i12, copyOfRange2.length);
                                            if (bqup.m113432a(messageDigest.digest(bArr4), copyOfRange)) {
                                                return bqwi;
                                            }
                                            throw new GeneralSecurityException("inconsistent");
                                        }
                                        throw new GeneralSecurityException("inconsistent");
                                    } else if (bArr3[i9] == 0) {
                                        i9++;
                                    } else {
                                        throw new GeneralSecurityException("inconsistent");
                                    }
                                }
                            } else if (((bArr2[i4 / 8] >> (7 - (i4 % 8))) & 1) == 0) {
                                i4++;
                                i2 = i5;
                                copyOf = bArr2;
                            } else {
                                throw new GeneralSecurityException("inconsistent");
                            }
                        }
                    } else {
                        throw new GeneralSecurityException("inconsistent");
                    }
                } else {
                    throw new GeneralSecurityException("signature out of range");
                }
            } else {
                throw new GeneralSecurityException("invalid signature's length");
            }
        } catch (GeneralSecurityException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 83);
            sb.append("Security bug: signing with private key followed by verifying with public key failed");
            sb.append(valueOf);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo69296a(Object obj) {
        return m113390a((bqsy) obj);
    }
}
