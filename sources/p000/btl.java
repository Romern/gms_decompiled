package p000;

/* renamed from: btl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btl extends cao {
    public btl(cat cat) {
        btl.class.getSimpleName();
    }

    /* renamed from: a */
    public static final void m3594a(byte b) {
        if (b != 0) {
            int i = cbd.f6383a;
            throw new bon("Correct Length 00", bop.f5264d);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bok mo3486a(bok bok) {
        return new bok(bok.mo3333h());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bol mo3487a(bxm bxm, bok bok) {
        bpo bpo;
        byte[] bArr;
        byte[] bArr2;
        brr brr;
        bqx bqx = (bqx) bxm;
        new Object[1][0] = bxg.EFTPOS;
        int i = cbd.f6383a;
        bqx.mo3443b();
        if (!bqx.f5990l) {
            throw new bon("Conditions Not Satisfied", bop.f5263c);
        } else if (bok.mo3335i() <= 0) {
            m3594a((byte) bok.mo3336j());
            bqu bqu = (bqu) ((bqv) bqx.f5984f).mo3578d();
            try {
                if (bok.mo3328d() != 0) {
                    bpo = bpk.m3440c(new byte[]{bok.mo3328d(), bok.mo3329e()});
                } else {
                    bpo = bpk.m3440c(new byte[]{bok.mo3329e()});
                }
                bsi bsi = (bsi) bqu.mo3576c(byy.f6232a);
                try {
                    if (bpo.equals(bpk.m3440c(bxp.f6000a))) {
                        if (bqx.f5993o == null) {
                            bqx.mo3599g();
                        }
                        bArr = ((bro) bqx.f5988j).mo3607v().mo3564j().mo3358e();
                    } else if (bpo.equals(bpk.m3440c(brl.f5464a)) && bsi.mo3583b(brl.f5464a)) {
                        bArr = bsi.mo3472d().mo3564j().mo3358e();
                    } else if (bpo.equals(bpk.m3440c(brm.f5469a)) && bsi.mo3583b(brm.f5469a)) {
                        bArr = bsi.mo3473e().mo3564j().mo3358e();
                    } else if (bpo.equals(bpk.m3440c(brf.f5427a)) && bsi.mo3583b(brf.f5427a)) {
                        bArr = new brf(bsi.mo3582a(brf.f5427a)).mo3564j().mo3358e();
                    } else if (bpo.equals(bpk.m3440c(bra.f5397a))) {
                        if (bsi.mo3583b(bqz.f5387a)) {
                            bArr2 = bsi.mo3582a(bqz.f5387a);
                        } else {
                            bArr2 = new byte[20];
                        }
                        bArr = new bra(cbb.m3882a(new byte[]{1}, new byte[]{0, 17, 34, 51, 68, 85, 102}, bArr2, new byte[]{-96, 0, 0, 3, -124, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0})).mo3564j().mo3358e();
                    } else if (bpo.equals(bpk.m3440c(bqy.f5378a)) && bsi.mo3583b(bqy.f5378a)) {
                        bArr = bsi.mo3470b().mo3564j().mo3358e();
                    } else if (bpo.equals(bpk.m3440c(brq.f5497a)) && bsi.mo3583b(brq.f5497a)) {
                        bArr = bsi.mo3471c().mo3564j().mo3358e();
                    } else {
                        if (!bpo.equals(bpk.m3440c(new byte[]{-60}))) {
                            if (!bpo.equals(bpk.m3440c(brp.f5488b)) || !bsi.mo3583b(brp.f5488b)) {
                                if (bpo.equals(bpk.m3440c(new byte[]{-54})) && bsi.mo3583b(bxs.f6023b)) {
                                    bArr = new byte[]{-54, 1, (byte) bsi.mo3469a().mo3457e()};
                                } else if ((bok.mo3328d() == -33 && bok.mo3329e() == 1) || ((bok.mo3328d() == -33 && bok.mo3329e() == 2) || ((bok.mo3328d() == -33 && bok.mo3329e() == 3) || ((bok.mo3328d() == -33 && bok.mo3329e() == 4) || ((bok.mo3328d() == -33 && bok.mo3329e() == 5) || ((bok.mo3328d() == -33 && bok.mo3329e() == 6) || ((bok.mo3328d() == -33 && bok.mo3329e() == 7) || ((bok.mo3328d() == -33 && bok.mo3329e() == 8) || ((bok.mo3328d() == -33 && bok.mo3329e() == 9) || ((bok.mo3328d() == -33 && bok.mo3329e() == 10) || ((bok.mo3328d() == -33 && bok.mo3329e() == 11) || ((bok.mo3328d() == -33 && bok.mo3329e() == 12) || ((bok.mo3328d() == -33 && bok.mo3329e() == 13) || ((bok.mo3328d() == -33 && bok.mo3329e() == 14) || (bok.mo3328d() == -33 && bok.mo3329e() == 15))))))))))))))) {
                                    byte e = bok.mo3329e();
                                    bqu bqu2 = (bqu) ((bqv) bqx.f5984f).mo3578d();
                                    bze bze = new bze((byte) 63, e);
                                    if (bqu2.mo3572a(bze)) {
                                        brr = (brr) bqu2.mo3576c(bze);
                                    } else {
                                        brr = null;
                                    }
                                    if (brr != null) {
                                        bArr = brr.mo3467a(0, 60);
                                    }
                                }
                            } else {
                                bArr = new brp(bsi.mo3582a(brp.f5488b)).mo3564j().mo3358e();
                            }
                        }
                        bArr = null;
                    }
                    if (bArr != null) {
                        return new bol(bArr, bop.f5269i);
                    }
                    throw new bon("Referenced data not found", bop.f5274n);
                } catch (bpd e2) {
                    new Object[1][0] = new byte[]{bok.mo3328d(), bok.mo3329e()};
                    throw new bon("Incorrect P1P2", bop.f5267g);
                }
            } catch (IllegalArgumentException e3) {
                throw new bon("Referenced data not found", bop.f5274n);
            }
        } else {
            throw new bon("Wrong Length", bop.f5273m);
        }
    }
}
