package p000;

import java.io.IOException;

/* renamed from: bqpb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqpb extends bqnr {
    public bqpb() {
        super(bqrd.class, new bqoz(bqng.class));
    }

    /* renamed from: a */
    public final String mo69299a() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    /* renamed from: c */
    public final bqnp mo69302c() {
        return new bqpa(bqre.class);
    }

    /* renamed from: d */
    public final int mo69303d() {
        return 3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69297a(bxtx bxtx) {
        bxus b = bxus.m123743b();
        bqrd bqrd = bqrd.f141422c;
        try {
            bxuc h = bxtx.mo73764h();
            bxvk bxvk = (bxvk) bqrd.mo74142c(4);
            bxxv a = bxxm.f165037a.mo74228a(bxvk);
            a.mo74220a(bxvk, bxud.m123454a(h), b);
            a.mo74225d(bxvk);
            h.mo73787a(0);
            bxvk.m124027b(bxvk);
            return (bqrd) bxvk;
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
        bqrd bqrd = (bqrd) bxxc;
        bqwl.m113528c(bqrd.f141424a);
        bqwl.m113526a(bqrd.f141425b.mo73744a());
    }
}
