package p000;

/* renamed from: bsja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsja extends bxvd implements bxxd {
    public bsja() {
        super(bsjd.f144778e);
    }

    /* renamed from: a */
    public final void mo70626a(bxvd bxvd) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        bsjd bsjd = (bsjd) this.f164949b;
        bsjc bsjc = (bsjc) bxvd.mo74062i();
        bsjd bsjd2 = bsjd.f144778e;
        bsjc.getClass();
        if (!bsjd.f144782c.mo73666a()) {
            bsjd.f144782c = bxvk.m124021a(bsjd.f144782c);
        }
        bsjd.f144782c.add(bsjc);
    }

    /* renamed from: a */
    public final void mo70627a(Iterable iterable) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        bsjd bsjd = (bsjd) this.f164949b;
        bsjd bsjd2 = bsjd.f144778e;
        if (!bsjd.f144781b.mo73666a()) {
            bsjd.f144781b = bxvk.m124021a(bsjd.f144781b);
        }
        bxsy.m123078a(iterable, bsjd.f144781b);
    }
}
