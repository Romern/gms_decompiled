package p000;

/* renamed from: brxj */
final /* synthetic */ class brxj implements Runnable {

    /* renamed from: a */
    private final brxw f143562a;

    /* renamed from: b */
    private final String f143563b;

    /* renamed from: c */
    private final Throwable f143564c;

    public brxj(brxw brxw, String str, Throwable th) {
        this.f143562a = brxw;
        this.f143563b = str;
        this.f143564c = th;
    }

    public final void run() {
        brxw brxw = this.f143562a;
        String str = this.f143563b;
        Throwable th = this.f143564c;
        for (bqgg bqgg : brxw.f143595a) {
            bqgg.cancel(true);
        }
        chqs chqs = brxw.f143602h;
        if (chqs != null) {
            chqs.mo70031a(str, th);
        }
    }
}
