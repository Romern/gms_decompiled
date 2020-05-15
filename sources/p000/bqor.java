package p000;

import java.io.IOException;

/* renamed from: bqor */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqor extends bqnp {
    public bqor(Class cls) {
        super(cls);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo69295b(bxxc bxxc) {
        bqqw bqqw = (bqqw) bxxc;
        bqnp c = new bqov().mo69302c();
        bqqy bqqy = bqqw.f141396a;
        if (bqqy == null) {
            bqqy = bqqy.f141403c;
        }
        bqqx bqqx = (bqqx) c.mo69295b(bqqy);
        bqnp c2 = new bqqo().mo69302c();
        bqsa bqsa = bqqw.f141397b;
        if (bqsa == null) {
            bqsa = bqsa.f141501c;
        }
        bqrz bqrz = (bqrz) c2.mo69295b(bqsa);
        bxvd da = bqqv.f141389d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bqqv bqqv = (bqqv) da.f164949b;
        bqqx.getClass();
        bqqv.f141392b = bqqx;
        bqrz.getClass();
        bqqv.f141393c = bqrz;
        bqqv.f141391a = 0;
        return (bqqv) da.mo74062i();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69293a(ByteString bxtx) {
        bxus b = bxus.m123743b();
        bqqw bqqw = bqqw.f141394c;
        try {
            bxuc h = bxtx.mo73764h();
            GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) bqqw.mo74142c(4);
            bxxv a = bxxm.f165037a.mo74228a(GeneratedMessageLite);
            a.mo74220a(GeneratedMessageLite, bxud.m123454a(h), b);
            a.mo74225d(GeneratedMessageLite);
            h.mo73787a(0);
            GeneratedMessageLite.m124027b(GeneratedMessageLite);
            return (bqqw) GeneratedMessageLite;
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
        bqqw bqqw = (bqqw) bxxc;
        bqnp c = new bqov().mo69302c();
        bqqy bqqy = bqqw.f141396a;
        if (bqqy == null) {
            bqqy = bqqy.f141403c;
        }
        c.mo69294a(bqqy);
        bqnp c2 = new bqqo().mo69302c();
        bqsa bqsa = bqqw.f141397b;
        if (bqsa == null) {
            bqsa = bqsa.f141501c;
        }
        c2.mo69294a(bqsa);
        bqqy bqqy2 = bqqw.f141396a;
        if (bqqy2 == null) {
            bqqy2 = bqqy.f141403c;
        }
        bqwl.m113526a(bqqy2.f141406b);
    }
}
