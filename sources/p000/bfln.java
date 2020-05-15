package p000;

/* renamed from: bfln */
final /* synthetic */ class bfln implements bugo {

    /* renamed from: a */
    private final bflq f114354a;

    public bfln(bflq bflq) {
        this.f114354a = bflq;
    }

    /* renamed from: a */
    public final void mo61878a(bugn bugn, bugr bugr, buhd buhd) {
        bflq bflq = this.f114354a;
        if (!ceub.m138249d()) {
            bflq.mo61892b();
        } else if (bflq.f114359a == bugr.mo72639a() && buhd.f153831a == 128) {
            bugi bugi = (bugi) buhd.mo72661a((bxxk) bugi.f153782c.mo74142c(7));
            int i = 1;
            if (bugi == null) {
                bxvd da = bugi.f153782c.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bugi bugi2 = (bugi) da.f164949b;
                bugi2.f153785b = 0;
                bugi2.f153784a |= 1;
                bugi = (bugi) da.mo74062i();
            }
            int a = bugh.m119431a(bugi.f153785b);
            if (a != 0) {
                i = a;
            }
            if (i - 1 != 0) {
                bflq.mo61891a();
                bflq.mo61894a(2);
                return;
            }
            bflq.mo61892b();
        }
    }
}
