package com.google.android.gms.ads.identifier.settings;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* renamed from: com.google.android.gms.ads.identifier.settings.h */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0290h implements bqnu {

    /* renamed from: a */
    private final byte[] f8029a;

    /* renamed from: b */
    private final bqsf f8030b;

    public C0290h(byte[] bArr, bqsf bqsf) {
        this.f8029a = bArr;
        this.f8030b = bqsf;
    }

    /* renamed from: a */
    public final bqsj mo6519a() {
        try {
            byte[] bArr = this.f8029a;
            bqsf bqsf = this.f8030b;
            ECPoint b = bqvm.m113487b(2, bArr);
            bqnt a = bqnt.m113060a();
            a.mo69310b(bqsf);
            bqsh bqsh = (bqsh) bqsj.f141531c.mo74141a(a.mo69309b().mo69304a().f141318a);
            int i = 0;
            while (i < ((bqsj) bqsh.f164949b).f141534b.size()) {
                bqsi bqsi = (bqsi) ((bqsj) bqsh.f164949b).f141534b.get(i);
                bxvd a2 = bqsi.f141525e.mo74141a(bqsi);
                bqsd bqsd = bqsi.f141527a;
                if (bqsd == null) {
                    bqsd = bqsd.f141509d;
                }
                bxvd a3 = bqsd.f141509d.mo74141a(bqsd);
                bqsd bqsd2 = bqsi.f141527a;
                if (bqsd2 == null) {
                    bqsd2 = bqsd.f141509d;
                }
                bxtx bxtx = bqsd2.f141512b;
                bxus c = bxus.m123744c();
                bqrl bqrl = bqrl.f141448e;
                try {
                    bxuc h = bxtx.mo73764h();
                    bxvk bxvk = (bxvk) bqrl.mo74142c(4);
                    bxxv a4 = bxxm.f165037a.mo74228a(bxvk);
                    a4.mo74220a(bxvk, bxud.m123454a(h), c);
                    a4.mo74225d(bxvk);
                    h.mo73787a(0);
                    bxvk.m124027b(bxvk);
                    bxvd a5 = bqrl.f141448e.mo74141a((bqrl) bxvk);
                    bxtx a6 = bxtx.m123261a(b.getAffineX().toByteArray());
                    if (a5.f164950c) {
                        a5.mo74035c();
                        a5.f164950c = false;
                    }
                    a6.getClass();
                    ((bqrl) a5.f164949b).f141452c = a6;
                    bxtx a7 = bxtx.m123261a(b.getAffineY().toByteArray());
                    if (a5.f164950c) {
                        a5.mo74035c();
                        a5.f164950c = false;
                    }
                    a7.getClass();
                    ((bqrl) a5.f164949b).f141453d = a7;
                    bxtx aL = ((bqrl) a5.mo74062i()).mo73639aL();
                    if (a3.f164950c) {
                        a3.mo74035c();
                        a3.f164950c = false;
                    }
                    aL.getClass();
                    ((bqsd) a3.f164949b).f141512b = aL;
                    if (a2.f164950c) {
                        a2.mo74035c();
                        a2.f164950c = false;
                    }
                    bqsd bqsd3 = (bqsd) a3.mo74062i();
                    bqsd3.getClass();
                    ((bqsi) a2.f164949b).f141527a = bqsd3;
                    bqsi bqsi2 = (bqsi) a2.mo74062i();
                    if (bqsh.f164950c) {
                        bqsh.mo74035c();
                        bqsh.f164950c = false;
                    }
                    bqsj bqsj = (bqsj) bqsh.f164949b;
                    bqsi2.getClass();
                    bqsj.mo69328a();
                    bqsj.f141534b.set(i, bqsi2);
                    i++;
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
            return (bqsj) bqsh.mo74062i();
        } catch (GeneralSecurityException e5) {
            throw new IOException(e5);
        }
    }
}
