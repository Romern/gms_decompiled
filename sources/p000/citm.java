package p000;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;

/* renamed from: citm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class citm extends cits {

    /* renamed from: a */
    public final citt f191417a;

    /* renamed from: b */
    public final ByteBuffer f191418b;

    /* renamed from: c */
    public boolean f191419c;

    /* renamed from: f */
    private final UploadDataProvider f191420f = new citl(this);

    public citm(int i, citt citt) {
        if (i > 0) {
            this.f191418b = ByteBuffer.allocate(i);
            this.f191417a = citt;
            return;
        }
        throw new IllegalArgumentException("chunkLength should be greater than 0");
    }

    /* renamed from: f */
    private final void m150970f() {
        if (!this.f191418b.hasRemaining()) {
            mo86555d();
            this.f191418b.flip();
            this.f191417a.mo86557a();
            mo86556e();
        }
    }

    /* renamed from: a */
    public final void mo86524a() {
    }

    /* renamed from: b */
    public final void mo86525b() {
    }

    /* renamed from: c */
    public final UploadDataProvider mo86526c() {
        return this.f191420f;
    }

    public final void close() {
        super.close();
        if (!this.f191419c) {
            this.f191419c = true;
            this.f191418b.flip();
        }
    }

    public final void write(int i) {
        m150970f();
        this.f191418b.put((byte) i);
    }

    public final void write(byte[] bArr, int i, int i2) {
        mo86555d();
        if (bArr.length - i < i2 || i < 0 || i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i2;
        while (i3 > 0) {
            int min = Math.min(i3, this.f191418b.remaining());
            this.f191418b.put(bArr, (i + i2) - i3, min);
            i3 -= min;
            m150970f();
        }
    }
}
