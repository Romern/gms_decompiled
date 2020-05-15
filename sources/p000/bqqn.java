package p000;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: bqqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqqn extends bqnp {
    public bqqn(Class cls) {
        super(cls);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo69295b(bxxc bxxc) {
        bqsa bqsa = (bqsa) bxxc;
        bxvd da = bqrz.f141496d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bqrz) da.f164949b).f141498a = 0;
        bqsb bqsb = bqsa.f141503a;
        if (bqsb == null) {
            bqsb = bqsb.f141505c;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bqsb.getClass();
        ((bqrz) da.f164949b).f141499b = bqsb;
        ByteString a = ByteString.m123261a(bqwf.m113516a(bqsa.f141504b));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((bqrz) da.f164949b).f141500c = a;
        return (bqrz) da.mo74062i();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69293a(ByteString bxtx) {
        bxus b = bxus.m123743b();
        bqsa bqsa = bqsa.f141501c;
        try {
            bxuc h = bxtx.mo73764h();
            GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) bqsa.mo74142c(4);
            bxxv a = bxxm.f165037a.mo74228a(GeneratedMessageLite);
            a.mo74220a(GeneratedMessageLite, bxud.m123454a(h), b);
            a.mo74225d(GeneratedMessageLite);
            h.mo73787a(0);
            GeneratedMessageLite.m124027b(GeneratedMessageLite);
            return (bqsa) GeneratedMessageLite;
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
        bqsa bqsa = (bqsa) bxxc;
        if (bqsa.f141504b >= 16) {
            bqsb bqsb = bqsa.f141503a;
            if (bqsb == null) {
                bqsb = bqsb.f141505c;
            }
            bqqo.m113257a(bqsb);
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
