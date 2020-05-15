package p000;

import android.os.RemoteException;

/* renamed from: pax */
public final /* synthetic */ class pax implements Runnable {

    /* renamed from: a */
    private final pbm f38742a;

    /* renamed from: b */
    private final oml f38743b;

    public pax(pbm pbm, oml oml) {
        this.f38742a = pbm;
        this.f38743b = oml;
    }

    public final void run() {
        omm omm;
        pbm pbm = this.f38742a;
        oml oml = this.f38743b;
        pbl pbl = pbm.f38787m;
        omi omi = null;
        if (pbl.f38768a && (omm = pbl.f38774g) != null) {
            try {
                bnsi d = pbm.f38775a.mo68390d();
                d.mo68432a("pbm", "a", 271, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68405a("Fetching sensor service proxy from Gearhead.");
                omi = omm.mo22293a(oml);
                try {
                    bnsi d2 = pbm.f38775a.mo68390d();
                    d2.mo68432a("pbm", "a", 273, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d2.mo68420a("Sensor service proxy: %s", omi);
                } catch (RemoteException e) {
                    e = e;
                }
            } catch (RemoteException e2) {
                e = e2;
                bnsi c = pbm.f38775a.mo68388c();
                c.mo68437a(e);
                c.mo68432a("pbm", "a", 275, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("Cannot startup sensor service proxy");
                pbm.f38783i.mo22571a(omi);
            }
        }
        pbm.f38783i.mo22571a(omi);
    }
}
