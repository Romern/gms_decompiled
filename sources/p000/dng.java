package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: dng */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dng extends brtm {

    /* renamed from: a */
    public static final /* synthetic */ int f13621a = 0;

    /* renamed from: a */
    public static dng m8869a(dng dng, int i, String str, ByteBuffer byteBuffer) {
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
                if (dng == null) {
                    dng = new dng();
                }
                dng.__reset(__indirect, byteBuffer);
                return dng;
            }
        }
        return null;
    }

    /* renamed from: S */
    public final int mo9290S() {
        int __offset = __offset(10);
        if (__offset != 0) {
            return this.f143329bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    /* renamed from: e */
    public final int mo9303e() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final int keysCompare(Integer num, Integer num2, ByteBuffer byteBuffer) {
        return brtm.compareStrings(brtm.__offset(4, num.intValue(), byteBuffer), brtm.__offset(4, num2.intValue(), byteBuffer), byteBuffer);
    }

    /* renamed from: a */
    public final String mo9302a(int i) {
        int __offset = __offset(8);
        if (__offset != 0) {
            return __string(__vector(__offset) + (i * 4));
        }
        return null;
    }
}
