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
        ByteString bxtx = vvu.f50071a;
        ByteString bxtx2 = vvu.f50072b;
        try {
            bxus b = bxus.m123743b();
            vvw vvw = vvw.f50079j;
            try {
                bxuc h = bxtx.mo73764h();
                GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) vvw.mo74142c(4);
                bxxv a = bxxm.f165037a.mo74228a(GeneratedMessageLite);
                a.mo74220a(GeneratedMessageLite, bxud.m123454a(h), b);
                a.mo74225d(GeneratedMessageLite);
                h.mo73787a(0);
                GeneratedMessageLite.m124027b(GeneratedMessageLite);
                vvw vvw2 = (vvw) GeneratedMessageLite;
                if (vyn.mo28964a(bxtx.getKey(), bxtx2.getKey())) {
                    int i = vvw2.f50081a;
                    if ((i & 1) == 0) {
                        throw new vyt("byteCode", vvw2.f50089i.getKey());
                    } else if ((i & 2) == 0) {
                        throw new vyt("vmUrl", vvw2.f50089i.getKey());
                    } else if ((i & 4) == 0) {
                        throw new vyt("vmChecksum", vvw2.f50089i.getKey());
                    } else if ((i & 16) != 0) {
                        vyy vyy = new vyy(srv.m36164d(vvw2.f50083c.getKey()));
                        this.f50230a = vyy;
                        this.f50231b = new vyj(vvw2.f50082b.getKey(), vyy, (long) vvw2.f50085e, vvw2.f50089i.getKey());
                        vzc vzc = null;
                        if ((vvw2.f50081a & 8) != 0) {
                            bArr = vvw2.f50084d.getKey();
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
                        throw new vyt("expiryTimeSecs", vvw2.f50089i.getKey());
                    }
                } else {
                    throw new vyt("Creation response signature verification failed.", vvw2.f50089i.getKey());
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
