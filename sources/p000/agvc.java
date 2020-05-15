package p000;

import android.os.Build;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferResponse;
import com.google.android.gms.mobiledataplan.MdpUpsellPlan;
import java.util.ArrayList;

/* renamed from: agvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agvc implements aubw {

    /* renamed from: a */
    final /* synthetic */ agtw f66616a;

    public agvc(agtw agtw) {
        this.f66616a = agtw;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agug.a(int, agya):void
     arg types: [int, agxw]
     candidates:
      agug.a(android.view.ViewGroup, int):acm
      agug.a(acm, int):void
      abh.a(android.view.ViewGroup, int):acm
      abh.a(int, java.lang.Object):void
      abh.a(acm, int):void
      agug.a(int, agya):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agug.a(int, agya):void
     arg types: [int, agyf]
     candidates:
      agug.a(android.view.ViewGroup, int):acm
      agug.a(acm, int):void
      abh.a(android.view.ViewGroup, int):acm
      abh.a(int, java.lang.Object):void
      abh.a(acm, int):void
      agug.a(int, agya):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agug.a(int, agya):void
     arg types: [int, agyg]
     candidates:
      agug.a(android.view.ViewGroup, int):acm
      agug.a(acm, int):void
      abh.a(android.view.ViewGroup, int):acm
      abh.a(int, java.lang.Object):void
      abh.a(acm, int):void
      agug.a(int, agya):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agug.a(int, agya):void
     arg types: [int, agyn]
     candidates:
      agug.a(android.view.ViewGroup, int):acm
      agug.a(acm, int):void
      abh.a(android.view.ViewGroup, int):acm
      abh.a(int, java.lang.Object):void
      abh.a(acm, int):void
      agug.a(int, agya):void */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10462a(Object obj) {
        Integer num;
        int i;
        MdpUpsellPlan[] mdpUpsellPlanArr;
        int length;
        MdpUpsellOfferResponse mdpUpsellOfferResponse = (MdpUpsellOfferResponse) obj;
        agtw agtw = this.f66616a;
        if (!(agtw.f66529a == null || mdpUpsellOfferResponse == null)) {
            if (cflu.m139985c()) {
                num = Integer.valueOf((int) cflu.m139988f());
            } else {
                num = null;
            }
            agrl a = agrl.m54942a();
            MdpUpsellPlan[] mdpUpsellPlanArr2 = mdpUpsellOfferResponse.f80227e;
            if (mdpUpsellPlanArr2 != null) {
                i = mdpUpsellPlanArr2.length;
            } else {
                i = 0;
            }
            a.mo35984a(24, num, i, bygd.UPSELL_OFFER_LOADED, System.currentTimeMillis(), agvh.m55172b());
            if (mdpUpsellOfferResponse.f80228f != null && agqg.m54839F().booleanValue()) {
                Bundle bundle = mdpUpsellOfferResponse.f80228f;
                agtw.f66544p = bundle.getString("purchase_term_html");
                agtw.f66545q = bundle.getString("purchase_method_description");
            }
            if (!cfnm.m140633d()) {
                mdpUpsellPlanArr = mdpUpsellOfferResponse.f80227e;
            } else {
                if (agtw.f66549u) {
                    agtw.mo36100d();
                    agtw.f66549u = false;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                MdpUpsellPlan[] mdpUpsellPlanArr3 = (MdpUpsellPlan[]) bmxu.m108565a(mdpUpsellOfferResponse.f80227e, new MdpUpsellPlan[0]);
                for (MdpUpsellPlan mdpUpsellPlan : mdpUpsellPlanArr3) {
                    if (mdpUpsellPlan != null) {
                        if (mdpUpsellPlan.f80242k != 1) {
                            arrayList.add(mdpUpsellPlan);
                        } else if (((long) arrayList2.size()) < cfnm.f184575a.mo6606a().mo81679l()) {
                            arrayList2.add(mdpUpsellPlan);
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    agug agug = agtw.f66536h;
                    int i2 = agtw.f66542n;
                    agtw.f66542n = i2 + 1;
                    agug.mo36115a(i2, (agya) new agxw(agtw.f66539k.getString(C0126R.string.separator_line_repurchase)));
                    if (arrayList2.size() == 1) {
                        agug agug2 = agtw.f66536h;
                        int i3 = agtw.f66542n;
                        agtw.f66542n = i3 + 1;
                        agug2.mo36115a(i3, (agya) new agyf((MdpUpsellPlan) arrayList2.get(0), true));
                    } else {
                        agug agug3 = agtw.f66536h;
                        int i4 = agtw.f66542n;
                        agtw.f66542n = i4 + 1;
                        agug3.mo36115a(i4, (agya) new agyg(arrayList2));
                    }
                    agrl.m54942a().mo35984a(44, (Integer) null, arrayList2.size(), bygd.REPURCHASE_OFFER_LOADED, System.currentTimeMillis(), agvh.m55172b());
                }
                mdpUpsellPlanArr = (MdpUpsellPlan[]) arrayList.toArray(new MdpUpsellPlan[0]);
            }
            if (mdpUpsellPlanArr != null && (length = mdpUpsellPlanArr.length) > 0) {
                if (!agtw.f66549u) {
                    agug agug4 = agtw.f66536h;
                    int i5 = agtw.f66542n;
                    agtw.f66542n = i5 + 1;
                    agug4.mo36115a(i5, (agya) new agxw(agtw.f66539k.getString(C0126R.string.separator_line_title_buy_data)));
                } else {
                    agug agug5 = agtw.f66536h;
                    int i6 = agtw.f66541m;
                    int i7 = agtw.f66542n;
                    agtw.f66542n = i7 - 1;
                    agug5.mo36118e(i6 + 1, i7);
                    agtw.f66549u = false;
                }
                if (cflu.m139985c()) {
                    cflu.m139987e();
                    if (((long) length) > cflu.m139987e()) {
                        length = (int) cflu.m139987e();
                    }
                }
                for (int i8 = 0; i8 < length; i8++) {
                    MdpUpsellPlan mdpUpsellPlan2 = mdpUpsellPlanArr[i8];
                    if (mdpUpsellPlan2 != null) {
                        agug agug6 = agtw.f66536h;
                        int i9 = agtw.f66542n;
                        agtw.f66542n = i9 + 1;
                        agug6.mo36115a(i9, (agya) new agyn(mdpUpsellPlan2));
                    }
                }
            } else if (agtw.f66549u && cfnm.f184575a.mo6606a().mo81675h()) {
                agtw.mo36100d();
                agtw.f66549u = false;
            }
            if (agtw.f66547s) {
                int i10 = Build.VERSION.SDK_INT;
                if (agqg.m54863r().booleanValue()) {
                    ((aah) agtw.f66535g.getLayoutManager()).mo63b(agtw.f66541m, 0);
                    agtw.f66547s = false;
                }
            }
            agtw.mo36102f();
        }
        this.f66616a.mo36098b(false);
    }
}
