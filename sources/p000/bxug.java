package p000;

import java.nio.ByteBuffer;

/* renamed from: bxug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxug extends bxuf {

    /* renamed from: a */
    private final ByteBuffer f164842a;

    /* renamed from: b */
    private final int f164843b;

    public bxug(ByteBuffer byteBuffer) {
        super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        this.f164842a = byteBuffer;
        this.f164843b = byteBuffer.position();
    }

    /* renamed from: c */
    public final void mo73851c() {
        this.f164842a.position(this.f164843b + mo73842b());
    }
}
