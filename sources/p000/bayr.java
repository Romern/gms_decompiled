package p000;

import java.io.IOException;

/* renamed from: bayr */
final /* synthetic */ class bayr implements bqeh {

    /* renamed from: a */
    private final bbav f102117a;

    /* renamed from: b */
    private final boolean f102118b;

    /* renamed from: c */
    private final bavd f102119c;

    public bayr(bbav bbav, boolean z, bavd bavd) {
        this.f102117a = bbav;
        this.f102118b = z;
        this.f102119c = bavd;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbav bbav = this.f102117a;
        boolean z = this.f102118b;
        bavd bavd = this.f102119c;
        if (!((Boolean) obj).booleanValue()) {
            bbav.f102245b.mo34988b(1036);
            return bqga.m112777a((Throwable) new IOException("Unable to update file group metadata"));
        }
        if (z) {
            bbav.f102245b.mo34980a(1072, bavd.f101873c, bavd.f101875e);
        }
        return bqga.m112775a((Object) null);
    }
}
