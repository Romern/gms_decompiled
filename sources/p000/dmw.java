package p000;

import java.nio.ByteBuffer;

/* renamed from: dmw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dmw extends brtm {

    /* renamed from: a */
    public static final /* synthetic */ int f13611a = 0;

    /* renamed from: a */
    public final void mo9288a(dnb dnb, int i) {
        int __offset = __offset(6);
        if (__offset != 0) {
            dnb.__reset(__indirect(__vector(__offset) + (i * 4)), this.f143329bb);
        }
    }

    /* renamed from: b */
    public final int mo9289b() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final int keysCompare(Integer num, Integer num2, ByteBuffer byteBuffer) {
        return brtm.compareStrings(brtm.__offset(4, num.intValue(), byteBuffer), brtm.__offset(4, num2.intValue(), byteBuffer), byteBuffer);
    }
}
