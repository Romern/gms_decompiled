package p000;

/* renamed from: brvv */
final /* synthetic */ class brvv implements Runnable {

    /* renamed from: a */
    private final brvz f143487a;

    /* renamed from: b */
    private final String f143488b;

    /* renamed from: c */
    private final Throwable f143489c;

    public brvv(brvz brvz, String str, Throwable th) {
        this.f143487a = brvz;
        this.f143488b = str;
        this.f143489c = th;
    }

    public final void run() {
        brvz brvz = this.f143487a;
        brvz.mo70028a().mo70031a(this.f143488b, this.f143489c);
    }
}
