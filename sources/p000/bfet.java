package p000;

/* renamed from: bfet */
final /* synthetic */ class bfet implements Runnable {

    /* renamed from: a */
    private final bfev f113599a;

    /* renamed from: b */
    private final int f113600b;

    /* renamed from: c */
    private final int f113601c;

    /* renamed from: d */
    private final int f113602d;

    public bfet(bfev bfev, int i, int i2, int i3) {
        this.f113599a = bfev;
        this.f113600b = i;
        this.f113601c = i2;
        this.f113602d = i3;
    }

    public final void run() {
        bfev bfev = this.f113599a;
        bfev.f113606a.mo61586a(this.f113600b, this.f113601c, this.f113602d);
    }
}
