package p000;

/* renamed from: bfes */
final /* synthetic */ class bfes implements Runnable {

    /* renamed from: a */
    private final bfev f113595a;

    /* renamed from: b */
    private final float[] f113596b;

    /* renamed from: c */
    private final long f113597c;

    /* renamed from: d */
    private final int f113598d;

    public bfes(bfev bfev, float[] fArr, long j, int i) {
        this.f113595a = bfev;
        this.f113596b = fArr;
        this.f113597c = j;
        this.f113598d = i;
    }

    public final void run() {
        bfev bfev = this.f113595a;
        bfev.f113606a.mo61599a(this.f113596b, this.f113597c, this.f113598d);
    }
}
