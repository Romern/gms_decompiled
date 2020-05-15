package p000;

import android.widget.CompoundButton;
import androidx.preference.SwitchPreferenceCompat;

/* renamed from: aow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aow implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ SwitchPreferenceCompat f1916a;

    public aow(SwitchPreferenceCompat switchPreferenceCompat) {
        this.f1916a = switchPreferenceCompat;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (!this.f1916a.mo1988b(Boolean.valueOf(z))) {
            compoundButton.setChecked(!z);
        } else {
            this.f1916a.mo2035i(z);
        }
    }
}
