package p000;

/* renamed from: buxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buxm extends bvdu {

    /* renamed from: a */
    final /* synthetic */ buxv f155239a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public buxm(buxv buxv, String str, bvdu... bvduArr) {
        super(str, bvduArr);
        this.f155239a = buxv;
    }

    /* renamed from: b */
    public final boolean mo73237b() {
        buwo buwo = this.f155239a.f155260d;
        if (buwo == null) {
            return true;
        }
        Integer num = buwo.f155165l;
        return num != null && num.intValue() == 3;
    }

    /* renamed from: c */
    public final boolean mo73238c() {
        buwo buwo = this.f155239a.f155260d;
        if (buwo == null) {
            return true;
        }
        buwo.f155165l = 3;
        buwo.mo73185d();
        return true;
    }

    /* renamed from: d */
    public final long mo73239d() {
        byyl byyl = this.f155239a.f155257a.f155567b.f168921d;
        if (byyl == null) {
            byyl = byyl.f168949v;
        }
        return byyl.f168960j;
    }
}
