package p000;

import java.io.IOException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;

/* renamed from: bqpq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqpq extends bqnp {
    public bqpq(Class cls) {
        super(cls);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo69295b(bxxc bxxc) {
        bqro bqro = (bqro) bxxc;
        bqrp bqrp = bqro.f141459a;
        if (bqrp == null) {
            bqrp = bqrp.f141460d;
        }
        bqrs bqrs = bqrp.f141462a;
        if (bqrs == null) {
            bqrs = bqrs.f141476d;
        }
        int b = bqrw.m113300b(bqrs.f141478a);
        if (b == 0) {
            b = 1;
        }
        KeyPair b2 = bqvm.m113486b(bqqb.m113229b(b));
        ECPrivateKey eCPrivateKey = (ECPrivateKey) b2.getPrivate();
        ECPoint w = ((ECPublicKey) b2.getPublic()).getW();
        bxvd da = bqrr.f141470e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bqrr) da.f164949b).f141472a = 0;
        bqrp bqrp2 = bqro.f141459a;
        if (bqrp2 == null) {
            bqrp2 = bqrp.f141460d;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bqrp2.getClass();
        ((bqrr) da.f164949b).f141473b = bqrp2;
        bxtx a = bxtx.m123261a(w.getAffineX().toByteArray());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((bqrr) da.f164949b).f141474c = a;
        bxtx a2 = bxtx.m123261a(w.getAffineY().toByteArray());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a2.getClass();
        ((bqrr) da.f164949b).f141475d = a2;
        bqrr bqrr = (bqrr) da.mo74062i();
        bxvd da2 = bqrq.f141465d.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bqrq bqrq = (bqrq) da2.f164949b;
        bqrq.f141467a = 0;
        bqrr.getClass();
        bqrq.f141468b = bqrr;
        bxtx a3 = bxtx.m123261a(eCPrivateKey.getS().toByteArray());
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        a3.getClass();
        ((bqrq) da2.f164949b).f141469c = a3;
        return (bqrq) da2.mo74062i();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69293a(bxtx bxtx) {
        bxus b = bxus.m123743b();
        bqro bqro = bqro.f141457b;
        try {
            bxuc h = bxtx.mo73764h();
            bxvk bxvk = (bxvk) bqro.mo74142c(4);
            bxxv a = bxxm.f165037a.mo74228a(bxvk);
            a.mo74220a(bxvk, bxud.m123454a(h), b);
            a.mo74225d(bxvk);
            h.mo73787a(0);
            bxvk.m124027b(bxvk);
            return (bqro) bxvk;
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
    public final /* bridge */ /* synthetic */ void mo69294a(bxxc bxxc) {
        bqrp bqrp = ((bqro) bxxc).f141459a;
        if (bqrp == null) {
            bqrp = bqrp.f141460d;
        }
        bqqb.m113228a(bqrp);
    }
}
