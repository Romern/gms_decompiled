package p000;

import android.view.View;
import com.google.android.gms.drivingmode.MasterSwitchPreference;

/* renamed from: vur */
public final /* synthetic */ class vur implements View.OnClickListener {

    /* renamed from: a */
    private final MasterSwitchPreference f50001a;

    public vur(MasterSwitchPreference masterSwitchPreference) {
        this.f50001a = masterSwitchPreference;
    }

    public void onClick(View view) {
        MasterSwitchPreference masterSwitchPreference = this.f50001a;
        if (masterSwitchPreference.f31234a.isEnabled()) {
            masterSwitchPreference.mo18373i(!masterSwitchPreference.f31235b);
            if (!masterSwitchPreference.mo1988b(Boolean.valueOf(masterSwitchPreference.f31235b))) {
                masterSwitchPreference.mo18373i(!masterSwitchPreference.f31235b);
            } else {
                masterSwitchPreference.mo2004h(masterSwitchPreference.f31235b);
            }
        }
    }
}
