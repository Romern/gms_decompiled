package p000;

/* renamed from: brwh */
final /* synthetic */ class brwh implements Runnable {

    /* renamed from: a */
    private final brwm f143517a;

    /* renamed from: b */
    private final String f143518b;

    /* renamed from: c */
    private final Throwable f143519c;

    public brwh(brwm brwm, String str, Throwable th) {
        this.f143517a = brwm;
        this.f143518b = str;
        this.f143519c = th;
    }

    public final void run() {
        brwm brwm = this.f143517a;
        brwm.f143528b.mo70031a(this.f143518b, this.f143519c);
    }
}
