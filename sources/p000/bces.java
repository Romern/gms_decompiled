package p000;

/* renamed from: bces */
final /* synthetic */ class bces implements Runnable {

    /* renamed from: a */
    private final bcfx f104060a;

    /* renamed from: b */
    private final bcns f104061b;

    public bces(bcfx bcfx, bcns bcns) {
        this.f104060a = bcfx;
        this.f104061b = bcns;
    }

    public final void run() {
        bcfx bcfx = this.f104060a;
        bcns bcns = this.f104061b;
        synchronized (bcfx.f104098b) {
            for (bcnt bcnt : bcfx.f104098b) {
                bcnt.mo56753a(bcns);
            }
        }
    }
}
