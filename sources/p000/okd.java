package p000;

import java.nio.ByteBuffer;

/* renamed from: okd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class okd extends ojh {

    /* renamed from: a */
    private final okc f37843a;

    /* renamed from: b */
    private volatile boolean f37844b;

    public okd(okc okc, ojm ojm) {
        super(16, okc, ojm);
        this.f37843a = okc;
    }

    /* renamed from: a */
    public final void mo22084a(int i) {
        this.f37844b = false;
        synchronized (this) {
            notify();
        }
    }

    /* renamed from: b */
    public final void mo22087b(int i) {
    }

    /* renamed from: i */
    public final void mo22088i() {
        super.mo22088i();
        this.f37844b = true;
        synchronized (this) {
            notify();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo22085a(int i, ByteBuffer byteBuffer) {
        throw new RuntimeException("Method should not be called.");
    }

    /* renamed from: a */
    public final void mo22108a(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr, 0, remaining);
        okc okc = this.f37843a;
        synchronized (((npj) okc).f36315f) {
            ((npj) okc).f36316g.offer(bArr);
            if (((npj) okc).f36316g.size() == 1 && !((npj) okc).mo21409a(remaining)) {
                ((npj) okc).f36316g.clear();
            }
        }
    }
}
