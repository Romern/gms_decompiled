package p000;

import java.net.HttpRetryException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* renamed from: citn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class citn extends UploadDataProvider {

    /* renamed from: a */
    final /* synthetic */ cito f191421a;

    public citn(cito cito) {
        this.f191421a = cito;
    }

    public final long getLength() {
        return this.f191421a.f191423b;
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < this.f191421a.f191424c.remaining()) {
            int limit = this.f191421a.f191424c.limit();
            ByteBuffer byteBuffer2 = this.f191421a.f191424c;
            byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
            byteBuffer.put(this.f191421a.f191424c);
            this.f191421a.f191424c.limit(limit);
            uploadDataSink.onReadSucceeded(false);
            return;
        }
        byteBuffer.put(this.f191421a.f191424c);
        this.f191421a.f191424c.clear();
        uploadDataSink.onReadSucceeded(false);
        this.f191421a.f191422a.mo86559b();
    }

    public final void rewind(UploadDataSink uploadDataSink) {
        uploadDataSink.onRewindError(new HttpRetryException("Cannot retry streamed Http body", -1));
    }
}
