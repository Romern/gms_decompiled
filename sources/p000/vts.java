package p000;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;

/* renamed from: vts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vts extends vsw {

    /* renamed from: a */
    private vsi f49961a;

    /* renamed from: a */
    private final void m41269a() {
        vuk.m41322a();
        vuk.m41329h(getContext()).mo28840c();
        if (mo28823n()) {
            mo28827r();
        } else {
            getActivity().finish();
        }
    }

    /* renamed from: b */
    public final bpeb mo28806b() {
        return bpeb.DRIVING_MODE_FRX_SUCCESS;
    }

    /* renamed from: c */
    public final CharSequence mo28807c() {
        return getString(C0126R.string.car_driving_mode_frx_success_header);
    }

    /* renamed from: d */
    public final void mo28808d() {
        startActivity(Intent.makeMainActivity(vqx.m41081b()));
        m41269a();
    }

    /* renamed from: e */
    public final CharSequence mo28809e() {
        return getString(C0126R.string.common_done);
    }

    /* renamed from: f */
    public final void mo28810f() {
        m41269a();
    }

    /* renamed from: h */
    public final CharSequence mo28817h() {
        return "";
    }

    /* renamed from: i */
    public final int mo28818i() {
        return C0126R.C0127drawable.car_driving_mode_frx_success_aa;
    }

    /* renamed from: j */
    public final CharSequence mo28819j() {
        return getString(C0126R.string.common_settings);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        vuk.m41322a();
        vsi f = vuk.m41327f(getContext());
        this.f49961a = f;
        f.mo28795k();
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f49961a.mo28798n();
    }

    public final void onPause() {
        super.onPause();
        this.f49961a.mo28778a((vsh) null);
    }

    public final void onResume() {
        super.onResume();
        Log.i("CAR.DRIVINGMODE", "DrivingModeFrxSuccessFragment#onResume");
        this.f49961a.mo28778a(new vtr(this));
    }
}
