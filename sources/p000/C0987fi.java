package p000;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: fi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0987fi extends C0991fm {

    /* renamed from: af */
    protected final C0981fc f16619af = new C0981fc();

    /* renamed from: ag */
    public int f16620ag;

    /* renamed from: ah */
    public int f16621ah;

    /* renamed from: ai */
    public int f16622ai = 2;

    /* renamed from: aj */
    public boolean f16623aj = false;

    /* renamed from: ak */
    public boolean f16624ak = false;

    /* renamed from: am */
    private C0990fl f16625am;

    /* renamed from: an */
    private int f16626an = 0;

    /* renamed from: ao */
    private int f16627ao = 0;

    /* renamed from: ap */
    private C0986fh[] f16628ap = new C0986fh[4];

    /* renamed from: aq */
    private C0986fh[] f16629aq = new C0986fh[4];

    /* renamed from: ar */
    private C0986fh[] f16630ar = new C0986fh[4];

    /* renamed from: as */
    private final boolean[] f16631as = new boolean[3];

    /* renamed from: at */
    private final C0986fh[] f16632at = new C0986fh[4];

    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0173, code lost:
        r15 = r12;
     */
    /* renamed from: a */
    private final int m11723a(C0981fc fcVar, C0986fh[] fhVarArr, C0986fh fhVar, int i, boolean[] zArr) {
        int i2;
        boolean z;
        C0986fh fhVar2;
        char c;
        boolean z2;
        C0986fh fhVar3;
        char c2;
        C0981fc fcVar2 = fcVar;
        C0986fh fhVar4 = fhVar;
        zArr[0] = true;
        zArr[1] = false;
        C0986fh fhVar5 = null;
        fhVarArr[0] = null;
        fhVarArr[2] = null;
        fhVarArr[1] = null;
        fhVarArr[3] = null;
        float f = 0.0f;
        int i3 = 5;
        if (i == 0) {
            C0985fg fgVar = fhVar4.f16575i.f16487b;
            if (fgVar == null || fgVar.f16486a == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            fhVar4.f16562ab = null;
            if (fhVar4.f16544K != 8) {
                fhVar3 = fhVar4;
            } else {
                fhVar3 = null;
            }
            C0986fh fhVar6 = fhVar4;
            C0986fh fhVar7 = null;
            C0986fh fhVar8 = fhVar3;
            i2 = 0;
            while (fhVar6.f16577k.f16487b != null) {
                fhVar6.f16562ab = fhVar5;
                if (fhVar6.f16544K == 8) {
                    C0985fg fgVar2 = fhVar6.f16575i;
                    fcVar2.mo10676c(fgVar2.f16491f, fgVar2.f16487b.f16491f, 0, 5);
                    fcVar2.mo10676c(fhVar6.f16577k.f16491f, fhVar6.f16575i.f16491f, 0, 5);
                } else {
                    if (fhVar3 == null) {
                        fhVar3 = fhVar6;
                    }
                    if (!(fhVar8 == null || fhVar8 == fhVar6)) {
                        fhVar8.f16562ab = fhVar6;
                    }
                    fhVar8 = fhVar6;
                }
                if (fhVar6.f16544K != 8 && fhVar6.f16564ad == 3) {
                    if (fhVar6.f16565ae == 3) {
                        zArr[0] = false;
                    }
                    if (fhVar6.f16587u <= f) {
                        zArr[0] = false;
                        int i4 = i2 + 1;
                        C0986fh[] fhVarArr2 = this.f16628ap;
                        int length = fhVarArr2.length;
                        if (i4 >= length) {
                            this.f16628ap = (C0986fh[]) Arrays.copyOf(fhVarArr2, length + length);
                        }
                        this.f16628ap[i2] = fhVar6;
                        i2 = i4;
                    }
                }
                C0986fh fhVar9 = fhVar6.f16577k.f16487b.f16486a;
                C0985fg fgVar3 = fhVar9.f16575i.f16487b;
                if (fgVar3 == null || fgVar3.f16486a != fhVar6 || fhVar9 == fhVar6) {
                    break;
                }
                fhVar7 = fhVar9;
                fhVar6 = fhVar7;
                fhVar5 = null;
                f = 0.0f;
            }
            C0985fg fgVar4 = fhVar6.f16577k.f16487b;
            if (!(fgVar4 == null || fgVar4.f16486a == this)) {
                z2 = false;
            }
            if (fhVar4.f16575i.f16487b == null || fhVar7.f16577k.f16487b == null) {
                c2 = 1;
                zArr[1] = true;
            } else {
                c2 = 1;
            }
            fhVar4.f16557X = z2;
            fhVar7.f16562ab = null;
            fhVarArr[0] = fhVar4;
            fhVarArr[2] = fhVar3;
            fhVarArr[c2] = fhVar7;
            fhVarArr[3] = fhVar8;
        } else {
            C0985fg fgVar5 = fhVar4.f16576j.f16487b;
            if (fgVar5 == null || fgVar5.f16486a == this) {
                z = true;
            } else {
                z = false;
            }
            fhVar4.f16563ac = null;
            if (fhVar4.f16544K != 8) {
                fhVar2 = fhVar4;
            } else {
                fhVar2 = null;
            }
            C0986fh fhVar10 = fhVar4;
            C0986fh fhVar11 = fhVar2;
            C0986fh fhVar12 = fhVar11;
            C0986fh fhVar13 = null;
            int i5 = 0;
            while (true) {
                if (fhVar10.f16578l.f16487b == null) {
                    int i6 = i5;
                    break;
                }
                fhVar10.f16563ac = null;
                if (fhVar10.f16544K == 8) {
                    C0985fg fgVar6 = fhVar10.f16576j;
                    fcVar2.mo10676c(fgVar6.f16491f, fgVar6.f16487b.f16491f, 0, i3);
                    fcVar2.mo10676c(fhVar10.f16578l.f16491f, fhVar10.f16576j.f16491f, 0, i3);
                } else {
                    if (fhVar11 == null) {
                        fhVar11 = fhVar10;
                    }
                    if (!(fhVar12 == null || fhVar12 == fhVar10)) {
                        fhVar12.f16563ac = fhVar10;
                    }
                    fhVar12 = fhVar10;
                }
                if (fhVar10.f16544K != 8) {
                    if (fhVar10.f16565ae == 3) {
                        if (fhVar10.f16564ad == 3) {
                            zArr[0] = false;
                        }
                        if (fhVar10.f16587u <= 0.0f) {
                            zArr[0] = false;
                            int i7 = i5 + 1;
                            C0986fh[] fhVarArr3 = this.f16628ap;
                            int length2 = fhVarArr3.length;
                            if (i7 >= length2) {
                                this.f16628ap = (C0986fh[]) Arrays.copyOf(fhVarArr3, length2 + length2);
                            }
                            this.f16628ap[i5] = fhVar10;
                            i5 = i7;
                        }
                    }
                }
                C0986fh fhVar14 = fhVar10.f16578l.f16487b.f16486a;
                C0985fg fgVar7 = fhVar14.f16576j.f16487b;
                if (!(fgVar7 == null || fgVar7.f16486a != fhVar10 || fhVar14 == fhVar10)) {
                    fhVar13 = fhVar14;
                    fhVar10 = fhVar13;
                    i3 = 5;
                }
            }
            C0985fg fgVar8 = fhVar10.f16578l.f16487b;
            if (!(fgVar8 == null || fgVar8.f16486a == this)) {
                z = false;
            }
            if (fhVar4.f16576j.f16487b == null || fhVar13.f16578l.f16487b == null) {
                c = 1;
                zArr[1] = true;
            } else {
                c = 1;
            }
            fhVar4.f16558Y = z;
            fhVar13.f16563ac = null;
            fhVarArr[0] = fhVar4;
            fhVarArr[2] = fhVar11;
            fhVarArr[c] = fhVar13;
            fhVarArr[3] = fhVar12;
        }
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:168:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x02ec A[SYNTHETIC] */
    /* renamed from: c */
    private final void m11724c(C0981fc fcVar) {
        int i;
        C0986fh fhVar;
        boolean z;
        C0986fh fhVar2;
        C0986fh fhVar3;
        C0983fe feVar;
        C0983fe feVar2;
        boolean z2;
        int i2;
        C0986fh fhVar4;
        C0986fh fhVar5;
        C0983fe feVar3;
        C0986fh fhVar6;
        C0986fh fhVar7;
        C0983fe feVar4;
        int i3;
        int i4;
        C0985fg fgVar;
        C0985fg fgVar2;
        C0985fg fgVar3;
        C0985fg fgVar4;
        C0986fh fhVar8;
        int i5;
        C0985fg fgVar5;
        C0985fg fgVar6;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f;
        int i11;
        int i12;
        C0985fg fgVar7;
        float f2;
        C0985fg fgVar8;
        int i13;
        int i14;
        C0981fc fcVar2 = fcVar;
        char c = 0;
        int i15 = 0;
        while (i15 < this.f16626an) {
            C0986fh fhVar9 = this.f16630ar[i15];
            int a = m11723a(fcVar, this.f16632at, fhVar9, 0, this.f16631as);
            int i16 = 2;
            C0986fh fhVar10 = this.f16632at[2];
            if (fhVar10 != null) {
                boolean[] zArr = this.f16631as;
                int i17 = 1;
                if (zArr[1]) {
                    int g = fhVar9.mo10825g();
                    while (fhVar10 != null) {
                        fcVar2.mo10670a(fhVar10.f16575i.f16491f, g);
                        C0986fh fhVar11 = fhVar10.f16562ab;
                        g += fhVar10.f16575i.mo10793a() + fhVar10.mo10816c() + fhVar10.f16577k.mo10793a();
                        fhVar10 = fhVar11;
                    }
                    i = i15;
                } else {
                    int i18 = fhVar9.f16555V;
                    int i19 = this.f16564ad;
                    int i20 = this.f16622ai;
                    int i21 = 8;
                    float f3 = 0.0f;
                    int i22 = 3;
                    if (!(i20 == 2 || i20 == 8) || !zArr[c] || !fhVar9.f16557X || i18 == 2 || i19 == 2 || i18 != 0) {
                        if (a != 0) {
                            if (i18 != 2) {
                                C0986fh fhVar12 = fhVar9;
                                i = i15;
                                char c2 = 3;
                                C0986fh fhVar13 = null;
                                while (fhVar10 != null) {
                                    if (fhVar10.f16564ad != 3) {
                                        int a2 = fhVar10.f16575i.mo10793a();
                                        if (fhVar13 != null) {
                                            a2 += fhVar13.f16577k.mo10793a();
                                        }
                                        C0985fg fgVar9 = fhVar10.f16575i;
                                        C0985fg fgVar10 = fgVar9.f16487b;
                                        if (fgVar10.f16486a.f16564ad == 3) {
                                            i8 = 2;
                                        } else {
                                            i8 = 3;
                                        }
                                        fcVar2.mo10672a(fgVar9.f16491f, fgVar10.f16491f, a2, i8);
                                        int a3 = fhVar10.f16577k.mo10793a();
                                        C0985fg fgVar11 = fhVar10.f16577k.f16487b.f16486a.f16575i;
                                        C0985fg fgVar12 = fgVar11.f16487b;
                                        if (fgVar12 != null && fgVar12.f16486a == fhVar10) {
                                            a3 += fgVar11.mo10793a();
                                        }
                                        C0985fg fgVar13 = fhVar10.f16577k;
                                        C0985fg fgVar14 = fgVar13.f16487b;
                                        if (fgVar14.f16486a.f16564ad == 3) {
                                            i9 = 2;
                                        } else {
                                            i9 = 3;
                                        }
                                        fcVar2.mo10674b(fgVar13.f16491f, fgVar14.f16491f, -a3, i9);
                                    } else {
                                        f3 += fhVar10.f16559Z;
                                        C0985fg fgVar15 = fhVar10.f16577k;
                                        if (fgVar15.f16487b != null) {
                                            i7 = fgVar15.mo10793a();
                                            if (fhVar10 != this.f16632at[3]) {
                                                i7 += fhVar10.f16577k.f16487b.f16486a.f16575i.mo10793a();
                                            }
                                        } else {
                                            i7 = 0;
                                        }
                                        fcVar2.mo10672a(fhVar10.f16577k.f16491f, fhVar10.f16575i.f16491f, 0, 1);
                                        C0985fg fgVar16 = fhVar10.f16577k;
                                        fcVar2.mo10674b(fgVar16.f16491f, fgVar16.f16487b.f16491f, -i7, 1);
                                    }
                                    fhVar13 = fhVar10;
                                    fhVar10 = fhVar10.f16562ab;
                                }
                                if (a != 1) {
                                    int i23 = 0;
                                    while (true) {
                                        int i24 = a - 1;
                                        if (i23 >= i24) {
                                            break;
                                        }
                                        C0986fh[] fhVarArr = this.f16628ap;
                                        C0986fh fhVar14 = fhVarArr[i23];
                                        i23++;
                                        C0986fh fhVar15 = fhVarArr[i23];
                                        C0985fg fgVar17 = fhVar14.f16575i;
                                        C0983fe feVar5 = fgVar17.f16491f;
                                        C0983fe feVar6 = fhVar14.f16577k.f16491f;
                                        C0983fe feVar7 = fhVar15.f16575i.f16491f;
                                        C0983fe feVar8 = fhVar15.f16577k.f16491f;
                                        C0986fh[] fhVarArr2 = this.f16632at;
                                        int i25 = a;
                                        C0983fe feVar9 = fhVar15 == fhVarArr2[c2] ? fhVarArr2[1].f16577k.f16491f : feVar8;
                                        int a4 = fgVar17.mo10793a();
                                        C0985fg fgVar18 = fhVar14.f16575i.f16487b;
                                        if (!(fgVar18 == null || (fgVar6 = (fgVar5 = fgVar18.f16486a.f16577k).f16487b) == null || fgVar6.f16486a != fhVar14)) {
                                            a4 += fgVar5.mo10793a();
                                        }
                                        fcVar2.mo10672a(feVar5, fhVar14.f16575i.f16487b.f16491f, a4, 2);
                                        int a5 = fhVar14.f16577k.mo10793a();
                                        if (!(fhVar14.f16577k.f16487b == null || (fhVar8 = fhVar14.f16562ab) == null)) {
                                            C0985fg fgVar19 = fhVar8.f16575i;
                                            if (fgVar19.f16487b != null) {
                                                i5 = fgVar19.mo10793a();
                                            } else {
                                                i5 = 0;
                                            }
                                            a5 += i5;
                                        }
                                        fcVar2.mo10674b(feVar6, fhVar14.f16577k.f16487b.f16491f, -a5, 2);
                                        if (i23 == i24) {
                                            int a6 = fhVar15.f16575i.mo10793a();
                                            C0985fg fgVar20 = fhVar15.f16575i.f16487b;
                                            if (!(fgVar20 == null || (fgVar4 = (fgVar3 = fgVar20.f16486a.f16577k).f16487b) == null || fgVar4.f16486a != fhVar15)) {
                                                a6 += fgVar3.mo10793a();
                                            }
                                            fcVar2.mo10672a(feVar7, fhVar15.f16575i.f16487b.f16491f, a6, 2);
                                            C0985fg fgVar21 = fhVar15.f16577k;
                                            C0986fh[] fhVarArr3 = this.f16632at;
                                            if (fhVar15 == fhVarArr3[c2]) {
                                                fgVar21 = fhVarArr3[1].f16577k;
                                            }
                                            int a7 = fgVar21.mo10793a();
                                            C0985fg fgVar22 = fgVar21.f16487b;
                                            if (!(fgVar22 == null || (fgVar2 = (fgVar = fgVar22.f16486a.f16575i).f16487b) == null || fgVar2.f16486a != fhVar15)) {
                                                a7 += fgVar.mo10793a();
                                            }
                                            i4 = 2;
                                            fcVar2.mo10674b(feVar9, fgVar21.f16487b.f16491f, -a7, 2);
                                        } else {
                                            i4 = 2;
                                        }
                                        int i26 = fhVar12.f16572f;
                                        if (i26 > 0) {
                                            fcVar2.mo10674b(feVar6, feVar5, i26, i4);
                                        }
                                        C0977ez b = fcVar.mo10673b();
                                        b.mo10606a(fhVar14.f16559Z, f3, fhVar15.f16559Z, feVar5, fhVar14.f16575i.mo10793a(), feVar6, fhVar14.f16577k.mo10793a(), feVar7, fhVar15.f16575i.mo10793a(), feVar9, fhVar15.f16577k.mo10793a());
                                        fcVar2.mo10667a(b);
                                        a = i25;
                                        c2 = 3;
                                    }
                                } else {
                                    C0986fh fhVar16 = this.f16628ap[0];
                                    int a8 = fhVar16.f16575i.mo10793a();
                                    C0985fg fgVar23 = fhVar16.f16575i.f16487b;
                                    if (fgVar23 != null) {
                                        a8 += fgVar23.mo10793a();
                                    }
                                    int a9 = fhVar16.f16577k.mo10793a();
                                    C0985fg fgVar24 = fhVar16.f16577k.f16487b;
                                    if (fgVar24 != null) {
                                        a9 += fgVar24.mo10793a();
                                    }
                                    C0983fe feVar10 = fhVar12.f16577k.f16487b.f16491f;
                                    C0986fh[] fhVarArr4 = this.f16632at;
                                    if (fhVar16 == fhVarArr4[3]) {
                                        i6 = 1;
                                        feVar10 = fhVarArr4[1].f16577k.f16487b.f16491f;
                                    } else {
                                        i6 = 1;
                                    }
                                    if (fhVar16.f16569c == i6) {
                                        C0985fg fgVar25 = fhVar12.f16575i;
                                        fcVar2.mo10672a(fgVar25.f16491f, fgVar25.f16487b.f16491f, a8, i6);
                                        fcVar2.mo10674b(fhVar12.f16577k.f16491f, feVar10, -a9, i6);
                                        fcVar2.mo10676c(fhVar12.f16577k.f16491f, fhVar12.f16575i.f16491f, fhVar12.mo10816c(), 2);
                                    } else {
                                        C0985fg fgVar26 = fhVar16.f16575i;
                                        fcVar2.mo10676c(fgVar26.f16491f, fgVar26.f16487b.f16491f, a8, 1);
                                        fcVar2.mo10676c(fhVar16.f16577k.f16491f, feVar10, -a9, 1);
                                    }
                                }
                            } else {
                                fhVar3 = fhVar10;
                                fhVar2 = null;
                                fhVar = null;
                                z = false;
                            }
                        } else {
                            fhVar3 = fhVar10;
                            fhVar2 = null;
                            fhVar = null;
                            z = false;
                        }
                        while (fhVar3 != null) {
                            C0986fh fhVar17 = fhVar3.f16562ab;
                            if (fhVar17 == null) {
                                fhVar2 = this.f16632at[i17];
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i18 == i16) {
                                C0985fg fgVar27 = fhVar3.f16575i;
                                int a10 = fgVar27.mo10793a();
                                if (fhVar != null) {
                                    a10 += fhVar.f16577k.mo10793a();
                                }
                                if (fhVar10 != fhVar3) {
                                    i3 = 3;
                                } else {
                                    i3 = 1;
                                }
                                fcVar2.mo10672a(fgVar27.f16491f, fgVar27.f16487b.f16491f, a10, i3);
                                if (fhVar3.f16564ad == i22) {
                                    C0985fg fgVar28 = fhVar3.f16577k;
                                    if (fhVar3.f16569c == i17) {
                                        fcVar2.mo10676c(fgVar28.f16491f, fgVar27.f16491f, Math.max(fhVar3.f16571e, fhVar3.mo10816c()), i22);
                                    } else {
                                        fcVar2.mo10672a(fgVar27.f16491f, fgVar27.f16487b.f16491f, fgVar27.f16488c, i22);
                                        fcVar2.mo10674b(fgVar28.f16491f, fgVar27.f16491f, fhVar3.f16571e, i22);
                                    }
                                }
                            } else if (i18 != 0 && z2 && fhVar != null) {
                                C0985fg fgVar29 = fhVar3.f16577k;
                                if (fgVar29.f16487b == null) {
                                    fcVar2.mo10670a(fgVar29.f16491f, fhVar3.mo10825g() + fhVar3.f16591y);
                                } else {
                                    fcVar2.mo10676c(fhVar3.f16577k.f16491f, fhVar2.f16577k.f16487b.f16491f, -fgVar29.mo10793a(), 5);
                                }
                            } else if (i18 != 0 && !z2 && fhVar == null) {
                                C0985fg fgVar30 = fhVar3.f16575i;
                                if (fgVar30.f16487b == null) {
                                    fcVar2.mo10670a(fgVar30.f16491f, fhVar3.mo10825g());
                                } else {
                                    fcVar2.mo10676c(fhVar3.f16575i.f16491f, fhVar9.f16575i.f16487b.f16491f, fgVar30.mo10793a(), 5);
                                }
                            } else {
                                C0985fg fgVar31 = fhVar3.f16575i;
                                C0985fg fgVar32 = fhVar3.f16577k;
                                int a11 = fgVar31.mo10793a();
                                int a12 = fgVar32.mo10793a();
                                fhVar4 = fhVar3;
                                fcVar2.mo10672a(fgVar31.f16491f, fgVar31.f16487b.f16491f, a11, i17);
                                i2 = i15;
                                fcVar2.mo10674b(fgVar32.f16491f, fgVar32.f16487b.f16491f, -a12, i17);
                                C0985fg fgVar33 = fgVar31.f16487b;
                                if (fgVar33 != null) {
                                    feVar3 = fgVar33.f16491f;
                                } else {
                                    feVar3 = null;
                                }
                                if (fhVar == null) {
                                    C0985fg fgVar34 = fhVar9.f16575i.f16487b;
                                    if (fgVar34 != null) {
                                        feVar3 = fgVar34.f16491f;
                                    } else {
                                        feVar3 = null;
                                    }
                                }
                                if (fhVar17 == null) {
                                    C0985fg fgVar35 = fhVar2.f16577k.f16487b;
                                    fhVar6 = fgVar35 != null ? fgVar35.f16486a : null;
                                } else {
                                    fhVar6 = fhVar17;
                                }
                                if (fhVar6 != null) {
                                    C0983fe feVar11 = fhVar6.f16575i.f16491f;
                                    if (z2) {
                                        C0985fg fgVar36 = fhVar2.f16577k.f16487b;
                                        if (fgVar36 != null) {
                                            feVar4 = fgVar36.f16491f;
                                        } else {
                                            feVar4 = null;
                                        }
                                    } else {
                                        feVar4 = feVar11;
                                    }
                                    if (feVar3 == null) {
                                        fhVar5 = fhVar9;
                                        fhVar7 = fhVar6;
                                    } else if (feVar4 != null) {
                                        fhVar5 = fhVar9;
                                        fhVar7 = fhVar6;
                                        fcVar.mo10671a(fgVar31.f16491f, feVar3, a11, 0.5f, feVar4, fgVar32.f16491f, a12);
                                    }
                                    fhVar17 = fhVar7;
                                    if (z2) {
                                        fhVar17 = null;
                                    }
                                    fhVar9 = fhVar5;
                                    fhVar3 = fhVar17;
                                    z = z2;
                                    fhVar = fhVar4;
                                    i15 = i2;
                                    i16 = 2;
                                    i17 = 1;
                                    i22 = 3;
                                }
                                fhVar5 = fhVar9;
                                fhVar7 = fhVar6;
                                fhVar17 = fhVar7;
                                if (z2) {
                                }
                                fhVar9 = fhVar5;
                                fhVar3 = fhVar17;
                                z = z2;
                                fhVar = fhVar4;
                                i15 = i2;
                                i16 = 2;
                                i17 = 1;
                                i22 = 3;
                            }
                            fhVar4 = fhVar3;
                            fhVar5 = fhVar9;
                            i2 = i15;
                            if (z2) {
                            }
                            fhVar9 = fhVar5;
                            fhVar3 = fhVar17;
                            z = z2;
                            fhVar = fhVar4;
                            i15 = i2;
                            i16 = 2;
                            i17 = 1;
                            i22 = 3;
                        }
                        C0986fh fhVar18 = fhVar9;
                        i = i15;
                        if (i18 == 2) {
                            C0985fg fgVar37 = fhVar10.f16575i;
                            C0985fg fgVar38 = fhVar2.f16577k;
                            int a13 = fgVar37.mo10793a();
                            int a14 = fgVar38.mo10793a();
                            C0985fg fgVar39 = fhVar18.f16575i.f16487b;
                            if (fgVar39 != null) {
                                feVar = fgVar39.f16491f;
                            } else {
                                feVar = null;
                            }
                            C0985fg fgVar40 = fhVar2.f16577k.f16487b;
                            if (fgVar40 != null) {
                                feVar2 = fgVar40.f16491f;
                            } else {
                                feVar2 = null;
                            }
                            if (feVar != null && feVar2 != null) {
                                fcVar2.mo10674b(fgVar38.f16491f, feVar2, -a14, 1);
                                fcVar.mo10671a(fgVar37.f16491f, feVar, a13, fhVar18.f16541H, feVar2, fgVar38.f16491f, a14);
                            }
                        }
                    } else {
                        C0986fh fhVar19 = fhVar9;
                        C0986fh fhVar20 = null;
                        float f4 = 0.0f;
                        int i27 = 0;
                        int i28 = 0;
                        while (fhVar19 != null) {
                            if (fhVar19.f16544K != 8) {
                                i27++;
                                if (fhVar19.f16564ad != 3) {
                                    int c3 = i28 + fhVar19.mo10816c();
                                    C0985fg fgVar41 = fhVar19.f16575i;
                                    if (fgVar41.f16487b != null) {
                                        i13 = fgVar41.mo10793a();
                                    } else {
                                        i13 = 0;
                                    }
                                    int i29 = c3 + i13;
                                    C0985fg fgVar42 = fhVar19.f16577k;
                                    if (fgVar42.f16487b != null) {
                                        i14 = fgVar42.mo10793a();
                                    } else {
                                        i14 = 0;
                                    }
                                    i28 = i29 + i14;
                                } else {
                                    f4 += fhVar19.f16559Z;
                                }
                            }
                            C0985fg fgVar43 = fhVar19.f16577k.f16487b;
                            C0986fh fhVar21 = fgVar43 != null ? fgVar43.f16486a : null;
                            if (fhVar21 != null && ((fgVar8 = fhVar21.f16575i.f16487b) == null || fgVar8.f16486a != fhVar19)) {
                                fhVar21 = null;
                            }
                            fhVar20 = fhVar19;
                            fhVar19 = fhVar21;
                        }
                        if (fhVar20 != null) {
                            C0985fg fgVar44 = fhVar20.f16577k.f16487b;
                            i10 = fgVar44 != null ? fgVar44.f16486a.f16589w : 0;
                            if (fgVar44 != null && fgVar44.f16486a == this) {
                                i10 = mo10828i();
                            }
                        } else {
                            i10 = 0;
                        }
                        float f5 = ((float) i10) - ((float) i28);
                        float f6 = f5 / ((float) (i27 + 1));
                        if (a != 0) {
                            f = f5 / ((float) a);
                            f6 = 0.0f;
                        } else {
                            f = f6;
                        }
                        while (fhVar9 != null) {
                            C0985fg fgVar45 = fhVar9.f16575i;
                            if (fgVar45.f16487b != null) {
                                i11 = fgVar45.mo10793a();
                            } else {
                                i11 = 0;
                            }
                            C0985fg fgVar46 = fhVar9.f16577k;
                            if (fgVar46.f16487b != null) {
                                i12 = fgVar46.mo10793a();
                            } else {
                                i12 = 0;
                            }
                            if (fhVar9.f16544K != i21) {
                                float f7 = (float) i11;
                                float f8 = f6 + f7;
                                fcVar2.mo10670a(fhVar9.f16575i.f16491f, (int) (f8 + 0.5f));
                                if (fhVar9.f16564ad != 3) {
                                    f2 = f8 + ((float) fhVar9.mo10816c());
                                } else {
                                    f2 = f4 != 0.0f ? f8 + ((((fhVar9.f16559Z * f5) / f4) - f7) - ((float) i12)) : f8 + ((f - f7) - ((float) i12));
                                }
                                fcVar2.mo10670a(fhVar9.f16577k.f16491f, (int) (f2 + 0.5f));
                                if (a == 0) {
                                    f2 += f;
                                }
                                f6 = f2 + ((float) i12);
                            } else {
                                int i30 = (int) ((f6 - (f / 2.0f)) + 0.5f);
                                fcVar2.mo10670a(fhVar9.f16575i.f16491f, i30);
                                fcVar2.mo10670a(fhVar9.f16577k.f16491f, i30);
                            }
                            C0985fg fgVar47 = fhVar9.f16577k.f16487b;
                            C0986fh fhVar22 = fgVar47 != null ? fgVar47.f16486a : null;
                            fhVar9 = (fhVar22 == null || (fgVar7 = fhVar22.f16575i.f16487b) == null || fgVar7.f16486a == fhVar9) ? fhVar22 : null;
                            if (fhVar9 == this) {
                                fhVar9 = null;
                            }
                            i21 = 8;
                        }
                        i = i15;
                    }
                }
            } else {
                i = i15;
            }
            i15 = i + 1;
            c = 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:178:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x0308 A[SYNTHETIC] */
    /* renamed from: d */
    private final void m11725d(C0981fc fcVar) {
        int i;
        C0986fh fhVar;
        boolean z;
        C0986fh fhVar2;
        C0986fh fhVar3;
        C0983fe feVar;
        C0983fe feVar2;
        boolean z2;
        int i2;
        C0986fh fhVar4;
        C0986fh fhVar5;
        C0983fe feVar3;
        C0986fh fhVar6;
        C0986fh fhVar7;
        C0983fe feVar4;
        int i3;
        C0983fe feVar5;
        C0983fe feVar6;
        int i4;
        C0985fg fgVar;
        C0985fg fgVar2;
        C0985fg fgVar3;
        C0985fg fgVar4;
        C0986fh fhVar8;
        int i5;
        C0985fg fgVar5;
        C0985fg fgVar6;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f;
        int i11;
        int i12;
        C0985fg fgVar7;
        float f2;
        C0985fg fgVar8;
        int i13;
        int i14;
        C0981fc fcVar2 = fcVar;
        char c = 0;
        int i15 = 0;
        while (i15 < this.f16627ao) {
            C0986fh fhVar9 = this.f16629aq[i15];
            int a = m11723a(fcVar, this.f16632at, fhVar9, 1, this.f16631as);
            int i16 = 2;
            C0986fh fhVar10 = this.f16632at[2];
            if (fhVar10 != null) {
                boolean[] zArr = this.f16631as;
                int i17 = 1;
                if (zArr[1]) {
                    int h = fhVar9.mo10827h();
                    while (fhVar10 != null) {
                        fcVar2.mo10670a(fhVar10.f16576j.f16491f, h);
                        C0986fh fhVar11 = fhVar10.f16563ac;
                        h += fhVar10.f16576j.mo10793a() + fhVar10.mo10823f() + fhVar10.f16578l.mo10793a();
                        fhVar10 = fhVar11;
                    }
                    i = i15;
                } else {
                    int i18 = fhVar9.f16556W;
                    int i19 = this.f16565ae;
                    int i20 = this.f16622ai;
                    int i21 = 8;
                    float f3 = 0.0f;
                    int i22 = 3;
                    if (!(i20 == 2 || i20 == 8) || !zArr[c] || !fhVar9.f16558Y || i18 == 2 || i19 == 2 || i18 != 0) {
                        if (a != 0) {
                            if (i18 != 2) {
                                C0986fh fhVar12 = fhVar9;
                                i = i15;
                                char c2 = 3;
                                C0986fh fhVar13 = null;
                                while (fhVar10 != null) {
                                    if (fhVar10.f16565ae != 3) {
                                        int a2 = fhVar10.f16576j.mo10793a();
                                        if (fhVar13 != null) {
                                            a2 += fhVar13.f16578l.mo10793a();
                                        }
                                        C0985fg fgVar9 = fhVar10.f16576j;
                                        C0985fg fgVar10 = fgVar9.f16487b;
                                        if (fgVar10.f16486a.f16565ae == 3) {
                                            i8 = 2;
                                        } else {
                                            i8 = 3;
                                        }
                                        fcVar2.mo10672a(fgVar9.f16491f, fgVar10.f16491f, a2, i8);
                                        int a3 = fhVar10.f16578l.mo10793a();
                                        C0985fg fgVar11 = fhVar10.f16578l.f16487b.f16486a.f16576j;
                                        C0985fg fgVar12 = fgVar11.f16487b;
                                        if (fgVar12 != null && fgVar12.f16486a == fhVar10) {
                                            a3 += fgVar11.mo10793a();
                                        }
                                        C0985fg fgVar13 = fhVar10.f16578l;
                                        C0985fg fgVar14 = fgVar13.f16487b;
                                        if (fgVar14.f16486a.f16565ae == 3) {
                                            i9 = 2;
                                        } else {
                                            i9 = 3;
                                        }
                                        fcVar2.mo10674b(fgVar13.f16491f, fgVar14.f16491f, -a3, i9);
                                    } else {
                                        f3 += fhVar10.f16561aa;
                                        C0985fg fgVar15 = fhVar10.f16578l;
                                        if (fgVar15.f16487b != null) {
                                            i7 = fgVar15.mo10793a();
                                            if (fhVar10 != this.f16632at[3]) {
                                                i7 += fhVar10.f16578l.f16487b.f16486a.f16576j.mo10793a();
                                            }
                                        } else {
                                            i7 = 0;
                                        }
                                        fcVar2.mo10672a(fhVar10.f16578l.f16491f, fhVar10.f16576j.f16491f, 0, 1);
                                        C0985fg fgVar16 = fhVar10.f16578l;
                                        fcVar2.mo10674b(fgVar16.f16491f, fgVar16.f16487b.f16491f, -i7, 1);
                                    }
                                    fhVar13 = fhVar10;
                                    fhVar10 = fhVar10.f16563ac;
                                }
                                if (a != 1) {
                                    int i23 = 0;
                                    while (true) {
                                        int i24 = a - 1;
                                        if (i23 >= i24) {
                                            break;
                                        }
                                        C0986fh[] fhVarArr = this.f16628ap;
                                        C0986fh fhVar14 = fhVarArr[i23];
                                        i23++;
                                        C0986fh fhVar15 = fhVarArr[i23];
                                        C0985fg fgVar17 = fhVar14.f16576j;
                                        C0983fe feVar7 = fgVar17.f16491f;
                                        C0983fe feVar8 = fhVar14.f16578l.f16491f;
                                        C0983fe feVar9 = fhVar15.f16576j.f16491f;
                                        C0983fe feVar10 = fhVar15.f16578l.f16491f;
                                        C0986fh[] fhVarArr2 = this.f16632at;
                                        int i25 = a;
                                        C0983fe feVar11 = fhVar15 == fhVarArr2[c2] ? fhVarArr2[1].f16578l.f16491f : feVar10;
                                        int a4 = fgVar17.mo10793a();
                                        C0985fg fgVar18 = fhVar14.f16576j.f16487b;
                                        if (!(fgVar18 == null || (fgVar6 = (fgVar5 = fgVar18.f16486a.f16578l).f16487b) == null || fgVar6.f16486a != fhVar14)) {
                                            a4 += fgVar5.mo10793a();
                                        }
                                        fcVar2.mo10672a(feVar7, fhVar14.f16576j.f16487b.f16491f, a4, 2);
                                        int a5 = fhVar14.f16578l.mo10793a();
                                        if (!(fhVar14.f16578l.f16487b == null || (fhVar8 = fhVar14.f16563ac) == null)) {
                                            C0985fg fgVar19 = fhVar8.f16576j;
                                            if (fgVar19.f16487b != null) {
                                                i5 = fgVar19.mo10793a();
                                            } else {
                                                i5 = 0;
                                            }
                                            a5 += i5;
                                        }
                                        fcVar2.mo10674b(feVar8, fhVar14.f16578l.f16487b.f16491f, -a5, 2);
                                        if (i23 == i24) {
                                            int a6 = fhVar15.f16576j.mo10793a();
                                            C0985fg fgVar20 = fhVar15.f16576j.f16487b;
                                            if (!(fgVar20 == null || (fgVar4 = (fgVar3 = fgVar20.f16486a.f16578l).f16487b) == null || fgVar4.f16486a != fhVar15)) {
                                                a6 += fgVar3.mo10793a();
                                            }
                                            fcVar2.mo10672a(feVar9, fhVar15.f16576j.f16487b.f16491f, a6, 2);
                                            C0985fg fgVar21 = fhVar15.f16578l;
                                            C0986fh[] fhVarArr3 = this.f16632at;
                                            if (fhVar15 == fhVarArr3[c2]) {
                                                fgVar21 = fhVarArr3[1].f16578l;
                                            }
                                            int a7 = fgVar21.mo10793a();
                                            C0985fg fgVar22 = fgVar21.f16487b;
                                            if (!(fgVar22 == null || (fgVar2 = (fgVar = fgVar22.f16486a.f16576j).f16487b) == null || fgVar2.f16486a != fhVar15)) {
                                                a7 += fgVar.mo10793a();
                                            }
                                            i4 = 2;
                                            fcVar2.mo10674b(feVar11, fgVar21.f16487b.f16491f, -a7, 2);
                                        } else {
                                            i4 = 2;
                                        }
                                        int i26 = fhVar12.f16574h;
                                        if (i26 > 0) {
                                            fcVar2.mo10674b(feVar8, feVar7, i26, i4);
                                        }
                                        C0977ez b = fcVar.mo10673b();
                                        b.mo10606a(fhVar14.f16561aa, f3, fhVar15.f16561aa, feVar7, fhVar14.f16576j.mo10793a(), feVar8, fhVar14.f16578l.mo10793a(), feVar9, fhVar15.f16576j.mo10793a(), feVar11, fhVar15.f16578l.mo10793a());
                                        fcVar2.mo10667a(b);
                                        a = i25;
                                        c2 = 3;
                                    }
                                } else {
                                    C0986fh fhVar16 = this.f16628ap[0];
                                    int a8 = fhVar16.f16576j.mo10793a();
                                    C0985fg fgVar23 = fhVar16.f16576j.f16487b;
                                    if (fgVar23 != null) {
                                        a8 += fgVar23.mo10793a();
                                    }
                                    int a9 = fhVar16.f16578l.mo10793a();
                                    C0985fg fgVar24 = fhVar16.f16578l.f16487b;
                                    if (fgVar24 != null) {
                                        a9 += fgVar24.mo10793a();
                                    }
                                    C0983fe feVar12 = fhVar12.f16578l.f16487b.f16491f;
                                    C0986fh[] fhVarArr4 = this.f16632at;
                                    if (fhVar16 == fhVarArr4[3]) {
                                        i6 = 1;
                                        feVar12 = fhVarArr4[1].f16578l.f16487b.f16491f;
                                    } else {
                                        i6 = 1;
                                    }
                                    if (fhVar16.f16570d == i6) {
                                        C0985fg fgVar25 = fhVar12.f16576j;
                                        fcVar2.mo10672a(fgVar25.f16491f, fgVar25.f16487b.f16491f, a8, i6);
                                        fcVar2.mo10674b(fhVar12.f16578l.f16491f, feVar12, -a9, i6);
                                        fcVar2.mo10676c(fhVar12.f16578l.f16491f, fhVar12.f16576j.f16491f, fhVar12.mo10823f(), 2);
                                    } else {
                                        C0985fg fgVar26 = fhVar16.f16576j;
                                        fcVar2.mo10676c(fgVar26.f16491f, fgVar26.f16487b.f16491f, a8, 1);
                                        fcVar2.mo10676c(fhVar16.f16578l.f16491f, feVar12, -a9, 1);
                                    }
                                }
                            } else {
                                fhVar3 = fhVar10;
                                fhVar2 = null;
                                fhVar = null;
                                z = false;
                            }
                        } else {
                            fhVar3 = fhVar10;
                            fhVar2 = null;
                            fhVar = null;
                            z = false;
                        }
                        while (fhVar3 != null) {
                            C0986fh fhVar17 = fhVar3.f16563ac;
                            if (fhVar17 == null) {
                                fhVar2 = this.f16632at[i17];
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i18 == i16) {
                                C0985fg fgVar27 = fhVar3.f16576j;
                                int a10 = fgVar27.mo10793a();
                                if (fhVar != null) {
                                    a10 += fhVar.f16578l.mo10793a();
                                }
                                if (fhVar10 != fhVar3) {
                                    i3 = 3;
                                } else {
                                    i3 = 1;
                                }
                                C0985fg fgVar28 = fgVar27.f16487b;
                                if (fgVar28 != null) {
                                    feVar6 = fgVar27.f16491f;
                                    feVar5 = fgVar28.f16491f;
                                } else {
                                    C0985fg fgVar29 = fhVar3.f16579m;
                                    C0985fg fgVar30 = fgVar29.f16487b;
                                    if (fgVar30 != null) {
                                        feVar6 = fgVar29.f16491f;
                                        feVar5 = fgVar30.f16491f;
                                        a10 -= fgVar27.mo10793a();
                                    } else {
                                        feVar6 = null;
                                        feVar5 = null;
                                    }
                                }
                                if (!(feVar6 == null || feVar5 == null)) {
                                    fcVar2.mo10672a(feVar6, feVar5, a10, i3);
                                }
                                if (fhVar3.f16565ae == i22) {
                                    C0985fg fgVar31 = fhVar3.f16578l;
                                    if (fhVar3.f16570d == i17) {
                                        fcVar2.mo10676c(fgVar31.f16491f, fgVar27.f16491f, Math.max(fhVar3.f16573g, fhVar3.mo10823f()), i22);
                                    } else {
                                        fcVar2.mo10672a(fgVar27.f16491f, fgVar27.f16487b.f16491f, fgVar27.f16488c, i22);
                                        fcVar2.mo10674b(fgVar31.f16491f, fgVar27.f16491f, fhVar3.f16573g, i22);
                                    }
                                }
                            } else if (i18 != 0 && z2 && fhVar != null) {
                                C0985fg fgVar32 = fhVar3.f16578l;
                                if (fgVar32.f16487b == null) {
                                    fcVar2.mo10670a(fgVar32.f16491f, fhVar3.mo10827h() + fhVar3.f16592z);
                                } else {
                                    fcVar2.mo10676c(fhVar3.f16578l.f16491f, fhVar2.f16578l.f16487b.f16491f, -fgVar32.mo10793a(), 5);
                                }
                            } else if (i18 != 0 && !z2 && fhVar == null) {
                                C0985fg fgVar33 = fhVar3.f16576j;
                                if (fgVar33.f16487b == null) {
                                    fcVar2.mo10670a(fgVar33.f16491f, fhVar3.mo10827h());
                                } else {
                                    fcVar2.mo10676c(fhVar3.f16576j.f16491f, fhVar9.f16576j.f16487b.f16491f, fgVar33.mo10793a(), 5);
                                }
                            } else {
                                C0985fg fgVar34 = fhVar3.f16576j;
                                C0985fg fgVar35 = fhVar3.f16578l;
                                int a11 = fgVar34.mo10793a();
                                int a12 = fgVar35.mo10793a();
                                fhVar4 = fhVar3;
                                fcVar2.mo10672a(fgVar34.f16491f, fgVar34.f16487b.f16491f, a11, i17);
                                i2 = i15;
                                fcVar2.mo10674b(fgVar35.f16491f, fgVar35.f16487b.f16491f, -a12, i17);
                                C0985fg fgVar36 = fgVar34.f16487b;
                                if (fgVar36 != null) {
                                    feVar3 = fgVar36.f16491f;
                                } else {
                                    feVar3 = null;
                                }
                                if (fhVar == null) {
                                    C0985fg fgVar37 = fhVar9.f16576j.f16487b;
                                    if (fgVar37 != null) {
                                        feVar3 = fgVar37.f16491f;
                                    } else {
                                        feVar3 = null;
                                    }
                                }
                                if (fhVar17 == null) {
                                    C0985fg fgVar38 = fhVar2.f16578l.f16487b;
                                    fhVar6 = fgVar38 != null ? fgVar38.f16486a : null;
                                } else {
                                    fhVar6 = fhVar17;
                                }
                                if (fhVar6 != null) {
                                    C0983fe feVar13 = fhVar6.f16576j.f16491f;
                                    if (z2) {
                                        C0985fg fgVar39 = fhVar2.f16578l.f16487b;
                                        if (fgVar39 != null) {
                                            feVar4 = fgVar39.f16491f;
                                        } else {
                                            feVar4 = null;
                                        }
                                    } else {
                                        feVar4 = feVar13;
                                    }
                                    if (feVar3 == null) {
                                        fhVar5 = fhVar9;
                                        fhVar7 = fhVar6;
                                    } else if (feVar4 != null) {
                                        fhVar5 = fhVar9;
                                        fhVar7 = fhVar6;
                                        fcVar.mo10671a(fgVar34.f16491f, feVar3, a11, 0.5f, feVar4, fgVar35.f16491f, a12);
                                    }
                                    fhVar17 = fhVar7;
                                    if (z2) {
                                        fhVar17 = null;
                                    }
                                    fhVar9 = fhVar5;
                                    fhVar3 = fhVar17;
                                    z = z2;
                                    fhVar = fhVar4;
                                    i15 = i2;
                                    i16 = 2;
                                    i17 = 1;
                                    i22 = 3;
                                }
                                fhVar5 = fhVar9;
                                fhVar7 = fhVar6;
                                fhVar17 = fhVar7;
                                if (z2) {
                                }
                                fhVar9 = fhVar5;
                                fhVar3 = fhVar17;
                                z = z2;
                                fhVar = fhVar4;
                                i15 = i2;
                                i16 = 2;
                                i17 = 1;
                                i22 = 3;
                            }
                            fhVar4 = fhVar3;
                            fhVar5 = fhVar9;
                            i2 = i15;
                            if (z2) {
                            }
                            fhVar9 = fhVar5;
                            fhVar3 = fhVar17;
                            z = z2;
                            fhVar = fhVar4;
                            i15 = i2;
                            i16 = 2;
                            i17 = 1;
                            i22 = 3;
                        }
                        C0986fh fhVar18 = fhVar9;
                        i = i15;
                        if (i18 == 2) {
                            C0985fg fgVar40 = fhVar10.f16576j;
                            C0985fg fgVar41 = fhVar2.f16578l;
                            int a13 = fgVar40.mo10793a();
                            int a14 = fgVar41.mo10793a();
                            C0985fg fgVar42 = fhVar18.f16576j.f16487b;
                            if (fgVar42 != null) {
                                feVar = fgVar42.f16491f;
                            } else {
                                feVar = null;
                            }
                            C0985fg fgVar43 = fhVar2.f16578l.f16487b;
                            if (fgVar43 != null) {
                                feVar2 = fgVar43.f16491f;
                            } else {
                                feVar2 = null;
                            }
                            if (feVar != null && feVar2 != null) {
                                fcVar2.mo10674b(fgVar41.f16491f, feVar2, -a14, 1);
                                fcVar.mo10671a(fgVar40.f16491f, feVar, a13, fhVar18.f16542I, feVar2, fgVar41.f16491f, a14);
                            }
                        }
                    } else {
                        C0986fh fhVar19 = fhVar9;
                        C0986fh fhVar20 = null;
                        float f4 = 0.0f;
                        int i27 = 0;
                        int i28 = 0;
                        while (fhVar19 != null) {
                            if (fhVar19.f16544K != 8) {
                                i27++;
                                if (fhVar19.f16565ae != 3) {
                                    int f5 = i28 + fhVar19.mo10823f();
                                    C0985fg fgVar44 = fhVar19.f16576j;
                                    if (fgVar44.f16487b != null) {
                                        i13 = fgVar44.mo10793a();
                                    } else {
                                        i13 = 0;
                                    }
                                    int i29 = f5 + i13;
                                    C0985fg fgVar45 = fhVar19.f16578l;
                                    if (fgVar45.f16487b != null) {
                                        i14 = fgVar45.mo10793a();
                                    } else {
                                        i14 = 0;
                                    }
                                    i28 = i29 + i14;
                                } else {
                                    f4 += fhVar19.f16561aa;
                                }
                            }
                            C0985fg fgVar46 = fhVar19.f16578l.f16487b;
                            C0986fh fhVar21 = fgVar46 != null ? fgVar46.f16486a : null;
                            if (fhVar21 != null && ((fgVar8 = fhVar21.f16576j.f16487b) == null || fgVar8.f16486a != fhVar19)) {
                                fhVar21 = null;
                            }
                            fhVar20 = fhVar19;
                            fhVar19 = fhVar21;
                        }
                        if (fhVar20 != null) {
                            C0985fg fgVar47 = fhVar20.f16578l.f16487b;
                            i10 = fgVar47 != null ? fgVar47.f16486a.f16589w : 0;
                            if (fgVar47 != null && fgVar47.f16486a == this) {
                                i10 = mo10829j();
                            }
                        } else {
                            i10 = 0;
                        }
                        float f6 = ((float) i10) - ((float) i28);
                        float f7 = f6 / ((float) (i27 + 1));
                        if (a != 0) {
                            f = f6 / ((float) a);
                            f7 = 0.0f;
                        } else {
                            f = f7;
                        }
                        while (fhVar9 != null) {
                            C0985fg fgVar48 = fhVar9.f16576j;
                            if (fgVar48.f16487b != null) {
                                i11 = fgVar48.mo10793a();
                            } else {
                                i11 = 0;
                            }
                            C0985fg fgVar49 = fhVar9.f16578l;
                            if (fgVar49.f16487b != null) {
                                i12 = fgVar49.mo10793a();
                            } else {
                                i12 = 0;
                            }
                            if (fhVar9.f16544K != i21) {
                                float f8 = (float) i11;
                                float f9 = f7 + f8;
                                fcVar2.mo10670a(fhVar9.f16576j.f16491f, (int) (f9 + 0.5f));
                                if (fhVar9.f16565ae != 3) {
                                    f2 = f9 + ((float) fhVar9.mo10823f());
                                } else {
                                    f2 = f4 != 0.0f ? f9 + ((((fhVar9.f16561aa * f6) / f4) - f8) - ((float) i12)) : f9 + ((f - f8) - ((float) i12));
                                }
                                fcVar2.mo10670a(fhVar9.f16578l.f16491f, (int) (f2 + 0.5f));
                                if (a == 0) {
                                    f2 += f;
                                }
                                f7 = f2 + ((float) i12);
                            } else {
                                int i30 = (int) ((f7 - (f / 2.0f)) + 0.5f);
                                fcVar2.mo10670a(fhVar9.f16576j.f16491f, i30);
                                fcVar2.mo10670a(fhVar9.f16578l.f16491f, i30);
                            }
                            C0985fg fgVar50 = fhVar9.f16578l.f16487b;
                            C0986fh fhVar22 = fgVar50 != null ? fgVar50.f16486a : null;
                            fhVar9 = (fhVar22 == null || (fgVar7 = fhVar22.f16576j.f16487b) == null || fgVar7.f16486a == fhVar9) ? fhVar22 : null;
                            if (fhVar9 == this) {
                                fhVar9 = null;
                            }
                            i21 = 8;
                        }
                        i = i15;
                    }
                }
            } else {
                i = i15;
            }
            i15 = i + 1;
            c = 0;
        }
    }

    /* renamed from: b */
    public final void mo10842b(C0986fh fhVar, boolean[] zArr) {
        C0986fh fhVar2;
        int i;
        C0985fg fgVar;
        C0985fg fgVar2;
        C0985fg fgVar3;
        boolean z;
        C0985fg fgVar4;
        C0985fg fgVar5;
        C0985fg fgVar6;
        C0986fh fhVar3;
        boolean z2 = false;
        r2 = 0;
        int i2 = 0;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        if (fhVar.f16565ae != 3 || fhVar.f16564ad == 3 || fhVar.f16587u <= 0.0f) {
            int e = fhVar.mo10821e();
            fhVar.f16554U = true;
            if (fhVar instanceof C0988fj) {
                C0988fj fjVar = (C0988fj) fhVar;
                if (fjVar.f16701ai == 0) {
                    e = fjVar.f16699ag;
                    if (e == -1) {
                        int i3 = fjVar.f16700ah;
                        if (i3 == -1) {
                            e = 0;
                        } else {
                            i2 = i3;
                            e = 0;
                        }
                    }
                } else {
                    i2 = e;
                }
            } else {
                C0985fg fgVar7 = fhVar.f16579m;
                if (fgVar7.f16487b == null && fhVar.f16576j.f16487b == null && fhVar.f16578l.f16487b == null) {
                    i2 = e;
                    e = fhVar.f16590x + e;
                } else {
                    C0985fg fgVar8 = fhVar.f16578l.f16487b;
                    if (fgVar8 != null && (fgVar6 = fhVar.f16576j.f16487b) != null && (fgVar8 == fgVar6 || ((fhVar3 = fgVar8.f16486a) == fgVar6.f16486a && fhVar3 != fhVar.f16584r))) {
                        zArr[0] = false;
                        return;
                    } else if (fgVar7.mo10796c()) {
                        C0986fh fhVar4 = fhVar.f16579m.f16487b.f16486a;
                        if (!fhVar4.f16554U) {
                            mo10842b(fhVar4, zArr);
                        }
                        int max = Math.max((fhVar4.f16545L - fhVar4.f16586t) + e, e);
                        int max2 = Math.max((fhVar4.f16548O - fhVar4.f16586t) + e, e);
                        if (fhVar.f16544K == 8) {
                            int i4 = fhVar.f16586t;
                            max -= i4;
                            max2 -= i4;
                        }
                        fhVar.f16545L = max;
                        fhVar.f16548O = max2;
                        return;
                    } else {
                        C0986fh fhVar5 = null;
                        if (fhVar.f16576j.mo10796c()) {
                            C0985fg fgVar9 = fhVar.f16576j;
                            fhVar2 = fgVar9.f16487b.f16486a;
                            i = fgVar9.mo10793a() + e;
                            if (!fhVar2.mo10815b() && !fhVar2.f16554U) {
                                mo10842b(fhVar2, zArr);
                            }
                        } else {
                            i = e;
                            fhVar2 = null;
                        }
                        if (fhVar.f16578l.mo10796c()) {
                            C0985fg fgVar10 = fhVar.f16578l;
                            C0986fh fhVar6 = fgVar10.f16487b.f16486a;
                            e += fgVar10.mo10793a();
                            if (!fhVar6.mo10815b() && !fhVar6.f16554U) {
                                mo10842b(fhVar6, zArr);
                            }
                            fhVar5 = fhVar6;
                        }
                        if (fhVar.f16576j.f16487b != null && !fhVar2.mo10815b()) {
                            int i5 = fhVar.f16576j.f16487b.f16492g;
                            if (i5 == 3) {
                                i += fhVar2.f16545L - fhVar2.mo10821e();
                            } else if (i5 == 5) {
                                i += fhVar2.f16545L;
                            }
                            if (!fhVar2.f16551R) {
                                C0985fg fgVar11 = fhVar2.f16576j.f16487b;
                                if (fgVar11 == null || fgVar11.f16486a == fhVar || (fgVar5 = fhVar2.f16578l.f16487b) == null || fgVar5.f16486a == fhVar) {
                                    z = false;
                                    fhVar.f16551R = z;
                                    if (z && ((fgVar4 = fhVar2.f16578l.f16487b) == null || fgVar4.f16486a != fhVar)) {
                                        i += i - fhVar2.f16545L;
                                    }
                                } else if (fhVar2.f16565ae == 3) {
                                    z = false;
                                    fhVar.f16551R = z;
                                    i += i - fhVar2.f16545L;
                                }
                            }
                            z = true;
                            fhVar.f16551R = z;
                            i += i - fhVar2.f16545L;
                        }
                        if (fhVar.f16578l.f16487b != null && !fhVar5.mo10815b()) {
                            int i6 = fhVar.f16578l.f16487b.f16492g;
                            if (i6 == 5) {
                                e += fhVar5.f16548O - fhVar5.mo10821e();
                            } else if (i6 == 3) {
                                e += fhVar5.f16548O;
                            }
                            if (fhVar5.f16552S || !((fgVar2 = fhVar5.f16576j.f16487b) == null || fgVar2.f16486a == fhVar || (fgVar3 = fhVar5.f16578l.f16487b) == null || fgVar3.f16486a == fhVar || fhVar5.f16565ae == 3)) {
                                z2 = true;
                            }
                            fhVar.f16552S = z2;
                            if (z2 && ((fgVar = fhVar5.f16576j.f16487b) == null || fgVar.f16486a != fhVar)) {
                                i2 = e + (e - fhVar5.f16548O);
                                e = i;
                            }
                        }
                        i2 = e;
                        e = i;
                    }
                }
            }
            if (fhVar.f16544K == 8) {
                int i7 = fhVar.f16586t;
                e -= i7;
                i2 -= i7;
            }
            fhVar.f16545L = e;
            fhVar.f16548O = i2;
            return;
        }
        zArr[0] = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:122:0x02b3 A[Catch:{ Exception -> 0x02bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02e4 A[Catch:{ Exception -> 0x02bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0391 A[Catch:{ Exception -> 0x03c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x03f3  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0434  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x04e8  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0503  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0510  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0517  */
    /* renamed from: n */
    public final void mo10844n() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        boolean z2;
        int max;
        int max2;
        int i7;
        boolean z3;
        boolean z4;
        boolean z5;
        int i8;
        C0983fe feVar;
        int i9;
        int i10;
        boolean[] zArr;
        int i11;
        int i12;
        int i13;
        int i14 = this.f16589w;
        int i15 = this.f16590x;
        int i16 = 0;
        r4 = false;
        boolean z6 = false;
        int max3 = Math.max(0, mo10816c());
        int max4 = Math.max(0, mo10823f());
        this.f16623aj = false;
        this.f16624ak = false;
        if (this.f16584r == null) {
            this.f16589w = 0;
            this.f16590x = 0;
        } else {
            if (this.f16625am == null) {
                this.f16625am = new C0990fl(this);
            }
            C0990fl flVar = this.f16625am;
            flVar.f16829a = this.f16589w;
            flVar.f16830b = this.f16590x;
            flVar.f16831c = mo10816c();
            flVar.f16832d = mo10823f();
            int size = flVar.f16833e.size();
            for (int i17 = 0; i17 < size; i17++) {
                C0989fk fkVar = (C0989fk) flVar.f16833e.get(i17);
                fkVar.f16757a = mo10822e(fkVar.f16757a.f16492g);
                C0985fg fgVar = fkVar.f16757a;
                if (fgVar != null) {
                    fkVar.f16758b = fgVar.f16487b;
                    fkVar.f16759c = fgVar.mo10793a();
                    C0985fg fgVar2 = fkVar.f16757a;
                    fkVar.f16761e = fgVar2.f16493h;
                    fkVar.f16760d = fgVar2.f16490e;
                } else {
                    fkVar.f16758b = null;
                    fkVar.f16759c = 0;
                    fkVar.f16761e = 2;
                    fkVar.f16760d = 0;
                }
            }
            this.f16589w = 0;
            this.f16590x = 0;
            int size2 = this.f16583q.size();
            for (int i18 = 0; i18 < size2; i18++) {
                ((C0985fg) this.f16583q.get(i18)).mo10795b();
            }
            mo10811a(this.f16619af.f16251g);
        }
        int i19 = this.f16565ae;
        int i20 = this.f16564ad;
        if (this.f16622ai != 2) {
            i = i14;
            i2 = i15;
        } else if (i19 == 2 || i20 == 2) {
            ArrayList arrayList = this.f16877al;
            boolean[] zArr2 = this.f16631as;
            int size3 = arrayList.size();
            zArr2[0] = true;
            i2 = i15;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            while (true) {
                if (i26 >= size3) {
                    this.f16620ag = Math.max(this.f16537D, Math.max(Math.max(i22, i25), i23));
                    this.f16621ah = Math.max(this.f16538E, Math.max(Math.max(i24, i16), i21));
                    for (int i27 = 0; i27 < size3; i27++) {
                        C0986fh fhVar = (C0986fh) arrayList.get(i27);
                        fhVar.f16553T = false;
                        fhVar.f16554U = false;
                        fhVar.f16549P = false;
                        fhVar.f16550Q = false;
                        fhVar.f16551R = false;
                        fhVar.f16552S = false;
                    }
                    i = i14;
                } else {
                    ArrayList arrayList2 = arrayList;
                    C0986fh fhVar2 = (C0986fh) arrayList.get(i26);
                    if (!fhVar2.mo10815b()) {
                        i11 = size3;
                        if (!fhVar2.f16553T) {
                            mo10841a(fhVar2, zArr2);
                        }
                        if (!fhVar2.f16554U) {
                            mo10842b(fhVar2, zArr2);
                        }
                        if (!zArr2[0]) {
                            i = i14;
                            break;
                        }
                        zArr = zArr2;
                        int c = (fhVar2.f16546M + fhVar2.f16547N) - fhVar2.mo10816c();
                        int f = (fhVar2.f16545L + fhVar2.f16548O) - fhVar2.mo10823f();
                        if (fhVar2.f16564ad == 4) {
                            c = fhVar2.mo10816c() + fhVar2.f16575i.f16488c + fhVar2.f16577k.f16488c;
                        }
                        if (fhVar2.f16565ae == 4) {
                            f = fhVar2.mo10823f() + fhVar2.f16576j.f16488c + fhVar2.f16578l.f16488c;
                        }
                        int i28 = fhVar2.f16544K;
                        if (i28 != 8) {
                            i10 = i14;
                            i12 = f;
                        } else {
                            i10 = i14;
                            i12 = 0;
                        }
                        if (i28 != 8) {
                            i13 = c;
                        } else {
                            i13 = 0;
                        }
                        i22 = Math.max(i22, fhVar2.f16546M);
                        i25 = Math.max(i25, fhVar2.f16547N);
                        i16 = Math.max(i16, fhVar2.f16548O);
                        i24 = Math.max(i24, fhVar2.f16545L);
                        i23 = Math.max(i23, i13);
                        i21 = Math.max(i21, i12);
                    } else {
                        i10 = i14;
                        zArr = zArr2;
                        i11 = size3;
                    }
                    i26++;
                    size3 = i11;
                    arrayList = arrayList2;
                    zArr2 = zArr;
                    i14 = i10;
                }
            }
            boolean z7 = this.f16631as[0];
            if (max3 > 0 && max4 > 0 && (this.f16620ag > max3 || this.f16621ah > max4)) {
                z7 = false;
            }
            if (z7) {
                if (this.f16564ad == 2) {
                    this.f16564ad = 1;
                    if (max3 > 0 && max3 < this.f16620ag) {
                        this.f16623aj = true;
                        mo10808a(max3);
                    } else {
                        mo10808a(Math.max(this.f16537D, this.f16620ag));
                    }
                }
                if (this.f16565ae == 2) {
                    this.f16565ae = 1;
                    if (max4 > 0 && max4 < this.f16621ah) {
                        this.f16624ak = true;
                        mo10813b(max4);
                    } else {
                        mo10813b(Math.max(this.f16538E, this.f16621ah));
                    }
                }
            }
            z6 = z7;
        } else {
            i = i14;
            i2 = i15;
        }
        this.f16626an = 0;
        this.f16627ao = 0;
        int size4 = this.f16877al.size();
        for (int i29 = 0; i29 < size4; i29++) {
            C0986fh fhVar3 = (C0986fh) this.f16877al.get(i29);
            if (fhVar3 instanceof C0991fm) {
                ((C0991fm) fhVar3).mo10844n();
            }
        }
        int i30 = 0;
        boolean z8 = true;
        while (z8) {
            int i31 = i30 + 1;
            try {
                this.f16619af.mo10666a();
                boolean b = mo10843b(this.f16619af);
                if (b) {
                    try {
                        C0981fc fcVar = this.f16619af;
                        C0980fb fbVar = fcVar.f16246b;
                        fbVar.mo10642a(fcVar);
                        fcVar.mo10669a(fbVar);
                        for (int i32 = 0; i32 < fcVar.f16249e; i32++) {
                            fcVar.f16248d[i32] = false;
                        }
                        int i33 = 0;
                        boolean z9 = false;
                        while (!z9) {
                            int size5 = fbVar.f16185a.size();
                            z5 = b;
                            C0983fe feVar2 = null;
                            int i34 = 0;
                            int i35 = 0;
                            while (i34 < size5) {
                                boolean z10 = z9;
                                try {
                                    C0983fe feVar3 = (C0983fe) fbVar.f16185a.get(i34);
                                    int i36 = size5;
                                    int i37 = 5;
                                    while (i37 >= 0) {
                                        int i38 = i34;
                                        float f2 = feVar3.f16361e[i37];
                                        if (feVar2 == null) {
                                            if (f2 < 0.0f) {
                                                if (i37 >= i35) {
                                                    feVar2 = feVar3;
                                                    i35 = i37;
                                                    if (f2 > 0.0f) {
                                                        if (i37 > i35) {
                                                            i35 = i37;
                                                            feVar2 = null;
                                                            i37--;
                                                            i34 = i38;
                                                        }
                                                    }
                                                    i37--;
                                                    i34 = i38;
                                                }
                                            }
                                        }
                                        if (f2 > 0.0f) {
                                        }
                                        i37--;
                                        i34 = i38;
                                    }
                                    i34++;
                                    z9 = z10;
                                    size5 = i36;
                                } catch (Exception e) {
                                    e = e;
                                    z = z6;
                                    i4 = max3;
                                    i5 = max4;
                                    i3 = i19;
                                    z8 = z5;
                                    bqye.m113758a(e);
                                    if (!z8) {
                                    }
                                    if (i31 < 8) {
                                    }
                                    i6 = i3;
                                    z2 = false;
                                    max = Math.max(this.f16537D, mo10816c());
                                    if (max > mo10816c()) {
                                    }
                                    max2 = Math.max(this.f16538E, mo10823f());
                                    if (max2 > mo10823f()) {
                                    }
                                    if (z) {
                                    }
                                    z8 = z2;
                                    i19 = i6;
                                    i30 = i31;
                                    max4 = i7;
                                    z6 = z;
                                }
                            }
                            boolean z11 = z9;
                            if (feVar2 != null) {
                                boolean[] zArr3 = fcVar.f16248d;
                                int i39 = feVar2.f16357a;
                                if (zArr3[i39]) {
                                    i8 = i33;
                                    feVar = null;
                                    if (feVar == null) {
                                        int i40 = 0;
                                        float f3 = Float.MAX_VALUE;
                                        int i41 = -1;
                                        while (i40 < fcVar.f16250f) {
                                            C0977ez ezVar = fcVar.f16247c[i40];
                                            int i42 = i8;
                                            z = z6;
                                            if (ezVar.f16074a.f16364h != 1) {
                                                try {
                                                    C0976ey eyVar = ezVar.f16077d;
                                                    int i43 = eyVar.f16016f;
                                                    i5 = max4;
                                                    int i44 = -1;
                                                    i4 = max3;
                                                    if (i43 != -1) {
                                                        int i45 = 0;
                                                        while (true) {
                                                            if (i43 == i44) {
                                                                break;
                                                            }
                                                            try {
                                                                if (i45 >= eyVar.f16011a) {
                                                                    break;
                                                                }
                                                                i3 = i19;
                                                                try {
                                                                    if (eyVar.f16013c[i43] == feVar.f16357a) {
                                                                        float b2 = ezVar.f16077d.mo10577b(feVar);
                                                                        if (b2 < 0.0f) {
                                                                            float f4 = (-ezVar.f16075b) / b2;
                                                                            if (f4 < f3) {
                                                                                f3 = f4;
                                                                                i41 = i40;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        i43 = eyVar.f16014d[i43];
                                                                        i45++;
                                                                        i19 = i3;
                                                                        i44 = -1;
                                                                    }
                                                                } catch (Exception e2) {
                                                                    e = e2;
                                                                    z8 = z5;
                                                                    bqye.m113758a(e);
                                                                    if (!z8) {
                                                                    }
                                                                    if (i31 < 8) {
                                                                    }
                                                                    i6 = i3;
                                                                    z2 = false;
                                                                    max = Math.max(this.f16537D, mo10816c());
                                                                    if (max > mo10816c()) {
                                                                    }
                                                                    max2 = Math.max(this.f16538E, mo10823f());
                                                                    if (max2 > mo10823f()) {
                                                                    }
                                                                    if (z) {
                                                                    }
                                                                    z8 = z2;
                                                                    i19 = i6;
                                                                    i30 = i31;
                                                                    max4 = i7;
                                                                    z6 = z;
                                                                }
                                                            } catch (Exception e3) {
                                                                e = e3;
                                                                i3 = i19;
                                                                z8 = z5;
                                                                bqye.m113758a(e);
                                                                if (!z8) {
                                                                }
                                                                if (i31 < 8) {
                                                                }
                                                                i6 = i3;
                                                                z2 = false;
                                                                max = Math.max(this.f16537D, mo10816c());
                                                                if (max > mo10816c()) {
                                                                }
                                                                max2 = Math.max(this.f16538E, mo10823f());
                                                                if (max2 > mo10823f()) {
                                                                }
                                                                if (z) {
                                                                }
                                                                z8 = z2;
                                                                i19 = i6;
                                                                i30 = i31;
                                                                max4 = i7;
                                                                z6 = z;
                                                            }
                                                        }
                                                    } else {
                                                        i3 = i19;
                                                    }
                                                    i40++;
                                                    i8 = i42;
                                                    z6 = z;
                                                    max4 = i5;
                                                    max3 = i4;
                                                    i19 = i3;
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    i4 = max3;
                                                    i5 = max4;
                                                    i3 = i19;
                                                    z8 = z5;
                                                    bqye.m113758a(e);
                                                    if (!z8) {
                                                    }
                                                    if (i31 < 8) {
                                                    }
                                                    i6 = i3;
                                                    z2 = false;
                                                    max = Math.max(this.f16537D, mo10816c());
                                                    if (max > mo10816c()) {
                                                    }
                                                    max2 = Math.max(this.f16538E, mo10823f());
                                                    if (max2 > mo10823f()) {
                                                    }
                                                    if (z) {
                                                    }
                                                    z8 = z2;
                                                    i19 = i6;
                                                    i30 = i31;
                                                    max4 = i7;
                                                    z6 = z;
                                                }
                                            } else {
                                                i4 = max3;
                                                i5 = max4;
                                            }
                                            i3 = i19;
                                            i40++;
                                            i8 = i42;
                                            z6 = z;
                                            max4 = i5;
                                            max3 = i4;
                                            i19 = i3;
                                        }
                                        i9 = i8;
                                        z = z6;
                                        i4 = max3;
                                        i5 = max4;
                                        i3 = i19;
                                        if (i41 >= 0) {
                                            C0977ez ezVar2 = fcVar.f16247c[i41];
                                            ezVar2.f16074a.f16358b = -1;
                                            ezVar2.mo10608a(feVar);
                                            ezVar2.f16074a.f16358b = i41;
                                            for (int i46 = 0; i46 < fcVar.f16250f; i46++) {
                                                fcVar.f16247c[i46].mo10607a(ezVar2);
                                            }
                                            fbVar.mo10642a(fcVar);
                                            try {
                                                fcVar.mo10669a(fbVar);
                                            } catch (Exception e5) {
                                                bqye.m113758a(e5);
                                            }
                                            z9 = z11;
                                            b = z5;
                                            i33 = i9;
                                            z6 = z;
                                            max4 = i5;
                                            max3 = i4;
                                            i19 = i3;
                                        }
                                    } else {
                                        i9 = i8;
                                        z = z6;
                                        i4 = max3;
                                        i5 = max4;
                                        i3 = i19;
                                    }
                                    z9 = true;
                                    b = z5;
                                    i33 = i9;
                                    z6 = z;
                                    max4 = i5;
                                    max3 = i4;
                                    i19 = i3;
                                } else {
                                    zArr3[i39] = true;
                                    i33++;
                                    if (i33 >= fcVar.f16249e) {
                                        z11 = true;
                                    }
                                }
                            }
                            i8 = i33;
                            feVar = feVar2;
                            if (feVar == null) {
                            }
                            z9 = true;
                            b = z5;
                            i33 = i9;
                            z6 = z;
                            max4 = i5;
                            max3 = i4;
                            i19 = i3;
                        }
                        z3 = b;
                        z4 = z6;
                        i4 = max3;
                        i5 = max4;
                        i3 = i19;
                        for (int i47 = 0; i47 < fcVar.f16250f; i47++) {
                            C0977ez ezVar3 = fcVar.f16247c[i47];
                            ezVar3.f16074a.f16360d = ezVar3.f16075b;
                        }
                    } catch (Exception e6) {
                        e = e6;
                        z5 = b;
                        z = z6;
                        i4 = max3;
                        i5 = max4;
                        i3 = i19;
                        z8 = z5;
                        bqye.m113758a(e);
                        if (!z8) {
                        }
                        if (i31 < 8) {
                        }
                        i6 = i3;
                        z2 = false;
                        max = Math.max(this.f16537D, mo10816c());
                        if (max > mo10816c()) {
                        }
                        max2 = Math.max(this.f16538E, mo10823f());
                        if (max2 > mo10823f()) {
                        }
                        if (z) {
                        }
                        z8 = z2;
                        i19 = i6;
                        i30 = i31;
                        max4 = i7;
                        z6 = z;
                    }
                } else {
                    z3 = b;
                    z4 = z6;
                    i4 = max3;
                    i5 = max4;
                    i3 = i19;
                }
                z8 = z3;
            } catch (Exception e7) {
                e = e7;
                z = z6;
                i4 = max3;
                i5 = max4;
                i3 = i19;
                bqye.m113758a(e);
                if (!z8) {
                }
                if (i31 < 8) {
                }
                i6 = i3;
                z2 = false;
                max = Math.max(this.f16537D, mo10816c());
                if (max > mo10816c()) {
                }
                max2 = Math.max(this.f16538E, mo10823f());
                if (max2 > mo10823f()) {
                }
                if (z) {
                }
                z8 = z2;
                i19 = i6;
                i30 = i31;
                max4 = i7;
                z6 = z;
            }
            if (!z8) {
                mo10832m();
                int i48 = 0;
                while (true) {
                    if (i48 >= size4) {
                        break;
                    }
                    C0986fh fhVar4 = (C0986fh) this.f16877al.get(i48);
                    if (fhVar4.f16564ad == 3 && fhVar4.mo10816c() < fhVar4.f16539F) {
                        this.f16631as[2] = true;
                        break;
                    } else if (fhVar4.f16565ae == 3 && fhVar4.mo10823f() < fhVar4.f16540G) {
                        this.f16631as[2] = true;
                        break;
                    } else {
                        i48++;
                    }
                }
            } else {
                boolean[] zArr4 = this.f16631as;
                zArr4[2] = false;
                mo10832m();
                int size6 = this.f16877al.size();
                for (int i49 = 0; i49 < size6; i49++) {
                    C0986fh fhVar5 = (C0986fh) this.f16877al.get(i49);
                    fhVar5.mo10832m();
                    if (fhVar5.f16564ad == 3 && fhVar5.mo10816c() < fhVar5.f16539F) {
                        zArr4[2] = true;
                    }
                    if (fhVar5.f16565ae == 3 && fhVar5.mo10823f() < fhVar5.f16540G) {
                        zArr4[2] = true;
                    }
                }
            }
            if (i31 < 8 || !this.f16631as[2]) {
                i6 = i3;
                z2 = false;
            } else {
                int i50 = 0;
                int i51 = 0;
                for (int i52 = 0; i52 < size4; i52++) {
                    C0986fh fhVar6 = (C0986fh) this.f16877al.get(i52);
                    i50 = Math.max(i50, fhVar6.f16589w + fhVar6.mo10816c());
                    i51 = Math.max(i51, fhVar6.f16590x + fhVar6.mo10823f());
                }
                int max5 = Math.max(this.f16537D, i50);
                int max6 = Math.max(this.f16538E, i51);
                if (i20 != 2) {
                    z2 = false;
                } else if (mo10816c() < max5) {
                    mo10808a(max5);
                    this.f16564ad = 2;
                    z2 = true;
                    z = true;
                } else {
                    z2 = false;
                }
                i6 = i3;
                if (i6 == 2 && mo10823f() < max6) {
                    mo10813b(max6);
                    this.f16565ae = 2;
                    z2 = true;
                    z = true;
                }
            }
            max = Math.max(this.f16537D, mo10816c());
            if (max > mo10816c()) {
                mo10808a(max);
                this.f16564ad = 1;
                z2 = true;
                z = true;
            }
            max2 = Math.max(this.f16538E, mo10823f());
            if (max2 > mo10823f()) {
                mo10813b(max2);
                this.f16565ae = 1;
                z2 = true;
                z = true;
            }
            if (z) {
                i7 = i5;
                max3 = i4;
            } else {
                if (this.f16564ad != 2) {
                    max3 = i4;
                } else if (i4 <= 0) {
                    max3 = i4;
                } else {
                    max3 = i4;
                    if (mo10816c() > max3) {
                        this.f16623aj = true;
                        this.f16564ad = 1;
                        mo10808a(max3);
                        z2 = true;
                        z = true;
                    }
                }
                if (this.f16565ae != 2 || i5 <= 0) {
                    i7 = i5;
                } else {
                    i7 = i5;
                    if (mo10823f() > i7) {
                        this.f16624ak = true;
                        this.f16565ae = 1;
                        mo10813b(i7);
                        z2 = true;
                        z = true;
                    }
                }
            }
            z8 = z2;
            i19 = i6;
            i30 = i31;
            max4 = i7;
            z6 = z;
        }
        boolean z12 = z6;
        int i53 = i19;
        if (this.f16584r != null) {
            int max7 = Math.max(this.f16537D, mo10816c());
            int max8 = Math.max(this.f16538E, mo10823f());
            C0990fl flVar2 = this.f16625am;
            this.f16589w = flVar2.f16829a;
            this.f16590x = flVar2.f16830b;
            mo10808a(flVar2.f16831c);
            mo10813b(flVar2.f16832d);
            int size7 = flVar2.f16833e.size();
            for (int i54 = 0; i54 < size7; i54++) {
                C0989fk fkVar2 = (C0989fk) flVar2.f16833e.get(i54);
                mo10822e(fkVar2.f16757a.f16492g).mo10794a(fkVar2.f16758b, fkVar2.f16759c, -1, fkVar2.f16761e, fkVar2.f16760d, false);
            }
            mo10808a(max7);
            mo10813b(max8);
        } else {
            this.f16589w = i;
            this.f16590x = i2;
        }
        if (z12) {
            this.f16564ad = i20;
            this.f16565ae = i53;
        }
        mo10811a(this.f16619af.f16251g);
        C0986fh fhVar7 = this.f16584r;
        C0987fi fiVar = this;
        while (fhVar7 != null) {
            C0986fh fhVar8 = fhVar7.f16584r;
            if (fhVar7 instanceof C0987fi) {
                fiVar = fhVar7;
            }
            fhVar7 = fhVar8;
        }
        if (this == fiVar) {
            mo10831l();
        }
    }

    /* renamed from: a */
    public final void mo10807a() {
        this.f16619af.mo10666a();
        super.mo10807a();
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:259:0x0074 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX INFO: additional move instructions added (3) to help type inference */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x06e0, code lost:
        if (r5.f16544K == 8) goto L_0x06e5;
     */
    /* renamed from: b */
    public final boolean mo10843b(C0981fc fcVar) {
        boolean z;
        int i;
        int i2;
        boolean z2;
        float f;
        C0985fg fgVar;
        int i3;
        float f2;
        C0985fg fgVar2;
        int i4;
        C0981fc fcVar2 = fcVar;
        mo10812a(fcVar);
        int size = this.f16877al.size();
        int i5 = this.f16622ai;
        int i6 = 4;
        i6 = 4;
        int i7 = 8;
        i7 = 8;
        boolean z3 = false;
        int i8 = 0;
        boolean z4 = true;
        z4 = true;
        if (i5 == 2 || i5 == 4) {
            int size2 = this.f16877al.size();
            int i9 = 0;
            while (true) {
                i = 3;
                i2 = -1;
                if (i9 >= size2) {
                    break;
                }
                C0986fh fhVar = (C0986fh) this.f16877al.get(i9);
                fhVar.f16560a = -1;
                fhVar.f16568b = -1;
                if (fhVar.f16564ad == 3 || fhVar.f16565ae == 3) {
                    fhVar.f16560a = 1;
                    fhVar.f16568b = 1;
                }
                i9++;
            }
            boolean z5 = false;
            int i10 = 0;
            int i11 = 0;
            while (!z5) {
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                boolean z6 = z3;
                while (i12 < size2) {
                    C0986fh fhVar2 = (C0986fh) this.f16877al.get(i12);
                    if (fhVar2.f16560a == i2) {
                        int i15 = this.f16564ad;
                        if (i15 != 2) {
                            int i16 = fhVar2.f16564ad;
                            if (i16 == i) {
                                fhVar2.f16560a = z4;
                            } else if (i15 != 2 && i16 == i6) {
                                C0985fg fgVar3 = fhVar2.f16575i;
                                fgVar3.f16491f = fcVar2.mo10665a(fgVar3);
                                C0985fg fgVar4 = fhVar2.f16577k;
                                fgVar4.f16491f = fcVar2.mo10665a(fgVar4);
                                int i17 = fhVar2.f16575i.f16488c;
                                int c = mo10816c() - fhVar2.f16577k.f16488c;
                                fcVar2.mo10670a(fhVar2.f16575i.f16491f, i17);
                                fcVar2.mo10670a(fhVar2.f16577k.f16491f, c);
                                fhVar2.mo10814b(i17, c);
                                fhVar2.f16560a = 2;
                            } else {
                                C0985fg fgVar5 = fhVar2.f16575i;
                                C0985fg fgVar6 = fgVar5.f16487b;
                                if (fgVar6 == null || (fgVar2 = fhVar2.f16577k.f16487b) == null) {
                                    if (fgVar6 != null && fgVar6.f16486a == this) {
                                        int a = fgVar5.mo10793a();
                                        int c2 = fhVar2.mo10816c() + a;
                                        C0985fg fgVar7 = fhVar2.f16575i;
                                        fgVar7.f16491f = fcVar2.mo10665a(fgVar7);
                                        C0985fg fgVar8 = fhVar2.f16577k;
                                        fgVar8.f16491f = fcVar2.mo10665a(fgVar8);
                                        fcVar2.mo10670a(fhVar2.f16575i.f16491f, a);
                                        fcVar2.mo10670a(fhVar2.f16577k.f16491f, c2);
                                        fhVar2.f16560a = 2;
                                        fhVar2.mo10814b(a, c2);
                                    } else {
                                        C0985fg fgVar9 = fhVar2.f16577k.f16487b;
                                        if (fgVar9 != null && fgVar9.f16486a == this) {
                                            fgVar5.f16491f = fcVar2.mo10665a(fgVar5);
                                            C0985fg fgVar10 = fhVar2.f16577k;
                                            fgVar10.f16491f = fcVar2.mo10665a(fgVar10);
                                            int c3 = mo10816c() - fhVar2.f16577k.mo10793a();
                                            int c4 = c3 - fhVar2.mo10816c();
                                            fcVar2.mo10670a(fhVar2.f16575i.f16491f, c4);
                                            fcVar2.mo10670a(fhVar2.f16577k.f16491f, c3);
                                            fhVar2.f16560a = 2;
                                            fhVar2.mo10814b(c4, c3);
                                        } else if (fgVar6 != null && fgVar6.f16486a.f16560a == 2) {
                                            C0983fe feVar = fgVar6.f16491f;
                                            fgVar5.f16491f = fcVar2.mo10665a(fgVar5);
                                            C0985fg fgVar11 = fhVar2.f16577k;
                                            fgVar11.f16491f = fcVar2.mo10665a(fgVar11);
                                            int a2 = (int) (feVar.f16360d + ((float) fhVar2.f16575i.mo10793a()) + 0.5f);
                                            int c5 = fhVar2.mo10816c() + a2;
                                            fcVar2.mo10670a(fhVar2.f16575i.f16491f, a2);
                                            fcVar2.mo10670a(fhVar2.f16577k.f16491f, c5);
                                            fhVar2.f16560a = 2;
                                            fhVar2.mo10814b(a2, c5);
                                        } else if (fgVar9 != null && fgVar9.f16486a.f16560a == 2) {
                                            C0983fe feVar2 = fgVar9.f16491f;
                                            fgVar5.f16491f = fcVar2.mo10665a(fgVar5);
                                            C0985fg fgVar12 = fhVar2.f16577k;
                                            fgVar12.f16491f = fcVar2.mo10665a(fgVar12);
                                            int a3 = (int) ((feVar2.f16360d - ((float) fhVar2.f16577k.mo10793a())) + 0.5f);
                                            int c6 = a3 - fhVar2.mo10816c();
                                            fcVar2.mo10670a(fhVar2.f16575i.f16491f, c6);
                                            fcVar2.mo10670a(fhVar2.f16577k.f16491f, a3);
                                            fhVar2.f16560a = 2;
                                            fhVar2.mo10814b(c6, a3);
                                        } else if (fgVar6 == null && fgVar9 == null) {
                                            if (fhVar2 instanceof C0988fj) {
                                                C0988fj fjVar = (C0988fj) fhVar2;
                                                if (fjVar.f16701ai == z4) {
                                                    fgVar5.f16491f = fcVar2.mo10665a(fgVar5);
                                                    C0985fg fgVar13 = fhVar2.f16577k;
                                                    fgVar13.f16491f = fcVar2.mo10665a(fgVar13);
                                                    int i18 = fjVar.f16699ag;
                                                    if (i18 != -1) {
                                                        f2 = (float) i18;
                                                    } else if (fjVar.f16700ah == -1) {
                                                        f2 = ((float) mo10816c()) * fjVar.f16698af;
                                                    } else {
                                                        f2 = (float) (mo10816c() - fjVar.f16700ah);
                                                    }
                                                    int i19 = (int) (f2 + 0.5f);
                                                    fcVar2.mo10670a(fhVar2.f16575i.f16491f, i19);
                                                    fcVar2.mo10670a(fhVar2.f16577k.f16491f, i19);
                                                    fhVar2.f16560a = 2;
                                                    fhVar2.f16568b = 2;
                                                    fhVar2.mo10814b(i19, i19);
                                                    fhVar2.mo10818c(0, mo10823f());
                                                }
                                            } else {
                                                fgVar5.f16491f = fcVar2.mo10665a(fgVar5);
                                                C0985fg fgVar14 = fhVar2.f16577k;
                                                fgVar14.f16491f = fcVar2.mo10665a(fgVar14);
                                                int i20 = fhVar2.f16589w;
                                                int c7 = fhVar2.mo10816c();
                                                fcVar2.mo10670a(fhVar2.f16575i.f16491f, i20);
                                                fcVar2.mo10670a(fhVar2.f16577k.f16491f, i20 + c7);
                                                fhVar2.f16560a = 2;
                                            }
                                        }
                                    }
                                } else if (fgVar6.f16486a == this && fgVar2.f16486a == this) {
                                    int a4 = fgVar5.mo10793a();
                                    int a5 = fhVar2.f16577k.mo10793a();
                                    if (this.f16564ad == i) {
                                        i4 = mo10816c() - a5;
                                    } else {
                                        a4 += (int) ((((float) (((mo10816c() - a4) - a5) - fhVar2.mo10816c())) * fhVar2.f16541H) + 0.5f);
                                        i4 = a4 + fhVar2.mo10816c();
                                    }
                                    C0985fg fgVar15 = fhVar2.f16575i;
                                    fgVar15.f16491f = fcVar2.mo10665a(fgVar15);
                                    C0985fg fgVar16 = fhVar2.f16577k;
                                    fgVar16.f16491f = fcVar2.mo10665a(fgVar16);
                                    fcVar2.mo10670a(fhVar2.f16575i.f16491f, a4);
                                    fcVar2.mo10670a(fhVar2.f16577k.f16491f, i4);
                                    fhVar2.f16560a = 2;
                                    fhVar2.mo10814b(a4, i4);
                                } else {
                                    fhVar2.f16560a = z4;
                                }
                            }
                        } else {
                            fhVar2.f16560a = z4;
                        }
                    }
                    if (fhVar2.f16568b == -1) {
                        int i21 = this.f16565ae;
                        if (i21 != 2) {
                            int i22 = fhVar2.f16565ae;
                            if (i22 == 3) {
                                fhVar2.f16568b = z4;
                                z2 = false;
                            } else if (i21 != 2 && i22 == 4) {
                                C0985fg fgVar17 = fhVar2.f16576j;
                                fgVar17.f16491f = fcVar2.mo10665a(fgVar17);
                                C0985fg fgVar18 = fhVar2.f16578l;
                                fgVar18.f16491f = fcVar2.mo10665a(fgVar18);
                                int i23 = fhVar2.f16576j.f16488c;
                                int f3 = mo10823f() - fhVar2.f16578l.f16488c;
                                fcVar2.mo10670a(fhVar2.f16576j.f16491f, i23);
                                fcVar2.mo10670a(fhVar2.f16578l.f16491f, f3);
                                if (fhVar2.f16536C > 0 || fhVar2.f16544K == 8) {
                                    C0985fg fgVar19 = fhVar2.f16579m;
                                    fgVar19.f16491f = fcVar2.mo10665a(fgVar19);
                                    fcVar2.mo10670a(fhVar2.f16579m.f16491f, fhVar2.f16536C + i23);
                                }
                                fhVar2.mo10818c(i23, f3);
                                fhVar2.f16568b = 2;
                                z2 = false;
                            } else {
                                C0985fg fgVar20 = fhVar2.f16576j;
                                C0985fg fgVar21 = fgVar20.f16487b;
                                if (fgVar21 == null || (fgVar = fhVar2.f16578l.f16487b) == null) {
                                    if (fgVar21 != null && fgVar21.f16486a == this) {
                                        int a6 = fgVar20.mo10793a();
                                        int f4 = fhVar2.mo10823f() + a6;
                                        C0985fg fgVar22 = fhVar2.f16576j;
                                        fgVar22.f16491f = fcVar2.mo10665a(fgVar22);
                                        C0985fg fgVar23 = fhVar2.f16578l;
                                        fgVar23.f16491f = fcVar2.mo10665a(fgVar23);
                                        fcVar2.mo10670a(fhVar2.f16576j.f16491f, a6);
                                        fcVar2.mo10670a(fhVar2.f16578l.f16491f, f4);
                                        if (fhVar2.f16536C > 0 || fhVar2.f16544K == 8) {
                                            C0985fg fgVar24 = fhVar2.f16579m;
                                            fgVar24.f16491f = fcVar2.mo10665a(fgVar24);
                                            fcVar2.mo10670a(fhVar2.f16579m.f16491f, fhVar2.f16536C + a6);
                                        }
                                        fhVar2.f16568b = 2;
                                        fhVar2.mo10818c(a6, f4);
                                        z2 = false;
                                    } else {
                                        C0985fg fgVar25 = fhVar2.f16578l.f16487b;
                                        if (fgVar25 != null && fgVar25.f16486a == this) {
                                            fgVar20.f16491f = fcVar2.mo10665a(fgVar20);
                                            C0985fg fgVar26 = fhVar2.f16578l;
                                            fgVar26.f16491f = fcVar2.mo10665a(fgVar26);
                                            int f5 = mo10823f() - fhVar2.f16578l.mo10793a();
                                            int f6 = f5 - fhVar2.mo10823f();
                                            fcVar2.mo10670a(fhVar2.f16576j.f16491f, f6);
                                            fcVar2.mo10670a(fhVar2.f16578l.f16491f, f5);
                                            if (fhVar2.f16536C > 0 || fhVar2.f16544K == 8) {
                                                C0985fg fgVar27 = fhVar2.f16579m;
                                                fgVar27.f16491f = fcVar2.mo10665a(fgVar27);
                                                fcVar2.mo10670a(fhVar2.f16579m.f16491f, fhVar2.f16536C + f6);
                                            }
                                            fhVar2.f16568b = 2;
                                            fhVar2.mo10818c(f6, f5);
                                            z2 = false;
                                        } else if (fgVar21 != null && fgVar21.f16486a.f16568b == 2) {
                                            C0983fe feVar3 = fgVar21.f16491f;
                                            fgVar20.f16491f = fcVar2.mo10665a(fgVar20);
                                            C0985fg fgVar28 = fhVar2.f16578l;
                                            fgVar28.f16491f = fcVar2.mo10665a(fgVar28);
                                            int a7 = (int) (feVar3.f16360d + ((float) fhVar2.f16576j.mo10793a()) + 0.5f);
                                            int f7 = fhVar2.mo10823f() + a7;
                                            fcVar2.mo10670a(fhVar2.f16576j.f16491f, a7);
                                            fcVar2.mo10670a(fhVar2.f16578l.f16491f, f7);
                                            if (fhVar2.f16536C > 0 || fhVar2.f16544K == 8) {
                                                C0985fg fgVar29 = fhVar2.f16579m;
                                                fgVar29.f16491f = fcVar2.mo10665a(fgVar29);
                                                fcVar2.mo10670a(fhVar2.f16579m.f16491f, fhVar2.f16536C + a7);
                                            }
                                            fhVar2.f16568b = 2;
                                            fhVar2.mo10818c(a7, f7);
                                            z2 = false;
                                        } else if (fgVar25 != null && fgVar25.f16486a.f16568b == 2) {
                                            C0983fe feVar4 = fgVar25.f16491f;
                                            fgVar20.f16491f = fcVar2.mo10665a(fgVar20);
                                            C0985fg fgVar30 = fhVar2.f16578l;
                                            fgVar30.f16491f = fcVar2.mo10665a(fgVar30);
                                            int a8 = (int) ((feVar4.f16360d - ((float) fhVar2.f16578l.mo10793a())) + 0.5f);
                                            int f8 = a8 - fhVar2.mo10823f();
                                            fcVar2.mo10670a(fhVar2.f16576j.f16491f, f8);
                                            fcVar2.mo10670a(fhVar2.f16578l.f16491f, a8);
                                            if (fhVar2.f16536C > 0 || fhVar2.f16544K == 8) {
                                                C0985fg fgVar31 = fhVar2.f16579m;
                                                fgVar31.f16491f = fcVar2.mo10665a(fgVar31);
                                                fcVar2.mo10670a(fhVar2.f16579m.f16491f, fhVar2.f16536C + f8);
                                            }
                                            fhVar2.f16568b = 2;
                                            fhVar2.mo10818c(f8, a8);
                                            z2 = false;
                                        } else {
                                            C0985fg fgVar32 = fhVar2.f16579m.f16487b;
                                            if (fgVar32 != null && fgVar32.f16486a.f16568b == 2) {
                                                C0983fe feVar5 = fgVar32.f16491f;
                                                fgVar20.f16491f = fcVar2.mo10665a(fgVar20);
                                                C0985fg fgVar33 = fhVar2.f16578l;
                                                fgVar33.f16491f = fcVar2.mo10665a(fgVar33);
                                                int i24 = (int) ((feVar5.f16360d - ((float) fhVar2.f16536C)) + 0.5f);
                                                int f9 = fhVar2.mo10823f() + i24;
                                                fcVar2.mo10670a(fhVar2.f16576j.f16491f, i24);
                                                fcVar2.mo10670a(fhVar2.f16578l.f16491f, f9);
                                                C0985fg fgVar34 = fhVar2.f16579m;
                                                fgVar34.f16491f = fcVar2.mo10665a(fgVar34);
                                                fcVar2.mo10670a(fhVar2.f16579m.f16491f, fhVar2.f16536C + i24);
                                                fhVar2.f16568b = 2;
                                                fhVar2.mo10818c(i24, f9);
                                                z2 = false;
                                            } else if (fgVar32 != null || fgVar21 != null || fgVar25 != null) {
                                                z2 = false;
                                            } else if (fhVar2 instanceof C0988fj) {
                                                C0988fj fjVar2 = (C0988fj) fhVar2;
                                                if (fjVar2.f16701ai == 0) {
                                                    fgVar20.f16491f = fcVar2.mo10665a(fgVar20);
                                                    C0985fg fgVar35 = fhVar2.f16578l;
                                                    fgVar35.f16491f = fcVar2.mo10665a(fgVar35);
                                                    int i25 = fjVar2.f16699ag;
                                                    if (i25 != -1) {
                                                        f = (float) i25;
                                                    } else if (fjVar2.f16700ah == -1) {
                                                        f = ((float) mo10823f()) * fjVar2.f16698af;
                                                    } else {
                                                        f = (float) (mo10823f() - fjVar2.f16700ah);
                                                    }
                                                    int i26 = (int) (f + 0.5f);
                                                    fcVar2.mo10670a(fhVar2.f16576j.f16491f, i26);
                                                    fcVar2.mo10670a(fhVar2.f16578l.f16491f, i26);
                                                    fhVar2.f16568b = 2;
                                                    fhVar2.f16560a = 2;
                                                    fhVar2.mo10818c(i26, i26);
                                                    z2 = false;
                                                    fhVar2.mo10814b(0, mo10816c());
                                                } else {
                                                    z2 = false;
                                                }
                                            } else {
                                                z2 = false;
                                                fgVar20.f16491f = fcVar2.mo10665a(fgVar20);
                                                C0985fg fgVar36 = fhVar2.f16578l;
                                                fgVar36.f16491f = fcVar2.mo10665a(fgVar36);
                                                int i27 = fhVar2.f16590x;
                                                int f10 = fhVar2.mo10823f();
                                                fcVar2.mo10670a(fhVar2.f16576j.f16491f, i27);
                                                fcVar2.mo10670a(fhVar2.f16578l.f16491f, f10 + i27);
                                                if (fhVar2.f16536C <= 0) {
                                                }
                                                C0985fg fgVar37 = fhVar2.f16579m;
                                                fgVar37.f16491f = fcVar2.mo10665a(fgVar37);
                                                fcVar2.mo10670a(fhVar2.f16579m.f16491f, i27 + fhVar2.f16536C);
                                                fhVar2.f16568b = 2;
                                            }
                                        }
                                    }
                                } else if (fgVar21.f16486a == this && fgVar.f16486a == this) {
                                    int a9 = fgVar20.mo10793a();
                                    int a10 = fhVar2.f16578l.mo10793a();
                                    if (this.f16565ae == 3) {
                                        i3 = fhVar2.mo10823f() + a9;
                                    } else {
                                        a9 = (int) (((float) a9) + (((float) (((mo10823f() - a9) - a10) - fhVar2.mo10823f())) * fhVar2.f16542I) + 0.5f);
                                        i3 = fhVar2.mo10823f() + a9;
                                    }
                                    C0985fg fgVar38 = fhVar2.f16576j;
                                    fgVar38.f16491f = fcVar2.mo10665a(fgVar38);
                                    C0985fg fgVar39 = fhVar2.f16578l;
                                    fgVar39.f16491f = fcVar2.mo10665a(fgVar39);
                                    fcVar2.mo10670a(fhVar2.f16576j.f16491f, a9);
                                    fcVar2.mo10670a(fhVar2.f16578l.f16491f, i3);
                                    if (fhVar2.f16536C > 0 || fhVar2.f16544K == 8) {
                                        C0985fg fgVar40 = fhVar2.f16579m;
                                        fgVar40.f16491f = fcVar2.mo10665a(fgVar40);
                                        fcVar2.mo10670a(fhVar2.f16579m.f16491f, fhVar2.f16536C + a9);
                                    }
                                    fhVar2.f16568b = 2;
                                    fhVar2.mo10818c(a9, i3);
                                    z2 = false;
                                } else {
                                    fhVar2.f16568b = z4 ? 1 : 0;
                                    z2 = false;
                                }
                            }
                        } else {
                            z2 = false;
                            fhVar2.f16568b = 1;
                        }
                    } else {
                        z2 = false;
                    }
                    i2 = -1;
                    if (fhVar2.f16568b == -1) {
                        i13++;
                    }
                    if (fhVar2.f16560a == -1) {
                        i14++;
                    }
                    i12++;
                    i6 = 4;
                    z4 = true;
                    i = 3;
                    z6 = z2;
                }
                int i28 = i14;
                if ((i13 == 0 && i28 == 0) || (i10 == i13 && i11 == i28)) {
                    z5 = true;
                }
                i11 = i28;
                i10 = i13;
                i6 = 4;
                i7 = 8;
                z4 = true;
                i = 3;
                z3 = z6;
            }
            int i29 = 0;
            int i30 = 0;
            for (int i31 = 0; i31 < size2; i31++) {
                C0986fh fhVar3 = (C0986fh) this.f16877al.get(i31);
                int i32 = fhVar3.f16560a;
                if (i32 == z4 || i32 == i2) {
                    i29++;
                }
                int i33 = fhVar3.f16568b;
                if (i33 == z4 || i33 == i2) {
                    i30++;
                }
            }
            if (i29 != 0) {
                z = false;
                i8 = z3;
            } else if (i30 == 0) {
                return z3;
            } else {
                z = false;
                i8 = z3;
            }
        } else {
            z = true;
        }
        while (i8 < size) {
            C0986fh fhVar4 = (C0986fh) this.f16877al.get(i8);
            if (fhVar4 instanceof C0987fi) {
                int i34 = fhVar4.f16564ad;
                int i35 = fhVar4.f16565ae;
                if (i34 == 2) {
                    fhVar4.mo10824f(z4);
                }
                if (i35 == 2) {
                    fhVar4.mo10826g(z4 ? 1 : 0);
                }
                fhVar4.mo10812a(fcVar2);
                if (i34 == 2) {
                    fhVar4.mo10824f(2);
                }
                if (i35 == 2) {
                    fhVar4.mo10826g(2);
                }
            } else {
                if (z) {
                    if (this.f16564ad != 2 && fhVar4.f16564ad == i6) {
                        C0985fg fgVar41 = fhVar4.f16575i;
                        fgVar41.f16491f = fcVar2.mo10665a(fgVar41);
                        C0985fg fgVar42 = fhVar4.f16577k;
                        fgVar42.f16491f = fcVar2.mo10665a(fgVar42);
                        int i36 = fhVar4.f16575i.f16488c;
                        int c8 = mo10816c() - fhVar4.f16577k.f16488c;
                        fcVar2.mo10670a(fhVar4.f16575i.f16491f, i36);
                        fcVar2.mo10670a(fhVar4.f16577k.f16491f, c8);
                        fhVar4.mo10814b(i36, c8);
                        fhVar4.f16560a = 2;
                    }
                    if (this.f16565ae != 2 && fhVar4.f16565ae == i6) {
                        C0985fg fgVar43 = fhVar4.f16576j;
                        fgVar43.f16491f = fcVar2.mo10665a(fgVar43);
                        C0985fg fgVar44 = fhVar4.f16578l;
                        fgVar44.f16491f = fcVar2.mo10665a(fgVar44);
                        int i37 = fhVar4.f16576j.f16488c;
                        int f11 = mo10823f() - fhVar4.f16578l.f16488c;
                        fcVar2.mo10670a(fhVar4.f16576j.f16491f, i37);
                        fcVar2.mo10670a(fhVar4.f16578l.f16491f, f11);
                        if (fhVar4.f16536C > 0 || fhVar4.f16544K == i7) {
                            C0985fg fgVar45 = fhVar4.f16579m;
                            fgVar45.f16491f = fcVar2.mo10665a(fgVar45);
                            fcVar2.mo10670a(fhVar4.f16579m.f16491f, fhVar4.f16536C + i37);
                        }
                        fhVar4.mo10818c(i37, f11);
                        fhVar4.f16568b = 2;
                    }
                }
                fhVar4.mo10812a(fcVar2);
            }
            i8++;
        }
        if (this.f16626an > 0) {
            m11724c(fcVar);
        }
        if (this.f16627ao > 0) {
            m11725d(fcVar);
        }
        return z4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10840a(C0986fh fhVar, int i) {
        int i2 = 0;
        if (i == 0) {
            while (true) {
                C0985fg fgVar = fhVar.f16575i;
                C0985fg fgVar2 = fgVar.f16487b;
                if (fgVar2 == null) {
                    break;
                }
                C0986fh fhVar2 = fgVar2.f16486a;
                C0985fg fgVar3 = fhVar2.f16577k.f16487b;
                if (fgVar3 == null || fgVar3 != fgVar || fhVar2 == fhVar) {
                    break;
                }
                fhVar = fhVar2;
            }
            while (true) {
                int i3 = this.f16626an;
                if (i2 >= i3) {
                    C0986fh[] fhVarArr = this.f16630ar;
                    int length = fhVarArr.length;
                    if (i3 + 1 >= length) {
                        this.f16630ar = (C0986fh[]) Arrays.copyOf(fhVarArr, length + length);
                    }
                    C0986fh[] fhVarArr2 = this.f16630ar;
                    int i4 = this.f16626an;
                    fhVarArr2[i4] = fhVar;
                    this.f16626an = i4 + 1;
                    return;
                } else if (this.f16630ar[i2] != fhVar) {
                    i2++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                C0985fg fgVar4 = fhVar.f16576j;
                C0985fg fgVar5 = fgVar4.f16487b;
                if (fgVar5 == null) {
                    break;
                }
                C0986fh fhVar3 = fgVar5.f16486a;
                C0985fg fgVar6 = fhVar3.f16578l.f16487b;
                if (fgVar6 == null || fgVar6 != fgVar4 || fhVar3 == fhVar) {
                    break;
                }
                fhVar = fhVar3;
            }
            while (true) {
                int i5 = this.f16627ao;
                if (i2 >= i5) {
                    C0986fh[] fhVarArr3 = this.f16629aq;
                    int length2 = fhVarArr3.length;
                    if (i5 + 1 >= length2) {
                        this.f16629aq = (C0986fh[]) Arrays.copyOf(fhVarArr3, length2 + length2);
                    }
                    C0986fh[] fhVarArr4 = this.f16629aq;
                    int i6 = this.f16627ao;
                    fhVarArr4[i6] = fhVar;
                    this.f16627ao = i6 + 1;
                    return;
                } else if (this.f16629aq[i2] != fhVar) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo10841a(C0986fh fhVar, boolean[] zArr) {
        C0986fh fhVar2;
        int i;
        C0985fg fgVar;
        boolean z;
        C0985fg fgVar2;
        C0985fg fgVar3;
        C0986fh fhVar3;
        int i2;
        boolean z2 = false;
        r3 = 0;
        int i3 = 0;
        z2 = false;
        z2 = false;
        if (fhVar.f16564ad == 3 && fhVar.f16565ae == 3 && fhVar.f16587u > 0.0f) {
            zArr[0] = false;
            return;
        }
        int d = fhVar.mo10819d();
        if (fhVar.f16564ad != 3 || fhVar.f16565ae == 3 || fhVar.f16587u <= 0.0f) {
            fhVar.f16553T = true;
            if (fhVar instanceof C0988fj) {
                C0988fj fjVar = (C0988fj) fhVar;
                if (fjVar.f16701ai == 1) {
                    int i4 = fjVar.f16699ag;
                    if (i4 == -1) {
                        i2 = fjVar.f16700ah;
                        if (i2 == -1) {
                            i2 = 0;
                        }
                    } else {
                        i3 = i4;
                        i2 = 0;
                    }
                } else {
                    i2 = d;
                    i3 = i2;
                }
                d = i2;
            } else if (fhVar.f16577k.mo10796c() || fhVar.f16575i.mo10796c()) {
                C0985fg fgVar4 = fhVar.f16577k;
                C0985fg fgVar5 = fgVar4.f16487b;
                if (fgVar5 == null || (fgVar3 = fhVar.f16575i.f16487b) == null || (fgVar5 != fgVar3 && ((fhVar3 = fgVar5.f16486a) != fgVar3.f16486a || fhVar3 == fhVar.f16584r))) {
                    C0986fh fhVar4 = null;
                    if (fgVar5 != null) {
                        fhVar2 = fgVar5.f16486a;
                        i = fgVar4.mo10793a() + d;
                        if (!fhVar2.mo10815b() && !fhVar2.f16553T) {
                            mo10841a(fhVar2, zArr);
                        }
                    } else {
                        i = d;
                        fhVar2 = null;
                    }
                    C0985fg fgVar6 = fhVar.f16575i;
                    C0985fg fgVar7 = fgVar6.f16487b;
                    if (fgVar7 != null) {
                        fhVar4 = fgVar7.f16486a;
                        d += fgVar6.mo10793a();
                        if (!fhVar4.mo10815b() && !fhVar4.f16553T) {
                            mo10841a(fhVar4, zArr);
                        }
                    }
                    if (fhVar.f16577k.f16487b != null && !fhVar2.mo10815b()) {
                        int i5 = fhVar.f16577k.f16487b.f16492g;
                        if (i5 == 4) {
                            i += fhVar2.f16547N - fhVar2.mo10819d();
                        } else if (i5 == 2) {
                            i += fhVar2.f16547N;
                        }
                        if (!fhVar2.f16550Q) {
                            if (fhVar2.f16575i.f16487b == null || fhVar2.f16577k.f16487b == null) {
                                z = false;
                                fhVar.f16550Q = z;
                                if (z && ((fgVar2 = fhVar2.f16575i.f16487b) == null || fgVar2.f16486a != fhVar)) {
                                    i += i - fhVar2.f16547N;
                                }
                            } else if (fhVar2.f16564ad == 3) {
                                z = false;
                                fhVar.f16550Q = z;
                                i += i - fhVar2.f16547N;
                            }
                        }
                        z = true;
                        fhVar.f16550Q = z;
                        i += i - fhVar2.f16547N;
                    }
                    if (fhVar.f16575i.f16487b != null && !fhVar4.mo10815b()) {
                        int i6 = fhVar.f16575i.f16487b.f16492g;
                        if (i6 == 2) {
                            d += fhVar4.f16546M - fhVar4.mo10819d();
                        } else if (i6 == 4) {
                            d += fhVar4.f16546M;
                        }
                        if (fhVar4.f16549P || !(fhVar4.f16575i.f16487b == null || fhVar4.f16577k.f16487b == null || fhVar4.f16564ad == 3)) {
                            z2 = true;
                        }
                        fhVar.f16549P = z2;
                        if (z2 && ((fgVar = fhVar4.f16577k.f16487b) == null || fgVar.f16486a != fhVar)) {
                            i3 = d + (d - fhVar4.f16546M);
                            d = i;
                        }
                    }
                    i3 = d;
                    d = i;
                } else {
                    zArr[0] = false;
                    return;
                }
            } else {
                i3 = d + fhVar.f16589w;
            }
            if (fhVar.f16544K == 8) {
                int i7 = fhVar.f16585s;
                i3 -= i7;
                d -= i7;
            }
            fhVar.f16546M = i3;
            fhVar.f16547N = d;
            return;
        }
        zArr[0] = false;
    }
}
