package p000;

/* renamed from: fkp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fkp extends flk {

    /* renamed from: a */
    final /* synthetic */ fkt f16807a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fkp(fkt fkt, fkm fkm) {
        super(fkm);
        this.f16807a = fkt;
    }

    /* renamed from: a */
    public final void mo10965a() {
        fkt fkt = this.f16807a;
        fje.m11804a();
        if (fkt.mo10970b()) {
            fkt.mo10933d("Inactivity, disconnecting from device AnalyticsService");
            fkt.mo10972d();
        }
    }
}
