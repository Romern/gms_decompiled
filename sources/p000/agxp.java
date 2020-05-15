package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import com.google.android.gms.mobiledataplan.MdpUpsellPlan;

/* renamed from: agxp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agxp implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ MdpUpsellPlan f66800a;

    /* renamed from: b */
    final /* synthetic */ String f66801b;

    /* renamed from: c */
    final /* synthetic */ agxt f66802c;

    public agxp(agxt agxt, MdpUpsellPlan mdpUpsellPlan, String str) {
        this.f66802c = agxt;
        this.f66800a = mdpUpsellPlan;
        this.f66801b = str;
    }

    public void onClick(View view) {
        this.f66802c.mo36172a(this.f66800a, view);
        MdpUpsellPlan mdpUpsellPlan = this.f66800a;
        String str = this.f66801b;
        Context context = this.f66802c.f66811t;
        Typeface typeface = agup.f66587i;
        agup agup = new agup();
        agup.f66592d = mdpUpsellPlan;
        agup.f66594f = str;
        agup.f66591c = context;
        agup.f66593e = agtw.m55116b();
        agup.f66589a = new agxn(this, this.f66800a, agup);
        agup.f66590b = new agxo(this, this.f66800a, agup);
        agup.show(this.f66802c.f66812u.f66538j, "purchaseDialog");
    }
}
