package p000;

/* renamed from: ahqn */
final /* synthetic */ class ahqn implements Runnable {

    /* renamed from: a */
    private final ahkv f67804a;

    /* renamed from: b */
    private final String f67805b;

    /* renamed from: c */
    private final buut f67806c;

    public ahqn(ahkv ahkv, String str, buut buut) {
        this.f67804a = ahkv;
        this.f67805b = str;
        this.f67806c = buut;
    }

    public final void run() {
        ahkv ahkv = this.f67804a;
        String str = this.f67805b;
        buut buut = this.f67806c;
        ahkl ahkl = ahkv.f67390f;
        long j = buut.f154982b;
        int a = buus.m120474a(buut.f154983c);
        if (a == 0) {
            a = 1;
        }
        ahkl.mo36656a(str, j, a, buut.f154984d);
    }
}
