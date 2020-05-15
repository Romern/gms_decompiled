package p000;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;

/* renamed from: agxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agxm extends acm {

    /* renamed from: v */
    public static final srn f66790v = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: s */
    public final TextView f66791s;

    /* renamed from: t */
    public final Context f66792t;

    /* renamed from: u */
    public MdpCarrierPlanIdResponse f66793u;

    public agxm(View view) {
        super(view);
        this.f66792t = view.getContext();
        this.f66791s = (TextView) view.findViewById(C0126R.C0129id.small_line_text);
    }
}
