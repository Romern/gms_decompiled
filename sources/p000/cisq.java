package p000;

import java.nio.ByteBuffer;
import org.chromium.net.UrlResponseInfo;

/* renamed from: cisq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cisq implements cisy {

    /* renamed from: a */
    final /* synthetic */ UrlResponseInfo f191340a;

    /* renamed from: b */
    final /* synthetic */ ByteBuffer f191341b;

    /* renamed from: c */
    final /* synthetic */ cisu f191342c;

    public cisq(cisu cisu, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        this.f191342c = cisu;
        this.f191340a = urlResponseInfo;
        this.f191341b = byteBuffer;
    }

    /* renamed from: a */
    public final void mo86442a() {
        if (this.f191342c.f191353d.f191365g.compareAndSet(5, 4)) {
            cisu cisu = this.f191342c;
            cisu.f191350a.onReadCompleted(cisu.f191353d, this.f191340a, this.f191341b);
        }
    }
}
