package p000;

import java.math.BigInteger;

/* renamed from: xlt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xlt {
    /* renamed from: a */
    static byte[] m43151a(BigInteger bigInteger, int i) {
        boolean z;
        int i2 = 0;
        if (bigInteger.signum() >= 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        byte[] byteArray = bigInteger.toByteArray();
        byte[] bArr = new byte[i];
        int length = byteArray.length;
        if (length == i + 1) {
            i2 = 1;
        }
        int i3 = length - i2;
        System.arraycopy(byteArray, i2, bArr, i - i3, i3);
        return bArr;
    }
}
