package p000;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* renamed from: ree */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ree extends UploadDataProvider {

    /* renamed from: a */
    int f42790a = 0;

    /* renamed from: b */
    final /* synthetic */ ByteString f42791b;

    public ree(ByteString bxtx) {
        this.f42791b = bxtx;
    }

    public final long getLength() {
        return (long) this.f42791b.mo73744a();
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int min = Math.min(this.f42791b.mo73744a(), this.f42790a + byteBuffer.remaining());
        this.f42791b.mo73754a(this.f42790a, min).mo73758a(byteBuffer);
        this.f42790a = min;
        uploadDataSink.onReadSucceeded(false);
    }

    public final void rewind(UploadDataSink uploadDataSink) {
        this.f42790a = 0;
        uploadDataSink.onRewindSucceeded();
    }
}
