package p000;

/* renamed from: buxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buxg extends bvdu {

    /* renamed from: a */
    final /* synthetic */ buxv f155233a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public buxg(buxv buxv, String str, bvdu... bvduArr) {
        super(str, bvduArr);
        this.f155233a = buxv;
    }

    /* renamed from: b */
    public final boolean mo73237b() {
        return !this.f155233a.f155259c.contains("deviceName") && !this.f155233a.f155259c.contains("discoverableTimeout") && !this.f155233a.f155259c.contains("scanMode");
    }

    /* renamed from: c */
    public final boolean mo73238c() {
        buxv buxv = this.f155233a;
        return buxv.mo73240a(buxv.f155259c.edit().remove("deviceName").remove("discoverableTimeout").remove("scanMode"), "reverted to user settings");
    }

    /* renamed from: d */
    public final long mo73239d() {
        byyl byyl = this.f155233a.f155257a.f155567b.f168921d;
        if (byyl == null) {
            byyl = byyl.f168949v;
        }
        return byyl.f168960j;
    }
}
