package p000;

/* renamed from: nxn */
public final /* synthetic */ class nxn implements Runnable {

    /* renamed from: a */
    private final nxp f36880a;

    public nxn(nxp nxp) {
        this.f36880a = nxp;
    }

    public final void run() {
        nxp nxp = this.f36880a;
        bnsi d = nxp.f36882a.mo68390d();
        d.mo68432a("nxp", "c", 139, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("requestInitialAndroidFocus");
        if (!ccpg.f179680a.mo6606a().mo76581c()) {
            int b = nxp.mo21802b(1);
            if (b == 0) {
                bnsi b2 = nxp.f36882a.mo68387b();
                b2.mo68432a("nxp", "c", 160, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b2.mo68405a("Got unexpected AUDIOFOCUS_REQUEST_FAILED");
            } else if (b == 1) {
                nxp.f36885d.mo20883a();
            } else if (b != 2) {
                bnsi b3 = nxp.f36882a.mo68387b();
                b3.mo68432a("nxp", "c", 164, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b3.mo68409a("Unrecognized focus hint in doRequestInitialAndroidFocus: %d", b);
            }
        }
        bmxy.m108581a(nxp.f36883b);
        nxp.f36884c.f36894c = nxp.f36883b;
    }
}
