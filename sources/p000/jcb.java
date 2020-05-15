package p000;

/* renamed from: jcb */
public final /* synthetic */ class jcb implements bmxj {

    /* renamed from: a */
    private final String f22144a;

    /* renamed from: b */
    private final int f22145b;

    public jcb(String str, int i) {
        this.f22144a = str;
        this.f22145b = i;
    }

    public final Object apply(Object obj) {
        String str = this.f22144a;
        int i = this.f22145b;
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
        ((jbd) bxvd.f164949b).f22082c = i;
        bxvd bxvd2 = (bxvd) jbb.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) jbb);
        bxvd2.mo74003a(str, (jbd) bxvd.mo74062i());
        return (jbb) bxvd2.mo74062i();
    }
}
