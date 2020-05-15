package p000;

import android.view.View;
import com.google.android.gms.mobiledataplan.MdpUpsellPlan;

/* renamed from: agxo */
final /* synthetic */ class agxo implements View.OnClickListener {

    /* renamed from: a */
    private final agxp f66797a;

    /* renamed from: b */
    private final MdpUpsellPlan f66798b;

    /* renamed from: c */
    private final agup f66799c;

    public agxo(agxp agxp, MdpUpsellPlan mdpUpsellPlan, agup agup) {
        this.f66797a = agxp;
        this.f66798b = mdpUpsellPlan;
        this.f66799c = agup;
    }

    public void onClick(View view) {
        agxp agxp = this.f66797a;
        MdpUpsellPlan mdpUpsellPlan = this.f66798b;
        agup agup = this.f66799c;
        agxp.f66802c.mo36173b(mdpUpsellPlan, view);
        agup.dismiss();
    }
}
