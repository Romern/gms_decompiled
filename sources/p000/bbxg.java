package p000;

import java.util.List;

/* renamed from: bbxg */
final /* synthetic */ class bbxg implements bmxj {

    /* renamed from: a */
    private final bbxm f103658a;

    public bbxg(bbxm bbxm) {
        this.f103658a = bbxm;
    }

    public final Object apply(Object obj) {
        bbxm bbxm = this.f103658a;
        bbys bbys = (bbys) obj;
        if (!bbys.mo56536b().mo66813a() || !bbys.mo56537c().mo66813a()) {
            return null;
        }
        if (bbys.mo56535a() == 0) {
            bcoh bcoh = (bcoh) bbys.mo56536b().mo66814b();
            bbxm.mo56488a(bcoh, (bcoz) bbys.mo56537c().mo66814b());
            List list = bbxm.f103678d;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                bcoh.mo57058b();
                ((bbpt) list.get(i)).mo54574a();
            }
            bcfx bcfx = bbxm.f103677c;
            bcnr q = bcns.m89409q();
            q.mo57011b(1);
            q.mo57012b(bcoh.mo57058b().mo57074e());
            q.mo57010a(bcoh.mo57059c().mo73781l());
            bcfx.mo56753a(q.mo57002a());
            return null;
        } else if (bbys.mo56535a() != 2) {
            return null;
        } else {
            bbxm.mo56488a((bcoh) bbys.mo56536b().mo66814b(), (bcoz) bbys.mo56537c().mo66814b());
            return null;
        }
    }
}
