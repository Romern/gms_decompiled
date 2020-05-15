package p000;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.Charset;

/* renamed from: bqtx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqtx extends bqoc {

    /* renamed from: c */
    public static final byte[] f141621c = "Tink and Wycheproof.".getBytes(Charset.forName("UTF-8"));

    public bqtx() {
        super(bqsy.class, new bqtv(bqod.class));
    }

    /* renamed from: a */
    public final String mo69299a() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey";
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bxxc mo69315b(bxxc bxxc) {
        bqsz bqsz = ((bqsy) bxxc).f141600b;
        return bqsz == null ? bqsz.f141607e : bqsz;
    }

    /* renamed from: c */
    public final bqnp mo69302c() {
        return new bqtw(bqsw.class);
    }

    /* renamed from: d */
    public final int mo69303d() {
        return 4;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69297a(ByteString bxtx) {
        bxus b = bxus.m123743b();
        bqsy bqsy = bqsy.f141597i;
        try {
            bxuc h = bxtx.mo73764h();
            GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) bqsy.mo74142c(4);
            bxxv a = bxxm.f165037a.mo74228a(GeneratedMessageLite);
            a.mo74220a(GeneratedMessageLite, bxud.m123454a(h), b);
            a.mo74225d(GeneratedMessageLite);
            h.mo73787a(0);
            GeneratedMessageLite.m124027b(GeneratedMessageLite);
            return (bqsy) GeneratedMessageLite;
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
        bqsy bqsy = (bqsy) bxxc;
        bqwl.m113528c(bqsy.f141599a);
        bqsz bqsz = bqsy.f141600b;
        if (bqsz == null) {
            bqsz = bqsz.f141607e;
        }
        bqwl.m113527b(new BigInteger(1, bqsz.f141611c.getKey()).bitLength());
        bqsz bqsz2 = bqsy.f141600b;
        if (bqsz2 == null) {
            bqsz2 = bqsz.f141607e;
        }
        bqsx bqsx = bqsz2.f141610b;
        if (bqsx == null) {
            bqsx = bqsx.f141592d;
        }
        bqua.m113409a(bqsx);
    }
}
