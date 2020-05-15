package p000;

import android.location.Location;

/* renamed from: bfum */
final /* synthetic */ class bfum implements Runnable {

    /* renamed from: a */
    private final bfun f115349a;

    /* renamed from: b */
    private final Location f115350b;

    public bfum(bfun bfun, Location location) {
        this.f115349a = bfun;
        this.f115350b = location;
    }

    public final void run() {
        bfun bfun = this.f115349a;
        Location location = this.f115350b;
        if (bfun.f115354d) {
            bfun.mo62269a(location);
        }
    }
}
