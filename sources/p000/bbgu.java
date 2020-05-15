package p000;

/* renamed from: bbgu */
final /* synthetic */ class bbgu implements bqeh {

    /* renamed from: a */
    private final bbhd f102611a;

    /* renamed from: b */
    private final Iterable f102612b;

    /* renamed from: c */
    private final bbfu f102613c;

    public bbgu(bbhd bbhd, Iterable iterable, bbfu bbfu) {
        this.f102611a = bbhd;
        this.f102612b = iterable;
        this.f102613c = bbfu;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [bngx, bmxz]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbhd bbhd = this.f102611a;
        Iterable iterable = this.f102612b;
        bbfu bbfu = this.f102613c;
        bmxv bmxv = (bmxv) obj;
        if (!bmxv.mo66813a()) {
            return bbhd.mo56137b(iterable, bbfu);
        }
        bngx a = bngx.m109355a(bnjd.m109575a(bnjd.m109586b((Iterable) bbhf.m88013a(iterable, ((bbfw) bmxv.mo66814b()).mo56107a()), bbgx.f102616a), bbgy.f102617a));
        if (a.isEmpty()) {
            return bqga.m112775a((bbfw) bmxv.mo66814b());
        }
        return bqdx.m112673a(bbhd.mo56137b(a, bbfu), new bbgz(bmxv), bqfb.INSTANCE);
    }
}
