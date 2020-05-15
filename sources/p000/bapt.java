package p000;

/* renamed from: bapt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bapt implements baoj {

    /* renamed from: a */
    final /* synthetic */ bapl f101540a;

    /* renamed from: b */
    final /* synthetic */ cayo f101541b;

    /* renamed from: c */
    final /* synthetic */ cayo f101542c;

    public bapt(bapl bapl, cayo cayo, cayo cayo2) {
        this.f101540a = bapl;
        this.f101541b = cayo;
        this.f101542c = cayo2;
    }

    /* renamed from: a */
    public final void mo32729a(baog baog) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b2 A[Catch:{ banv -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b3 A[Catch:{ banv -> 0x00d5 }] */
    /* renamed from: a */
    public final void mo32730a(baog baog, baog baog2) {
        int i;
        boolean z;
        if (baog != null && baog.mo55818e().equals(baog2.mo55818e())) {
            baog.mo55817d().equals(baog2.mo55817d());
        }
        try {
            bapl bapl = this.f101540a;
            synchronized (bapl.f101508j) {
                bapk c = bapl.mo55879c(baog2.mo55816c(), baog2.mo55815b());
                Integer a = baqg.m87393a(baog2.mo55817d()).mo55886a(((babo) c.f101495k.f101503e.get(bygy.m124802a(c.f101487c.f166412a))).mo55562a(c.f101487c, c.f101488d), Integer.valueOf((int) c.f101495k.f101512n.mo32686h()));
                if (a != null) {
                    if (c.f101495k.f101512n.mo32691m()) {
                        bygv bygv = c.f101489e;
                        if (bygv != null) {
                            byjl byjl = bapk.m87324a(bygv, baog2.mo55814a()).f166372d;
                            if (byjl == null) {
                                byjl = byjl.f166668e;
                            }
                            byjk byjk = byjl.f166670a;
                            if (byjk == null) {
                                byjk = byjk.f166662e;
                            }
                            if (c.f101495k.f101512n.mo32681c()) {
                                byjk = baqs.m87414a(byjk, baog2.mo55817d());
                            }
                            i = bapk.m87325b(byjk);
                            z = byjk.f166665b;
                            if (!c.f101495k.f101512n.mo32682d()) {
                                c.mo55864a(bqao.SYNC_TRIGGER_SUBSCRIPTION);
                            }
                            c.mo55861a(Math.max(((long) a.intValue()) * 1000, c.f101495k.f101512n.mo32690l()), i, z);
                        }
                    }
                    i = c.f101495k.mo55869a();
                    z = false;
                    if (!c.f101495k.f101512n.mo32682d()) {
                    }
                    c.mo55861a(Math.max(((long) a.intValue()) * 1000, c.f101495k.f101512n.mo32690l()), i, z);
                }
            }
        } catch (banv e) {
            ((achw) this.f101541b.mo16713a()).mo25418e("Subscribe notify failed", new Object[0]);
            ((acdc) this.f101542c.mo16713a()).mo32707a("MDH sync subscription change failure", e);
        }
    }
}
