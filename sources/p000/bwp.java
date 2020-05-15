package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: bwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwp extends cao {
    static {
        bwp.class.getSimpleName();
    }

    protected bwp(cat cat) {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bok mo3486a(bok bok) {
        return new boq(bok.mo3333h());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bwz.a(int, int, boolean):void
     arg types: [int, int, int]
     candidates:
      bwz.a(byte[], int, int):void
      bwz.a(int, int, boolean):void */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bol mo3487a(bxm bxm, bok bok) {
        byd byd;
        bxz bxz;
        byte[] bArr;
        bua bua = (bua) bxm;
        boq boq = (boq) bok;
        int i = cbd.f6383a;
        if (boq.mo3344m()) {
            throw new bon("CDA Requested - CDA not supported by cMDA", bop.f5266f);
        } else if (!bua.f5991m) {
            throw new bon("Invalid state - GPO must be performed", bop.f5263c);
        } else if (bua.mo3598f()) {
            throw new bon("Invalid state - GEN AC already performed", bop.f5263c);
        } else if (boq.mo3326b() != Byte.MIN_VALUE) {
            throw new bon("incorrect CLA", bop.f5262b);
        } else if ((boq.mo3328d() & 192) == 192) {
            throw new bon("incorrect P1", bop.f5267g);
        } else if (boq.mo3329e() != 0) {
            throw new bon("incorrect P2", bop.f5267g);
        } else if (!boq.mo3332g()) {
            throw new bon("Le absent", bop.f5273m);
        } else if (boq.mo3336j() == 256) {
            boq.mo3331f();
            byd byd2 = byd.AAC;
            buq buq = (buq) bua.f5988j;
            bvd bvd = (bvd) ((bty) ((btz) bua.f5984f).mo3578d()).mo3576c(bvd.f5782a);
            bxp v = buq.mo3607v();
            buj b = ((buq) bua.f5988j).mo3523b();
            ((bty) ((btz) bua.f5984f).mo3578d()).mo3494f();
            new bya();
            bvd.mo3535b();
            bui c = ((buq) bua.f5988j).mo3524c();
            bua.f5994p.mo3594p();
            bwm r = bua.f5994p.mo3596r();
            bua.f5994p.mo3595q();
            bvd.mo3534a();
            bur g = ((buq) bua.f5988j).mo3525g();
            bxy bxy = new bxy(((bvo) ((bty) ((btz) bua.f5984f).mo3578d()).mo3576c(bvo.f5804a)).mo3582a(bxy.f6067a));
            bxy.mo3547aP();
            new Object[1][0] = bxy.mo3565k();
            byte[] l = boq.mo3343l();
            Object[] objArr = {cbm.m3893a(l), Integer.valueOf(l.length)};
            bpl c2 = bxy.mo3614c(l);
            bxj bxj = bua.f5994p;
            if (!Arrays.equals(bxj.mo3481f().mo3563i(), c2.mo3366a(bpk.m3440c(bzy.f6303a)).mo3355b())) {
                new Object[1][0] = bxj.mo3481f().mo3563i();
                new Object[1][0] = c2.mo3366a(bpk.m3440c(bzy.f6303a)).mo3355b();
                throw new bon("Invalid dol data - amount authorized does not match pdol", bop.f5263c);
            } else if (Arrays.equals(bxj.mo3483x().mo3563i(), c2.mo3366a(bpk.m3440c(cag.f6343c)).mo3355b())) {
                new Object[1][0] = c2.toString();
                bxj.mo3584a(c2);
                if (!caw.m3863a(boq).equals(byd.AAC)) {
                    buj b2 = ((buq) bua.f5988j).mo3523b();
                    buf c3 = bvd.mo3536c();
                    bug d = bvd.mo3537d();
                    new Object[1][0] = b2.mo3563i();
                    new Object[1][0] = c3.mo3563i();
                    new Object[1][0] = d.mo3563i();
                    byd = (!b2.mo3511a() || !d.mo3504a(b2)) ? !c3.mo3503a(b2) ? byd.ARQC : byd.AAC : byd.AAC;
                } else {
                    byd = byd.AAC;
                }
                if (byd == byd.AAC) {
                    bxz = new bxz((byte) 0);
                    c.mo3509e();
                    c.mo3510f();
                    g.mo3529c();
                } else {
                    bxz = new bxz(Byte.MIN_VALUE);
                    c.mo3508d();
                    c.mo3510f();
                    if (!r.mo3555a(0, 0) && b.mo3555a(3, 6)) {
                        c.mo3555a(0, 2);
                    }
                }
                buq.mo3585a(bxz);
                buq.mo3585a(c);
                buq.mo3585a(g);
                bum d2 = bua.mo3499d();
                buq.mo3585a(d2);
                buq buq2 = (buq) bua.f5988j;
                btx btx = (btx) bua.mo3600h();
                byte[] bArr2 = btx != null ? btx.f5592b : null;
                bya c4 = ((bxs) bua.f5988j.mo3464e()).mo3455c();
                if (c4.mo3563i()[0] == -127) {
                    new Object[1][0] = (byte) -127;
                    try {
                        bxj bxj2 = bua.f5994p;
                        caq.m3856a(bxj2, (byte) -127, caj.f6358a, bzy.f6303a, bzz.f6308a, cad.f6325a, caf.f6337a, cag.f6343c, cah.f6348a, cai.f6353a);
                        bxo bxo = bua.f5988j;
                        caq.m3856a(bxo, (byte) -127, bxp.f6000a, bxs.f6023b, bud.f5602a);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bxj2.mo3481f().mo3552a(byteArrayOutputStream);
                        bxj2.mo3482w().mo3552a(byteArrayOutputStream);
                        bxj2.mo3589k().mo3552a(byteArrayOutputStream);
                        bxj2.mo3590l().mo3552a(byteArrayOutputStream);
                        bxj2.mo3483x().mo3552a(byteArrayOutputStream);
                        bxj2.mo3591m().mo3552a(byteArrayOutputStream);
                        bxj2.mo3592n().mo3552a(byteArrayOutputStream);
                        bxj2.mo3588j().mo3552a(byteArrayOutputStream);
                        bxo.mo3463d().mo3552a(byteArrayOutputStream);
                        bxo.mo3607v().mo3552a(byteArrayOutputStream);
                        new Object[1][0] = bxo;
                        byteArrayOutputStream.write(bxo.mo3464e().mo3563i());
                        byteArrayOutputStream.write(128);
                        while (byteArrayOutputStream.size() % 8 != 0) {
                            byteArrayOutputStream.write(0);
                        }
                        bArr = byteArrayOutputStream.toByteArray();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    bArr = caq.m3857a(bua, c4);
                }
                cat cat = bua.f5983e;
                byte[] a = cbe.m3886a(bArr, bArr2);
                Object[] objArr2 = {a, bArr};
                buq2.mo3585a(new bxt(a, false));
                bol bol = new bol(new byq(bxz, v, buq.mo3605t(), d2).mo3564j().mo3358e(), bop.f5269i);
                g.mo3527a(false);
                g.mo3551a(1, 0, true);
                buq.mo3585a(g);
                cbf.m3887a(bua);
                Object[] objArr3 = {g.toString(), c.toString(), b.toString()};
                return bol;
            } else {
                throw new bon("Invalid dol data - transaction currency does not match pdol", bop.f5263c);
            }
        } else {
            throw new bon("Le required and is non-zero", bop.f5273m);
        }
    }
}
