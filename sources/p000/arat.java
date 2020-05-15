package p000;

/* renamed from: arat */
final /* synthetic */ class arat implements Runnable {

    /* renamed from: a */
    private final aray f87234a;

    /* renamed from: b */
    private final boolean f87235b;

    /* renamed from: c */
    private final aucb f87236c;

    public arat(aray aray, boolean z, aucb aucb) {
        this.f87234a = aray;
        this.f87235b = z;
        this.f87236c = aucb;
    }

    public final void run() {
        aray aray = this.f87234a;
        boolean z = this.f87235b;
        aucb aucb = this.f87236c;
        if (!z) {
            aray.f87246i.mo48344a();
        } else {
            aray.f87247j.mo48334a();
        }
        if (aucb != null) {
            aray.f87241d.mo25412b("Fetching managed account state", new Object[0]);
            sty sty = new sty(aray.f87061b);
            aucb.mo50379a(sty, new arau(aray));
            aucb.mo50380a(sty, new arav(aray));
        }
    }
}
