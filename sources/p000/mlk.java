package p000;

/* renamed from: mlk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mlk extends ahia {

    /* renamed from: a */
    public final bqgy f33944a;

    /* renamed from: b */
    final /* synthetic */ mlq f33945b;

    public mlk(mlq mlq, bqgy bqgy) {
        this.f33945b = mlq;
        bmxy.m108581a(bqgy);
        this.f33944a = bqgy;
    }

    /* renamed from: a */
    public final void mo20142a(String str) {
        mlq.f33956a.mo25414c("onDisconnected(endpointId=%s)", str);
        mlq mlq = this.f33945b;
        mlq.f33958c.execute(new mlj(mlq));
    }

    /* renamed from: a */
    public final void mo20143a(String str, ahhx ahhx) {
        mlq.f33956a.mo25414c("onBandwidthChanged(endpointId=%s, bandwidthQuality=%d)", str, Integer.valueOf(ahhx.f67223a));
    }

    /* renamed from: a */
    public final void mo20144a(String str, ahhz ahhz) {
        mlq.f33956a.mo25414c("onConnectionInitiated(endpointId=%s)", str);
        if (!"wifi_d2d_target".equals(ahhz.f67228a)) {
            mlq.f33956a.mo25416d("Rejecting connection request from unexpected endpoint: %s.", str);
            this.f33945b.f33957b.mo36519a(str);
            return;
        }
        mlq mlq = this.f33945b;
        mlq.f33960e = ahhz.f67230c;
        mlq.f33957b.mo36521a(str, new mlp(mlq));
    }

    /* renamed from: a */
    public final void mo20145a(String str, ahid ahid) {
        mlq.f33956a.mo25414c("onConnectionResult(endpointId=%s, status=%s)", str, ahid.f67235a);
        this.f33945b.f33958c.execute(new mli(this, str, ahid));
    }
}
