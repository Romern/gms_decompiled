package p000;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: bqoy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqoy extends bqnr {
    public bqoy() {
        super(bqra.class, new bqow(bqng.class));
    }

    /* renamed from: a */
    public final String mo69299a() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    /* renamed from: c */
    public final bqnp mo69302c() {
        return new bqox(bqrb.class);
    }

    /* renamed from: d */
    public final int mo69303d() {
        return 3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69297a(ByteString bxtx) {
        bxus b = bxus.m123743b();
        bqra bqra = bqra.f141410d;
        try {
            bxuc h = bxtx.mo73764h();
            GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) bqra.mo74142c(4);
            bxxv a = bxxm.f165037a.mo74228a(GeneratedMessageLite);
            a.mo74220a(GeneratedMessageLite, bxud.m123454a(h), b);
            a.mo74225d(GeneratedMessageLite);
            h.mo73787a(0);
            GeneratedMessageLite.m124027b(GeneratedMessageLite);
            return (bqra) GeneratedMessageLite;
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
        bqra bqra = (bqra) bxxc;
        bqwl.m113528c(bqra.f141412a);
        bqwl.m113526a(bqra.f141414c.mo73744a());
        bqrc bqrc = bqra.f141413b;
        if (bqrc == null) {
            bqrc = bqrc.f141419b;
        }
        if (bqrc.f141421a != 12) {
            bqrc bqrc2 = bqra.f141413b;
            if (bqrc2 == null) {
                bqrc2 = bqrc.f141419b;
            }
            if (bqrc2.f141421a != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }
}
