package p000;

import java.io.IOException;

/* renamed from: bqpl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqpl extends bqnr {
    public bqpl() {
        super(bqso.class, new bqpj(bqng.class));
    }

    /* renamed from: a */
    public final String mo69299a() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    /* renamed from: c */
    public final bqnp mo69302c() {
        return new bqpk(bqsp.class);
    }

    /* renamed from: d */
    public final int mo69303d() {
        return 6;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69297a(ByteString bxtx) {
        bxus b = bxus.m123743b();
        bqso bqso = bqso.f141552c;
        try {
            bxuc h = bxtx.mo73764h();
            GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) bqso.mo74142c(4);
            bxxv a = bxxm.f165037a.mo74228a(GeneratedMessageLite);
            a.mo74220a(GeneratedMessageLite, bxud.m123454a(h), b);
            a.mo74225d(GeneratedMessageLite);
            h.mo73787a(0);
            GeneratedMessageLite.m124027b(GeneratedMessageLite);
            return (bqso) GeneratedMessageLite;
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
        bqwl.m113528c(((bqso) bxxc).f141554a);
    }
}
