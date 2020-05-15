package p000;

import com.felicanetworks.sdu.ErrorInfo;
import java.io.PrintWriter;
import java.util.Arrays;

/* renamed from: bsdh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsdh implements bsfz, bsfi, bsct {

    /* renamed from: b */
    static final int[] f144155b = {0, 1, 2};

    /* renamed from: c */
    public static final int[] f144156c = {0, 1};

    /* renamed from: a */
    public final bsel f144157a;

    /* renamed from: d */
    protected final bsfg f144158d;

    /* renamed from: e */
    public final bsfj f144159e;

    /* renamed from: f */
    protected final double[] f144160f = new double[3];

    /* renamed from: g */
    protected final int[] f144161g = new int[2];

    /* renamed from: h */
    protected double f144162h = Double.NEGATIVE_INFINITY;

    /* renamed from: i */
    double f144163i;

    /* renamed from: j */
    private final bsdj f144164j;

    /* renamed from: k */
    private bsbl f144165k;

    /* renamed from: l */
    private final bsen f144166l;

    /* renamed from: m */
    private final double f144167m;

    /* renamed from: n */
    private final boolean f144168n;

    public bsdh(bseb bseb, bsen bsen, bsfj bsfj, bsfg bsfg) {
        bsdn bsdn;
        bsdk bsdk;
        bsdl bsdl;
        bseb bseb2 = bseb;
        bsfg bsfg2 = bsfg;
        bsed bsed = (bsed) bsen;
        bsel bsel = bsed.f144289e;
        this.f144157a = bsel;
        this.f144159e = bsfj;
        bsfj.mo70509a(this);
        this.f144158d = bsfg2;
        bsfg2.mo70484a(this.f144159e);
        this.f144158d.f144510h.mo70524a(this);
        this.f144165k = null;
        this.f144163i = Double.NEGATIVE_INFINITY;
        this.f144166l = bsen;
        this.f144167m = (double) bsgk.m115738a(bsed.f144286b);
        bsel bsel2 = bsed.f144289e;
        this.f144168n = bsel2.mo70329z();
        if (!bsel2.mo70324u()) {
            bsdn = new bsdn(bsfg2, bsel2.mo70328y());
        } else {
            bsdn = null;
        }
        if (!bsel2.mo70324u() && !bsed.f144287c) {
            bsdk = null;
        } else {
            bsdk = new bsdk(bsfg2);
        }
        bsdm bsdm = new bsdm(bsfg, bsfj, bsel2.mo70293C(), bsel2.mo70294D(), bsel2.mo70316n());
        bsdi bsdi = new bsdi(bsfg2);
        if (this.f144168n) {
            bsdl = new bsdl(bsfg2);
        } else {
            bsdl = null;
        }
        this.f144164j = new bsdj(bsdn, bsdk, bsdm, bsdi, bsdl);
        if (bsed.f144287c && bseb2 != null) {
            bseb2.mo62241a(this, this.f144164j);
        }
    }

    /* renamed from: a */
    public static double m115313a(double d) {
        return (-d) + 1.5707963267948966d;
    }

    /* renamed from: a */
    public final bsbl mo70206a() {
        return this.f144165k;
    }

    /* renamed from: a */
    public final void mo70207a(long j, float f) {
    }

    /* renamed from: a */
    public final void mo70210a(long j, bscd bscd) {
    }

    /* renamed from: a */
    public final void mo70211a(long j, bscs bscs) {
    }

    /* renamed from: b */
    public final long mo70214b() {
        return bsgk.m115738a(this.f144162h);
    }

    /* renamed from: c */
    public final void mo70215c() {
        m115315a(true);
    }

    /* renamed from: d */
    public final void mo70216d() {
        m115315a(false);
    }

    /* renamed from: e */
    public final btvl mo70263e() {
        bsdj bsdj = this.f144164j;
        bsdn bsdn = bsdj.f144171a;
        return bsdn == null ? bsdj.f144172b : bsdn;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo70264f() {
        this.f144165k = null;
    }

    /* renamed from: a */
    public static double m115314a(bsfv bsfv) {
        bsfu[] bsfuArr = bsfv.f144504b;
        double[] dArr = bsfv.f144503a;
        double d = 0.0d;
        double d2 = 0.0d;
        for (int i = 0; i < bsfuArr.length; i++) {
            double d3 = bsfuArr[i].f144502a.f144501b[2];
            d2 += dArr[i] * Math.cos(d3);
            d += dArr[i] * Math.sin(d3);
        }
        return bsgl.m115741a(Math.atan2(d, d2));
    }

    /* renamed from: a */
    private final void m115315a(boolean z) {
        if (z) {
            this.f144163i = Double.NEGATIVE_INFINITY;
        }
        this.f144165k = null;
        bsdj bsdj = this.f144164j;
        bsdn bsdn = bsdj.f144171a;
        if (bsdn != null) {
            bsdn.mo70272a();
        }
        bsdk bsdk = bsdj.f144172b;
        if (bsdk != null) {
            bsdk.f144177c = Double.NEGATIVE_INFINITY;
            bsdk.f144178d = 0.0d;
        }
        bsdm bsdm = bsdj.f144173c;
        bsdm.f144182e = null;
        bsdm.f144180c.f144235b.mo70290a();
        bsea bsea = bsdm.f144181d;
        bsea.f144247c.mo70290a();
        bsea.f144248d = Long.MIN_VALUE;
        bsfg bsfg = this.f144158d;
        if (bsfg != null) {
            synchronized (bsfg.f144445a) {
                bsfo bsfo = bsfg.f144447c;
                bsfo.f144486a = Double.NaN;
                bsfo.f144487b = 0;
                bsfv bsfv = bsfg.f144510h.f144521h;
                int i = 0;
                while (true) {
                    bsfu[] bsfuArr = bsfv.f144504b;
                    if (i >= bsfuArr.length) {
                        break;
                    }
                    bsfuArr[i].mo70521a();
                    bsfv.f144505c[i].mo70521a();
                    i++;
                }
                bsfg.f144448d.mo70506g();
                bsfg.f144513k.clear();
                bsfe bsfe = bsfg.f144450f;
                if (!Double.isNaN(bsfe.f144440c)) {
                    bsfe.f144438a.mo62077a((long) ((int) Math.round(bsfe.f144440c - bsfe.f144439b)));
                }
                bsfe.f144439b = Double.NaN;
                bsfe.f144440c = Double.NaN;
                bsfe.f144441d = Double.NaN;
                bsfe.f144442e = Double.NaN;
                bsfe.f144443f = Double.NaN;
                if (z && bsfg.mo70488b()) {
                    bsfg.f144449e.f144433a.clear();
                }
            }
        }
        this.f144159e.f144473b = null;
        double[] dArr = this.f144160f;
        dArr[0] = Double.NaN;
        dArr[1] = Double.NaN;
        int[] iArr = this.f144161g;
        iArr[0] = Integer.MIN_VALUE;
        iArr[1] = Integer.MIN_VALUE;
        this.f144162h = Double.NEGATIVE_INFINITY;
    }

    /* renamed from: a */
    public final int mo70205a(long j, int i) {
        int i2;
        if (!this.f144168n) {
            i2 = 28;
        } else {
            i2 = 92;
        }
        if (!((bsed) this.f144166l).f144285a) {
            return i2 | 1;
        }
        bsfh bsfh = this.f144158d.f144448d;
        boolean z = bsfh.f144464d;
        bsfs bsfs = bsfh.f144469i;
        if (z && (bsfs == null || ((double) Math.abs(j - bsgk.m115738a(bsfs.f144498d))) <= this.f144167m)) {
            return i2;
        }
        return i2 | 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02fe A[LOOP:5: B:135:0x02c8->B:140:0x02fe, LOOP_END] */
    /* renamed from: a */
    public final void mo70261a(double d, bsfv bsfv) {
        double d2;
        float f;
        bsbl bsbl;
        int length;
        boolean z;
        bsfg bsfg;
        bsfg bsfg2;
        double d3 = d;
        bsfv bsfv2 = bsfv;
        if (!this.f144157a.mo70326w()) {
            if (bsfv2 == null || (bsfg2 = this.f144158d) == null || !bsfg2.mo70486a()) {
                return;
            }
        } else if (bsfv2 != null && (bsfg = this.f144158d) != null) {
            if (!bsfg.mo70486a()) {
                mo70264f();
                return;
            }
        } else {
            return;
        }
        if (d3 - this.f144162h > this.f144157a.mo70312j()) {
            int[] iArr = f144155b;
            double[] dArr = this.f144160f;
            bsfu[] bsfuArr = bsfv2.f144504b;
            if (bsfuArr.length != 0) {
                if (bsfuArr[0].f144502a.f144501b.length == dArr.length) {
                    z = true;
                } else {
                    z = false;
                }
                bxbm.m122544b(z);
                Arrays.fill(dArr, 0.0d);
                double d4 = 0.0d;
                for (int i = 0; i < bsfv2.f144504b.length; i++) {
                    d4 += bsfv2.mo70522a(i);
                    double[] dArr2 = bsfv2.f144504b[i].f144502a.f144501b;
                    for (int i2 : iArr) {
                        dArr[i2] = dArr[i2] + (dArr2[i2] * bsfv2.mo70522a(i));
                    }
                }
                for (int i3 : iArr) {
                    dArr[i3] = dArr[i3] / d4;
                }
            }
            bsfg bsfg3 = this.f144158d;
            double[] dArr3 = this.f144160f;
            bsfh bsfh = bsfg3.f144448d;
            if (dArr3 != null) {
                if (bsfh.mo70492a() || bsfh.mo70497b() || bsfh.mo70500c()) {
                    double d5 = Double.NaN;
                    double a = bsfh.mo70497b() ? bsgo.m115750a(dArr3, bsfh.mo70503e()) : Double.NaN;
                    if (bsfh.mo70492a()) {
                        d5 = bsgo.m115750a(dArr3, bsfh.mo70505f());
                    }
                    if (bsfh.mo70497b() && !bsfh.mo70492a() && bsfh.mo70493a(a, bsfh.mo70503e())) {
                        double d6 = bsfh.f144466f;
                        bsgm.m115749c();
                        bsfh.mo70496b(false);
                    } else if (!bsfh.mo70497b() && bsfh.mo70492a() && bsfh.mo70493a(d5, bsfh.mo70505f())) {
                        double d7 = bsfh.f144466f;
                        bsgm.m115749c();
                        bsfh.mo70496b(false);
                    } else if (bsfh.mo70497b() && bsfh.mo70492a()) {
                        bsfs e = bsfh.mo70503e();
                        bsfs f2 = bsfh.mo70505f();
                        if (Math.hypot(e.mo70516a(0) - f2.mo70516a(0), e.mo70516a(1) - f2.mo70516a(1)) > bsfh.f144461a.mo70351h()) {
                            if (bsfh.mo70494a(dArr3, bsfh.mo70503e())) {
                                double d8 = bsfh.f144466f;
                                bsgm.m115749c();
                                bsfh.mo70496b(false);
                            }
                        } else if (bsfh.mo70494a(dArr3, bsfh.mo70503e()) && bsfh.mo70494a(dArr3, bsfh.mo70505f())) {
                            double d9 = bsfh.f144466f;
                            bsgm.m115749c();
                            bsfh.mo70496b(false);
                        }
                    }
                } else {
                    double d10 = bsfh.f144466f;
                    bsgm.m115748b();
                    bsfh.mo70506g();
                }
            }
            if (!this.f144157a.mo70325v() || this.f144158d.mo70486a()) {
                bsfj bsfj = this.f144159e;
                double[] dArr4 = this.f144160f;
                double d11 = dArr4[0];
                double d12 = dArr4[1];
                int[] iArr2 = this.f144161g;
                bxbm.m122545b(iArr2.length == 2, "Passed double[] result must be have length 2!");
                bsbs bsbs = bsfj.f144473b;
                if (bsbs != null) {
                    int a2 = bsbs.mo70228a(d12);
                    int b = bsfj.f144473b.mo70230b(d11);
                    boolean z2 = bsfj.f144474c;
                    if (bsfj.f144473b.mo70226a(d11, d12) > 0.1d) {
                        bsfj.mo70508a(a2, b);
                    }
                    iArr2[0] = a2;
                    iArr2[1] = b;
                    double[] dArr5 = this.f144160f;
                    int[] iArr3 = f144156c;
                    if (!(dArr5 == null || iArr3.length == 0 || (length = dArr5.length) == 0)) {
                        bsfu[] bsfuArr2 = bsfv2.f144504b;
                        if (bsfuArr2.length != 0 && bsfuArr2[0].f144502a.f144501b.length == length) {
                            int i4 = 0;
                            double d13 = 0.0d;
                            double d14 = 0.0d;
                            while (true) {
                                bsfu[] bsfuArr3 = bsfv2.f144504b;
                                if (i4 >= bsfuArr3.length) {
                                    break;
                                }
                                double[] dArr6 = bsfuArr3[i4].f144502a.f144501b;
                                double d15 = 0.0d;
                                for (int i5 : iArr3) {
                                    double d16 = dArr6[i5] - dArr5[i5];
                                    d15 += d16 * d16;
                                }
                                d14 += bsfv2.mo70522a(i4);
                                d13 += bsfv2.mo70522a(i4) * d15;
                                i4++;
                            }
                            d2 = Math.sqrt(d13 / d14);
                            int b2 = (int) bsgk.m115740b(bsgl.m115743a(d2 * this.f144157a.mo70313k(), this.f144157a.mo70314l(), this.f144157a.mo70315m()));
                            if (!((bsed) this.f144166l).f144288d) {
                                f = (float) Math.toDegrees(bsgl.m115744b(m115313a(m115314a(bsfv))));
                            } else {
                                f = (float) Math.toDegrees(m115313a(m115314a(bsfv)));
                            }
                            bsbj o = bsbl.m115064o();
                            int[] iArr4 = this.f144161g;
                            o.mo70178a(iArr4[0], iArr4[1], b2);
                            o.mo70182b(f);
                            bsbl = this.f144164j.f144173c.f144182e;
                            if (bsbl != null) {
                                bsbk bsbk = bsbl.f143965a;
                                if (bsbk != null) {
                                    o.mo70179a(bsbk);
                                }
                                if (bsbl.mo70197j()) {
                                    o.mo70175a(bsbl.f143971g);
                                }
                                if (bsbl.mo70194h()) {
                                    o.mo70184d(bsbl.f143969e);
                                }
                                if (bsbl.mo70198k()) {
                                    o.mo70181b(bsbl.f143972h);
                                }
                            }
                            bsbl a3 = o.mo70174a();
                            this.f144165k = a3;
                            if (!(this.f144158d == null || a3 == null)) {
                                bsgk.m115738a(d);
                                for (bsgn bsgn : bsgm.f144529a) {
                                }
                                if (d3 - this.f144163i > 1.0d) {
                                    this.f144158d.mo70485a(new bsfs(100, d, ayuo.m84847b(a3.f143966b), ayuo.m84847b(a3.f143967c), bsgk.m115739b((long) a3.f143968d), null));
                                    this.f144163i = d3;
                                }
                            }
                            this.f144162h = d3;
                            return;
                        }
                    }
                    d2 = 0.0d;
                    int b22 = (int) bsgk.m115740b(bsgl.m115743a(d2 * this.f144157a.mo70313k(), this.f144157a.mo70314l(), this.f144157a.mo70315m()));
                    if (!((bsed) this.f144166l).f144288d) {
                    }
                    bsbj o2 = bsbl.m115064o();
                    int[] iArr42 = this.f144161g;
                    o2.mo70178a(iArr42[0], iArr42[1], b22);
                    o2.mo70182b(f);
                    bsbl = this.f144164j.f144173c.f144182e;
                    if (bsbl != null) {
                    }
                    bsbl a32 = o2.mo70174a();
                    this.f144165k = a32;
                    bsgk.m115738a(d);
                    while (r2.hasNext()) {
                    }
                    if (d3 - this.f144163i > 1.0d) {
                    }
                    this.f144162h = d3;
                    return;
                }
                return;
            }
            mo70264f();
        }
    }

    /* renamed from: a */
    public final void mo70208a(long j, float f, float f2) {
        this.f144164j.f144175e.mo31163m(j);
    }

    /* renamed from: a */
    public final void mo70209a(long j, bsbl bsbl) {
        this.f144164j.f144173c.mo70271a(1, j, bsbl);
    }

    /* renamed from: a */
    public final void mo70212a(long j, bsde bsde) {
        bsfa bsfa;
        bsde bsde2 = bsde;
        if (this.f144168n && this.f144164j.f144174d != null) {
            if (bsgk.m115737a(mo70214b() - j) < ((bsed) this.f144166l).f144289e.mo70291A()) {
                bsdl bsdl = this.f144164j.f144174d;
                if (!bsde2.f144152a.isEmpty()) {
                    int size = bsde2.f144152a.size();
                    double[] dArr = new double[size];
                    for (int i = 0; i < size; i++) {
                        dArr[i] = ((bsdd) bsde2.f144152a.get(i)).f144151c;
                    }
                    double d = -1.7976931348623157E308d;
                    for (int i2 = 0; i2 < size; i2++) {
                        d = Math.max(dArr[i2], d);
                    }
                    double d2 = 0.0d;
                    for (int i3 = 0; i3 < size; i3++) {
                        double exp = Math.exp(Math.max(bsdl.f144179c, dArr[i3] - d));
                        dArr[i3] = exp;
                        d2 += exp;
                    }
                    for (int i4 = 0; i4 < size; i4++) {
                        dArr[i4] = dArr[i4] / d2;
                    }
                    bngs bngs = new bngs();
                    bsey bsey = new bsey();
                    for (int i5 = 0; i5 < bsde2.f144152a.size(); i5++) {
                        bsdd bsdd = (bsdd) bsde2.f144152a.get(i5);
                        double d3 = bsdd.f144149a;
                        double d4 = bsdd.f144150b;
                        bsey.f144421a = Math.toDegrees(d3);
                        bsey.f144422b = Math.toDegrees(d4);
                        bsey.f144423c = 0.0d;
                        bsey.f144424d = dArr[i5];
                        bmxy.m108588a(!Double.isNaN(bsey.f144421a));
                        bmxy.m108588a(!Double.isNaN(bsey.f144422b));
                        bmxy.m108588a(!Double.isNaN(bsey.f144423c));
                        bngs.mo67668c(new bsez(bsey.f144421a, bsey.f144422b, bsey.f144424d));
                    }
                    bsfa = new bsfa(bsgk.m115737a(j), bngs.mo67664a(), bsde2.f144153b);
                } else {
                    bsfa = null;
                }
                if (bsfa != null) {
                    bsdl.mo70266a(bsfa);
                    return;
                }
                return;
            }
            for (bsgn bsgn : bsgm.f144529a) {
            }
        }
    }

    /* renamed from: a */
    public final void mo70213a(long j, PrintWriter printWriter) {
        bsfg bsfg;
        if (printWriter != null && (bsfg = this.f144158d) != null) {
            synchronized (bsfg.f144445a) {
                bsfh bsfh = bsfg.f144448d;
                printWriter.printf("  Attitude initialized: %b%n", Boolean.valueOf(bsfh.f144462b));
                printWriter.printf("  Position initialized: %b%n", Boolean.valueOf(bsfh.f144463c));
                printWriter.printf("  Last GNSS valid: %b%n", Boolean.valueOf(bsfh.mo70497b()));
                printWriter.printf("  Last WiFi valid: %b%n", Boolean.valueOf(bsfh.mo70492a()));
                printWriter.printf("  Last Step valid: %b%n", Boolean.valueOf(bsfh.mo70500c()));
                if (bsfg.mo70488b()) {
                    bsfg.f144449e.mo70481a(j, printWriter);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo70262a(bsbs bsbs, bsbs bsbs2) {
        for (bsgn bsgn : bsgm.f144529a) {
        }
        if (bsbs != null) {
            bsfg bsfg = this.f144158d;
            bsfh bsfh = bsfg.f144448d;
            bsfh.mo70495b(bsfj.m115683a(bsfh.f144469i, bsbs, bsbs2));
            bsfh bsfh2 = bsfg.f144448d;
            bsfh2.mo70501d(bsfj.m115683a(bsfh2.f144470j, bsbs, bsbs2));
            for (bsfu bsfu : bsfg.f144510h.f144521h.f144504b) {
                double[] dArr = bsfu.f144502a.f144501b;
                dArr[0] = bsbs2.mo70229b(bsbs.mo70230b(dArr[0]));
                dArr[1] = bsbs2.mo70227a(bsbs.mo70228a(dArr[1]));
            }
            if (!Double.isNaN(bsfg.f144448d.f144466f)) {
                bsfg.mo70485a(new bsfs(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, bsfg.f144448d.f144466f, ayuo.m84847b(bsbs2.f144005a), ayuo.m84847b(bsbs2.f144006b), 0.0d, null));
            }
        }
    }
}
