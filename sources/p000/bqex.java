package p000;

import java.util.concurrent.Executor;

/* renamed from: bqex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqex extends bqez {

    /* renamed from: a */
    final /* synthetic */ bqfa f140569a;

    /* renamed from: d */
    private final bqeg f140570d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bqex(bqfa bqfa, bqeg bqeg, Executor executor) {
        super(bqfa, executor);
        this.f140569a = bqfa;
        bmxy.m108581a(bqeg);
        this.f140570d = bqeg;
    }

    /* renamed from: a */
    public final String mo69192a() {
        return this.f140570d.toString();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo69194b() {
        this.f140574b = false;
        bqgg a = this.f140570d.mo7073a();
        bmxy.m108587a(a, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f140570d);
        return a;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69193a(Object obj) {
        this.f140569a.mo69137b((bqgg) obj);
    }
}
