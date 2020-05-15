package p000;

/* renamed from: abrf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abrf extends acpn {

    /* renamed from: a */
    final /* synthetic */ abrv f58032a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abrf(abrv abrv, bqbd bqbd) {
        super(bqbd);
        this.f58032a = abrv;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        if (!this.f58032a.mo32320d()) {
            absg.m48191b("Maintenance skipped because init failed");
            this.f58032a.f58083s.mo32447a("maintenance_skipped");
            return false;
        }
        this.f58032a.mo32330m();
        return true;
    }
}
