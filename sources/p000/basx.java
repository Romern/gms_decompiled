package p000;

/* renamed from: basx */
final /* synthetic */ class basx implements aubq {

    /* renamed from: a */
    private final aucb f101686a;

    /* renamed from: b */
    private final bqgy f101687b;

    /* renamed from: c */
    private final bmxj f101688c;

    public basx(aucb aucb, bqgy bqgy, bmxj bmxj) {
        this.f101686a = aucb;
        this.f101687b = bqgy;
        this.f101688c = bmxj;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        aucb aucb2 = this.f101686a;
        bqgy bqgy = this.f101687b;
        bmxj bmxj = this.f101688c;
        if (aucb2.mo50384b()) {
            bqgy.mo69138b(bmxj.apply(aucb2.mo50386d()));
        } else {
            bqgy.mo69136a((Throwable) aucb2.mo50387e());
        }
    }
}
