package p000;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* renamed from: citj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class citj extends UploadDataProvider {

    /* renamed from: a */
    final /* synthetic */ citk f191411a;

    public citj(citk citk) {
        this.f191411a = citk;
    }

    public final long getLength() {
        citk citk = this.f191411a;
        int i = citk.f191412a;
        if (i != -1) {
            return (long) i;
        }
        boolean z = citk.f191414c;
        ByteBuffer byteBuffer = citk.f191413b;
        return (long) (!z ? byteBuffer.position() : byteBuffer.limit());
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining < this.f191411a.f191413b.remaining()) {
            byteBuffer.put(this.f191411a.f191413b.array(), this.f191411a.f191413b.position(), remaining);
            ByteBuffer byteBuffer2 = this.f191411a.f191413b;
            byteBuffer2.position(byteBuffer2.position() + remaining);
        } else {
            byteBuffer.put(this.f191411a.f191413b);
        }
        uploadDataSink.onReadSucceeded(false);
    }

    public final void rewind(UploadDataSink uploadDataSink) {
        this.f191411a.f191413b.position(0);
        uploadDataSink.onRewindSucceeded();
    }
}
