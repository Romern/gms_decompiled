package p000;

/* renamed from: adnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adnp implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bqgg f62229a;

    /* renamed from: b */
    final /* synthetic */ adnq f62230b;

    public adnp(adnq adnq, bqgg bqgg) {
        this.f62230b = adnq;
        this.f62229a = bqgg;
    }

    public final void run() {
        if (this.f62229a.isCancelled()) {
            this.f62230b.mo33688b();
        }
    }
}
