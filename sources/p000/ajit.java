package p000;

import java.util.List;

/* renamed from: ajit */
public final /* synthetic */ class ajit implements C0038ax {

    /* renamed from: a */
    private final ajuq f70723a;

    public ajit(ajuq ajuq) {
        this.f70723a = ajuq;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        ajuq ajuq = this.f70723a;
        C0915ct ctVar = (C0915ct) obj;
        C0066bx bxVar = ((C0917cv) ajuq).f12178a;
        if (ctVar != null) {
            if (bxVar.f5936f == null && bxVar.f5937g == null) {
                bxVar.f5935e = ctVar.mo3640c();
            } else if (ctVar.mo3640c() != bxVar.f5935e) {
                throw new IllegalArgumentException("AsyncPagedListDiffer cannot handle both contiguous and non-contiguous lists.");
            }
        }
        int i = bxVar.f5938h + 1;
        bxVar.f5938h = i;
        C0915ct ctVar2 = bxVar.f5936f;
        if (ctVar != ctVar2) {
            C0915ct ctVar3 = bxVar.f5937g;
            if (ctVar == null) {
                int a = bxVar.mo3566a();
                C0915ct ctVar4 = bxVar.f5936f;
                if (ctVar4 != null) {
                    ctVar4.mo8241a(bxVar.f5939i);
                    bxVar.f5936f = null;
                } else if (bxVar.f5937g != null) {
                    bxVar.f5937g = null;
                }
                bxVar.f5931a.mo8386b(0, a);
                bxVar.mo3567b();
            } else if (ctVar2 == null && ctVar3 == null) {
                bxVar.f5936f = ctVar;
                ctVar.mo8242a((List) null, bxVar.f5939i);
                bxVar.f5931a.mo8384a(0, ctVar.size());
                bxVar.mo3567b();
            } else {
                if (ctVar2 != null) {
                    ctVar2.mo8241a(bxVar.f5939i);
                    bxVar.f5937g = (C0915ct) bxVar.f5936f.mo8246g();
                    bxVar.f5936f = null;
                }
                C0915ct ctVar5 = bxVar.f5937g;
                if (ctVar5 == null || bxVar.f5936f != null) {
                    throw new IllegalStateException("must be in snapshot state to diff");
                }
                bxVar.f5932b.f27237a.execute(new C0065bw(bxVar, ctVar5, (C0915ct) ctVar.mo8246g(), i, ctVar));
            }
        }
        ajuq.f71315f.clear();
    }
}
