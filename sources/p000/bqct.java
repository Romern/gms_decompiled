package p000;

import java.util.Arrays;
import java.util.Collection;

/* renamed from: bqct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqct {
    /* renamed from: a */
    public static int m112600a(short[] sArr, short s, int i, int i2) {
        while (i < i2) {
            if (sArr[i] == s) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    public static short m112601a(byte[] bArr) {
        int length = bArr.length;
        bmxy.m108592a(length >= 2, "array too small: %s < %s", length, 2);
        return (short) ((bArr[1] & 255) | (bArr[0] << 8));
    }

    /* renamed from: a */
    public static byte[] m112602a(short s) {
        return new byte[]{(byte) (s >> 8), (byte) s};
    }

    /* renamed from: a */
    public static short[] m112603a(Collection collection) {
        if (collection instanceof bqcs) {
            bqcs bqcs = (bqcs) collection;
            return Arrays.copyOfRange(bqcs.f140485a, bqcs.f140486b, bqcs.f140487c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        short[] sArr = new short[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            bmxy.m108581a(obj);
            sArr[i] = ((Number) obj).shortValue();
        }
        return sArr;
    }
}
