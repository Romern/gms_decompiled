package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: cirk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cirk implements ReadableByteChannel {

    /* renamed from: a */
    private final InputStream f191281a;

    /* renamed from: b */
    private final AtomicBoolean f191282b = new AtomicBoolean(true);

    private cirk(InputStream inputStream) {
        this.f191281a = inputStream;
    }

    /* renamed from: a */
    static ReadableByteChannel m150922a(InputStream inputStream) {
        if (inputStream instanceof FileInputStream) {
            return ((FileInputStream) inputStream).getChannel();
        }
        return new cirk(inputStream);
    }

    public final void close() {
        if (this.f191282b.compareAndSet(true, false)) {
            this.f191281a.close();
        }
    }

    public final boolean isOpen() {
        return this.f191282b.get();
    }

    public final int read(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int read = this.f191281a.read(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            if (read <= 0) {
                return read;
            }
            byteBuffer.position(byteBuffer.position() + read);
            return read;
        }
        byte[] bArr = new byte[Math.min((int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES, Math.min(Math.max(this.f191281a.available(), 4096), byteBuffer.remaining()))];
        int read2 = this.f191281a.read(bArr);
        if (read2 <= 0) {
            return read2;
        }
        byteBuffer.put(bArr, 0, read2);
        return read2;
    }
}
