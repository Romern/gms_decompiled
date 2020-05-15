package p000;

/* renamed from: svg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class svg implements suf {

    /* renamed from: a */
    public int f45216a;

    /* renamed from: b */
    final /* synthetic */ svi f45217b;

    /* renamed from: c */
    public final svf f45218c;

    public svg(svi svi, svf svf, int i) {
        this.f45217b = svi;
        this.f45218c = svf;
        this.f45216a = i;
        svf.f45215b = this;
    }

    /* renamed from: a */
    public final int mo26155a() {
        int size = this.f45218c.mo26154g().size();
        if (size != 0) {
            return size + 1;
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo26091b(int i) {
        this.f45217b.mo26158c();
        this.f45217b.mo26156a((sue) this.f45218c.mo26154g().get(i));
        if (this.f45218c.mo26154g().size() == 1) {
            this.f45217b.mo177c(this.f45216a, 2);
            return;
        }
        this.f45217b.mo159N(this.f45216a + 1 + i);
        this.f45217b.mo158M(this.f45216a + i);
    }

    /* renamed from: c */
    public final void mo26092c(int i) {
        this.f45217b.mo26158c();
        if (mo26155a() == 0) {
            this.f45217b.mo178d(this.f45216a, 2);
            return;
        }
        this.f45217b.mo160O(this.f45216a + i + 1);
        this.f45217b.mo158M(this.f45216a + i);
    }

    /* renamed from: d */
    public final void mo26093d(int i) {
        this.f45217b.mo180h(this.f45216a + i, 2);
    }

    /* renamed from: a */
    public final void mo26090a(int i, int i2) {
        svi svi = this.f45217b;
        int i3 = this.f45216a;
        svi.mo173b(i3 + i + 1, i3 + i2 + 1);
        if (i < i2) {
            this.f45217b.mo158M(this.f45216a + i);
            this.f45217b.mo158M(this.f45216a + i2);
            return;
        }
        this.f45217b.mo158M(this.f45216a + i + 1);
        this.f45217b.mo158M(this.f45216a + i2);
    }
}
