package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* renamed from: btk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btk extends cao {

    /* renamed from: a */
    public static final /* synthetic */ int f5575a = 0;

    static {
        btk.class.getSimpleName();
    }

    protected btk(cat cat) {
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private static final bol m3589a(bqx bqx, boq boq, byd byd) {
        boolean z;
        brm e;
        bqx bqx2 = bqx;
        byd byd2 = byd;
        int i = cbd.f6383a;
        bro bro = (bro) bqx2.f5988j;
        brj b = bro.mo3461b();
        byd byd3 = byd.AAC;
        int ordinal = byd.ordinal();
        if (ordinal == 0) {
            byte[] bArr = b.f5930l;
            bArr[0] = (byte) (bArr[0] & -49);
        } else if (ordinal == 1) {
            byte[] bArr2 = b.f5930l;
            byte b2 = (byte) (bArr2[0] & -49);
            bArr2[0] = b2;
            bArr2[0] = (byte) (b2 | 16);
        } else if (ordinal == 2) {
            byte[] bArr3 = b.f5930l;
            byte b3 = (byte) (bArr3[0] & -49);
            bArr3[0] = b3;
            bArr3[0] = (byte) (b3 | 32);
        } else if (ordinal == 3) {
            byte[] bArr4 = b.f5930l;
            bArr4[0] = (byte) (bArr4[0] | 48);
        }
        byte[] bArr5 = b.f5930l;
        byte b4 = bArr5[0] & 63;
        bArr5[0] = (byte) b4;
        bArr5[0] = (byte) (b4 | Byte.MIN_VALUE);
        bro.mo3585a(b);
        bxz u = bro.mo3606u();
        byte[] bArr6 = u.f5930l;
        byte b5 = bArr6[0] & 63;
        bArr6[0] = (byte) b5;
        bArr6[0] = (byte) (b5 | new bxz((byte) (byd2.f6119e << 6)).mo3550a(0));
        bro.mo3585a(u);
        if ((byd.ARQC.equals(byd2) || byd.TC.equals(byd2)) && boq.mo3344m()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            brj b6 = bro.mo3461b();
            byte[] bArr7 = b6.f5930l;
            bArr7[0] = (byte) (bArr7[0] | 8);
            bro.mo3585a(b6);
        }
        bqu bqu = (bqu) ((bqv) bqx2.f5984f).mo3578d();
        bro bro2 = (bro) bqx2.f5988j;
        brk c = bro2.mo3464e();
        c.mo3459g();
        c.mo3450a(new bre(bqu.mo3430e(bqx2).mo3467a(4, 1)));
        c.mo3453a(new bye(bqu.mo3430e(bqx2).mo3467a(5, 1), null));
        c.mo3452a(bro2.mo3461b());
        c.f5930l[17] = (byte) bqx2.f5376b;
        c.mo3451a(new brh(new byte[]{bto.m3598a(c.mo3458f(), bro2.f5484c.mo3563i()[0])}));
        bro.mo3585a(c);
        bri bri = bri.VERSION_05;
        try {
            bxj bxj = bqx2.f5994p;
            m3591a(bxj, bri, bzy.f6303a, bzz.f6308a, cad.f6325a, caf.f6337a, cag.f6343c, cah.f6348a, cai.f6353a, caj.f6358a);
            bxo bxo = bqx2.f5988j;
            m3591a(bxo, bri, brd.f5417a, bxp.f6000a);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new Object[1][0] = bxo;
            byteArrayOutputStream.write(bwz.m3708a(bxj.mo3481f(), bxj.mo3482w(), bxj.mo3589k(), bxj.mo3590l(), bxj.mo3483x(), bxj.mo3591m(), bxj.mo3592n(), bxj.mo3588j(), bxo.mo3463d(), bxo.mo3607v(), bxo.mo3464e()));
            bri.mo3447a(byteArrayOutputStream);
            byte[] a = cbe.m3886a(byteArrayOutputStream.toByteArray(), bqx.mo3442a());
            new Object[1][0] = cbm.m3893a(a);
            bro.mo3585a(new bxt(a));
            bsi bsi = (bsi) ((bqu) ((bqv) bqx2.f5984f).mo3578d()).mo3576c(byy.f6232a);
            if ((bsi.mo3470b().f5930l[2] & 1) != 0 && bsi.mo3472d() != null && (e = bsi.mo3473e()) != null) {
                e.mo3547aP();
                int b7 = e.mo3454b();
                byte[] bArr8 = new byte[b7];
                Iterator it = e.mo3614c(new byte[b7]).iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        new Object[1][0] = cbm.m3893a(bArr8);
                        break;
                    }
                    bpc bpc = (bpc) it.next();
                    bpo a2 = bpc.mo3349a();
                    byte[] a3 = ((bth) bqx2.f5994p).mo3586a(a2);
                    if (a3 == null) {
                        a3 = ((bro) bqx2.f5988j).mo3586a(a2);
                    }
                    if (a3 == null) {
                        new Object[1][0] = bpc.mo3349a().toString();
                        break;
                    }
                    System.arraycopy(a3, 0, bArr8, i2, Math.min(bpc.mo3356c(), a3.length));
                    i2 += bpc.mo3356c();
                }
            }
            bro bro3 = (bro) bqx2.f5988j;
            bxt bxt = new bxt(bro3.mo3582a(bxt.f6030a));
            if (!z) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(bro3.mo3606u());
                arrayList.add(bro3.mo3607v());
                arrayList.add(bxt);
                arrayList.add(bro3.mo3464e());
                return new bol(new byq(arrayList).mo3564j().mo3358e(), bop.f5269i);
            }
            bqu bqu2 = (bqu) ((bqv) bqx2.f5984f).mo3578d();
            boolean z2 = bqu2.mo3572a(bzj.f6250a) && bqu2.mo3572a(bzk.f6252a) && bqu2.mo3572a(bzl.f6254a) && bqu2.mo3572a(bzm.f6256a) && bqu2.mo3572a(bzn.f6258a);
            new Object[1][0] = Boolean.valueOf(z2);
            if (z2) {
                byte[] bArr9 = bro3.f5482a;
                if (bArr9 == null) {
                    bArr9 = new byte[0];
                }
                new Object[1][0] = cbm.m3893a(bArr9);
                byte[] f = boq.mo3331f();
                new Object[1][0] = cbm.m3893a(f);
                byte[] a4 = cbb.m3882a(bArr9, f, bro3.mo3606u().mo3564j().mo3358e(), bro3.mo3607v().mo3564j().mo3358e(), bro3.mo3464e().mo3564j().mo3358e());
                new Object[1][0] = cbm.m3893a(a4);
                byte[] a5 = cak.m3835a(a4);
                bww bww = new bww();
                new bwx(Arrays.copyOfRange(bqx2.f5377c, 8, 16)).mo3554a(bww.f5930l, 1, 8);
                bro3.mo3606u().mo3554a(bww.f5930l, 9, 1);
                bxt.mo3554a(bww.f5930l, 10, 8);
                System.arraycopy(a5, 0, bww.f5930l, 18, 20);
                new Object[1][0] = cbm.m3893a(bww.mo3563i());
                bxh bxh = bxh.FORMAT_05;
                bxd bxd = bqx2.f5984f;
                bwz[] bwzArr = {((bth) bqx2.f5994p).mo3588j()};
                try {
                    Map map = bxd.mo3578d().f5943b;
                    bzj bzj = (bzj) map.get(bzj.f6250a);
                    bzk bzk = (bzk) map.get(bzk.f6252a);
                    bzl bzl = (bzl) map.get(bzl.f6254a);
                    bzm bzm = (bzm) map.get(bzm.f6256a);
                    bzn bzn = (bzn) map.get(bzn.f6258a);
                    if (bzj == null) {
                        throw new bqg();
                    } else if (bzk == null) {
                        throw new bqg();
                    } else if (bzl == null) {
                        throw new bqg();
                    } else if (bzm == null) {
                        throw new bqg();
                    } else if (bzn != null) {
                        cbb.m3883b(bzj);
                        cbb.m3883b(bzk);
                        cbb.m3883b(bzl);
                        cbb.m3883b(bzm);
                        cbb.m3883b(bzn);
                        RSAPrivateKey a6 = bpt.m3477a(bzj.f6229e, bzk.f6229e, bzl.f6229e, bzm.f6229e, bzn.f6229e);
                        try {
                            byte[] byteArray = a6.getModulus().toByteArray();
                            byr byr = new byr(bpr.m3474a(cal.m3837a(byteArray[0] != 0 ? byteArray.length : byteArray.length - 1, bww, bxh, bwzArr), a6));
                            cbn.m3899a(a6);
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(bro3.mo3606u());
                            arrayList2.add(bro3.mo3607v());
                            arrayList2.add(byr);
                            arrayList2.add(bro3.mo3464e());
                            return new bol(new byq(arrayList2).mo3564j().mo3358e(), bop.f5269i);
                        } catch (Throwable th) {
                            cbn.m3899a(a6);
                            throw th;
                        }
                    } else {
                        throw new bqg();
                    }
                } catch (RuntimeException e2) {
                    throw new bqf(e2.getMessage(), e2);
                } catch (bqf e3) {
                    throw cbb.m3877a((Throwable) e3);
                }
            } else {
                throw new bon("Missing ICC RSA Private Key CRT Components", bop.f5266f);
            }
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* renamed from: a */
    public static final void m3590a(int i) {
        if (((byte) i) != 0) {
            throw new bon("Correct Length 00", bop.f5264d);
        }
    }

    /* renamed from: a */
    private static final void m3591a(bxi bxi, bri bri, byte[]... bArr) {
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            byte[] bArr2 = bArr[i];
            if (bxi.mo3583b(bArr2)) {
                Object[] objArr = {bArr2, bxi.mo3582a(bArr2)};
                i++;
                int i2 = cbd.f6383a;
            } else {
                String a = cbm.m3893a(bArr2);
                String valueOf = String.valueOf(bri);
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 29 + String.valueOf(valueOf).length());
                sb.append("Missing tag ");
                sb.append(a);
                sb.append(" in data for CVN ");
                sb.append(valueOf);
                throw new bon(sb.toString(), bop.f5271k);
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bok mo3486a(bok bok) {
        return new boq(bok.mo3333h());
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x0341 A[Catch:{ IllegalArgumentException -> 0x036c, IllegalArgumentException -> 0x0357, RuntimeException -> 0x03a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0344 A[Catch:{ IllegalArgumentException -> 0x036c, IllegalArgumentException -> 0x0357, RuntimeException -> 0x03a3 }] */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bol mo3487a(bxm bxm, bok bok) {
        bxj bxj;
        bxo bxo;
        bxl bxl;
        byd byd;
        bol bol;
        boolean z;
        bqx bqx = (bqx) bxm;
        boq boq = (boq) bok;
        Object[] objArr = {bxg.EFTPOS, caw.m3863a(boq), Boolean.valueOf(boq.mo3344m())};
        int i = cbd.f6383a;
        try {
            bqx.mo3443b();
            bqx.f5987i = bzx.CHIP;
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            bqx.f5377c = bArr;
            byte[] bArr2 = bqx.f5377c;
            if (bArr2 == null || bArr2.length != 16) {
                throw new bon("IDN is missing", bop.f5271k);
            }
            bro bro = (bro) bqx.f5988j;
            brk a = ((bsi) ((bqu) ((bqv) bqx.f5984f).mo3578d()).mo3576c(byy.f6232a)).mo3469a();
            bro.mo3585a(a);
            a.mo3456d();
            brj brj = new brj(a.mo3456d().mo3563i());
            bro.mo3585a(brj);
            new Object[1][0] = cbm.m3893a(brj.mo3563i());
            bro.mo3585a(new bxz((byte) 0));
            if (!bqx.f5991m || bqx.f5375a) {
                throw new bon("Generate AC command received before GPO command or after GAC command", bop.f5263c);
            }
            bqx.mo3602j();
            bqx.f5991m = false;
            bqx.f5375a = false;
            if ((boq.mo3328d() & -64) == -64) {
                throw new bon("Incorrect P1P2", bop.f5267g);
            } else if (boq.mo3329e() != 0) {
                throw new bon("Incorrect P1P2", bop.f5267g);
            } else if (((byte) boq.mo3335i()) == 30) {
                m3590a(boq.mo3336j());
                bxy h = ((bqu) ((bqv) bqx.f5984f).mo3578d()).mo3435h();
                new Object[1][0] = h.mo3565k();
                byte[] l = boq.mo3343l();
                Object[] objArr2 = {cbm.m3893a(l), Integer.valueOf(l.length)};
                bpl c = h.mo3614c(l);
                new Object[1][0] = c.toString();
                bqx bqx2 = new bqx();
                bxj bxj2 = bqx.f5994p;
                if (bxj2 != null) {
                    bxj = new bxj(bxj2.mo3587i());
                } else {
                    bxj = null;
                }
                bqx2.f5994p = bxj;
                bqx2.f5985g = bqx.f5985g;
                bqx2.f5986h = bqx.f5986h;
                bqx2.f5987i = bqx.f5987i;
                bxo bxo2 = bqx.f5988j;
                if (bxo2 != null) {
                    bxo = bxo2.mo3460a();
                } else {
                    bxo = null;
                }
                bqx2.f5988j = bxo;
                bqx2.f5989k = bqx.f5989k;
                bqx2.f5990l = bqx.f5990l;
                bqx2.f5991m = bqx.f5991m;
                bqx2.f5992n = bqx.f5992n;
                bxd bxd = bqx.f5984f;
                if (bxd != null) {
                    bxg a2 = bxd.mo3439a();
                    bxd bxd2 = bqx.f5984f;
                    long j = bxd2.f5947a;
                    Long l2 = bxd2.f5951e;
                    bxl = new bxl(a2);
                } else {
                    bxl = null;
                }
                bqx2.f5984f = bxl;
                bqx2.f5982d = null;
                bqx2.f5983e = bqx.f5983e;
                bxj bxj3 = bqx2.f5994p;
                bth bth = new bth(Arrays.copyOf(bxj3.mo3587i(), bxj3.mo3587i().length));
                bth.mo3584a(c);
                caa a3 = bth.mo3481f();
                if (cbm.m3893a(a3.mo3563i()).matches("\\d{12}")) {
                    cab b = bth.mo3482w();
                    if (cbm.m3893a(b.mo3563i()).matches("\\d{12}")) {
                        bxy h2 = ((bqu) ((bqv) bqx.f5984f).mo3578d()).mo3435h();
                        new Object[1][0] = h2.mo3565k();
                        byte[] l3 = boq.mo3343l();
                        Object[] objArr3 = {cbm.m3893a(l3), Integer.valueOf(l3.length)};
                        bpl c2 = h2.mo3614c(l3);
                        new Object[1][0] = c2.toString();
                        ((bth) bqx.f5994p).mo3584a(c2);
                        bro bro2 = (bro) bqx.f5988j;
                        brb brb = bro2.f5483b;
                        byte[] bArr3 = brb.f5930l;
                        bArr3[0] = (byte) (bArr3[0] | 2);
                        if ((((long) ((bqu) ((bqv) bqx.f5984f).mo3578d()).mo3436i().f5930l[0]) & 8) != 0) {
                            byte[] bArr4 = brb.f5930l;
                            bArr4[0] = (byte) (bArr4[0] | 64);
                            brj b2 = bro2.mo3461b();
                            byte[] bArr5 = b2.f5930l;
                            bArr5[3] = (byte) (bArr5[3] | 2);
                            bro2.mo3585a(b2);
                        }
                        bxj bxj4 = bqx.f5994p;
                        bqu bqu = (bqu) ((bqv) bqx.f5984f).mo3578d();
                        brb brb2 = ((bro) bqx.f5988j).f5483b;
                        if (!bqu.mo3436i().mo3465a()) {
                            byd a4 = caw.m3863a(boq);
                            if (a4.equals(byd.ARQC)) {
                                byte[] b3 = bqu.mo3425b(bqx);
                                int i2 = 0;
                                while (true) {
                                    if (i2 < 6) {
                                        if ((brb2.mo3563i()[i2] & b3[i2]) != 0) {
                                            byd = byd.AAC;
                                            break;
                                        }
                                        i2++;
                                    } else {
                                        byd = byd.ARQC;
                                        break;
                                    }
                                }
                            } else {
                                if (a4.equals(byd.TC)) {
                                    byte[] b4 = bqu.mo3425b(bqx);
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 < 6) {
                                            if ((brb2.mo3563i()[i3] & b4[i3]) != 0) {
                                                byd = byd.AAC;
                                                break;
                                            }
                                            i3++;
                                        } else {
                                            cae o = bxj4.mo3593o();
                                            if (o.mo3454b()) {
                                                byte a5 = o.mo3550a(0) & 15;
                                                if (a5 != 1) {
                                                    if (!(a5 == 2 || a5 == 3 || (o.mo3550a(0) & 48) != 32)) {
                                                        if ((bqu.mo3428d(bqx).mo3550a(0) & 1) != 1) {
                                                            byte[] c3 = bqu.mo3427c(bqx);
                                                            int i4 = 0;
                                                            while (true) {
                                                                if (i4 < 6) {
                                                                    if ((brb2.mo3563i()[i4] & c3[i4]) != 0) {
                                                                        break;
                                                                    }
                                                                    i4++;
                                                                } else {
                                                                    byd = byd.TC;
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            byd = byd.TC;
                                                        }
                                                    }
                                                }
                                                byte[] c4 = bqu.mo3427c(bqx);
                                                int i5 = 0;
                                                while (true) {
                                                    if (i5 < 6) {
                                                        if ((brb2.mo3563i()[i5] & c4[i5]) != 0) {
                                                            byd = byd.AAC;
                                                            break;
                                                        }
                                                        i5++;
                                                    } else {
                                                        byd = byd.TC;
                                                        break;
                                                    }
                                                }
                                            } else {
                                                byte[] a6 = bqu.mo3430e(bqx).mo3467a(12, 6);
                                                int i6 = 0;
                                                while (true) {
                                                    if (i6 < 6) {
                                                        if ((brb2.mo3563i()[i6] & a6[i6]) != 0) {
                                                            byd = byd.ARQC;
                                                            break;
                                                        }
                                                        i6++;
                                                    } else {
                                                        byd = byd.TC;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                byd = byd.AAC;
                            }
                        } else {
                            byd = byd.AAC;
                        }
                        bro bro3 = (bro) bqx.f5988j;
                        int ordinal = byd.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    throw new RuntimeException("Invalid cryptogram type");
                                }
                            }
                            bol = m3589a(bqx, boq, byd);
                            bqx.f5985g = bxn.APPROVED;
                        } else {
                            bol = m3589a(bqx, boq, byd);
                            bxj bxj5 = bqx.f5994p;
                            if (!(bxj5 == null || bxj5.mo3592n() == null)) {
                                if (Arrays.equals(new byte[]{32}, bxj5.mo3592n().mo3563i())) {
                                    z = true;
                                    new Object[1][0] = Boolean.valueOf(z);
                                    bqx.f5985g = !z ? bxn.APPROVED : bxn.DECLINED;
                                }
                            }
                            z = false;
                            new Object[1][0] = Boolean.valueOf(z);
                            bqx.f5985g = !z ? bxn.APPROVED : bxn.DECLINED;
                        }
                        bqx.f5375a = true;
                        return bol;
                    }
                    new Object[1][0] = b;
                    throw new bon("wrong data - not BCD-encoded", bop.f5272l);
                }
                new Object[1][0] = a3;
                throw new bon("wrong data - not BCD-encoded", bop.f5272l);
            } else {
                throw new bon("Wrong Length", bop.f5273m);
            }
        } catch (IllegalArgumentException e) {
            throw new bon("Wrong Data", bop.f5272l);
        } catch (IllegalArgumentException e2) {
            throw new bon("Wrong Data", bop.f5272l);
        } catch (RuntimeException e3) {
            bqx.f5991m = false;
            throw e3;
        }
    }
}
