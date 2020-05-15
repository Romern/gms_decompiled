package p000;

/* renamed from: bbok */
final /* synthetic */ class bbok implements Runnable {

    /* renamed from: a */
    private final bbol f103016a;

    /* renamed from: b */
    private final int f103017b;

    /* renamed from: c */
    private final Throwable f103018c;

    public bbok(bbol bbol, int i, Throwable th) {
        this.f103016a = bbol;
        this.f103017b = i;
        this.f103018c = th;
    }

    public final void run() {
        bbol bbol = this.f103016a;
        int i = this.f103017b;
        Throwable th = this.f103018c;
        if (bbol.f103020a.contains(Integer.valueOf(i))) {
            bbos.m88288a(5, bbol.f103021b, "Task executed for too long: ", th);
        }
    }
}
