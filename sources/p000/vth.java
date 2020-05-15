package p000;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;

/* renamed from: vth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vth extends vsw {

    /* renamed from: a */
    private boolean f49950a;

    /* renamed from: b */
    public final bpeb mo28806b() {
        return bpeb.DRIVING_MODE_FRX_GEARHEAD_SETUP;
    }

    /* renamed from: c */
    public final CharSequence mo28807c() {
        return getString(C0126R.string.car_driving_mode_frx_loading_screen_header);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        StringBuilder sb = new StringBuilder(85);
        sb.append("DrivingModeFrxGearheadSetupFragment#onActivityResult: ");
        sb.append(i);
        sb.append(" rescode:");
        sb.append(i2);
        Log.i("CAR.DRIVINGMODE", sb.toString());
        if (i == 1) {
            this.f49950a = true;
            if (i2 == -1) {
                mo28816a("com.google.android.projection.gearhead");
            } else {
                getActivity().finish();
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.car_driving_mode_frx_progress, viewGroup, false);
        mo28815a(inflate);
        return inflate;
    }

    public final void onResume() {
        super.onResume();
        if (this.f49950a) {
            mo28816a("com.google.android.projection.gearhead");
            return;
        }
        vuk.m41322a();
        vtm h = vuk.m41329h(getContext());
        if ((getArguments() == null || !getArguments().getBoolean("DrivingModeFrxGearheadSetupFragment.force_launch", false)) && h.mo28839b()) {
            mo28816a("com.google.android.projection.gearhead");
            return;
        }
        vuk.m41322a();
        vuk.m41326e(getContext()).mo28759a(bpeb.DRIVING_MODE_FRX_GEARHEAD_SETUP, bpea.DRIVING_MODE_FRX_LAUNCHES_GEARHEAD_FRX);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.frx.SetupActivity"));
        intent.setAction("frx_vanagon_start");
        intent.addCategory("com.google.android.gms.car.drivingMode.category.DEFAULT");
        startActivityForResult(intent, 1);
    }
}
