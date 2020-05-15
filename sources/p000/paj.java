package p000;

/* renamed from: paj */
final /* synthetic */ class paj implements Runnable {

    /* renamed from: a */
    private final pal f38710a;

    /* renamed from: b */
    private final int f38711b;

    /* renamed from: c */
    private final int f38712c;

    public paj(pal pal, int i, int i2) {
        this.f38710a = pal;
        this.f38711b = i;
        this.f38712c = i2;
    }

    public final void run() {
        pal pal = this.f38710a;
        int i = this.f38711b;
        int i2 = this.f38712c;
        pam pam = pal.f38716a;
        bnsn bnsn = pam.f38717a;
        nov nov = pam.f38724h;
        if (ccpv.m131193b()) {
            bnsi c = noy.f36261a.mo68388c();
            c.mo68432a("nov", "a", 360, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68411a("Critical protocol error %d (%d)", i, i2);
            nov.f36257a.f36265e.post(new not(nov, i, i2));
        }
    }
}
