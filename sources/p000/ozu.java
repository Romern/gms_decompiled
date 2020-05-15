package p000;

import android.os.RemoteException;

/* renamed from: ozu */
final /* synthetic */ class ozu implements Runnable {

    /* renamed from: a */
    private final pam f38682a;

    /* renamed from: b */
    private final bipi f38683b;

    public ozu(pam pam, bipi bipi) {
        this.f38682a = pam;
        this.f38683b = bipi;
    }

    public final void run() {
        pam pam = this.f38682a;
        bipi bipi = this.f38683b;
        pad pad = pam.f38723g;
        if (pad != null) {
            try {
                pad.f38705m.mo22294a(pad.f38695c, bipi.f121169f);
            } catch (RemoteException e) {
                bnsi d = pam.f38717a.mo68390d();
                d.mo68437a(e);
                d.mo68432a("pad", "a", 333, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68420a("Couldn't send bye-bye request to %s, but it could be fine.", pad.f38696d);
            }
        }
    }
}
