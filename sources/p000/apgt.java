package p000;

import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: apgt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apgt {
    static {
        apgt.class.getSimpleName();
        new ReentrantReadWriteLock();
    }

    /* renamed from: a */
    public static byte[] m70254a(List list, int i) {
        int i2 = 8;
        byte[] bArr = new byte[((list.size() * 4) + 8 + i)];
        System.arraycopy(apgr.m70246a(1), 0, bArr, 0, 4);
        System.arraycopy(apgr.m70246a(-267522322), 0, bArr, 4, 4);
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            byte[] bArr2 = (byte[]) list.get(i3);
            int length = bArr2.length;
            System.arraycopy(apgr.m70246a(length), 0, bArr, i2, 4);
            int i4 = i2 + 4;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i2 = i4 + length;
        }
        return bArr;
    }
}
