package p000;

/* renamed from: wec */
final /* synthetic */ class wec implements Runnable {

    /* renamed from: a */
    private final wed f50577a;

    /* renamed from: b */
    private final wdz f50578b;

    public wec(wed wed, wdz wdz) {
        this.f50577a = wed;
        this.f50578b = wdz;
    }

    public final void run() {
        wed wed = this.f50577a;
        wdz wdz = this.f50578b;
        if (wed.f50580a.mo29058a()) {
            wdz.onRequestComplete(0);
        } else {
            wdz.onRequestComplete(-1);
        }
    }
}
