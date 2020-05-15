package p000;

/* renamed from: bua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bua extends bxm {

    /* renamed from: a */
    public buk f5593a;

    static {
        bua.class.getSimpleName();
    }

    private bua() {
        super(null, null, null, null, null);
    }

    /* renamed from: a */
    public final byte[] mo3442a() {
        throw null;
    }

    /* renamed from: c */
    public final buz mo3498c() {
        int i = cbd.f6383a;
        buz a = this.f5593a.mo3518a();
        return a == null ? new buz(buz.f5762b) : a;
    }

    /* renamed from: d */
    public final bum mo3499d() {
        bvd bvd = (bvd) ((bty) ((btz) this.f5984f).mo3578d()).mo3576c(bvd.f5782a);
        buj b = ((buq) this.f5988j).mo3523b();
        bye f = ((bty) ((btz) this.f5984f).mo3578d()).mo3494f();
        bya bya = new bya();
        buh b2 = bvd.mo3535b();
        bui c = ((buq) this.f5988j).mo3524c();
        bwl p = this.f5994p.mo3594p();
        bwm r = this.f5994p.mo3596r();
        bwk q = this.f5994p.mo3595q();
        bul a = bvd.mo3534a();
        ((buq) this.f5988j).mo3525g();
        return new bum(f, bya, b, b2, c, p, r, q, a);
    }

    /* renamed from: e */
    public final buh mo3500e() {
        return ((bvd) ((bty) ((btz) this.f5984f).mo3578d()).mo3576c(bvd.f5782a)).mo3535b();
    }

    public bua(bxf bxf, btz btz, bqk bqk, bxj bxj) {
        super(bxf, btz, bqk, bxj, new buq());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo3441a(bqk bqk) {
        if (bqk instanceof bqo) {
            bqo bqo = (bqo) bqk;
            int i = cbd.f6383a;
        }
    }

    /* renamed from: k */
    public final void mo3501k() {
        int i = cbd.f6383a;
        btz btz = (btz) this.f5984f;
        byte[] bArr = btz.f5953g;
        if (bArr == null || bArr.length == 0) {
            buk buk = new buk();
            if (!cbm.m3893a(((btz) this.f5984f).f5950d.mo3563i()).equals("0001")) {
                bvd bvd = (bvd) ((bty) ((btz) this.f5984f).mo3578d()).mo3576c(bvd.f5782a);
                buk.mo3585a(new buz(bvd.mo3540g().mo3563i()));
                buk.mo3585a(new buy(bvd.mo3542i().mo3563i()));
                new Object[1][0] = this.f5593a;
            } else {
                new Object[1][0] = this.f5593a;
            }
            ((btz) this.f5984f).f5952f = buk.mo3520c().mo3358e();
            ((btz) this.f5984f).f5953g = buk.mo3520c().mo3358e();
            this.f5593a = ((btz) this.f5984f).mo3496c();
        } else {
            buk c = btz.mo3496c();
            this.f5593a = c;
            new Object[1][0] = c;
        }
        bur bur = new bur(((bvd) ((bty) ((btz) this.f5984f).mo3578d()).mo3576c(bvd.f5782a)).mo3541h().mo3563i());
        if (!bur.mo3528a()) {
            ((buq) this.f5988j).mo3585a(bur);
            buq buq = (buq) this.f5988j;
            buq.mo3585a(new bui(bui.f5638a));
            buq.mo3585a(new buj(buj.f5648a));
            bur bur2 = new bur(bur.f5687a);
            bur2.f5930l[1] = 0;
            buq.mo3585a(bur2);
            bur g = ((buq) this.f5988j).mo3525g();
            bui c2 = ((buq) this.f5988j).mo3524c();
            buj b = ((buq) this.f5988j).mo3523b();
            bqk bqk = this.f5982d;
            if ((bqk instanceof bqi) && ((bqi) bqk).mo3418a()) {
                if (!((bvd) ((bty) ((btz) this.f5984f).mo3578d()).mo3576c(bvd.f5782a)).mo3539f()) {
                    buz c3 = mo3498c();
                    c3.mo3553a(buz.f5762b);
                    this.f5593a.mo3585a(c3);
                    ((btz) this.f5984f).f5949c.mo3406a(this.f5593a.mo3520c());
                }
                buy b2 = this.f5593a.mo3519b();
                b2.mo3531a();
                this.f5593a.mo3585a(b2);
                g.mo3527a(true);
                c2.mo3506a();
            }
            ((buq) this.f5988j).mo3585a(g);
            ((buq) this.f5988j).mo3585a(c2);
            ((buq) this.f5988j).mo3585a(b);
            return;
        }
        throw new bon(bop.f5263c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo3497a(bxp bxp) {
        ((buq) this.f5988j).mo3585a(bxp);
    }
}
