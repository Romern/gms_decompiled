package p000;

import java.math.BigInteger;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: bslu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bslu {

    /* renamed from: a */
    public static final byte[] f144955a = {2, 0};

    /* renamed from: b */
    public static final byte[] f144956b = m115956a("SECUREBOX".getBytes(StandardCharsets.UTF_8), f144955a);

    /* renamed from: c */
    public static final byte[] f144957c = "P256 HKDF-SHA-256 AES-128-GCM".getBytes(StandardCharsets.UTF_8);

    /* renamed from: d */
    public static final byte[] f144958d = "SHARED HKDF-SHA-256 AES-128-GCM".getBytes(StandardCharsets.UTF_8);

    /* renamed from: e */
    public static final byte[] f144959e = new byte[0];

    /* renamed from: f */
    static final ECParameterSpec f144960f = new ECParameterSpec(new EllipticCurve(new ECFieldFp(f144962h), f144963i, f144964j), new ECPoint(new BigInteger("6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", 16), new BigInteger("4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5", 16)), new BigInteger("ffffffff00000000ffffffffffffffffbce6faada7179e84f3b9cac2fc632551", 16), 1);

    /* renamed from: g */
    private static final byte[] f144961g = {1};

    /* renamed from: h */
    private static final BigInteger f144962h;

    /* renamed from: i */
    private static final BigInteger f144963i;

    /* renamed from: j */
    private static final BigInteger f144964j = new BigInteger("5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", 16);

    static {
        BigInteger bigInteger = new BigInteger("ffffffff00000001000000000000000000000000ffffffffffffffffffffffff", 16);
        f144962h = bigInteger;
        f144963i = bigInteger.subtract(new BigInteger("3"));
    }

    /* renamed from: a */
    public static KeyPair m115949a() {
        KeyPairGenerator instance = KeyPairGenerator.getInstance("EC");
        try {
            instance.initialize(new ECGenParameterSpec("prime256v1"));
            return instance.generateKeyPair();
        } catch (InvalidAlgorithmParameterException e) {
            try {
                instance.initialize(new ECGenParameterSpec("secp256r1"));
                return instance.generateKeyPair();
            } catch (InvalidAlgorithmParameterException e2) {
                throw new NoSuchAlgorithmException("Unable to find the NIST P-256 curve", e2);
            }
        }
    }

    /* renamed from: b */
    public static PrivateKey m115957b(byte[] bArr) {
        if (bArr == null || bArr.length != 97) {
            throw new InvalidKeyException("The input byte array keyBytes must be 97-byte.");
        }
        BigInteger bigInteger = new BigInteger(1, Arrays.copyOf(bArr, 32));
        try {
            return KeyFactory.getInstance("EC").generatePrivate(new ECPrivateKeySpec(bigInteger, f144960f));
        } catch (InvalidKeySpecException e) {
            throw new InvalidKeyException(e);
        }
    }

    /* renamed from: c */
    public static byte[] m115960c(byte[] bArr) {
        return bArr == null ? f144959e : bArr;
    }

    /* renamed from: a */
    public static PublicKey m115950a(byte[] bArr) {
        byte[] bArr2 = new byte[33];
        byte[] bArr3 = new byte[33];
        System.arraycopy(bArr, 1, bArr2, 1, 32);
        System.arraycopy(bArr, 33, bArr3, 1, 32);
        BigInteger bigInteger = new BigInteger(bArr2);
        BigInteger bigInteger2 = new BigInteger(bArr3);
        if (bigInteger.compareTo(f144962h) >= 0 || bigInteger2.compareTo(f144962h) >= 0) {
            throw new InvalidKeyException("Point lies outside of the expected curve");
        } else if (bigInteger2.pow(2).mod(f144962h).equals(bigInteger.pow(2).mod(f144962h).add(f144963i).mod(f144962h).multiply(bigInteger).mod(f144962h).add(f144964j).mod(f144962h))) {
            try {
                return KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(bigInteger, bigInteger2), f144960f));
            } catch (InvalidKeySpecException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new InvalidKeyException("Point lies outside of the expected curve");
        }
    }

    /* renamed from: b */
    public static byte[] m115958b(PrivateKey privateKey, PublicKey publicKey) {
        byte[] byteArray = ((ECPrivateKey) privateKey).getS().toByteArray();
        int length = byteArray.length;
        if (length <= 33) {
            byte[] bArr = new byte[33];
            System.arraycopy(byteArray, 0, bArr, 33 - length, length);
            return m115956a(Arrays.copyOfRange(bArr, 1, 33), m115954a(publicKey));
        }
        StringBuilder sb = new StringBuilder(77);
        sb.append("The private key contains ");
        sb.append(length);
        sb.append(" bytes, which should be at most 33 bytes.");
        throw new InvalidKeyException(sb.toString());
    }

    /* renamed from: b */
    public static byte[] m115959b(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            try {
                instance.init(2, secretKey, new GCMParameterSpec(128, bArr));
                try {
                    instance.updateAAD(bArr3);
                    return instance.doFinal(bArr2);
                } catch (AEADBadTagException e) {
                    throw e;
                } catch (BadPaddingException | IllegalBlockSizeException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (InvalidAlgorithmParameterException e3) {
                throw new RuntimeException(e3);
            }
        } catch (NoSuchPaddingException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* renamed from: a */
    public static SecretKey m115951a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Mac instance = Mac.getInstance("HmacSHA256");
        try {
            instance.init(new SecretKeySpec(bArr2, "HmacSHA256"));
            try {
                instance.init(new SecretKeySpec(instance.doFinal(bArr), "HmacSHA256"));
                instance.update(bArr3);
                return new SecretKeySpec(Arrays.copyOf(instance.doFinal(f144961g), 16), "AES");
            } catch (InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (InvalidKeyException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: a */
    public static byte[] m115952a(ByteBuffer byteBuffer, int i) {
        byte[] bArr = new byte[i];
        try {
            byteBuffer.get(bArr);
            return bArr;
        } catch (BufferUnderflowException e) {
            throw new IllegalArgumentException("The encrypted payload is too short");
        }
    }

    /* renamed from: a */
    public static byte[] m115953a(PrivateKey privateKey, PublicKey publicKey) {
        KeyAgreement instance = KeyAgreement.getInstance("ECDH");
        try {
            instance.init(privateKey);
            instance.doPhase(publicKey, true);
            return instance.generateSecret();
        } catch (RuntimeException e) {
            throw new InvalidKeyException(e);
        }
    }

    /* renamed from: a */
    public static byte[] m115954a(PublicKey publicKey) {
        ECPoint w = ((ECPublicKey) publicKey).getW();
        byte[] byteArray = w.getAffineX().toByteArray();
        byte[] byteArray2 = w.getAffineY().toByteArray();
        byte[] bArr = new byte[65];
        int length = byteArray2.length;
        System.arraycopy(byteArray2, 0, bArr, 65 - length, length);
        int length2 = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 33 - length2, length2);
        bArr[0] = 4;
        return bArr;
    }

    /* renamed from: a */
    public static byte[] m115955a(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            try {
                instance.init(1, secretKey, new GCMParameterSpec(128, bArr));
                try {
                    instance.updateAAD(bArr3);
                    return instance.doFinal(bArr2);
                } catch (BadPaddingException | IllegalBlockSizeException e) {
                    throw new RuntimeException(e);
                }
            } catch (InvalidAlgorithmParameterException e2) {
                throw new RuntimeException(e2);
            }
        } catch (NoSuchPaddingException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: a */
    public static byte[] m115956a(byte[]... bArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                break;
            }
            byte[] bArr2 = bArr[i];
            if (bArr2 == null) {
                bArr2 = f144959e;
                bArr[i] = bArr2;
            }
            i2 += bArr2.length;
            i++;
        }
        byte[] bArr3 = new byte[i2];
        int i3 = 0;
        for (byte[] bArr4 : bArr) {
            int length2 = bArr4.length;
            System.arraycopy(bArr4, 0, bArr3, i3, length2);
            i3 += length2;
        }
        return bArr3;
    }
}
