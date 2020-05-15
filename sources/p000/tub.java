package p000;

import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: tub */
final /* synthetic */ class tub implements C0038ax {

    /* renamed from: a */
    private final tud f46670a;

    public tub(tud tud) {
        this.f46670a = tud;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        int i;
        tud tud = this.f46670a;
        tql tql = (tql) obj;
        if (tql.mo26735a() != null) {
            int size = ((bngx) tql.mo26735a()).size();
            View view = tud.getView();
            int i2 = 8;
            if (size != 0) {
                i = 8;
            } else {
                i = 0;
            }
            if (size != 0) {
                i2 = 0;
            }
            view.findViewById(C0126R.C0129id.welcome_header_layout).setVisibility(i);
            view.findViewById(C0126R.C0129id.no_passwords_saved_textview).setVisibility(i);
            view.findViewById(C0126R.C0129id.header_layout).setVisibility(i2);
            view.findViewById(C0126R.C0129id.search_passwords_card).setVisibility(i2);
            view.findViewById(C0126R.C0129id.password_list_container).setVisibility(i2);
            if (cdpu.m134637b() && tud.mo26809e()) {
                view.findViewById(C0126R.C0129id.checkup_card).setVisibility(i2);
            }
            ((TextView) tud.getView().findViewById(C0126R.C0129id.password_list_card_title)).setText(tud.getResources().getQuantityString(C0126R.plurals.pwm_saved_passwords, size, Integer.valueOf(size)));
        }
    }
}
