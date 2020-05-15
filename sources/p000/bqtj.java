package p000;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: bqtj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqtj extends bqoc {
    public bqtj() {
        super(bqru.class, new bqth(bqod.class));
    }

    /* renamed from: a */
    public final String mo69299a() {
        return "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey";
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bxxc mo69315b(bxxc bxxc) {
        bqrv bqrv = ((bqru) bxxc).f141487c;
        return bqrv == null ? bqrv.f141488c : bqrv;
    }

    /* renamed from: c */
    public final bqnp mo69302c() {
        return new bqti(bqrt.class);
    }

    /* renamed from: d */
    public final int mo69303d() {
        return 4;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69297a(ByteString bxtx) {
        bxus b = bxus.m123743b();
        bqru bqru = bqru.f141483d;
        try {
            bxuc h = bxtx.mo73764h();
            GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) bqru.mo74142c(4);
            bxxv a = bxxm.f165037a.mo74228a(GeneratedMessageLite);
            a.mo74220a(GeneratedMessageLite, bxud.m123454a(h), b);
            a.mo74225d(GeneratedMessageLite);
            h.mo73787a(0);
            GeneratedMessageLite.m124027b(GeneratedMessageLite);
            return (bqru) GeneratedMessageLite;
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
        bqru bqru = (bqru) bxxc;
        bqwl.m113528c(bqru.f141485a);
        new bqtl();
        bqrv bqrv = bqru.f141487c;
        if (bqrv == null) {
            bqrv = bqrv.f141488c;
        }
        bqtl.m113364a(bqrv);
        if (bqru.f141486b.mo73744a() != 32) {
            throw new GeneralSecurityException("invalid Ed25519 private key: incorrect key length");
        }
    }
}
