package p000;

import com.google.android.gms.beacon.BleSettings;

/* renamed from: buxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buxt extends bvdu {

    /* renamed from: a */
    public final nej f155250a;

    /* renamed from: b */
    final bvdu f155251b = new buxs(this, "BleScanStopped", new bvdu[0]);

    /* renamed from: c */
    public boolean f155252c;

    /* renamed from: d */
    final /* synthetic */ buxv f155253d;

    /* renamed from: f */
    private final BleSettings f155254f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public buxt(buxv buxv, nej nej, BleSettings bleSettings) {
        super("BleScanning", buxv.f155261e, buxv.f155263g, buxv.f155267k);
        this.f155253d = buxv;
        this.f155250a = nej;
        this.f155254f = bleSettings;
        this.f155252c = false;
    }

    /* renamed from: b */
    public final boolean mo73237b() {
        return this.f155252c;
    }

    /* renamed from: c */
    public final boolean mo73238c() {
        boolean a = this.f155253d.f155258b.mo73199a(this.f155254f, this.f155250a);
        this.f155252c = a;
        return a;
    }

    /* renamed from: d */
    public final long mo73239d() {
        byyl byyl = this.f155253d.f155257a.f155567b.f168921d;
        if (byyl == null) {
            byyl = byyl.f168949v;
        }
        return byyl.f168960j;
    }
}
