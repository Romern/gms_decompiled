package p000;

import java.util.concurrent.Executor;

/* renamed from: bdsk */
final /* synthetic */ class bdsk implements bqeg {

    /* renamed from: a */
    private final bdti f106362a;

    /* renamed from: b */
    private final bdrx f106363b;

    /* renamed from: c */
    private final bdru f106364c;

    /* renamed from: d */
    private final Executor f106365d;

    public bdsk(bdti bdti, bdrx bdrx, bdru bdru, Executor executor) {
        this.f106362a = bdti;
        this.f106363b = bdrx;
        this.f106364c = bdru;
        this.f106365d = executor;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        bdti bdti = this.f106362a;
        bdrx bdrx = this.f106363b;
        return bqdx.m112674a(bdrg.m91328a(((bbnn) bdti.f106411e.mo6606a()).mo56236a(((bdrr) bdrx).f106325b), "DeletionsDownloader"), new bdsl(bdti, bdrx, this.f106364c, this.f106365d), bdti.f106415i);
    }
}
