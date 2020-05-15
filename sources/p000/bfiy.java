package p000;

import com.google.android.gms.location.ActivityRecognitionResult;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: bfiy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfiy extends bfit {

    /* renamed from: A */
    boolean f114115A = false;

    /* renamed from: B */
    final bfiw f114116B;

    /* renamed from: C */
    long f114117C = -1;

    /* renamed from: D */
    bgjm f114118D = null;

    /* renamed from: E */
    public bgjm f114119E = null;

    /* renamed from: F */
    private long f114120F = 480000;

    /* renamed from: k */
    public long f114121k = 0;

    /* renamed from: l */
    long f114122l = -1;

    /* renamed from: m */
    int f114123m = 0;

    /* renamed from: n */
    boolean f114124n = false;

    /* renamed from: o */
    boolean f114125o = false;

    /* renamed from: p */
    boolean f114126p = false;

    /* renamed from: q */
    bfmn f114127q = null;

    /* renamed from: r */
    bfnx f114128r = null;

    /* renamed from: s */
    ActivityRecognitionResult f114129s = null;

    /* renamed from: t */
    public final bfix f114130t = new bfix((int) cetf.m138224b());

    /* renamed from: u */
    bsax f114131u;

    /* renamed from: v */
    boolean f114132v = false;

    /* renamed from: w */
    long f114133w = -1;

    /* renamed from: x */
    boolean f114134x = false;

    /* renamed from: y */
    long f114135y = -1;

    /* renamed from: z */
    boolean f114136z = false;

    public bfiy(bgnp bgnp, bgmk bgmk, bgns bgns, bfcu bfcu, bgoj bgoj, bhaz bhaz, bfiq bfiq, bglw bglw) {
        super("BurstCollector", bgnp, bgmk, bgns, bfcu, bgoj, bhaz, bfiq, bfis.IDLE);
        this.f114116B = new bfiw(bgnp, bgmk, bgns, bgoj, bfcu.f113438c, bglw);
    }

    /* renamed from: h */
    private final boolean m96946h(long j) {
        long burstCollectorMinIdleTimeOnBatteryMillis = cetf.f183418a.mo6606a().burstCollectorMinIdleTimeOnBatteryMillis();
        if (this.f114125o) {
            burstCollectorMinIdleTimeOnBatteryMillis = this.f114120F;
        }
        long j2 = this.f114122l;
        return j2 == -1 || j - j2 > burstCollectorMinIdleTimeOnBatteryMillis;
    }

    /* renamed from: i */
    private final void m96947i() {
        if (this.f114134x) {
            this.f114050d.mo62914a(bgnq.BURST_COLLECTOR);
            this.f114134x = false;
            this.f114050d.mo62925c(bgnq.BURST_COLLECTOR);
        }
    }

    /* renamed from: j */
    private final void m96949j(long j) {
        if (this.f114056j == bfis.GPS_WAIT || this.f114056j == bfis.UPLOAD_WAIT) {
            bgjm bgjm = this.f114119E;
            if (bgjm != null) {
                bgjm bgjm2 = this.f114118D;
                if (bgjm2 != null) {
                    if (bfit.m96875a(bgjm, bgjm2, 25)) {
                        this.f114123m++;
                    } else {
                        bgjm = this.f114119E;
                    }
                }
                this.f114118D = bgjm;
                this.f114123m = 1;
            }
            this.f114122l = j;
        }
        this.f114119E = null;
        this.f114121k = 0;
        this.f114056j = bfis.IDLE;
        this.f114131u = null;
        this.f114115A = false;
        this.f114117C = -1;
        this.f114135y = -1;
        this.f114136z = false;
        this.f114050d.mo62914a(bgnq.BURST_COLLECTOR);
    }

    /* renamed from: a */
    public final void mo61743a(int i, int i2, boolean z) {
        double burstCollectorMinBatteryLevel = cetf.f183418a.mo6606a().burstCollectorMinBatteryLevel();
        float a = bhct.m100646a(i, i2);
        boolean z2 = false;
        if (a >= 0.0f) {
            this.f114124n = z || ((double) a) >= burstCollectorMinBatteryLevel;
            this.f114125o = z && ((double) a) >= 0.9d;
        }
        this.f114126p = z;
        bfiw bfiw = this.f114116B;
        double burstCollectionTriggerMinBatteryLevel = cetf.f183418a.mo6606a().burstCollectionTriggerMinBatteryLevel();
        float a2 = bhct.m100646a(i, i2);
        if (a2 >= 0.0f) {
            double d = (double) a2;
            if (!z ? d >= burstCollectionTriggerMinBatteryLevel : d >= 0.20000000298023224d) {
                z2 = true;
            }
            bfiw.f114086d = z2;
        }
        bfiw.mo61775a();
    }

    /* renamed from: a */
    public final void mo61746a(bfnx bfnx) {
        this.f114128r = bfnx;
    }

    /* renamed from: a */
    public final void mo61749a(bsax bsax) {
        this.f114131u = null;
    }

    /* renamed from: b */
    public final void mo61757b(boolean z) {
        this.f114116B.mo61775a();
    }

    /* renamed from: c */
    public final void mo61759c(boolean z) {
    }

    /* renamed from: d */
    public final void mo61762d() {
        super.mo61762d();
        bfiw bfiw = this.f114116B;
        bfiw.f114087e = false;
        bfiw.mo61775a();
    }

    /* renamed from: e */
    public final void mo61766e(boolean z) {
        this.f114132v = z;
        bfiw bfiw = this.f114116B;
        bfiw.f114084b = z;
        bfiw.mo61775a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo61769f(long j) {
        if (this.f114131u == null || !mo61754a()) {
            m96949j(j);
            this.f114133w = -1;
            m96947i();
            return true;
        } else if (j - this.f114133w < 15000) {
            this.f114050d.mo62917a(bgnq.BURST_COLLECTOR, this.f114133w + 15000, null);
            return false;
        } else {
            m96947i();
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01fb, code lost:
        if (r6.mo61739a(r7, r5) != false) goto L_0x01fd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0256  */
    /* renamed from: c */
    public final boolean mo61761c(long j) {
        boolean z;
        boolean z2;
        bfnx bfnx;
        boolean z3;
        bfnx bfnx2;
        int i;
        int i2;
        bsax bsax;
        boolean z4;
        int i3;
        long j2 = j;
        bgjm a = this.f114130t.mo61777a();
        if (!m96948i(j)) {
            this.f114116B.mo61776b();
            bfix bfix = this.f114130t;
            boolean z5 = this.f114136z;
            long d = this.f114049c.mo62777d();
            long j3 = this.f114121k;
            boolean z6 = this.f114126p;
            int a2 = this.f114048b.mo62758m().mo62926a();
            bgjm bgjm = this.f114118D;
            int i4 = 0;
            while (true) {
                i = -1;
                if (i4 < bfix.f114109a.size()) {
                    if (((bgjm) bfix.f114109a.get(i4)).f116616b >= j3) {
                        i2 = i4;
                        break;
                    }
                    i4++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 != -1) {
                bsax = new bsax(bgox.f117045al);
                int i5 = 0;
                while (i5 < bfix.f114109a.size()) {
                    bgjm bgjm2 = (bgjm) bfix.f114109a.get(i5);
                    bfmn bfmn = (bfmn) bfix.f114110b.get(bgjm2);
                    bfnx bfnx3 = (bfnx) bfix.f114111c.get(bgjm2);
                    ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) bfix.f114112d.get(bgjm2);
                    if (i5 < i2) {
                        i3 = 17;
                    } else if (i5 == i2) {
                        i3 = !z5 ? 6 : 19;
                    } else if (i5 != bfix.f114109a.size() + i) {
                        i3 = 8;
                    } else {
                        if (bgjm != null) {
                            ArrayList arrayList = bfix.f114109a;
                            if (bfit.m96875a((bgjm) arrayList.get(arrayList.size() - 1), bgjm, 25)) {
                                i3 = 10;
                            }
                        }
                        i3 = 9;
                    }
                    bsax.mo70107a(4, bfit.m96873a(d, bgjm2, bfmn, bfnx3, activityRecognitionResult, z6, i3, a2));
                    i5++;
                    z6 = z6;
                    bgjm = bgjm;
                    i = -1;
                }
            } else {
                bsax = null;
            }
            this.f114131u = bsax;
            if (bsax != null) {
                this.f114052f.mo63512a(this.f114049c, bsax);
                ((bgfj) this.f114048b).mo62763r().mo62893a(bsax, this.f114053g);
                Locale locale = Locale.US;
                new Object[1][0] = Integer.valueOf(this.f114130t.f114109a.size());
                this.f114056j = bfis.UPLOAD_WAIT;
                this.f114050d.mo62923b(bgnq.BURST_COLLECTOR, 60000, null);
                this.f114134x = true;
                this.f114133w = this.f114049c.mo62776c();
                this.f114119E = this.f114130t.mo61777a();
                z4 = true;
            } else {
                z4 = false;
            }
            bfix bfix2 = this.f114130t;
            bfix2.f114109a.clear();
            bfix2.f114110b.clear();
            bfix2.f114111c.clear();
            bfix2.f114112d.clear();
            bfix2.f114113e = 0;
            if (!z4) {
                m96949j(j);
                z = true;
            } else {
                z = true;
            }
        } else {
            if (this.f114115A) {
                bfix bfix3 = this.f114130t;
                bgjm a3 = bfix3.mo61777a();
                bfiq bfiq = this.f114055i;
                bfmn bfmn2 = this.f114127q;
                bfnx bfnx4 = this.f114128r;
                ActivityRecognitionResult activityRecognitionResult2 = this.f114129s;
                if (a3 != null) {
                    long b = cetf.m138224b();
                    if (activityRecognitionResult2 == null || !cevn.m138305c() || !bfit.m96876a(activityRecognitionResult2, a3) || j2 - bfix3.f114113e < b || bfix3.f114112d.containsKey(a3)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (bfnx4 == null || !bfit.m96874a(bfnx4, a3) || j2 - bfix3.f114113e < b || bfix3.f114111c.containsKey(a3) || bfix3.f114110b.containsKey(a3) || bfnx4.mo62006b() == 0) {
                        bfnx = bfnx4;
                        z3 = false;
                    } else {
                        double a4 = (double) bfiq.mo61737a(bfnx4, j2);
                        bfnx = bfnx4;
                        double b2 = (double) bfnx4.mo62006b();
                        Double.isNaN(a4);
                        Double.isNaN(b2);
                        z3 = a4 / b2 > 0.3d;
                    }
                    if (bfmn2 != null && !bfix3.f114110b.containsKey(a3)) {
                        if (j2 - bfix3.f114113e < b) {
                            bfmn2 = null;
                        } else if (!z3) {
                        }
                        if (!z3) {
                            bfnx2 = bfnx;
                        } else {
                            bfnx2 = null;
                        }
                        if (!z2) {
                            activityRecognitionResult2 = null;
                        }
                        if (bfmn2 != null) {
                            bfix3.f114110b.put(a3, bfmn2);
                            Locale locale2 = Locale.US;
                            new Object[1][0] = Long.valueOf(bfmn2.f114417g);
                        }
                        if (bfnx2 != null) {
                            bfix3.f114111c.put(a3, bfnx2);
                            Locale locale3 = Locale.US;
                            new Object[1][0] = Long.valueOf(bfnx2.f114524a);
                        }
                        if (activityRecognitionResult2 != null) {
                            bfix3.f114112d.put(a3, activityRecognitionResult2);
                            Locale locale4 = Locale.US;
                            new Object[1][0] = Long.valueOf(activityRecognitionResult2.f79302c);
                        }
                        if (!(bfnx2 == null && bfmn2 == null && activityRecognitionResult2 == null)) {
                            bfix3.f114113e = j2;
                        }
                        bfiq.mo61738a(a3, bfmn2, bfnx2);
                        if (z3) {
                            this.f114128r = null;
                        }
                        z = false;
                    }
                    bfmn2 = null;
                    if (!z3) {
                    }
                    if (!z2) {
                    }
                    if (bfmn2 != null) {
                    }
                    if (bfnx2 != null) {
                    }
                    if (activityRecognitionResult2 != null) {
                    }
                    bfix3.f114113e = j2;
                    bfiq.mo61738a(a3, bfmn2, bfnx2);
                    if (z3) {
                    }
                    z = false;
                }
            }
            z = false;
        }
        if (this.f114056j == bfis.GPS_WAIT) {
            if (this.f114135y == -1) {
                long b3 = cetf.m138224b() + 10000;
                bgns bgns = this.f114050d;
                bgnq bgnq = bgnq.BURST_COLLECTOR;
                if (a != null) {
                    j2 = a.f116616b;
                }
                bgns.mo62917a(bgnq, j2 + b3, null);
            } else {
                this.f114050d.mo62917a(bgnq.BURST_COLLECTOR, this.f114135y + 60000, null);
            }
        }
        this.f114115A = false;
        return z;
    }

    /* renamed from: i */
    private final boolean m96948i(long j) {
        boolean z;
        boolean z2;
        if (!bfjg.m97018a(2) || !mo61754a()) {
            return false;
        }
        bfis bfis = bfis.OFF;
        int ordinal = this.f114056j.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                long j2 = this.f114135y;
                if (j2 != -1) {
                    z = j - j2 >= 60000;
                } else {
                    bgjm a = this.f114130t.mo61777a();
                    if (a != null) {
                        if (j - a.f116616b >= cetf.m138224b() + 10000) {
                            z = true;
                        }
                    }
                    z = false;
                }
                if (j - this.f114121k >= cetf.f183418a.mo6606a().burstCollectorMaxBurstTimeMillis()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!this.f114048b.mo62757l().mo62791cs() || z || z2) {
                    Locale locale = Locale.US;
                    Object[] objArr = {Boolean.valueOf(z), Boolean.valueOf(z2)};
                    return false;
                }
            } else if (ordinal != 5) {
                return false;
            } else {
                return true;
            }
        }
        if (!this.f114132v || !this.f114124n) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo61758b(long j) {
        long j2;
        ActivityRecognitionResult activityRecognitionResult;
        long j3 = j;
        bgjm a = this.f114130t.mo61777a();
        boolean z = false;
        if (m96948i(j)) {
            long j4 = this.f114117C;
            if (j4 != -1 && j3 - j4 <= 60000 && cetc.f183416a.mo6606a().burstCollectorActiveModeEnabled()) {
                this.f114117C = -1;
                bfiw bfiw = this.f114116B;
                if (bfiw.f114100r != 4 || !bfiw.f114083a.mo62757l().mo62791cs()) {
                    this.f114116B.mo61776b();
                } else {
                    bfiw.f114089g = true;
                    bfiw.mo61775a();
                    this.f114135y = j3;
                    this.f114136z = true;
                    z = true;
                }
            } else if (m96946h(j) && a != null) {
                long j5 = a.f116616b;
                if (j3 - j5 < 30000) {
                    bgjm bgjm = this.f114055i.f114031c;
                    if (bgjm != null) {
                        j2 = bgjm.f116616b;
                    } else {
                        j2 = -1;
                    }
                    if (j5 > j2 && cetc.f183416a.mo6606a().burstCollectorPassiveModeEnabled() && (!cetc.f183416a.mo6606a().burstCollectorPassiveModeActivityCheckEnabled() || ((activityRecognitionResult = this.f114129s) != null && activityRecognitionResult.mo43491a().mo43513a() == 0))) {
                        this.f114135y = -1;
                        this.f114136z = false;
                        Locale locale = Locale.US;
                        Object[] objArr = {Long.valueOf(j), Long.valueOf(a.f116616b)};
                        z = true;
                    }
                }
            }
            if (z) {
                this.f114056j = bfis.GPS_WAIT;
                this.f114121k = j3;
            }
        }
        long j6 = this.f114117C;
        if (((j6 != -1 && j3 - j6 > 60000) || !bfjg.m97018a(2)) && !z) {
            this.f114117C = -1;
            this.f114116B.mo61776b();
        }
        return z;
    }

    /* renamed from: d */
    public final void mo61763d(boolean z) {
        bfiw bfiw = this.f114116B;
        bfiw.f114085c = z;
        bfiw.mo61775a();
    }

    /* renamed from: a */
    public final void mo61744a(bfct bfct) {
        StringBuilder sb = new StringBuilder(27);
        sb.append("Idle time collection: false");
        sb.toString();
        this.f114116B.mo61775a();
        this.f114120F = ((long) bfct.mo61416j()) * 1000;
        Locale locale = Locale.US;
        new Object[1][0] = Long.valueOf(this.f114120F);
    }

    /* renamed from: a */
    public final void mo61745a(bfmn bfmn) {
        if (bfmn == null || !bfmn.mo61950e()) {
            this.f114127q = null;
        } else {
            this.f114127q = bfmn;
        }
    }

    /* renamed from: a */
    public final void mo61747a(bgjm bgjm) {
        if (bgjm != null && mo61754a()) {
            this.f114051e.f113438c.mo61419r();
            boolean h = m96946h(this.f114049c.mo62776c());
            if ((this.f114056j == bfis.IDLE && h) || this.f114056j == bfis.GPS_WAIT) {
                bgjm bgjm2 = this.f114118D;
                if (bgjm2 == null || !bfit.m96875a(bgjm2, bgjm, 25) || this.f114123m < 2) {
                    bfix bfix = this.f114130t;
                    if (bfix.f114109a.size() <= 1) {
                        bfix.f114109a.add(bgjm);
                        Locale locale = Locale.US;
                        new Object[1][0] = Long.valueOf(bgjm.f116616b);
                    } else {
                        int size = bfix.f114109a.size();
                        int i = size - 1;
                        bgjm bgjm3 = (bgjm) bfix.f114109a.get(i);
                        long j = bgjm3.f116616b;
                        long j2 = j - ((bgjm) bfix.f114109a.get(size - 2)).f116616b;
                        long j3 = bgjm.f116616b - j;
                        if ((j2 + j3 <= ((long) (bfix.f114114f + 500)) || (j2 >= 60000 && j3 >= 60000)) && !bfix.f114110b.containsKey(bgjm3) && !bfix.f114111c.containsKey(bgjm3) && !bfix.f114112d.containsKey(bgjm3)) {
                            bfix.mo61778a(i);
                        }
                        bfix.f114109a.add(bgjm);
                        Locale locale2 = Locale.US;
                        new Object[1][0] = Long.valueOf(bgjm.f116616b);
                    }
                    if (bfix.f114109a.size() > 100) {
                        bfix.mo61778a(0);
                    }
                    this.f114115A = true;
                    this.f114135y = -1;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo61748a(bgnq bgnq) {
        bfiw bfiw = this.f114116B;
        if (bgnq == bgnq.BURST_COLLECTION_TRIGGER) {
            bfiw.mo61775a();
        }
    }

    /* renamed from: a */
    public final void mo61750a(ActivityRecognitionResult activityRecognitionResult) {
        if (activityRecognitionResult != null && activityRecognitionResult.mo43492b().mo43513a() != 5) {
            this.f114129s = activityRecognitionResult;
            bfiw bfiw = this.f114116B;
            int i = bfiw.f114100r;
            if (i == 2 || i == 3 || i == 4) {
                int a = activityRecognitionResult.mo43491a().mo43513a();
                bfiw.f114091i = a;
                if (a == 0) {
                    bfiw.f114090h = true;
                }
                bfiw.mo61775a();
            }
        }
    }

    /* renamed from: a */
    public final void mo61752a(Object obj) {
        if (this.f114056j == bfis.IDLE) {
            this.f114117C = this.f114049c.mo62776c();
        } else {
            this.f114116B.mo61776b();
        }
    }

    /* renamed from: a */
    public final void mo61753a(boolean z) {
        this.f114054h = z;
        bfiw bfiw = this.f114116B;
        bfiw.f114099q = z;
        bfiw.mo61775a();
    }
}
