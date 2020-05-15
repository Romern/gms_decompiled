package p000;

/* renamed from: ahzp */
final /* synthetic */ class ahzp implements Runnable {

    /* renamed from: a */
    private final ahzt f68482a;

    /* renamed from: b */
    private final ahzr f68483b;

    /* renamed from: c */
    private final String f68484c;

    public ahzp(ahzt ahzt, ahzr ahzr, String str) {
        this.f68482a = ahzt;
        this.f68483b = ahzr;
        this.f68484c = str;
    }

    public final void run() {
        ahzt ahzt = this.f68482a;
        ahzr ahzr = this.f68483b;
        String str = this.f68484c;
        if (ahzt.f68497a == null) {
            ahzt.f68497a = new ahws();
        }
        ahzr.f68489a = ahws.m56804a(str, 0, 0);
        ahzr.countDown();
    }
}
