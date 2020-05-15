package p000;

import android.support.p002v7.widget.SwitchCompat;
import com.felicanetworks.mfc.C0126R;

/* renamed from: tpw */
final /* synthetic */ class tpw implements C0038ax {

    /* renamed from: a */
    private final tpx f46466a;

    public tpw(tpx tpx) {
        this.f46466a = tpx;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        tpx tpx = this.f46466a;
        tql tql = (tql) obj;
        if (tql.mo26737c() == 1) {
            bngx bngx = (bngx) tql.mo26735a();
            SwitchCompat switchCompat = (SwitchCompat) tpx.getView().findViewById(C0126R.C0129id.pwm_chromesync_password_save_offer_switch);
            SwitchCompat switchCompat2 = (SwitchCompat) tpx.getView().findViewById(C0126R.C0129id.pwm_chromesync_settings_auto_signin_switch);
            switchCompat.setOnCheckedChangeListener(null);
            switchCompat2.setOnCheckedChangeListener(null);
            boolean a = tsg.m37427a(bngx);
            boolean b = tsg.m37429b(bngx);
            switchCompat.setChecked(a);
            switchCompat2.setChecked(b);
            switchCompat.setOnCheckedChangeListener(tpx.f46469c);
            switchCompat2.setOnCheckedChangeListener(tpx.f46470d);
        }
    }
}
