package p000;

import java.util.concurrent.Executor;

/* renamed from: cfx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cfx {

    /* renamed from: a */
    final cpx f6739a;

    /* renamed from: b */
    final Executor f6740b;

    public cfx(cpx cpx, Executor executor) {
        this.f6739a = cpx;
        this.f6740b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cfx) {
            return this.f6739a.equals(((cfx) obj).f6739a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6739a.hashCode();
    }
}
