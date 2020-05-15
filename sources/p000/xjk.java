package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: xjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xjk {

    /* renamed from: a */
    private final int f52424a;

    public xjk(int i) {
        this.f52424a = i;
    }

    /* renamed from: a */
    private final int m43045a(int i, int i2) {
        return Math.min(this.f52424a - i, i2);
    }

    /* renamed from: a */
    public final List mo29841a(int i, byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int a = m43045a(3, length);
        byte[] copyOf = Arrays.copyOf(bArr, a);
        int length2 = copyOf.length;
        byte[] bArr2 = new byte[(length2 + 3)];
        bArr2[0] = (byte) i;
        bArr2[1] = (byte) ((length >> 8) & 255);
        bArr2[2] = (byte) (length & 255);
        System.arraycopy(copyOf, 0, bArr2, 3, length2);
        arrayList.add(bArr2);
        byte b = 0;
        while (true) {
            int length3 = bArr.length;
            if (a >= length3) {
                return arrayList;
            }
            int a2 = m43045a(1, length3 - a) + a;
            byte[] copyOfRange = Arrays.copyOfRange(bArr, a, a2);
            int length4 = copyOfRange.length;
            byte[] bArr3 = new byte[(length4 + 1)];
            bArr3[0] = b;
            System.arraycopy(copyOfRange, 0, bArr3, 1, length4);
            arrayList.add(bArr3);
            if (b != Byte.MAX_VALUE) {
                b = (byte) (b + 1);
                a = a2;
            } else {
                a = a2;
                b = 0;
            }
        }
    }
}
