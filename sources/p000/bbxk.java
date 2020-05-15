package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: bbxk */
final /* synthetic */ class bbxk implements Callable {

    /* renamed from: a */
    private final bbxm f103668a;

    /* renamed from: b */
    private final bqgg f103669b;

    /* renamed from: c */
    private final int f103670c;

    /* renamed from: d */
    private final bcoh f103671d;

    /* renamed from: e */
    private final bqgg f103672e;

    public bbxk(bbxm bbxm, bqgg bqgg, int i, bcoh bcoh, bqgg bqgg2) {
        this.f103668a = bbxm;
        this.f103669b = bqgg;
        this.f103670c = i;
        this.f103671d = bcoh;
        this.f103672e = bqgg2;
    }

    public final Object call() {
        bbxm bbxm = this.f103668a;
        bqgg bqgg = this.f103669b;
        int i = this.f103670c;
        bcoh bcoh = this.f103671d;
        bqgg bqgg2 = this.f103672e;
        try {
            bqga.m112780a((Future) bqgg);
            try {
                bqga.m112780a((Future) bqgg2);
                return (bbyq) bqga.m112780a((Future) bqgg);
            } catch (ExecutionException e) {
                bbos.m88292b("TyRegController", "Failed to store registration into registration store", e);
                bcfx bcfx = bbxm.f103677c;
                bcnr q = bcns.m89409q();
                q.mo57011b(14);
                q.mo57003a(i);
                q.mo57012b(bcoh.mo57058b().mo57074e());
                q.mo57010a(bcoh.mo57059c().mo73781l());
                bcfx.mo56753a(q.mo57002a());
                bbyp e2 = bbyq.m88623e();
                e2.f103764d = 3;
                return e2.mo56550a();
            }
        } catch (ExecutionException e3) {
            bbos.m88292b("TyRegController", "Failed to register refresh", e3);
            bcfx bcfx2 = bbxm.f103677c;
            bcnr q2 = bcns.m89409q();
            q2.mo57011b(14);
            q2.mo57003a(i);
            q2.mo57012b(bcoh.mo57058b().mo57074e());
            q2.mo57010a(bcoh.mo57059c().mo73781l());
            bcfx2.mo56753a(q2.mo57002a());
            bbyp e4 = bbyq.m88623e();
            e4.f103764d = 3;
            return e4.mo56550a();
        }
    }
}
