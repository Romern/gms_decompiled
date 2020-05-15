package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: dmz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dmz extends brtm {

    /* renamed from: a */
    public static final /* synthetic */ int f13614a = 0;

    /* renamed from: a */
    public final dmw mo9293a(String str) {
        int __offset = __offset(6);
        if (__offset == 0) {
            return null;
        }
        int __vector = __vector(__offset);
        ByteBuffer byteBuffer = this.f143329bb;
        byte[] bytes = str.getBytes((Charset) brtm.UTF8_CHARSET.get());
        int i = byteBuffer.getInt(__vector - 4);
        int i2 = 0;
        while (i != 0) {
            int i3 = i / 2;
            int __indirect = brtm.__indirect(((i2 + i3) * 4) + __vector, byteBuffer);
            int compareStrings = brtm.compareStrings(brtm.__offset(4, byteBuffer.capacity() - __indirect, byteBuffer), bytes, byteBuffer);
            if (compareStrings > 0) {
                i = i3;
            } else if (compareStrings < 0) {
                int i4 = i3 + 1;
                i2 += i4;
                i -= i4;
            } else {
                dmw dmw = new dmw();
                dmw.__reset(__indirect, byteBuffer);
                return dmw;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final String mo9294c() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final int keysCompare(Integer num, Integer num2, ByteBuffer byteBuffer) {
        return brtm.compareStrings(brtm.__offset(4, num.intValue(), byteBuffer), brtm.__offset(4, num2.intValue(), byteBuffer), byteBuffer);
    }
}
