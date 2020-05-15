package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: dne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dne extends brtm {

    /* renamed from: a */
    public static final /* synthetic */ int f13619a = 0;

    /* renamed from: a */
    public static dne m8865a(dne dne, int i, String str, ByteBuffer byteBuffer) {
        byte[] bytes = str.getBytes((Charset) brtm.UTF8_CHARSET.get());
        int i2 = byteBuffer.getInt(i - 4);
        int i3 = 0;
        while (i2 != 0) {
            int i4 = i2 / 2;
            int __indirect = brtm.__indirect(((i3 + i4) * 4) + i, byteBuffer);
            int compareStrings = brtm.compareStrings(brtm.__offset(4, byteBuffer.capacity() - __indirect, byteBuffer), bytes, byteBuffer);
            if (compareStrings > 0) {
                i2 = i4;
            } else if (compareStrings < 0) {
                int i5 = i4 + 1;
                i3 += i5;
                i2 -= i5;
            } else {
                if (dne == null) {
                    dne = new dne();
                }
                dne.__reset(__indirect, byteBuffer);
                return dne;
            }
        }
        return null;
    }

    /* renamed from: S */
    public final int mo9290S() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return this.f143329bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final int keysCompare(Integer num, Integer num2, ByteBuffer byteBuffer) {
        return brtm.compareStrings(brtm.__offset(4, num.intValue(), byteBuffer), brtm.__offset(4, num2.intValue(), byteBuffer), byteBuffer);
    }
}
