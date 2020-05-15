package p000;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.drivingmode.DrivingModeFrxDndAccessRequestFragment$1;

/* renamed from: vtc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vtc extends vsw {

    /* renamed from: a */
    public vsi f49936a;

    /* renamed from: b */
    public vqy f49937b;

    /* renamed from: c */
    private BroadcastReceiver f49938c;

    /* renamed from: a */
    public final void mo28828a() {
        if (this.f49938c != null) {
            getContext().getApplicationContext().unregisterReceiver(this.f49938c);
            this.f49938c = null;
        }
    }

    /* renamed from: b */
    public final bpeb mo28806b() {
        return bpeb.DRIVING_MODE_FRX_DND_ACCESS_REQUEST;
    }

    /* renamed from: c */
    public final CharSequence mo28807c() {
        return getString(C0126R.string.car_driving_mode_frx_dnd_access_request_header);
    }

    /* renamed from: e */
    public final CharSequence mo28809e() {
        return getString(C0126R.string.common_continue);
    }

    /* renamed from: f */
    public final void mo28810f() {
        if (this.f49937b.mo28756a()) {
            mo28829g();
        } else {
            startActivity(new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"));
        }
    }

    /* renamed from: g */
    public final void mo28829g() {
        mo28816a("car_pref_key_driving_mode_behavior_dnd_preference");
    }

    /* renamed from: h */
    public final CharSequence mo28817h() {
        return mo28814a((int) C0126R.string.car_driving_mode_frx_dnd_access_request_body);
    }

    /* renamed from: i */
    public final int mo28818i() {
        return C0126R.C0127drawable.car_driving_mode_frx_dnd_request;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        vuk.m41322a();
        this.f49937b = vuk.m41325d(getContext());
        vuk.m41322a();
        vsi f = vuk.m41327f(getContext());
        this.f49936a = f;
        f.mo28795k();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.app.action.NOTIFICATION_POLICY_CHANGED");
        this.f49938c = new DrivingModeFrxDndAccessRequestFragment$1(this, "car_setup");
        getContext().getApplicationContext().registerReceiver(this.f49938c, intentFilter);
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f49936a.mo28798n();
        mo28828a();
    }

    public final void onPause() {
        super.onPause();
        this.f49936a.mo28778a((vsh) null);
    }

    public final void onResume() {
        super.onResume();
        Log.i("CAR.DRIVINGMODE", "DrivingModeFrxDndAccessRequestFragment#onResume");
        this.f49936a.mo28778a(new vta(this));
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ CharSequence mo28819j() {
        return getString(C0126R.string.common_cancel);
    }
}
