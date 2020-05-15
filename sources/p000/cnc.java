package p000;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* renamed from: cnc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cnc extends MediaDataSource {

    /* renamed from: a */
    final /* synthetic */ ByteBuffer f7097a;

    public cnc(ByteBuffer byteBuffer) {
        this.f7097a = byteBuffer;
    }

    public final void close() {
    }

    public final long getSize() {
        return (long) this.f7097a.limit();
    }

    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (j >= ((long) this.f7097a.limit())) {
            return -1;
        }
        this.f7097a.position((int) j);
        int min = Math.min(i2, this.f7097a.remaining());
        this.f7097a.get(bArr, i, min);
        return min;
    }
}
