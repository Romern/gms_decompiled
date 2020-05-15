package p000;

/* renamed from: bawi */
final /* synthetic */ class bawi implements bmxj {

    /* renamed from: a */
    private final bawq f101973a;

    public bawi(bawq bawq) {
        this.f101973a = bawq;
    }

    public final Object apply(Object obj) {
        bawq bawq = this.f101973a;
        batr batr = (batr) obj;
        if (batr != null) {
            bbep bbep = bawq.f101993b;
            bxvd da = bpwz.f139594g.mo74144da();
            String str = batr.f101721b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpwz bpwz = (bpwz) da.f164949b;
            str.getClass();
            int i = bpwz.f139596a | 1;
            bpwz.f139596a = i;
            bpwz.f139597b = str;
            String str2 = batr.f101722c;
            str2.getClass();
            int i2 = i | 4;
            bpwz.f139596a = i2;
            bpwz.f139599d = str2;
            int i3 = batr.f101724e;
            bpwz.f139596a = i2 | 2;
            bpwz.f139598c = i3;
            int size = batr.f101726g.size();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpwz bpwz2 = (bpwz) da.f164949b;
            bpwz2.f139596a |= 8;
            bpwz2.f139600e = size;
            bbep.mo34981a((bpwz) da.mo74062i());
        }
        return batr;
    }
}
