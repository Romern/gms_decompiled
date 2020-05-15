package p000;

import java.nio.ByteBuffer;

/* renamed from: dmy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dmy extends brtm {

    /* renamed from: a */
    public static final /* synthetic */ int f13613a = 0;

    /* renamed from: c */
    public final String mo9291c() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    /* renamed from: e */
    public final String mo9292e() {
        int __offset = __offset(8);
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
