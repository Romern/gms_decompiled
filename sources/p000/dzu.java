package p000;

import com.google.android.gms.contextmanager.ContextData;

/* renamed from: dzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dzu extends dqi {

    /* renamed from: a */
    final /* synthetic */ dzv f14492a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dzu(dzv dzv, String str, Object... objArr) {
        super(str, objArr);
        this.f14492a = dzv;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9366a(Object obj) {
        tir d = ((rkj) obj).mo24810d();
        if (d != null) {
            try {
                dxr dxr = dzv.f14493b;
                ContextData contextData = null;
                for (int i = 0; i < d.mo24660a(); i++) {
                    ContextData c = d.mo25159b(i);
                    if (c.mo18022j().mo26616b()) {
                        if (contextData == null || c.mo18022j().mo18096c() > contextData.mo18022j().mo18096c()) {
                            contextData = c;
                        }
                    }
                }
                if (contextData != null) {
                    this.f14492a.mo9500b(contextData);
                }
            } finally {
                d.mo12460c();
            }
        }
    }
}
