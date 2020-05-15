package p000;

/* renamed from: bsbb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bsbb {

    /* renamed from: a */
    public final bsbc f143921a;

    /* renamed from: b */
    protected final Runnable f143922b;

    /* renamed from: c */
    public int f143923c;

    public bsbb(bsbc bsbc, Runnable runnable) {
        if (bsbc == null) {
            bsbe.m115041a("Runner cannot be null", "object is null");
        }
        this.f143921a = bsbc;
        this.f143922b = runnable;
    }

    /* renamed from: a */
    public final void mo70150a() {
        synchronized (this.f143921a.f143926c) {
            mo70153d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo70151b() {
        Runnable runnable = this.f143922b;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: c */
    public void mo70152c() {
        try {
            mo70151b();
        } catch (Throwable th) {
            bqye.m113758a(th);
        }
    }

    /* renamed from: d */
    public void mo70153d() {
        this.f143921a.mo70156b(this);
    }

    /* renamed from: e */
    public void mo70154e() {
        this.f143921a.mo70157c(this);
    }
}
