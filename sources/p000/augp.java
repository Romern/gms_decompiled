package p000;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* renamed from: augp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class augp extends UploadDataProvider {

    /* renamed from: a */
    private final byte[] f91780a;

    /* renamed from: b */
    private int f91781b = 0;

    public augp(byte[] bArr) {
        this.f91780a = bArr;
    }

    public final long getLength() {
        return (long) this.f91780a.length;
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int min = Math.min(byteBuffer.remaining(), this.f91780a.length - this.f91781b);
        byteBuffer.put(this.f91780a, this.f91781b, min);
        this.f91781b += min;
        uploadDataSink.onReadSucceeded(false);
    }

    public final void rewind(UploadDataSink uploadDataSink) {
        this.f91781b = 0;
        uploadDataSink.onRewindSucceeded();
    }
}
