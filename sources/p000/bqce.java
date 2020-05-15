package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: bqce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqce {
    /* renamed from: a */
    public static int m112559a(byte[] bArr, byte b, int i, int i2) {
        while (i < i2) {
            if (bArr[i] == b) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    public static List m112560a(byte... bArr) {
        int length = bArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        return new bqcd(bArr, 0, length);
    }

    /* renamed from: a */
    public static byte[] m112561a(Collection collection) {
        if (collection instanceof bqcd) {
            bqcd bqcd = (bqcd) collection;
            return Arrays.copyOfRange(bqcd.f140464a, bqcd.f140465b, bqcd.f140466c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            bmxy.m108581a(obj);
            bArr[i] = ((Number) obj).byteValue();
        }
        return bArr;
    }

    /* renamed from: a */
    public static byte[] m112562a(byte[]... bArr) {
        int i = 0;
        for (byte[] bArr2 : bArr) {
            i += bArr2.length;
        }
        byte[] bArr3 = new byte[i];
        int i2 = 0;
        for (byte[] bArr4 : bArr) {
            int length = bArr4.length;
            System.arraycopy(bArr4, 0, bArr3, i2, length);
            i2 += length;
        }
        return bArr3;
    }
}
