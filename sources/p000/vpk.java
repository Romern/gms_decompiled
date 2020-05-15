package p000;

/* renamed from: vpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vpk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ vpn f49715a;

    public vpk(vpn vpn) {
        this.f49715a = vpn;
    }

    public final void run() {
        this.f49715a.f49722c.run();
        synchronized (this.f49715a) {
            vpn vpn = this.f49715a;
            int i = vpn.f49727h;
            if (i != 0) {
                vpn.f49727h = 1;
                if (i == 3) {
                    vpn.f49721b.run();
                }
            } else {
                throw null;
            }
        }
    }
}
