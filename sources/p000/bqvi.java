package p000;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* renamed from: bqvi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqvi {

    /* renamed from: a */
    static final long[] f141676a = bqvy.m113503a(m113472a(f141680e));

    /* renamed from: b */
    static final bqvc[][] f141677b = ((bqvc[][]) Array.newInstance(bqvc.class, 32, 8));

    /* renamed from: c */
    static final bqvc[] f141678c = new bqvc[8];

    /* renamed from: d */
    private static final BigInteger f141679d = BigInteger.valueOf(2).pow(255).subtract(BigInteger.valueOf(19));

    /* renamed from: e */
    private static final BigInteger f141680e = BigInteger.valueOf(-121665).multiply(BigInteger.valueOf(121666).modInverse(f141679d)).mod(f141679d);

    /* renamed from: f */
    private static final BigInteger f141681f = BigInteger.valueOf(2).multiply(f141680e).mod(f141679d);

    /* renamed from: g */
    private static final BigInteger f141682g = BigInteger.valueOf(2).modPow(f141679d.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4)), f141679d);

    static {
        bqvh bqvh = new bqvh();
        bqvh.f141675b = BigInteger.valueOf(4).multiply(BigInteger.valueOf(5).modInverse(f141679d)).mod(f141679d);
        BigInteger bigInteger = bqvh.f141675b;
        BigInteger multiply = bigInteger.pow(2).subtract(BigInteger.ONE).multiply(f141680e.multiply(bigInteger.pow(2)).add(BigInteger.ONE).modInverse(f141679d));
        BigInteger modPow = multiply.modPow(f141679d.add(BigInteger.valueOf(3)).divide(BigInteger.valueOf(8)), f141679d);
        if (!modPow.pow(2).subtract(multiply).mod(f141679d).equals(BigInteger.ZERO)) {
            modPow = modPow.multiply(f141682g).mod(f141679d);
        }
        if (modPow.testBit(0)) {
            modPow = f141679d.subtract(modPow);
        }
        bqvh.f141674a = modPow;
        bqvy.m113503a(m113472a(f141681f));
        bqvy.m113503a(m113472a(f141682g));
        bqvh bqvh2 = bqvh;
        for (int i = 0; i < 32; i++) {
            bqvh bqvh3 = bqvh2;
            for (int i2 = 0; i2 < 8; i2++) {
                f141677b[i][i2] = m113470a(bqvh3);
                bqvh3 = m113471a(bqvh3, bqvh2);
            }
            for (int i3 = 0; i3 < 8; i3++) {
                bqvh2 = m113471a(bqvh2, bqvh2);
            }
        }
        bqvh a = m113471a(bqvh, bqvh);
        for (int i4 = 0; i4 < 8; i4++) {
            f141678c[i4] = m113470a(bqvh);
            bqvh = m113471a(bqvh, a);
        }
    }

    /* renamed from: a */
    private static bqvc m113470a(bqvh bqvh) {
        return new bqvc(bqvy.m113503a(m113472a(bqvh.f141675b.add(bqvh.f141674a).mod(f141679d))), bqvy.m113503a(m113472a(bqvh.f141675b.subtract(bqvh.f141674a).mod(f141679d))), bqvy.m113503a(m113472a(f141681f.multiply(bqvh.f141674a).multiply(bqvh.f141675b).mod(f141679d))));
    }

    /* renamed from: a */
    private static bqvh m113471a(bqvh bqvh, bqvh bqvh2) {
        bqvh bqvh3 = new bqvh();
        BigInteger mod = f141680e.multiply(bqvh.f141674a.multiply(bqvh2.f141674a).multiply(bqvh.f141675b).multiply(bqvh2.f141675b)).mod(f141679d);
        bqvh3.f141674a = bqvh.f141674a.multiply(bqvh2.f141675b).add(bqvh2.f141674a.multiply(bqvh.f141675b)).multiply(BigInteger.ONE.add(mod).modInverse(f141679d)).mod(f141679d);
        bqvh3.f141675b = bqvh.f141675b.multiply(bqvh2.f141675b).add(bqvh.f141674a.multiply(bqvh2.f141674a)).multiply(BigInteger.ONE.subtract(mod).modInverse(f141679d)).mod(f141679d);
        return bqvh3;
    }

    /* renamed from: a */
    private static byte[] m113472a(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i = 0; i < 16; i++) {
            byte b = bArr[i];
            int i2 = (32 - i) - 1;
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }
        return bArr;
    }
}
