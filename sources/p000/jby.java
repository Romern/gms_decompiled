package p000;

import java.util.List;

/* renamed from: jby */
final /* synthetic */ class jby implements bmxj {

    /* renamed from: a */
    private final String f22134a;

    /* renamed from: b */
    private final String f22135b;

    /* renamed from: c */
    private final List f22136c;

    public jby(String str, String str2, List list) {
        this.f22134a = str;
        this.f22135b = str2;
        this.f22136c = list;
    }

    public final Object apply(Object obj) {
        String str = this.f22134a;
        String str2 = this.f22135b;
        List list = this.f22136c;
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
        jbh a = bxvd.mo73965a(str2, jbh.f22094d);
        bxvd bxvd2 = (bxvd) a.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) a);
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        ((jbh) bxvd2.f164949b).f22097b = GeneratedMessageLite.m124030de();
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        jbh jbh = (jbh) bxvd2.f164949b;
        if (!jbh.f22097b.mo73666a()) {
            jbh.f22097b = GeneratedMessageLite.m124021a(jbh.f22097b);
        }
        bxsy.m123078a(list, jbh.f22097b);
        bxvd.mo74031b(str2, (jbh) bxvd2.mo74062i());
        bxvd bxvd3 = (bxvd) jbb.mo74142c(5);
        bxvd3.mo73625a((GeneratedMessageLite) jbb);
        bxvd3.mo74003a(str, (jbd) bxvd.mo74062i());
        return (jbb) bxvd3.mo74062i();
    }
}
