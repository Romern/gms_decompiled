package p000;

import java.util.logging.Level;

/* renamed from: bknw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bknw implements bkou {

    /* renamed from: a */
    final /* synthetic */ bknv f124972a;

    public bknw(bknv bknv) {
        this.f124972a = bknv;
    }

    /* renamed from: a */
    public final void mo66151a() {
        bknv bknv = this.f124972a;
        bkny bkny = new bkny(bknv.mo66150b());
        if (!bknv.f124963a) {
            bkns bkns = bknv.f124969g;
            bknu.f124952a.logp(Level.INFO, "com.google.apps.brix.api.client.net.browserchannel.BrowserChannel$EventListener", "onBindComplete", "Bind request completed successfully.");
            if (!bkns.f124950a.mo66147c()) {
                bkns.f124950a.f124956e.mo28476a(bkpk.SUCCESS, new bknq(bkns.f124950a, bkny.f124974a));
            }
        }
    }

    /* renamed from: a */
    public final void mo66152a(bkos bkos) {
        bkow bkow = bkos.f125032a;
        if (bkow.f125035a != 400 || !bkow.f125036b.contains("Unknown SID")) {
            int i = bkow.f125035a;
            if (i < 400) {
                bknv bknv = this.f124972a;
                bknv.mo66149a(new bknz(1, bkow, bknv.mo66150b()));
                return;
            }
            bknv bknv2 = this.f124972a;
            bknv2.mo66149a(new bknz(2, bkow, i, bknv2.mo66150b()));
            return;
        }
        bknv bknv3 = this.f124972a;
        bknv3.mo66149a(new bknz(5, bkow, bknv3.mo66150b()));
    }

    /* renamed from: a */
    public final void mo66153a(bkot bkot) {
        int i;
        bkns bkns = this.f124972a.f124968f;
        bknu.f124952a.logp(Level.INFO, "com.google.apps.brix.api.client.net.browserchannel.BrowserChannel$EventListener", "onBindStart", "Bind request is now connected.");
        synchronized (bkns.f124950a) {
            bknu bknu = bkns.f124950a;
            i = bknu.f124959h;
            if (i == 1) {
                bknu.f124959h = 2;
            }
        }
        if (i == 1) {
            bkmx bkmx = (bkmx) bkns.f124950a.f124957f;
            if (bkmx.f124913c != null) {
                bkmx.mo66130a(new bkmy());
                ((bknd) bkmx.f124911a).f124920a.mo28476a(bkpk.SUCCESS, new bkmv());
            }
        }
    }

    /* renamed from: a */
    public final void mo66154a(CharSequence charSequence, int i, int i2) {
        this.f124972a.f124965c.mo66161a(charSequence, i, i2);
        bkoc a = this.f124972a.f124965c.mo66160a();
        while (a != null) {
            bknv bknv = this.f124972a;
            int i3 = a.f124985e;
            bknv.f124967e = (long) i3;
            if (i3 == 0) {
                try {
                    bknv.f124966d = a.f124987g;
                } catch (IllegalStateException e) {
                    bknv bknv2 = this.f124972a;
                    bknv2.mo66149a(new bknz(4, e, bknv2.mo66150b()));
                    return;
                }
            } else if (a.f124986f.equals(bkoc.f124983c)) {
                this.f124972a.mo66149a(new bknz(3, new IllegalStateException("Server sent stop message."), this.f124972a.mo66150b()));
            } else if (!a.f124986f.equals(bkoc.f124981a) && !a.f124986f.equals(bkoc.f124982b)) {
                bkns bkns = this.f124972a.f124971i;
                if (!bkns.f124950a.mo66147c()) {
                    bknr bknr = bkns.f124950a.f124957f;
                    if (!a.f124986f.equals(bkoc.f124984d)) {
                        continue;
                    } else {
                        synchronized (bknr) {
                            long j = a.f124988h;
                            if (j > ((bkmx) bknr).f124912b) {
                                ((bkmx) bknr).f124912b = j;
                                ((bkmx) bknr).mo66130a(a.f124989i);
                            }
                        }
                    }
                } else {
                    continue;
                }
            }
            a = this.f124972a.f124965c.mo66160a();
        }
    }
}
