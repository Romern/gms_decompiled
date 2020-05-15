package p000;

/* renamed from: mlm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mlm extends ahin {

    /* renamed from: a */
    final /* synthetic */ mlq f33948a;

    /* renamed from: b */
    private final bqgy f33949b;

    /* renamed from: c */
    private final String f33950c;

    public mlm(mlq mlq, bqgy bqgy, String str) {
        this.f33948a = mlq;
        bmxy.m108581a(bqgy);
        this.f33949b = bqgy;
        this.f33950c = str;
    }

    /* renamed from: a */
    public final void mo20146a(String str) {
        mlq.f33956a.mo25418e("onEndpointLost(endpointId=%s)", str);
    }

    /* renamed from: a */
    public final void mo20147a(String str, ahij ahij) {
        mlq.f33956a.mo25414c("onEndpointFound(endpointId=%s, discoveredEndpointInfo=%s)", str, ahij);
        if (!this.f33950c.equals(ahij.f67241a)) {
            mlq.f33956a.mo25418e("Connection hint mismatch. Not requesting connection.", new Object[0]);
            return;
        }
        mlq mlq = this.f33948a;
        mlq.f33957b.mo36522a("wifi_d2d_source", str, new mlk(mlq, this.f33949b));
    }
}
