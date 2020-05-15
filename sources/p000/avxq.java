package p000;

import android.hardware.Camera;
import android.os.SystemClock;
import java.nio.ByteBuffer;

/* renamed from: avxq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avxq implements Camera.PreviewCallback {

    /* renamed from: a */
    final /* synthetic */ avxt f94060a;

    public avxq(avxt avxt) {
        this.f94060a = avxt;
    }

    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        avxr avxr = this.f94060a.f94083m;
        synchronized (avxr.f94063c) {
            ByteBuffer byteBuffer = avxr.f94066f;
            if (byteBuffer != null) {
                camera.addCallbackBuffer(byteBuffer.array());
                avxr.f94066f = null;
            }
            if (avxr.f94067g.f94084n.containsKey(bArr)) {
                avxr.f94064d = SystemClock.elapsedRealtime() - avxr.f94062b;
                avxr.f94065e++;
                avxr.f94066f = (ByteBuffer) avxr.f94067g.f94084n.get(bArr);
                avxr.f94063c.notifyAll();
            }
        }
    }
}
