package p000;

import android.media.MediaCodec;
import android.os.SystemClock;
import com.felicanetworks.sdu.ErrorInfo;
import java.nio.ByteBuffer;
import java.util.concurrent.Semaphore;

/* renamed from: odq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class odq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Semaphore f37299a;

    /* renamed from: b */
    final /* synthetic */ odt f37300b;

    public odq(odt odt, Semaphore semaphore) {
        this.f37300b = odt;
        this.f37299a = semaphore;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.media.MediaCodec.releaseOutputBuffer(int, boolean):void}
     arg types: [int, int]
     candidates:
      ClspMth{android.media.MediaCodec.releaseOutputBuffer(int, long):void}
      ClspMth{android.media.MediaCodec.releaseOutputBuffer(int, boolean):void} */
    public final void run() {
        this.f37300b.mo21786c();
        try {
            bnsn bnsn = odt.f37301f;
            odt odt = this.f37300b;
            odt.f37307k = odt.mo21783a();
            this.f37299a.release();
            odt odt2 = this.f37300b;
            ByteBuffer[] a = odt2.f37307k.mo21568a();
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            while (odt2.f37305i) {
                if (odt2.f37306j) {
                    odt2.mo21785b();
                    odt2.f37306j = false;
                }
                int dequeueOutputBuffer = odt2.f37307k.f36450a.dequeueOutputBuffer(bufferInfo, 500000);
                if (dequeueOutputBuffer != -1) {
                    if (dequeueOutputBuffer == -3) {
                        a = odt2.f37307k.mo21568a();
                    } else if (dequeueOutputBuffer == -2) {
                        odt2.mo21788e();
                    } else if (dequeueOutputBuffer >= 0) {
                        ByteBuffer byteBuffer = a[dequeueOutputBuffer];
                        byteBuffer.position(bufferInfo.offset);
                        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        if ((bufferInfo.flags & 2) != 0) {
                            odt2.f37304h.mo21791a(byteBuffer, bufferInfo);
                        } else if ((bufferInfo.flags & 4) == 0) {
                            bufferInfo.presentationTimeUs = SystemClock.elapsedRealtime() * 1000;
                            odt2.f37304h.mo21792b(byteBuffer, bufferInfo);
                            odt2.mo21784a(bufferInfo, byteBuffer);
                        } else {
                            odt2.f37305i = false;
                            odt2.f37304h.mo21789a();
                        }
                        odt2.f37307k.f36450a.releaseOutputBuffer(dequeueOutputBuffer, false);
                    } else {
                        StringBuilder sb = new StringBuilder(40);
                        sb.append("dequeueOutputBuffer returned ");
                        sb.append(dequeueOutputBuffer);
                        throw new Exception(sb.toString());
                    }
                }
            }
        } catch (Exception e) {
            this.f37299a.release();
            this.f37300b.f37305i = false;
            bnsi c = odt.f37301f.mo68388c();
            c.mo68437a(e);
            c.mo68432a("odq", "run", (int) ErrorInfo.TYPE_SDU_UNKNOWN, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("media encoder error");
            this.f37300b.f37304h.mo21790a(e.toString());
        }
    }
}
