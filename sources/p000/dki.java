package p000;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* renamed from: dki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dki implements dkh {

    /* renamed from: a */
    private final FileChannel f13408a;

    /* renamed from: b */
    private final long f13409b;

    /* renamed from: c */
    private final long f13410c;

    public dki(FileChannel fileChannel, long j, long j2) {
        this.f13408a = fileChannel;
        this.f13409b = j;
        this.f13410c = j2;
    }

    /* renamed from: a */
    public final long mo9191a() {
        return this.f13410c;
    }

    /* renamed from: a */
    public final void mo9192a(MessageDigest[] messageDigestArr, long j, int i) {
        MappedByteBuffer map = this.f13408a.map(FileChannel.MapMode.READ_ONLY, this.f13409b + j, (long) i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
