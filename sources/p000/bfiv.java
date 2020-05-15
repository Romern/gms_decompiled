package p000;

import java.util.ArrayList;

/* renamed from: bfiv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfiv extends bfit {

    /* renamed from: k */
    long f114068k = 0;

    /* renamed from: l */
    long f114069l;

    /* renamed from: m */
    float f114070m = 0.0f;

    /* renamed from: n */
    boolean f114071n = false;

    /* renamed from: o */
    boolean f114072o = false;

    /* renamed from: p */
    final ArrayList f114073p = new ArrayList();

    /* renamed from: q */
    boolean f114074q = false;

    /* renamed from: r */
    long f114075r;

    /* renamed from: s */
    bfnx f114076s;

    /* renamed from: t */
    boolean f114077t = true;

    /* renamed from: u */
    bsax f114078u;

    /* renamed from: v */
    long f114079v = -1;

    /* renamed from: w */
    int f114080w = 1;

    /* renamed from: x */
    bgjm f114081x;

    /* renamed from: y */
    private final bfir f114082y;

    public bfiv(bgnp bgnp, bgmk bgmk, bgns bgns, bfcu bfcu, bgoj bgoj, bhaz bhaz, bfiq bfiq) {
        super("ActiveCollector", bgnp, bgmk, bgns, bfcu, bgoj, bhaz, bfiq, bfis.OFF);
        this.f114068k = (bgmk.mo62776c() + 10800000) - cerj.m138124b();
        this.f114069l = 30000;
        this.f114082y = new bfir(bgmk, 1);
    }

    /* renamed from: b */
    private static final boolean m96910b(bgjm bgjm) {
        return bgjm.mo62895a() <= 40.0f && bgjm.mo62898d() <= 1.5f;
    }

    /* renamed from: h */
    private final void m96911h(long j) {
        if (j != this.f114079v) {
            this.f114079v = j;
            this.f114050d.mo62917a(bgnq.ACTIVE_COLLECTOR, this.f114079v, null);
        }
    }

    /* renamed from: i */
    private final void m96912i() {
        this.f114056j = bfis.OFF;
        int i = this.f114080w;
        if (i != 1) {
            if (i == 2) {
                this.f114048b.mo62757l().mo62790a(bgnq.ACTIVE_COLLECTOR, false);
            }
            this.f114050d.mo62925c(bgnq.ACTIVE_COLLECTOR);
            this.f114080w = 1;
            this.f114068k = this.f114049c.mo62776c();
        }
        m96914j();
        this.f114076s = null;
    }

    /* renamed from: j */
    private final void m96914j() {
        this.f114073p.clear();
        this.f114074q = false;
        this.f114081x = null;
    }

    /* renamed from: a */
    public final void mo61743a(int i, int i2, boolean z) {
        this.f114071n = z;
        float a = bhct.m100646a(i, i2);
        if (a >= 0.0f) {
            this.f114070m = a;
        }
    }

    /* renamed from: a */
    public final void mo61744a(bfct bfct) {
    }

    /* renamed from: a */
    public final void mo61745a(bfmn bfmn) {
    }

    /* renamed from: a */
    public final void mo61749a(bsax bsax) {
        this.f114078u = null;
    }

    /* renamed from: c */
    public final void mo61759c(boolean z) {
        if (this.f114072o != z) {
            this.f114072o = z;
        }
    }

    /* renamed from: d */
    public final void mo61763d(boolean z) {
        this.f114077t = z;
    }

    /* renamed from: e */
    public final void mo61766e(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo61769f(long j) {
        if (m96913i(j) && this.f114078u != null) {
            m96911h(this.f114068k + this.f114069l);
            return false;
        }
        m96912i();
        return true;
    }

    /* renamed from: g */
    public final void mo61770g(long j) {
        this.f114082y.mo61740a(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo61758b(long j) {
        if (!m96913i(j)) {
            m96912i();
            return true;
        }
        long b = cerj.m138124b();
        if (b <= j - this.f114068k || this.f114082y.mo61741a()) {
            this.f114050d.mo62923b(bgnq.ACTIVE_COLLECTOR, 60000, null);
            this.f114080w = 2;
            this.f114068k = this.f114049c.mo62776c();
            this.f114069l = 30000;
            this.f114048b.mo62757l().mo62790a(bgnq.ACTIVE_COLLECTOR, true);
            this.f114056j = bfis.GPS_WAIT;
            this.f114082y.mo61742b();
            return true;
        }
        m96911h(this.f114068k + b);
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo61761c(long j) {
        if (!m96913i(j)) {
            m96912i();
            return true;
        } else if (this.f114074q) {
            this.f114075r = j;
            this.f114048b.mo62759n().mo62800a(bgnq.ACTIVE_COLLECTOR, false, null);
            this.f114056j = bfis.SCAN_WAIT;
            return true;
        } else {
            m96911h(this.f114068k + this.f114069l);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo61764d(long j) {
        if (!m96913i(j)) {
            m96912i();
            return true;
        } else if (this.f114076s == null) {
            m96911h(this.f114068k + this.f114069l);
            return false;
        } else {
            this.f114056j = bfis.POST_SCAN_GPS_WAIT;
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo61767e(long j) {
        if (!m96913i(j)) {
            m96912i();
            return true;
        } else if (this.f114081x != null) {
            String valueOf = String.valueOf(this.f114073p.get(0));
            String valueOf2 = String.valueOf(this.f114076s);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23 + String.valueOf(valueOf2).length());
            sb.append("Success: location ");
            sb.append(valueOf);
            sb.append("scan ");
            sb.append(valueOf2);
            sb.toString();
            bsax a = bfit.m96873a(this.f114049c.mo62777d(), this.f114081x, null, this.f114076s, null, this.f114071n, 13, this.f114048b.mo62758m().mo62926a());
            bsax bsax = new bsax(bgox.f117045al);
            bsax.mo70107a(4, a);
            this.f114052f.mo63512a(this.f114049c, bsax);
            ((bgfj) this.f114048b).mo62763r().mo62893a(bsax, this.f114053g);
            this.f114055i.mo61738a(this.f114081x, null, this.f114076s);
            this.f114078u = bsax;
            this.f114056j = bfis.UPLOAD_WAIT;
            this.f114048b.mo62757l().mo62790a(bgnq.ACTIVE_COLLECTOR, false);
            this.f114080w = 3;
            return true;
        } else {
            m96911h(this.f114068k + this.f114069l);
            return false;
        }
    }

    /* renamed from: a */
    public final void mo61746a(bfnx bfnx) {
        if (this.f114056j != bfis.SCAN_WAIT) {
            return;
        }
        if (bfnx.f114524a - this.f114075r < 1000) {
            this.f114048b.mo62759n().mo62800a(bgnq.ACTIVE_COLLECTOR, false, null);
        } else {
            this.f114076s = bfnx;
        }
    }

    /* renamed from: i */
    private final boolean m96913i(long j) {
        float f;
        if (bfjg.m97018a(1) && mo61754a()) {
            bfis bfis = bfis.OFF;
            int ordinal = this.f114056j.ordinal();
            if (!(ordinal == 0 || ordinal == 1)) {
                if (ordinal != 2) {
                    if (ordinal != 3 && ordinal != 4) {
                        return ordinal == 5 && this.f114069l > j - this.f114068k;
                    }
                    if (!this.f114074q) {
                        return false;
                    }
                }
                if (!this.f114048b.mo62757l().mo62791cs() || this.f114069l <= j - this.f114068k) {
                    return false;
                }
            }
            if (this.f114072o && !this.f114077t && this.f114078u == null) {
                float f2 = this.f114070m;
                if (!this.f114071n) {
                    f = 0.7f;
                } else {
                    f = 0.3f;
                }
                if (f2 >= f || this.f114082y.mo61741a()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo61747a(bgjm bgjm) {
        bfis bfis = bfis.OFF;
        int ordinal = this.f114056j.ordinal();
        if (ordinal == 2) {
            if (!m96910b(bgjm)) {
                m96914j();
            } else if (this.f114073p.isEmpty() || bfit.m96875a((bgjm) this.f114073p.get(0), bgjm, 10)) {
                this.f114073p.add(bgjm);
            } else {
                m96914j();
                this.f114073p.add(bgjm);
            }
            if (this.f114073p.size() >= 2) {
                this.f114074q = true;
            }
        } else if (ordinal != 3) {
            if (ordinal == 4) {
                if (!m96910b(bgjm) || !bfit.m96875a((bgjm) this.f114073p.get(0), bgjm, 10)) {
                    m96914j();
                } else {
                    this.f114081x = bgjm;
                }
            }
        } else if (!m96910b(bgjm) || !bfit.m96875a((bgjm) this.f114073p.get(0), bgjm, 10)) {
            m96914j();
        }
    }

    /* renamed from: a */
    public final void mo61748a(bgnq bgnq) {
        if (bgnq == bgnq.ACTIVE_COLLECTOR) {
            this.f114079v = -1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo61755a(long j) {
        if (!m96913i(j)) {
            return false;
        }
        this.f114056j = bfis.IDLE;
        return true;
    }
}
