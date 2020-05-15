package p000;

/* renamed from: bejo */
final /* synthetic */ class bejo implements bqeh {

    /* renamed from: a */
    private final belw f111666a;

    public bejo(belw belw) {
        this.f111666a = belw;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        belw belw = this.f111666a;
        byeh byeh = (byeh) ((bxxc) obj);
        if (!byeh.f165907b.isEmpty()) {
            return bqga.m112775a(byeh);
        }
        long nextLong = belw.f111805a.nextLong();
        bxvd bxvd = (bxvd) byeh.mo74142c(5);
        bxvd.mo73625a((bxvk) byeh);
        String l = Long.toString(nextLong);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        byeh byeh2 = (byeh) bxvd.f164949b;
        byeh byeh3 = byeh.f165904c;
        l.getClass();
        byeh2.f165906a |= 1;
        byeh2.f165907b = l;
        return bqga.m112775a((byeh) bxvd.mo74062i());
    }
}
