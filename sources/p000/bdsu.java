package p000;

/* renamed from: bdsu */
final /* synthetic */ class bdsu implements bqeh {

    /* renamed from: a */
    private final bdtd f106381a;

    /* renamed from: b */
    private final bbnm f106382b;

    public bdsu(bdtd bdtd, bbnm bbnm) {
        this.f106381a = bdtd;
        this.f106382b = bbnm;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bdtd bdtd = this.f106381a;
        bbnm bbnm = this.f106382b;
        Exception exc = (Exception) obj;
        bdrp bdrp = bdtd.f106401e.f106412f;
        bdsq bdsq = new bdsq(bdtd, exc, bbnm);
        bxog bxog = bdtd.f106399c;
        bxog.getClass();
        bdrp.mo58315a(bdsq, new bdsr(bxog));
        return bqga.m112777a((Throwable) exc);
    }
}
