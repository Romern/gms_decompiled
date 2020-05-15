package p000;

import android.os.SystemClock;

/* renamed from: beti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class beti {

    /* renamed from: d */
    protected final berb f112396d;

    /* renamed from: e */
    protected final bglx f112397e;

    /* renamed from: f */
    protected final berg f112398f;

    /* renamed from: g */
    protected final bgmk f112399g;

    /* renamed from: h */
    protected final bfor f112400h;

    /* renamed from: i */
    protected final bgnr f112401i;

    /* renamed from: j */
    protected final boolean f112402j;

    public beti(berb berb) {
        this.f112396d = berb;
        this.f112397e = berb.f112177d;
        this.f112398f = berb.f112178e;
        this.f112399g = berb.f112180g;
        this.f112400h = berb.f112181h;
        this.f112401i = berb.f112183j;
        this.f112402j = berb.f112189p;
    }

    /* renamed from: a */
    private final void m95783a(berw berw, berx berx) {
        if (mo61130a(berx)) {
            mo61107a((beti) berx);
        } else {
            mo61107a(berw);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo61106A() {
    }

    /* renamed from: B */
    public void mo61114B() {
    }

    /* renamed from: C */
    public void mo61115C() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo61092D() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo61098a(bfnp bfnp, bfnp bfnp2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo61116a(bgnq bgnq) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo61094a(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo61131b(long j) {
        beti beti;
        new Object[1][0] = Long.valueOf(j);
        if (j == 2) {
            m95783a(new betk(this.f112396d), new betl(this.f112396d));
        } else if ((8 & j) != 0) {
            m95783a(new besd(this.f112396d), new bese(this.f112396d));
        } else if (!this.f112396d.mo60975a()) {
            if (j == 39) {
                m95783a(new besf(this.f112396d), new besg(this.f112396d));
            } else if (j == 4) {
                m95783a(new besv(this.f112396d), new besg(this.f112396d));
            } else if (j == 32) {
                m95783a(new besf(this.f112396d), new besg(this.f112396d));
            }
        } else if (mo61133r()) {
            if (this.f112402j) {
                beti = new beuc(this.f112396d);
            } else {
                beti = new betf(this.f112396d);
            }
            mo61107a(beti);
        } else {
            mo61107a(new besk(this.f112396d));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo61132c(long j) {
        if (this.f112396d.f112114B.mo62860d()) {
            this.f112396d.f112114B.mo62863g();
        }
        if (this.f112402j) {
            berb berb = this.f112396d;
            bgnb bgnb = berb.f112172av;
            if (bgnb != null && bgnb.f116833a) {
                berb.mo61007w();
            }
            mo61107a(new betd(this.f112396d, cese.m138154c(), 0));
            return;
        }
        mo61131b(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo61100c(boolean z) {
    }

    /* renamed from: g */
    public void mo61083g() {
        berb berb = this.f112396d;
        if (berb.f112151aa != berb.mo60975a()) {
            berb.mo61001q();
            boolean z = !berb.f112151aa;
            berb.f112151aa = z;
            if (z) {
                berb.f112181h.mo62048a(bfos.ACTIVITY_LOW_POWER_MODE_ON);
            } else {
                berb.f112181h.mo62048a(bfos.ACTIVITY_LOW_POWER_MODE_OFF);
            }
            boolean z2 = berb.f112151aa;
            StringBuilder sb = new StringBuilder(25);
            sb.append("Set low power mode: ");
            sb.append(z2);
            sb.toString();
        }
        berb.mo60981b(berb.f112190q instanceof best);
        if (!berb.f112130R.isEmpty() && berb.f112176az.mo62933b()) {
            if (berb.f112151aa) {
                berb.f112176az.mo62931a();
            } else {
                berb.f112176az.mo62932a(berb);
            }
        }
    }

    /* renamed from: h */
    public void mo61084h() {
        this.f112396d.mo60998n();
    }

    /* renamed from: p */
    public abstract String mo61093p();

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo61133r() {
        if (!this.f112396d.f112199z.mo63024a()) {
            return (this.f112402j && this.f112396d.f112113A.mo63024a()) || this.f112396d.f112114B.mo62860d();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo61108s() {
        if (!(this instanceof best)) {
            mo61107a(new best(this.f112396d));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo61118t() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo61109u() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo61119v() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo61110w() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo61111x() {
        mo61108s();
    }

    /* renamed from: y */
    public void mo61120y() {
    }

    /* renamed from: z */
    public void mo61121z() {
    }

    /* renamed from: a */
    static boolean m95784a(long j, berx berx) {
        return j > (berx.mo61076b() / 1000000) + 1500;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo61107a(beti beti) {
        String p = this.f112396d.f112190q.mo61093p();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        StringBuilder sb = new StringBuilder(String.valueOf(p).length() + 40);
        sb.append("Leaving state: ");
        sb.append(p);
        sb.append(" at: ");
        sb.append(elapsedRealtime);
        sb.toString();
        this.f112396d.f112190q.mo61084h();
        berb berb = this.f112396d;
        if (!beti.getClass().equals(berb.f112190q.getClass())) {
            String p2 = beti.mo61093p();
            Integer num = (Integer) berb.f112117E.get(p2);
            if (num == null) {
                num = 0;
            }
            berb.f112117E.put(p2, Integer.valueOf(num.intValue() + 1));
        }
        berb.f112190q = beti;
        String p3 = this.f112396d.f112190q.mo61093p();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        StringBuilder sb2 = new StringBuilder(String.valueOf(p3).length() + 41);
        sb2.append("Entering state: ");
        sb2.append(p3);
        sb2.append(" at: ");
        sb2.append(elapsedRealtime2);
        sb2.toString();
        beti.mo61083g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo61130a(berx berx) {
        long j;
        bete bete = this.f112396d.f112191r;
        if (bete.f112367a) {
            bgmk bgmk = bete.f112368b;
            if (m95784a(SystemClock.elapsedRealtime() - bete.f112369c, berx)) {
                beqp d = berx.mo61079d();
                if (d != null) {
                    j = d.f112059a;
                } else {
                    j = 3200000000L;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                berb berb = this.f112396d;
                if (elapsedRealtime - Math.min(berb.f112161ak, berb.f112165ao) > j / 1000000) {
                    return true;
                }
            }
        }
        return false;
    }
}
