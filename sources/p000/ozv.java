package p000;

import android.os.RemoteException;

/* renamed from: ozv */
final /* synthetic */ class ozv implements Runnable {

    /* renamed from: a */
    private final pam f38684a;

    public ozv(pam pam) {
        this.f38684a = pam;
    }

    public final void run() {
        pad pad = this.f38684a.f38723g;
        if (pad != null) {
            bnsi d = pam.f38717a.mo68390d();
            d.mo68432a("pad", "c", 340, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Tearing down connection");
            if (pad.f38704l == 1) {
                pad.f38704l = 2;
                try {
                    pad.f38705m.mo22304b(pad.f38695c);
                } catch (RemoteException e) {
                    bnsi d2 = pam.f38717a.mo68390d();
                    d2.mo68437a(e);
                    d2.mo68432a("pad", "c", 346, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d2.mo68420a("Couldn't stop %s, but it could be fine.", pad.f38696d);
                }
            }
            if (pad.f38704l == 2) {
                pad.f38704l = 3;
                pad.f38703k.f38718b.unbindService(pad);
            }
        }
    }
}
