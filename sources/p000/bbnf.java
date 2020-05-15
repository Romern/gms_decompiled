package p000;

/* renamed from: bbnf */
final /* synthetic */ class bbnf implements bmxj {

    /* renamed from: a */
    private final bbnm f102945a;

    /* renamed from: b */
    private final long f102946b;

    public bbnf(bbnm bbnm, long j) {
        this.f102945a = bbnm;
        this.f102946b = j;
    }

    public final Object apply(Object obj) {
        GeneratedMessageLite GeneratedMessageLite;
        bbnm bbnm = this.f102945a;
        long j = this.f102946b;
        bbnu bbnu = (bbnu) obj;
        bxwc bxwc = bbnm.f102954b.f102984b;
        bxvd bxvd = (bxvd) bbnu.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bbnu);
        bbnr bbnr = (bbnr) bxvd;
        int i = 0;
        while (true) {
            long j2 = 0;
            if (i >= ((bbnu) bbnr.f164949b).f102984b.size()) {
                break;
            }
            bbns a = bbnr.mo56243a(i);
            int a2 = bbnv.m88245a(bxwc, a.f102971b);
            if (a2 != -1) {
                j2 = ((bbns) bxwc.get(a2)).f102972c;
            }
            bxvd bxvd2 = (bxvd) a.mo74142c(5);
            bxvd2.mo73625a((GeneratedMessageLite) a);
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bbns bbns = (bbns) bxvd2.f164949b;
            bbns bbns2 = bbns.f102968e;
            bbns.f102970a |= 4;
            bbns.f102973d = j2;
            if (bbnr.f164950c) {
                bbnr.mo74035c();
                bbnr.f164950c = false;
            }
            bbnu bbnu2 = (bbnu) bbnr.f164949b;
            bbns bbns3 = (bbns) bxvd2.mo74062i();
            bbnu bbnu3 = bbnu.f102981f;
            bbns3.getClass();
            bbnu2.mo56249a();
            bbnu2.f102984b.set(i, bbns3);
            i++;
        }
        if (bbnr.f164950c) {
            bbnr.mo74035c();
            bbnr.f164950c = false;
        }
        bbnu bbnu4 = (bbnu) bbnr.f164949b;
        bbnu bbnu5 = bbnu.f102981f;
        bbnu4.f102983a |= 1;
        bbnu4.f102985c = j;
        bbnu bbnu6 = (bbnu) bbnr.mo74062i();
        bxvd bxvd3 = (bxvd) bbnu6.mo74142c(5);
        bxvd3.mo73625a((GeneratedMessageLite) bbnu6);
        bbnr bbnr2 = (bbnr) bxvd3;
        for (int i2 = 0; i2 < ((bbnu) bbnr2.f164949b).f102987e.size(); i2++) {
            bbnt b = bbnr2.mo56248b(i2);
            if ((b.f102977a & 4) != 0) {
                bxvd bxvd4 = (bxvd) b.mo74142c(5);
                bxvd4.mo73625a((GeneratedMessageLite) b);
                long j3 = b.f102980d;
                if (bxvd4.f164950c) {
                    bxvd4.mo74035c();
                    bxvd4.f164950c = false;
                }
                bbnt bbnt = (bbnt) bxvd4.f164949b;
                bbnt bbnt2 = bbnt.f102975e;
                bbnt.f102977a |= 2;
                bbnt.f102979c = j3;
                GeneratedMessageLite = bxvd4.mo74062i();
            } else {
                bxvd bxvd5 = (bxvd) b.mo74142c(5);
                bxvd5.mo73625a((GeneratedMessageLite) b);
                if (bxvd5.f164950c) {
                    bxvd5.mo74035c();
                    bxvd5.f164950c = false;
                }
                bbnt bbnt3 = (bbnt) bxvd5.f164949b;
                bbnt bbnt4 = bbnt.f102975e;
                bbnt3.f102977a &= -3;
                bbnt3.f102979c = 0;
                GeneratedMessageLite = bxvd5.mo74062i();
            }
            bbnr2.mo56245a(i2, (bbnt) GeneratedMessageLite);
        }
        return (bbnu) bbnr2.mo74062i();
    }
}
