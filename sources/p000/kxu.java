package p000;

/* renamed from: kxu */
final /* synthetic */ class kxu implements Runnable {

    /* renamed from: a */
    private final kxx f25363a;

    /* renamed from: b */
    private final bmza f25364b;

    /* renamed from: c */
    private final bqgg f25365c;

    /* renamed from: d */
    private final kem f25366d;

    public kxu(kxx kxx, bmza bmza, bqgg bqgg, kem kem) {
        this.f25363a = kxx;
        this.f25364b = bmza;
        this.f25365c = bqgg;
        this.f25366d = kem;
    }

    public final void run() {
        kxx kxx = this.f25363a;
        bmza bmza = this.f25364b;
        bqgg bqgg = this.f25365c;
        kem kem = this.f25366d;
        bmza.mo66931e();
        kxx.f25376a.mo14901b(new kxv(kxx, bqgg, kem, bmza));
    }
}
