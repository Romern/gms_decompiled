package p000;

import android.util.SparseArray;

/* renamed from: blkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blkm implements bljm {

    /* renamed from: a */
    private final cayo f126751a;

    /* renamed from: b */
    private final blkb f126752b;

    /* renamed from: a */
    public final void mo16707a(bljz bljz, SparseArray sparseArray) {
        bmxv bmxv;
        boolean z;
        bljz bljz2 = bljz;
        SparseArray sparseArray2 = sparseArray;
        bmxv bmxv2 = (bmxv) this.f126751a.mo16713a();
        if (!bmxv2.mo66813a() || !((bdpp) bmxv2.mo66814b()).mo58264a()) {
            bmxv = bmvz.f131120a;
        } else {
            bmxv = ((bdpp) bmxv2.mo66814b()).mo58266c().mo16675a(sparseArray2, bljz2);
        }
        if (bmxv.mo66813a()) {
            blko blko = new blko();
            blko.f126754a = bljz2;
            blko.f126755b = sparseArray2;
            blko.f126760g = ((Float) bmxv.mo66814b()).floatValue();
            bmxy.m108581a(blko.f126754a);
            int i = 1;
            boolean z2 = false;
            if (blko.f126761h == null) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108600b(z);
            bxvd da = cinu.f190982h.mo74144da();
            float f = blko.f126760g;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cinu cinu = (cinu) da.f164949b;
            cinu.f190984a |= 4;
            cinu.f190988e = f;
            blko.f126761h = da;
            bljz bljz3 = blko.f126754a;
            blko.f126756c = bljz3.f126719f;
            bxvd bxvd = blko.f126761h;
            long j = (bljz3.f126715b ^ bljz3.f126716c) & Long.MAX_VALUE;
            long j2 = 1;
            if (j == 0) {
                j = 1;
            }
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            cinu cinu2 = (cinu) bxvd.f164949b;
            int i2 = cinu2.f190984a | 1;
            cinu2.f190984a = i2;
            cinu2.f190985b = j;
            cinu2.f190986c = 1;
            cinu2.f190984a = i2 | 2;
            bxwc bxwc = blko.f126754a.f126717d;
            int size = bxwc.size();
            int i3 = 0;
            while (i3 < size) {
                bliz bliz = (bliz) bxwc.get(i3);
                bxvd da2 = cinx.f190993m.mo74144da();
                String str = bliz.f126650b;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = z2;
                }
                cinx cinx = (cinx) da2.f164949b;
                str.getClass();
                int i4 = cinx.f190995a | i;
                cinx.f190995a = i4;
                cinx.f190996b = str;
                int i5 = bliz.f126651c;
                int i6 = i4 | 8;
                cinx.f190995a = i6;
                cinx.f190999e = ((long) i5) + j2;
                int i7 = bliz.f126652d;
                int i8 = i6 | 16;
                cinx.f190995a = i8;
                cinx.f191000f = ((long) i7) + j2;
                long j3 = blko.f126756c;
                long j4 = bliz.f126653e;
                int i9 = i8 | 32;
                cinx.f190995a = i9;
                cinx.f191001g = j3 + j4;
                if ((bliz.f126649a & 16) != 0) {
                    long j5 = bliz.f126654f;
                    i9 |= 64;
                    cinx.f190995a = i9;
                    cinx.f191002h = j5;
                }
                if ((bliz.f126649a & 32) != 0) {
                    int i10 = bliz.f126655g;
                    cinx.f190995a = i9 | 128;
                    cinx.f191003i = i10;
                }
                bljc a = bljf.m107236a(blkn.f126753a, (bljf) blko.f126755b.get(i5, blje.f126668a), blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
                if (a.mo66589b()) {
                    aabk aabk = (aabk) a.mo66588a();
                    if (aabk.f27885a) {
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        cinx cinx2 = (cinx) da2.f164949b;
                        cinx2.f191005k = 5;
                        cinx2.f190995a |= 512;
                    }
                    bmxv bmxv3 = aabk.f27886b;
                    if (bmxv3.mo66813a()) {
                        cimz cimz = (cimz) bmxv3.mo66814b();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        cinx cinx3 = (cinx) da2.f164949b;
                        cimz.getClass();
                        cinx3.f191006l = cimz;
                        cinx3.f190995a |= 1024;
                    }
                }
                cinx cinx4 = (cinx) da2.mo74062i();
                if (cinx4.f191000f != 0) {
                    int a2 = cinw.m150650a(cinx4.f191005k);
                    if (a2 != 0 && a2 == 6 && blko.f126759f == null) {
                        blko.f126759f = cinx4;
                    }
                } else {
                    blko.f126758e = cinx4;
                }
                bxvd bxvd2 = blko.f126761h;
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                cinu cinu3 = (cinu) bxvd2.f164949b;
                cinx4.getClass();
                cinu3.mo86262c();
                cinu3.f190987d.add(cinx4);
                long j6 = cinx4.f191001g + cinx4.f191002h;
                if (j6 > blko.f126757d) {
                    blko.f126757d = j6;
                }
                i3++;
                i = 1;
                z2 = false;
                j2 = 1;
            }
            bljz bljz4 = blko.f126754a;
            if ((bljz4.f126714a & 16) != 0) {
                blim blim = bljz4.f126720g;
                if (blim == null) {
                    blim = blim.f126629d;
                }
                bxvd da3 = cinr.f190975d.mo74144da();
                if ((blim.f126631a & 1) != 0) {
                    blil blil = blim.f126632b;
                    if (blil == null) {
                        blil = blil.f126625c;
                    }
                    int i11 = blil.f126628b;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    cinr cinr = (cinr) da3.f164949b;
                    cinr.f190977a |= 1;
                    cinr.f190978b = i11;
                }
                if ((blim.f126631a & 2) != 0) {
                    blik blik = blim.f126633c;
                    if (blik == null) {
                        blik = blik.f126620d;
                    }
                    long j7 = blik.f126623b;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    cinr cinr2 = (cinr) da3.f164949b;
                    cinr2.f190977a |= 2;
                    cinr2.f190979c = j7;
                }
                bxvd bxvd3 = blko.f126761h;
                cinr cinr3 = (cinr) da3.mo74062i();
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                cinu cinu4 = (cinu) bxvd3.f164949b;
                cinr3.getClass();
                cinu4.f190989f = cinr3;
                cinu4.f190984a |= 8;
            }
            if (blko.f126759f == null) {
                blko.f126759f = blko.f126758e;
            }
            cinx cinx5 = blko.f126759f;
            String str2 = cinx5.f190996b;
            cimz cimz2 = cinx5.f191006l;
            blkp blkp = new blkp(str2, cimz2 != null ? cimz2 : cimz.f190878c, blko.f126756c, blko.f126757d, (cinu) blko.f126761h.mo74062i());
            bdgs.m90764a().f105605a.mo57993a(bdii.f105692a, blkp.f126766e, (cimz) null);
            if (((bmxv) this.f126751a.mo16713a()).mo66813a() && ((bdpp) ((bmxv) this.f126751a.mo16713a()).mo66814b()).mo58267d()) {
                bdgs.m90764a().f105605a.mo57995a(bdil.f105699a, blkp.f126762a, blkp.f126764c, blkp.f126765d, blkp.f126763b);
            }
        }
    }

    public blkm(cayo cayo, blkb blkb) {
        this.f126751a = cayo;
        this.f126752b = blkb;
    }
}
