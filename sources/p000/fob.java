package p000;

/* renamed from: fob */
public final /* synthetic */ class fob implements Runnable {

    /* renamed from: a */
    private final foe f16998a;

    /* renamed from: b */
    private final int f16999b;

    /* renamed from: c */
    private final fnt f17000c;

    public fob(foe foe, int i, fnt fnt) {
        this.f16998a = foe;
        this.f16999b = i;
        this.f17000c = fnt;
    }

    public final void run() {
        foe foe = this.f16998a;
        int i = this.f16999b;
        fnt fnt = this.f17000c;
        if (((fod) foe.f17005b).mo7136a(i)) {
            fnt.mo10933d("Local AnalyticsService processed last dispatch request");
        }
    }
}
