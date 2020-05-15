package p000;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/* renamed from: bpt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpt {
    /* renamed from: a */
    private static BigInteger m3476a(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    /* renamed from: a */
    public static RSAPrivateKey m3477a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        int i;
        BigInteger a = m3476a(bArr);
        BigInteger a2 = m3476a(bArr2);
        BigInteger a3 = m3476a(bArr3);
        BigInteger a4 = m3476a(bArr4);
        BigInteger a5 = m3476a(bArr5);
        BigInteger multiply = a4.multiply(a5);
        int compareTo = a3.compareTo(a2);
        BigInteger bigInteger = compareTo < 0 ? a2 : a3;
        BigInteger bigInteger2 = compareTo < 0 ? a3 : a2;
        BigInteger bigInteger3 = compareTo < 0 ? a4 : a5;
        BigInteger bigInteger4 = compareTo < 0 ? a5 : a4;
        BigInteger subtract = bigInteger3.subtract(BigInteger.ONE);
        BigInteger subtract2 = bigInteger4.subtract(BigInteger.ONE);
        bps bps = new bps();
        bps.add(subtract);
        bps.add(subtract2);
        while (true) {
            BigInteger mod = ((BigInteger) bps.mo3390a(1)).mod((BigInteger) bps.mo3390a(0));
            if (mod.equals(BigInteger.ZERO)) {
                break;
            }
            bps.add(mod);
        }
        BigInteger bigInteger5 = (BigInteger) bps.mo3390a(0);
        BigInteger bigInteger6 = BigInteger.ONE;
        BigInteger bigInteger7 = BigInteger.ZERO;
        for (i = 1; bps.size() > i; i = 1) {
            BigInteger subtract3 = bigInteger6.subtract(((BigInteger) bps.mo3390a(i)).divide((BigInteger) bps.remove(bps.size() - 1)).multiply(bigInteger7));
            bigInteger6 = bigInteger7;
            bigInteger7 = subtract3;
        }
        BigInteger[] bigIntegerArr = {bigInteger5, bigInteger6, bigInteger7};
        BigInteger bigInteger8 = bigIntegerArr[0];
        BigInteger subtract4 = bigInteger.subtract(bigInteger.subtract(bigInteger2).divide(bigInteger8).multiply(bigIntegerArr[1]).multiply(subtract));
        BigInteger multiply2 = subtract.multiply(subtract2);
        BigInteger divide = multiply2.divide(bigInteger8);
        BigInteger mod2 = subtract4.mod(divide);
        if (BigInteger.ZERO.compareTo(mod2) > 0) {
            mod2 = divide.add(mod2);
        }
        BigInteger modInverse = mod2.modInverse(divide);
        BigInteger modInverse2 = modInverse.modInverse(multiply2);
        if (BigInteger.ZERO.compareTo(modInverse2) >= 0 || modInverse2.mod(subtract).compareTo(bigInteger) != 0) {
            throw new IllegalArgumentException("Can not convert to SFM...");
        }
        try {
            return (RSAPrivateKey) KeyFactory.getInstance("RSA").generatePrivate(new RSAPrivateCrtKeySpec(multiply, new BigInteger[]{modInverse, modInverse2}[0], modInverse2, a5, a4, a3, a2, a));
        } catch (GeneralSecurityException e) {
            throw cbb.m3877a((Throwable) e);
        }
    }
}
