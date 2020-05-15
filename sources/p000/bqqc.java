package p000;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: bqqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqqc implements bqux {

    /* renamed from: a */
    public final String f141353a;

    /* renamed from: b */
    public final int f141354b;

    /* renamed from: c */
    public bqrd f141355c;

    /* renamed from: d */
    public bqqv f141356d;

    /* renamed from: e */
    public int f141357e;

    public bqqc(bqsf bqsf) {
        String str = bqsf.f141516a;
        this.f141353a = str;
        if (str.equals(bqom.f141342b)) {
            try {
                bxtx bxtx = bqsf.f141517b;
                bxus b = bxus.m123743b();
                bqre bqre = bqre.f141426b;
                try {
                    bxuc h = bxtx.mo73764h();
                    bxvk bxvk = (bxvk) bqre.mo74142c(4);
                    bxxv a = bxxm.f165037a.mo74228a(bxvk);
                    a.mo74220a(bxvk, bxud.m123454a(h), b);
                    a.mo74225d(bxvk);
                    h.mo73787a(0);
                    bxvk.m124027b(bxvk);
                    this.f141355c = (bqrd) bqok.m113116b(bqsf);
                    this.f141354b = ((bqre) bxvk).f141428a;
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
            } catch (bxwf e5) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e5);
            }
        } else if (!this.f141353a.equals(bqom.f141341a)) {
            String valueOf = String.valueOf(this.f141353a);
            throw new GeneralSecurityException(valueOf.length() == 0 ? new String("unsupported AEAD DEM key type: ") : "unsupported AEAD DEM key type: ".concat(valueOf));
        } else {
            try {
                bxtx bxtx2 = bqsf.f141517b;
                bxus b2 = bxus.m123743b();
                bqqw bqqw = bqqw.f141394c;
                try {
                    bxuc h2 = bxtx2.mo73764h();
                    bxvk bxvk2 = (bxvk) bqqw.mo74142c(4);
                    bxxv a2 = bxxm.f165037a.mo74228a(bxvk2);
                    a2.mo74220a(bxvk2, bxud.m123454a(h2), b2);
                    a2.mo74225d(bxvk2);
                    h2.mo73787a(0);
                    bxvk.m124027b(bxvk2);
                    bqqw bqqw2 = (bqqw) bxvk2;
                    this.f141356d = (bqqv) bqok.m113116b(bqsf);
                    bqqy bqqy = bqqw2.f141396a;
                    if (bqqy == null) {
                        bqqy = bqqy.f141403c;
                    }
                    this.f141357e = bqqy.f141406b;
                    bqsa bqsa = bqqw2.f141397b;
                    if (bqsa == null) {
                        bqsa = bqsa.f141501c;
                    }
                    this.f141354b = this.f141357e + bqsa.f141504b;
                } catch (IOException e6) {
                    if (!(e6.getCause() instanceof bxwf)) {
                        throw new bxwf(e6.getMessage());
                    }
                    throw ((bxwf) e6.getCause());
                } catch (RuntimeException e7) {
                    if (e7.getCause() instanceof bxwf) {
                        throw ((bxwf) e7.getCause());
                    }
                    throw e7;
                } catch (bxwf e8) {
                    throw e8;
                } catch (bxwf e9) {
                    throw e9;
                }
            } catch (bxwf e10) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e10);
            }
        }
    }
}
