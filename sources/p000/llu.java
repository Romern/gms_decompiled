package p000;

import java.util.stream.Collectors;

/* renamed from: llu */
final /* synthetic */ class llu implements bmxj {

    /* renamed from: a */
    static final bmxj f26331a = new llu();

    private llu() {
    }

    public final Object apply(Object obj) {
        bnic bnic = (bnic) obj;
        if (bnic == null) {
            return bmvz.f131120a;
        }
        bnrd a = bnic.iterator();
        while (a.hasNext()) {
            kct kct = (kct) a.next();
            if (kct.mo14368a() instanceof kde) {
                kde kde = (kde) kct.mo14368a();
                srn srn = llz.f26337d;
                return bmxv.m108566b((String) bngx.m109358a(kde.f23860b, kde.f23862d, kde.f23861c).stream().filter(llt.f26330a).collect(Collectors.joining(" ")));
            }
        }
        return bmvz.f131120a;
    }
}
