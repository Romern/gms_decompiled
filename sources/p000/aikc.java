package p000;

/* renamed from: aikc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aikc extends soa {

    /* renamed from: a */
    final /* synthetic */ ahgb f69016a;

    /* renamed from: b */
    final /* synthetic */ bqgy f69017b;

    /* renamed from: c */
    final /* synthetic */ aike f69018c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aikc(aike aike, ahgb ahgb, bqgy bqgy) {
        super(9);
        this.f69018c = aike;
        this.f69016a = ahgb;
        this.f69017b = bqgy;
    }

    public final void run() {
        ahgb ahgb = this.f69016a;
        aike aike = this.f69018c;
        if (ahgb.mo36418a(aike.f69022b, aike.f69023c, aike.f69024d)) {
            this.f69017b.mo69138b((Object) null);
            return;
        }
        bqgy bqgy = this.f69017b;
        String valueOf = String.valueOf(this.f69018c.mo37599c());
        bqgy.mo69136a((Throwable) new RuntimeException(valueOf.length() == 0 ? new String("Failed to start BLE Extended scanning with settings: ") : "Failed to start BLE Extended scanning with settings: ".concat(valueOf)));
    }
}
