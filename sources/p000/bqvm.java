package p000;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* renamed from: bqvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqvm {
    /* renamed from: a */
    public static BigInteger m113474a(BigInteger bigInteger, boolean z, EllipticCurve ellipticCurve) {
        BigInteger bigInteger2;
        BigInteger a = m113475a(ellipticCurve);
        BigInteger mod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(a);
        if (a.signum() == 1) {
            BigInteger mod2 = mod.mod(a);
            if (mod2.equals(BigInteger.ZERO)) {
                bigInteger2 = BigInteger.ZERO;
            } else {
                BigInteger bigInteger3 = null;
                if (!a.testBit(0) || !a.testBit(1)) {
                    if (a.testBit(0) && !a.testBit(1)) {
                        BigInteger bigInteger4 = BigInteger.ONE;
                        BigInteger shiftRight = a.subtract(BigInteger.ONE).shiftRight(1);
                        int i = 0;
                        while (true) {
                            BigInteger mod3 = bigInteger4.multiply(bigInteger4).subtract(mod2).mod(a);
                            if (mod3.equals(BigInteger.ZERO)) {
                                bigInteger2 = bigInteger4;
                                break;
                            }
                            BigInteger modPow = mod3.modPow(shiftRight, a);
                            if (modPow.add(BigInteger.ONE).equals(a)) {
                                BigInteger shiftRight2 = a.add(BigInteger.ONE).shiftRight(1);
                                BigInteger bigInteger5 = BigInteger.ONE;
                                BigInteger bigInteger6 = bigInteger4;
                                for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                    BigInteger multiply = bigInteger6.multiply(bigInteger5);
                                    BigInteger mod4 = bigInteger6.multiply(bigInteger6).add(bigInteger5.multiply(bigInteger5).mod(a).multiply(mod3)).mod(a);
                                    BigInteger mod5 = multiply.add(multiply).mod(a);
                                    if (shiftRight2.testBit(bitLength)) {
                                        BigInteger mod6 = mod4.multiply(bigInteger4).add(mod5.multiply(mod3)).mod(a);
                                        bigInteger5 = bigInteger4.multiply(mod5).add(mod4).mod(a);
                                        bigInteger6 = mod6;
                                    } else {
                                        bigInteger6 = mod4;
                                        bigInteger5 = mod5;
                                    }
                                }
                                bigInteger3 = bigInteger6;
                            } else if (modPow.equals(BigInteger.ONE)) {
                                bigInteger4 = bigInteger4.add(BigInteger.ONE);
                                i++;
                                if (i == 128 && !a.isProbablePrime(80)) {
                                    throw new InvalidAlgorithmParameterException("p is not prime");
                                }
                            } else {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                        }
                    }
                } else {
                    bigInteger3 = mod2.modPow(a.add(BigInteger.ONE).shiftRight(2), a);
                }
                if (bigInteger3 == null || bigInteger3.multiply(bigInteger3).mod(a).compareTo(mod2) == 0) {
                    bigInteger2 = bigInteger3;
                } else {
                    throw new GeneralSecurityException("Could not find a modular square root");
                }
            }
            return z != bigInteger2.testBit(0) ? a.subtract(bigInteger2).mod(a) : bigInteger2;
        }
        throw new InvalidAlgorithmParameterException("p must be positive");
    }

    /* renamed from: b */
    public static int m113485b(EllipticCurve ellipticCurve) {
        return (m113475a(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    /* renamed from: b */
    public static KeyPair m113486b(int i) {
        return m113476a(m113479a(i));
    }

    /* renamed from: b */
    public static ECPoint m113487b(int i, byte[] bArr) {
        EllipticCurve curve = m113479a(1).getCurve();
        int b = m113485b(curve);
        boolean z = false;
        if (i - 1 != 0) {
            BigInteger a = m113475a(curve);
            int length = bArr.length;
            if (length == b + 1) {
                byte b2 = bArr[0];
                if (b2 != 2) {
                    if (b2 == 3) {
                        z = true;
                    } else {
                        throw new GeneralSecurityException("invalid format");
                    }
                }
                BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, length));
                if (bigInteger.signum() != -1 && bigInteger.compareTo(a) < 0) {
                    return new ECPoint(bigInteger, m113474a(bigInteger, z, curve));
                }
                throw new GeneralSecurityException("x is out of range");
            }
            throw new GeneralSecurityException("compressed point has wrong length");
        }
        int length2 = bArr.length;
        if (length2 != b + b + 1) {
            throw new GeneralSecurityException("invalid point size");
        } else if (bArr[0] == 4) {
            int i2 = b + 1;
            ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i2)), new BigInteger(1, Arrays.copyOfRange(bArr, i2, length2)));
            m113482a(eCPoint, curve);
            return eCPoint;
        } else {
            throw new GeneralSecurityException("invalid point format");
        }
    }

    /* renamed from: a */
    public static BigInteger m113475a(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    /* renamed from: a */
    public static KeyPair m113476a(ECParameterSpec eCParameterSpec) {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) bqvo.f141694f.mo69341a("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    /* renamed from: a */
    public static ECPrivateKey m113477a(int i, byte[] bArr) {
        return (ECPrivateKey) ((KeyFactory) bqvo.f141695g.mo69341a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), m113479a(i)));
    }

    /* renamed from: a */
    public static ECPublicKey m113478a(int i, byte[] bArr, byte[] bArr2) {
        ECParameterSpec a = m113479a(i);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        m113482a(eCPoint, a.getCurve());
        return (ECPublicKey) ((KeyFactory) bqvo.f141695g.mo69341a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, a));
    }

    /* renamed from: a */
    public static ECParameterSpec m113479a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return m113480a("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
        }
        if (i2 != 1) {
            return m113480a("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
        }
        return m113480a("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
    }

    /* renamed from: a */
    private static ECParameterSpec m113480a(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }

    /* renamed from: a */
    static void m113481a(ECPublicKey eCPublicKey) {
        m113482a(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
    }

    /* renamed from: a */
    static void m113482a(ECPoint eCPoint, EllipticCurve ellipticCurve) {
        BigInteger a = m113475a(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw new GeneralSecurityException("point is at infinity");
        } else if (affineX.signum() == -1 || affineX.compareTo(a) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        } else if (affineY.signum() == -1 || affineY.compareTo(a) >= 0) {
            throw new GeneralSecurityException("y is out of range");
        } else if (!affineY.multiply(affineY).mod(a).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(a))) {
            throw new GeneralSecurityException("Point is not on curve");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bqvm.a(java.math.BigInteger, boolean, java.security.spec.EllipticCurve):java.math.BigInteger
     arg types: [java.math.BigInteger, int, java.security.spec.EllipticCurve]
     candidates:
      bqvm.a(int, byte[], byte[]):java.security.interfaces.ECPublicKey
      bqvm.a(java.security.spec.EllipticCurve, int, java.security.spec.ECPoint):byte[]
      bqvm.a(java.math.BigInteger, boolean, java.security.spec.EllipticCurve):java.math.BigInteger */
    /* renamed from: a */
    public static byte[] m113483a(ECPrivateKey eCPrivateKey, ECPoint eCPoint) {
        m113482a(eCPoint, eCPrivateKey.getParams().getCurve());
        PublicKey generatePublic = ((KeyFactory) bqvo.f141695g.mo69341a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, eCPrivateKey.getParams()));
        KeyAgreement keyAgreement = (KeyAgreement) bqvo.f141693e.mo69341a("ECDH");
        keyAgreement.init(eCPrivateKey);
        try {
            keyAgreement.doPhase(generatePublic, true);
            byte[] generateSecret = keyAgreement.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger = new BigInteger(1, generateSecret);
            if (bigInteger.signum() == -1 || bigInteger.compareTo(m113475a(curve)) >= 0) {
                throw new GeneralSecurityException("shared secret is out of range");
            }
            m113474a(bigInteger, true, curve);
            return generateSecret;
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException(e.toString());
        }
    }

    /* renamed from: a */
    public static byte[] m113484a(EllipticCurve ellipticCurve, int i, ECPoint eCPoint) {
        m113482a(eCPoint, ellipticCurve);
        int b = m113485b(ellipticCurve);
        int i2 = i - 1;
        if (i2 == 0) {
            int i3 = b + b + 1;
            byte[] bArr = new byte[i3];
            byte[] byteArray = eCPoint.getAffineX().toByteArray();
            byte[] byteArray2 = eCPoint.getAffineY().toByteArray();
            int length = byteArray2.length;
            System.arraycopy(byteArray2, 0, bArr, i3 - length, length);
            int length2 = byteArray.length;
            System.arraycopy(byteArray, 0, bArr, (b + 1) - length2, length2);
            bArr[0] = 4;
            return bArr;
        } else if (i2 != 1) {
            int i4 = b + b;
            byte[] bArr2 = new byte[i4];
            byte[] byteArray3 = eCPoint.getAffineX().toByteArray();
            int length3 = byteArray3.length;
            if (length3 > b) {
                byteArray3 = Arrays.copyOfRange(byteArray3, length3 - b, length3);
            }
            byte[] byteArray4 = eCPoint.getAffineY().toByteArray();
            int length4 = byteArray4.length;
            if (length4 > b) {
                byteArray4 = Arrays.copyOfRange(byteArray4, length4 - b, length4);
            }
            int length5 = byteArray4.length;
            System.arraycopy(byteArray4, 0, bArr2, i4 - length5, length5);
            int length6 = byteArray3.length;
            System.arraycopy(byteArray3, 0, bArr2, b - length6, length6);
            return bArr2;
        } else {
            int i5 = b + 1;
            byte[] bArr3 = new byte[i5];
            byte[] byteArray5 = eCPoint.getAffineX().toByteArray();
            int length7 = byteArray5.length;
            System.arraycopy(byteArray5, 0, bArr3, i5 - length7, length7);
            bArr3[0] = !eCPoint.getAffineY().testBit(0) ? (byte) 2 : 3;
            return bArr3;
        }
    }
}
