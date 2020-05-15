package p000;

/* renamed from: buxh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buxh extends bvdu {

    /* renamed from: a */
    final /* synthetic */ buxv f155234a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public buxh(buxv buxv, String str, bvdu... bvduArr) {
        super(str, bvduArr);
        this.f155234a = buxv;
    }

    /* renamed from: b */
    public final boolean mo73237b() {
        return this.f155234a.f155269m.mo73237b() && this.f155234a.f155271o.mo73237b() && this.f155234a.f155272p.mo73237b() && this.f155234a.f155259c.getAll().isEmpty();
    }

    /* renamed from: c */
    public final boolean mo73238c() {
        return this.f155234a.f155259c.edit().clear().commit();
    }

    /* renamed from: d */
    public final long mo73239d() {
        byyl byyl = this.f155234a.f155257a.f155567b.f168921d;
        if (byyl == null) {
            byyl = byyl.f168949v;
        }
        return byyl.f168960j;
    }
}
