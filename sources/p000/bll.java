package p000;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* renamed from: bll */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bll implements blk {

    /* renamed from: a */
    private final FileChannel f5105a;

    /* renamed from: b */
    private final long f5106b;

    /* renamed from: c */
    private final long f5107c;

    public bll(FileChannel fileChannel, long j, long j2) {
        this.f5105a = fileChannel;
        this.f5106b = j;
        this.f5107c = j2;
    }

    /* renamed from: a */
    public final long mo3223a() {
        return this.f5107c;
    }

    /* renamed from: a */
    public final void mo3224a(MessageDigest[] messageDigestArr, long j, int i) {
        MappedByteBuffer map = this.f5105a.map(FileChannel.MapMode.READ_ONLY, this.f5106b + j, (long) i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
