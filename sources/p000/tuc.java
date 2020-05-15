package p000;

import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: tuc */
final /* synthetic */ class tuc implements C0038ax {

    /* renamed from: a */
    private final tud f46671a;

    public tuc(tud tud) {
        this.f46671a = tud;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        int i;
        tud tud = this.f46671a;
        tql tql = (tql) obj;
        if (tql == null || tql.mo26735a() == null) {
            i = 0;
        } else {
            i = ((bngx) tql.mo26735a()).size();
        }
        TextView textView = (TextView) tud.getView().findViewById(C0126R.C0129id.declined_sites_textview);
        textView.setVisibility(0);
        textView.setText(tud.getResources().getQuantityString(C0126R.plurals.pwm_blacklist_label, i, Integer.valueOf(i)));
    }
}
