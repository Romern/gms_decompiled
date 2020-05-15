package p000;

import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: fpb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fpb extends acm {

    /* renamed from: s */
    final View f17058s;

    /* renamed from: t */
    final TextView f17059t;

    /* renamed from: u */
    final TextView f17060u;

    /* renamed from: v */
    final TextView f17061v;

    /* renamed from: w */
    final TextView f17062w;

    public fpb(View view) {
        super(view);
        this.f17058s = view;
        this.f17059t = (TextView) view.findViewById(C0126R.C0129id.component_title);
        this.f17060u = (TextView) view.findViewById(C0126R.C0129id.data_usage_foreground);
        this.f17061v = (TextView) view.findViewById(C0126R.C0129id.data_usage_background);
        this.f17062w = (TextView) view.findViewById(C0126R.C0129id.data_usage_total);
        view.setFocusable(true);
    }
}
