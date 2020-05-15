package p000;

import java.io.IOException;

/* renamed from: bqpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqpa extends bqnp {
    public bqpa(Class cls) {
        super(cls);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo69295b(bxxc bxxc) {
        bxvd da = bqrd.f141422c.mo74144da();
        ByteString a = ByteString.m123261a(bqwf.m113516a(((bqre) bxxc).f141428a));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bqrd bqrd = (bqrd) da.f164949b;
        a.getClass();
        bqrd.f141425b = a;
        bqrd.f141424a = 0;
        return (bqrd) da.mo74062i();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69293a(ByteString bxtx) {
        bxus b = bxus.m123743b();
        bqre bqre = bqre.f141426b;
        try {
            bxuc h = bxtx.mo73764h();
            GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) bqre.mo74142c(4);
            bxxv a = bxxm.f165037a.mo74228a(GeneratedMessageLite);
            a.mo74220a(GeneratedMessageLite, bxud.m123454a(h), b);
            a.mo74225d(GeneratedMessageLite);
            h.mo73787a(0);
            GeneratedMessageLite.m124027b(GeneratedMessageLite);
            return (bqre) GeneratedMessageLite;
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
        bqwl.m113526a(((bqre) bxxc).f141428a);
    }
}
