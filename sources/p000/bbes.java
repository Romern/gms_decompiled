package p000;

/* renamed from: bbes */
final /* synthetic */ class bbes implements bqeh {

    /* renamed from: a */
    private final bbeu f102498a;

    /* renamed from: b */
    private final bavd f102499b;

    /* renamed from: c */
    private final bavr f102500c;

    /* renamed from: d */
    private final bpwz f102501d;

    /* renamed from: e */
    private final int f102502e;

    public bbes(bbeu bbeu, bavd bavd, bavr bavr, bpwz bpwz, int i) {
        this.f102498a = bbeu;
        this.f102499b = bavd;
        this.f102500c = bavr;
        this.f102501d = bpwz;
        this.f102502e = i;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bqgg bqgg;
        bbeu bbeu = this.f102498a;
        bavd bavd = this.f102499b;
        bavr bavr = this.f102500c;
        bpwz bpwz = this.f102501d;
        int i = this.f102502e;
        Void voidR = (Void) obj;
        bxvd da = bpxq.f139756e.mo74144da();
        bauz bauz = bavd.f101872b;
        if (bauz == null) {
            bauz = bauz.f101860g;
        }
        if ((bauz.f101862a & 2) != 0) {
            bauz bauz2 = bavd.f101872b;
            if (bauz2 == null) {
                bauz2 = bauz.f101860g;
            }
            long j = bauz2.f101864c / 1000;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxq bpxq = (bpxq) da.f164949b;
            bpxq.f139758a |= 2;
            bpxq.f139760c = j;
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxq bpxq2 = (bpxq) da.f164949b;
            bpxq2.f139758a |= 2;
            bpxq2.f139760c = -1;
        }
        if (!bavr.f101922e) {
            bpxq bpxq3 = (bpxq) da.f164949b;
            bpxq3.f139758a |= 4;
            bpxq3.f139761d = -1;
            bqgg = bqdx.m112673a(bbeu.f102506a.mo56041a(bavd), new bber(da), bbeu.f102509d);
        } else {
            bpxq bpxq4 = (bpxq) da.f164949b;
            bpxq4.f139759b = bqaf.m112463a(3);
            bpxq4.f139758a |= 1;
            bauz bauz3 = bavd.f101872b;
            if (bauz3 == null) {
                bauz3 = bauz.f101860g;
            }
            if ((bauz3.f101862a & 4) != 0) {
                bauz bauz4 = bavd.f101872b;
                if (bauz4 == null) {
                    bauz4 = bauz.f101860g;
                }
                long j2 = bauz4.f101865d / 1000;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpxq bpxq5 = (bpxq) da.f164949b;
                bpxq5.f139758a |= 4;
                bpxq5.f139761d = j2;
            } else {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpxq bpxq6 = (bpxq) da.f164949b;
                bpxq6.f139758a |= 4;
                bpxq6.f139761d = -1;
            }
            bqgg = bqga.m112775a((bpxq) da.mo74062i());
        }
        return bqdx.m112673a(bqgg, new bbet(bbeu, bpwz, i), bbeu.f102509d);
    }
}
