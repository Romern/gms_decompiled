package p000;

/* renamed from: buxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buxr extends bvdu {

    /* renamed from: a */
    final /* synthetic */ buxv f155244a;

    /* renamed from: b */
    private final ahfv f155245b;

    /* renamed from: c */
    private final boolean f155246c;

    /* renamed from: d */
    private volatile boolean f155247d;

    /* renamed from: f */
    private final buyv f155248f;

    /* JADX WARNING: Illegal instructions before constructor call */
    public buxr(buxv buxv, ahfv ahfv, boolean z, buyv buyv) {
        super(r0.length() == 0 ? new String("BleAdvertiseTokenState token=") : "BleAdvertiseTokenState token=".concat(r0), buxv.f155264h, buxv.f155263g);
        this.f155244a = buxv;
        String valueOf = String.valueOf(ahfv.mo36407a());
        this.f155247d = false;
        this.f155245b = ahfv;
        this.f155246c = z;
        this.f155248f = buyv;
    }

    /* renamed from: b */
    public final boolean mo73237b() {
        return this.f155247d;
    }

    /* renamed from: c */
    public final boolean mo73238c() {
        if (!this.f155244a.f155264h.mo73237b()) {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
            bnsl.mo68432a("buxr", "c", 521, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("BluetoothStates: Cannot set name if user settings not saved");
            return false;
        }
        if (this.f155248f != buyv.BLE_ADVERTISE_MANUFACTURER_DATA) {
            this.f155247d = this.f155244a.f155258b.mo73201a(buxb.f155203a, this.f155245b.f67128a, this.f155246c, this.f155248f);
        } else {
            this.f155247d = this.f155244a.f155258b.mo73201a(null, this.f155245b.f67128a, this.f155246c, this.f155248f);
        }
        return this.f155247d;
    }

    /* renamed from: d */
    public final long mo73239d() {
        byyl byyl = this.f155244a.f155257a.f155567b.f168921d;
        if (byyl == null) {
            byyl = byyl.f168949v;
        }
        return byyl.f168960j;
    }
}
