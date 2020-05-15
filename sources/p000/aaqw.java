package p000;

/* renamed from: aaqw */
final /* synthetic */ class aaqw implements Runnable {

    /* renamed from: a */
    private final aaqx f28951a;

    public aaqw(aaqx aaqx) {
        this.f28951a = aaqx;
    }

    public final void run() {
        aara aara;
        aaqx aaqx = this.f28951a;
        synchronized (aaqx) {
            aara = (aara) aaqx.f28956c.poll();
        }
        aaqx.mo17197b(aara);
    }
}
