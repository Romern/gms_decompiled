package p000;

import java.nio.ByteBuffer;

/* renamed from: bluy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bluy implements blva {

    /* renamed from: a */
    public final bluv f127836a = new bluv();

    /* renamed from: b */
    private final ByteBuffer f127837b;

    public bluy(byte[] bArr) {
        this.f127837b = ByteBuffer.wrap(bArr);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bluq.a(boolean, int):void
     arg types: [int, int]
     candidates:
      bluq.a(int, int):bluq
      bluq.a(boolean, int):void */
    /* renamed from: a */
    public final bluq mo66734a(int i) {
        int i2;
        int i3;
        if (!mo66736b()) {
            int position = this.f127837b.position();
            int min = Math.min(this.f127837b.remaining(), i - 1);
            ByteBuffer slice = this.f127837b.slice();
            slice.limit(min);
            ByteBuffer byteBuffer = this.f127837b;
            byteBuffer.position(byteBuffer.position() + min);
            boolean hasRemaining = this.f127837b.hasRemaining();
            if (position != 0) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            if (!hasRemaining) {
                i3 = 4;
            } else {
                i3 = 0;
            }
            bluq a = bluq.m107609a(new byte[(slice.remaining() + 1)]);
            a.mo66715a(false, i3 | i2);
            a.f127828b.put(slice);
            return a;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public final boolean mo66736b() {
        return !this.f127837b.hasRemaining();
    }

    /* renamed from: c */
    public final void mo66737c() {
        this.f127837b.rewind();
    }

    /* renamed from: d */
    public final bluv mo66738d() {
        return this.f127836a;
    }

    /* renamed from: a */
    public final boolean mo66735a() {
        return this.f127837b.position() != 0;
    }
}
