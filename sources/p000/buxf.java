package p000;

/* renamed from: buxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buxf extends bvdu {

    /* renamed from: a */
    final /* synthetic */ buxv f155232a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public buxf(buxv buxv, String str, bvdu... bvduArr) {
        super(str, bvduArr);
        this.f155232a = buxv;
    }

    /* renamed from: e */
    private final boolean m120685e() {
        return this.f155232a.f155259c.getBoolean("bluetoothEnabled", true);
    }

    /* renamed from: b */
    public final boolean mo73237b() {
        if (!this.f155232a.f155261e.mo73237b() || m120685e() || !this.f155232a.f155258b.mo73212k()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo73238c() {
        if (!this.f155232a.f155259c.contains("bluetoothEnabled")) {
            srn srn = bvcm.f155598a;
            return true;
        }
        srn srn2 = bvcm.f155598a;
        m120685e();
        this.f155232a.f155258b.mo73212k();
        if (!m120685e()) {
            return this.f155232a.f155258b.mo73209h();
        }
        return true;
    }

    /* renamed from: d */
    public final long mo73239d() {
        if (!m120685e()) {
            byyb byyb = this.f155232a.f155257a.f155567b.f168924g;
            if (byyb == null) {
                byyb = byyb.f168875j;
            }
            return byyb.f168879c;
        }
        byyb byyb2 = this.f155232a.f155257a.f155567b.f168924g;
        if (byyb2 == null) {
            byyb2 = byyb.f168875j;
        }
        return byyb2.f168880d;
    }
}
