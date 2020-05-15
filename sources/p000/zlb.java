package p000;

/* renamed from: zlb */
final /* synthetic */ class zlb implements Runnable {

    /* renamed from: a */
    private final bqgy f55359a;

    /* renamed from: b */
    private final int f55360b;

    public zlb(bqgy bqgy, int i) {
        this.f55359a = bqgy;
        this.f55360b = i;
    }

    public final void run() {
        zld zld;
        bqgy bqgy = this.f55359a;
        int i = this.f55360b;
        Object obj = zle.f55365b;
        if (bqgy.isCancelled()) {
            synchronized (zle.f55365b) {
                zld = (zld) zle.f55366c.remove(Integer.valueOf(i));
            }
            if (zld != null) {
                zld.f55364b.run();
            }
        }
    }
}
