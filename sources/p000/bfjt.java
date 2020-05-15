package p000;

import com.google.android.gms.location.ActivityRecognitionResult;
import java.io.PrintWriter;

/* renamed from: bfjt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfjt extends bfit {

    /* renamed from: A */
    public boolean f114204A = false;

    /* renamed from: B */
    public boolean f114205B = false;

    /* renamed from: C */
    final bglw f114206C;

    /* renamed from: D */
    long f114207D = -1;

    /* renamed from: E */
    public bsax f114208E;

    /* renamed from: F */
    long f114209F = -1;

    /* renamed from: G */
    bgjm f114210G;

    /* renamed from: H */
    private int f114211H;

    /* renamed from: I */
    private int f114212I;

    /* renamed from: J */
    private int f114213J;

    /* renamed from: k */
    public boolean f114214k;

    /* renamed from: l */
    boolean f114215l;

    /* renamed from: m */
    public bfmn f114216m = null;

    /* renamed from: n */
    bfnx f114217n = null;

    /* renamed from: o */
    boolean f114218o = false;

    /* renamed from: p */
    long f114219p = -1;

    /* renamed from: q */
    public bfnx f114220q = null;

    /* renamed from: r */
    ActivityRecognitionResult f114221r = null;

    /* renamed from: s */
    public boolean f114222s = false;

    /* renamed from: t */
    bsax f114223t;

    /* renamed from: u */
    long f114224u = -1;

    /* renamed from: v */
    boolean f114225v = false;

    /* renamed from: w */
    int f114226w;

    /* renamed from: x */
    int f114227x;

    /* renamed from: y */
    public boolean f114228y = false;

    /* renamed from: z */
    public boolean f114229z = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfjt(bgnp bgnp, bgmk bgmk, bgns bgns, bfcu bfcu, bgoj bgoj, bglw bglw, bhaz bhaz, bfiq bfiq) {
        super("PassiveCollector", bgnp, bgmk, bgns, bfcu, bgoj, bhaz, bfiq, bfis.IDLE);
        bglw bglw2 = bglw;
        this.f114206C = bglw2;
        if (cevn.m138305c()) {
            bglw2.mo60962a(Long.MAX_VALUE, true);
        }
    }

    /* renamed from: a */
    private final void m97049a(int i, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        bgjm bgjm;
        bfmn bfmn;
        ActivityRecognitionResult activityRecognitionResult;
        bfnx bfnx;
        if (z2) {
            this.f114218o = !z;
            this.f114217n = this.f114220q;
        }
        if (z) {
            bgjm = this.f114210G;
        } else {
            bgjm = null;
        }
        if (z3) {
            bfmn = this.f114216m;
        } else {
            bfmn = null;
        }
        if (z4) {
            activityRecognitionResult = this.f114221r;
        } else {
            activityRecognitionResult = null;
        }
        if (z2) {
            bfnx = this.f114220q;
        } else {
            bfnx = null;
        }
        if (bfmn != null) {
            this.f114213J++;
        }
        if (bfnx != null) {
            this.f114226w++;
        }
        if (bgjm != null) {
            this.f114227x++;
        }
        bsax a = bfit.m96873a(this.f114049c.mo62777d(), bgjm, bfmn, bfnx, activityRecognitionResult, this.f114215l, i, this.f114048b.mo62758m().mo62926a());
        this.f114055i.mo61738a(bgjm, bfmn, bfnx);
        if (this.f114208E == null) {
            this.f114208E = new bsax(bgox.f117045al);
            this.f114209F = j;
        }
        if (z2 && z3 && !z) {
            long c = this.f114049c.mo62776c() + 1000;
            this.f114219p = c;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Non gps collections will be throttled until ");
            sb.append(c);
            sb.toString();
        }
        bmxy.m108581a(this.f114208E);
        this.f114208E.mo70107a(4, a);
        if (z4) {
            this.f114221r = null;
        }
    }

    /* renamed from: h */
    private final boolean m97051h(long j) {
        int i;
        long j2;
        bsax bsax = this.f114208E;
        if (bsax != null) {
            i = bsax.mo70138j(4);
        } else {
            i = 0;
        }
        if (i > 10) {
            j2 = 900000;
        } else {
            j2 = 1800000;
        }
        bsax bsax2 = this.f114208E;
        if (bsax2 == null || !bsax2.mo70137i(4)) {
            return false;
        }
        return i >= 30 || j - this.f114209F >= j2;
    }

    /* renamed from: i */
    private final void m97052i() {
        int i;
        if (mo61754a()) {
            this.f114050d.mo62923b(bgnq.PASSIVE_COLLECTOR, 60000, null);
            this.f114056j = bfis.UPLOAD_WAIT;
            int i2 = this.f114212I;
            bsax bsax = this.f114208E;
            if (bsax != null) {
                i = bsax.mo70138j(4);
            } else {
                i = 0;
            }
            this.f114212I = i2 + i;
            bsax bsax2 = this.f114208E;
            this.f114223t = bsax2;
            bmxy.m108581a(bsax2);
            this.f114052f.mo63512a(this.f114049c, bsax2);
            ((bgfj) this.f114048b).mo62763r().mo62893a(bsax2, this.f114053g);
            this.f114209F = -1;
            this.f114225v = true;
            long c = this.f114049c.mo62776c();
            this.f114224u = c;
            m97053i(c + 15000);
            this.f114211H++;
        }
        this.f114208E = null;
    }

    /* renamed from: j */
    private final void m97054j() {
        if (this.f114225v) {
            this.f114050d.mo62914a(bgnq.PASSIVE_COLLECTOR);
            this.f114207D = -1;
            this.f114225v = false;
            this.f114050d.mo62925c(bgnq.PASSIVE_COLLECTOR);
        }
    }

    /* renamed from: k */
    private final void m97055k() {
        this.f114228y = false;
        this.f114229z = false;
        this.f114204A = false;
        this.f114205B = false;
    }

    /* renamed from: a */
    public final void mo61749a(bsax bsax) {
        this.f114223t = null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0273, code lost:
        if (r3 == false) goto L_0x0296;
     */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0276 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    public final boolean mo61758b(long j) {
        boolean z;
        boolean z2;
        Boolean bool;
        boolean z3;
        boolean z4;
        boolean z5;
        Boolean bool2;
        bfnx bfnx;
        bfmn bfmn;
        bfmn bfmn2;
        boolean z6;
        boolean z7;
        boolean z8;
        long j2;
        long j3;
        bgjm bgjm;
        bgjm bgjm2;
        boolean z9 = false;
        if (!mo61754a()) {
            m97055k();
            return false;
        } else if (!m97051h(j)) {
            bfnx bfnx2 = this.f114220q;
            boolean z10 = bfnx2 == null || bfnx2.f114524a <= this.f114055i.f114029a;
            bfmn bfmn3 = this.f114216m;
            boolean z11 = bfmn3 == null || bfmn3.f114417g <= this.f114055i.f114030b;
            boolean z12 = this.f114228y;
            if (z12 && z10) {
                this.f114228y = false;
                z12 = false;
            }
            if (this.f114229z && z11) {
                this.f114229z = false;
            }
            if (z10 && z11 && this.f114205B) {
                this.f114205B = false;
            }
            this.f114228y = cezl.f183528a.mo6606a().passiveCollectorEnableWifiChangeUpload() & z12;
            this.f114229z &= cezl.f183528a.mo6606a().passiveCollectorEnableCellChangeUpload();
            boolean passiveCollectorEnableMovedTooFarChangeUpload = this.f114205B & cezl.f183528a.mo6606a().passiveCollectorEnableMovedTooFarChangeUpload();
            this.f114205B = passiveCollectorEnableMovedTooFarChangeUpload;
            boolean z13 = this.f114228y;
            if (!z13 && !this.f114229z && !passiveCollectorEnableMovedTooFarChangeUpload && !this.f114204A) {
                return false;
            }
            int i = !z13 ? !this.f114204A ? !passiveCollectorEnableMovedTooFarChangeUpload ? this.f114229z ? 1 : -1 : 11 : 4 : 2;
            if (i == -1) {
                return false;
            }
            long c = this.f114049c.mo62776c();
            bgjm bgjm3 = this.f114210G;
            if (bgjm3 == null || c - bgjm3.f116616b > 720000) {
                z = false;
            } else {
                z = true;
            }
            ActivityRecognitionResult activityRecognitionResult = this.f114221r;
            if (activityRecognitionResult == null || !cevn.m138305c() || !bfit.m96876a(activityRecognitionResult, this.f114210G)) {
                z2 = false;
            } else {
                z2 = true;
            }
            bfnx bfnx3 = this.f114220q;
            if (bfnx3 == null || (bgjm2 = this.f114210G) == null) {
                bool = false;
            } else {
                long j4 = bgjm2.f116616b;
                long j5 = bfnx3.f114524a;
                bflw bflw = ((berb) this.f114206C).f112175ay;
                Boolean a = bflw.mo61904a(j4, j5, 2000);
                Boolean b = bflw.mo61905b(j4, j5, 8000);
                Boolean c2 = bflw.mo61906c(j4, j5, 20000);
                if (a == null || b == null) {
                    bool = null;
                } else if (c2 != null) {
                    bool = Boolean.valueOf(a.booleanValue() || b.booleanValue() || c2.booleanValue());
                } else {
                    bool = null;
                }
            }
            bfnx bfnx4 = this.f114220q;
            if (bfnx4 == null) {
                z5 = z;
                z4 = false;
                z3 = false;
            } else {
                if (i != 2) {
                    if (!this.f114218o || !z) {
                        z5 = z;
                        z4 = false;
                        z3 = false;
                    } else if (bfit.m96874a(bfnx4, this.f114210G)) {
                        z4 = !Boolean.TRUE.equals(bool);
                        z5 = z;
                    } else {
                        z5 = z;
                        z4 = false;
                        z3 = false;
                    }
                } else if (bool == null) {
                    z5 = z;
                    z4 = true;
                } else {
                    if (z) {
                        bool.booleanValue();
                    }
                    z5 = z && !bool.booleanValue();
                    z4 = true;
                    z3 = true;
                }
                z3 = true;
            }
            bfmn bfmn4 = this.f114216m;
            if (!(bfmn4 == null || (bgjm = this.f114210G) == null)) {
                long j6 = bfmn4.f114417g;
                long j7 = bgjm.f116616b;
                if (j6 > j7) {
                    bflw bflw2 = ((berb) this.f114206C).f112175ay;
                    Boolean a2 = bflw2.mo61904a(j7, j6, 20000);
                    Boolean b2 = bflw2.mo61905b(j7, j6, 80000);
                    Boolean c3 = bflw2.mo61906c(j7, j6, 200000);
                    if (a2 == null || b2 == null) {
                        bool2 = null;
                        bfnx = this.f114220q;
                        bfmn = this.f114216m;
                        j2 = bfmn.f114417g;
                        j3 = bfnx.f114524a;
                        if (j2 > j3) {
                        }
                        bfmn2 = this.f114216m;
                        if (bfmn2 != null) {
                        }
                        int i2 = (z5 ? 1 : 0) + (z4 ? 1 : 0) + (z7 ? 1 : 0);
                        int i3 = (z ? 1 : 0) + (z3 ? 1 : 0) + (z6 ? 1 : 0);
                        boolean a3 = m97050a(i, z5, z4, z7);
                        boolean a4 = m97050a(i, z, z3, z6);
                        if (!this.f114051e.f113438c.mo61413g()) {
                        }
                        m97049a(i, c, z5, z4, z7, z2);
                        m97055k();
                        if (m97051h(j)) {
                        }
                    } else {
                        if (c3 != null) {
                            bool2 = Boolean.valueOf(a2.booleanValue() || b2.booleanValue() || c3.booleanValue());
                        } else {
                            bool2 = null;
                        }
                        bfnx = this.f114220q;
                        bfmn = this.f114216m;
                        if (!(bfnx == null || bfmn == null)) {
                            j2 = bfmn.f114417g;
                            j3 = bfnx.f114524a;
                            if (j2 > j3) {
                                bflw bflw3 = ((berb) this.f114206C).f112175ay;
                                Boolean a5 = bflw3.mo61904a(j3, j2, 2000);
                                Boolean b3 = bflw3.mo61905b(j3, j2, 8000);
                                Boolean c4 = bflw3.mo61906c(j3, j2, 20000);
                                if (a5 == null || b3 == null) {
                                    z9 = null;
                                } else if (c4 != null) {
                                    z9 = Boolean.valueOf(a5.booleanValue() || b3.booleanValue() || c4.booleanValue());
                                } else {
                                    z9 = null;
                                }
                            }
                        }
                        bfmn2 = this.f114216m;
                        if (bfmn2 != null) {
                            boolean a6 = this.f114055i.mo61739a(bfmn2, this.f114210G);
                            if (!z4 || Boolean.TRUE.equals(z9)) {
                                z8 = z5 && !Boolean.TRUE.equals(bool2) && !a6;
                            } else {
                                z8 = true;
                            }
                            if (z3) {
                                z7 = z8;
                                z6 = true;
                            } else if (z && !a6) {
                                z7 = z8;
                                z6 = true;
                            } else {
                                z7 = z8;
                                z6 = false;
                            }
                        } else {
                            z7 = false;
                            z6 = false;
                        }
                        int i22 = (z5 ? 1 : 0) + (z4 ? 1 : 0) + (z7 ? 1 : 0);
                        int i32 = (z ? 1 : 0) + (z3 ? 1 : 0) + (z6 ? 1 : 0);
                        boolean a32 = m97050a(i, z5, z4, z7);
                        boolean a42 = m97050a(i, z, z3, z6);
                        if (!this.f114051e.f113438c.mo61413g()) {
                            if (i22 < i32 || !a32) {
                                if (a42) {
                                    m97049a(i, c, z, z3, z6, z2);
                                    m97055k();
                                }
                                if (m97051h(j)) {
                                    return false;
                                }
                                m97052i();
                                return true;
                            }
                        }
                        m97049a(i, c, z5, z4, z7, z2);
                        m97055k();
                        if (m97051h(j)) {
                        }
                    }
                }
            }
            bool2 = false;
            bfnx = this.f114220q;
            bfmn = this.f114216m;
            j2 = bfmn.f114417g;
            j3 = bfnx.f114524a;
            if (j2 > j3) {
            }
            bfmn2 = this.f114216m;
            if (bfmn2 != null) {
            }
            int i222 = (z5 ? 1 : 0) + (z4 ? 1 : 0) + (z7 ? 1 : 0);
            int i322 = (z ? 1 : 0) + (z3 ? 1 : 0) + (z6 ? 1 : 0);
            boolean a322 = m97050a(i, z5, z4, z7);
            boolean a422 = m97050a(i, z, z3, z6);
            if (!this.f114051e.f113438c.mo61413g()) {
            }
            m97049a(i, c, z5, z4, z7, z2);
            m97055k();
            if (m97051h(j)) {
            }
        } else {
            m97052i();
            return true;
        }
    }

    /* renamed from: e */
    public final void mo61766e(boolean z) {
        this.f114222s = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo61769f(long j) {
        if (this.f114223t != null && mo61754a()) {
            long j2 = this.f114224u;
            if (j - j2 < 15000) {
                m97053i(j2 + 15000);
                return false;
            }
            m97054j();
            return false;
        }
        m97054j();
        this.f114224u = -1;
        this.f114056j = bfis.IDLE;
        return true;
    }

    /* renamed from: i */
    private final void m97053i(long j) {
        if (j != this.f114207D) {
            this.f114207D = j;
            this.f114050d.mo62917a(bgnq.PASSIVE_COLLECTOR, this.f114207D, null);
        }
    }

    /* renamed from: a */
    private final boolean m97050a(int i, boolean z, boolean z2, boolean z3) {
        if ((z ? 1 : 0) + (z2 ? 1 : 0) + (z3 ? 1 : 0) < 2) {
            return false;
        }
        if (!z3 && i == 1) {
            return false;
        }
        if (i == 4 && (!z2 || !z)) {
            return false;
        }
        if (z2 && z3 && !z) {
            long c = this.f114049c.mo62776c();
            long j = this.f114219p;
            if (c < j) {
                StringBuilder sb = new StringBuilder(60);
                sb.append("Not uploading non GNSS collection until ");
                sb.append(j);
                sb.toString();
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo61743a(int i, int i2, boolean z) {
        float a = bhct.m100646a(i, i2);
        if (a >= 0.0f) {
            boolean z2 = true;
            if (!z && ((double) a) < 0.2d) {
                z2 = false;
            }
            this.f114214k = z2;
        }
        this.f114215l = z;
    }

    /* renamed from: a */
    public final void mo61745a(bfmn bfmn) {
        if (bfmn == null || !bfmn.mo61950e()) {
            this.f114216m = null;
            return;
        }
        bfmn bfmn2 = this.f114216m;
        boolean z = false;
        if (bfmn2 != null && bfmn2.mo61949b(bfmn)) {
            if (this.f114216m.f114420j != bfmn.f114420j) {
                z = true;
            } else {
                return;
            }
        }
        this.f114216m = bfmn;
        if (mo61754a()) {
            if (!z) {
                this.f114229z = true;
            }
            String valueOf = String.valueOf(this.f114216m);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb.append("updateCellState(): Updated to ");
            sb.append(valueOf);
            sb.toString();
        }
    }

    /* renamed from: a */
    public final void mo61746a(bfnx bfnx) {
        boolean z;
        if (bfnx != null && bfnx.mo62006b() != 0) {
            this.f114220q = bfnx;
            if (mo61754a()) {
                bfnx bfnx2 = this.f114217n;
                if (bfnx2 == null || bfnx.f114524a - bfnx2.f114524a > 600000) {
                    boolean z2 = this.f114228y;
                    if (this.f114055i.mo61737a(bfnx, this.f114049c.mo62776c()) > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z3 = z2 | z;
                    this.f114228y = z3;
                    if (z3) {
                        int b = bfnx.mo62006b();
                        StringBuilder sb = new StringBuilder(23);
                        sb.append("Updated ");
                        sb.append(b);
                        sb.append(" APs");
                        sb.toString();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo61747a(bgjm bgjm) {
        if (bgjm != null) {
            this.f114210G = bgjm;
            if (!mo61754a()) {
                return;
            }
            if (!this.f114218o || !bfit.m96874a(this.f114220q, this.f114210G)) {
                bgjm bgjm2 = this.f114055i.f114031c;
                if (bgjm2 != null && ayuo.m84846b(bgjm2.mo62896b(), bgjm2.mo62897c(), this.f114210G.mo62896b(), this.f114210G.mo62897c()) > 200.0d) {
                    this.f114205B = true;
                    return;
                }
                return;
            }
            this.f114204A = true;
        }
    }

    /* renamed from: a */
    public final void mo61748a(bgnq bgnq) {
        if (bgnq == bgnq.PASSIVE_COLLECTOR) {
            this.f114207D = -1;
        }
    }

    /* renamed from: a */
    public final void mo61750a(ActivityRecognitionResult activityRecognitionResult) {
        if (activityRecognitionResult != null && activityRecognitionResult.mo43492b().mo43513a() != 5) {
            this.f114221r = activityRecognitionResult;
        }
    }

    /* renamed from: a */
    public final void mo61751a(PrintWriter printWriter) {
        int i = this.f114211H;
        StringBuilder sb = new StringBuilder(29);
        sb.append("PC uploadCount is ");
        sb.append(i);
        printWriter.println(sb.toString());
        int i2 = this.f114212I;
        StringBuilder sb2 = new StringBuilder(27);
        sb2.append("PC itemCount is ");
        sb2.append(i2);
        printWriter.println(sb2.toString());
        int i3 = this.f114213J;
        StringBuilder sb3 = new StringBuilder(27);
        sb3.append("PC cellCount is ");
        sb3.append(i3);
        printWriter.println(sb3.toString());
        int i4 = this.f114226w;
        StringBuilder sb4 = new StringBuilder(27);
        sb4.append("PC wifiCount is ");
        sb4.append(i4);
        printWriter.println(sb4.toString());
        int i5 = this.f114227x;
        StringBuilder sb5 = new StringBuilder(27);
        sb5.append("PC gnssCount is ");
        sb5.append(i5);
        printWriter.println(sb5.toString());
    }

    /* renamed from: a */
    public final boolean mo61754a() {
        return this.f114214k && super.mo61754a() && this.f114222s && bfjg.m97018a(32);
    }
}
