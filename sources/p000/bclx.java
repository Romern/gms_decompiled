package p000;

/* renamed from: bclx */
final /* synthetic */ class bclx implements bmxj {

    /* renamed from: a */
    private final bcoh f104453a;

    /* renamed from: b */
    private final String f104454b;

    /* renamed from: c */
    private final bcnt f104455c;

    public bclx(bcoh bcoh, String str, bcnt bcnt) {
        this.f104453a = bcoh;
        this.f104454b = str;
        this.f104455c = bcnt;
    }

    public final Object apply(Object obj) {
        bcoh bcoh = this.f104453a;
        String str = this.f104454b;
        bcnt bcnt = this.f104455c;
        bcun a = bcun.m90040a(((cbgk) obj).f177045a);
        if (a.equals(bcun.UNKNOWN)) {
            bcnr q = bcns.m89409q();
            q.mo57011b(24);
            q.mo57012b(bcoh.mo57058b().mo57074e());
            q.mo57010a(bcoh.mo57059c().mo73781l());
            q.mo57013b(str);
            q.mo57003a(113);
            bcnt.mo56753a(q.mo57002a());
        }
        return a;
    }
}
