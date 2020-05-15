package p000;

/* renamed from: buxd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buxd extends bvdu {

    /* renamed from: a */
    final /* synthetic */ buxv f155230a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public buxd(buxv buxv, String str, bvdu... bvduArr) {
        super(str, bvduArr);
        this.f155230a = buxv;
    }

    /* renamed from: a */
    public final bvdu mo73236a() {
        if (!this.f155230a.f155264h.mo73237b() || this.f155230a.f155263g.mo73237b()) {
            return null;
        }
        return this.f155230a.f155263g;
    }

    /* renamed from: b */
    public final boolean mo73237b() {
        buwq buwq = this.f155230a.f155258b.f155186d;
        return buwq == null || !buwq.f155179c;
    }

    /* renamed from: c */
    public final boolean mo73238c() {
        buwq buwq = this.f155230a.f155258b.f155186d;
        if (buwq == null) {
            return false;
        }
        buwq.mo73194b();
        return true;
    }

    /* renamed from: d */
    public final long mo73239d() {
        byyl byyl = this.f155230a.f155257a.f155567b.f168921d;
        if (byyl == null) {
            byyl = byyl.f168949v;
        }
        return byyl.f168960j;
    }
}
