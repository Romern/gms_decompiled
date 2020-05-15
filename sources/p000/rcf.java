package p000;

import java.util.Map;

/* renamed from: rcf */
final /* synthetic */ class rcf implements bmxj {

    /* renamed from: a */
    private final Map f42637a;

    public rcf(Map map) {
        this.f42637a = map;
    }

    public final Object apply(Object obj) {
        Map map = this.f42637a;
        cahh cahh = (cahh) obj;
        bxvd bxvd = (bxvd) cahh.mo74142c(5);
        bxvd.mo73625a((bxvk) cahh);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        cahh cahh2 = cahh.f174545b;
        ((cahh) bxvd.f164949b).mo74644c().putAll(map);
        return (cahh) bxvd.mo74062i();
    }
}
