package p000;

/* renamed from: kmn */
final /* synthetic */ class kmn implements kou {

    /* renamed from: a */
    private final kmr f24471a;

    /* renamed from: b */
    private final bngs f24472b;

    /* renamed from: c */
    private final kmq f24473c;

    /* renamed from: d */
    private final bngs f24474d;

    /* renamed from: e */
    private final bngs f24475e;

    public kmn(kmr kmr, bngs bngs, kmq kmq, bngs bngs2, bngs bngs3) {
        this.f24471a = kmr;
        this.f24472b = bngs;
        this.f24473c = kmq;
        this.f24474d = bngs2;
        this.f24475e = bngs3;
    }

    /* renamed from: a */
    public final void mo14699a(Object obj) {
        kmr kmr = this.f24471a;
        bngs bngs = this.f24472b;
        kmq kmq = this.f24473c;
        bngs bngs2 = this.f24474d;
        bngs bngs3 = this.f24475e;
        kom kom = (kom) obj;
        if (kom.f24607f != 0) {
            bngs.mo67668c(obj);
            int i = kom.f24607f;
            if ((i == 1 || i == 3 || i == 4 || (kmr.f24481c && i == 2)) && kmr.m18176a(kom, kmq) && kom.mo14754a() == 1) {
                bngs2.mo67668c(obj);
            }
        } else if (kom.f24621t && kmr.m18176a(kom, kmq)) {
            bngs3.mo67668c(obj);
        }
    }
}
