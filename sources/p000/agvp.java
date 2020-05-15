package p000;

import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.text.NumberFormat;

/* renamed from: agvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agvp extends acm {

    /* renamed from: s */
    public static final srn f66665s = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    public agvp(View view) {
        super(view);
    }

    /* renamed from: a */
    public final void mo36135a(int i, long j, NumberFormat numberFormat) {
        if (cfnm.m140638i()) {
            ((TextView) this.f201a.findViewById(i)).setText(agvn.m55180a(j, numberFormat.getCurrency().getCurrencyCode()));
        } else {
            ((TextView) this.f201a.findViewById(i)).setText(numberFormat.format(agze.m55326a(j)));
        }
    }

    /* renamed from: c */
    public final void mo36137c(int i) {
        ((TextView) this.f201a.findViewById(C0126R.C0129id.title_text)).setText(i);
    }

    /* renamed from: d */
    public final void mo36138d(int i) {
        this.f201a.findViewById(i).setVisibility(0);
    }

    /* renamed from: a */
    public final void mo36136a(int i, String str) {
        ((TextView) this.f201a.findViewById(i)).setText(str);
    }
}
