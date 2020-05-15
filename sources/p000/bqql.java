package p000;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: bqql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqql extends bqnr {
    public bqql() {
        super(bqqs.class, new bqqj(bqnw.class));
    }

    /* renamed from: a */
    public static void m113246a(int i) {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 16 bytes");
        }
    }

    /* renamed from: a */
    public final String mo69299a() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    /* renamed from: c */
    public final bqnp mo69302c() {
        return new bqqk(bqqt.class);
    }

    /* renamed from: d */
    public final int mo69303d() {
        return 3;
    }

    /* renamed from: a */
    public static void m113247a(bqqu bqqu) {
        int i = bqqu.f141388a;
        if (i < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (i > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69297a(ByteString bxtx) {
        bxus b = bxus.m123743b();
        bqqs bqqs = bqqs.f141377d;
        try {
            bxuc h = bxtx.mo73764h();
            GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) bqqs.mo74142c(4);
            bxxv a = bxxm.f165037a.mo74228a(GeneratedMessageLite);
            a.mo74220a(GeneratedMessageLite, bxud.m123454a(h), b);
            a.mo74225d(GeneratedMessageLite);
            h.mo73787a(0);
            GeneratedMessageLite.m124027b(GeneratedMessageLite);
            return (bqqs) GeneratedMessageLite;
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
        bqqs bqqs = (bqqs) bxxc;
        bqwl.m113528c(bqqs.f141379a);
        m113246a(bqqs.f141380b.mo73744a());
        bqqu bqqu = bqqs.f141381c;
        if (bqqu == null) {
            bqqu = bqqu.f141386b;
        }
        m113247a(bqqu);
    }
}
