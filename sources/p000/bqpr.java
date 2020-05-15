package p000;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: bqpr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqpr extends bqoc {
    public bqpr() {
        super(bqrq.class, new bqpp(bqnj.class));
    }

    /* renamed from: a */
    public final String mo69299a() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bxxc mo69315b(bxxc bxxc) {
        bqrr bqrr = ((bqrq) bxxc).f141468b;
        return bqrr == null ? bqrr.f141470e : bqrr;
    }

    /* renamed from: c */
    public final bqnp mo69302c() {
        return new bqpq(bqro.class);
    }

    /* renamed from: d */
    public final int mo69303d() {
        return 4;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69297a(ByteString bxtx) {
        bxus b = bxus.m123743b();
        bqrq bqrq = bqrq.f141465d;
        try {
            bxuc h = bxtx.mo73764h();
            GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) bqrq.mo74142c(4);
            bxxv a = bxxm.f165037a.mo74228a(GeneratedMessageLite);
            a.mo74220a(GeneratedMessageLite, bxud.m123454a(h), b);
            a.mo74225d(GeneratedMessageLite);
            h.mo73787a(0);
            GeneratedMessageLite.m124027b(GeneratedMessageLite);
            return (bqrq) GeneratedMessageLite;
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
        bqrq bqrq = (bqrq) bxxc;
        if (!bqrq.f141469c.mo73779j()) {
            bqwl.m113528c(bqrq.f141467a);
            bqrr bqrr = bqrq.f141468b;
            if (bqrr == null) {
                bqrr = bqrr.f141470e;
            }
            bqrp bqrp = bqrr.f141473b;
            if (bqrp == null) {
                bqrp = bqrp.f141460d;
            }
            bqqb.m113228a(bqrp);
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }
}
