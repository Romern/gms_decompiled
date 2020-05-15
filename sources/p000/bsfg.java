package p000;

import java.util.ArrayList;

/* renamed from: bsfg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsfg extends bsfy {

    /* renamed from: l */
    private static final double f144444l = Math.toRadians(5.0d);

    /* renamed from: a */
    public final Object f144445a = new Object();

    /* renamed from: b */
    protected final bsfm f144446b = new bsfm(this.f144509g);

    /* renamed from: c */
    public final bsfo f144447c;

    /* renamed from: d */
    public final bsfh f144448d;

    /* renamed from: e */
    public final bsfd f144449e;

    /* renamed from: f */
    public final bsfe f144450f;

    /* renamed from: m */
    private final bsfq f144451m = new bsfq(this.f144509g);

    /* renamed from: n */
    private final bsfp f144452n = new bsfp(this.f144509g);

    /* renamed from: o */
    private final bsfn f144453o;

    /* renamed from: p */
    private final bsfl f144454p = new bsfl();

    /* renamed from: q */
    private final bsfk f144455q = new bsfk(this.f144509g, f144444l);

    /* renamed from: r */
    private final bsgr f144456r;

    /* renamed from: s */
    private final bsgr f144457s;

    /* renamed from: t */
    private final bsgp f144458t;

    /* renamed from: u */
    private bsfj f144459u;

    /* renamed from: v */
    private final bsel f144460v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bsfg(bsel bsel, bsfj bsfj) {
        super(bsel.mo70301a(), bsel.mo70302b(), bsel.mo70303c());
        this.f144448d = new bsfh(bsel.mo70295E());
        this.f144453o = new bsfn(this.f144509g, bsel.mo70304d(), bsel.mo70305e());
        this.f144447c = new bsfo(this.f144509g, bsel.mo70309h(), bsel.mo70311i());
        this.f144456r = new bsgr(bsel.mo70307f(), bsel.mo70317o(), bsel.mo70318p());
        this.f144457s = new bsgr(bsel.mo70308g(), bsel.mo70317o(), bsel.mo70318p());
        if (bsel.mo70329z()) {
            this.f144458t = new bsgp(bsel.mo70296F());
        } else {
            this.f144458t = null;
        }
        mo70484a(bsfj);
        if (bsel.mo70327x()) {
            this.f144449e = new bsfd("FLP", bsel.mo70298H(), bsel.mo70299I(), bsel.mo70300J());
        } else {
            this.f144449e = null;
        }
        this.f144450f = new bsfe(bsel.mo70297G());
        this.f144460v = bsel;
    }

    /* renamed from: a */
    public final void mo70484a(bsfj bsfj) {
        this.f144459u = bsfj;
        bsgp bsgp = this.f144458t;
        if (bsgp != null) {
            bsfj.mo70509a(bsgp);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01db, code lost:
        if (r10 == false) goto L_0x01dd;
     */
    /* renamed from: b */
    public final void mo70487b(bsfs bsfs) {
        double d;
        char c;
        double d2;
        boolean z;
        int i;
        bsgm.m115747a();
        this.f144513k.add(bsfs);
        while (!this.f144513k.isEmpty()) {
            this.f144511i.clear();
            this.f144512j.clear();
            synchronized (this.f144445a) {
                d = 0.0d;
                c = 0;
                if (!this.f144513k.isEmpty()) {
                    bsfs bsfs2 = (bsfs) this.f144513k.remove();
                    d2 = bsfs2.f144498d;
                    bsfe bsfe = this.f144450f;
                    if (!bsfe.mo70483a()) {
                        bsfe.f144439b = d2;
                        bsfe.f144442e = d2;
                        bsfe.f144443f = d2;
                    }
                    switch (bsfs2.f144497c) {
                        case 1:
                            this.f144448d.mo70498c(bsfs2);
                            mo70485a(bsfs2);
                            break;
                        case 2:
                            bsfh bsfh = this.f144448d;
                            bsfh.mo70501d(bsfs2);
                            bsfh.mo70490a(bsfs2);
                            mo70485a(this.f144448d.f144468h);
                            mo70485a(bsfs2);
                            break;
                        case 3:
                        default:
                            this.f144448d.mo70490a(bsfs2);
                            break;
                        case 4:
                            bsfh bsfh2 = this.f144448d;
                            bsfh2.f144471k = bsfs2;
                            bsfh2.mo70490a(bsfs2);
                            mo70485a(this.f144448d.f144468h);
                            mo70485a(bsfs2);
                            break;
                        case 5:
                            this.f144448d.mo70490a(bsfs2);
                            this.f144448d.mo70491a(false);
                            this.f144448d.mo70504e(null);
                            mo70485a(bsfs2);
                            break;
                        case 6:
                            this.f144448d.mo70504e(bsfs2);
                            break;
                        case 7:
                            this.f144448d.mo70490a(bsfs2);
                            mo70485a(bsfs2);
                            break;
                        case 8:
                            this.f144448d.mo70498c(((bsfb) bsfs2).f144430a);
                            mo70485a(bsfs2);
                            break;
                        case 9:
                            bsfh bsfh3 = this.f144448d;
                            double d3 = bsfs2.f144498d;
                            bsfh3.f144467g = d3;
                            bsfh3.mo70489a(d3);
                            mo70485a(bsfs2);
                            break;
                    }
                    if (this.f144448d.mo70502d()) {
                        ArrayList arrayList = this.f144511i;
                        bsfo bsfo = this.f144447c;
                        bsfo.f144523d = bsfs2;
                        arrayList.add(bsfo);
                        switch (bsfs2.f144497c) {
                            case 1:
                                ArrayList arrayList2 = this.f144512j;
                                bsgr bsgr = this.f144456r;
                                bsgr.f144528a = bsfs2;
                                arrayList2.add(bsgr);
                                this.f144448d.mo70499c(false);
                                break;
                            case 2:
                                ArrayList arrayList3 = this.f144512j;
                                bsgr bsgr2 = this.f144457s;
                                bsgr2.f144528a = bsfs2;
                                arrayList3.add(bsgr2);
                                break;
                            case 4:
                                ArrayList arrayList4 = this.f144511i;
                                bsfn bsfn = this.f144453o;
                                bsfn.f144523d = bsfs2;
                                arrayList4.add(bsfn);
                                break;
                            case 6:
                                ArrayList arrayList5 = this.f144511i;
                                bsfl bsfl = this.f144454p;
                                bsfl.f144523d = bsfs2;
                                arrayList5.add(bsfl);
                                break;
                            case 7:
                                ArrayList arrayList6 = this.f144511i;
                                bsfk bsfk = this.f144455q;
                                bsfk.f144523d = bsfs2;
                                arrayList6.add(bsfk);
                                break;
                            case 8:
                                bsfb bsfb = (bsfb) bsfs2;
                                if (this.f144460v.mo70319q()) {
                                    if (bsfb.f144430a.mo70516a(2) <= this.f144460v.mo70320r()) {
                                        if (!Double.isNaN(bsfb.mo70516a(0))) {
                                            double s = this.f144460v.mo70321s();
                                            if (this.f144460v.mo70292B() > 0.0d && !Double.isNaN(this.f144448d.f144467g) && bsfb.f144498d - this.f144448d.f144467g < this.f144460v.mo70292B()) {
                                                s = this.f144460v.mo70322t();
                                            }
                                            if (bsfb.mo70516a(0) >= s) {
                                                ArrayList arrayList7 = this.f144511i;
                                                bsfm bsfm = this.f144446b;
                                                bsfm.f144523d = bsfb;
                                                arrayList7.add(bsfm);
                                                bsfw.m115714c(this.f144510h.f144521h.f144503a);
                                                this.f144448d.mo70499c(true);
                                                break;
                                            }
                                        }
                                    }
                                }
                                ArrayList arrayList8 = this.f144512j;
                                bsgr bsgr3 = this.f144456r;
                                bsgr3.f144528a = bsfb.f144430a;
                                arrayList8.add(bsgr3);
                                this.f144448d.mo70499c(false);
                                break;
                            case 9:
                                bsgp bsgp = this.f144458t;
                                if (bsgp != null) {
                                    ArrayList arrayList9 = this.f144512j;
                                    bsgp.f144528a = bsfs2;
                                    arrayList9.add(bsgp);
                                }
                                break;
                        }
                    } else {
                        bsfh bsfh4 = this.f144448d;
                        boolean z2 = (!bsfh4.mo70497b() && !bsfh4.mo70492a()) ? false : bsfh4.f144466f > bsfh4.f144465e + bsfh4.f144461a.mo70345c();
                        if (bsfh4.mo70497b() && bsfh4.mo70492a()) {
                            if (bsfh4.f144468h != null) {
                                bsfh bsfh5 = this.f144448d;
                                if (!bsfh5.f144463c) {
                                    bsfc bsfc = new bsfc(d2, bsfh5.mo70503e(), this.f144448d.mo70505f());
                                    ArrayList arrayList10 = this.f144511i;
                                    bsfq bsfq = this.f144451m;
                                    bsfq.f144523d = bsfc;
                                    arrayList10.add(bsfq);
                                    mo70485a(bsfc);
                                    bsgm.m115747a();
                                    bsfw.m115714c(this.f144510h.f144521h.f144503a);
                                    this.f144448d.mo70496b(true);
                                    this.f144448d.mo70491a(false);
                                }
                                if (!this.f144448d.f144462b) {
                                    this.f144511i.add(this.f144452n);
                                    this.f144448d.mo70491a(true);
                                }
                            }
                        }
                    }
                } else {
                    d2 = Double.NaN;
                }
            }
            bsgb bsgb = this.f144510h;
            ArrayList arrayList11 = this.f144511i;
            ArrayList arrayList12 = this.f144512j;
            bsgb.f144517d = arrayList11;
            bsgb.f144518e = arrayList12;
            bsgb.f144514a = d2;
            for (int i2 = 0; i2 < bsgb.f144517d.size(); i2++) {
                ((bsge) bsgb.f144517d.get(i2)).mo70511a();
            }
            for (int i3 = 0; i3 < bsgb.f144518e.size(); i3++) {
                ((bsgi) bsgb.f144518e.get(i3)).mo70532a();
            }
            bsfu[] bsfuArr = bsgb.f144521h.f144504b;
            int i4 = bsgb.f144515b;
            int length = bsfuArr.length;
            if (i4 == length) {
                int i5 = 0;
                while (i5 < bsgb.f144515b) {
                    bsfu bsfu = bsfuArr[i5];
                    for (int i6 = 0; i6 < bsgb.f144517d.size(); i6++) {
                        ((bsge) bsgb.f144517d.get(i6)).mo70512a(bsfu.f144502a);
                    }
                    double d4 = 1.0d;
                    for (int i7 = 0; i7 < bsgb.f144518e.size(); i7++) {
                        d4 *= ((bsgi) bsgb.f144518e.get(i7)).mo70531a(bsfu.f144502a);
                        if (d4 < 0.0d || Double.isNaN(d4)) {
                            d4 = 0.0d;
                        }
                    }
                    double[] dArr = bsgb.f144521h.f144503a;
                    if (i5 < dArr.length && i5 >= 0 && d4 >= 0.0d) {
                        dArr[i5] = dArr[i5] * d4;
                    }
                    i5++;
                    c = 0;
                }
                bsfv bsfv = bsgb.f144521h;
                double d5 = bsgb.f144516c;
                bsfx bsfx = bsfv.f144507e;
                double[] dArr2 = bsfv.f144503a;
                int[] iArr = bsfv.f144506d;
                if (dArr2 == null) {
                    z = false;
                } else if (iArr == null || d5 < 0.0d) {
                    z = false;
                } else {
                    double d6 = 0.0d;
                    double d7 = 0.0d;
                    for (double d8 : dArr2) {
                        d7 += d8;
                        d6 += d8 * d8;
                    }
                    if (d6 >= 1.0E-100d) {
                        d = (d7 * d7) / d6;
                    }
                    int length2 = dArr2.length;
                    double d9 = (double) length2;
                    Double.isNaN(d9);
                    if (d >= d5 * d9) {
                        double a = bsfw.m115712a(dArr2);
                        Double.isNaN(d9);
                        if (a > 1.0E-99d * d9) {
                            bsfw.m115713b(dArr2);
                            z = false;
                        }
                    }
                    if (length2 != 0 && length2 == iArr.length) {
                        bsfw.m115713b(dArr2);
                        double nextDouble = bsfx.f144508a.nextDouble();
                        Double.isNaN(d9);
                        double d10 = nextDouble / d9;
                        double d11 = dArr2[c];
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            double d12 = (double) i8;
                            if (d12 < d9) {
                                Double.isNaN(d12);
                                Double.isNaN(d9);
                                double d13 = (d12 / d9) + d10;
                                while (d13 > d11) {
                                    i9++;
                                    d11 += dArr2[i9];
                                }
                                iArr[i8] = i9;
                                i8++;
                            } else {
                                bsfw.m115714c(dArr2);
                            }
                        }
                    }
                    z = true;
                }
                if (z) {
                    int i10 = 0;
                    while (true) {
                        int[] iArr2 = bsfv.f144506d;
                        if (i10 < iArr2.length) {
                            bsfu bsfu2 = bsfv.f144505c[i10];
                            bsfu bsfu3 = bsfv.f144504b[iArr2[i10]];
                            bsft bsft = bsfu3.f144502a;
                            if (bsft != null) {
                                if (bsfu2.f144502a == null) {
                                    bsfu2.f144502a = bsft.clone();
                                }
                                bsfu2.f144502a.mo70519a(bsfu3.f144502a);
                            }
                            i10++;
                        } else {
                            bsfu[] bsfuArr2 = bsfv.f144504b;
                            bsfv.f144504b = bsfv.f144505c;
                            bsfv.f144505c = bsfuArr2;
                        }
                    }
                }
                if (z) {
                    ArrayList arrayList13 = bsgb.f144520g;
                    int size = arrayList13.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        ((bsga) arrayList13.get(i11)).mo70523a();
                    }
                    i = 0;
                } else {
                    i = 0;
                }
                while (i < bsgb.f144517d.size()) {
                    ((bsge) bsgb.f144517d.get(i)).mo70513b();
                    i++;
                }
                for (int i12 = 0; i12 < bsgb.f144518e.size(); i12++) {
                    ((bsgi) bsgb.f144518e.get(i12)).mo70533b();
                }
                for (int i13 = 0; i13 < bsgb.f144519f.size(); i13++) {
                    ((bsfz) bsgb.f144519f.get(i13)).mo70261a(bsgb.f144514a, bsgb.f144521h);
                }
                if (z) {
                    for (bsgn bsgn : bsgm.f144529a) {
                    }
                }
                for (bsgn bsgn2 : bsgm.f144529a) {
                }
                for (bsgn bsgn3 : bsgm.f144529a) {
                }
                for (int i14 = 0; i14 < bsgb.f144517d.size(); i14++) {
                    ((bsge) bsgb.f144517d.get(i14)).mo70525c();
                }
                for (int i15 = 0; i15 < bsgb.f144518e.size(); i15++) {
                    ((bsgi) bsgb.f144518e.get(i15)).f144528a = null;
                }
            } else {
                StringBuilder sb = new StringBuilder(64);
                sb.append(" Particle population size ");
                sb.append(length);
                sb.append(" smcf expecting ");
                sb.append(i4);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    /* renamed from: b */
    public final boolean mo70488b() {
        return this.f144449e != null;
    }

    /* renamed from: a */
    public final void mo70485a(bsfs bsfs) {
        bsfs bsfs2;
        int i;
        bsfs bsfs3 = bsfs;
        if (bsfs3 != null) {
            if (mo70488b()) {
                int i2 = bsfs3.f144497c;
                if (i2 == 1 || i2 == 2) {
                    bsfs2 = bsfs3;
                } else if (i2 == 8) {
                    bsfs2 = ((bsfb) bsfs3).f144430a;
                } else {
                    this.f144449e.mo70482a(bsfs3);
                }
                bsfd bsfd = this.f144449e;
                bsfj bsfj = this.f144459u;
                bsfs bsfs4 = null;
                if (bsfj.mo70510a()) {
                    int i3 = bsfs2.f144497c;
                    if (i3 == 1) {
                        i = 101;
                    } else if (i3 == 2) {
                        i = 102;
                    }
                    bsfs4 = new bsfs(i, bsfs2.f144498d, ayuo.m84847b(bsfj.f144473b.mo70228a(bsfs2.mo70516a(1))), ayuo.m84847b(bsfj.f144473b.mo70230b(bsfs2.mo70516a(0))), bsfs2.mo70516a(2), null);
                }
                bsfd.mo70482a(bsfs4);
            }
            bsfe bsfe = this.f144450f;
            if (bsfe.mo70483a()) {
                double d = bsfs3.f144498d;
                int i4 = bsfs3.f144497c;
                if (i4 == 3) {
                    if (!Double.isNaN(bsfe.f144441d)) {
                        bsfe.f144438a.mo62078b(bsgk.m115740b(d - bsfe.f144441d));
                    }
                    bsfe.f144441d = d;
                } else if (i4 == 7) {
                    bsfe.f144438a.mo62079c(bsgk.m115740b(d - bsfe.f144442e));
                    bsfe.f144442e = d;
                } else if (i4 == 9) {
                    bsfe.f144438a.mo62076a();
                } else if (i4 == 100) {
                    bsfe.f144440c = d;
                } else if (i4 == 103) {
                    bsfe.f144438a.mo62080d(bsgk.m115740b(d - bsfe.f144443f));
                    bsfe.f144443f = d;
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo70486a() {
        return this.f144448d.mo70502d();
    }
}
