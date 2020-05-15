package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: bqey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqey extends bqez {

    /* renamed from: a */
    final /* synthetic */ bqfa f140571a;

    /* renamed from: d */
    private final Callable f140572d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bqey(bqfa bqfa, Callable callable, Executor executor) {
        super(bqfa, executor);
        this.f140571a = bqfa;
        bmxy.m108581a(callable);
        this.f140572d = callable;
    }

    /* renamed from: a */
    public final String mo69192a() {
        return this.f140572d.toString();
    }

    /* renamed from: b */
    public final Object mo69194b() {
        this.f140574b = false;
        return this.f140572d.call();
    }

    /* renamed from: a */
    public final void mo69193a(Object obj) {
        this.f140571a.mo69138b(obj);
    }
}
