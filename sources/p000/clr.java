package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: clr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class clr implements clu {

    /* renamed from: a */
    private final ByteBuffer f7032a;

    public clr(ByteBuffer byteBuffer) {
        this.f7032a = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    /* renamed from: a */
    public final long mo3960a(long j) {
        int min = (int) Math.min((long) this.f7032a.remaining(), j);
        ByteBuffer byteBuffer = this.f7032a;
        byteBuffer.position(byteBuffer.position() + min);
        return (long) min;
    }

    /* renamed from: b */
    public final int mo3962b() {
        return (mo3961a() << 8) | mo3961a();
    }

    /* renamed from: a */
    public final short mo3961a() {
        if (this.f7032a.remaining() > 0) {
            return (short) (this.f7032a.get() & 255);
        }
        throw new clt();
    }
}
