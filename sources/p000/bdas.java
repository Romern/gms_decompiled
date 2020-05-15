package p000;

/* renamed from: bdas */
final /* synthetic */ class bdas implements bdaq {

    /* renamed from: a */
    private final bdat f105247a;

    public bdas(bdat bdat) {
        this.f105247a = bdat;
    }

    /* renamed from: a */
    public final void mo54573a(Object obj) {
        bdat bdat = this.f105247a;
        synchronized (bdat.f105250c) {
            synchronized (bdat) {
                if (!bdat.f105249b) {
                    bdat.f105249b = true;
                    bdav bdav = bdat.f105250c;
                    bdav.f105254b--;
                }
                bdat.f105250c.f105253a.put(bdat.f105248a, obj);
                bdav bdav2 = bdat.f105250c;
                if (bdav2.f105254b == 0) {
                    bdav2.mo56705a(new bdau(bdav2.f105253a));
                }
            }
        }
    }
}
