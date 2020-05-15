package p000;

import android.os.RemoteException;

/* renamed from: pba */
public final /* synthetic */ class pba implements Runnable {

    /* renamed from: a */
    private final pbm f38746a;

    /* renamed from: b */
    private final bipi f38747b;

    public pba(pbm pbm, bipi bipi) {
        this.f38746a = pbm;
        this.f38747b = bipi;
    }

    public final void run() {
        pbm pbm = this.f38746a;
        bipi bipi = this.f38747b;
        if (!pbm.f38787m.f38768a) {
            return;
        }
        if (ccpv.m131194c()) {
            omm omm = pbm.f38787m.f38774g;
            if (omm != null) {
                try {
                    omm.mo22294a(pbm.f38778d, bipi.f121169f);
                } catch (RemoteException e) {
                    bnsi d = pbm.f38775a.mo68390d();
                    d.mo68437a(e);
                    d.mo68432a("pbm", "b", 345, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d.mo68420a("Couldn't stop %s, but it could be fine.", pbm.f38787m.f38772e);
                }
            }
            pbm.f38777c.unbindService(pbm.f38786l);
            pbm.f38787m.f38768a = false;
            return;
        }
        omm omm2 = pbm.f38787m.f38774g;
        bmxy.m108581a(omm2);
        try {
            omm2.mo22294a(pbm.f38778d, bipi.f121169f);
        } catch (RemoteException e2) {
            bnsi d2 = pbm.f38775a.mo68390d();
            d2.mo68437a(e2);
            d2.mo68432a("pbm", "b", 356, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68420a("Couldn't stop %s, but it could be fine.", pbm.f38787m.f38772e);
        }
    }
}
