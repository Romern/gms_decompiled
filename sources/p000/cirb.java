package p000;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* renamed from: cirb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cirb extends UploadDataProvider {

    /* renamed from: a */
    private final ByteBuffer f191270a;

    public cirb(ByteBuffer byteBuffer) {
        this.f191270a = byteBuffer;
    }

    public final long getLength() {
        return (long) this.f191270a.limit();
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            if (byteBuffer.remaining() >= this.f191270a.remaining()) {
                byteBuffer.put(this.f191270a);
            } else {
                int limit = this.f191270a.limit();
                ByteBuffer byteBuffer2 = this.f191270a;
                byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
                byteBuffer.put(this.f191270a);
                this.f191270a.limit(limit);
            }
            uploadDataSink.onReadSucceeded(false);
            return;
        }
        throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
    }

    public final void rewind(UploadDataSink uploadDataSink) {
        this.f191270a.position(0);
        uploadDataSink.onRewindSucceeded();
    }
}
