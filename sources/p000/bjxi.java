package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: bjxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjxi {
    /* renamed from: a */
    public static bjxh m104836a(bjxf bjxf) {
        byte[] bArr = bjxf.f123565c;
        if (bArr.length != 0) {
            return (bjxh) m104838b(bArr, 0).get(0);
        }
        return null;
    }

    /* renamed from: b */
    private static List m104838b(byte[] bArr, int i) {
        int i2;
        int i3;
        if (i >= bArr.length) {
            return new ArrayList();
        }
        byte b = bArr[i];
        byte b2 = b & 32;
        if (((b + 1) & 31) != 0) {
            i2 = i + 1;
        } else {
            i2 = i + 2;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        byte b3 = bArr[i2];
        int i4 = i2 + 1;
        if (b3 == -127) {
            i4 = i2 + 2;
        } else if (b3 == -126) {
            i4 = i2 + 3;
        }
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i2, i4);
        int length = copyOfRange2.length;
        if (length == 1) {
            i3 = bjve.m104686a(copyOfRange2[0]);
        } else if (length != 2) {
            i3 = bjve.m104686a(copyOfRange2[2]) | (bjve.m104686a(copyOfRange2[1]) << 8);
        } else {
            i3 = bjve.m104686a(copyOfRange2[1]);
        }
        int i5 = i3 + i4;
        byte[] copyOfRange3 = Arrays.copyOfRange(bArr, i4, i5);
        List b4 = m104838b(bArr, i5);
        b4.add(0, new bjxh(copyOfRange, copyOfRange3, b2 == 0 ? new ArrayList() : m104838b(copyOfRange3, 0)));
        return b4;
    }

    /* renamed from: a */
    public static List m104837a(byte[] bArr, int i) {
        int i2;
        if (i >= bArr.length) {
            return new ArrayList();
        }
        if (((bArr[i] + 1) & 31) == 0) {
            i2 = i + 2;
        } else {
            i2 = i + 1;
        }
        Arrays.copyOfRange(bArr, i, i2);
        byte b = bArr[i2];
        List a = m104837a(bArr, i2 + 1);
        a.add(0, new bjxg(b));
        return a;
    }
}
