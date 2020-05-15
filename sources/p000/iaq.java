package p000;

import android.text.SpannableString;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;
import com.felicanetworks.mfc.C0126R;

/* renamed from: iaq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iaq extends dns implements aoa {

    /* renamed from: c */
    public final ibh f20644c = new ibh();

    /* renamed from: d */
    public String f20645d;

    /* renamed from: e */
    private iac f20646e;

    /* renamed from: f */
    private SwitchPreferenceCompat f20647f;

    /* renamed from: a */
    public final boolean mo2219a(Preference preference) {
        if (((TwoStatePreference) this.f20647f).f1642a) {
            this.f20644c.mo12886a(this.f13641a.f1882a, ibh.m15191h(this.f20645d));
            this.f20646e.mo12858c();
            return true;
        }
        this.f20644c.mo12886a(this.f13641a.f1882a, ibh.m15192i(this.f20645d));
        this.f20646e.mo12859d();
        return true;
    }

    /* renamed from: c */
    public final void mo9322c() {
        this.f20646e = new iac(this.f13641a.f1882a);
        mo9318a((int) C0126R.xml.sms_code_autofill_preferences);
        PreferenceScreen a = mo9317a();
        this.f20647f = (SwitchPreferenceCompat) a.mo2021c((CharSequence) "autofill_permission_state");
        Preference c = a.mo2021c((CharSequence) "dummy_for_description");
        String string = getString(C0126R.string.f7407xa7f82aa7);
        String string2 = getString(C0126R.string.sms_code_autofill_settings_toggle_description_v2, string);
        SpannableString spannableString = new SpannableString(string2);
        iap iap = new iap(this);
        int indexOf = string2.indexOf(string);
        spannableString.setSpan(iap, indexOf, string.length() + indexOf, 33);
        c.mo1966a((CharSequence) spannableString);
    }

    public final void onPause() {
        super.onPause();
        this.f20647f.f1600p = null;
    }

    public final void onResume() {
        super.onResume();
        if (!ibb.m15152a(this.f13641a.f1882a)) {
            getActivity().finish();
            return;
        }
        if (cceb.m129362f()) {
            this.f20645d = ibb.m15158d(this.f13641a.f1882a);
        }
        this.f20644c.mo12886a(this.f13641a.f1882a, ibh.m15190g(this.f20645d));
        this.f20647f.mo1981a(ibb.m15156b(this.f13641a.f1882a));
        SwitchPreferenceCompat switchPreferenceCompat = this.f20647f;
        switchPreferenceCompat.f1600p = this;
        switchPreferenceCompat.mo2035i(this.f20646e.mo12857b());
    }
}
