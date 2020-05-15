package p000;

import com.google.android.libraries.matchstick.data.LocalEntityId;

/* renamed from: azeo */
final /* synthetic */ class azeo implements Runnable {

    /* renamed from: a */
    private final azes f99172a;

    /* renamed from: b */
    private final cbkj f99173b;

    public azeo(azes azes, cbkj cbkj) {
        this.f99172a = azes;
        this.f99173b = cbkj;
    }

    public final void run() {
        bmxv bmxv;
        String str;
        cbma cbma;
        int b;
        int b2;
        String str2;
        azes azes = this.f99172a;
        cbkj cbkj = this.f99173b;
        int b3 = cbki.m127938b(cbkj.f177410d);
        int i = 1;
        if (b3 == 0) {
            b3 = 1;
        }
        int i2 = b3 - 2;
        if (i2 == 5) {
            azet azet = azes.f99179c;
            bmxv = bmxv.m108566b(new azgt(cbkj, azet.f99187c, azet.f99196l, azet, azet.f99190f));
        } else if (i2 == 13) {
            cbij cbij = (cbij) azol.m85935a((bxxk) cbij.f177251e.mo74142c(7), cbkj.f177411e.getKey());
            if (cbij.f177253a.size() > 0) {
                if (cfdn.m138737b()) {
                    cbig cbig = ((cbil) cbij.f177253a.get(0)).f177265g;
                    if (cbig == null) {
                        cbig = cbig.f177238c;
                    }
                    if (cbig.f177240a != null) {
                        azph a = azph.m85998a(azes.f99179c.f99187c);
                        LocalEntityId localEntityId = azes.f99179c.f99207w;
                        cbip cbip = cbij.f177255c;
                        if (cbip == null) {
                            cbip = cbip.f177281c;
                        }
                        if (cbip.f177283a == null) {
                            str2 = "MS";
                        } else {
                            cbip cbip2 = cbij.f177255c;
                            if (cbip2 == null) {
                                cbip2 = cbip.f177281c;
                            }
                            cbhu cbhu = cbip2.f177283a;
                            if (cbhu == null) {
                                cbhu = cbhu.f177185d;
                            }
                            str2 = cbhu.f177189c;
                        }
                        a.mo55143a(1403, localEntityId, str2);
                        azet azet2 = azes.f99179c;
                        bmxv = bmxv.m108566b(new azgs(cbkj, azet2.f99187c, azet2));
                    }
                }
                if (((cbil) cbij.f177253a.get(0)).f177259a == 3) {
                    azet azet3 = azes.f99179c;
                    bmxv = bmxv.m108566b(new azgy(cbkj, azet3.f99187c, azet3, azet3.f99191g));
                } else if (((cbil) cbij.f177253a.get(0)).f177259a == 4) {
                    bmxv = bmvz.f131120a;
                } else if (cfeo.f183719a.mo6606a().mo80937X() && (b2 = cbik.m127888b(((cbil) cbij.f177253a.get(0)).f177261c)) != 0 && b2 == 16) {
                    azet azet4 = azes.f99179c;
                    bmxv = bmxv.m108566b(new azgz(cbkj, azet4.f99187c, azet4.f99193i));
                }
            }
            azet azet5 = azes.f99179c;
            bmxv = bmxv.m108566b(new azgv(cbkj, azet5.f99187c, azet5, azet5.f99188d, azet5.f99190f, azet5.f99196l, azet5.f99197m, azet5.f99191g));
        } else if (i2 == 24) {
            azqf.m86130a(azes.f99179c.f99187c);
            if (azqf.m86149c()) {
                azet azet6 = azes.f99179c;
                bmxv = bmxv.m108566b(new azfd(azet6.f99187c, cbkj, azet6));
            } else {
                bmxv = bmvz.f131120a;
            }
        } else if (i2 == 7) {
            azet azet7 = azes.f99179c;
            bmxv = bmxv.m108566b(new azha(cbkj, azet7.f99187c, azet7));
        } else if (i2 != 8) {
            bmxv = bmvz.f131120a;
        } else {
            azet azet8 = azes.f99179c;
            bmxv = bmxv.m108566b(new azgy(cbkj, azet8.f99187c, azet8, azet8.f99191g));
        }
        if (bmxv.mo66813a() && ((azgw) bmxv.mo66814b()).mo54861a()) {
            azgw azgw = (azgw) bmxv.mo66814b();
            if (!azes.f99177a.mo54687a() || !cfeo.f183719a.mo6606a().mo80926M() || !((cbma = cbkj.f177413g) == null || (b = cipg.m150691b(cbma.f177593a)) == 0 || b != 5)) {
                azdd b4 = azgw.mo54862b();
                if (b4 != null) {
                    azbz a2 = azcm.m85300a(azes.f99179c.f99187c).mo54641a(b4, azes.f99179c.f99191g);
                    if (a2 == null || a2.f98936a == null) {
                        azgw.mo54863c();
                    } else {
                        azgw.mo54860a(a2);
                    }
                }
            } else {
                azes.f99179c.mo54842a(cbkj.f177409c);
            }
        } else if (!cbkj.f177409c.isEmpty()) {
            int b5 = cbkh.m127936b(cbkj.f177416j);
            if (b5 != 0) {
                i = b5;
            }
            if (cbkh.m127935a(i) != 2 && cbkh.m127935a(i) != 5) {
                azph azph = azes.f99179c.f99191g;
                cbma cbma2 = cbkj.f177413g;
                if (cbma2 != null) {
                    str = cbma2.f177595c;
                } else {
                    str = null;
                }
                azph.mo55162a(str, (LocalEntityId) null, (aznz) null, cbkj.f177409c, 3, 40, 29);
                azes.f99179c.mo54842a(cbkj.f177409c);
            }
        }
    }
}
