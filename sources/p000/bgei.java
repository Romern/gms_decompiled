package p000;

import com.google.android.location.utils.ParcelableByteArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: bgei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgei {

    /* renamed from: L */
    private static final bfmq f116234L = new bfmq(20000);

    /* renamed from: A */
    public boolean f116235A;

    /* renamed from: B */
    public int f116236B;

    /* renamed from: C */
    public int f116237C;

    /* renamed from: D */
    public int f116238D;

    /* renamed from: E */
    public boolean f116239E;

    /* renamed from: F */
    boolean f116240F = false;

    /* renamed from: G */
    final bfnf f116241G;

    /* renamed from: H */
    public final bgec f116242H = new bgeh(this);

    /* renamed from: I */
    public final bfmm f116243I;

    /* renamed from: J */
    public final bgeb f116244J;

    /* renamed from: K */
    public bgjm f116245K;

    /* renamed from: M */
    private final bgef f116246M;

    /* renamed from: N */
    private long f116247N = 0;

    /* renamed from: O */
    private bfnc f116248O = null;

    /* renamed from: a */
    public final bgnp f116249a;

    /* renamed from: b */
    final bfcn f116250b;

    /* renamed from: c */
    public final bgej f116251c;

    /* renamed from: d */
    public bfmx f116252d;

    /* renamed from: e */
    public final bgdy f116253e;

    /* renamed from: f */
    protected bfnb f116254f = new bfnb(null, null);

    /* renamed from: g */
    public long f116255g = 0;

    /* renamed from: h */
    public long f116256h = 0;

    /* renamed from: i */
    public boolean f116257i;

    /* renamed from: j */
    protected boolean f116258j = false;

    /* renamed from: k */
    boolean f116259k = false;

    /* renamed from: l */
    public boolean f116260l = false;

    /* renamed from: m */
    public boolean f116261m;

    /* renamed from: n */
    protected final bfmu f116262n;

    /* renamed from: o */
    public long f116263o = -1;

    /* renamed from: p */
    protected boolean f116264p = false;

    /* renamed from: q */
    protected long f116265q = -1;

    /* renamed from: r */
    protected long f116266r = -1;

    /* renamed from: s */
    public final bfmq f116267s = new bfmq(30000);

    /* renamed from: t */
    public long f116268t = -1;

    /* renamed from: u */
    public int f116269u = 0;

    /* renamed from: v */
    public boolean f116270v = false;

    /* renamed from: w */
    public boolean f116271w = false;

    /* renamed from: x */
    public long f116272x = -1;

    /* renamed from: y */
    public bfnv f116273y;

    /* renamed from: z */
    bfnv[] f116274z;

    public bgei(bgnp bgnp, bgdy bgdy, bfnf bfnf, bgef bgef, bfmm bfmm, bfcn bfcn, bgej bgej) {
        this.f116249a = bgnp;
        this.f116253e = bgdy;
        this.f116241G = bfnf;
        this.f116246M = bgef;
        this.f116243I = bfmm;
        this.f116252d = new bfmx(Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE);
        this.f116244J = new bgeb();
        this.f116262n = new bfmu();
        this.f116250b = bfcn;
        this.f116251c = bgej;
        this.f116273y = bfnv.m97363a(-20000L);
    }

    /* renamed from: a */
    private final void m98697a(boolean z, int i, long j) {
        this.f116249a.mo62760o().mo62051a(bfos.WIFI_BATCH_MODE_CHANGED, z ? 1 : 0, i, (int) j);
    }

    /* renamed from: a */
    public final boolean mo62713a() {
        return this.f116265q > this.f116266r;
    }

    /* renamed from: b */
    public final boolean mo62714b() {
        long j = this.f116272x;
        return j != -1 && this.f116271w && j > this.f116256h;
    }

    /* renamed from: a */
    public final void mo62709a(long j) {
        this.f116266r = j;
        this.f116265q = Math.min(this.f116265q, j - 1);
        this.f116249a.mo62756k().mo62925c(bgnq.LOCATOR);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgei.a(boolean, int, long):void
     arg types: [int, int, int]
     candidates:
      bgei.a(bgmk, bfmx, boolean):void
      bgei.a(bgmk, boolean, boolean):void
      bgei.a(bgmk, bfnv[], boolean):void
      bgei.a(boolean, int, long):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgei.a(boolean, int, long):void
     arg types: [int, int, long]
     candidates:
      bgei.a(bgmk, bfmx, boolean):void
      bgei.a(bgmk, boolean, boolean):void
      bgei.a(bgmk, bfnv[], boolean):void
      bgei.a(boolean, int, long):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgei.a(bgmk, bfnv[], boolean):void
     arg types: [bgmk, ?[OBJECT, ARRAY], int]
     candidates:
      bgei.a(boolean, int, long):void
      bgei.a(bgmk, bfmx, boolean):void
      bgei.a(bgmk, boolean, boolean):void
      bgei.a(bgmk, bfnv[], boolean):void */
    /* renamed from: a */
    public final void mo62710a(bgmk bgmk, bfmx bfmx, boolean z) {
        long c = bgmk.mo62776c();
        String valueOf = String.valueOf(bfmx);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
        sb.append("PassivePos: setPeriod, locatorParams: ");
        sb.append(valueOf);
        sb.toString();
        bfmx bfmx2 = this.f116252d;
        boolean z2 = this.f116270v;
        boolean z3 = this.f116271w;
        if ((!z2 && !z3) || !bfmx.mo61963b()) {
            bfmx.f114441g = bfmx2.f114441g;
        } else {
            bfmx.f114441g = Math.min(bfmx2.f114441g, !z ? bfmx.mo61960a(c) : 0);
        }
        if (z2 && bfmx.mo61964c()) {
            bfmx.f114440f = Math.min(bfmx.f114440f, !z ? bfmx.mo61962b(c) : 0);
        } else {
            bfmx.f114440f = bfmx2.f114440f;
        }
        bfmx bfmx3 = this.f116252d;
        this.f116252d = bfmx;
        boolean z4 = this.f116271w && bfmx.mo61965d();
        boolean a = this.f116249a.mo62759n().mo62803a();
        this.f116235A = !z4 ? false : a;
        if (a && bfmx3.mo61965d()) {
            m98697a(false, 0, 0L);
            bgnx n = this.f116249a.mo62759n();
            long j = bfmx3.f114435a;
            boolean z5 = bfmx3.f114442h;
            bgmj bgmj = bfmx3.f114439e;
            n.mo62801a(false, j, 0, z5);
        }
        if (this.f116235A) {
            this.f116249a.mo62759n().mo62804b();
            m98697a(true, this.f116252d.mo61966e(), this.f116252d.f114435a);
            bgnx n2 = this.f116249a.mo62759n();
            bfmx bfmx4 = this.f116252d;
            long j2 = bfmx4.f114435a;
            int e = bfmx4.mo61966e();
            bfmx bfmx5 = this.f116252d;
            boolean z6 = bfmx5.f114442h;
            bgmj bgmj2 = bfmx5.f114439e;
            n2.mo62801a(true, j2, e, z6);
        }
        mo62712a(bgmk, (bfnv[]) null, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgei.a(bgmk, bfnv[], boolean):void
     arg types: [bgmk, ?[OBJECT, ARRAY], int]
     candidates:
      bgei.a(boolean, int, long):void
      bgei.a(bgmk, bfmx, boolean):void
      bgei.a(bgmk, boolean, boolean):void
      bgei.a(bgmk, bfnv[], boolean):void */
    /* renamed from: a */
    public final void mo62711a(bgmk bgmk, boolean z, boolean z2) {
        boolean z3;
        boolean z4 = z;
        boolean z5 = z2;
        bfmx bfmx = this.f116252d;
        long c = bgmk.mo62776c();
        boolean z6 = this.f116270v;
        boolean z7 = this.f116271w;
        boolean z8 = true;
        if (z6) {
            z3 = true;
        } else {
            z3 = z7;
        }
        if (!z4 && !z5) {
            z8 = false;
        }
        if (z3 != z8) {
            if (!z8 || !bfmx.mo61963b()) {
                bfmx.f114441g = Long.MAX_VALUE;
            } else {
                bfmx.f114441g = c - 1;
            }
        }
        if (z6 != z4) {
            if (!z4 || !bfmx.mo61964c()) {
                bfmx.f114440f = Long.MAX_VALUE;
            } else {
                bfmx.f114440f = c - 1;
            }
        }
        this.f116270v = z4;
        this.f116271w = z5;
        mo62712a(bgmk, (bfnv[]) null, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0327, code lost:
        if (r11 < (r5 * 0.9d)) goto L_0x032d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x014f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0356 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0369  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0374  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x039b  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x0500  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x052b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x0598  */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x05ac  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x060d  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x0615  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x0617  */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x0633  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0655  */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x0657  */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x0675  */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x0677  */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x0684  */
    /* JADX WARNING: Removed duplicated region for block: B:438:0x0686  */
    /* JADX WARNING: Removed duplicated region for block: B:446:0x0697  */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x0699  */
    /* JADX WARNING: Removed duplicated region for block: B:452:0x06a2  */
    /* JADX WARNING: Removed duplicated region for block: B:456:0x06ae  */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x06b0  */
    /* JADX WARNING: Removed duplicated region for block: B:460:0x06b5  */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x06c6  */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x06c8  */
    /* JADX WARNING: Removed duplicated region for block: B:472:0x06d4  */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x06d6  */
    /* JADX WARNING: Removed duplicated region for block: B:480:0x06e4  */
    /* JADX WARNING: Removed duplicated region for block: B:481:0x06e6  */
    /* JADX WARNING: Removed duplicated region for block: B:487:0x06f1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:490:0x06f7  */
    /* JADX WARNING: Removed duplicated region for block: B:491:0x06f9  */
    /* JADX WARNING: Removed duplicated region for block: B:494:0x0700  */
    /* JADX WARNING: Removed duplicated region for block: B:498:0x0708  */
    /* JADX WARNING: Removed duplicated region for block: B:499:0x070a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:502:0x0711 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:505:0x0717  */
    /* JADX WARNING: Removed duplicated region for block: B:506:0x0719  */
    /* JADX WARNING: Removed duplicated region for block: B:509:0x071e  */
    /* JADX WARNING: Removed duplicated region for block: B:510:0x073b  */
    /* JADX WARNING: Removed duplicated region for block: B:512:0x0740  */
    /* JADX WARNING: Removed duplicated region for block: B:515:0x0746  */
    /* JADX WARNING: Removed duplicated region for block: B:518:0x0752  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:524:0x0766  */
    /* JADX WARNING: Removed duplicated region for block: B:527:0x077b  */
    /* JADX WARNING: Removed duplicated region for block: B:529:0x078c  */
    /* JADX WARNING: Removed duplicated region for block: B:532:0x07a1  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:587:0x0913  */
    /* JADX WARNING: Removed duplicated region for block: B:590:0x0927  */
    /* JADX WARNING: Removed duplicated region for block: B:591:0x092b  */
    /* JADX WARNING: Removed duplicated region for block: B:595:0x093e  */
    /* JADX WARNING: Removed duplicated region for block: B:608:0x0983 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:684:0x0afe  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00de A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:765:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0129  */
    /* renamed from: a */
    public final void mo62712a(bgmk bgmk, bfnv[] bfnvArr, boolean z) {
        bfnv bfnv;
        boolean z2;
        long j;
        boolean z3;
        long j2;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        long j3;
        boolean z8;
        boolean z9;
        boolean z10;
        ArrayList arrayList;
        boolean z11;
        boolean z12;
        long j4;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int size;
        boolean z17;
        boolean z18;
        boolean z19;
        bfnb bfnb;
        boolean z20;
        bgeb bgeb;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean a;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z30;
        boolean z31;
        boolean z32;
        long j5;
        long j6;
        boolean z33;
        boolean z34;
        long j7;
        boolean z35;
        long j8;
        long j9;
        int i;
        bfnc[] bfncArr;
        long j10;
        long j11;
        int i2;
        int i3;
        int i4;
        int i5;
        char c;
        boolean z36;
        boolean z37;
        boolean z38;
        bfni bfni;
        long j12;
        bfni bfni2;
        bfni bfni3;
        boolean z39;
        bfnv[] bfnvArr2;
        String str;
        ArrayList arrayList2;
        boolean z40;
        bfns bfns;
        boolean z41;
        bfml bfml;
        boolean z42;
        bfml bfml2;
        bfnv bfnv2;
        int i6;
        bfoa bfoa;
        bfmq bfmq;
        long j13;
        bfmq bfmq2;
        bfoa bfoa2;
        int i7;
        boolean z43;
        long j14;
        int i8;
        bfni bfni4;
        bfmz bfmz;
        boolean z44;
        boolean z45;
        boolean z46;
        bfnv[] bfnvArr3;
        bfml bfml3;
        int length;
        bfnv[] bfnvArr4 = bfnvArr;
        long c2 = bgmk.mo62776c();
        if (bfnvArr4 == null || (length = bfnvArr4.length) == 0) {
            bfnv = null;
        } else {
            bfnv = bfnvArr4[length - 1];
        }
        if (bfnv != null) {
            this.f116273y = bfnv;
            this.f116274z = bfnvArr4;
        }
        bfcn bfcn = this.f116250b;
        if (bfcn.f114296i) {
            long b = bfcn.f113403b.mo62775b();
            if (b - bfcn.f113405d >= 3600000) {
                bfcn.mo61398a(b);
            }
        }
        long j15 = c2 - this.f116265q;
        long j16 = c2 - this.f116256h;
        bfmn bfmn = this.f116267s.f114425a;
        bfmx bfmx = this.f116252d;
        long j17 = bfmx.f114441g;
        long j18 = bfmx.f114440f;
        if (c2 >= j17 || c2 >= j18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bfmn == null || !bfmn.mo61950e()) {
            j = j15;
        } else {
            j = j15;
            if (c2 - bfmn.f114417g < 20000) {
                z3 = true;
                if (mo62714b() && c2 - this.f116272x > 5000) {
                    this.f116256h = c2;
                }
                if (j16 >= 20000) {
                    j2 = j17;
                    if (this.f116255g == 0) {
                        z4 = true;
                    } else if (this.f116256h > this.f116247N) {
                        z4 = true;
                    }
                    if (z3 && this.f116243I.mo61946b()) {
                        bfml3 = this.f116254f.f114458c;
                        if (bfmn != (bfml3 != null ? bfml3.f114406b : null)) {
                            z5 = true;
                            z6 = !z2 && this.f116270v && !this.f116257i && this.f116249a.mo62749d().mo62773a();
                            if (c2 >= j2 && this.f116271w) {
                                if (!this.f116257i) {
                                    z7 = false;
                                } else if (!z4 || 20000 - j16 < 200) {
                                    z7 = true;
                                }
                                boolean z47 = z3;
                                if (!z6) {
                                    j3 = j18;
                                    long j19 = this.f116268t;
                                    if (j19 == -1) {
                                        z8 = false;
                                    } else if (bfmn != null && j19 <= bfmn.f114417g) {
                                        z8 = false;
                                    }
                                    boolean z48 = !z7 || mo62714b();
                                    boolean z49 = z8 ? false : z6 || c2 - this.f116268t < 5000;
                                    boolean z50 = !z49 ? true : z48 ? false : z7 || ((c2 - this.f116272x) > 5000 ? 1 : ((c2 - this.f116272x) == 5000 ? 0 : -1)) < 0;
                                    if ((!z5 && !z4) || z50) {
                                        if (!this.f116271w) {
                                            z9 = false;
                                        } else if (!z47 || z49) {
                                            z9 = false;
                                        }
                                        z10 = z ? true : ((z2 || this.f116258j) && z9) || this.f116239E;
                                        arrayList = new ArrayList();
                                        if (z10) {
                                            boolean z51 = (((int) ceze.m138468m()) & 4) != 0 && this.f116252d.mo61965d();
                                            if (!z51) {
                                                bfnv[] bfnvArr5 = this.f116274z;
                                                if (bfnvArr5 == null) {
                                                    z16 = z6;
                                                    z13 = z7;
                                                    z37 = z51;
                                                    z38 = false;
                                                } else {
                                                    if (bfnvArr5.length > 0) {
                                                        z37 = z51;
                                                        this.f116247N = this.f116256h;
                                                        z16 = z6;
                                                        z13 = z7;
                                                        z51 = z37;
                                                    } else {
                                                        z37 = z51;
                                                        z16 = z6;
                                                        z13 = z7;
                                                    }
                                                    z38 = false;
                                                }
                                            } else {
                                                z37 = z51;
                                                if (!z4 && !this.f116239E) {
                                                    this.f116274z = new bfnv[]{bfnv.m97363a(c2)};
                                                }
                                                if (z) {
                                                    z45 = z6;
                                                    z46 = z7;
                                                } else if (this.f116235A || (bfnvArr3 = this.f116274z) == null) {
                                                    z45 = z6;
                                                    z46 = z7;
                                                } else {
                                                    bmxy.m108581a(bfnvArr3);
                                                    bfnv[] bfnvArr6 = this.f116274z;
                                                    int length2 = bfnvArr6.length;
                                                    int i9 = 0;
                                                    boolean z52 = false;
                                                    while (i9 < length2) {
                                                        boolean z53 = z6;
                                                        boolean z54 = z7;
                                                        bfnv bfnv3 = bfnvArr6[i9];
                                                        if (bfnv3 != null) {
                                                            this.f116241G.f114469a.add(bfnv3);
                                                            int a2 = this.f116241G.mo61972a();
                                                            StringBuilder sb = new StringBuilder(48);
                                                            sb.append("BATCH: appending a scan, size is now ");
                                                            sb.append(a2);
                                                            sb.toString();
                                                            z52 = true;
                                                        }
                                                        i9++;
                                                        z6 = z53;
                                                        z7 = z54;
                                                    }
                                                    bfnf bfnf = this.f116241G;
                                                    ArrayList arrayList3 = new ArrayList(bfnf.mo61972a());
                                                    bgda bgda = (bgda) bfnf;
                                                    ArrayList arrayList4 = bgda.f114469a;
                                                    int size2 = arrayList4.size();
                                                    z45 = z6;
                                                    int i10 = 0;
                                                    while (i10 < size2) {
                                                        bfnv bfnv4 = (bfnv) arrayList4.get(i10);
                                                        arrayList3.add(new ParcelableByteArray(bfnv4.mo62010d(bfnv4.mo62006b())));
                                                        i10++;
                                                        arrayList4 = arrayList4;
                                                        size2 = size2;
                                                        z7 = z7;
                                                    }
                                                    z46 = z7;
                                                    bgda.f116089b.mo25064a(arrayList3);
                                                    if (z52) {
                                                        this.f116247N = this.f116256h;
                                                    }
                                                    this.f116274z = null;
                                                }
                                                if (this.f116241G.mo61972a() >= this.f116252d.mo61966e() || this.f116239E) {
                                                    z44 = true;
                                                } else {
                                                    z44 = false;
                                                }
                                                boolean z55 = this.f116235A;
                                                if (z55) {
                                                    z38 = true;
                                                } else {
                                                    z38 = z44 || z;
                                                }
                                                if (!z && z38) {
                                                    if (!z55) {
                                                        ArrayList arrayList5 = this.f116241G.f114469a;
                                                        bfnv[] bfnvArr7 = (bfnv[]) arrayList5.toArray(new bfnv[arrayList5.size()]);
                                                        this.f116274z = bfnvArr7;
                                                        int length3 = bfnvArr7.length;
                                                        StringBuilder sb2 = new StringBuilder(48);
                                                        sb2.append("BATCH: unpack list of scans, size is ");
                                                        sb2.append(length3);
                                                        sb2.toString();
                                                        this.f116241G.mo61973b();
                                                    }
                                                    z51 = true;
                                                } else {
                                                    z51 = true;
                                                }
                                            }
                                            bfnb bfnb2 = this.f116254f;
                                            if (bfnb2 == null || (bfmz = bfnb2.f114456a) == null) {
                                                j12 = -1;
                                                bfni = null;
                                            } else {
                                                bfni = bfmz.f114449c;
                                                j12 = bfmz.f114451e;
                                            }
                                            bgjm bgjm = this.f116245K;
                                            if (bgjm != null) {
                                                z15 = z48;
                                                z14 = z10;
                                                if (c2 - bgjm.f116616b < 90000) {
                                                    z12 = z8;
                                                    bfni2 = new bfni(ayuo.m84849b(bgjm.mo62896b()), ayuo.m84849b(bgjm.mo62897c()), (int) (bgjm.mo62895a() * 1000.0f));
                                                    if (bfni != null || c2 - j12 >= 90000) {
                                                        bfni4 = bfni2;
                                                    } else {
                                                        int i11 = bfni.f114482d;
                                                        if (bfni2 != null) {
                                                            double d = (double) i11;
                                                            bfni4 = bfni2;
                                                            double d2 = (double) bfni2.f114482d;
                                                            Double.isNaN(d2);
                                                        }
                                                        if (bfni != null) {
                                                            int i12 = bfni.f114482d;
                                                            if (i12 >= 500000) {
                                                                i8 = i12 < 10000000 ? 50000000 : 100000000;
                                                            } else {
                                                                i8 = 4000000;
                                                            }
                                                            bfni3 = new bfni(bfni.f114480b, bfni.f114481c, i8);
                                                        } else {
                                                            bfni3 = null;
                                                        }
                                                        if ((c2 >= j3 && !z2) || this.f116259k) {
                                                            z39 = true;
                                                        } else {
                                                            z39 = false;
                                                        }
                                                        this.f116262n.mo61957a();
                                                        if (j16 >= 20000) {
                                                            bfnvArr2 = this.f116274z;
                                                        } else {
                                                            bfnvArr2 = null;
                                                        }
                                                        if (ceze.m138462g()) {
                                                            this.f116250b.mo61402a(bfnvArr2, z51);
                                                        }
                                                        bgdy bgdy = this.f116253e;
                                                        bfmq bfmq3 = z5 ? f116234L : this.f116267s;
                                                        bfmu bfmu = this.f116262n;
                                                        if (bfnvArr2 == null) {
                                                            int length4 = bfnvArr2.length;
                                                            StringBuilder sb3 = new StringBuilder(18);
                                                            sb3.append("length ");
                                                            sb3.append(length4);
                                                            str = sb3.toString();
                                                        } else {
                                                            str = "NONE";
                                                        }
                                                        String valueOf = String.valueOf(bfmq3);
                                                        j4 = c2;
                                                        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 66 + String.valueOf(valueOf).length());
                                                        sb4.append("batchMode is ");
                                                        sb4.append(z51);
                                                        sb4.append(", scans is ");
                                                        sb4.append(str);
                                                        sb4.append(" cellStatus is ");
                                                        sb4.append(valueOf);
                                                        sb4.append(" batchExpired is ");
                                                        sb4.append(z38);
                                                        sb4.toString();
                                                        if (!z51) {
                                                            bfmi bfmi = bgdy.f116202c;
                                                            if (bfnvArr2 != null && bfnvArr2.length > 0) {
                                                                int size3 = bfmi.f114399a.size();
                                                                if (size3 != 0) {
                                                                    j14 = ((bfoa) bfmi.f114399a.get(size3 - 1)).mo62009d();
                                                                } else {
                                                                    j14 = 0;
                                                                }
                                                                for (bfnv bfnv5 : bfnvArr2) {
                                                                    long d3 = bfnv5.mo62009d();
                                                                    if (j14 < d3) {
                                                                        bfmi.f114399a.add(bfnv5);
                                                                    } else if (j14 <= d3) {
                                                                    }
                                                                    j14 = d3;
                                                                }
                                                            }
                                                            if (!(bfmq3 == null || bfmq3.f114425a == null)) {
                                                                long a3 = bfmq3.mo61955a();
                                                                int size4 = bfmi.f114400b.size();
                                                                if (size4 == 0 || ((bfmq) bfmi.f114400b.get(size4 - 1)).mo61955a() < a3) {
                                                                    bfmi.f114400b.add(bfmq3.clone());
                                                                }
                                                            }
                                                            bfmi.f114401c = bfni3;
                                                            bfmi.f114402d = z39;
                                                            if (bfnvArr2 != null) {
                                                                i6 = bfnvArr2.length;
                                                            } else {
                                                                i6 = 0;
                                                            }
                                                            arrayList2 = new ArrayList(i6);
                                                            if (z38) {
                                                                bfmi bfmi2 = bgdy.f116202c;
                                                                bfmh bfmh = new bfmh(bgdy, bfmu, arrayList2);
                                                                boolean z56 = bfmi2.f114399a.size() == 0 && bfmi2.f114400b.size() == 0;
                                                                int i13 = 0;
                                                                int i14 = 0;
                                                                while (!z56) {
                                                                    if (i14 < bfmi2.f114399a.size()) {
                                                                        bfoa = (bfoa) bfmi2.f114399a.get(i14);
                                                                    } else {
                                                                        bfoa = null;
                                                                    }
                                                                    if (i13 < bfmi2.f114400b.size()) {
                                                                        bfmq = (bfmq) bfmi2.f114400b.get(i13);
                                                                    } else {
                                                                        bfmq = null;
                                                                    }
                                                                    long j20 = Long.MAX_VALUE;
                                                                    if (bfoa != null) {
                                                                        j13 = bfoa.mo62009d();
                                                                    } else {
                                                                        j13 = Long.MAX_VALUE;
                                                                    }
                                                                    if (bfmq != null) {
                                                                        j20 = bfmq.mo61955a();
                                                                    }
                                                                    if (Math.abs(j13 - j20) < 20000) {
                                                                        i13++;
                                                                        bfmq2 = bfmq;
                                                                        bfoa2 = bfoa;
                                                                        i7 = i14 + 1;
                                                                    } else if (j13 >= j20) {
                                                                        i13++;
                                                                        bfmq2 = bfmq;
                                                                        i7 = i14;
                                                                        bfoa2 = null;
                                                                    } else {
                                                                        bfoa2 = bfoa;
                                                                        i7 = i14 + 1;
                                                                        bfmq2 = null;
                                                                    }
                                                                    if (i13 == bfmi2.f114400b.size() && i7 == bfmi2.f114399a.size()) {
                                                                        z43 = true;
                                                                    } else {
                                                                        z43 = false;
                                                                    }
                                                                    if (z43) {
                                                                        bfmh.mo61922a(bfoa2, bfmq2, bfmi2.f114401c, bfmi2.f114402d);
                                                                    } else {
                                                                        bfmh.mo61922a(bfoa2, bfmq2, null, false);
                                                                    }
                                                                    i14 = i7;
                                                                    z56 = z43;
                                                                }
                                                            }
                                                        } else {
                                                            if (bfnvArr2 == null || bfnvArr2.length == 0) {
                                                                bfnv2 = null;
                                                            } else {
                                                                bfnv2 = bfnvArr2[0];
                                                            }
                                                            ArrayList arrayList6 = new ArrayList(1);
                                                            arrayList6.add(bgdy.mo62696a(bfnv2, bfmq3, bfmu, bfni3, z39));
                                                            arrayList2 = arrayList6;
                                                        }
                                                        if (!cewj.m138361d() || !z) {
                                                            z40 = z51;
                                                        } else {
                                                            int i15 = 0;
                                                            while (i15 < arrayList2.size()) {
                                                                bfnb bfnb3 = (bfnb) arrayList2.get(i15);
                                                                bfns bfns2 = bfnb3.f114457b;
                                                                bfml bfml4 = bfnb3.f114458c;
                                                                bfmz bfmz2 = bfnb3.f114456a;
                                                                if (bfns2 == null || bfns2.f114450d != bfmy.CACHE_MISS) {
                                                                    bfns = bfns2;
                                                                    z41 = false;
                                                                } else {
                                                                    bfns = bfns.m97357a(bfmy.GLS_ERROR, bfns2.f114451e, bfns2.f114509b);
                                                                    z41 = true;
                                                                }
                                                                if (bfml4 == null || bfml4.f114450d != bfmy.CACHE_MISS) {
                                                                    z42 = z51;
                                                                    bfml = bfml4;
                                                                } else {
                                                                    z42 = z51;
                                                                    bfml = bfml.m97250a(bfmy.GLS_ERROR, bfml4.f114451e, bfml4.f114406b);
                                                                    z41 = true;
                                                                }
                                                                if (z41) {
                                                                    boolean z57 = bfnb3.f114459d;
                                                                    if (bfmz2 == bfml4) {
                                                                        bfml2 = bfml;
                                                                    } else {
                                                                        bfml2 = bfmz2 == bfns2 ? bfns : null;
                                                                    }
                                                                    arrayList2.set(i15, new bfnb(bfml2, bfns, bfml, z57));
                                                                }
                                                                i15++;
                                                                z51 = z42;
                                                            }
                                                            z40 = z51;
                                                        }
                                                        if (z40 && z38) {
                                                            this.f116274z = null;
                                                        }
                                                        arrayList = arrayList2;
                                                        z11 = z37;
                                                    }
                                                    bfni = bfni4;
                                                    if (bfni != null) {
                                                    }
                                                    if (c2 >= j3) {
                                                        z39 = true;
                                                        this.f116262n.mo61957a();
                                                        if (j16 >= 20000) {
                                                        }
                                                        if (ceze.m138462g()) {
                                                        }
                                                        bgdy bgdy2 = this.f116253e;
                                                        if (z5) {
                                                        }
                                                        bfmu bfmu2 = this.f116262n;
                                                        if (bfnvArr2 == null) {
                                                        }
                                                        String valueOf2 = String.valueOf(bfmq3);
                                                        j4 = c2;
                                                        StringBuilder sb42 = new StringBuilder(String.valueOf(str).length() + 66 + String.valueOf(valueOf2).length());
                                                        sb42.append("batchMode is ");
                                                        sb42.append(z51);
                                                        sb42.append(", scans is ");
                                                        sb42.append(str);
                                                        sb42.append(" cellStatus is ");
                                                        sb42.append(valueOf2);
                                                        sb42.append(" batchExpired is ");
                                                        sb42.append(z38);
                                                        sb42.toString();
                                                        if (!z51) {
                                                        }
                                                        if (!cewj.m138361d()) {
                                                        }
                                                        z40 = z51;
                                                        this.f116274z = null;
                                                        arrayList = arrayList2;
                                                        z11 = z37;
                                                    }
                                                    z39 = true;
                                                    this.f116262n.mo61957a();
                                                    if (j16 >= 20000) {
                                                    }
                                                    if (ceze.m138462g()) {
                                                    }
                                                    bgdy bgdy22 = this.f116253e;
                                                    if (z5) {
                                                    }
                                                    bfmu bfmu22 = this.f116262n;
                                                    if (bfnvArr2 == null) {
                                                    }
                                                    String valueOf22 = String.valueOf(bfmq3);
                                                    j4 = c2;
                                                    StringBuilder sb422 = new StringBuilder(String.valueOf(str).length() + 66 + String.valueOf(valueOf22).length());
                                                    sb422.append("batchMode is ");
                                                    sb422.append(z51);
                                                    sb422.append(", scans is ");
                                                    sb422.append(str);
                                                    sb422.append(" cellStatus is ");
                                                    sb422.append(valueOf22);
                                                    sb422.append(" batchExpired is ");
                                                    sb422.append(z38);
                                                    sb422.toString();
                                                    if (!z51) {
                                                    }
                                                    if (!cewj.m138361d()) {
                                                    }
                                                    z40 = z51;
                                                    this.f116274z = null;
                                                    arrayList = arrayList2;
                                                    z11 = z37;
                                                } else {
                                                    z12 = z8;
                                                }
                                            } else {
                                                z12 = z8;
                                                z15 = z48;
                                                z14 = z10;
                                            }
                                            bfni2 = null;
                                            if (bfni != null) {
                                            }
                                            bfni4 = bfni2;
                                            bfni = bfni4;
                                            if (bfni != null) {
                                            }
                                            if (c2 >= j3) {
                                            }
                                            z39 = true;
                                            this.f116262n.mo61957a();
                                            if (j16 >= 20000) {
                                            }
                                            if (ceze.m138462g()) {
                                            }
                                            bgdy bgdy222 = this.f116253e;
                                            if (z5) {
                                            }
                                            bfmu bfmu222 = this.f116262n;
                                            if (bfnvArr2 == null) {
                                            }
                                            String valueOf222 = String.valueOf(bfmq3);
                                            j4 = c2;
                                            StringBuilder sb4222 = new StringBuilder(String.valueOf(str).length() + 66 + String.valueOf(valueOf222).length());
                                            sb4222.append("batchMode is ");
                                            sb4222.append(z51);
                                            sb4222.append(", scans is ");
                                            sb4222.append(str);
                                            sb4222.append(" cellStatus is ");
                                            sb4222.append(valueOf222);
                                            sb4222.append(" batchExpired is ");
                                            sb4222.append(z38);
                                            sb4222.toString();
                                            if (!z51) {
                                            }
                                            if (!cewj.m138361d()) {
                                            }
                                            z40 = z51;
                                            this.f116274z = null;
                                            arrayList = arrayList2;
                                            z11 = z37;
                                        } else {
                                            z12 = z8;
                                            j4 = c2;
                                            z15 = z48;
                                            z14 = z10;
                                            z16 = z6;
                                            z13 = z7;
                                            z11 = false;
                                        }
                                        size = arrayList.size();
                                        if (size > 0) {
                                            boolean z58 = !z;
                                            bfnb = (bfnb) arrayList.get(size - 1);
                                            int size5 = arrayList.size();
                                            boolean z59 = false;
                                            z19 = false;
                                            z18 = false;
                                            for (int i16 = 0; i16 < size5; i16++) {
                                                bfnb bfnb4 = (bfnb) arrayList.get(i16);
                                                bfmz bfmz3 = bfnb4.f114456a;
                                                if (bfmz3 != null) {
                                                    z36 = false;
                                                } else {
                                                    z36 = true;
                                                }
                                                z18 |= !z36;
                                                if (bfmz3 != null) {
                                                    bfnb = bfnb4;
                                                }
                                                if (cewj.m138361d()) {
                                                    bfns bfns3 = bfnb4.f114457b;
                                                    if (bfns3 != null && bfns3.f114452f) {
                                                        z19 = z58;
                                                    }
                                                    bfml bfml5 = bfnb4.f114458c;
                                                    if (bfml5 != null && bfml5.f114452f) {
                                                        z59 = z58;
                                                    }
                                                } else {
                                                    bfns bfns4 = bfnb4.f114457b;
                                                    if (bfns4 != null && bfns4.f114450d == bfmy.CACHE_MISS) {
                                                        z19 = z58;
                                                    }
                                                    bfml bfml6 = bfnb4.f114458c;
                                                    if (bfml6 != null && bfml6.f114450d == bfmy.CACHE_MISS) {
                                                        z59 = z58;
                                                    }
                                                }
                                            }
                                            z17 = z59;
                                        } else {
                                            bfnb = null;
                                            z19 = false;
                                            z18 = false;
                                            z17 = false;
                                        }
                                        if (this.f116261m) {
                                            z20 = false;
                                        } else {
                                            z20 = (z2 || this.f116264p) && ((z17 && z5) || (z19 && z4));
                                        }
                                        bgeb = this.f116244J;
                                        if (bgeb.mo62703b()) {
                                            long j21 = j4 - bgeb.f116211b;
                                            if (bgeb.f116215f || !bgeb.f116212c) {
                                                z21 = true;
                                                if (!z20) {
                                                    z22 = false;
                                                } else {
                                                    z22 = z21;
                                                }
                                                if (z20 && this.f116244J.mo62703b() && !z21) {
                                                    this.f116249a.mo62760o().mo62048a(bfos.GLS_QUERY_THROTTLED);
                                                }
                                                if (z22) {
                                                    z23 = true;
                                                } else {
                                                    z23 = z18;
                                                }
                                                if (!this.f116252d.mo61961a()) {
                                                    z24 = false;
                                                } else {
                                                    z24 = !z22 && (z18 || this.f116239E);
                                                }
                                                a = mo62713a();
                                                if (a) {
                                                    z25 = false;
                                                } else {
                                                    z25 = z2;
                                                }
                                                if (this.f116261m || this.f116263o < this.f116265q) {
                                                    z26 = z22;
                                                } else {
                                                    z26 = true;
                                                }
                                                boolean z60 = !this.f116271w && !this.f116249a.mo62759n().mo62803a();
                                                if (z12) {
                                                    z27 = true;
                                                } else {
                                                    z27 = (z60 && z15) || z26;
                                                }
                                                if (!a) {
                                                    z28 = false;
                                                } else {
                                                    z28 = !z2 && (j >= 5000 || !z27);
                                                }
                                                if (!a) {
                                                    z29 = false;
                                                } else {
                                                    z29 = z2 && !z28;
                                                }
                                                if (!this.f116258j || z2) {
                                                    z30 = !z14;
                                                } else {
                                                    z30 = false;
                                                }
                                                this.f116258j = z30;
                                                if (!this.f116259k || j4 >= j3) {
                                                    z31 = !z14;
                                                } else {
                                                    z31 = false;
                                                }
                                                this.f116259k = z31;
                                                if (!this.f116264p || z2) {
                                                    z32 = !z23;
                                                } else {
                                                    z32 = false;
                                                }
                                                this.f116264p = z32;
                                                if (z25) {
                                                    this.f116249a.mo62756k().mo62923b(bgnq.LOCATOR, 60000, this.f116252d.f114439e);
                                                    this.f116266r = -1;
                                                    j5 = bgmk.mo62776c();
                                                    this.f116265q = j5;
                                                } else {
                                                    j5 = j4;
                                                }
                                                if (z29) {
                                                    this.f116265q = j5;
                                                }
                                                if (j4 >= j2) {
                                                    bfmx bfmx2 = this.f116252d;
                                                    bfmx2.f114441g = bfmx2.mo61960a(j5);
                                                }
                                                if (j4 >= j3) {
                                                    bfmx bfmx3 = this.f116252d;
                                                    bfmx3.f114440f = bfmx3.mo61962b(j5);
                                                }
                                                if (z13 && !mo62714b()) {
                                                    if (!this.f116235A) {
                                                        bgnx n = this.f116249a.mo62759n();
                                                        bgnq bgnq = bgnq.LOCATOR;
                                                        bfmx bfmx4 = this.f116252d;
                                                        n.mo62800a(bgnq, bfmx4.f114442h, bfmx4.f114439e);
                                                    }
                                                    this.f116272x = j5;
                                                }
                                                if (z16) {
                                                    this.f116249a.mo62749d().mo62772a(this.f116252d.f114439e);
                                                    this.f116268t = j5;
                                                }
                                                if (z22) {
                                                    this.f116261m = true;
                                                    this.f116263o = j5;
                                                    this.f116246M.mo62708a(this.f116262n, this.f116252d.f114439e, this.f116242H);
                                                }
                                                if (z24) {
                                                    String valueOf3 = String.valueOf(this.f116252d);
                                                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf3).length() + 43);
                                                    sb5.append("PassivePos: reportLocation, locatorParams: ");
                                                    sb5.append(valueOf3);
                                                    sb5.toString();
                                                    this.f116240F = this.f116239E;
                                                    this.f116239E = false;
                                                    if (!(bfnb == null || bfnb.f114456a == null)) {
                                                        this.f116249a.mo62754i().mo62671a(this.f116249a.mo62754i().mo62669a(bfnb, this.f116273y));
                                                        this.f116254f = bfnb;
                                                    }
                                                    long j22 = this.f116255g;
                                                    j6 = 0;
                                                    z34 = j22 != 0 && this.f116263o > j22;
                                                    this.f116255g = j5;
                                                    bfmi bfmi3 = this.f116253e.f116202c;
                                                    bfmi3.f114399a.clear();
                                                    bfmi3.f114400b.clear();
                                                    bfmi3.f114401c = null;
                                                    bfmi3.f114402d = false;
                                                    bfor o = this.f116249a.mo62760o();
                                                    int size6 = arrayList.size();
                                                    for (int i17 = 0; i17 < size6; i17++) {
                                                        bfnb bfnb5 = (bfnb) arrayList.get(i17);
                                                        bfns bfns5 = bfnb5.f114457b;
                                                        if (bfns5 != null) {
                                                            i4 = bfns5.f114450d.ordinal();
                                                        } else {
                                                            i4 = -1;
                                                        }
                                                        bfml bfml7 = bfnb5.f114458c;
                                                        if (bfml7 != null) {
                                                            i5 = bfml7.f114450d.ordinal();
                                                        } else {
                                                            i5 = -1;
                                                        }
                                                        boolean z61 = bfnb5.f114459d;
                                                        if (bfnb5.f114456a == bfnb5.f114457b) {
                                                            c = 2;
                                                        } else {
                                                            c = 0;
                                                        }
                                                        o.mo62047a(new bgeg(bfos.LOCATION_REPORT, o.mo62055b(), i4, i5, z61 | c ? 1 : 0, bfnb5));
                                                    }
                                                    this.f116249a.mo62754i().mo62679b(arrayList);
                                                    if (!ceze.m138462g()) {
                                                        bfcn bfcn2 = this.f116250b;
                                                        int size7 = arrayList.size();
                                                        for (int i18 = 0; i18 < size7; i18++) {
                                                            bfnb bfnb6 = (bfnb) arrayList.get(i18);
                                                            bfmz bfmz4 = bfnb6.f114456a;
                                                            if (bfmz4 != null) {
                                                                if (bfmz4 == bfnb6.f114458c) {
                                                                    bfcn2.mo61395a(25);
                                                                } else if (bfmz4 == bfnb6.f114457b) {
                                                                    bfcn2.mo61395a(24);
                                                                    if (bfnb6.f114457b.f114508a == 5) {
                                                                        bfcn2.mo61395a(22);
                                                                        bfni bfni5 = bfnb6.f114457b.f114449c;
                                                                        if (bfni5 != null && bfni5.mo61981b()) {
                                                                            bfcn2.mo61395a(30);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        this.f116250b.mo61400a(arrayList);
                                                    }
                                                    boolean z62 = this.f116235A;
                                                    if (z62 || z11) {
                                                        if (z62) {
                                                            int size8 = arrayList.size();
                                                            StringBuilder sb6 = new StringBuilder(35);
                                                            sb6.append("Hardware batch count is ");
                                                            sb6.append(size8);
                                                            sb6.toString();
                                                            this.f116237C += arrayList.size();
                                                        } else {
                                                            int size9 = arrayList.size();
                                                            StringBuilder sb7 = new StringBuilder(35);
                                                            sb7.append("Software batch count is ");
                                                            sb7.append(size9);
                                                            sb7.toString();
                                                            this.f116236B += arrayList.size();
                                                        }
                                                        this.f116238D++;
                                                    }
                                                    this.f116249a.mo62748c().mo62997a(j5);
                                                    z33 = true;
                                                } else {
                                                    j6 = 0;
                                                    z34 = false;
                                                    z33 = false;
                                                }
                                                bfmx bfmx5 = this.f116252d;
                                                long min = Math.min(bfmx5.f114441g, bfmx5.f114440f);
                                                if (!mo62713a()) {
                                                    j7 = min;
                                                    z35 = false;
                                                } else if (!z28) {
                                                    j7 = Math.min(min, this.f116265q + 5000);
                                                    z35 = true;
                                                } else {
                                                    j7 = min;
                                                    z35 = false;
                                                }
                                                if (!z35) {
                                                    bfmx bfmx6 = this.f116252d;
                                                    if (bfmx6.mo61961a()) {
                                                        j8 = Math.min(Math.min(bfmx6.f114435a, bfmx6.f114437c) / 8, 300000L);
                                                        this.f116249a.mo62756k().mo62916a(bgnq.LOCATOR, j7, j8, this.f116252d.f114439e);
                                                        if (z28 || (this.f116257i && mo62713a())) {
                                                            mo62709a(j5);
                                                        }
                                                        if (!arrayList.isEmpty() || z22) {
                                                            i = 0;
                                                            j9 = -1;
                                                        } else {
                                                            bfnc bfnc = this.f116248O;
                                                            if (this.f116240F && arrayList.size() == 1 && ((bfnb) arrayList.get(0)).f114456a == null) {
                                                                bfncArr = null;
                                                                j9 = -1;
                                                            } else {
                                                                ArrayList arrayList7 = new ArrayList();
                                                                if (!arrayList.isEmpty()) {
                                                                    int size10 = arrayList.size();
                                                                    for (int i19 = 0; i19 < size10; i19++) {
                                                                        bfnb bfnb7 = (bfnb) arrayList.get(i19);
                                                                        if (bfnb7 != null) {
                                                                            bfmz bfmz5 = bfnb7.f114456a;
                                                                            if (bfmz5 != null) {
                                                                                j10 = bfmz5.f114451e;
                                                                            } else {
                                                                                bfns bfns6 = bfnb7.f114457b;
                                                                                if (bfns6 != null) {
                                                                                    j10 = bfns6.f114451e;
                                                                                } else {
                                                                                    bfml bfml8 = bfnb7.f114458c;
                                                                                    j10 = bfml8 != null ? bfml8.f114451e : -1;
                                                                                }
                                                                            }
                                                                            if (j10 != -1) {
                                                                                j11 = TimeUnit.MILLISECONDS.toNanos(j10);
                                                                            } else {
                                                                                j11 = !z11 ? bgmk.mo62774a() : -1;
                                                                            }
                                                                            long a4 = bgel.m98706a(j11, bgmk);
                                                                            bfml bfml9 = bfnb7.f114458c;
                                                                            if (bfml9 != null) {
                                                                                i2 = bgel.m98705a(bfml9.f114450d);
                                                                            } else {
                                                                                i2 = 1;
                                                                            }
                                                                            bfns bfns7 = bfnb7.f114457b;
                                                                            if (bfns7 != null) {
                                                                                i3 = bgel.m98705a(bfns7.f114450d);
                                                                            } else {
                                                                                i3 = 1;
                                                                            }
                                                                            arrayList7.add(new bfnc(i3, i2, a4, j11));
                                                                        }
                                                                    }
                                                                    Collections.sort(arrayList7, new bgek());
                                                                    Iterator it = arrayList7.iterator();
                                                                    while (it.hasNext()) {
                                                                        bfnc bfnc2 = (bfnc) it.next();
                                                                        if (bfnc != null && bfnc2.f114461b == bfnc.f114461b && bfnc2.f114460a == bfnc.f114460a) {
                                                                            String valueOf4 = String.valueOf(bfnc2);
                                                                            StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf4).length() + 14);
                                                                            sb8.append("Remove Status:");
                                                                            sb8.append(valueOf4);
                                                                            sb8.toString();
                                                                            it.remove();
                                                                        }
                                                                        bfnc = bfnc2;
                                                                    }
                                                                    j9 = -1;
                                                                } else {
                                                                    bgmk bgmk2 = bgmk;
                                                                    j9 = -1;
                                                                    if (bfnc != null && bfnc.f114460a == 2 && bfnc.f114461b == 2) {
                                                                        bfncArr = null;
                                                                    } else {
                                                                        long a5 = bgmk.mo62774a();
                                                                        arrayList7.add(new bfnc(2, 2, bgel.m98706a(a5, bgmk2), a5));
                                                                    }
                                                                }
                                                                bfncArr = !arrayList7.isEmpty() ? (bfnc[]) arrayList7.toArray(new bfnc[arrayList7.size()]) : null;
                                                            }
                                                            i = 0;
                                                            this.f116240F = false;
                                                            if (bfncArr != null && (r4 = bfncArr.length) > 0) {
                                                                for (bfnc bfnc3 : bfncArr) {
                                                                    bfor o2 = this.f116249a.mo62760o();
                                                                    o2.mo62047a(new bfop(bfos.STATUS_REPORT, o2.mo62055b(), "wifiLocationStatus %2$d cellLocationStatus %3$d", null, bfnc3.f114460a, bfnc3.f114461b, 0));
                                                                }
                                                                this.f116249a.mo62754i().mo62676a(bfncArr);
                                                                this.f116248O = bfncArr[bfncArr.length - 1];
                                                            }
                                                        }
                                                        if (!z33) {
                                                            bgej bgej = this.f116251c;
                                                            boolean z63 = !z34;
                                                            bfnc bfnc4 = this.f116248O;
                                                            bfmx bfmx7 = this.f116252d;
                                                            if (bgej.f116276a != null && bfkq.m97139a(ceze.m138457b())) {
                                                                int size11 = arrayList.size();
                                                                int size12 = arrayList.size();
                                                                int i20 = 0;
                                                                while (i < size12) {
                                                                    bfnb bfnb8 = (bfnb) arrayList.get(i);
                                                                    bfmz bfmz6 = bfnb8.f114456a;
                                                                    bfns bfns8 = bfnb8.f114457b;
                                                                    if (bfmz6 == bfns8 && bfns8 != null) {
                                                                        i20 = bfns8.f114508a == 5 ? i20 | 2 : i20 | 4;
                                                                    } else {
                                                                        bfml bfml10 = bfnb8.f114458c;
                                                                        if (bfmz6 == bfml10) {
                                                                            if (bfml10 != null) {
                                                                                i20 = bfml10.f114405a != 2 ? i20 | 16 : i20 | 8;
                                                                            }
                                                                            i++;
                                                                        }
                                                                    }
                                                                    i++;
                                                                }
                                                                bgej.f116276a.mo62625a(j5 - bgej.f116277b, i20, bfmx7 != null ? bfmx7.f114435a : j9, z63, z11, size11, bfnc4 != null ? bfnc4.f114460a : -1, bfnc4 != null ? bfnc4.f114461b : -1);
                                                                bgej.f116276a.mo62624a();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                }
                                                j8 = j6;
                                                this.f116249a.mo62756k().mo62916a(bgnq.LOCATOR, j7, j8, this.f116252d.f114439e);
                                                mo62709a(j5);
                                                if (!arrayList.isEmpty()) {
                                                }
                                                i = 0;
                                                j9 = -1;
                                                if (!z33) {
                                                }
                                            } else {
                                                if (j21 >= (!bgeb.f116214e ? 900000 : 300000)) {
                                                    z21 = true;
                                                    if (!z20) {
                                                    }
                                                    this.f116249a.mo62760o().mo62048a(bfos.GLS_QUERY_THROTTLED);
                                                    if (z22) {
                                                    }
                                                    if (!this.f116252d.mo61961a()) {
                                                    }
                                                    a = mo62713a();
                                                    if (a) {
                                                    }
                                                    if (this.f116261m) {
                                                    }
                                                    if (z22) {
                                                    }
                                                    if (!this.f116271w) {
                                                    }
                                                    if (z12) {
                                                    }
                                                    if (!a) {
                                                    }
                                                    if (!a) {
                                                    }
                                                    if (!this.f116258j) {
                                                    }
                                                    if (!z14) {
                                                    }
                                                    this.f116258j = z30;
                                                    if (!this.f116259k) {
                                                    }
                                                    if (!z14) {
                                                    }
                                                    this.f116259k = z31;
                                                    if (!this.f116264p) {
                                                    }
                                                    if (!z23) {
                                                    }
                                                    this.f116264p = z32;
                                                    if (z25) {
                                                    }
                                                    if (z29) {
                                                    }
                                                    if (j4 >= j2) {
                                                    }
                                                    if (j4 >= j3) {
                                                    }
                                                    if (!this.f116235A) {
                                                    }
                                                    this.f116272x = j5;
                                                    if (z16) {
                                                    }
                                                    if (z22) {
                                                    }
                                                    if (z24) {
                                                    }
                                                    bfmx bfmx52 = this.f116252d;
                                                    long min2 = Math.min(bfmx52.f114441g, bfmx52.f114440f);
                                                    if (!mo62713a()) {
                                                    }
                                                    if (!z35) {
                                                    }
                                                    j8 = j6;
                                                    this.f116249a.mo62756k().mo62916a(bgnq.LOCATOR, j7, j8, this.f116252d.f114439e);
                                                    mo62709a(j5);
                                                    if (!arrayList.isEmpty()) {
                                                    }
                                                    i = 0;
                                                    j9 = -1;
                                                    if (!z33) {
                                                    }
                                                }
                                            }
                                        }
                                        z21 = false;
                                        if (!z20) {
                                        }
                                        this.f116249a.mo62760o().mo62048a(bfos.GLS_QUERY_THROTTLED);
                                        if (z22) {
                                        }
                                        if (!this.f116252d.mo61961a()) {
                                        }
                                        a = mo62713a();
                                        if (a) {
                                        }
                                        if (this.f116261m) {
                                        }
                                        if (z22) {
                                        }
                                        if (!this.f116271w) {
                                        }
                                        if (z12) {
                                        }
                                        if (!a) {
                                        }
                                        if (!a) {
                                        }
                                        if (!this.f116258j) {
                                        }
                                        if (!z14) {
                                        }
                                        this.f116258j = z30;
                                        if (!this.f116259k) {
                                        }
                                        if (!z14) {
                                        }
                                        this.f116259k = z31;
                                        if (!this.f116264p) {
                                        }
                                        if (!z23) {
                                        }
                                        this.f116264p = z32;
                                        if (z25) {
                                        }
                                        if (z29) {
                                        }
                                        if (j4 >= j2) {
                                        }
                                        if (j4 >= j3) {
                                        }
                                        if (!this.f116235A) {
                                        }
                                        this.f116272x = j5;
                                        if (z16) {
                                        }
                                        if (z22) {
                                        }
                                        if (z24) {
                                        }
                                        bfmx bfmx522 = this.f116252d;
                                        long min22 = Math.min(bfmx522.f114441g, bfmx522.f114440f);
                                        if (!mo62713a()) {
                                        }
                                        if (!z35) {
                                        }
                                        j8 = j6;
                                        this.f116249a.mo62756k().mo62916a(bgnq.LOCATOR, j7, j8, this.f116252d.f114439e);
                                        mo62709a(j5);
                                        if (!arrayList.isEmpty()) {
                                        }
                                        i = 0;
                                        j9 = -1;
                                        if (!z33) {
                                        }
                                    }
                                    z9 = true;
                                    if (z) {
                                    }
                                    arrayList = new ArrayList();
                                    if (z10) {
                                    }
                                    size = arrayList.size();
                                    if (size > 0) {
                                    }
                                    if (this.f116261m) {
                                    }
                                    bgeb = this.f116244J;
                                    if (bgeb.mo62703b()) {
                                    }
                                    z21 = false;
                                    if (!z20) {
                                    }
                                    this.f116249a.mo62760o().mo62048a(bfos.GLS_QUERY_THROTTLED);
                                    if (z22) {
                                    }
                                    if (!this.f116252d.mo61961a()) {
                                    }
                                    a = mo62713a();
                                    if (a) {
                                    }
                                    if (this.f116261m) {
                                    }
                                    if (z22) {
                                    }
                                    if (!this.f116271w) {
                                    }
                                    if (z12) {
                                    }
                                    if (!a) {
                                    }
                                    if (!a) {
                                    }
                                    if (!this.f116258j) {
                                    }
                                    if (!z14) {
                                    }
                                    this.f116258j = z30;
                                    if (!this.f116259k) {
                                    }
                                    if (!z14) {
                                    }
                                    this.f116259k = z31;
                                    if (!this.f116264p) {
                                    }
                                    if (!z23) {
                                    }
                                    this.f116264p = z32;
                                    if (z25) {
                                    }
                                    if (z29) {
                                    }
                                    if (j4 >= j2) {
                                    }
                                    if (j4 >= j3) {
                                    }
                                    if (!this.f116235A) {
                                    }
                                    this.f116272x = j5;
                                    if (z16) {
                                    }
                                    if (z22) {
                                    }
                                    if (z24) {
                                    }
                                    bfmx bfmx5222 = this.f116252d;
                                    long min222 = Math.min(bfmx5222.f114441g, bfmx5222.f114440f);
                                    if (!mo62713a()) {
                                    }
                                    if (!z35) {
                                    }
                                    j8 = j6;
                                    this.f116249a.mo62756k().mo62916a(bgnq.LOCATOR, j7, j8, this.f116252d.f114439e);
                                    mo62709a(j5);
                                    if (!arrayList.isEmpty()) {
                                    }
                                    i = 0;
                                    j9 = -1;
                                    if (!z33) {
                                    }
                                } else {
                                    j3 = j18;
                                }
                                z8 = true;
                                if (!z7) {
                                }
                                if (z8) {
                                }
                                if (!z49) {
                                }
                                if (!this.f116271w) {
                                }
                                if (z) {
                                }
                                arrayList = new ArrayList();
                                if (z10) {
                                }
                                size = arrayList.size();
                                if (size > 0) {
                                }
                                if (this.f116261m) {
                                }
                                bgeb = this.f116244J;
                                if (bgeb.mo62703b()) {
                                }
                                z21 = false;
                                if (!z20) {
                                }
                                this.f116249a.mo62760o().mo62048a(bfos.GLS_QUERY_THROTTLED);
                                if (z22) {
                                }
                                if (!this.f116252d.mo61961a()) {
                                }
                                a = mo62713a();
                                if (a) {
                                }
                                if (this.f116261m) {
                                }
                                if (z22) {
                                }
                                if (!this.f116271w) {
                                }
                                if (z12) {
                                }
                                if (!a) {
                                }
                                if (!a) {
                                }
                                if (!this.f116258j) {
                                }
                                if (!z14) {
                                }
                                this.f116258j = z30;
                                if (!this.f116259k) {
                                }
                                if (!z14) {
                                }
                                this.f116259k = z31;
                                if (!this.f116264p) {
                                }
                                if (!z23) {
                                }
                                this.f116264p = z32;
                                if (z25) {
                                }
                                if (z29) {
                                }
                                if (j4 >= j2) {
                                }
                                if (j4 >= j3) {
                                }
                                if (!this.f116235A) {
                                }
                                this.f116272x = j5;
                                if (z16) {
                                }
                                if (z22) {
                                }
                                if (z24) {
                                }
                                bfmx bfmx52222 = this.f116252d;
                                long min2222 = Math.min(bfmx52222.f114441g, bfmx52222.f114440f);
                                if (!mo62713a()) {
                                }
                                if (!z35) {
                                }
                                j8 = j6;
                                this.f116249a.mo62756k().mo62916a(bgnq.LOCATOR, j7, j8, this.f116252d.f114439e);
                                mo62709a(j5);
                                if (!arrayList.isEmpty()) {
                                }
                                i = 0;
                                j9 = -1;
                                if (!z33) {
                                }
                            }
                            z7 = false;
                            boolean z472 = z3;
                            if (!z6) {
                            }
                            z8 = true;
                            if (!z7) {
                            }
                            if (z8) {
                            }
                            if (!z49) {
                            }
                            if (!this.f116271w) {
                            }
                            if (z) {
                            }
                            arrayList = new ArrayList();
                            if (z10) {
                            }
                            size = arrayList.size();
                            if (size > 0) {
                            }
                            if (this.f116261m) {
                            }
                            bgeb = this.f116244J;
                            if (bgeb.mo62703b()) {
                            }
                            z21 = false;
                            if (!z20) {
                            }
                            this.f116249a.mo62760o().mo62048a(bfos.GLS_QUERY_THROTTLED);
                            if (z22) {
                            }
                            if (!this.f116252d.mo61961a()) {
                            }
                            a = mo62713a();
                            if (a) {
                            }
                            if (this.f116261m) {
                            }
                            if (z22) {
                            }
                            if (!this.f116271w) {
                            }
                            if (z12) {
                            }
                            if (!a) {
                            }
                            if (!a) {
                            }
                            if (!this.f116258j) {
                            }
                            if (!z14) {
                            }
                            this.f116258j = z30;
                            if (!this.f116259k) {
                            }
                            if (!z14) {
                            }
                            this.f116259k = z31;
                            if (!this.f116264p) {
                            }
                            if (!z23) {
                            }
                            this.f116264p = z32;
                            if (z25) {
                            }
                            if (z29) {
                            }
                            if (j4 >= j2) {
                            }
                            if (j4 >= j3) {
                            }
                            if (!this.f116235A) {
                            }
                            this.f116272x = j5;
                            if (z16) {
                            }
                            if (z22) {
                            }
                            if (z24) {
                            }
                            bfmx bfmx522222 = this.f116252d;
                            long min22222 = Math.min(bfmx522222.f114441g, bfmx522222.f114440f);
                            if (!mo62713a()) {
                            }
                            if (!z35) {
                            }
                            j8 = j6;
                            this.f116249a.mo62756k().mo62916a(bgnq.LOCATOR, j7, j8, this.f116252d.f114439e);
                            mo62709a(j5);
                            if (!arrayList.isEmpty()) {
                            }
                            i = 0;
                            j9 = -1;
                            if (!z33) {
                            }
                        }
                    }
                    z5 = false;
                    if (!z2) {
                    }
                    if (!this.f116257i) {
                    }
                    boolean z4722 = z3;
                    if (!z6) {
                    }
                    z8 = true;
                    if (!z7) {
                    }
                    if (z8) {
                    }
                    if (!z49) {
                    }
                    if (!this.f116271w) {
                    }
                    if (z) {
                    }
                    arrayList = new ArrayList();
                    if (z10) {
                    }
                    size = arrayList.size();
                    if (size > 0) {
                    }
                    if (this.f116261m) {
                    }
                    bgeb = this.f116244J;
                    if (bgeb.mo62703b()) {
                    }
                    z21 = false;
                    if (!z20) {
                    }
                    this.f116249a.mo62760o().mo62048a(bfos.GLS_QUERY_THROTTLED);
                    if (z22) {
                    }
                    if (!this.f116252d.mo61961a()) {
                    }
                    a = mo62713a();
                    if (a) {
                    }
                    if (this.f116261m) {
                    }
                    if (z22) {
                    }
                    if (!this.f116271w) {
                    }
                    if (z12) {
                    }
                    if (!a) {
                    }
                    if (!a) {
                    }
                    if (!this.f116258j) {
                    }
                    if (!z14) {
                    }
                    this.f116258j = z30;
                    if (!this.f116259k) {
                    }
                    if (!z14) {
                    }
                    this.f116259k = z31;
                    if (!this.f116264p) {
                    }
                    if (!z23) {
                    }
                    this.f116264p = z32;
                    if (z25) {
                    }
                    if (z29) {
                    }
                    if (j4 >= j2) {
                    }
                    if (j4 >= j3) {
                    }
                    if (!this.f116235A) {
                    }
                    this.f116272x = j5;
                    if (z16) {
                    }
                    if (z22) {
                    }
                    if (z24) {
                    }
                    bfmx bfmx5222222 = this.f116252d;
                    long min222222 = Math.min(bfmx5222222.f114441g, bfmx5222222.f114440f);
                    if (!mo62713a()) {
                    }
                    if (!z35) {
                    }
                    j8 = j6;
                    this.f116249a.mo62756k().mo62916a(bgnq.LOCATOR, j7, j8, this.f116252d.f114439e);
                    mo62709a(j5);
                    if (!arrayList.isEmpty()) {
                    }
                    i = 0;
                    j9 = -1;
                    if (!z33) {
                    }
                } else {
                    j2 = j17;
                }
                z4 = false;
                bfml3 = this.f116254f.f114458c;
                if (bfmn != (bfml3 != null ? bfml3.f114406b : null)) {
                }
                z5 = false;
                if (!z2) {
                }
                if (!this.f116257i) {
                }
                boolean z47222 = z3;
                if (!z6) {
                }
                z8 = true;
                if (!z7) {
                }
                if (z8) {
                }
                if (!z49) {
                }
                if (!this.f116271w) {
                }
                if (z) {
                }
                arrayList = new ArrayList();
                if (z10) {
                }
                size = arrayList.size();
                if (size > 0) {
                }
                if (this.f116261m) {
                }
                bgeb = this.f116244J;
                if (bgeb.mo62703b()) {
                }
                z21 = false;
                if (!z20) {
                }
                this.f116249a.mo62760o().mo62048a(bfos.GLS_QUERY_THROTTLED);
                if (z22) {
                }
                if (!this.f116252d.mo61961a()) {
                }
                a = mo62713a();
                if (a) {
                }
                if (this.f116261m) {
                }
                if (z22) {
                }
                if (!this.f116271w) {
                }
                if (z12) {
                }
                if (!a) {
                }
                if (!a) {
                }
                if (!this.f116258j) {
                }
                if (!z14) {
                }
                this.f116258j = z30;
                if (!this.f116259k) {
                }
                if (!z14) {
                }
                this.f116259k = z31;
                if (!this.f116264p) {
                }
                if (!z23) {
                }
                this.f116264p = z32;
                if (z25) {
                }
                if (z29) {
                }
                if (j4 >= j2) {
                }
                if (j4 >= j3) {
                }
                if (!this.f116235A) {
                }
                this.f116272x = j5;
                if (z16) {
                }
                if (z22) {
                }
                if (z24) {
                }
                bfmx bfmx52222222 = this.f116252d;
                long min2222222 = Math.min(bfmx52222222.f114441g, bfmx52222222.f114440f);
                if (!mo62713a()) {
                }
                if (!z35) {
                }
                j8 = j6;
                this.f116249a.mo62756k().mo62916a(bgnq.LOCATOR, j7, j8, this.f116252d.f114439e);
                mo62709a(j5);
                if (!arrayList.isEmpty()) {
                }
                i = 0;
                j9 = -1;
                if (!z33) {
                }
            }
        }
        z3 = false;
        this.f116256h = c2;
        if (j16 >= 20000) {
        }
        z4 = false;
        bfml3 = this.f116254f.f114458c;
        if (bfmn != (bfml3 != null ? bfml3.f114406b : null)) {
        }
        z5 = false;
        if (!z2) {
        }
        if (!this.f116257i) {
        }
        boolean z472222 = z3;
        if (!z6) {
        }
        z8 = true;
        if (!z7) {
        }
        if (z8) {
        }
        if (!z49) {
        }
        if (!this.f116271w) {
        }
        if (z) {
        }
        arrayList = new ArrayList();
        if (z10) {
        }
        size = arrayList.size();
        if (size > 0) {
        }
        if (this.f116261m) {
        }
        bgeb = this.f116244J;
        if (bgeb.mo62703b()) {
        }
        z21 = false;
        if (!z20) {
        }
        this.f116249a.mo62760o().mo62048a(bfos.GLS_QUERY_THROTTLED);
        if (z22) {
        }
        if (!this.f116252d.mo61961a()) {
        }
        a = mo62713a();
        if (a) {
        }
        if (this.f116261m) {
        }
        if (z22) {
        }
        if (!this.f116271w) {
        }
        if (z12) {
        }
        if (!a) {
        }
        if (!a) {
        }
        if (!this.f116258j) {
        }
        if (!z14) {
        }
        this.f116258j = z30;
        if (!this.f116259k) {
        }
        if (!z14) {
        }
        this.f116259k = z31;
        if (!this.f116264p) {
        }
        if (!z23) {
        }
        this.f116264p = z32;
        if (z25) {
        }
        if (z29) {
        }
        if (j4 >= j2) {
        }
        if (j4 >= j3) {
        }
        if (!this.f116235A) {
        }
        this.f116272x = j5;
        if (z16) {
        }
        if (z22) {
        }
        if (z24) {
        }
        bfmx bfmx522222222 = this.f116252d;
        long min22222222 = Math.min(bfmx522222222.f114441g, bfmx522222222.f114440f);
        if (!mo62713a()) {
        }
        if (!z35) {
        }
        j8 = j6;
        this.f116249a.mo62756k().mo62916a(bgnq.LOCATOR, j7, j8, this.f116252d.f114439e);
        mo62709a(j5);
        if (!arrayList.isEmpty()) {
        }
        i = 0;
        j9 = -1;
        if (!z33) {
        }
    }
}
