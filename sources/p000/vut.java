package p000;

import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.drivingmode.ToggleButtonPreference;

/* renamed from: vut */
public final /* synthetic */ class vut implements View.OnClickListener {

    /* renamed from: a */
    private final ToggleButtonPreference f50002a;

    public vut(ToggleButtonPreference toggleButtonPreference) {
        this.f50002a = toggleButtonPreference;
    }

    public void onClick(View view) {
        boolean z;
        ToggleButtonPreference toggleButtonPreference = this.f50002a;
        int id = view.getId();
        if (id == C0126R.C0129id.on_button) {
            z = false;
        } else {
            z = true;
        }
        toggleButtonPreference.mo18374i(z);
        vuc vuc = toggleButtonPreference.f31240c;
        if (vuc != null) {
            vuf vuf = vuc.f49980a;
            if (id == C0126R.C0129id.on_button) {
                vuf.f49984d.mo28759a(bpeb.DRIVING_MODE, bpea.DRIVING_MODE_MANUAL_TOGGLE_DISABLED);
                vuf.f49985e.mo28785b(vuu.MANUAL);
                return;
            }
            vuf.f49984d.mo28759a(bpeb.DRIVING_MODE, bpea.DRIVING_MODE_MANUAL_TOGGLE_ENABLED);
            vuf.f49985e.mo28786c(vuu.MANUAL);
        }
    }
}
