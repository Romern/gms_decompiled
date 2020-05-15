package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.mobiledataplan.MdpUpsellPlan;

/* renamed from: agyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class agyn implements agya {

    /* renamed from: a */
    private final MdpUpsellPlan f66868a;

    /* renamed from: b */
    private agxt f66869b;

    public agyn(MdpUpsellPlan mdpUpsellPlan) {
        this.f66868a = mdpUpsellPlan;
    }

    /* renamed from: a */
    public int mo36175a() {
        return !agqg.m54838E().booleanValue() ? C0126R.C0128layout.upsell_plan_item_pre_v23 : C0126R.C0128layout.upsell_plan_item;
    }

    /* renamed from: a */
    public final void mo36176a(acm acm) {
        agxt agxt = (agxt) acm;
        this.f66869b = agxt;
        agxt.mo36171a(this.f66868a);
    }
}
