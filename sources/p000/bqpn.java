package p000;

import java.io.IOException;

/* renamed from: bqpn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqpn extends bqnp {
    public bqpn(Class cls) {
        super(cls);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo69295b(bxxc bxxc) {
        bqtb bqtb = (bqtb) bxxc;
        bxvd da = bqta.f141613c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bqta) da.f164949b).f141615a = 0;
        ByteString a = ByteString.m123261a(bqwf.m113516a(32));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((bqta) da.f164949b).f141616b = a;
        return (bqta) da.mo74062i();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69293a(ByteString bxtx) {
        bxus b = bxus.m123743b();
        bqtb bqtb = bqtb.f141617a;
        try {
            bxuc h = bxtx.mo73764h();
            GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) bqtb.mo74142c(4);
            bxxv a = bxxm.f165037a.mo74228a(GeneratedMessageLite);
            a.mo74220a(GeneratedMessageLite, bxud.m123454a(h), b);
            a.mo74225d(GeneratedMessageLite);
            h.mo73787a(0);
            GeneratedMessageLite.m124027b(GeneratedMessageLite);
            return (bqtb) GeneratedMessageLite;
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
        bqtb bqtb = (bqtb) bxxc;
    }
}
