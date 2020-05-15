package p000;

import android.os.Bundle;
import android.util.Log;
import com.android.setupwizardlib.items.Item;
import com.felicanetworks.mfc.C0126R;

/* renamed from: vsz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vsz extends vtq {

    /* renamed from: a */
    public vsi f49933a;

    /* renamed from: a */
    public final bmd mo28804a() {
        return (bmd) new bmj(getContext()).mo3279a((int) C0126R.xml.car_driving_mode_frx_choose_behavior_item_group);
    }

    /* renamed from: b */
    public final bpeb mo28806b() {
        return bpeb.DRIVING_MODE_FRX_CHOOSE_BEHAVIOR;
    }

    /* renamed from: c */
    public final CharSequence mo28807c() {
        return getString(C0126R.string.car_driving_mode_frx_choose_behavior_header);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        vuk.m41322a();
        vsi f = vuk.m41327f(getContext());
        this.f49933a = f;
        f.mo28795k();
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f49933a.mo28798n();
    }

    public final void onResume() {
        int i;
        super.onResume();
        Log.i("CAR.DRIVINGMODE", "DrivingModeFrxChooseBehaviorFragment#onResume");
        if (!new vqj().mo28745d(getContext())) {
            i = C0126R.string.f7397x52433da;
        } else {
            i = C0126R.string.car_driving_mode_frx_choose_behavior_android_auto_item_summary;
        }
        Item item = (Item) this.f49959h.f5159a.mo3272c();
        if (item != null && !ccrg.m131344d() && item.f7219d) {
            item.f7219d = false;
            item.mo4092c(0);
        }
        item.mo4097a(getString(i));
    }

    /* renamed from: a */
    public final void mo28805a(bmb bmb) {
        int i = ((Item) bmb).f7206a;
        if (i == C0126R.C0129id.android_auto_item) {
            this.f49933a.mo28778a(new vsx(this));
        } else if (i == C0126R.C0129id.do_not_disturb_item) {
            vuk.m41322a();
            if (!vuk.m41325d(getContext()).mo28756a()) {
                mo28822m().mo28866c(new vtc());
            } else {
                this.f49933a.mo28778a(new vsy(this));
            }
        }
    }
}
