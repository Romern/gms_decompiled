package p000;

/* renamed from: yov */
final /* synthetic */ class yov implements bmxj {

    /* renamed from: a */
    private final long f54300a;

    /* renamed from: b */
    private final yhx f54301b;

    public yov(yhx yhx, long j) {
        this.f54301b = yhx;
        this.f54300a = j;
    }

    public final Object apply(Object obj) {
        yhx yhx = this.f54301b;
        long j = this.f54300a;
        yhu yhu = (yhu) obj;
        yht a = yhx.mo30519a().mo30504a(yhu);
        if (((long) yhu.mo30517j()) >= j) {
            a.mo30503a().mo30432a(2.0d);
        } else {
            a.mo30503a().mo30432a(1.0d);
        }
        return a.mo30508c();
    }
}
