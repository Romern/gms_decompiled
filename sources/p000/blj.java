package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: blj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class blj implements blk {

    /* renamed from: a */
    private final ByteBuffer f5104a;

    public blj(ByteBuffer byteBuffer) {
        this.f5104a = byteBuffer.slice();
    }

    /* renamed from: a */
    public final long mo3223a() {
        return (long) this.f5104a.capacity();
    }

    /* renamed from: a */
    public final void mo3224a(MessageDigest[] messageDigestArr, long j, int i) {
        ByteBuffer slice;
        synchronized (this.f5104a) {
            int i2 = (int) j;
            this.f5104a.position(i2);
            this.f5104a.limit(i2 + i);
            slice = this.f5104a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }
}
