package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: cls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cls {

    /* renamed from: a */
    public final ByteBuffer f7033a;

    public cls(byte[] bArr, int i) {
        this.f7033a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
    }

    /* renamed from: a */
    private final boolean m4474a(int i, int i2) {
        return this.f7033a.remaining() - i >= i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final short mo3965b(int i) {
        if (m4474a(i, 2)) {
            return this.f7033a.getShort(i);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo3963a() {
        return this.f7033a.remaining();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo3964a(int i) {
        if (m4474a(i, 4)) {
            return this.f7033a.getInt(i);
        }
        return -1;
    }
}
