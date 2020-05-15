package p000;

import java.util.concurrent.ExecutionException;

/* renamed from: bbre */
final /* synthetic */ class bbre implements bmxj {

    /* renamed from: a */
    private final bbrr f103205a;

    /* renamed from: b */
    private final bcoh f103206b;

    public bbre(bbrr bbrr, bcoh bcoh) {
        this.f103205a = bbrr;
        this.f103206b = bcoh;
    }

    public final Object apply(Object obj) {
        bbrr bbrr = this.f103205a;
        bcoh bcoh = this.f103206b;
        bbpe bbpe = (bbpe) obj;
        String a = bbpe.mo56284a();
        if (bmxx.m108577a(a)) {
            return bbpe;
        }
        try {
            bbpe bbpe2 = (bbpe) bbrr.mo56386a(bcoh, a).get();
            bbpd c = bbpe.m88313c();
            c.mo56298a(bngx.m109355a((Iterable) bnfi.m109236a(bbpe.mo56285b(), bbpe2.mo56285b())));
            c.mo56299a(bbpe2.mo56284a());
            return c.mo56297a();
        } catch (InterruptedException | ExecutionException e) {
            bbos.m88292b("LitBlockController", "Failed to sync block list", e);
            return null;
        }
    }
}
