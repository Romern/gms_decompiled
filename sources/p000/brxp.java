package p000;

/* renamed from: brxp */
final /* synthetic */ class brxp implements Runnable {

    /* renamed from: a */
    private final brxw f143575a;

    /* renamed from: b */
    private final Object f143576b;

    public brxp(brxw brxw, Object obj) {
        this.f143575a = brxw;
        this.f143576b = obj;
    }

    public final void run() {
        brxw brxw = this.f143575a;
        brxw.f143596b.add(new brxu(brxw, this.f143576b));
        brxw.mo70067a();
    }
}
