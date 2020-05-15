package p000;

import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: tug */
final /* synthetic */ class tug implements C0038ax {

    /* renamed from: a */
    private final tui f46677a;

    /* renamed from: b */
    private final View f46678b;

    public tug(tui tui, View view) {
        this.f46677a = tui;
        this.f46678b = view;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        tui tui = this.f46677a;
        View view = this.f46678b;
        tql tql = (tql) obj;
        if (tql.mo26735a() != null) {
            int size = ((bngx) tql.mo26735a()).size();
            int i = 0;
            ((TextView) view.findViewById(C0126R.C0129id.password_search_title)).setText(tui.getResources().getQuantityString(C0126R.plurals.pwm_found_passwords, size, Integer.valueOf(size)));
            View findViewById = view.findViewById(C0126R.C0129id.no_search_results_animation);
            if (size != 0) {
                i = 8;
            }
            findViewById.setVisibility(i);
        }
    }
}
