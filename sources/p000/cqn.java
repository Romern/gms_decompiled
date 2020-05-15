package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: cqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cqn extends InputStream {

    /* renamed from: a */
    private final ByteBuffer f11851a;

    /* renamed from: b */
    private int f11852b = -1;

    public cqn(ByteBuffer byteBuffer) {
        this.f11851a = byteBuffer;
    }

    public final int available() {
        return this.f11851a.remaining();
    }

    public final synchronized void mark(int i) {
        this.f11852b = this.f11851a.position();
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read() {
        if (this.f11851a.hasRemaining()) {
            return this.f11851a.get() & 255;
        }
        return -1;
    }

    public final synchronized void reset() {
        int i = this.f11852b;
        if (i != -1) {
            this.f11851a.position(i);
        } else {
            throw new IOException("Cannot reset to unset mark position");
        }
    }

    public final long skip(long j) {
        if (!this.f11851a.hasRemaining()) {
            return -1;
        }
        long min = Math.min(j, (long) available());
        ByteBuffer byteBuffer = this.f11851a;
        byteBuffer.position((int) (((long) byteBuffer.position()) + min));
        return min;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (!this.f11851a.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i2, available());
        this.f11851a.get(bArr, i, min);
        return min;
    }
}
