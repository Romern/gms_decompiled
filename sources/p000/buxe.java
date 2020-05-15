package p000;

import android.text.TextUtils;

/* renamed from: buxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buxe extends bvdu {

    /* renamed from: a */
    final /* synthetic */ buxv f155231a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public buxe(buxv buxv, String str, bvdu... bvduArr) {
        super(str, bvduArr);
        this.f155231a = buxv;
    }

    /* renamed from: e */
    private final String m120680e() {
        String string = this.f155231a.f155259c.getString("deviceName", null);
        if (string == null) {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
            bnsl.mo68432a("buxe", "e", 617, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("BluetoothStates: User bluetooth state not stored.");
        }
        return string;
    }

    /* renamed from: a */
    public final bvdu mo73236a() {
        if (!this.f155231a.f155264h.mo73237b() || this.f155231a.f155263g.mo73237b()) {
            return null;
        }
        return this.f155231a.f155263g;
    }

    /* renamed from: b */
    public final boolean mo73237b() {
        if (this.f155231a.f155264h.mo73237b()) {
            return TextUtils.equals(m120680e(), this.f155231a.f155258b.mo73211j());
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo73238c() {
        if (this.f155231a.f155264h.mo73237b()) {
            return this.f155231a.f155258b.mo73200a(m120680e());
        }
        return true;
    }

    /* renamed from: d */
    public final long mo73239d() {
        byyl byyl = this.f155231a.f155257a.f155567b.f168921d;
        if (byyl == null) {
            byyl = byyl.f168949v;
        }
        return byyl.f168960j;
    }
}
