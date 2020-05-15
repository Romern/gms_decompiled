package p000;

import java.io.IOException;

/* renamed from: bqpt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqpt extends bqnr {
    public bqpt() {
        super(bqrr.class, new bqps(bqnk.class));
    }

    /* renamed from: a */
    public final String mo69299a() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    /* renamed from: d */
    public final int mo69303d() {
        return 5;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69297a(bxtx bxtx) {
        bxus b = bxus.m123743b();
        bqrr bqrr = bqrr.f141470e;
        try {
            bxuc h = bxtx.mo73764h();
            bxvk bxvk = (bxvk) bqrr.mo74142c(4);
            bxxv a = bxxm.f165037a.mo74228a(bxvk);
            a.mo74220a(bxvk, bxud.m123454a(h), b);
            a.mo74225d(bxvk);
            h.mo73787a(0);
            bxvk.m124027b(bxvk);
            return (bqrr) bxvk;
        } catch (IOException e) {
            if (!(e.getCause() instanceof bxwf)) {
                throw new bxwf(e.getMessage());
            }
            throw ((bxwf) e.getCause());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof bxwf) {
                throw ((bxwf) e2.getCause());
            }
            throw e2;
        } catch (bxwf e3) {
            throw e3;
        } catch (bxwf e4) {
            throw e4;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69300a(bxxc bxxc) {
        bqrr bqrr = (bqrr) bxxc;
        bqwl.m113528c(bqrr.f141472a);
        bqrp bqrp = bqrr.f141473b;
        if (bqrp == null) {
            bqrp = bqrp.f141460d;
        }
        bqqb.m113228a(bqrp);
    }
}
