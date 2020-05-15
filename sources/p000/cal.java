package p000;

import java.util.Arrays;

/* renamed from: cal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cal {
    static {
        cal.class.getSimpleName();
    }

    /* renamed from: a */
    public static byte[] m3837a(int i, bwz bwz, bxh bxh, bwz... bwzArr) {
        byte[] i2 = bwz.mo3563i();
        int length = i2.length;
        int i3 = i - 22;
        byte[] bArr = new byte[i3];
        bArr[0] = bxh.f5979c;
        bArr[1] = 1;
        bArr[2] = (byte) length;
        System.arraycopy(i2, 0, bArr, 3, length);
        Arrays.fill(bArr, length + 3, i3, (byte) -69);
        StringBuilder sb = new StringBuilder();
        sb.append(bwzArr[0].mo3565k());
        if (sb.length() % 2 != 0) {
            sb.append("0");
        }
        byte[] a = cbb.m3882a(bArr, cbm.m3896a(sb.toString()));
        new Object[1][0] = a;
        int i4 = cbd.f6383a;
        byte[] a2 = cak.m3835a(a);
        byte[] bArr2 = new byte[i];
        bArr2[0] = 106;
        System.arraycopy(bArr, 0, bArr2, 1, i3);
        System.arraycopy(a2, 0, bArr2, i - 21, 20);
        bArr2[i - 1] = -68;
        new Object[1][0] = bArr2;
        return bArr2;
    }

    /* renamed from: a */
    public static byte[] m3838a(byte[] bArr) {
        byte[] bArr2 = (byte[]) bArr.clone();
        for (int i = 0; i < bArr2.length; i++) {
            byte b = bArr2[i];
            bArr2[i] = (byte) (b + b);
        }
        return bArr2;
    }

    /* renamed from: a */
    public static byte[] m3839a(byte[] bArr, byte[] bArr2) {
        boolean z;
        cbb.m3883b(bArr);
        cbb.m3883b(bArr2);
        boolean z2 = true;
        if (bArr.length >= 16) {
            z = true;
        } else {
            z = false;
        }
        cbb.m3879a(z);
        if (bArr2.length != 16) {
            z2 = false;
        }
        cbb.m3879a(z2);
        byte[] bArr3 = new byte[16];
        System.arraycopy(bArr, 0, bArr3, 0, 16);
        for (int i = 0; i < bArr2.length; i++) {
            bArr3[i] = (byte) (bArr3[i] ^ bArr2[i]);
        }
        return bArr3;
    }
}
