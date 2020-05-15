package p000;

/* renamed from: cazq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cazq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ cazw f176454a;

    /* renamed from: b */
    final /* synthetic */ cazr f176455b;

    public cazq(cazr cazr, cazw cazw) {
        this.f176455b = cazr;
        this.f176454a = cazw;
    }

    public final void run() {
        if (this.f176455b.f176456a.isCancelled()) {
            bqgg bqgg = this.f176455b.f176456a;
            boolean z = false;
            if ((bqgg instanceof cazp) && ((cazp) bqgg).mo75205c()) {
                z = true;
            }
            this.f176454a.mo14461a(z);
        }
    }
}
