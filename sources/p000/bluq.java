package p000;

import java.nio.ByteBuffer;

/* renamed from: bluq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bluq {

    /* renamed from: a */
    public final byte[] f127827a;

    /* renamed from: b */
    public final ByteBuffer f127828b;

    private bluq(byte[] bArr) {
        this.f127827a = bArr;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.position(1);
        this.f127828b = wrap.slice();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bluq.a(boolean, int):void
     arg types: [int, int]
     candidates:
      bluq.a(int, int):bluq
      bluq.a(boolean, int):void */
    /* renamed from: a */
    public static bluq m107608a(int i, int i2) {
        bluq a = m107609a(new byte[(i2 + 1)]);
        a.mo66715a(true, i);
        return a;
    }

    /* renamed from: b */
    public final int mo66717b() {
        return this.f127827a[0] & 15;
    }

    /* renamed from: c */
    public final int mo66718c() {
        return (this.f127827a[0] & 112) >> 4;
    }

    public final String toString() {
        return String.format("Packet[%08d + %s bytes payload]", Integer.valueOf(Integer.parseInt(Integer.toBinaryString(this.f127827a[0] & 255))), Integer.valueOf(this.f127828b.capacity()));
    }

    /* renamed from: a */
    public static bluq m107609a(byte[] bArr) {
        return new bluq(bArr);
    }

    /* renamed from: a */
    public final void mo66715a(boolean z, int i) {
        this.f127827a[0] = (byte) ((!z ? 0 : 128) | i);
    }

    /* renamed from: a */
    public final boolean mo66716a() {
        return (this.f127827a[0] & 8) != 0;
    }
}
