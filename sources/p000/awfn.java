package p000;

import java.math.BigInteger;
import java.security.spec.ECPoint;

/* renamed from: awfn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awfn {
    /* renamed from: a */
    public static ECPoint m79850a(byte[] bArr) {
        boolean z;
        if (bArr[0] == 4) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        byte[] bArr2 = new byte[33];
        bArr2[0] = 0;
        System.arraycopy(bArr, 1, bArr2, 1, 32);
        BigInteger bigInteger = new BigInteger(bArr2);
        System.arraycopy(bArr, 33, bArr2, 1, 32);
        return new ECPoint(bigInteger, new BigInteger(bArr2));
    }

    /* renamed from: a */
    private static void m79851a(BigInteger bigInteger, byte[] bArr, int i) {
        int i2;
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length < 32) {
            i += 32 - length;
            i2 = 0;
        } else {
            i2 = length - 32;
        }
        System.arraycopy(byteArray, i2, bArr, i, length - i2);
    }

    /* renamed from: a */
    public static byte[] m79852a(ECPoint eCPoint) {
        byte[] bArr = new byte[65];
        bArr[0] = 4;
        m79851a(eCPoint.getAffineX(), bArr, 1);
        m79851a(eCPoint.getAffineY(), bArr, 33);
        return bArr;
    }
}
