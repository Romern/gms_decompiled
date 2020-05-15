package p000;

import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusResponse;

/* renamed from: agxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agxx implements agya {

    /* renamed from: a */
    public MdpCarrierPlanIdResponse f66825a = null;

    /* renamed from: b */
    public MdpDataPlanStatusResponse f66826b = null;

    /* renamed from: c */
    public boolean f66827c = true;

    /* renamed from: d */
    public agvx f66828d;

    /* renamed from: a */
    public final int mo36175a() {
        return C0126R.C0128layout.carrier_item;
    }

    /* renamed from: a */
    public final void mo36176a(acm acm) {
        agvx agvx = (agvx) acm;
        this.f66828d = agvx;
        MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse = this.f66825a;
        MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse2 = agvx.f66688w;
        if (!(mdpCarrierPlanIdResponse2 == null && mdpCarrierPlanIdResponse == null)) {
            if (mdpCarrierPlanIdResponse2 == null || (mdpCarrierPlanIdResponse != null && !TextUtils.equals(mdpCarrierPlanIdResponse2.f80151a, mdpCarrierPlanIdResponse.f80151a))) {
                agvx.f66689x = true;
            }
            agvx.f66688w = mdpCarrierPlanIdResponse;
        }
        agvx agvx2 = this.f66828d;
        agvx2.f66690y = this.f66827c;
        MdpDataPlanStatusResponse mdpDataPlanStatusResponse = this.f66826b;
        if (!agvx2.f66689x) {
            agrl.m54942a().mo35987a(22, "Logo is same as previous loading, using previous logo and no need to fetch", (String) null, bygd.CARRIER_LOGO_LOADED, System.currentTimeMillis(), agvh.m55172b());
            agvx2.mo36151w();
        } else {
            MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse3 = agvx2.f66688w;
            if (mdpCarrierPlanIdResponse3 != null) {
                String str = mdpCarrierPlanIdResponse3.f80154d;
                if (!TextUtils.isEmpty(str)) {
                    agvx2.mo36149a(str);
                } else {
                    String c = agqg.m54848c();
                    if (!TextUtils.isEmpty(c)) {
                        agvx2.mo36149a(c);
                    } else {
                        agvx2.mo36150v();
                    }
                }
            }
            agvx2.f66689x = false;
        }
        String a = agvn.m55181a(agvx2.f66688w);
        agtw agtw = agvx2.f66687v;
        if (agtw != null && !TextUtils.isEmpty(agtw.f66543o)) {
            String valueOf = String.valueOf(a);
            String str2 = agvx2.f66687v.f66543o;
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str2).length());
            sb.append(valueOf);
            sb.append(" ");
            sb.append(str2);
            a = sb.toString();
        }
        agvx2.f66684s.setText(a);
        agvx2.mo36148a(mdpDataPlanStatusResponse);
    }
}
