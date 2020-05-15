package p000;

import java.util.concurrent.Callable;

/* renamed from: bqhf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqhf extends bqgf {

    /* renamed from: a */
    final /* synthetic */ bqhg f140660a;

    /* renamed from: b */
    private final Callable f140661b;

    public bqhf(bqhg bqhg, Callable callable) {
        this.f140660a = bqhg;
        bmxy.m108581a(callable);
        this.f140661b = callable;
    }

    /* renamed from: a */
    public final String mo69192a() {
        return this.f140661b.toString();
    }

    /* renamed from: b */
    public final Object mo69194b() {
        return this.f140661b.call();
    }

    /* renamed from: c */
    public final boolean mo69196c() {
        return this.f140660a.isDone();
    }

    /* renamed from: a */
    public final void mo69195a(Object obj, Throwable th) {
        if (th != null) {
            this.f140660a.mo69136a(th);
        } else {
            this.f140660a.mo69138b(obj);
        }
    }
}
