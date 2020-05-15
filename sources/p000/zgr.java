package p000;

/* renamed from: zgr */
final /* synthetic */ class zgr implements Runnable {

    /* renamed from: a */
    private final zha f55036a;

    /* renamed from: b */
    private final zgu f55037b;

    public zgr(zha zha, zgu zgu) {
        this.f55036a = zha;
        this.f55037b = zgu;
    }

    public final void run() {
        zha zha = this.f55036a;
        zgu zgu = this.f55037b;
        synchronized (zha.f55058h) {
            if (zha.f55059i.mo31100a(zgu)) {
                ((bnsl) zha.f55051a.mo68388c()).mo68405a("Disconnect timed out.");
                if (zha.f55059i.f55041b) {
                    zha.mo31112c();
                }
            }
        }
    }
}
