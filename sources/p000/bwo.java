package p000;

import java.util.List;

/* renamed from: bwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwo extends cao {
    public bwo(cat cat) {
        bwo.class.getSimpleName();
    }

    public final String toString() {
        return getClass().getName();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bok mo3486a(bok bok) {
        return new bor(bok.mo3333h());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bwz.a(int, int, boolean):void
     arg types: [int, int, int]
     candidates:
      bwz.a(byte[], int, int):void
      bwz.a(int, int, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0591  */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bol mo3487a(bxm bxm, bok bok) {
        bud bud;
        bud bud2;
        long j;
        long j2;
        bwz bwz;
        long j3;
        int i;
        bua bua = (bua) bxm;
        bor bor = (bor) bok;
        new Object[1][0] = bor.mo3325a();
        int i2 = cbd.f6383a;
        if (!bua.f5990l || bua.f5991m || bua.mo3598f()) {
            throw new bon("Invalid state - SELECT must be performed", bop.f5263c);
        } else if (bor.mo3328d() != 0 || bor.mo3329e() != 0) {
            throw new bon("incorrect P1/P2", bop.f5267g);
        } else if (!bor.mo3332g()) {
            throw new bon("Le absent", bop.f5273m);
        } else if (bor.mo3336j() == 256) {
            cad cad = new cad(cbm.m3896a("0000"));
            bzz bzz = new bzz(cbm.m3896a("000000000000"));
            caf caf = new caf(cbm.m3896a("0000000000"));
            cai cai = new cai(cbm.m3896a("00"));
            cah cah = new cah(cbm.m3896a("000000"));
            bua.f5994p.mo3585a(cad);
            bua.f5994p.mo3585a(bzz);
            bua.f5994p.mo3585a(caf);
            bua.f5994p.mo3585a(cai);
            bua.f5994p.mo3585a(cah);
            new Object[1][0] = bor;
            bym bym = new bym(((bvr) ((bty) ((btz) bua.f5984f).mo3578d()).mo3576c(bvr.f5810a)).mo3582a(bym.f6177a));
            bym.mo3547aP();
            new Object[1][0] = bym;
            byte[] l = bor.mo3343l();
            new Object[1][0] = l;
            if (l.length == bym.mo3454b()) {
                bpl c = bym.mo3614c(l);
                bpc b = c.mo3369b(bpk.m3440c(bzy.f6303a));
                if (b != null) {
                    new Object[1][0] = b.mo3355b();
                    try {
                        Long.parseLong(cbm.m3895a(b.mo3355b(), false));
                    } catch (NumberFormatException e) {
                        throw new bon(bop.f5272l);
                    }
                }
                bua.f5994p.mo3584a(c);
                bxj bxj = bua.f5994p;
                buj b2 = ((buq) bua.f5988j).mo3523b();
                bwl p = bxj.mo3594p();
                if (!p.mo3555a(0, 4)) {
                    b2.mo3515f();
                }
                if (!p.mo3555a(0, 3)) {
                    b2.mo3515f();
                }
                cae o = bxj.mo3593o();
                if (o != null) {
                    new Object[1][0] = o.toString();
                    if (o.mo3454b()) {
                        b2.mo3551a(0, 7, true);
                    }
                }
                ((buq) bua.f5988j).mo3585a(b2);
                bty bty = (bty) ((btz) bua.f5984f).mo3578d();
                bvd bvd = (bvd) bty.mo3576c(bvd.f5782a);
                bvs bvs = (bvs) bty.mo3576c(bvs.f5812a);
                buj b3 = ((buq) bua.f5988j).mo3523b();
                bui c2 = ((buq) bua.f5988j).mo3524c();
                bur g = ((buq) bua.f5988j).mo3525g();
                bud g2 = bty.mo3495g();
                bun bun = bvs.mo3615a(bpk.m3440c(bun.f5669a)) ? new bun(bvs.mo3582a(bun.f5669a)) : null;
                bwl p2 = bua.f5994p.mo3594p();
                bvd.mo3542i();
                bzy f = bua.f5994p.mo3481f();
                new Object[1][0] = bvd.mo3616j();
                if (f == null) {
                    bud2 = g2;
                } else if (f.mo3454b()) {
                    bud2 = g2;
                } else {
                    new Object[1][0] = f.toString();
                    b3.mo3517h();
                    b3.mo3515f();
                    bue a = bvs.mo3544a();
                    cag x = bxj.mo3483x();
                    byk b4 = bvs.mo3545b();
                    cad k = bxj.mo3589k();
                    new Object[1][0] = a.toString();
                    new Object[1][0] = x.toString();
                    new Object[1][0] = b4.toString();
                    new Object[1][0] = k.toString();
                    if (a == null) {
                        throw new bon("Application Currency cannot be null.", bop.f5263c);
                    } else if (x == null) {
                        throw new bon("Transaction Currency cannot be null.", bop.f5263c);
                    } else if (b4 == null) {
                        throw new bon("Issuer country cannot be null.", bop.f5263c);
                    } else if (k != null) {
                        String cbj = new cbj(a.mo3563i()).toString();
                        String cbj2 = new cbj(x.mo3563i()).toString();
                        String cbj3 = new cbj(b4.mo3563i()).toString();
                        String cbj4 = new cbj(k.mo3563i()).toString();
                        if (!cbj.equals(cbj2)) {
                            b3.mo3512c();
                            if (!cbj3.equals(cbj4)) {
                                b3.mo3454b();
                            } else {
                                b3.mo3514e();
                            }
                        } else if (!cbj3.equals(cbj4)) {
                            b3.mo3513d();
                        }
                        new Object[1][0] = b3.toString();
                        if (!b3.mo3555a(0, 2)) {
                            byte b5 = bua.f5994p.mo3595q().mo3563i()[0];
                            if (b5 == 1) {
                                bwz = bvd.mo3538e();
                            } else if (b5 == 2) {
                                byte[] a2 = bvd.mo3582a(but.f5706a);
                                if (a2 == null) {
                                    a2 = bvd.mo3582a(bus.f5697a);
                                }
                                bwz = new but(a2);
                            } else if (b5 == 3) {
                                byte[] a3 = bvd.mo3582a(buu.f5715a);
                                if (a3 == null) {
                                    a3 = bvd.mo3582a(bus.f5697a);
                                }
                                bwz = new buu(a3);
                            } else if (b5 == 4) {
                                byte[] a4 = bvd.mo3582a(buv.f5724a);
                                if (a4 == null) {
                                    a4 = bvd.mo3582a(bus.f5697a);
                                }
                                bwz = new buv(a4);
                            } else if (b5 != 5) {
                                bwz = bvd.mo3538e();
                            } else {
                                byte[] a5 = bvd.mo3582a(buw.f5733a);
                                if (a5 == null) {
                                    a5 = bvd.mo3582a(bus.f5697a);
                                }
                                bwz = new buw(a5);
                            }
                            long parseLong = Long.parseLong(cbm.m3893a(f.mo3563i()));
                            long parseLong2 = Long.parseLong(cbm.m3893a(bwz.mo3560e(0)));
                            long parseLong3 = Long.parseLong(cbm.m3893a(bwz.mo3560e(6)));
                            new Object[1][0] = Long.valueOf(bua.mo3498c().mo3532a());
                            new Object[1][0] = Long.valueOf(parseLong3);
                            new Object[1][0] = Long.valueOf(parseLong);
                            new Object[1][0] = Long.valueOf(parseLong2);
                            bur g3 = ((buq) bua.f5988j).mo3525g();
                            if (parseLong > parseLong2) {
                                b3.mo3551a(3, 0, true);
                            } else if (parseLong > parseLong3) {
                                if (!g3.mo3454b()) {
                                    b3.mo3551a(3, 1, true);
                                    c2.mo3454b();
                                }
                            }
                            if (!bua.f5994p.mo3596r().mo3454b()) {
                                if (((buq) bua.f5988j).mo3525g().mo3454b()) {
                                    bud = g2;
                                } else if (bvd.mo3539f()) {
                                    b3.mo3516g();
                                    c2.mo3454b();
                                    bud = g2;
                                } else {
                                    buz c3 = bua.mo3498c();
                                    long a6 = c3.mo3532a() + Long.parseLong(cbm.m3893a(f.mo3563i()));
                                    if (a6 >= 0) {
                                        int i3 = 0;
                                        for (long j4 = a6; j4 != 0; j4 /= 10) {
                                            i3++;
                                        }
                                        int i4 = i3 % 2;
                                        if (i4 != 0) {
                                            i = (i3 + 1) / 2;
                                        } else {
                                            i = i3 / 2;
                                        }
                                        if (i <= 6) {
                                            byte[] bArr = new byte[i];
                                            int i5 = 0;
                                            while (i5 < i3) {
                                                bud bud3 = g2;
                                                byte b6 = (byte) ((int) (a6 % 10));
                                                if (i5 == i3 - 1 && i4 != 0) {
                                                    bArr[i5 / 2] = b6;
                                                } else if (i5 % 2 != 0) {
                                                    int i6 = i5 / 2;
                                                    bArr[i6] = (byte) (bArr[i6] | ((byte) (b6 << 4)));
                                                } else {
                                                    bArr[i5 / 2] = b6;
                                                }
                                                a6 /= 10;
                                                i5++;
                                                g2 = bud3;
                                            }
                                            bud = g2;
                                            for (int i7 = 0; i7 < i / 2; i7++) {
                                                byte b7 = bArr[i7];
                                                int i8 = (i - i7) - 1;
                                                bArr[i7] = bArr[i8];
                                                bArr[i8] = b7;
                                            }
                                            byte[] bArr2 = new byte[6];
                                            for (int i9 = 0; i9 < i; i9++) {
                                                bArr2[5 - i9] = bArr[(i - 1) - i9];
                                            }
                                            c3.mo3553a(bArr2);
                                            bua.f5593a.mo3585a(c3);
                                            ((btz) bua.f5984f).f5949c.mo3406a(bua.f5593a.mo3520c());
                                        } else {
                                            throw new bqh(bqe.INTERNAL_ERROR);
                                        }
                                    } else {
                                        throw new bqh(bqe.INTERNAL_ERROR);
                                    }
                                }
                                long a7 = bua.f5593a.mo3518a().mo3532a();
                                try {
                                    j3 = Long.parseLong(cbm.m3893a(((bvd) ((bty) ((btz) bua.f5984f).mo3578d()).mo3576c(bvd.f5782a)).mo3540g().mo3563i()));
                                } catch (NumberFormatException e2) {
                                    j3 = 0;
                                }
                                if (a7 > j3) {
                                    b3.mo3516g();
                                    c2.mo3454b();
                                }
                            } else {
                                bud = g2;
                            }
                        } else {
                            bud = g2;
                            if (!bua.f5994p.mo3596r().mo3454b()) {
                                if (!g.mo3454b()) {
                                    buy b8 = bua.f5593a.mo3519b();
                                    long b9 = b8.mo3454b();
                                    new Object[1][0] = b8.mo3563i();
                                    long j5 = b9 + 1;
                                    j = 0;
                                    if (j5 >= 0) {
                                        try {
                                            String hexString = Long.toHexString(j5);
                                            if (hexString.length() % 2 == 1) {
                                                hexString = "0".concat(hexString);
                                            }
                                            byte[] a8 = cbm.m3896a(hexString);
                                            if (a8.length <= 2) {
                                                byte[] bArr3 = new byte[2];
                                                int i10 = 0;
                                                while (true) {
                                                    int length = a8.length;
                                                    if (i10 < length) {
                                                        if (i10 >= 2) {
                                                            break;
                                                        }
                                                        bArr3[1 - i10] = a8[(length - 1) - i10];
                                                        i10++;
                                                    } else {
                                                        break;
                                                    }
                                                }
                                                b8.mo3553a(bArr3);
                                                bua.f5593a.mo3585a(b8);
                                            } else {
                                                throw new bqh(bqe.ERROR_INVALID_INPUT);
                                            }
                                        } catch (bqh e3) {
                                            bqye.m113758a(e3);
                                        }
                                    } else {
                                        throw new bqh(bqe.ERROR_INVALID_INPUT);
                                    }
                                } else {
                                    j = 0;
                                }
                                buy b10 = bua.f5593a.mo3519b();
                                bux i11 = ((bvd) ((bty) ((btz) bua.f5984f).mo3578d()).mo3576c(bvd.f5782a)).mo3542i();
                                if (i11 != null) {
                                    long b11 = b10.mo3454b();
                                    try {
                                        j2 = Long.parseLong(cbm.m3893a(i11.mo3563i()));
                                    } catch (NumberFormatException e4) {
                                        j2 = j;
                                    }
                                    if (b11 > j2) {
                                        b3.mo3551a(1, 5, true);
                                        c2.mo3454b();
                                    }
                                }
                            }
                        }
                        if (g.mo3454b()) {
                            c2.mo3506a();
                        }
                        if (c2.mo3507c()) {
                            new Object[1][0] = Boolean.valueOf(p2.mo3454b());
                            if (!bud.mo3555a(0, 4) || bun == null) {
                                g.mo3530d();
                                ((buq) bua.f5988j).mo3585a(b3);
                                ((buq) bua.f5988j).mo3585a(c2);
                                ((buq) bua.f5988j).mo3585a(g);
                                throw new bon(bop.f5263c);
                            }
                            List a9 = bun.mo3521a();
                            int size = a9.size();
                            for (int i12 = 0; i12 < size; i12++) {
                                new Object[1][0] = ((bup) a9.get(i12)).mo3563i();
                            }
                            new Object[1][0] = Boolean.valueOf(bun.mo3522a(buo.ENCIPHERED_ONLINE_PIN));
                            if (!(bun.mo3522a(buo.ENCIPHERED_ONLINE_PIN) && p2.mo3454b()) && bun.mo3522a(buo.INTERAC_PASSCODE)) {
                                b3.mo3551a(2, 2, true);
                                g.mo3530d();
                            }
                        }
                        ((buq) bua.f5988j).mo3585a(b3);
                        ((buq) bua.f5988j).mo3585a(c2);
                        ((buq) bua.f5988j).mo3585a(g);
                        new Object[1][0] = bua.mo3500e().toString();
                        if (((buq) bua.f5988j).mo3524c().mo3507c() || !bua.mo3500e().mo3505a() || !((buq) bua.f5988j).mo3523b().mo3555a(2, 2) || !((buq) bua.f5988j).mo3525g().mo3555a(1, 1)) {
                            bua.mo3599g();
                            buq buq = (buq) bua.f5988j;
                            bvk bvk = (bvk) ((bty) ((btz) bua.f5984f).mo3578d()).mo3576c(bvk.f5796a);
                            bud a10 = bvk.mo3543a();
                            buc buc = new buc(bvk.mo3582a(buc.f5600a));
                            bui c4 = buq.mo3524c();
                            buq.mo3585a(a10);
                            buq.mo3585a(buc);
                            bol bol = new bol(new byq(a10, buc, c4).mo3564j().mo3358e(), bop.f5269i);
                            System.arraycopy(bor.mo3331f(), 2, new byte[(bor.mo3331f().length - 2)], 0, bor.mo3331f().length - 2);
                            bua.f5991m = true;
                            return bol;
                        }
                        buk buk = bua.f5593a;
                        Object[] objArr = {((buq) bua.f5988j).mo3524c().toString(), ((buq) bua.f5988j).mo3523b().toString(), ((buq) bua.f5988j).mo3525g().toString()};
                        if (((buq) bua.f5988j).mo3523b().mo3555a(3, 1)) {
                            throw new bqh(bqe.CDCVM_REQUIRED);
                        } else if (!((buq) bua.f5988j).mo3523b().mo3555a(1, 5)) {
                            new Object[1][0] = buk.mo3518a().toString();
                            throw new bqh(bqe.THRESHOLD_EXCEEDED_1);
                        } else {
                            new Object[1][0] = buk.mo3519b().toString();
                            throw new bqh(bqe.THRESHOLD_EXCEEDED_2);
                        }
                    } else {
                        throw new bon("Terminal country cannot be null.", bop.f5263c);
                    }
                }
                b3.mo3551a(3, 2, true);
                if (bvd.mo3535b().mo3555a(0, 3)) {
                    b3.mo3515f();
                    if (bvd.mo3539f() && !g.mo3454b()) {
                        b3.mo3516g();
                        c2.mo3454b();
                    }
                    if (g.mo3454b()) {
                    }
                    if (c2.mo3507c()) {
                    }
                    ((buq) bua.f5988j).mo3585a(b3);
                    ((buq) bua.f5988j).mo3585a(c2);
                    ((buq) bua.f5988j).mo3585a(g);
                    new Object[1][0] = bua.mo3500e().toString();
                    if (((buq) bua.f5988j).mo3524c().mo3507c()) {
                    }
                    bua.mo3599g();
                    buq buq2 = (buq) bua.f5988j;
                    bvk bvk2 = (bvk) ((bty) ((btz) bua.f5984f).mo3578d()).mo3576c(bvk.f5796a);
                    bud a102 = bvk2.mo3543a();
                    buc buc2 = new buc(bvk2.mo3582a(buc.f5600a));
                    bui c42 = buq2.mo3524c();
                    buq2.mo3585a(a102);
                    buq2.mo3585a(buc2);
                    bol bol2 = new bol(new byq(a102, buc2, c42).mo3564j().mo3358e(), bop.f5269i);
                    System.arraycopy(bor.mo3331f(), 2, new byte[(bor.mo3331f().length - 2)], 0, bor.mo3331f().length - 2);
                    bua.f5991m = true;
                    return bol2;
                }
                ((buq) bua.f5988j).mo3585a(b3);
                ((buq) bua.f5988j).mo3585a(c2);
                throw new bon("Zero dollar transaction not allowed", bop.f5263c);
            }
            throw new bon(bop.f5272l);
        } else {
            throw new bon("Le required and is non-zero", bop.f5273m);
        }
    }
}
