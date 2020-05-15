package p000;

/* renamed from: aglj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aglj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aghq f65879a;

    /* renamed from: b */
    final /* synthetic */ aglm f65880b;

    public aglj(aglm aglm, aghq aghq) {
        this.f65880b = aglm;
        this.f65879a = aghq;
    }

    public final void run() {
        synchronized (this.f65880b) {
            this.f65880b.f65883a = false;
            if (!this.f65880b.f65885c.mo35622o()) {
                this.f65880b.f65885c.mo35497E().f65571j.mo35435a("Connected to remote service");
                this.f65880b.f65885c.mo35616a(this.f65879a);
            }
        }
    }
}
