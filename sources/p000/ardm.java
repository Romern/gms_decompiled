package p000;

/* renamed from: ardm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ardm {

    /* renamed from: a */
    public boolean f87434a = true;

    /* renamed from: b */
    public final arqm f87435b;

    /* renamed from: c */
    final /* synthetic */ ardn f87436c;

    /* renamed from: d */
    private boolean f87437d = false;

    public ardm(ardn ardn, long j) {
        this.f87436c = ardn;
        this.f87435b = new arqm(ardn.f87073b, null, j, new ardl(this, j));
    }

    /* renamed from: a */
    public final void mo48431a() {
        this.f87435b.mo48752c();
    }

    /* renamed from: b */
    public final void mo48432b() {
        this.f87437d = true;
        mo48434d();
    }

    /* renamed from: c */
    public final void mo48433c() {
        this.f87437d = false;
        mo48434d();
    }

    /* renamed from: d */
    public final void mo48434d() {
        if (this.f87434a && !this.f87437d) {
            this.f87435b.mo48750a();
        } else {
            this.f87435b.mo48751b();
        }
    }
}
