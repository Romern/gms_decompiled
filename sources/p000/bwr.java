package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.EnumSet;

/* renamed from: bwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwr implements cas {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bwz.a(int, int, boolean):void
     arg types: [int, int, int]
     candidates:
      bwz.a(byte[], int, int):void
      bwz.a(int, int, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x084a A[Catch:{ NumberFormatException -> 0x0819, IOException -> 0x07e3, IOException -> 0x07b8, IOException -> 0x0484, btv -> 0x0856 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0127 A[Catch:{ NumberFormatException -> 0x0819, IOException -> 0x07e3, IOException -> 0x07b8, IOException -> 0x0484, btv -> 0x0856 }] */
    /* renamed from: a */
    public final byte[] mo3489a(bxd bxd, bpx bpx, bqi bqi) {
        bvw bvw;
        bqk bqk;
        bur bur;
        byd byd;
        bxz bxz;
        byte[] bArr;
        byte[] bArr2;
        bwh bwh;
        cag cag;
        byb byb;
        bpx bpx2 = bpx;
        EnumSet enumSet = bpx2.f5330b;
        byte b = 0;
        if (enumSet == null) {
            bvw = new bvw((byte) -114);
        } else {
            bvw = enumSet.contains(bxc.MC_3DS) ? new bvw((byte) -50) : bpx2.f5330b.contains(bxc.MC_EMV) ? new bvw((byte) -114) : new bvw((byte) 0);
        }
        long a = bpx.mo3397a();
        asse asse = bpx2.f5329a;
        bwi bwi = new bwi(a, asse.f89558b, asse.f89559c / 10000, bpx.mo3398b(), bpx2.f5329a.f89561e, bvw);
        if (bqi.mo3418a()) {
            bqk = new bqj();
        } else {
            bqk = new bqn();
        }
        bub bub = new bub((btz) bxd, bqk, new buq(), bwi);
        int i = cbd.f6383a;
        btz btz = bub.f5594a;
        byte[] bArr3 = btz.f5953g;
        if (bArr3 != null) {
            if (bArr3.length != 0) {
                bub.f5597d = btz.mo3496c();
                new Object[1][0] = bub.f5597d;
                bur = new bur(((bvd) ((bty) bub.f5594a.mo3578d()).mo3576c(bvd.f5782a)).mo3541h().mo3563i());
                if (bur.mo3528a()) {
                    bub.f5596c.mo3585a(bur);
                    btz btz2 = bub.f5594a;
                    btx btx = (btx) ((bpz) btz2.f5949c).mo3405a(btz2).f5940a;
                    if (new cbj(btx.f5591a).mo3652b() < 65535) {
                        bub.f5596c.mo3585a(new bxp(btx.f5591a));
                        bub.mo3502a();
                        bub.f5596c.mo3585a(new buj(buj.f5648a));
                        if (((bvd) ((bty) bub.f5594a.mo3578d()).mo3576c(bvd.f5782a)).mo3535b().mo3505a()) {
                            if (bub.f5598e.f5886h.mo3563i()[0] != -114) {
                                if (bub.f5598e.f5886h.mo3563i()[0] != -50) {
                                    throw new btv(btu.WRONG_CVN, btu.TRANSACTION_NOT_SUPPORTED.f5588h);
                                }
                            }
                            if (!bub.f5598e.f5880b.mo3454b()) {
                                try {
                                    Long.parseLong(cbm.m3893a(bub.f5598e.f5880b.mo3563i()));
                                    if (Long.valueOf(Long.parseLong(cbm.m3893a(bub.f5598e.f5884f.mo3563i()))).longValue() == 0) {
                                        bub.f5596c.mo3585a(new bui(new byte[]{0, 0, 0, 0}));
                                        bur g = bub.f5596c.mo3525g();
                                        bui c = bub.f5596c.mo3524c();
                                        buj b2 = bub.f5596c.mo3523b();
                                        if (bub.f5595b instanceof bqj) {
                                            if (!((bvd) ((bty) bub.f5594a.mo3578d()).mo3576c(bvd.f5782a)).mo3539f()) {
                                                buz a2 = bub.f5597d.mo3518a();
                                                if (a2 == null) {
                                                    a2 = new buz(buz.f5762b);
                                                }
                                                a2.mo3553a(buz.f5762b);
                                                bub.f5597d.mo3585a(a2);
                                                bub.f5594a.f5949c.mo3406a(bub.f5597d.mo3520c());
                                            }
                                            buy b3 = bub.f5597d.mo3519b();
                                            b3.mo3531a();
                                            bub.f5597d.mo3585a(b3);
                                            g.mo3527a(true);
                                            c.mo3506a();
                                            bub.f5596c.mo3585a(g);
                                            bub.f5596c.mo3585a(c);
                                            bub.f5596c.mo3585a(b2);
                                            buj b4 = bub.f5596c.mo3523b();
                                            if (bub.f5596c.mo3607v().mo3454b() == 1) {
                                                b4.mo3551a(1, 3, true);
                                            }
                                            b4.mo3515f();
                                            b4.mo3517h();
                                            bvs bvs = (bvs) ((bty) bub.f5594a.mo3578d()).mo3576c(bvs.f5812a);
                                            String cbj = new cbj(bvs.mo3544a().mo3563i()).toString();
                                            String cbj2 = new cbj(bub.f5598e.f5879a.mo3563i()).toString();
                                            String cbj3 = new cbj(bvs.mo3545b().mo3563i()).toString();
                                            String cbj4 = new cbj(bub.f5598e.f5883e.mo3563i()).toString();
                                            if (!cbj.equals(cbj2)) {
                                                b4.mo3512c();
                                                if (!cbj3.equals(cbj4)) {
                                                    b4.mo3454b();
                                                } else {
                                                    b4.mo3514e();
                                                }
                                            } else if (!cbj3.equals(cbj4)) {
                                                b4.mo3513d();
                                            }
                                            bub.f5596c.mo3585a(b4);
                                            bui c2 = bub.f5596c.mo3524c();
                                            bur g2 = bub.f5596c.mo3525g();
                                            if (((bvd) ((bty) bub.f5594a.mo3578d()).mo3576c(bvd.f5782a)).mo3535b().mo3505a() && g2.mo3454b()) {
                                                c2.mo3506a();
                                            }
                                            c2.mo3508d();
                                            c2.mo3510f();
                                            bub.f5596c.mo3607v();
                                            bvd bvd = (bvd) ((bty) bub.f5594a.mo3578d()).mo3576c(bvd.f5782a);
                                            bub.f5596c.mo3523b();
                                            ((bty) bub.f5594a.mo3578d()).mo3494f();
                                            bvd.mo3535b();
                                            bui c3 = bub.f5596c.mo3524c();
                                            bur g3 = bub.f5596c.mo3525g();
                                            byd byd2 = byd.AAC;
                                            buj b5 = bub.f5596c.mo3523b();
                                            buf c4 = bvd.mo3536c();
                                            bug d = bvd.mo3537d();
                                            new Object[1][0] = b5.mo3563i();
                                            new Object[1][0] = c4.mo3563i();
                                            new Object[1][0] = d.mo3563i();
                                            boolean a3 = c4.mo3503a(b5);
                                            boolean a4 = d.mo3504a(b5);
                                            if (!b5.mo3511a() || !a4) {
                                                byd = !a3 ? byd.ARQC : byd.AAC;
                                            } else {
                                                byd = byd.AAC;
                                            }
                                            if (byd != byd.AAC) {
                                                bxz = new bxz(Byte.MIN_VALUE);
                                                c3.mo3508d();
                                                c3.mo3510f();
                                            } else {
                                                bxz = new bxz((byte) 0);
                                                c3.mo3509e();
                                                c3.mo3510f();
                                                g3.mo3529c();
                                            }
                                            bub.f5596c.mo3585a(bxz);
                                            bub.f5596c.mo3585a(c3);
                                            bub.f5596c.mo3585a(g3);
                                            bub.f5596c.mo3585a(new bwc(((bty) bub.f5594a.mo3578d()).mo3494f(), bub.f5598e.f5886h, bub.f5596c.mo3523b(), bvd.mo3535b(), bub.f5596c.mo3524c(), bvd.mo3534a(), ((bvk) ((bty) bub.f5594a.mo3578d()).mo3576c(bvk.f5796a)).mo3543a()));
                                            if (byd != byd.AAC) {
                                                if (bub.f5598e.f5886h.mo3563i()[0] == -114) {
                                                    bub.mo3502a();
                                                    bub.m3634a(bub.f5596c, (byte) -114, bxs.f6023b, bxp.f6000a);
                                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                    bub.f5598e.f5880b.mo3552a(byteArrayOutputStream);
                                                    bub.f5598e.f5884f.mo3552a(byteArrayOutputStream);
                                                    bub.f5598e.f5879a.mo3552a(byteArrayOutputStream);
                                                    bub.f5598e.f5882d.mo3552a(byteArrayOutputStream);
                                                    bub.f5598e.f5885g.mo3552a(byteArrayOutputStream);
                                                    bub.f5598e.f5881c.mo3552a(byteArrayOutputStream);
                                                    bub.f5596c.mo3607v().mo3552a(byteArrayOutputStream);
                                                    byteArrayOutputStream.write(bub.f5596c.mo3526h().mo3563i());
                                                    byteArrayOutputStream.write(128);
                                                    while (byteArrayOutputStream.size() % 8 != 0) {
                                                        byteArrayOutputStream.write(0);
                                                        b = 0;
                                                    }
                                                    bArr = byteArrayOutputStream.toByteArray();
                                                } else if (bub.f5598e.f5886h.mo3563i()[0] == -50) {
                                                    bub.mo3502a();
                                                    bub.m3634a(bub.f5596c, (byte) -50, bxs.f6023b, bxp.f6000a);
                                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                                    bub.f5598e.f5881c.mo3552a(byteArrayOutputStream2);
                                                    bub.f5596c.mo3607v().mo3552a(byteArrayOutputStream2);
                                                    byteArrayOutputStream2.write(bub.f5596c.mo3526h().mo3563i());
                                                    byteArrayOutputStream2.write(128);
                                                    while (byteArrayOutputStream2.size() % 8 != 0) {
                                                        byteArrayOutputStream2.write(0);
                                                    }
                                                    bArr = byteArrayOutputStream2.toByteArray();
                                                } else {
                                                    throw new btv(btu.WRONG_CVN, btu.RISK_ANALYSIS_FAILED.f5588h);
                                                }
                                                btz btz3 = bub.f5594a;
                                                byte[] bArr4 = ((btx) ((bpz) btz3.f5949c).mo3405a(btz3).f5940a).f5592b;
                                                cat cat = bub.f5594a.f5949c;
                                                bxt bxt = new bxt(cbe.m3886a(bArr, bArr4));
                                                byl d2 = ((bty) bub.f5594a.mo3578d()).mo3429d();
                                                bxv k = ((bty) bub.f5594a.mo3578d()).mo3577k();
                                                bwi bwi2 = bub.f5598e;
                                                cag cag2 = bwi2.f5879a;
                                                bzy bzy = bwi2.f5880b;
                                                byb byb2 = new byb(((bvt) ((bty) bub.f5594a.mo3578d()).mo3576c(byu.f6230b)).mo3582a(byb.f6093a));
                                                bvz bvz = new bvz(bvz.f5835b);
                                                Arrays.fill(bvz.mo3563i(), b);
                                                bxz u = bub.f5596c.mo3606u();
                                                bxp v = bub.f5596c.mo3607v();
                                                bwc h = bub.f5596c.mo3526h();
                                                bwi bwi3 = bub.f5598e;
                                                bzz bzz = bwi3.f5884f;
                                                cah cah = bwi3.f5882d;
                                                cai cai = bwi3.f5885g;
                                                caj caj = bwi3.f5881c;
                                                bwd bwd = bub.f5599f;
                                                byte[] i2 = bxt.mo3563i();
                                                bvw bvw2 = bub.f5598e.f5886h;
                                                byb byb3 = byb2;
                                                cag cag3 = cag2;
                                                if (bvw2.mo3563i()[0] == -114) {
                                                    bArr2 = cbb.m3882a(bub.f5594a.mo3579e().mo3563i(), bub.f5596c.mo3607v().mo3563i(), i2);
                                                } else if (bvw2.mo3563i()[0] == -50) {
                                                    bArr2 = cbb.m3882a(bub.f5594a.mo3579e().mo3563i(), new bwg(bub.f5596c.mo3607v().mo3563i(), bub.f5598e.f5881c.mo3563i(), i2, bub.f5596c.mo3606u().mo3563i(), bub.f5596c.mo3526h().mo3563i()).mo3563i());
                                                } else {
                                                    throw new btv(btu.WRONG_CVN, btu.WRONG_CVN.f5588h);
                                                }
                                                bwd.f5858c = new bwj(cak.m3836b(bArr2));
                                                if (bub.f5598e.f5886h.mo3563i()[0] == -114) {
                                                    byb = byb3;
                                                    cag = cag3;
                                                    bwh = new bwb(u, v, bxt, h, bzz, cah, cai, caj);
                                                } else if (bub.f5598e.f5886h.mo3563i()[0] == -50) {
                                                    bwh = new bwh(new bwg(v.mo3563i(), caj.mo3563i(), bxt.mo3563i(), u.mo3563i(), h.mo3563i()));
                                                    byb = byb3;
                                                    cag = cag3;
                                                } else {
                                                    throw new btv(btu.WRONG_CVN, btu.WRONG_CVN.f5588h);
                                                }
                                                bub.f5599f.f5862g = new bvx(d2, k, cag, bzy, byb, bvz, bwh);
                                                bwd bwd2 = bub.f5599f;
                                                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                                if (!bwd2.f5864i.equals("9000")) {
                                                    byteArrayOutputStream3.write(cbm.m3896a(bwd2.f5864i));
                                                } else {
                                                    int length = bwd2.f5858c.mo3564j().mo3358e().length + bwd2.f5859d.mo3564j().mo3358e().length + bwd2.f5860e.mo3564j().mo3358e().length + bwd2.f5861f.mo3564j().mo3358e().length + bwd2.f5862g.mo3564j().mo3358e().length + bwd2.f5863h.mo3564j().mo3358e().length;
                                                    byteArrayOutputStream3.write(bwd.f5851a);
                                                    String hexString = Integer.toHexString(length);
                                                    if (hexString.length() % 2 != 0) {
                                                        String valueOf = String.valueOf(hexString);
                                                        hexString = valueOf.length() == 0 ? new String("0") : "0".concat(valueOf);
                                                    }
                                                    if (length > 127 && length <= 255) {
                                                        byteArrayOutputStream3.write(cbm.m3896a("81"));
                                                    } else if (length > 255 && length <= 65535) {
                                                        byteArrayOutputStream3.write(cbm.m3896a("82"));
                                                    }
                                                    byteArrayOutputStream3.write(cbm.m3896a(hexString));
                                                    byteArrayOutputStream3.write(bwd2.f5858c.mo3564j().mo3358e());
                                                    byteArrayOutputStream3.write(bwd2.f5859d.mo3564j().mo3358e());
                                                    byteArrayOutputStream3.write(bwd2.f5860e.mo3564j().mo3358e());
                                                    byteArrayOutputStream3.write(bwd2.f5861f.mo3564j().mo3358e());
                                                    byteArrayOutputStream3.write(bwd2.f5862g.mo3564j().mo3358e());
                                                    byteArrayOutputStream3.write(bwd2.f5863h.mo3564j().mo3358e());
                                                    byteArrayOutputStream3.write(cbm.m3896a(bwd2.f5864i));
                                                }
                                                return byteArrayOutputStream3.toByteArray();
                                            }
                                            throw new btv(btu.RISK_ANALYSIS_FAILED, btu.RISK_ANALYSIS_FAILED.f5588h);
                                        }
                                        throw new btv(btu.TRANSACTION_NOT_SUPPORTED, btu.TRANSACTION_NOT_SUPPORTED.f5588h);
                                    }
                                    throw new btv(btu.TRANSACTION_NOT_SUPPORTED, btu.TRANSACTION_NOT_SUPPORTED.f5588h);
                                } catch (NumberFormatException e) {
                                    throw new btv(btu.TRANSACTION_NOT_SUPPORTED, btu.TRANSACTION_NOT_SUPPORTED.f5588h);
                                } catch (IOException e2) {
                                    throw new btv(btu.UNKNOWN_ERROR, e2.getStackTrace().toString());
                                } catch (IOException e3) {
                                    throw new bon(bop.f5263c);
                                } catch (IOException e4) {
                                    throw new btv(btu.UNKNOWN_ERROR, e4.getStackTrace().toString());
                                } catch (btv e5) {
                                    getClass().getSimpleName();
                                    int i3 = cbd.f6383a;
                                    btu btu = e5.f5590a;
                                    if (btu == btu.APPLICATION_BLOCKED) {
                                        throw new C0071car(2, btu.APPLICATION_BLOCKED.f5588h);
                                    } else if (btu == btu.ATC_LIMIT_REACHED) {
                                        throw new C0071car(2, btu.ATC_LIMIT_REACHED.f5588h);
                                    } else if (btu == btu.RISK_ANALYSIS_FAILED) {
                                        throw new C0071car(2, btu.RISK_ANALYSIS_FAILED.f5588h);
                                    } else if (btu == btu.DATA_ELEMENT_MISSING) {
                                        throw new C0071car(2, btu.DATA_ELEMENT_MISSING.f5588h);
                                    } else if (btu == btu.WRONG_CVN) {
                                        throw new C0071car(2, btu.WRONG_CVN.f5588h);
                                    } else if (btu == btu.TRANSACTION_NOT_SUPPORTED) {
                                        throw new C0071car(2, btu.TRANSACTION_NOT_SUPPORTED.f5588h);
                                    } else if (btu != btu.UNKNOWN_ERROR) {
                                        throw new C0071car(4, btu.UNKNOWN_ERROR.f5588h);
                                    } else {
                                        throw new C0071car(2, btu.ATC_LIMIT_REACHED.f5588h);
                                    }
                                }
                            } else {
                                throw new btv(btu.TRANSACTION_NOT_SUPPORTED, btu.TRANSACTION_NOT_SUPPORTED.f5588h);
                            }
                        } else {
                            throw new btv(btu.TRANSACTION_NOT_SUPPORTED, btu.TRANSACTION_NOT_SUPPORTED.f5588h);
                        }
                    } else {
                        throw new btv(btu.TRANSACTION_NOT_SUPPORTED, btu.TRANSACTION_NOT_SUPPORTED.f5588h);
                    }
                } else {
                    throw new btv(btu.TRANSACTION_NOT_SUPPORTED, btu.TRANSACTION_NOT_SUPPORTED.f5588h);
                }
            }
        }
        buk buk = new buk();
        if (!cbm.m3893a(bub.f5594a.f5950d.mo3563i()).equals("0001")) {
            bvd bvd2 = (bvd) ((bty) bub.f5594a.mo3578d()).mo3576c(bvd.f5782a);
            buk.mo3585a(new buz(bvd2.mo3540g().mo3563i()));
            buk.mo3585a(new buy(bvd2.mo3542i().mo3563i()));
            new Object[1][0] = bub.f5597d;
        } else {
            new Object[1][0] = bub.f5597d;
        }
        bub.f5594a.f5952f = buk.mo3520c().mo3358e();
        bub.f5594a.f5953g = buk.mo3520c().mo3358e();
        bub.f5597d = bub.f5594a.mo3496c();
        bur = new bur(((bvd) ((bty) bub.f5594a.mo3578d()).mo3576c(bvd.f5782a)).mo3541h().mo3563i());
        if (bur.mo3528a()) {
        }
    }
}
