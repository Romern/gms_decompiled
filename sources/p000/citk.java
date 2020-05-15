package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;

/* renamed from: citk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class citk extends cits {

    /* renamed from: a */
    public final int f191412a;

    /* renamed from: b */
    public ByteBuffer f191413b;

    /* renamed from: c */
    public boolean f191414c;

    /* renamed from: f */
    private final UploadDataProvider f191415f;

    public citk() {
        this.f191415f = new citj(this);
        this.f191412a = -1;
        this.f191413b = ByteBuffer.allocate(AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES);
    }

    /* renamed from: a */
    private final void m150966a(int i) {
        if (this.f191412a != -1 && this.f191413b.position() + i > this.f191412a) {
            throw new ProtocolException("exceeded content-length limit of " + this.f191412a + " bytes");
        } else if (this.f191414c) {
            throw new IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for writing after connect");
        } else if (this.f191412a == -1 && this.f191413b.limit() - this.f191413b.position() <= i) {
            int capacity = this.f191413b.capacity();
            ByteBuffer allocate = ByteBuffer.allocate(Math.max(capacity + capacity, this.f191413b.capacity() + i));
            this.f191413b.flip();
            allocate.put(this.f191413b);
            this.f191413b = allocate;
        }
    }

    /* renamed from: b */
    public final void mo86525b() {
    }

    /* renamed from: c */
    public final UploadDataProvider mo86526c() {
        return this.f191415f;
    }

    public final void write(int i) {
        mo86555d();
        m150966a(1);
        this.f191413b.put((byte) i);
    }

    public final void write(byte[] bArr, int i, int i2) {
        mo86555d();
        m150966a(i2);
        this.f191413b.put(bArr, i, i2);
    }

    public citk(long j) {
        this.f191415f = new citj(this);
        if (j > 2147483647L) {
            throw new IllegalArgumentException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2GB.");
        } else if (j >= 0) {
            int i = (int) j;
            this.f191412a = i;
            this.f191413b = ByteBuffer.allocate(i);
        } else {
            throw new IllegalArgumentException("Content length < 0.");
        }
    }

    /* renamed from: a */
    public final void mo86524a() {
        this.f191414c = true;
        if (this.f191413b.position() >= this.f191412a) {
            this.f191413b.flip();
            return;
        }
        throw new ProtocolException("Content received is less than Content-Length");
    }
}
