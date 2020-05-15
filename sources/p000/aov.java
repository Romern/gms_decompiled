package p000;

import android.widget.CompoundButton;
import androidx.preference.SwitchPreference;

/* renamed from: aov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aov implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ SwitchPreference f1915a;

    public aov(SwitchPreference switchPreference) {
        this.f1915a = switchPreference;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (!this.f1915a.mo1988b(Boolean.valueOf(z))) {
            compoundButton.setChecked(!z);
        } else {
            this.f1915a.mo2035i(z);
        }
    }
}
