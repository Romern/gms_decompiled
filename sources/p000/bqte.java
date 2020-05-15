package p000;

import java.io.IOException;

/* renamed from: bqte */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqte extends bqoc {
    public bqte() {
        super(bqrk.class, new bqtc(bqod.class));
    }

    /* renamed from: a */
    public final String mo69299a() {
        return "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey";
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bxxc mo69315b(bxxc bxxc) {
        bqrl bqrl = ((bqrk) bxxc).f141446b;
        return bqrl == null ? bqrl.f141448e : bqrl;
    }

    /* renamed from: c */
    public final bqnp mo69302c() {
        return new bqtd(bqri.class);
    }

    /* renamed from: d */
    public final int mo69303d() {
        return 4;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69297a(ByteString bxtx) {
        bxus b = bxus.m123743b();
        bqrk bqrk = bqrk.f141443d;
        try {
            bxuc h = bxtx.mo73764h();
            GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) bqrk.mo74142c(4);
            bxxv a = bxxm.f165037a.mo74228a(GeneratedMessageLite);
            a.mo74220a(GeneratedMessageLite, bxud.m123454a(h), b);
            a.mo74225d(GeneratedMessageLite);
            h.mo73787a(0);
            GeneratedMessageLite.m124027b(GeneratedMessageLite);
            return (bqrk) GeneratedMessageLite;
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
        bqrk bqrk = (bqrk) bxxc;
        bqwl.m113528c(bqrk.f141445a);
        bqrl bqrl = bqrk.f141446b;
        if (bqrl == null) {
            bqrl = bqrl.f141448e;
        }
        bqrj bqrj = bqrl.f141451b;
        if (bqrj == null) {
            bqrj = bqrj.f141438d;
        }
        bqua.m113407a(bqrj);
    }
}
