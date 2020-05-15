package p000;

/* renamed from: aflr */
public final /* synthetic */ class aflr implements Runnable {

    /* renamed from: a */
    private final afmp f64339a;

    /* renamed from: b */
    private final byte[] f64340b;

    /* renamed from: c */
    private final byte[] f64341c;

    /* renamed from: d */
    private final aucf f64342d;

    public aflr(afmp afmp, byte[] bArr, byte[] bArr2, aucf aucf) {
        this.f64339a = afmp;
        this.f64340b = bArr;
        this.f64341c = bArr2;
        this.f64342d = aucf;
    }

    public final void run() {
        afmp afmp = this.f64339a;
        afmp.f64395c.mo24732b(new C1600afma(afmp, this.f64340b, this.f64341c)).mo50378a(afmp.f64393a, new aflu(this.f64342d));
    }
}
