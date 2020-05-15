package p000;

/* renamed from: aryi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aryi implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aryp f88453a;

    public aryi(aryp aryp) {
        this.f88453a = aryp;
    }

    public final void run() {
        aryp aryp = this.f88453a;
        if (!aryp.f88468j) {
            aryp.mo48941a(true);
            this.f88453a.mo48943c();
        } else {
            aryp.mo48941a(false);
            this.f88453a.mo48944d();
        }
        aryp aryp2 = this.f88453a;
        aryp2.f88461c.postDelayed(aryp2.f88469k, 5000);
    }
}
