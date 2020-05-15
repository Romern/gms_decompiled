package p000;

/* renamed from: oyo */
final /* synthetic */ class oyo implements C0038ax {

    /* renamed from: a */
    private final oyp f38630a;

    public oyo(oyp oyp) {
        this.f38630a = oyp;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        int i;
        oyp oyp = this.f38630a;
        oyd oyd = (oyd) obj;
        int i2 = oyd.f38605a;
        int i3 = (int) (oyd.f38606b * 100.0f);
        bnsi d = oyp.f38631a.mo68390d();
        d.mo68432a("oyp", "a", 124, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68411a("updateInstallationProgress status=%d, progress=%d", i2, i3);
        if (i2 == 1) {
            oyp.mo22803b().f38656b.mo22797a(bpeb.FRX_PRESETUP_INTRO_DOWNLOAD, bpea.FRX_DOWNLOAD_SUCCESS);
            oyp.f38632b.f38603g.mo2444a(oyp);
            ozj b = oyp.mo22803b();
            if (oyp.mo22803b().f38658d == 2) {
                i = 11;
            } else {
                i = 7;
            }
            b.mo22804a(i);
        } else if (i2 == 4) {
            oyp.f38633c.setIndeterminate(false);
            oyp.f38633c.setProgress(i3);
        } else if (i2 != 5) {
            oyp.f38633c.setIndeterminate(true);
        } else {
            oyp.mo22790a(bpea.FRX_DOWNLOAD_INSTALLATION_ERROR);
        }
    }
}
