package p000;

import android.location.Location;

/* renamed from: aerv */
final /* synthetic */ class aerv implements Runnable {

    /* renamed from: a */
    private final aerw f63697a;

    /* renamed from: b */
    private final Location f63698b;

    public aerv(aerw aerw, Location location) {
        this.f63697a = aerw;
        this.f63698b = location;
    }

    public final void run() {
        aerw aerw = this.f63697a;
        Location location = this.f63698b;
        aehz aehz = aerw.f63700b;
        if (aehz != null) {
            aehz.mo7032a(location);
        }
    }
}
