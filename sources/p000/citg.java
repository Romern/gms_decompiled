package p000;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* renamed from: citg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class citg extends UploadDataProvider {

    /* renamed from: a */
    private final UploadDataProvider f191408a;

    public citg(UploadDataProvider uploadDataProvider) {
        this.f191408a = uploadDataProvider;
    }

    public final void close() {
        this.f191408a.close();
    }

    public final long getLength() {
        return this.f191408a.getLength();
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        this.f191408a.read(uploadDataSink, byteBuffer);
    }

    public final void rewind(UploadDataSink uploadDataSink) {
        this.f191408a.rewind(uploadDataSink);
    }
}
