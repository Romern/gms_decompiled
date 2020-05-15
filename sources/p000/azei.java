package p000;

/* renamed from: azei */
final /* synthetic */ class azei implements Runnable {

    /* renamed from: a */
    private final azet f99163a;

    public azei(azet azet) {
        this.f99163a = azet;
    }

    public final void run() {
        azet azet = this.f99163a;
        synchronized (azet.f99185a) {
            ciiv ciiv = azet.f99201q;
            if (ciiv != null) {
                bxvd da = cbjt.f177365c.mo74144da();
                bxvd da2 = cbjr.f177359b.mo74144da();
                cbjp g = azet.mo54851g();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                g.getClass();
                ((cbjr) da2.f164949b).f177361a = g;
                cbjr cbjr = (cbjr) da2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cbjt cbjt = (cbjt) da.f164949b;
                cbjr.getClass();
                cbjt.f177368b = cbjr;
                cbjt.f177367a = 5;
                ciiv.mo25549a((cbjt) da.mo74062i());
            }
        }
    }
}
