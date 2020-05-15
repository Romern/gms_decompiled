package p000;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;

/* renamed from: ann */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ann implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ CheckBoxPreference f1854a;

    public ann(CheckBoxPreference checkBoxPreference) {
        this.f1854a = checkBoxPreference;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (!this.f1854a.mo1988b(Boolean.valueOf(z))) {
            compoundButton.setChecked(!z);
        } else {
            this.f1854a.mo2035i(z);
        }
    }
}
