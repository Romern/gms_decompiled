package p000;

/* renamed from: asda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asda implements Runnable {

    /* renamed from: a */
    final /* synthetic */ asdc f88724a;

    public asda(asdc asdc) {
        this.f88724a = asdc;
    }

    public final void run() {
        synchronized (this.f88724a) {
            if (this.f88724a.mo49061c()) {
                this.f88724a.f88727c.startScan();
                asdc asdc = this.f88724a;
                asdc.f88725a.postDelayed(asdc.f88726b, 5000);
            }
        }
    }
}
