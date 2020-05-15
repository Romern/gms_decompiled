package p000;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: bqqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqqo extends bqnr {
    public bqqo() {
        super(bqrz.class, new bqqm(bqnw.class));
    }

    /* renamed from: a */
    public static void m113257a(bqsb bqsb) {
        if (bqsb.f141508b >= 10) {
            int b = bqry.m113304b(bqsb.f141507a);
            if (b == 0) {
                b = 1;
            }
            int i = b - 2;
            if (i != 1) {
                if (i != 3) {
                    if (i != 4) {
                        throw new GeneralSecurityException("unknown hash type");
                    } else if (bqsb.f141508b > 64) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (bqsb.f141508b > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (bqsb.f141508b > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    /* renamed from: a */
    public final String mo69299a() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    /* renamed from: c */
    public final bqnp mo69302c() {
        return new bqqn(bqsa.class);
    }

    /* renamed from: d */
    public final int mo69303d() {
        return 3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69297a(bxtx bxtx) {
        bxus b = bxus.m123743b();
        bqrz bqrz = bqrz.f141496d;
        try {
            bxuc h = bxtx.mo73764h();
            bxvk bxvk = (bxvk) bqrz.mo74142c(4);
            bxxv a = bxxm.f165037a.mo74228a(bxvk);
            a.mo74220a(bxvk, bxud.m123454a(h), b);
            a.mo74225d(bxvk);
            h.mo73787a(0);
            bxvk.m124027b(bxvk);
            return (bqrz) bxvk;
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
        bqrz bqrz = (bqrz) bxxc;
        bqwl.m113528c(bqrz.f141498a);
        if (bqrz.f141500c.mo73744a() >= 16) {
            bqsb bqsb = bqrz.f141499b;
            if (bqsb == null) {
                bqsb = bqsb.f141505c;
            }
            m113257a(bqsb);
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
