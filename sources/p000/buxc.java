package p000;

/* renamed from: buxc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buxc extends bvdu {

    /* renamed from: a */
    final /* synthetic */ buxv f155229a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public buxc(buxv buxv, String str, bvdu... bvduArr) {
        super(str, bvduArr);
        this.f155229a = buxv;
    }

    /* renamed from: e */
    private final int m120670e() {
        int i = this.f155229a.f155259c.getInt("discoverableTimeout", -1);
        if (i != -1) {
            return i;
        }
        bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
        bnsl.mo68432a("buxc", "e", 482, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("BluetoothStates: User discoverable timeout not stored.");
        return -1;
    }

    /* renamed from: f */
    private final int m120671f() {
        int i = this.f155229a.f155259c.getInt("scanMode", -1);
        if (i != -1) {
            return i;
        }
        bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
        bnsl.mo68432a("buxc", "f", 490, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("BluetoothStates: Scan mode not stored.");
        return -1;
    }

    /* renamed from: a */
    public final bvdu mo73236a() {
        if (this.f155229a.f155264h.mo73237b() && !this.f155229a.f155263g.mo73237b()) {
            return this.f155229a.f155263g;
        }
        if (!this.f155229a.f155264h.mo73237b() || this.f155229a.f155270n.mo73237b()) {
            return null;
        }
        return this.f155229a.f155270n;
    }

    /* renamed from: b */
    public final boolean mo73237b() {
        if (!this.f155229a.f155264h.mo73237b()) {
            return true;
        }
        if (this.f155229a.f155258b.mo73212k() && m120670e() == this.f155229a.f155258b.mo73213l() && m120671f() == this.f155229a.f155258b.mo73205d()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo73238c() {
        if (this.f155229a.f155264h.mo73237b()) {
            return this.f155229a.f155258b.mo73198a(m120671f(), m120670e());
        }
        return true;
    }

    /* renamed from: d */
    public final long mo73239d() {
        byyl byyl = this.f155229a.f155257a.f155567b.f168921d;
        if (byyl == null) {
            byyl = byyl.f168949v;
        }
        return byyl.f168960j;
    }
}
