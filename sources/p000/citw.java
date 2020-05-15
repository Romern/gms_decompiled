package p000;

import java.nio.ByteBuffer;
import org.webrtc.JniCommon;

/* renamed from: citw */
public final /* synthetic */ class citw implements Runnable {

    /* renamed from: a */
    private final ByteBuffer f191457a;

    public citw(ByteBuffer byteBuffer) {
        this.f191457a = byteBuffer;
    }

    public final void run() {
        JniCommon.nativeFreeByteBuffer(this.f191457a);
    }
}
