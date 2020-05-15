package p000;

/* renamed from: bdtw */
final /* synthetic */ class bdtw implements bmxj {

    /* renamed from: a */
    private final bdua f106435a;

    /* renamed from: b */
    private final long f106436b;

    /* renamed from: c */
    private final int f106437c;

    public bdtw(bdua bdua, int i, long j) {
        this.f106435a = bdua;
        this.f106437c = i;
        this.f106436b = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        if (r3.f164165c != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0066, code lost:
        if (r3.f164164b != false) goto L_0x0068;
     */
    public final Object apply(Object obj) {
        bdua bdua = this.f106435a;
        int i = this.f106437c;
        long j = this.f106436b;
        bduk bduk = (bduk) obj;
        bxpe a = bduk.mo58383a();
        bxwc bxwc = a.f164250b;
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
            if (i == 0) {
                throw null;
            } else if (i3 == i4) {
                if (bxpd.f164244c) {
                    if ((a.f164249a & 1) == 0) {
                        z = true;
                    } else {
                        if (i4 == 3) {
                            bxok bxok = a.f164251c;
                            if (bxok == null) {
                                bxok = bxok.f164161d;
                            }
                            if ((bxok.f164163a & 1) != 0) {
                                bxok bxok2 = a.f164251c;
                                if (bxok2 == null) {
                                    bxok2 = bxok.f164161d;
                                }
                            }
                        } else if (i4 != 4) {
                            z = true;
                        } else {
                            bxok bxok3 = a.f164251c;
                            if (bxok3 == null) {
                                bxok3 = bxok.f164161d;
                            }
                            if ((bxok3.f164163a & 2) != 0) {
                                bxok bxok4 = a.f164251c;
                                if (bxok4 == null) {
                                    bxok4 = bxok.f164161d;
                                }
                            }
                        }
                        z = true;
                    }
                }
            }
        }
        bdve bdve = bdua.f106448b;
        long b = bdua.f106449c.mo54418b();
        bxom b2 = bduk.mo58384b();
        Boolean valueOf = Boolean.valueOf(bdvk.m91494a(i, bduk.mo58383a()));
        Boolean valueOf2 = Boolean.valueOf(z);
        bdve.mo58395a(3003, true, b - j, i, b2, valueOf, valueOf2);
        return valueOf2;
    }
}
