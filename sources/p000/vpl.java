package p000;

/* renamed from: vpl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vpl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ vpn f49716a;

    public vpl(vpn vpn) {
        this.f49716a = vpn;
    }

    public final void run() {
        synchronized (this.f49716a) {
            this.f49716a.f49725f = System.currentTimeMillis();
            vpn vpn = this.f49716a;
            vpn.f49726g = false;
            int i = vpn.f49727h;
            if (i == 0) {
                throw null;
            } else if (i == 1) {
                vpn.f49727h = 2;
                vpn.f49724e.execute(vpn.f49720a);
            } else {
                vpn.f49727h = 3;
            }
        }
    }
}
