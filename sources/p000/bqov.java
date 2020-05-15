package p000;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: bqov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqov extends bqnr {
    public bqov() {
        super(bqqx.class, new bqot(bqwb.class));
    }

    /* renamed from: a */
    public static final void m113142a(bqqz bqqz) {
        int i = bqqz.f141409a;
        if (i < 12 || i > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    /* renamed from: a */
    public final String mo69299a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    /* renamed from: c */
    public final bqnp mo69302c() {
        return new bqou(bqqy.class);
    }

    /* renamed from: d */
    public final int mo69303d() {
        return 3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69297a(bxtx bxtx) {
        bxus b = bxus.m123743b();
        bqqx bqqx = bqqx.f141398d;
        try {
            bxuc h = bxtx.mo73764h();
            bxvk bxvk = (bxvk) bqqx.mo74142c(4);
            bxxv a = bxxm.f165037a.mo74228a(bxvk);
            a.mo74220a(bxvk, bxud.m123454a(h), b);
            a.mo74225d(bxvk);
            h.mo73787a(0);
            bxvk.m124027b(bxvk);
            return (bqqx) bxvk;
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
        bqqx bqqx = (bqqx) bxxc;
        bqwl.m113528c(bqqx.f141400a);
        bqwl.m113526a(bqqx.f141402c.mo73744a());
        bqqz bqqz = bqqx.f141401b;
        if (bqqz == null) {
            bqqz = bqqz.f141407b;
        }
        m113142a(bqqz);
    }
}
