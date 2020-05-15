package p000;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: agwz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agwz extends acm {

    /* renamed from: u */
    private static final srn f66757u = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: s */
    private final TextView f66758s;

    /* renamed from: t */
    private final View f66759t;

    public agwz(View view) {
        super(view);
        this.f66758s = (TextView) view.findViewById(C0126R.C0129id.small_line_text);
        this.f66759t = view.findViewById(C0126R.C0129id.common_layout_divider);
    }

    /* renamed from: a */
    public final void mo36177a(String str, boolean z) {
        int i;
        if (!TextUtils.isEmpty(str)) {
            this.f66758s.setText(str);
        } else {
            f66757u.mo26019b(agyt.m55307c()).mo68405a("Filling an empty line to text view, hide the view");
            agvn.m55183a(this.f201a);
        }
        View view = this.f66759t;
        if (!z) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
    }
}
