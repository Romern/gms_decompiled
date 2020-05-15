package p000;

/* renamed from: aack */
final /* synthetic */ class aack implements Runnable {

    /* renamed from: a */
    private final sni f27938a;

    /* renamed from: b */
    private final Runnable f27939b;

    public aack(sni sni, Runnable runnable) {
        this.f27938a = sni;
        this.f27939b = runnable;
    }

    public final void run() {
        this.f27938a.mo25771a(this.f27939b);
    }
}
