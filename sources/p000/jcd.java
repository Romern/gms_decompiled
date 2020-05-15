package p000;

import java.util.Map;

/* renamed from: jcd */
public final /* synthetic */ class jcd implements bmxj {

    /* renamed from: a */
    private final Map f22149a;

    public jcd(Map map) {
        this.f22149a = map;
    }

    public final Object apply(Object obj) {
        Map map = this.f22149a;
        jbb jbb = (jbb) obj;
        imn imn = jcf.f22150a;
        bxvd bxvd = (bxvd) jbb.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) jbb);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        jbb jbb2 = jbb.f22074b;
        ((jbb) bxvd.f164949b).mo13559a().clear();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        ((jbb) bxvd.f164949b).mo13559a().putAll(map);
        return (jbb) bxvd.mo74062i();
    }
}
