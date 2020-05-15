package p000;

import java.net.ProtocolException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;

/* renamed from: cito */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cito extends cits {

    /* renamed from: a */
    public final citt f191422a;

    /* renamed from: b */
    public final long f191423b;

    /* renamed from: c */
    public final ByteBuffer f191424c;

    /* renamed from: f */
    private final UploadDataProvider f191425f = new citn(this);

    /* renamed from: g */
    private long f191426g;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    public cito(long j, citt citt) {
        if (j >= 0) {
            this.f191423b = j;
            this.f191424c = ByteBuffer.allocate((int) Math.min(j, 16384L));
            this.f191422a = citt;
            this.f191426g = 0;
            return;
        }
        throw new IllegalArgumentException("Content length must be larger than 0 for non-chunked upload.");
    }

    /* renamed from: a */
    private final void m150974a(int i) {
        if (this.f191426g + ((long) i) > this.f191423b) {
            throw new ProtocolException("expected " + (this.f191423b - this.f191426g) + " bytes but received " + i);
        }
    }

    /* renamed from: f */
    private final void m150975f() {
        if (!this.f191424c.hasRemaining()) {
            m150977h();
        }
    }

    /* renamed from: g */
    private final void m150976g() {
        if (this.f191426g == this.f191423b) {
            m150977h();
        }
    }

    /* renamed from: h */
    private final void m150977h() {
        mo86555d();
        this.f191424c.flip();
        this.f191422a.mo86557a();
        mo86556e();
    }

    /* renamed from: a */
    public final void mo86524a() {
    }

    /* renamed from: b */
    public final void mo86525b() {
        if (this.f191426g < this.f191423b) {
            throw new ProtocolException("Content received is less than Content-Length.");
        }
    }

    /* renamed from: c */
    public final UploadDataProvider mo86526c() {
        return this.f191425f;
    }

    public final void write(int i) {
        mo86555d();
        m150974a(1);
        m150975f();
        this.f191424c.put((byte) i);
        this.f191426g++;
        m150976g();
    }

    public final void write(byte[] bArr, int i, int i2) {
        mo86555d();
        if (bArr.length - i < i2 || i < 0 || i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        m150974a(i2);
        int i3 = i2;
        while (i3 > 0) {
            m150975f();
            int min = Math.min(i3, this.f191424c.remaining());
            this.f191424c.put(bArr, (i + i2) - i3, min);
            i3 -= min;
        }
        this.f191426g += (long) i2;
        m150976g();
    }
}
