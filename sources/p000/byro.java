package p000;

import java.math.BigInteger;

/* renamed from: byro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byro {

    /* renamed from: a */
    public static final BigInteger f167506a = new BigInteger("7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFED", 16);

    /* renamed from: b */
    public static final BigInteger f167507b = new BigInteger("52036CEE2B6FFE738CC740797779E89800700A4D4141D8AB75EB4DCA135978A3", 16);

    /* renamed from: c */
    static final BigInteger[] f167508c = {BigInteger.ZERO, BigInteger.ONE, BigInteger.ONE, BigInteger.ZERO};

    /* renamed from: d */
    private static final BigInteger f167509d = new BigInteger("2406D9DC56DFFCE7198E80F2EEF3D13000E0149A8283B156EBD69B9426B2F159", 16);

    /* renamed from: a */
    static BigInteger[] m125215a(BigInteger[] bigIntegerArr) {
        m125218b(bigIntegerArr);
        return new BigInteger[]{bigIntegerArr[0].multiply(bigIntegerArr[2].modInverse(f167506a)).mod(f167506a), bigIntegerArr[1].multiply(bigIntegerArr[2].modInverse(f167506a)).mod(f167506a)};
    }

    /* renamed from: b */
    static void m125218b(BigInteger[] bigIntegerArr) {
        if (bigIntegerArr == null || bigIntegerArr.length != 4 || bigIntegerArr[0] == null || bigIntegerArr[1] == null || bigIntegerArr[2] == null || bigIntegerArr[3] == null) {
            throw new byrn("Point is not in extended representation");
        }
    }

    /* renamed from: c */
    static void m125220c(BigInteger[] bigIntegerArr) {
        if (bigIntegerArr == null || bigIntegerArr[0] == null || bigIntegerArr[1] == null) {
            throw new byrn("Point is not in affine representation");
        }
    }

    /* renamed from: a */
    static BigInteger[] m125216a(BigInteger[] bigIntegerArr, BigInteger bigInteger) {
        m125218b(bigIntegerArr);
        if (bigInteger == null) {
            throw new byrn("Can't multiply point by null");
        } else if (bigInteger.bitLength() <= 256) {
            BigInteger[] bigIntegerArr2 = f167508c;
            BigInteger[] bigIntegerArr3 = bigIntegerArr2;
            for (int i = 0; i < 256; i++) {
                if (bigInteger.testBit(i)) {
                    bigIntegerArr2 = m125219b(bigIntegerArr2, bigIntegerArr);
                } else {
                    bigIntegerArr3 = m125219b(bigIntegerArr2, bigIntegerArr);
                }
                if (i < 255) {
                    m125218b(bigIntegerArr);
                    BigInteger multiply = bigIntegerArr[3].pow(2).multiply(f167509d);
                    BigInteger shiftLeft = bigIntegerArr[2].pow(2).shiftLeft(1);
                    BigInteger shiftLeft2 = bigIntegerArr[1].multiply(bigIntegerArr[0]).shiftLeft(2);
                    BigInteger subtract = shiftLeft.subtract(multiply);
                    BigInteger add = shiftLeft.add(multiply);
                    BigInteger shiftLeft3 = bigIntegerArr[1].pow(2).add(bigIntegerArr[0].pow(2)).shiftLeft(1);
                    bigIntegerArr = new BigInteger[]{shiftLeft2.multiply(subtract).mod(f167506a), add.multiply(shiftLeft3).mod(f167506a), subtract.multiply(add).mod(f167506a), shiftLeft2.multiply(shiftLeft3).mod(f167506a)};
                }
            }
            return m125219b(bigIntegerArr2, m125217a(bigIntegerArr3, bigIntegerArr3));
        } else {
            throw new byrn("Refuse to multiply point by scalar with more than 256 bits");
        }
    }

    /* renamed from: b */
    static BigInteger[] m125219b(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2) {
        m125218b(bigIntegerArr);
        m125218b(bigIntegerArr2);
        BigInteger multiply = bigIntegerArr[1].subtract(bigIntegerArr[0]).multiply(bigIntegerArr2[1].subtract(bigIntegerArr2[0]));
        BigInteger multiply2 = bigIntegerArr[1].add(bigIntegerArr[0]).multiply(bigIntegerArr2[1].add(bigIntegerArr2[0]));
        BigInteger multiply3 = bigIntegerArr[3].multiply(f167509d).multiply(bigIntegerArr2[3]);
        BigInteger bigInteger = bigIntegerArr[2];
        BigInteger multiply4 = bigInteger.add(bigInteger).multiply(bigIntegerArr2[2]);
        BigInteger subtract = multiply2.subtract(multiply);
        BigInteger subtract2 = multiply4.subtract(multiply3);
        BigInteger add = multiply4.add(multiply3);
        BigInteger add2 = multiply2.add(multiply);
        return new BigInteger[]{subtract.multiply(subtract2).mod(f167506a), add.multiply(add2).mod(f167506a), subtract2.multiply(add).mod(f167506a), subtract.multiply(add2).mod(f167506a)};
    }

    /* renamed from: a */
    static BigInteger[] m125217a(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2) {
        m125218b(bigIntegerArr);
        m125218b(bigIntegerArr2);
        return m125219b(bigIntegerArr, new BigInteger[]{bigIntegerArr2[0].negate(), bigIntegerArr2[1], bigIntegerArr2[2], bigIntegerArr2[3].negate()});
    }
}
