package p000;

import android.app.AlertDialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.mobiledataplan.MdpUpsellPlan;

/* renamed from: agxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class agxt extends acm {

    /* renamed from: w */
    public static final srn f66809w = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: s */
    public final TextView f66810s;

    /* renamed from: t */
    public final Context f66811t;

    /* renamed from: u */
    public final agtw f66812u = agtw.m55116b();

    /* renamed from: v */
    public final agrq f66813v = new agrq();

    /* renamed from: x */
    private final TextView f66814x;

    /* renamed from: y */
    private final TextView f66815y;

    /* renamed from: z */
    private View.OnClickListener f66816z;

    public agxt(View view) {
        super(view);
        this.f66811t = view.getContext();
        this.f66814x = (TextView) view.findViewById(C0126R.C0129id.offer_name);
        this.f66810s = (TextView) view.findViewById(C0126R.C0129id.offer_description);
        this.f66815y = (TextView) view.findViewById(C0126R.C0129id.price);
    }

    /* renamed from: a */
    public void mo36171a(MdpUpsellPlan mdpUpsellPlan) {
        if (mdpUpsellPlan != null && !TextUtils.isEmpty(mdpUpsellPlan.f80232a) && !TextUtils.isEmpty(mdpUpsellPlan.f80233b) && !TextUtils.isEmpty(mdpUpsellPlan.f80241j) && !TextUtils.isEmpty(mdpUpsellPlan.f80236e) && mdpUpsellPlan.f80235d >= 0) {
            this.f66814x.setText(mdpUpsellPlan.f80233b);
            this.f66810s.setText(mdpUpsellPlan.f80241j);
            try {
                String a = agvn.m55180a(mdpUpsellPlan.f80235d, mdpUpsellPlan.f80236e);
                if (cfnm.m140638i()) {
                    this.f66815y.setAllCaps(false);
                }
                this.f66815y.setText(a);
                this.f66816z = new agxp(this, mdpUpsellPlan, a);
                if (agqg.m54838E().booleanValue()) {
                    this.f66815y.setOnClickListener(this.f66816z);
                }
                this.f201a.setOnClickListener(this.f66816z);
            } catch (IllegalArgumentException e) {
                bnsl bnsl = (bnsl) f66809w.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68420a("Carrier provides wrong currency string %s", mdpUpsellPlan.f80236e);
                agvn.m55183a(this.f201a);
            }
        } else {
            f66809w.mo26019b(agyt.m55307c()).mo68405a("Upsell offer doesn't contain required field(s), hide upsell UI view");
            agvn.m55183a(this.f201a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36173b(MdpUpsellPlan mdpUpsellPlan, View view) {
        agrl.m54942a().mo35987a(20, mdpUpsellPlan.f80232a, agvn.m55186b(view), bygd.CLICK_CANCEL_PURCHASE, System.currentTimeMillis(), agvh.m55172b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo36174c(MdpUpsellPlan mdpUpsellPlan, View view) {
        agrl.m54942a().mo35987a(19, mdpUpsellPlan.f80232a, agvn.m55186b(view), bygd.CLICK_CONFIRM_PURCHASE, System.currentTimeMillis(), agvh.m55172b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36172a(MdpUpsellPlan mdpUpsellPlan, View view) {
        agrl.m54942a().mo35987a(4, mdpUpsellPlan.f80232a, agvn.m55186b(view), bygd.VIEW_OFFER_DETAILS, System.currentTimeMillis(), agvh.m55172b());
    }

    /* renamed from: a */
    public final void mo36191a(String str, String str2) {
        if (this.f66812u.f66529a != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f66811t);
            builder.setTitle(str).setMessage(str2).setPositiveButton(this.f66811t.getString(C0126R.string.dialog_got_it), new agxs());
            builder.create().show();
            if (cfmq.m140245p()) {
                agrl.m54942a().mo35987a(43, "purchaseResultDialog", (String) null, bygd.FINISH_UI_AFTER_USER_TRIGGER, System.currentTimeMillis(), agvh.m55172b());
            }
        }
    }
}
