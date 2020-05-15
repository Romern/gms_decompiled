package p000;

import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: oio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class oio implements oit {

    /* renamed from: a */
    private final AtomicReference f37716a = new AtomicReference();

    /* renamed from: b */
    private final oin f37717b;

    public oio(oin oin) {
        this.f37717b = oin;
    }

    /* renamed from: e */
    private final oil m28848e() {
        oil oil = (oil) this.f37716a.get();
        if (oil != null) {
            return oil;
        }
        throw new IllegalStateException("MediaSourceFlowController has not been initialized.");
    }

    /* renamed from: a */
    public final int mo22190a() {
        return m28848e().mo22190a();
    }

    /* renamed from: b */
    public final void mo22193b() {
        m28848e().mo22193b();
    }

    /* renamed from: c */
    public final void mo22194c() {
        oil oil = (oil) this.f37716a.get();
        if (oil != null) {
            oil.mo22194c();
        }
    }

    /* renamed from: d */
    public final boolean mo22195d() {
        return m28848e().mo22195d();
    }

    /* renamed from: a */
    public final void mo22191a(int i) {
        m28848e().mo22191a(i);
    }

    /* renamed from: b */
    public final void mo22196b(int i) {
        oil a = this.f37717b.mo22197a(i);
        if (a == null) {
            throw new IllegalStateException("mediaSourceFlowControllerFactory must not return a null MediaSourceFlowController.");
        } else if (!this.f37716a.compareAndSet(null, a)) {
            throw new IllegalStateException("initialize should not be called more than once.");
        }
    }

    /* renamed from: a */
    public final void mo22192a(PrintWriter printWriter) {
        oil oil = (oil) this.f37716a.get();
        if (oil != null) {
            oil.mo22192a(printWriter);
        }
    }
}
