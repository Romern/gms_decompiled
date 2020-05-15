package p000;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.util.Log;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import com.felicanetworks.mfc.C0126R;
import java.util.List;

/* renamed from: vry */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vry extends dns {

    /* renamed from: c */
    public vrb f49888c;

    /* renamed from: d */
    public vsi f49889d;

    /* renamed from: e */
    public vqk f49890e;

    /* renamed from: f */
    public PreferenceCategory f49891f;

    /* renamed from: g */
    private final vsh f49892g = new vrx(this);

    /* renamed from: a */
    public final void mo28773a(boolean z) {
        if (!z) {
            List c = this.f49890e.mo28749c();
            int size = c.size();
            int i = 0;
            while (i < size) {
                String a = vqw.m41076a((BluetoothDevice) c.get(i));
                i++;
                if (this.f49889d.mo28781a(a)) {
                    this.f49889d.mo28783b(true);
                    return;
                }
            }
            this.f49889d.mo28783b(false);
            return;
        }
        this.f49889d.mo28783b(true);
    }

    /* renamed from: c */
    public final void mo9322c() {
        Context context = getContext();
        vuk.m41322a();
        this.f49890e = vuk.m41324c(context);
        vuk.m41322a();
        this.f49888c = vuk.m41326e(context);
        vuk.m41322a();
        vsi f = vuk.m41327f(context);
        this.f49889d = f;
        f.mo28795k();
        mo9318a((int) C0126R.xml.pref_driving_mode_bluetooth_autolaunch);
        PreferenceScreen a = mo9317a();
        this.f49891f = (PreferenceCategory) mo9317a().mo2021c((CharSequence) getString(C0126R.string.car_pref_key_driving_mode_bluetooth_auto_launch_category));
        if (!this.f49890e.mo28747a()) {
            Log.w("CAR.DRIVINGMODE", "Bluetooth permission is missing; remove bluetooth preferences.");
            this.f49888c.mo28758a(bpdi.DRIVING_MODE, bpdh.DRIVING_MODE_NO_BLUETOOTH_PERMISSION);
            a.mo2020b((Preference) this.f49891f);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f49889d.mo28798n();
    }

    public final void onPause() {
        super.onPause();
        this.f49889d.mo28778a((vsh) null);
    }

    public final void onResume() {
        super.onResume();
        Log.i("CAR.DRIVINGMODE", "DrivingModeBluetoothAutolaunchFragment#onResume");
        ((vul) getActivity()).mo18365a().mo28863a((int) C0126R.string.car_driving_mode_automatic_rules_preferences_title);
        this.f49888c.mo28759a(bpeb.DRIVING_MODE, bpea.DRIVING_MODE_BLUETOOTH_AUTOLAUNCH_SETTINGS);
        this.f49889d.mo28778a(this.f49892g);
    }
}
