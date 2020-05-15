package p000;

import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;

/* renamed from: bqtr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqtr extends bqnp {
    public bqtr(Class cls) {
        super(cls);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo69295b(bxxc bxxc) {
        bqss bqss = (bqss) bxxc;
        bqst bqst = bqss.f141565a;
        if (bqst == null) {
            bqst = bqst.f141568b;
        }
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) bqvo.f141694f.mo69341a("RSA");
        keyPairGenerator.initialize(new RSAKeyGenParameterSpec(bqss.f141566b, new BigInteger(1, bqss.f141567c.mo73780k())));
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) generateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) generateKeyPair.getPrivate();
        bxvd da = bqsv.f141581e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bqsv bqsv = (bqsv) da.f164949b;
        bqsv.f141583a = 0;
        bqst.getClass();
        bqsv.f141584b = bqst;
        bxtx a = bxtx.m123261a(rSAPublicKey.getPublicExponent().toByteArray());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((bqsv) da.f164949b).f141586d = a;
        bxtx a2 = bxtx.m123261a(rSAPublicKey.getModulus().toByteArray());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a2.getClass();
        ((bqsv) da.f164949b).f141585c = a2;
        bqsv bqsv2 = (bqsv) da.mo74062i();
        bxvd da2 = bqsu.f141571i.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bqsu bqsu = (bqsu) da2.f164949b;
        bqsu.f141573a = 0;
        bqsv2.getClass();
        bqsu.f141574b = bqsv2;
        bxtx a3 = bxtx.m123261a(rSAPrivateCrtKey.getPrivateExponent().toByteArray());
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        a3.getClass();
        ((bqsu) da2.f164949b).f141575c = a3;
        bxtx a4 = bxtx.m123261a(rSAPrivateCrtKey.getPrimeP().toByteArray());
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        a4.getClass();
        ((bqsu) da2.f164949b).f141576d = a4;
        bxtx a5 = bxtx.m123261a(rSAPrivateCrtKey.getPrimeQ().toByteArray());
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        a5.getClass();
        ((bqsu) da2.f164949b).f141577e = a5;
        bxtx a6 = bxtx.m123261a(rSAPrivateCrtKey.getPrimeExponentP().toByteArray());
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        a6.getClass();
        ((bqsu) da2.f164949b).f141578f = a6;
        bxtx a7 = bxtx.m123261a(rSAPrivateCrtKey.getPrimeExponentQ().toByteArray());
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        a7.getClass();
        ((bqsu) da2.f164949b).f141579g = a7;
        bxtx a8 = bxtx.m123261a(rSAPrivateCrtKey.getCrtCoefficient().toByteArray());
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        a8.getClass();
        ((bqsu) da2.f164949b).f141580h = a8;
        return (bqsu) da2.mo74062i();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69293a(bxtx bxtx) {
        bxus b = bxus.m123743b();
        bqss bqss = bqss.f141563d;
        try {
            bxuc h = bxtx.mo73764h();
            bxvk bxvk = (bxvk) bqss.mo74142c(4);
            bxxv a = bxxm.f165037a.mo74228a(bxvk);
            a.mo74220a(bxvk, bxud.m123454a(h), b);
            a.mo74225d(bxvk);
            h.mo73787a(0);
            bxvk.m124027b(bxvk);
            return (bqss) bxvk;
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
    public final /* bridge */ /* synthetic */ void mo69294a(bxxc bxxc) {
        bqss bqss = (bqss) bxxc;
        bqst bqst = bqss.f141565a;
        if (bqst == null) {
            bqst = bqst.f141568b;
        }
        bqua.m113408a(bqst);
        bqwl.m113527b(bqss.f141566b);
    }
}
