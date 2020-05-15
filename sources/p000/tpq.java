package p000;

import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: tpq */
final /* synthetic */ class tpq implements C0038ax {

    /* renamed from: a */
    private final tpt f46458a;

    /* renamed from: b */
    private final View f46459b;

    public tpq(tpt tpt, View view) {
        this.f46458a = tpt;
        this.f46459b = view;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        int i;
        tpt tpt = this.f46458a;
        View view = this.f46459b;
        tql tql = (tql) obj;
        if (tql != null) {
            int c = tql.mo26737c();
            if (c != 0) {
                i = c == 1 ? ((bngx) tql.mo26735a()).size() : 0;
            } else {
                throw null;
            }
        } else {
            i = 0;
        }
        ((TextView) view.findViewById(C0126R.C0129id.blacklist_title)).setText(tpt.getResources().getQuantityString(C0126R.plurals.pwm_blacklist_label, i, Integer.valueOf(i)));
    }
}
