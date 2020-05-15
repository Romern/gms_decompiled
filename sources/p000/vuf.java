package p000;

import android.content.Intent;
import android.util.Log;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.drivingmode.GearPreference;
import com.google.android.gms.drivingmode.ToggleButtonPreference;
import java.util.ArrayList;

/* renamed from: vuf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vuf extends dns {

    /* renamed from: c */
    public vrv f49983c;

    /* renamed from: d */
    public vrb f49984d;

    /* renamed from: e */
    public vsi f49985e;

    /* renamed from: f */
    private GearPreference f49986f;

    /* renamed from: g */
    private ToggleButtonPreference f49987g;

    /* renamed from: h */
    private Preference f49988h;

    /* renamed from: i */
    private final vsh f49989i = new vue(this);

    /* renamed from: a */
    private final void m41304a(vtz vtz) {
        ((vuw) getActivity()).mo18367a(vtz);
    }

    /* renamed from: c */
    public final void mo9322c() {
        vuk.m41322a();
        this.f49984d = vuk.m41326e(getContext());
        vuk.m41322a();
        vsi f = vuk.m41327f(getContext());
        this.f49985e = f;
        f.mo28795k();
        mo9318a((int) C0126R.xml.pref_driving_mode);
        PreferenceScreen a = mo9317a();
        this.f49986f = (GearPreference) a.mo2021c((CharSequence) getString(C0126R.string.car_pref_key_driving_mode_behavior_switch));
        ToggleButtonPreference toggleButtonPreference = (ToggleButtonPreference) a.mo2021c((CharSequence) getString(C0126R.string.car_pref_key_driving_mode_switch));
        this.f49987g = toggleButtonPreference;
        toggleButtonPreference.mo1981a(false);
        this.f49988h = a.mo2021c((CharSequence) getString(C0126R.string.car_pref_key_automatic_rules_preferences));
    }

    /* renamed from: d */
    public final void mo17248d() {
        boolean z;
        boolean z2 = true;
        if (this.f49985e.mo28775a().mo28743c() == 3 && this.f49985e.mo28784b() && sex.m35104a(getContext()).mo25451d() == 1) {
            StringBuilder sb = new StringBuilder(74);
            sb.append("DnD appears to be off. Turning off DrivingMode. currentFilter: 1");
            sb.toString();
            this.f49985e.mo28785b(vuu.MANUAL);
        }
        ToggleButtonPreference toggleButtonPreference = this.f49987g;
        if (!ccrg.m131343c()) {
            z = true;
        } else if (this.f49985e.mo28775a().mo28743c() != 0) {
            z = true;
        } else {
            z = false;
        }
        toggleButtonPreference.mo1981a(z);
        this.f49987g.f31240c = new vuc(this);
        this.f49987g.mo18374i(this.f49985e.mo28784b());
        vrs a = this.f49985e.mo28775a();
        this.f49986f.mo1966a(a.mo28743c() == 2 ? getString(C0126R.string.car_driving_mode_behavior_android_auto_pref_option_title) : a.mo28743c() == 3 ? getString(C0126R.string.car_driving_mode_behavior_dnd_pref_option_title) : a.mo28743c() == 4 ? getString(C0126R.string.car_driving_mode_behavior_morris_pref_option_title) : a.mo28743c() == 1 ? a.mo28739a(getContext()) : getString(C0126R.string.car_driving_mode_behavior_empty_pref_option_title));
        this.f49986f.f1600p = new vua(this);
        Intent b = a.mo28742b();
        if (b == null) {
            this.f49986f.mo18368a((vub) null);
            this.f49986f.mo18370i(false);
        } else {
            this.f49986f.mo18368a(new vub(this, b));
            this.f49986f.mo18370i(true);
        }
        if (ccrg.m131343c()) {
            Preference preference = this.f49988h;
            if (this.f49985e.mo28775a().mo28743c() == 0) {
                z2 = false;
            }
            preference.mo1981a(z2);
        }
        this.f49988h.f1600p = new vud(this);
        ArrayList a2 = bnkn.m109661a();
        if (this.f49985e.mo28787c()) {
            a2.add(getString(C0126R.string.car_driving_mode_bluetooth_auto_launch_title));
        }
        if (this.f49985e.mo28791g()) {
            a2.add(getString(C0126R.string.car_driving_mode_activity_recognition_auto_launch_title));
        }
        if (a2.isEmpty()) {
            a2.add(getString(C0126R.string.common_never));
        }
        this.f49988h.mo1966a((CharSequence) bmxr.m108544a(", ").mo66874a((Iterable) a2));
    }

    /* renamed from: e */
    public final vum mo28862e() {
        return ((vul) getActivity()).mo18365a();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            mo17248d();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f49985e.mo28798n();
    }

    public final void onPause() {
        super.onPause();
        this.f49983c = null;
        this.f49985e.mo28778a((vsh) null);
        m41304a((vtz) null);
    }

    public final void onResume() {
        super.onResume();
        Log.i("CAR.DRIVINGMODE", "DrivingModeSettingsFragment#onResume");
        this.f49984d.mo28759a(bpeb.DRIVING_MODE, bpea.DRIVING_MODE_SETTINGS);
        this.f49985e.mo28778a(this.f49989i);
        mo28862e().mo28863a((int) C0126R.string.car_connected_devices_car_setting);
        m41304a(new vtz(this));
    }
}
