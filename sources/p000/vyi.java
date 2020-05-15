package p000;

import java.io.IOException;

/* renamed from: vyi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vyi {

    /* renamed from: a */
    public final vyy f50230a;

    /* renamed from: b */
    public final vyj f50231b;

    /* renamed from: c */
    public final byte[] f50232c;

    /* renamed from: d */
    public final boolean f50233d;

    /* renamed from: e */
    public final vzc f50234e;

    public vyi(vyn vyn, vvu vvu) {
        byte[] bArr;
        bxtx bxtx = vvu.f50071a;
        bxtx bxtx2 = vvu.f50072b;
        try {
            bxus b = bxus.m123743b();
            vvw vvw = vvw.f50079j;
            try {
                bxuc h = bxtx.mo73764h();
                bxvk bxvk = (bxvk) vvw.mo74142c(4);
                bxxv a = bxxm.f165037a.mo74228a(bxvk);
                a.mo74220a(bxvk, bxud.m123454a(h), b);
                a.mo74225d(bxvk);
                h.mo73787a(0);
                bxvk.m124027b(bxvk);
                vvw vvw2 = (vvw) bxvk;
                if (vyn.mo28964a(bxtx.mo73780k(), bxtx2.mo73780k())) {
                    int i = vvw2.f50081a;
                    if ((i & 1) == 0) {
                        throw new vyt("byteCode", vvw2.f50089i.mo73780k());
                    } else if ((i & 2) == 0) {
                        throw new vyt("vmUrl", vvw2.f50089i.mo73780k());
                    } else if ((i & 4) == 0) {
                        throw new vyt("vmChecksum", vvw2.f50089i.mo73780k());
                    } else if ((i & 16) != 0) {
                        vyy vyy = new vyy(srv.m36164d(vvw2.f50083c.mo73780k()));
                        this.f50230a = vyy;
                        this.f50231b = new vyj(vvw2.f50082b.mo73780k(), vyy, (long) vvw2.f50085e, vvw2.f50089i.mo73780k());
                        vzc vzc = null;
                        if ((vvw2.f50081a & 8) != 0) {
                            bArr = vvw2.f50084d.mo73780k();
                        } else {
                            bArr = null;
                        }
                        this.f50232c = bArr;
                        int i2 = vvw2.f50081a;
                        if (!((i2 & 64) == 0 && (i2 & 128) == 0)) {
                            long currentTimeMillis = System.currentTimeMillis();
                            vzc = new vzc((((long) vvw2.f50087g) * 1000) + currentTimeMillis, currentTimeMillis + (((long) vvw2.f50088h) * 1000));
                        }
                        this.f50234e = vzc;
                        this.f50233d = vvw2.f50086f;
                    } else {
                        throw new vyt("expiryTimeSecs", vvw2.f50089i.mo73780k());
                    }
                } else {
                    throw new vyt("Creation response signature verification failed.", vvw2.f50089i.mo73780k());
                }
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
            throw new vyt("Couldn't parse response signature", e5);
        }
    }
}
