package p000;

/* renamed from: buxp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buxp extends bvdu {

    /* renamed from: a */
    final /* synthetic */ buxv f155242a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public buxp(buxv buxv, String str, bvdu... bvduArr) {
        super(str, bvduArr);
        this.f155242a = buxv;
    }

    /* renamed from: b */
    public final boolean mo73237b() {
        return !this.f155242a.f155258b.mo73208g();
    }

    /* renamed from: c */
    public final boolean mo73238c() {
        buwt buwt = this.f155242a.f155258b;
        srn srn = bvcm.f155598a;
        return buwt.f155185c.cancelDiscovery() && this.f155242a.f155265i.mo73238c();
    }

    /* renamed from: d */
    public final long mo73239d() {
        byyl byyl = this.f155242a.f155257a.f155567b.f168921d;
        if (byyl == null) {
            byyl = byyl.f168949v;
        }
        return byyl.f168960j;
    }
}
