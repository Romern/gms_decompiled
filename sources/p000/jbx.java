package p000;

/* renamed from: jbx */
final /* synthetic */ class jbx implements bmxj {

    /* renamed from: a */
    private final String f22131a;

    /* renamed from: b */
    private final String f22132b;

    /* renamed from: c */
    private final boolean f22133c;

    public jbx(String str, String str2, boolean z) {
        this.f22131a = str;
        this.f22132b = str2;
        this.f22133c = z;
    }

    public final Object apply(Object obj) {
        String str = this.f22131a;
        String str2 = this.f22132b;
        boolean z = this.f22133c;
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
        ((jbh) bxvd2.f164949b).f22098c = z;
        bxvd.mo74031b(str2, (jbh) bxvd2.mo74062i());
        bxvd bxvd3 = (bxvd) jbb.mo74142c(5);
        bxvd3.mo73625a((GeneratedMessageLite) jbb);
        bxvd3.mo74003a(str, (jbd) bxvd.mo74062i());
        return (jbb) bxvd3.mo74062i();
    }
}
