package p000;

import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;

/* renamed from: aguu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aguu implements aubw {

    /* renamed from: a */
    final /* synthetic */ agtw f66605a;

    public aguu(agtw agtw) {
        this.f66605a = agtw;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10462a(Object obj) {
        MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse = (MdpCarrierPlanIdResponse) obj;
        if (mdpCarrierPlanIdResponse == null) {
            ((bnsl) agve.f66617a.mo68388c()).mo68405a("GetCarrierPlanId API call returned null");
            this.f66605a.mo36095a(new NullPointerException());
            return;
        }
        agtw agtw = this.f66605a;
        agtw.f66540l = mdpCarrierPlanIdResponse;
        if (mdpCarrierPlanIdResponse.f80151a == null) {
            agtw.mo36095a(new NullPointerException());
        } else if (agqg.m54865t().booleanValue() || agpk.m54727d()) {
            agve.m55165a(agtw.f66540l.f80151a, agtw);
        } else {
            agtw.mo36096a(agtw.f66540l.f80156f);
            agve.m55167b(agtw.f66540l.f80151a, agtw);
        }
    }
}
