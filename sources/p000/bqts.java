package p000;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.Charset;

/* renamed from: bqts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqts extends bqoc {

    /* renamed from: c */
    public static final byte[] f141620c = "Tink and Wycheproof.".getBytes(Charset.forName("UTF-8"));

    public bqts() {
        super(bqsu.class, new bqtq(bqod.class));
    }

    /* renamed from: a */
    public final String mo69299a() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey";
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bxxc mo69315b(bxxc bxxc) {
        bqsv bqsv = ((bqsu) bxxc).f141574b;
        return bqsv == null ? bqsv.f141581e : bqsv;
    }

    /* renamed from: c */
    public final bqnp mo69302c() {
        return new bqtr(bqss.class);
    }

    /* renamed from: d */
    public final int mo69303d() {
        return 4;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69297a(bxtx bxtx) {
        bxus b = bxus.m123743b();
        bqsu bqsu = bqsu.f141571i;
        try {
            bxuc h = bxtx.mo73764h();
            bxvk bxvk = (bxvk) bqsu.mo74142c(4);
            bxxv a = bxxm.f165037a.mo74228a(bxvk);
            a.mo74220a(bxvk, bxud.m123454a(h), b);
            a.mo74225d(bxvk);
            h.mo73787a(0);
            bxvk.m124027b(bxvk);
            return (bqsu) bxvk;
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
        bqsu bqsu = (bqsu) bxxc;
        bqwl.m113528c(bqsu.f141573a);
        bqsv bqsv = bqsu.f141574b;
        if (bqsv == null) {
            bqsv = bqsv.f141581e;
        }
        bqwl.m113527b(new BigInteger(1, bqsv.f141585c.mo73780k()).bitLength());
        bqsv bqsv2 = bqsu.f141574b;
        if (bqsv2 == null) {
            bqsv2 = bqsv.f141581e;
        }
        bqst bqst = bqsv2.f141584b;
        if (bqst == null) {
            bqst = bqst.f141568b;
        }
        bqua.m113408a(bqst);
    }
}
