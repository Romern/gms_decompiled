package p000;

/* renamed from: akwr */
final /* synthetic */ class akwr implements Runnable {

    /* renamed from: a */
    private final akwu f73016a;

    /* renamed from: b */
    private final String f73017b;

    public akwr(akwu akwu, String str) {
        this.f73016a = akwu;
        this.f73017b = str;
    }

    public final void run() {
        akwu akwu = this.f73016a;
        akwu.f73024e.evaluateJavascript(this.f73017b, null);
    }
}
