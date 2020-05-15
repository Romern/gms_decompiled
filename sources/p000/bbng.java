package p000;

/* renamed from: bbng */
final /* synthetic */ class bbng implements bmxj {

    /* renamed from: a */
    private final long f102947a;

    public bbng(long j) {
        this.f102947a = j;
    }

    public final Object apply(Object obj) {
        long j = this.f102947a;
        bbnu bbnu = (bbnu) obj;
        bxvd bxvd = (bxvd) bbnu.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bbnu);
        bbnr bbnr = (bbnr) bxvd;
        if (bbnr.f164950c) {
            bbnr.mo74035c();
            bbnr.f164950c = false;
        }
        bbnu bbnu2 = (bbnu) bbnr.f164949b;
        bbnu bbnu3 = bbnu.f102981f;
        bbnu2.f102983a |= 2;
        bbnu2.f102986d = j;
        return (bbnu) bbnr.mo74062i();
    }
}
