package p000;

/* renamed from: akwm */
final /* synthetic */ class akwm implements Runnable {

    /* renamed from: a */
    private final akwo f73006a;

    /* renamed from: b */
    private final String f73007b;

    public akwm(akwo akwo, String str) {
        this.f73006a = akwo;
        this.f73007b = str;
    }

    public final void run() {
        akwo akwo = this.f73006a;
        akwo.f73008a.evaluateJavascript(this.f73007b, null);
    }
}
