package p000;

import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.mobiledataplan.MdpPurchaseOfferResponse;
import com.google.android.gms.mobiledataplan.MdpUpsellPlan;

/* renamed from: agxq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agxq implements aubw {

    /* renamed from: a */
    final /* synthetic */ MdpUpsellPlan f66803a;

    /* renamed from: b */
    final /* synthetic */ agup f66804b;

    /* renamed from: c */
    final /* synthetic */ agxt f66805c;

    public agxq(agxt agxt, MdpUpsellPlan mdpUpsellPlan, agup agup) {
        this.f66805c = agxt;
        this.f66803a = mdpUpsellPlan;
        this.f66804b = agup;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10462a(Object obj) {
        String str;
        MdpPurchaseOfferResponse mdpPurchaseOfferResponse = (MdpPurchaseOfferResponse) obj;
        srn srn = agxt.f66809w;
        agrl.m54942a().mo35987a(8, this.f66803a.f80232a, "buy_button", bygd.PURCHASE_OFFER, System.currentTimeMillis(), agvh.m55172b());
        agxt agxt = this.f66805c;
        agtw agtw = agxt.f66812u;
        if (agtw.f66529a != null) {
            String h = agtw.mo36104h();
            if (TextUtils.isEmpty(h)) {
                str = agxt.f66811t.getString(C0126R.string.purchase_successful_dialog_message);
            } else {
                str = agxt.f66811t.getString(C0126R.string.purchase_successful_dialog_message_with_carrier, h);
            }
            agxt.mo36191a(agxt.f66811t.getString(C0126R.string.purchase_successful_dialog_title), str);
            agxt.f66812u.mo36097a(true);
        }
        if (this.f66805c.f66812u.f66529a != null) {
            this.f66804b.dismissAllowingStateLoss();
        }
    }
}
