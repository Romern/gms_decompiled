package p000;

import java.util.List;

/* renamed from: abyi */
final /* synthetic */ class abyi implements bmxj {

    /* renamed from: a */
    private final List f58733a;

    public abyi(List list) {
        this.f58733a = list;
    }

    public final Object apply(Object obj) {
        List list = this.f58733a;
        abqc abqc = (abqc) obj;
        absg.m48185a("Writing %d client cache records", Integer.valueOf(list.size()));
        bxvd bxvd = (bxvd) abqc.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) abqc);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        abqc abqc2 = abqc.f57940b;
        ((abqc) bxvd.f164949b).f57942a = GeneratedMessageLite.m124030de();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        abqc abqc3 = (abqc) bxvd.f164949b;
        if (!abqc3.f57942a.mo73666a()) {
            abqc3.f57942a = GeneratedMessageLite.m124021a(abqc3.f57942a);
        }
        bxsy.m123078a(list, abqc3.f57942a);
        return (abqc) bxvd.mo74062i();
    }
}
