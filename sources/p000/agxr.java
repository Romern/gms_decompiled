package p000;

import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.mobiledataplan.MdpUpsellPlan;

/* renamed from: agxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agxr implements aubt {

    /* renamed from: a */
    final /* synthetic */ MdpUpsellPlan f66806a;

    /* renamed from: b */
    final /* synthetic */ agup f66807b;

    /* renamed from: c */
    final /* synthetic */ agxt f66808c;

    public agxr(agxt agxt, MdpUpsellPlan mdpUpsellPlan, agup agup) {
        this.f66808c = agxt;
        this.f66806a = mdpUpsellPlan;
        this.f66807b = agup;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        String str;
        bnsl a = agxt.f66809w.mo26019b(agyt.m55307c());
        a.mo68437a(exc);
        a.mo68405a("Purchase offer failed");
        agrl.m54942a().mo35987a(9, this.f66806a.f80232a, (String) null, bygd.PURCHASE_FAILED, System.currentTimeMillis(), agvh.m55172b());
        if ((exc instanceof rjp) && ((rjp) exc).mo24655a() == 27030) {
            agxt agxt = this.f66808c;
            if (agxt.f66812u.f66548t) {
                agxt.mo36191a(agxt.f66811t.getString(C0126R.string.purchase_fail_insufficient_funds_title), agxt.f66811t.getString(C0126R.string.purchase_fail_insufficient_funds_message));
            } else {
                agrq agrq = agxt.f66813v;
                agrq.mo36027a(agxt.f66811t.getString(C0126R.string.mobile_data_plan), agrq.f66323b.getString(C0126R.string.account_balance_too_low), agrq.f66323b.getString(C0126R.string.unsuccessful_transaction));
            }
            agxt.f66812u.mo36097a(true);
        } else {
            agxt agxt2 = this.f66808c;
            agtw agtw = agxt2.f66812u;
            if (agtw.f66548t) {
                String h = agtw.mo36104h();
                if (TextUtils.isEmpty(h)) {
                    str = agxt2.f66811t.getString(C0126R.string.purchase_unspecified_fail_dialog_title);
                } else {
                    str = agxt2.f66811t.getString(C0126R.string.purchase_unspecified_fail_dialog_title_with_carrier, h);
                }
                agxt2.mo36191a(str, agxt2.f66811t.getString(C0126R.string.purchase_unspecified_fail_dialog_message));
            } else {
                agrq agrq2 = agxt2.f66813v;
                agrq2.mo36027a(agxt2.f66811t.getString(C0126R.string.mobile_data_plan), agrq2.f66323b.getString(C0126R.string.purchase_error), agrq2.f66323b.getString(C0126R.string.unsuccessful_transaction));
            }
            agxt2.f66812u.mo36097a(true);
        }
        if (this.f66808c.f66812u.f66529a != null) {
            this.f66807b.dismissAllowingStateLoss();
        }
    }
}
