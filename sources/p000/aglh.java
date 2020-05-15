package p000;

/* renamed from: aglh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aglh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aghq f65875a;

    /* renamed from: b */
    final /* synthetic */ aglm f65876b;

    public aglh(aglm aglm, aghq aghq) {
        this.f65876b = aglm;
        this.f65875a = aghq;
    }

    public final void run() {
        synchronized (this.f65876b) {
            this.f65876b.f65883a = false;
            if (!this.f65876b.f65885c.mo35622o()) {
                this.f65876b.f65885c.mo35497E().f65572k.mo35435a("Connected to service");
                this.f65876b.f65885c.mo35616a(this.f65875a);
            }
        }
    }
}
