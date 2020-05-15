package p000;

/* renamed from: kxt */
final /* synthetic */ class kxt implements Runnable {

    /* renamed from: a */
    private final kxx f25359a;

    /* renamed from: b */
    private final bmza f25360b;

    /* renamed from: c */
    private final bqgg f25361c;

    /* renamed from: d */
    private final kej f25362d;

    public kxt(kxx kxx, bmza bmza, bqgg bqgg, kej kej) {
        this.f25359a = kxx;
        this.f25360b = bmza;
        this.f25361c = bqgg;
        this.f25362d = kej;
    }

    public final void run() {
        kxx kxx = this.f25359a;
        bmza bmza = this.f25360b;
        bqgg bqgg = this.f25361c;
        kej kej = this.f25362d;
        bmza.mo66931e();
        kxx.f25376a.mo14901b(new kxw(kxx, bqgg, kej, bmza));
    }
}
