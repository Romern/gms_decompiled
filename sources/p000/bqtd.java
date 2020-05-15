package p000;

import java.io.IOException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;

/* renamed from: bqtd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqtd extends bqnp {
    public bqtd(Class cls) {
        super(cls);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo69295b(bxxc bxxc) {
        bqrj bqrj = ((bqri) bxxc).f141437a;
        if (bqrj == null) {
            bqrj = bqrj.f141438d;
        }
        int b = bqrw.m113300b(bqrj.f141441b);
        if (b == 0) {
            b = 1;
        }
        KeyPair b2 = bqvm.m113486b(bqua.m113410b(b));
        ECPrivateKey eCPrivateKey = (ECPrivateKey) b2.getPrivate();
        ECPoint w = ((ECPublicKey) b2.getPublic()).getW();
        bxvd da = bqrl.f141448e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bqrl bqrl = (bqrl) da.f164949b;
        bqrl.f141450a = 0;
        bqrj.getClass();
        bqrl.f141451b = bqrj;
        bxtx a = bxtx.m123261a(w.getAffineX().toByteArray());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((bqrl) da.f164949b).f141452c = a;
        bxtx a2 = bxtx.m123261a(w.getAffineY().toByteArray());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a2.getClass();
        ((bqrl) da.f164949b).f141453d = a2;
        bqrl bqrl2 = (bqrl) da.mo74062i();
        bxvd da2 = bqrk.f141443d.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bqrk bqrk = (bqrk) da2.f164949b;
        bqrk.f141445a = 0;
        bqrl2.getClass();
        bqrk.f141446b = bqrl2;
        bxtx a3 = bxtx.m123261a(eCPrivateKey.getS().toByteArray());
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        a3.getClass();
        ((bqrk) da2.f164949b).f141447c = a3;
        return (bqrk) da2.mo74062i();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69293a(bxtx bxtx) {
        bxus b = bxus.m123743b();
        bqri bqri = bqri.f141435b;
        try {
            bxuc h = bxtx.mo73764h();
            bxvk bxvk = (bxvk) bqri.mo74142c(4);
            bxxv a = bxxm.f165037a.mo74228a(bxvk);
            a.mo74220a(bxvk, bxud.m123454a(h), b);
            a.mo74225d(bxvk);
            h.mo73787a(0);
            bxvk.m124027b(bxvk);
            return (bqri) bxvk;
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
        bqrj bqrj = ((bqri) bxxc).f141437a;
        if (bqrj == null) {
            bqrj = bqrj.f141438d;
        }
        bqua.m113407a(bqrj);
    }
}
