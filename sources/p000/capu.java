package p000;

import java.io.PrintStream;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.util.Arrays;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: capu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum capu implements caox {
    INSTANCE;
    

    /* renamed from: b */
    private Cipher f175519b = null;

    static {
        capu capu;
        capu.m126914a();
    }

    private capu(String str) {
    }

    /* renamed from: a */
    private final void m126914a() {
        byte[] a = m126915a(80);
        byte[] a2 = m126915a(16);
        try {
            byte[] a3 = mo74736a(m126917b(a, a2), a2);
            try {
                try {
                    byte[] a4 = mo74733a(new byte[mo74735a(new BigInteger("CDCF9FDA4FC8BDBE4F641A39CD858BF0C64C80CC2055C041FF32B53E6BD8DC51B3AFB13BF0D5E5DAB7537C63A84D3C19", 16), new BigInteger("C89EB6CFA22566083268CE3F975850E0F3695FF199791A27394EB8E9137619C6DA65056F4D9BA4D733ACED9108F48443", 16), new BigInteger("8935153C35307E7EDF98117BDE5907F5D98855DD6AE3D58154CC78D447E5E83677CA7627F5E3EE91CF8CFD97C588D2BB", 16), new BigInteger("85BF248A6C18EEB0219B342A64E58B40A2463FF66650BC1A26347B460CF966849198AE4A33BD188F77C89E60B0A302D7", 16), new BigInteger("BDFF1436301672F1B29C3EC7A4C6C4A5F54058A5925393BEAFB1EAA83050BBF27EC745ACBF2BA0B10FBE89E99B057725", 16))]);
                    int length = a4.length;
                    int length2 = a3.length;
                    byte[] bArr = new byte[(length + length2)];
                    System.arraycopy(a3, 0, bArr, 0, length2);
                    System.arraycopy(a4, 0, bArr, length2, length);
                    try {
                        PrintStream printStream = System.out;
                        byte b = catg.m127169e(bArr)[0];
                        StringBuilder sb = new StringBuilder(30);
                        sb.append("Crypto library warmed up: ");
                        sb.append((int) b);
                        printStream.println(sb.toString());
                    } catch (NoSuchAlgorithmException e) {
                        bqye.m113758a(e);
                    }
                } catch (GeneralSecurityException e2) {
                    bqye.m113758a(e2);
                }
            } catch (GeneralSecurityException e3) {
                bqye.m113758a(e3);
            }
        } catch (GeneralSecurityException e4) {
            bqye.m113758a(e4);
        }
    }

    /* renamed from: b */
    static final byte[] m126917b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        double d = (double) length;
        Double.isNaN(d);
        int ceil = ((int) Math.ceil((d + 1.0d) / 8.0d)) * 8;
        byte[] bArr3 = new byte[ceil];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        bArr3[length] = Byte.MIN_VALUE;
        int length2 = bArr2.length;
        int i = length2 >> 1;
        byte[] copyOfRange = Arrays.copyOfRange(bArr2, 0, i);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr2, i, length2);
        byte[] bArr4 = new byte[8];
        SecretKey generateSecret = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(copyOfRange));
        Cipher instance = Cipher.getInstance("DES/CBC/noPadding");
        instance.init(1, generateSecret, new IvParameterSpec(new byte[8]));
        System.arraycopy(instance.doFinal(bArr3), ceil - 8, bArr4, 0, 8);
        byte[] a = m126916a(bArr4, copyOfRange2, 2);
        byte[] a2 = m126916a(a, copyOfRange, 1);
        catg.m127166c(a);
        catg.m127166c(bArr3);
        catg.m127166c(copyOfRange);
        catg.m127166c(copyOfRange2);
        catg.m127166c(bArr4);
        return a2;
    }

    /* renamed from: a */
    private static final byte[] m126915a(int i) {
        byte[] bArr = new byte[i];
        try {
            SecureRandom instance = SecureRandom.getInstance("SHA1PRNG");
            instance.nextBytes(new byte[1]);
            instance.nextBytes(bArr);
        } catch (NoSuchAlgorithmException e) {
            new Random().nextBytes(bArr);
        }
        return bArr;
    }

    /* renamed from: a */
    static final byte[] m126916a(byte[] bArr, byte[] bArr2, int i) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "DES");
        Cipher instance = Cipher.getInstance("DES/ECB/noPadding");
        if (i == 1) {
            instance.init(1, secretKeySpec);
        } else {
            instance.init(2, secretKeySpec);
        }
        return instance.doFinal(bArr);
    }

    /* renamed from: a */
    public final int mo74735a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        BigInteger multiply = bigInteger.multiply(bigInteger2);
        BigInteger modInverse = bigInteger3.modInverse(bigInteger.subtract(BigInteger.ONE));
        BigInteger modInverse2 = modInverse.modInverse(bigInteger.subtract(BigInteger.ONE).multiply(bigInteger2.subtract(BigInteger.ONE)).divide(bigInteger.subtract(BigInteger.ONE).gcd(bigInteger2.subtract(BigInteger.ONE))));
        Cipher instance = Cipher.getInstance("RSA/ECB/NOPADDING");
        this.f175519b = instance;
        instance.init(1, (RSAPrivateKey) KeyFactory.getInstance("RSA").generatePrivate(new RSAPrivateCrtKeySpec(multiply, modInverse, modInverse2, bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5)));
        return multiply.bitLength() / 8;
    }

    /* renamed from: a */
    public final caow mo74732a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return new caow(m126917b(bArr, bArr2), m126917b(bArr, bArr3));
    }

    /* renamed from: a */
    public final byte[] mo74733a(byte[] bArr) {
        return this.f175519b.doFinal(bArr);
    }

    /* renamed from: a */
    public final byte[] mo74736a(byte[] bArr, byte[] bArr2) {
        int length = bArr2.length;
        if (length == 24 || length == 16) {
            byte[] bArr3 = new byte[24];
            System.arraycopy(bArr2, 0, bArr3, 0, length);
            if (length == 16) {
                System.arraycopy(bArr2, 0, bArr3, 16, 8);
            }
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr3, "DESede");
            Cipher instance = Cipher.getInstance("DESede/CBC/noPadding");
            instance.init(1, secretKeySpec, new IvParameterSpec(new byte[8]));
            byte[] doFinal = instance.doFinal(bArr);
            catg.m127166c(bArr3);
            return doFinal;
        }
        StringBuilder sb = new StringBuilder(36);
        sb.append("Invalid 3DES key length: ");
        sb.append(length);
        throw new InvalidKeyException(sb.toString());
    }
}
