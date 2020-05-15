package p000;

import com.google.android.gms.awareness.fence.AwarenessFence;
import com.google.android.gms.contextmanager.ContextData;

/* renamed from: eaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class eaj extends dqi {

    /* renamed from: a */
    final /* synthetic */ eal f14543a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eaj(eal eal, String str, Object... objArr) {
        super(str, objArr);
        this.f14543a = eal;
    }

    /* renamed from: a */
    public final void mo9444a(Exception exc) {
        dss.m9249a(this.f14543a.f14387c, "getCurrCtxt: read latest (produced) context failed, status = %s", exc.getMessage());
        this.f14543a.mo9907j();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9366a(Object obj) {
        tir d = ((rkj) obj).mo24810d();
        if (d != null) {
            try {
                if (d.mo24660a() != 0) {
                    int g = d.mo25159b(0).mo18018g();
                    eal eal = this.f14543a;
                    if (g == eal.f14390f.f14369c[0]) {
                        eal.f14546j = d.mo25159b(0);
                        new Object[1][0] = this.f14543a.f14546j;
                        d.mo12460c();
                        eal eal2 = this.f14543a;
                        ContextData contextData = eal2.f14546j;
                        if (contextData != null) {
                            String d2 = contextData.mo18014d();
                            eal eal3 = this.f14543a;
                            AwarenessFence a = eal.m9979a(d2, eal3.f14387c, eal3.f14389e);
                            if (a != null) {
                                new Object[1][0] = a;
                                this.f14543a.mo9905a(a);
                                return;
                            }
                            this.f14543a.mo9907j();
                            return;
                        }
                        eal2.mo9907j();
                        return;
                    }
                }
            } catch (Throwable th) {
                if (d != null) {
                    d.mo12460c();
                }
                throw th;
            }
        }
        this.f14543a.mo9907j();
        if (d != null) {
            d.mo12460c();
        }
    }
}
