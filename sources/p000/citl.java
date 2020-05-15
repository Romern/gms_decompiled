package p000;

import java.net.HttpRetryException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* renamed from: citl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class citl extends UploadDataProvider {

    /* renamed from: a */
    final /* synthetic */ citm f191416a;

    public citl(citm citm) {
        this.f191416a = citm;
    }

    public final long getLength() {
        return -1;
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= this.f191416a.f191418b.remaining()) {
            byteBuffer.put(this.f191416a.f191418b);
            this.f191416a.f191418b.clear();
            uploadDataSink.onReadSucceeded(this.f191416a.f191419c);
            citm citm = this.f191416a;
            if (!citm.f191419c) {
                citm.f191417a.mo86559b();
                return;
            }
            return;
        }
        int limit = this.f191416a.f191418b.limit();
        ByteBuffer byteBuffer2 = this.f191416a.f191418b;
        byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
        byteBuffer.put(this.f191416a.f191418b);
        this.f191416a.f191418b.limit(limit);
        uploadDataSink.onReadSucceeded(false);
    }

    public final void rewind(UploadDataSink uploadDataSink) {
        uploadDataSink.onRewindError(new HttpRetryException("Cannot retry streamed Http body", -1));
    }
}
