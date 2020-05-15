package p000;

/* renamed from: fal */
final /* synthetic */ class fal implements C0038ax {

    /* renamed from: a */
    private final fas f16163a;

    public fal(fas fas) {
        this.f16163a = fas;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.c(java.lang.Iterable, bmxz):boolean
     arg types: [bngx, fan]
     candidates:
      bnjd.c(java.lang.Iterable, int):java.lang.Iterable
      bnjd.c(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.c(java.lang.Iterable, bmxz):boolean */
    /* renamed from: a */
    public final void mo2511a(Object obj) {
        fas fas = this.f16163a;
        bngx bngx = (bngx) obj;
        bsxn bsxn = fas.f16172c;
        if (!bnjd.m109592c((Iterable) bngx, (bmxz) new fan(bsxn))) {
            fas.f16175f = bngx.m109356a(fas.m11376a(bsxn));
            fas.f16174e.setVisibility(8);
            return;
        }
        fas.f16174e.setVisibility(0);
        if (evi.m11187a(fas.getContext())) {
            bngx = bngx.mo67670d();
        }
        if (!bnkn.m109669a(bngx, fas.f16175f)) {
            fas.mo10639a(bngx);
        }
    }
}
