package p000;

/* renamed from: aic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aic {

    /* renamed from: a */
    Object f585a;

    /* renamed from: b */
    aig f586b;

    /* renamed from: c */
    public aii f587c = new aii();

    /* renamed from: d */
    private boolean f588d;

    /* renamed from: a */
    private final void m800a() {
        this.f585a = null;
        this.f586b = null;
        this.f587c = null;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        aii aii;
        aig aig = this.f586b;
        if (aig != null && !aig.isDone()) {
            aig.mo754a(new aid("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f585a));
        }
        if (!this.f588d && (aii = this.f587c) != null) {
            aii.mo742a((Object) null);
        }
    }

    /* renamed from: a */
    public final void mo749a(Object obj) {
        this.f588d = true;
        aig aig = this.f586b;
        if (aig != null && aig.f591b.mo742a(obj)) {
            m800a();
        }
    }

    /* renamed from: a */
    public final void mo750a(Throwable th) {
        this.f588d = true;
        aig aig = this.f586b;
        if (aig != null && aig.mo754a(th)) {
            m800a();
        }
    }
}
