package p000;

/* renamed from: bfep */
final /* synthetic */ class bfep implements Runnable {

    /* renamed from: a */
    private final bfev f113582a;

    /* renamed from: b */
    private final double[] f113583b;

    /* renamed from: c */
    private final double[] f113584c;

    /* renamed from: d */
    private final double[] f113585d;

    /* renamed from: e */
    private final double[] f113586e;

    /* renamed from: f */
    private final double[] f113587f;

    /* renamed from: g */
    private final long f113588g;

    public bfep(bfev bfev, double[] dArr, double[] dArr2, double[] dArr3, double[] dArr4, double[] dArr5, long j) {
        this.f113582a = bfev;
        this.f113583b = dArr;
        this.f113584c = dArr2;
        this.f113585d = dArr3;
        this.f113586e = dArr4;
        this.f113587f = dArr5;
        this.f113588g = j;
    }

    public final void run() {
        bfev bfev = this.f113582a;
        bfev.f113606a.mo61598a(this.f113583b, this.f113584c, this.f113585d, this.f113586e, this.f113587f, this.f113588g);
    }
}
