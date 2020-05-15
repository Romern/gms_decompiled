package p000;

/* renamed from: bqhe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqhe extends bqgf {

    /* renamed from: a */
    final /* synthetic */ bqhg f140658a;

    /* renamed from: b */
    private final bqeg f140659b;

    public bqhe(bqhg bqhg, bqeg bqeg) {
        this.f140658a = bqhg;
        bmxy.m108581a(bqeg);
        this.f140659b = bqeg;
    }

    /* renamed from: a */
    public final String mo69192a() {
        return this.f140659b.toString();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo69194b() {
        bqgg a = this.f140659b.mo7073a();
        bmxy.m108587a(a, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f140659b);
        return a;
    }

    /* renamed from: c */
    public final boolean mo69196c() {
        return this.f140658a.isDone();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69195a(Object obj, Throwable th) {
        bqgg bqgg = (bqgg) obj;
        if (th == null) {
            this.f140658a.mo69137b(bqgg);
        } else {
            this.f140658a.mo69136a(th);
        }
    }
}
