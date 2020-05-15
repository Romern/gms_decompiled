package p000;

/* renamed from: cbao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cbao extends cbaf {

    /* renamed from: b */
    private final cbaf f176480b;

    public cbao(cbaf cbaf) {
        this.f176480b = cbaf;
    }

    /* renamed from: a */
    public final void mo75213a() {
        try {
            this.f176480b.mo75213a();
        } catch (RuntimeException e) {
            cbar.m127679a(e, this.f176480b, "requested");
        }
    }

    /* renamed from: b */
    public final void mo75216b() {
        try {
            this.f176480b.mo75216b();
        } catch (RuntimeException e) {
            cbar.m127679a(e, this.f176480b, "ready");
        }
    }

    /* renamed from: c */
    public final void mo75217c() {
        try {
            this.f176480b.mo75217c();
        } catch (RuntimeException e) {
            cbar.m127679a(e, this.f176480b, "methodStarting");
        }
    }

    /* renamed from: d */
    public final void mo75218d() {
        try {
            this.f176480b.mo75218d();
        } catch (RuntimeException e) {
            cbar.m127679a(e, this.f176480b, "methodFinished");
        }
    }

    /* renamed from: a */
    public final void mo75214a(Object obj) {
        try {
            this.f176480b.mo75214a(obj);
        } catch (RuntimeException e) {
            cbar.m127680a(e, this.f176480b, "succeeded", obj);
        }
    }

    /* renamed from: a */
    public final void mo75215a(Throwable th) {
        try {
            this.f176480b.mo75215a(th);
        } catch (RuntimeException e) {
            cbar.m127680a(e, this.f176480b, "failed", th);
        }
    }
}
