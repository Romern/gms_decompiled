package p000;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* renamed from: nto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nto {

    /* renamed from: a */
    public final MediaCodec f36450a;

    public nto(MediaCodec mediaCodec) {
        this.f36450a = mediaCodec;
    }

    /* renamed from: a */
    public final int mo21566a(long j) {
        return this.f36450a.dequeueInputBuffer(j);
    }

    /* renamed from: a */
    public final void mo21567a(int i, int i2, long j, int i3) {
        this.f36450a.queueInputBuffer(i, 0, i2, j, i3);
    }

    /* renamed from: a */
    public final ByteBuffer[] mo21568a() {
        return this.f36450a.getOutputBuffers();
    }
}
