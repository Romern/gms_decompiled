package p000;

import java.io.IOException;

/* renamed from: bbap */
final /* synthetic */ class bbap implements bqeh {

    /* renamed from: a */
    private final bbav f102229a;

    public bbap(bbav bbav) {
        this.f102229a = bbav;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbav bbav = this.f102229a;
        if (((Boolean) obj).booleanValue()) {
            return bqga.m112775a((Object) true);
        }
        bbav.f102245b.mo34988b(1036);
        return bqga.m112777a((Throwable) new IOException("Failed to commit new group metadata to disk."));
    }
}
