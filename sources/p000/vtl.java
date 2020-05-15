package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;

/* renamed from: vtl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vtl extends vsw {

    /* renamed from: a */
    public vsi f49953a;

    /* renamed from: b */
    public boolean f49954b;

    /* renamed from: b */
    public final bpeb mo28806b() {
        return bpeb.DRIVING_MODE_FRX_INTRO;
    }

    /* renamed from: f */
    public final void mo28810f() {
        this.f49953a.mo28778a(new vtj(this));
    }

    /* renamed from: h */
    public final CharSequence mo28817h() {
        int i;
        boolean o = mo28824o();
        int i2 = C0126R.string.car_driving_mode_frx_intro_body_generic_trigger;
        if (o) {
            i2 = C0126R.string.car_driving_mode_frx_intro_body_car_dock_trigger;
        } else if (ccra.m131313e() && cesk.m138180c()) {
            i2 = C0126R.string.car_driving_mode_frx_intro_body_audio_enabled_trigger;
        }
        String string = getString(i2);
        if (!mo28824o()) {
            i = !this.f49954b ? C0126R.string.car_driving_mode_frx_intro_body_generic_behavior : C0126R.string.car_driving_mode_frx_intro_body_recommend_aa_behavior;
        } else {
            i = C0126R.string.car_driving_mode_frx_intro_body_car_dock_behavior;
        }
        return m41201b(getString(C0126R.string.car_driving_mode_frx_intro_body_generic_template, string, getString(i)));
    }

    /* renamed from: i */
    public final int mo28818i() {
        return C0126R.C0127drawable.car_driving_mode_frx_intro;
    }

    /* renamed from: k */
    public final CharSequence mo28820k() {
        if (this.f49954b) {
            return getString(C0126R.string.common_more_options);
        }
        return null;
    }

    /* renamed from: l */
    public final void mo28821l() {
        mo28822m().mo28866c(new vsz());
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.i("CAR.DRIVINGMODE", "DrivingModeFrxChooseBehaviorFragment#onCreate");
        vuk.m41322a();
        vsi f = vuk.m41327f(getContext());
        this.f49953a = f;
        f.mo28795k();
        boolean z = false;
        if (ccrg.m131344d()) {
            Context context = getContext();
            vuk.m41322a();
            try {
                if ((context.getPackageManager().getApplicationInfo("com.google.android.projection.gearhead", 128).flags & 129) != 0 && new vqj().mo28745d(getContext())) {
                    z = true;
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        this.f49954b = z;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f49953a.mo28798n();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ CharSequence mo28807c() {
        int i;
        if (!mo28824o()) {
            i = C0126R.string.car_driving_mode_frx_intro_header;
        } else {
            i = C0126R.string.car_driving_mode_frx_intro_turn_on_header;
        }
        return getString(i);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ CharSequence mo28809e() {
        int i;
        if (!mo28824o()) {
            i = C0126R.string.car_driving_mode_frx_intro_next_button_text;
        } else {
            i = C0126R.string.common_turn_on;
        }
        return getString(i);
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ CharSequence mo28819j() {
        return getString(C0126R.string.common_cancel);
    }
}
