package p000;

/* renamed from: nxo */
final /* synthetic */ class nxo implements Runnable {

    /* renamed from: a */
    private final nxp f36881a;

    public nxo(nxp nxp) {
        this.f36881a = nxp;
    }

    public final void run() {
        nxp nxp = this.f36881a;
        int a = nxp.f36884c.mo21806a();
        bnsi d = nxp.f36882a.mo68390d();
        d.mo68432a("nxp", "d", 195, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68409a("Most exclusive focus grant: %d", a);
        if (a != 0) {
            nji nji = nxp.f36885d;
            nji.f35800a.mo20885a(a);
            njj njj = nji.f35800a;
            String valueOf = String.valueOf(nxs.m28138a(a));
            if (valueOf.length() != 0) {
                "onExternalAppGainAudioFocus ".concat(valueOf);
            } else {
                new String("onExternalAppGainAudioFocus ");
            }
            njj.mo20893d();
            return;
        }
        nxp.f36885d.mo20883a();
    }
}
