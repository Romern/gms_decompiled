package p000;

import java.util.concurrent.Callable;

/* renamed from: bdhw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdhw implements Callable {

    /* renamed from: a */
    final /* synthetic */ Callable f105677a;

    /* renamed from: b */
    final /* synthetic */ bdhx f105678b;

    public bdhw(bdhx bdhx, Callable callable) {
        this.f105678b = bdhx;
        this.f105677a = callable;
    }

    public final Object call() {
        try {
            return this.f105677a.call();
        } catch (Throwable th) {
            this.f105678b.f105679a.mo6481a(th);
            throw th;
        }
    }
}
