package p000;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.Semaphore;

/* renamed from: ovo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ovo implements odr {

    /* renamed from: a */
    final /* synthetic */ Semaphore f38488a;

    /* renamed from: b */
    final /* synthetic */ Semaphore f38489b;

    public ovo(Semaphore semaphore, Semaphore semaphore2) {
        this.f38488a = semaphore;
        this.f38489b = semaphore2;
    }

    /* renamed from: a */
    public final void mo21789a() {
    }

    /* renamed from: a */
    public final void mo21790a(String str) {
    }

    /* renamed from: b */
    public final void mo21792b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.f38489b.release();
    }

    /* renamed from: a */
    public final void mo21791a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.f38488a.release();
    }
}
