package p000;

import com.google.android.projection.common.BufferPool;
import java.nio.ByteBuffer;

/* renamed from: nwy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nwy {

    /* renamed from: a */
    public long f36851a = 0;

    /* renamed from: b */
    public final ByteBuffer f36852b;

    public nwy(int i) {
        ByteBuffer buffer = BufferPool.getBuffer(i + 10);
        buffer.putShort(0);
        buffer.position(10);
        this.f36852b = buffer;
    }

    /* renamed from: a */
    public final int mo21772a() {
        return this.f36852b.arrayOffset() + 10;
    }

    /* renamed from: b */
    public final int mo21773b() {
        return this.f36852b.limit() - 10;
    }
}
