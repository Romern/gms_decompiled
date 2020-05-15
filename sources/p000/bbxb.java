package p000;

import java.nio.charset.StandardCharsets;

/* renamed from: bbxb */
final /* synthetic */ class bbxb implements bmxj {

    /* renamed from: a */
    private final long f103649a;

    public bbxb(long j) {
        this.f103649a = j;
    }

    public final Object apply(Object obj) {
        long j = this.f103649a;
        bnre i = ((bngx) obj).listIterator();
        while (i.hasNext()) {
            bcoh bcoh = (bcoh) i.next();
            bmxv a = bcoh.mo57058b().mo57069a();
            if (a.mo66813a() && bnzi.m110902d().mo68721a(bboo.m88285a((String) a.mo66814b()), StandardCharsets.UTF_8).mo68741c() == ((int) j)) {
                return bmxv.m108566b(bcoh);
            }
        }
        return bmvz.f131120a;
    }
}
