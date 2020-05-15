package p000;

import java.util.List;

/* renamed from: jbz */
public final /* synthetic */ class jbz implements bmxj {

    /* renamed from: a */
    private final String f22137a;

    /* renamed from: b */
    private final List f22138b;

    public jbz(String str, List list) {
        this.f22137a = str;
        this.f22138b = list;
    }

    public final Object apply(Object obj) {
        String str = this.f22137a;
        List list = this.f22138b;
        jbb jbb = (jbb) obj;
        imn imn = jcf.f22150a;
        jbd jbd = jbd.f22078d;
        str.getClass();
        bxww bxww = jbb.f22076a;
        if (bxww.containsKey(str)) {
            jbd = (jbd) bxww.get(str);
        }
        bxvd bxvd = (bxvd) jbd.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) jbd);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        ((jbd) bxvd.f164949b).f22081b = GeneratedMessageLite.m124030de();
        bxvd.mo74119x(list);
        bxvd bxvd2 = (bxvd) jbb.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) jbb);
        bxvd2.mo74003a(str, (jbd) bxvd.mo74062i());
        return (jbb) bxvd2.mo74062i();
    }
}
