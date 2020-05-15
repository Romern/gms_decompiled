package p000;

/* renamed from: buxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buxu extends bvdu {

    /* renamed from: a */
    final String f155255a;

    /* renamed from: b */
    final /* synthetic */ buxv f155256b;

    /* JADX WARNING: Illegal instructions before constructor call */
    public buxu(buxv buxv, String str) {
        super(r0.length() == 0 ? new String("Name=") : "Name=".concat(r0), buxv.f155264h, buxv.f155263g);
        this.f155256b = buxv;
        String valueOf = String.valueOf(str);
        this.f155255a = str;
    }

    /* renamed from: b */
    public final boolean mo73237b() {
        return this.f155255a.equals(this.f155256b.f155258b.mo73211j());
    }

    /* renamed from: c */
    public final boolean mo73238c() {
        if (this.f155256b.f155264h.mo73237b()) {
            return this.f155256b.f155258b.mo73200a(this.f155255a);
        }
        bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
        bnsl.mo68432a("buxu", "c", 381, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("BluetoothStates: Cannot set name if user settings not saved");
        return false;
    }

    /* renamed from: d */
    public final long mo73239d() {
        byyl byyl = this.f155256b.f155257a.f155567b.f168921d;
        if (byyl == null) {
            byyl = byyl.f168949v;
        }
        return byyl.f168960j;
    }
}
