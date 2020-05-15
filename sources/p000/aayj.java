package p000;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* renamed from: aayj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aayj extends UploadDataProvider {

    /* renamed from: a */
    private final byte[] f56821a;

    /* renamed from: b */
    private int f56822b;

    public aayj(byte[] bArr) {
        this.f56821a = bArr;
    }

    public final long getLength() {
        return (long) this.f56821a.length;
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int min = Math.min(byteBuffer.remaining(), this.f56821a.length - this.f56822b);
        byteBuffer.put(this.f56821a, this.f56822b, min);
        this.f56822b += min;
        uploadDataSink.onReadSucceeded(false);
    }

    public final void rewind(UploadDataSink uploadDataSink) {
        this.f56822b = 0;
        uploadDataSink.onRewindSucceeded();
    }
}
