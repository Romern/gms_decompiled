package p000;

import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;

/* renamed from: bqtw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqtw extends bqnp {
    public bqtw(Class cls) {
        super(cls);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo69295b(bxxc bxxc) {
        bqsw bqsw = (bqsw) bxxc;
        bqsx bqsx = bqsw.f141589a;
        if (bqsx == null) {
            bqsx = bqsx.f141592d;
        }
        bqwl.m113527b(bqsw.f141590b);
        int b = bqry.m113304b(bqsx.f141594a);
        if (b == 0) {
            b = 1;
        }
        bqua.m113406a(b);
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) bqvo.f141694f.mo69341a("RSA");
        keyPairGenerator.initialize(new RSAKeyGenParameterSpec(bqsw.f141590b, new BigInteger(1, bqsw.f141591c.mo73780k())));
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) generateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) generateKeyPair.getPrivate();
        bxvd da = bqsz.f141607e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bqsz bqsz = (bqsz) da.f164949b;
        bqsz.f141609a = 0;
        bqsx.getClass();
        bqsz.f141610b = bqsx;
        bxtx a = bxtx.m123261a(rSAPublicKey.getPublicExponent().toByteArray());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((bqsz) da.f164949b).f141612d = a;
        bxtx a2 = bxtx.m123261a(rSAPublicKey.getModulus().toByteArray());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a2.getClass();
        ((bqsz) da.f164949b).f141611c = a2;
        bqsz bqsz2 = (bqsz) da.mo74062i();
        bxvd da2 = bqsy.f141597i.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bqsy bqsy = (bqsy) da2.f164949b;
        bqsy.f141599a = 0;
        bqsz2.getClass();
        bqsy.f141600b = bqsz2;
        bxtx a3 = bxtx.m123261a(rSAPrivateCrtKey.getPrivateExponent().toByteArray());
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        a3.getClass();
        ((bqsy) da2.f164949b).f141601c = a3;
        bxtx a4 = bxtx.m123261a(rSAPrivateCrtKey.getPrimeP().toByteArray());
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        a4.getClass();
        ((bqsy) da2.f164949b).f141602d = a4;
        bxtx a5 = bxtx.m123261a(rSAPrivateCrtKey.getPrimeQ().toByteArray());
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        a5.getClass();
        ((bqsy) da2.f164949b).f141603e = a5;
        bxtx a6 = bxtx.m123261a(rSAPrivateCrtKey.getPrimeExponentP().toByteArray());
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        a6.getClass();
        ((bqsy) da2.f164949b).f141604f = a6;
        bxtx a7 = bxtx.m123261a(rSAPrivateCrtKey.getPrimeExponentQ().toByteArray());
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        a7.getClass();
        ((bqsy) da2.f164949b).f141605g = a7;
        bxtx a8 = bxtx.m123261a(rSAPrivateCrtKey.getCrtCoefficient().toByteArray());
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        a8.getClass();
        ((bqsy) da2.f164949b).f141606h = a8;
        return (bqsy) da2.mo74062i();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69293a(bxtx bxtx) {
        bxus b = bxus.m123743b();
        bqsw bqsw = bqsw.f141587d;
        try {
            bxuc h = bxtx.mo73764h();
            bxvk bxvk = (bxvk) bqsw.mo74142c(4);
            bxxv a = bxxm.f165037a.mo74228a(bxvk);
            a.mo74220a(bxvk, bxud.m123454a(h), b);
            a.mo74225d(bxvk);
            h.mo73787a(0);
            bxvk.m124027b(bxvk);
            return (bqsw) bxvk;
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
        bqsw bqsw = (bqsw) bxxc;
        bqsx bqsx = bqsw.f141589a;
        if (bqsx == null) {
            bqsx = bqsx.f141592d;
        }
        bqua.m113409a(bqsx);
        bqwl.m113527b(bqsw.f141590b);
    }
}
