package p000;

/* renamed from: cigc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cigc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ cigh f190081a;

    public cigc(cigh cigh) {
        this.f190081a = cigh;
    }

    public final void run() {
        cigh cigh = this.f190081a;
        cigh.f190119n = new cigg(cigh, null, null);
        cigh cigh2 = this.f190081a;
        cigh2.f190117l.execute(cigh2.f190119n);
        synchronized (this.f190081a.f190115j) {
            cigh cigh3 = this.f190081a;
            cigh3.f190126u = Integer.MAX_VALUE;
            cigh3.mo86063c();
        }
        throw null;
    }
}
