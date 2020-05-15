package p000;

import java.nio.ByteBuffer;

/* renamed from: bfng */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfng implements buaz {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ int mo61974a(Object obj) {
        bfni bfni = (bfni) obj;
        return 12;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo61975a(ByteBuffer byteBuffer, int i) {
        return new bfni(byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo61976a(ByteBuffer byteBuffer, Object obj) {
        bfni bfni = (bfni) obj;
        byteBuffer.putInt(bfni.f114480b);
        byteBuffer.putInt(bfni.f114481c);
        byteBuffer.putInt(bfni.f114482d);
    }
}
