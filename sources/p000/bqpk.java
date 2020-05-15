package p000;

import java.io.IOException;

/* renamed from: bqpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqpk extends bqnp {
    public bqpk(Class cls) {
        super(cls);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo69295b(bxxc bxxc) {
        bqsp bqsp = (bqsp) bxxc;
        bxvd da = bqso.f141552c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bqso bqso = (bqso) da.f164949b;
        bqsp.getClass();
        bqso.f141555b = bqsp;
        bqso.f141554a = 0;
        return (bqso) da.mo74062i();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69293a(bxtx bxtx) {
        bxus b = bxus.m123743b();
        bqsp bqsp = bqsp.f141556c;
        try {
            bxuc h = bxtx.mo73764h();
            bxvk bxvk = (bxvk) bqsp.mo74142c(4);
            bxxv a = bxxm.f165037a.mo74228a(bxvk);
            a.mo74220a(bxvk, bxud.m123454a(h), b);
            a.mo74225d(bxvk);
            h.mo73787a(0);
            bxvk.m124027b(bxvk);
            return (bqsp) bxvk;
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
        bqsp bqsp = (bqsp) bxxc;
    }
}
