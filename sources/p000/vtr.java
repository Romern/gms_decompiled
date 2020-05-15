package p000;

import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: vtr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vtr extends vsh {

    /* renamed from: a */
    final /* synthetic */ vts f49960a;

    public vtr(vts vts) {
        this.f49960a = vts;
    }

    /* renamed from: a */
    public final void mo28762a() {
        int i;
        vts vts = this.f49960a;
        if (!vts.mo28824o()) {
            i = C0126R.string.car_driving_mode_frx_success_body_generic_trigger;
        } else {
            i = C0126R.string.car_driving_mode_frx_success_body_car_dock_trigger;
        }
        ((TextView) vts.getView().findViewById(C0126R.C0129id.body)).setText(vts.m41201b(vts.getString(C0126R.string.car_driving_mode_frx_success_body, vts.mo28814a(i), vts.mo28814a((int) C0126R.string.car_driving_mode_frx_success_body_generic))));
    }
}
