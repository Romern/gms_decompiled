package p000;

import android.os.RemoteException;

/* renamed from: paz */
public final /* synthetic */ class paz implements Runnable {

    /* renamed from: a */
    private final pbm f38745a;

    public paz(pbm pbm) {
        this.f38745a = pbm;
    }

    public final void run() {
        pbm pbm = this.f38745a;
        if (!pbm.f38787m.f38768a) {
            return;
        }
        if (ccpv.m131194c()) {
            omm omm = pbm.f38787m.f38774g;
            if (omm != null) {
                try {
                    omm.mo22304b(pbm.f38778d);
                } catch (RemoteException e) {
                    bnsi d = pbm.f38775a.mo68390d();
                    d.mo68437a(e);
                    d.mo68432a("pbm", "g", 310, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
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
            omm2.mo22304b(pbm.f38778d);
        } catch (RemoteException e2) {
            bnsi d2 = pbm.f38775a.mo68390d();
            d2.mo68437a(e2);
            d2.mo68432a("pbm", "g", 321, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68420a("Couldn't stop %s, but it could be fine.", pbm.f38787m.f38772e);
        }
    }
}
