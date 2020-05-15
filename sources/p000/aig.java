package p000;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: aig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aig implements bqgg {

    /* renamed from: a */
    final WeakReference f590a;

    /* renamed from: b */
    public final aib f591b = new aif(this);

    public aig(aic aic) {
        this.f590a = new WeakReference(aic);
    }

    /* renamed from: a */
    public final void mo741a(Runnable runnable, Executor executor) {
        this.f591b.mo741a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        aic aic = (aic) this.f590a.get();
        boolean cancel = this.f591b.cancel(z);
        if (!cancel || aic == null) {
            return cancel;
        }
        aic.f585a = null;
        aic.f586b = null;
        aic.f587c.mo742a((Object) null);
        return true;
    }

    public final Object get() {
        return this.f591b.get();
    }

    public final boolean isCancelled() {
        return this.f591b.isCancelled();
    }

    public final boolean isDone() {
        return this.f591b.isDone();
    }

    public final String toString() {
        return this.f591b.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo754a(Throwable th) {
        aib aib = this.f591b;
        aib.m793b(th);
        if (!aib.f582b.mo736a(aib, (Object) null, new ahv(th))) {
            return false;
        }
        aib.m791a(aib);
        return true;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.f591b.get(j, timeUnit);
    }
}
