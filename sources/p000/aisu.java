package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import org.webrtc.DataChannel;

/* renamed from: aisu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aisu extends OutputStream {

    /* renamed from: a */
    final /* synthetic */ aisv f69654a;

    public aisu(aisv aisv) {
        this.f69654a = aisv;
    }

    public final void close() {
        this.f69654a.mo37639c();
    }

    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    public final void write(byte[] bArr, int i, int i2) {
        long j = (long) i2;
        if (j <= cfnv.m140754P()) {
            aisv aisv = this.f69654a;
            synchronized (aisv.f69656d) {
                while (!aisv.mo37980e()) {
                    DataChannel dataChannel = aisv.f69655c;
                    dataChannel.mo86770b();
                    if (dataChannel.nativeBufferedAmount() + j <= cfnv.m140754P()) {
                        break;
                    }
                    try {
                        aisv.f69656d.wait(250);
                    } catch (InterruptedException e) {
                        aisv.mo37639c();
                        Thread.currentThread().interrupt();
                    }
                }
            }
            if (!this.f69654a.mo37980e()) {
                DataChannel dataChannel2 = this.f69654a.f69655c;
                DataChannel.Buffer buffer = new DataChannel.Buffer(ByteBuffer.wrap(bArr, i, i2), true);
                dataChannel2.mo86770b();
                byte[] bArr2 = new byte[buffer.f191798a.remaining()];
                buffer.f191798a.get(bArr2);
                if (!dataChannel2.nativeSend(bArr2, buffer.f191799b)) {
                    throw new IOException("Failed to send bytes over data channel.");
                }
                return;
            }
            throw new IOException("Cannot write: WebRtcSocket output stream is closed.");
        }
        throw new IOException("Attempted to write more than 1MB to data channel.");
    }
}
