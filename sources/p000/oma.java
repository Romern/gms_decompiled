package p000;

import android.content.SharedPreferences;
import androidx.preference.Preference;

/* renamed from: oma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oma extends dns {

    /* renamed from: c */
    private boolean f37941c;

    /* renamed from: d */
    private final SharedPreferences.OnSharedPreferenceChangeListener f37942d = new olz(this);

    /* renamed from: c */
    public final void mo9322c() {
        this.f13641a.mo2237a("carservice");
        this.f13641a.mo2240d();
        String string = getArguments().getString("root_key");
        mo9319a(string);
        boolean z = false;
        if (string != null && string.equals("touchpad_tuning")) {
            z = true;
        }
        this.f37941c = z;
        if (z) {
            mo17248d();
            mo9317a().mo2009m().registerOnSharedPreferenceChangeListener(this.f37942d);
        }
    }

    /* renamed from: d */
    public final void mo17248d() {
        boolean z = this.f13641a.mo2238b().getBoolean("touchpad_tuning_enabled", false);
        Preference a = mo2204a((CharSequence) "touchpad_base_fraction");
        a.mo1981a(z);
        a.f1608x = Long.valueOf(ccvu.m131812b());
        Preference a2 = mo2204a((CharSequence) "touchpad_min_size_mm");
        a2.mo1981a(z);
        a2.f1608x = Long.valueOf(ccvu.m131813c());
        Preference a3 = mo2204a((CharSequence) "touchpad_multimove_penalty_mm");
        a3.mo1981a(z);
        a3.f1608x = Long.valueOf(ccvu.m131814d());
    }

    public final void onDestroy() {
        if (this.f37941c) {
            this.f13641a.mo2238b().unregisterOnSharedPreferenceChangeListener(this.f37942d);
        }
        super.onDestroy();
    }
}
