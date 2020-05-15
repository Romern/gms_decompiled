package p000;

/* renamed from: puf */
final /* synthetic */ class puf implements Runnable {

    /* renamed from: a */
    private final pug f40251a;

    public puf(pug pug) {
        this.f40251a = pug;
    }

    public final void run() {
        pug pug = this.f40251a;
        synchronized (pug.f40252d) {
            if (pug.f40254a != -1) {
                pug.mo23688a(15);
            }
        }
    }
}
