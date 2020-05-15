package p000;

/* renamed from: bdtx */
final /* synthetic */ class bdtx implements bmxj {

    /* renamed from: a */
    private final bdua f106438a;

    /* renamed from: b */
    private final long f106439b;

    /* renamed from: c */
    private final int f106440c;

    public bdtx(bdua bdua, int i, long j) {
        this.f106438a = bdua;
        this.f106440c = i;
        this.f106439b = j;
    }

    public final Object apply(Object obj) {
        bdua bdua = this.f106438a;
        int i = this.f106440c;
        long j = this.f106439b;
        bduk bduk = (bduk) obj;
        bxwc bxwc = bduk.mo58383a().f164250b;
        int size = bxwc.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            bxpd bxpd = (bxpd) bxwc.get(i2);
            i2++;
            int i3 = bxpd.f164243b;
            int i4 = i - 1;
            if (i != 0) {
                if (i3 == i4) {
                    z = bxpd.f164246e;
                    break;
                }
            } else {
                throw null;
            }
        }
        bdve bdve = bdua.f106448b;
        long b = bdua.f106449c.mo54418b();
        bxom b2 = bduk.mo58384b();
        Boolean valueOf = Boolean.valueOf(bdvk.m91494a(i, bduk.mo58383a()));
        Boolean valueOf2 = Boolean.valueOf(z);
        bdve.mo58395a(3004, true, b - j, i, b2, valueOf, valueOf2);
        return valueOf2;
    }
}
