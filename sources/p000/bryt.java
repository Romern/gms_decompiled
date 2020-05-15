package p000;

/* renamed from: bryt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bryt extends chqy {

    /* renamed from: a */
    private final Object f143690a = new Object();

    /* renamed from: b */
    private brys f143691b;

    /* renamed from: c */
    private final bryr f143692c;

    public bryt(bryr bryr) {
        this.f143692c = bryr;
    }

    /* renamed from: a */
    public final chuy mo70090a() {
        synchronized (this.f143690a) {
            if (this.f143691b == null) {
                brys brys = new brys(this.f143692c);
                this.f143691b = brys;
                return brys;
            }
            chuy chuy = new chuy();
            return chuy;
        }
    }
}
