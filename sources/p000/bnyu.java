package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: bnyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bnyu extends bnyq {

    /* renamed from: a */
    private final ByteBuffer f132384a = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);

    /* renamed from: c */
    private final void m110832c() {
        if (this.f132384a.remaining() < 8) {
            m110833d();
        }
    }

    /* renamed from: d */
    private final void m110833d() {
        this.f132384a.flip();
        while (this.f132384a.remaining() >= 16) {
            mo68733a(this.f132384a);
        }
        this.f132384a.compact();
    }

    /* renamed from: a */
    public final bnzb mo68729a() {
        m110833d();
        this.f132384a.flip();
        if (this.f132384a.remaining() > 0) {
            mo68735b(this.f132384a);
            ByteBuffer byteBuffer = this.f132384a;
            byteBuffer.position(byteBuffer.limit());
        }
        return mo68734b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo68733a(ByteBuffer byteBuffer);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract bnzb mo68734b();

    /* renamed from: b */
    public final void mo68716b(byte b) {
        this.f132384a.put(b);
        m110832c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo68735b(ByteBuffer byteBuffer) {
        throw null;
    }

    public bnyu() {
        bmxy.m108588a(true);
    }

    /* renamed from: a */
    public final void mo68711a(char c) {
        this.f132384a.putChar(c);
        m110832c();
    }

    /* renamed from: b */
    public final void mo68718b(byte[] bArr, int i, int i2) {
        ByteBuffer order = ByteBuffer.wrap(bArr, i, i2).order(ByteOrder.LITTLE_ENDIAN);
        if (order.remaining() <= this.f132384a.remaining()) {
            this.f132384a.put(order);
            m110832c();
            return;
        }
        int position = 16 - this.f132384a.position();
        for (int i3 = 0; i3 < position; i3++) {
            this.f132384a.put(order.get());
        }
        m110833d();
        while (order.remaining() >= 16) {
            mo68733a(order);
        }
        this.f132384a.put(order);
    }

    /* renamed from: a */
    public final void mo68712a(int i) {
        this.f132384a.putInt(i);
        m110832c();
    }

    /* renamed from: a */
    public final void mo68713a(long j) {
        this.f132384a.putLong(j);
        m110832c();
    }
}
