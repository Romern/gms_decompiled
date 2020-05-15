package p000;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: bqox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqox extends bqnp {
    public bqox(Class cls) {
        super(cls);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo69295b(bxxc bxxc) {
        bqrb bqrb = (bqrb) bxxc;
        bxvd da = bqra.f141410d.mo74144da();
        bxtx a = bxtx.m123261a(bqwf.m113516a(bqrb.f141418b));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((bqra) da.f164949b).f141414c = a;
        bqrc bqrc = bqrb.f141417a;
        if (bqrc == null) {
            bqrc = bqrc.f141419b;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bqra bqra = (bqra) da.f164949b;
        bqrc.getClass();
        bqra.f141413b = bqrc;
        bqra.f141412a = 0;
        return (bqra) da.mo74062i();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69293a(bxtx bxtx) {
        bxus b = bxus.m123743b();
        bqrb bqrb = bqrb.f141415c;
        try {
            bxuc h = bxtx.mo73764h();
            bxvk bxvk = (bxvk) bqrb.mo74142c(4);
            bxxv a = bxxm.f165037a.mo74228a(bxvk);
            a.mo74220a(bxvk, bxud.m123454a(h), b);
            a.mo74225d(bxvk);
            h.mo73787a(0);
            bxvk.m124027b(bxvk);
            return (bqrb) bxvk;
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
        bqrb bqrb = (bqrb) bxxc;
        bqwl.m113526a(bqrb.f141418b);
        bqrc bqrc = bqrb.f141417a;
        if (bqrc == null) {
            bqrc = bqrc.f141419b;
        }
        if (bqrc.f141421a != 12) {
            bqrc bqrc2 = bqrb.f141417a;
            if (bqrc2 == null) {
                bqrc2 = bqrc.f141419b;
            }
            if (bqrc2.f141421a != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }
}
