package p000;

/* renamed from: ogd */
final /* synthetic */ class ogd implements Runnable {

    /* renamed from: a */
    private final ogs f37544a;

    /* renamed from: b */
    private final bivd f37545b;

    /* renamed from: c */
    private final int f37546c;

    /* renamed from: d */
    private final int f37547d;

    public ogd(ogs ogs, bivd bivd, int i, int i2) {
        this.f37544a = ogs;
        this.f37545b = bivd;
        this.f37546c = i;
        this.f37547d = i2;
    }

    public final void run() {
        ogs ogs = this.f37544a;
        bivd bivd = this.f37545b;
        int i = this.f37546c;
        int i2 = this.f37547d;
        ogr ogr = ogs.f37591o;
        bxwc bxwc = bivd.f121949a;
        ojq ojq = (ojq) ogr;
        ojq.f37797g = new ojp[bxwc.size()];
        int size = bxwc.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            bivb bivb = (bivb) bxwc.get(i4);
            ojq.f37797g[i3] = new ojp();
            ojp ojp = ojq.f37797g[i3];
            ojp.f37787b = bivb;
            ojp.f37786a = bivb.f121924b;
            i3++;
        }
        ogs.f37592p.mo21267a(i, i2, bivd);
    }
}
