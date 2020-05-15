package p000;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* renamed from: cird */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cird extends UploadDataProvider {

    /* renamed from: a */
    private volatile FileChannel f191271a;

    /* renamed from: b */
    private final circ f191272b;

    /* renamed from: c */
    private final Object f191273c = new Object();

    public cird(circ circ) {
        this.f191272b = circ;
    }

    /* renamed from: a */
    private final FileChannel m150915a() {
        if (this.f191271a == null) {
            synchronized (this.f191273c) {
                if (this.f191271a == null) {
                    this.f191271a = this.f191272b.mo86389a();
                }
            }
        }
        return this.f191271a;
    }

    public final void close() {
        FileChannel fileChannel = this.f191271a;
        if (fileChannel != null) {
            fileChannel.close();
        }
    }

    public final long getLength() {
        return m150915a().size();
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int read;
        if (byteBuffer.hasRemaining()) {
            FileChannel a = m150915a();
            do {
                read = a.read(byteBuffer);
                if (read != -1) {
                    break;
                    break;
                }
                break;
            } while (read == 0);
            uploadDataSink.onReadSucceeded(false);
            return;
        }
        throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
    }

    public final void rewind(UploadDataSink uploadDataSink) {
        m150915a().position(0L);
        uploadDataSink.onRewindSucceeded();
    }
}
