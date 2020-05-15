package p000;

/* renamed from: cigf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cigf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ cigh f190086a;

    public cigf(cigh cigh) {
        this.f190086a = cigh;
    }

    public final void run() {
        cigh cigh = this.f190086a;
        cigh.f190117l.execute(cigh.f190119n);
        synchronized (this.f190086a.f190115j) {
            cigh cigh2 = this.f190086a;
            cigh2.f190126u = Integer.MAX_VALUE;
            cigh2.mo86063c();
        }
    }
}
