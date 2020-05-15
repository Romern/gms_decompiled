package p000;

import android.bluetooth.BluetoothDevice;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.SwitchPreference;
import com.felicanetworks.mfc.C0126R;
import java.util.List;

/* renamed from: vrx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vrx extends vsh {

    /* renamed from: a */
    final /* synthetic */ vry f49887a;

    public vrx(vry vry) {
        this.f49887a = vry;
    }

    /* renamed from: a */
    public final void mo28762a() {
        vry vry = this.f49887a;
        if (vry.f49890e.mo28747a()) {
            vry.f49891f.mo2025v();
            List c = vry.f49890e.mo28749c();
            if (c.isEmpty()) {
                PreferenceCategory preferenceCategory = vry.f49891f;
                Preference preference = new Preference(vry.getActivity());
                preference.mo1984b((int) C0126R.string.car_driving_mode_bluetooth_auto_launch_no_device_title);
                preference.mo1981a(false);
                preference.f1607w = false;
                preference.mo2016t();
                preferenceCategory.mo2019a(preference);
            } else {
                int size = c.size();
                for (int i = 0; i < size; i++) {
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) c.get(i);
                    PreferenceCategory preferenceCategory2 = vry.f49891f;
                    String a = vqw.m41076a(bluetoothDevice);
                    SwitchPreference switchPreference = new SwitchPreference(vry.getContext());
                    switchPreference.mo2035i(vry.f49889d.mo28781a(a));
                    switchPreference.mo1986b((CharSequence) vry.f49890e.mo28746a(bluetoothDevice));
                    switchPreference.mo1976a(C1133kh.m17836a(vry.getContext(), (int) C0126R.C0127drawable.quantum_ic_bluetooth_grey600_24));
                    switchPreference.f1607w = true;
                    switchPreference.f1600p = new vrw(vry, a, switchPreference);
                    preferenceCategory2.mo2019a((Preference) switchPreference);
                }
            }
        }
        this.f49887a.mo28773a(false);
    }
}
