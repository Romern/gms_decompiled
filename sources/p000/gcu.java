package p000;

/* renamed from: gcu */
final /* synthetic */ class gcu implements Runnable {

    /* renamed from: a */
    private final gcy f17891a;

    /* renamed from: b */
    private final gdt f17892b;

    public gcu(gcy gcy, gdt gdt) {
        this.f17891a = gcy;
        this.f17892b = gdt;
    }

    public final void run() {
        gcy gcy = this.f17891a;
        gdt gdt = this.f17892b;
        if (gdt instanceof gcv) {
            gcy.mo11659a((gfj) ((gcv) gdt).f17980d, "", (gez) null);
        } else if (gdt instanceof gcw) {
            gcy.mo11660a((gfm) ((gcw) gdt).f17980d, "", (gez) null);
        }
    }
}
