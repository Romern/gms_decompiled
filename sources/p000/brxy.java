package p000;

/* renamed from: brxy */
final /* synthetic */ class brxy implements Runnable {

    /* renamed from: a */
    private final bryb f143615a;

    /* renamed from: b */
    private final Object f143616b;

    public brxy(bryb bryb, Object obj) {
        this.f143615a = bryb;
        this.f143616b = obj;
    }

    public final void run() {
        bryb bryb = this.f143615a;
        bryb.f143624b.add(new brya(this.f143616b, bryb.f143623a.size()));
        bryb.mo70077b();
    }
}
