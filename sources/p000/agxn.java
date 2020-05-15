package p000;

import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.mobiledataplan.MdpPurchaseOfferRequest;
import com.google.android.gms.mobiledataplan.MdpUpsellPlan;
import java.util.UUID;

/* renamed from: agxn */
final /* synthetic */ class agxn implements View.OnClickListener {

    /* renamed from: a */
    private final agxp f66794a;

    /* renamed from: b */
    private final MdpUpsellPlan f66795b;

    /* renamed from: c */
    private final agup f66796c;

    public agxn(agxp agxp, MdpUpsellPlan mdpUpsellPlan, agup agup) {
        this.f66794a = agxp;
        this.f66795b = mdpUpsellPlan;
        this.f66796c = agup;
    }

    public void onClick(View view) {
        agxp agxp = this.f66794a;
        MdpUpsellPlan mdpUpsellPlan = this.f66795b;
        agup agup = this.f66796c;
        agxt agxt = agxp.f66802c;
        agxt.mo36174c(mdpUpsellPlan, view);
        if (agxt.f66812u.f66540l == null) {
            ((bnsl) agxt.f66809w.mo68388c()).mo68405a("Module doesn't have CPID cached but is attempting purchase");
        }
        String str = agxt.f66812u.f66540l.f80151a;
        if (TextUtils.isEmpty(str)) {
            ((bnsl) agxt.f66809w.mo68388c()).mo68405a("empty carrierPlanId in cache, purchase failed");
        }
        String uuid = UUID.randomUUID().toString();
        agou agou = new agou();
        agou.f66196a = str;
        agou.f66197b = mdpUpsellPlan.f80232a;
        agou.f66198c = mdpUpsellPlan.f80240i;
        agou.f66199d = uuid;
        agou.f66203h = mdpUpsellPlan.f80242k;
        MdpPurchaseOfferRequest a = agou.mo35806a();
        if (cfmq.m140246q()) {
            agou agou2 = new agou(a);
            agou2.f66201f = agvh.m55172b();
            a = agou2.mo35806a();
        }
        aucb a2 = agxt.f66812u.mo36103g().mo35770a(a);
        a2.mo50373a(new agxq(agxt, mdpUpsellPlan, agup));
        a2.mo50372a(new agxr(agxt, mdpUpsellPlan, agup));
    }
}
