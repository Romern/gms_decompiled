package p000;

import java.util.List;

/* renamed from: zpx */
public final /* synthetic */ class zpx implements aubq {

    /* renamed from: a */
    private final zpz f55675a;

    /* renamed from: b */
    private final zpt f55676b;

    public zpx(zpz zpz, zpt zpt) {
        this.f55675a = zpz;
        this.f55676b = zpt;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        zpz zpz = this.f55675a;
        zpt zpt = this.f55676b;
        if (((auck) aucb).f91396d) {
            return;
        }
        if (aucb.mo50384b()) {
            zpz.f55678a = null;
            List list = (List) aucb.mo50386d();
            bmxy.m108581a(list);
            ((zps) zpt).mo31318a(true, list);
            return;
        }
        zpz.f55678a = null;
        ((zps) zpt).mo31318a(false, bngx.m109376e());
    }
}
