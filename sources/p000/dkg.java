package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: dkg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dkg implements dkh {

    /* renamed from: a */
    private final ByteBuffer f13407a;

    public dkg(ByteBuffer byteBuffer) {
        this.f13407a = byteBuffer.slice();
    }

    /* renamed from: a */
    public final long mo9191a() {
        return (long) this.f13407a.capacity();
    }

    /* renamed from: a */
    public final void mo9192a(MessageDigest[] messageDigestArr, long j, int i) {
        ByteBuffer slice;
        synchronized (this.f13407a) {
            int i2 = (int) j;
            this.f13407a.position(i2);
            this.f13407a.limit(i2 + i);
            slice = this.f13407a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }
}
