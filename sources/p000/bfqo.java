package p000;

/* renamed from: bfqo */
public final /* synthetic */ class bfqo implements Runnable {

    /* renamed from: a */
    private final bfqs f114901a;

    /* renamed from: b */
    private final long f114902b;

    /* renamed from: c */
    private final bsde f114903c;

    public bfqo(bfqs bfqs, long j, bsde bsde) {
        this.f114901a = bfqs;
        this.f114902b = j;
        this.f114903c = bsde;
    }

    public final void run() {
        bfqs bfqs = this.f114901a;
        long j = this.f114902b;
        bsde bsde = this.f114903c;
        if (bfqs.f114918c) {
            bfqs.f114920e.mo26009a(41);
            bfqs.f114919d.mo70212a(j, bsde);
            bfqs.mo62155b(j);
        }
    }
}
