package p000;

/* renamed from: pio */
final /* synthetic */ class pio implements Runnable {

    /* renamed from: a */
    private final pjc f39240a;

    public pio(pjc pjc) {
        this.f39240a = pjc;
    }

    public final void run() {
        pjc pjc = this.f39240a;
        if (pjc.f39272A.mo23356b()) {
            pjc.f39316e.mo23861b("in reconnect Runnable");
            pjc.mo23254h();
        }
    }
}
