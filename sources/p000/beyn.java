package p000;

import android.location.Location;

/* renamed from: beyn */
final /* synthetic */ class beyn implements Runnable {

    /* renamed from: a */
    private final beyo f113019a;

    /* renamed from: b */
    private final Location f113020b;

    public beyn(beyo beyo, Location location) {
        this.f113019a = beyo;
        this.f113020b = location;
    }

    public final void run() {
        beyo beyo = this.f113019a;
        Location location = this.f113020b;
        if (beyo.f113021a.f113047j) {
            beyo.f113021a.f113054q = location;
        }
    }
}
