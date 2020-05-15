package p000;

/* renamed from: augz */
final /* synthetic */ class augz implements bmxj {

    /* renamed from: a */
    private final auez f91801a;

    public augz(auez auez) {
        this.f91801a = auez;
    }

    public final Object apply(Object obj) {
        auez auez = this.f91801a;
        aufd aufd = (aufd) obj;
        bmxy.m108600b(aufd != null);
        long currentTimeMillis = System.currentTimeMillis();
        aufc aufc = (aufc) aufd.f91633b.mo74144da();
        for (int max = Math.max(0, aufd.f91635a.size() - 50); max < aufd.f91635a.size(); max++) {
            auez auez2 = (auez) aufd.f91635a.get(max);
            aufa aufa = auez2.f91623b;
            if (aufa == null) {
                aufa = aufa.f91625b;
            }
            bxyk bxyk = aufa.f91627a;
            if (bxyk == null) {
                bxyk = bxyk.f165095c;
            }
            if (bxzt.m124578a(bxyk) > currentTimeMillis) {
                aufc.mo50492a(auez2);
            }
        }
        aufa aufa2 = auez.f91623b;
        if (aufa2 == null) {
            aufa2 = aufa.f91625b;
        }
        bxyk bxyk2 = aufa2.f91627a;
        if (bxyk2 == null) {
            bxyk2 = bxyk.f165095c;
        }
        if (bxzt.m124578a(bxyk2) > currentTimeMillis) {
            aufc.mo50492a(auez);
        }
        return (aufd) aufc.mo74062i();
    }
}
