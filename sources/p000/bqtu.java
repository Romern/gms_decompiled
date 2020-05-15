package p000;

import java.io.IOException;
import java.math.BigInteger;

/* renamed from: bqtu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqtu extends bqnr {
    public bqtu() {
        super(bqsv.class, new bqtt(bqoe.class));
    }

    /* renamed from: a */
    public final String mo69299a() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey";
    }

    /* renamed from: d */
    public final int mo69303d() {
        return 5;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69297a(ByteString bxtx) {
        bxus b = bxus.m123743b();
        bqsv bqsv = bqsv.f141581e;
        try {
            bxuc h = bxtx.mo73764h();
            GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) bqsv.mo74142c(4);
            bxxv a = bxxm.f165037a.mo74228a(GeneratedMessageLite);
            a.mo74220a(GeneratedMessageLite, bxud.m123454a(h), b);
            a.mo74225d(GeneratedMessageLite);
            h.mo73787a(0);
            GeneratedMessageLite.m124027b(GeneratedMessageLite);
            return (bqsv) GeneratedMessageLite;
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
        bqsv bqsv = (bqsv) bxxc;
        bqwl.m113528c(bqsv.f141583a);
        bqwl.m113527b(new BigInteger(1, bqsv.f141585c.getKey()).bitLength());
        bqst bqst = bqsv.f141584b;
        if (bqst == null) {
            bqst = bqst.f141568b;
        }
        bqua.m113408a(bqst);
    }
}
