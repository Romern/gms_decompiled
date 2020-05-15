package p000;

/* renamed from: bber */
final /* synthetic */ class bber implements bmxj {

    /* renamed from: a */
    private final bxvd f102497a;

    public bber(bxvd bxvd) {
        this.f102497a = bxvd;
    }

    public final Object apply(Object obj) {
        bxvd bxvd = this.f102497a;
        bbau bbau = (bbau) obj;
        if (bbau == bbau.DOWNLOADED || bbau == bbau.PENDING) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpxq bpxq = (bpxq) bxvd.f164949b;
            bpxq bpxq2 = bpxq.f139756e;
            bpxq.f139759b = bqaf.m112463a(4);
            bpxq.f139758a |= 1;
        } else {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpxq bpxq3 = (bpxq) bxvd.f164949b;
            bpxq bpxq4 = bpxq.f139756e;
            bpxq3.f139759b = bqaf.m112463a(5);
            bpxq3.f139758a |= 1;
        }
        return (bpxq) bxvd.mo74062i();
    }
}
