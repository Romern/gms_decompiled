package p000;

import java.io.IOException;

/* renamed from: bqpd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqpd extends bqnp {
    public bqpd(Class cls) {
        super(cls);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo69295b(bxxc bxxc) {
        bqrg bqrg = (bqrg) bxxc;
        bxvd da = bqrf.f141429c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bqrf) da.f164949b).f141431a = 0;
        ByteString a = ByteString.m123261a(bqwf.m113516a(32));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((bqrf) da.f164949b).f141432b = a;
        return (bqrf) da.mo74062i();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69293a(ByteString bxtx) {
        bxus b = bxus.m123743b();
        bqrg bqrg = bqrg.f141433a;
        try {
            bxuc h = bxtx.mo73764h();
            GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) bqrg.mo74142c(4);
            bxxv a = bxxm.f165037a.mo74228a(GeneratedMessageLite);
            a.mo74220a(GeneratedMessageLite, bxud.m123454a(h), b);
            a.mo74225d(GeneratedMessageLite);
            h.mo73787a(0);
            GeneratedMessageLite.m124027b(GeneratedMessageLite);
            return (bqrg) GeneratedMessageLite;
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
        bqrg bqrg = (bqrg) bxxc;
    }
}
