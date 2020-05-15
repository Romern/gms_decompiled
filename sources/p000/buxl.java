package p000;

/* renamed from: buxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buxl extends bvdu {

    /* renamed from: a */
    final /* synthetic */ buxv f155238a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public buxl(buxv buxv, String str, bvdu... bvduArr) {
        super(str, bvduArr);
        this.f155238a = buxv;
    }

    /* renamed from: b */
    public final boolean mo73237b() {
        return (!this.f155238a.f155259c.contains("bluetoothEnabled") || this.f155238a.f155259c.getInt("discoverableTimeout", -1) == -1 || this.f155238a.f155259c.getInt("scanMode", -1) == -1 || this.f155238a.f155259c.getString("deviceName", null) == null || this.f155238a.f155259c.getLong("updated", 0) == 0) ? false : true;
    }

    /* renamed from: c */
    public final boolean mo73238c() {
        if (!this.f155238a.f155261e.mo73237b()) {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
            bnsl.mo68432a("buxl", "c", 168, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("BluetoothStates: Cannot save user prefs if enabled state not saved.");
            return false;
        } else if (!this.f155238a.f155263g.mo73237b()) {
            bnsl bnsl2 = (bnsl) bvcm.f155598a.mo68387b();
            bnsl2.mo68432a("buxl", "c", 173, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("BluetoothStates: Cannot save user prefs if bluetooth not enabled.");
            return false;
        } else {
            int l = this.f155238a.f155258b.mo73213l();
            int d = this.f155238a.f155258b.mo73205d();
            if (d == 23 && l != 0) {
                d = 21;
            }
            buxv buxv = this.f155238a;
            return buxv.mo73240a(buxv.f155259c.edit().putInt("discoverableTimeout", l).putInt("scanMode", d).putString("deviceName", this.f155238a.f155258b.mo73211j()), "save name and discoverable state");
        }
    }

    /* renamed from: d */
    public final long mo73239d() {
        byyl byyl = this.f155238a.f155257a.f155567b.f168921d;
        if (byyl == null) {
            byyl = byyl.f168949v;
        }
        return byyl.f168960j;
    }
}
