package p000;

import androidx.preference.Preference;
import com.felicanetworks.mfc.C0126R;

/* renamed from: vrl */
final /* synthetic */ class vrl implements aoa {

    /* renamed from: a */
    private final vrr f49859a;

    public vrl(vrr vrr) {
        this.f49859a = vrr;
    }

    /* renamed from: a */
    public final boolean mo2219a(Preference preference) {
        vrr vrr = this.f49859a;
        vrr.mo9317a().mo2020b(preference);
        if (vrr.f49866d.mo28792h()) {
            vrr.f49867e = vrr.mo28768a(C0126R.string.car_pref_key_prompt_before_launch_preferences, C0126R.string.car_driving_mode_prompt_before_launch_title);
            vrr.mo9317a().mo2019a((Preference) vrr.f49867e);
        }
        vrr.f49869g = vrr.mo28768a(C0126R.string.car_pref_key_turn_on_bluetooth_preferences, C0126R.string.car_driving_mode_turn_on_bluetooth_title);
        vrr.mo9317a().mo2019a((Preference) vrr.f49869g);
        if (vrr.f49866d.mo28788d()) {
            vrr.f49868f = vrr.mo28768a(C0126R.string.car_pref_key_pocket_detection_preferences, C0126R.string.car_driving_mode_pocket_detection_title);
            vrr.f49868f.mo1994d((int) C0126R.string.car_driving_mode_pocket_detection_summary);
            vrr.mo9317a().mo2019a((Preference) vrr.f49868f);
        }
        vrr.mo17248d();
        return true;
    }
}
