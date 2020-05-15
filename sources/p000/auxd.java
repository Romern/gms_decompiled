package p000;

/* renamed from: auxd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auxd implements rkl {

    /* renamed from: a */
    final /* synthetic */ auxe f92680a;

    protected auxd(auxe auxe) {
        this.f92680a = auxe;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        aeli aeli = (aeli) rkk;
        auxe.f92681a.mo50711a("fetch home address got result.", new Object[0]).mo50708c();
        try {
            if (aeli.f63490b.mo17710c() && aeli.mo24660a() > 0) {
                this.f92680a.f92687g = aeli.mo24661a(0).mo8025r().toString();
            }
            this.f92680a.mo51008d();
            aeli.mo12460c();
        } finally {
            this.f92680a.mo51004a();
            this.f92680a.f92685e.mo24803g();
        }
    }
}
