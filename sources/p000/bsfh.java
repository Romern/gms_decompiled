package p000;

/* renamed from: bsfh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsfh {

    /* renamed from: a */
    public final bser f144461a;

    /* renamed from: b */
    public boolean f144462b = false;

    /* renamed from: c */
    public boolean f144463c = false;

    /* renamed from: d */
    public boolean f144464d = false;

    /* renamed from: e */
    double f144465e = Double.NaN;

    /* renamed from: f */
    public double f144466f = Double.NaN;

    /* renamed from: g */
    public double f144467g = Double.NaN;

    /* renamed from: h */
    public bsfs f144468h;

    /* renamed from: i */
    public bsfs f144469i;

    /* renamed from: j */
    public bsfs f144470j;

    /* renamed from: k */
    public bsfs f144471k;

    public bsfh(bser bser) {
        this.f144461a = bser;
    }

    /* renamed from: a */
    public final void mo70489a(double d) {
        if (Double.isNaN(this.f144466f) || this.f144466f < d) {
            this.f144466f = d;
            if (Double.isNaN(this.f144465e)) {
                this.f144465e = d;
            }
        }
    }

    /* renamed from: b */
    public final void mo70495b(bsfs bsfs) {
        this.f144469i = bsfs;
        mo70497b();
        for (bsgn bsgn : bsgm.f144529a) {
        }
    }

    /* renamed from: c */
    public final void mo70498c(bsfs bsfs) {
        mo70495b(bsfs);
        mo70490a(bsfs);
    }

    /* renamed from: d */
    public final void mo70501d(bsfs bsfs) {
        this.f144470j = bsfs;
        mo70492a();
        for (bsgn bsgn : bsgm.f144529a) {
        }
    }

    /* renamed from: d */
    public final boolean mo70502d() {
        return this.f144462b && this.f144463c;
    }

    /* renamed from: e */
    public final bsfs mo70503e() {
        if (mo70497b()) {
            return this.f144469i;
        }
        return null;
    }

    /* renamed from: f */
    public final bsfs mo70505f() {
        if (mo70492a()) {
            return this.f144470j;
        }
        return null;
    }

    /* renamed from: g */
    public final void mo70506g() {
        mo70491a(false);
        mo70496b(false);
        this.f144465e = Double.NaN;
        this.f144466f = Double.NaN;
        this.f144467g = Double.NaN;
        this.f144468h = null;
        this.f144469i = null;
        this.f144470j = null;
        this.f144471k = null;
        this.f144464d = false;
    }

    /* renamed from: c */
    public final void mo70499c(boolean z) {
        this.f144464d = z;
        for (bsgn bsgn : bsgm.f144529a) {
        }
    }

    /* renamed from: e */
    public final void mo70504e(bsfs bsfs) {
        bsfs bsfs2;
        if (!(bsfs == null || (bsfs2 = this.f144468h) == null || bsfs.f144498d - bsfs2.f144498d <= this.f144461a.mo70350g())) {
            bsgm.m115748b();
            mo70506g();
        }
        this.f144468h = bsfs;
        mo70490a(bsfs);
    }

    /* renamed from: a */
    public final void mo70490a(bsfs bsfs) {
        if (bsfs != null) {
            mo70489a(bsfs.f144498d);
        }
    }

    /* renamed from: a */
    public final void mo70491a(boolean z) {
        this.f144462b = z;
        for (bsgn bsgn : bsgm.f144529a) {
        }
    }

    /* renamed from: b */
    public final void mo70496b(boolean z) {
        this.f144463c = z;
        for (bsgn bsgn : bsgm.f144529a) {
        }
    }

    /* renamed from: c */
    public final boolean mo70500c() {
        bsfs bsfs = this.f144471k;
        return bsfs != null && bsfs.f144498d > this.f144466f - this.f144461a.mo70349f();
    }

    /* renamed from: a */
    public final boolean mo70492a() {
        bsfs bsfs = this.f144470j;
        return bsfs != null && bsfs.f144498d > this.f144466f - this.f144461a.mo70347e();
    }

    /* renamed from: b */
    public final boolean mo70497b() {
        bsfs bsfs = this.f144469i;
        return bsfs != null && bsfs.f144498d > this.f144466f - this.f144461a.mo70346d();
    }

    /* renamed from: a */
    public final boolean mo70493a(double d, bsfs bsfs) {
        double d2;
        if (bsfs == null || Double.isNaN(d)) {
            return false;
        }
        int i = bsfs.f144497c;
        if (i == 1) {
            d2 = this.f144461a.mo70343a();
        } else if (i != 2) {
            d2 = 1.0d;
        } else {
            d2 = this.f144461a.mo70344b();
        }
        double a = bsfs.mo70516a(2) * d2;
        bsfs.mo70516a(2);
        for (bsgn bsgn : bsgm.f144529a) {
        }
        return d > a;
    }

    /* renamed from: a */
    public final boolean mo70494a(double[] dArr, bsfs bsfs) {
        if (bsfs != null) {
            return mo70493a(bsgo.m115750a(dArr, bsfs), bsfs);
        }
        return false;
    }
}
