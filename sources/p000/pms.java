package p000;

/* renamed from: pms */
final /* synthetic */ class pms implements Runnable {

    /* renamed from: a */
    private final pmt f39736a;

    /* renamed from: b */
    private final int f39737b;

    /* renamed from: c */
    private final int f39738c;

    public pms(pmt pmt, int i, int i2) {
        this.f39736a = pmt;
        this.f39737b = i;
        this.f39738c = i2;
    }

    public final void run() {
        pmt pmt = this.f39736a;
        pmt.f39643h.mo23105a(this.f39737b, this.f39738c);
    }
}
