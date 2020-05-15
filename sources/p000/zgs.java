package p000;

/* renamed from: zgs */
final /* synthetic */ class zgs implements Runnable {

    /* renamed from: a */
    private final zha f55038a;

    /* renamed from: b */
    private final zgu f55039b;

    public zgs(zha zha, zgu zgu) {
        this.f55038a = zha;
        this.f55039b = zgu;
    }

    public final void run() {
        zha zha = this.f55038a;
        zgu zgu = this.f55039b;
        synchronized (zha.f55058h) {
            if (zha.f55059i.mo31100a(zgu)) {
                ((bnsl) zha.f55051a.mo68388c()).mo68405a("Connection is still in progress. Resetting connection.");
                zha.mo31109a(true);
            }
        }
    }
}
