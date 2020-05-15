package p000;

import android.location.Location;

/* renamed from: bfuj */
final /* synthetic */ class bfuj implements Runnable {

    /* renamed from: a */
    private final bfuk f115333a;

    /* renamed from: b */
    private final Location f115334b;

    public bfuj(bfuk bfuk, Location location) {
        this.f115333a = bfuk;
        this.f115334b = location;
    }

    public final void run() {
        bfuk bfuk = this.f115333a;
        Location location = this.f115334b;
        if (bfuk.f115339e) {
            bfuk.mo62269a(location);
        }
    }
}
