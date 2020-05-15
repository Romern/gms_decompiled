package p000;

/* renamed from: beka */
final /* synthetic */ class beka implements Runnable {

    /* renamed from: a */
    private final bekk f111691a;

    public beka(bekk bekk) {
        this.f111691a = bekk;
    }

    public final void run() {
        bekk bekk = this.f111691a;
        synchronized (bekk.f111715g) {
            bekk.f111716h = null;
            bekk.f111717i = true;
        }
    }
}
