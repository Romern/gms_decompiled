package p000;

import java.nio.Buffer;
import java.nio.ByteBuffer;

/* renamed from: cieb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cieb extends chwq {

    /* renamed from: a */
    final Buffer f189943a;

    public cieb(ByteBuffer byteBuffer) {
        bmxy.m108582a(byteBuffer, "bytes");
        this.f189943a = byteBuffer;
    }

    /* renamed from: a */
    public final int mo85807a() {
        return this.f189943a.remaining();
    }

    /* renamed from: b */
    public final int mo85810b() {
        mo85770a(1);
        return ((ByteBuffer) this.f189943a).get() & 255;
    }

    /* renamed from: a */
    public final void mo85809a(byte[] bArr, int i, int i2) {
        mo85770a(i2);
        ((ByteBuffer) this.f189943a).get(bArr, i, i2);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ cidy mo85812c(int i) {
        mo85770a(i);
        ByteBuffer duplicate = ((ByteBuffer) this.f189943a).duplicate();
        duplicate.limit(this.f189943a.position() + i);
        Buffer buffer = this.f189943a;
        buffer.position(buffer.position() + i);
        return new cieb(duplicate);
    }
}
