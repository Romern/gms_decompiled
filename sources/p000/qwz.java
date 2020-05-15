package p000;

/* renamed from: qwz */
final /* synthetic */ class qwz implements Runnable {

    /* renamed from: a */
    private final qxq f42354a;

    public qwz(qxq qxq) {
        this.f42354a = qxq;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        qxq qxq = this.f42354a;
        qxq.f42384e.writeLock().lock();
        try {
            qxq.f42387h = null;
            qxq.f42384e.writeLock().unlock();
            qxq.mo24388e();
        } catch (Throwable th) {
            qxq.f42384e.writeLock().unlock();
            throw th;
        }
    }
}
