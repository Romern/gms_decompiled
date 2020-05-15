package p000;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: bqtl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqtl extends bqnr {
    public bqtl() {
        super(bqrv.class, new bqtk(bqoe.class));
    }

    /* renamed from: a */
    public static final void m113364a(bqrv bqrv) {
        bqwl.m113528c(bqrv.f141490a);
        if (bqrv.f141491b.mo73744a() != 32) {
            throw new GeneralSecurityException("invalid Ed25519 public key: incorrect key length");
        }
    }

    /* renamed from: a */
    public final String mo69299a() {
        return "type.googleapis.com/google.crypto.tink.Ed25519PublicKey";
    }

    /* renamed from: d */
    public final int mo69303d() {
        return 5;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69297a(bxtx bxtx) {
        bxus b = bxus.m123743b();
        bqrv bqrv = bqrv.f141488c;
        try {
            bxuc h = bxtx.mo73764h();
            bxvk bxvk = (bxvk) bqrv.mo74142c(4);
            bxxv a = bxxm.f165037a.mo74228a(bxvk);
            a.mo74220a(bxvk, bxud.m123454a(h), b);
            a.mo74225d(bxvk);
            h.mo73787a(0);
            bxvk.m124027b(bxvk);
            return (bqrv) bxvk;
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
        m113364a((bqrv) bxxc);
    }
}
