package p000;

import java.nio.ByteBuffer;

/* renamed from: chwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chwi implements cifi {

    /* renamed from: a */
    public final ByteBuffer f189376a;

    public chwi(ByteBuffer byteBuffer) {
        bmxy.m108582a(byteBuffer, "buffer");
        this.f189376a = byteBuffer;
    }

    /* renamed from: a */
    public final int mo85751a() {
        return this.f189376a.remaining();
    }

    /* renamed from: b */
    public final int mo85754b() {
        return this.f189376a.position();
    }

    /* renamed from: a */
    public final void mo85752a(byte b) {
        this.f189376a.put(b);
    }

    /* renamed from: a */
    public final void mo85753a(byte[] bArr, int i, int i2) {
        this.f189376a.put(bArr, i, i2);
    }
}
