package p000;

/* renamed from: bxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bxm {

    /* renamed from: d */
    public bqk f5982d;

    /* renamed from: e */
    public cat f5983e;

    /* renamed from: f */
    public bxd f5984f;

    /* renamed from: g */
    public bxn f5985g = bxn.IN_PROGRESS;

    /* renamed from: h */
    public bxf f5986h;

    /* renamed from: i */
    public bzx f5987i;

    /* renamed from: j */
    public bxo f5988j;

    /* renamed from: k */
    public boolean f5989k;

    /* renamed from: l */
    public boolean f5990l;

    /* renamed from: m */
    public boolean f5991m;

    /* renamed from: n */
    public boolean f5992n;

    /* renamed from: o */
    public bxa f5993o;

    /* renamed from: p */
    public bxj f5994p;

    static {
        bxm.class.getSimpleName();
    }

    protected bxm(bxf bxf, bxd bxd, bqk bqk, bxj bxj, bxo bxo) {
        this.f5986h = bxf;
        this.f5984f = bxd;
        this.f5994p = bxj;
        this.f5988j = bxo;
        this.f5983e = bxd != null ? bxd.f5949c : null;
        this.f5982d = bqk;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3441a(bqk bqk) {
        throw null;
    }

    /* renamed from: a */
    public abstract byte[] mo3442a();

    /* renamed from: f */
    public final boolean mo3598f() {
        return this.f5985g.f5999d;
    }

    /* renamed from: g */
    public final void mo3599g() {
        bxp bxp;
        getClass().getSimpleName();
        int i = cbd.f6383a;
        bxa b = this.f5984f.mo3440b();
        if (b != null) {
            this.f5993o = b;
            bqp h = mo3600h();
            if (h != null) {
                if (h.mo3420b() != null) {
                    bxp = new bxp(h.mo3420b());
                } else {
                    bxp = null;
                }
                mo3497a(bxp);
            }
            mo3441a(this.f5982d);
            return;
        }
        throw new bqh(bqe.PAYMENT_KEY_NOT_AVAILABLE);
    }

    /* renamed from: h */
    public final bqp mo3600h() {
        bxa bxa = this.f5993o;
        if (bxa != null) {
            return bxa.f5940a;
        }
        return null;
    }

    /* renamed from: i */
    public final void mo3601i() {
        this.f5989k = true;
    }

    /* renamed from: j */
    public final void mo3602j() {
        this.f5990l = true;
    }

    /* renamed from: k */
    public void mo3501k() {
    }

    public final String toString() {
        cba a = cbb.m3876a(this);
        a.mo3643a();
        a.mo3645a("cvmData", this.f5982d);
        a.mo3645a("card", this.f5984f);
        a.mo3645a("terminalData", this.f5994p);
        a.mo3645a("transactionState", this.f5985g);
        a.mo3645a("paymentType", this.f5986h);
        a.mo3645a("path", this.f5987i);
        a.mo3645a("transientApplicationData", this.f5988j);
        a.mo3646a("ppseIsPerformed", this.f5989k);
        a.mo3646a("selectIsPerformed", this.f5990l);
        a.mo3646a("gpoIsPerformed", this.f5991m);
        a.mo3646a("readRecordIsPerformed", this.f5992n);
        a.mo3644a("completeProcessingTime");
        a.mo3644a("transactionCardProcessingTime");
        return a.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3497a(bxp bxp) {
        this.f5988j.mo3585a(bxp);
    }
}
