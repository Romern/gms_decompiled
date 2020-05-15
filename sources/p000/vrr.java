package p000;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.RemoteException;
import android.support.p002v7.widget.SwitchCompat;
import android.util.Log;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreference;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.drivingmode.MasterSwitchPreference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: vrr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vrr extends dns {

    /* renamed from: c */
    public vrb f49865c;

    /* renamed from: d */
    public vsi f49866d;

    /* renamed from: e */
    public SwitchPreference f49867e;

    /* renamed from: f */
    public SwitchPreference f49868f;

    /* renamed from: g */
    public SwitchPreference f49869g;

    /* renamed from: h */
    public SwitchPreference f49870h;

    /* renamed from: i */
    private vqk f49871i;

    /* renamed from: j */
    private Preference f49872j;

    /* renamed from: k */
    private SwitchPreference f49873k;

    /* renamed from: l */
    private MasterSwitchPreference f49874l;

    /* renamed from: m */
    private final vsh f49875m = new vrq(this);

    /* renamed from: a */
    public final SwitchPreference mo28768a(int i, int i2) {
        SwitchPreference switchPreference = new SwitchPreference(this.f13641a.f1882a);
        switchPreference.mo1990c(getString(i));
        switchPreference.mo1984b(i2);
        switchPreference.mo2016t();
        return switchPreference;
    }

    /* renamed from: c */
    public final void mo9322c() {
        Context context = getContext();
        vuk.m41322a();
        this.f49871i = vuk.m41324c(context);
        vuk.m41322a();
        this.f49865c = vuk.m41326e(context);
        vuk.m41322a();
        vsi f = vuk.m41327f(context);
        this.f49866d = f;
        f.mo28795k();
        mo9318a((int) C0126R.xml.pref_driving_mode_automatic_rules);
        PreferenceScreen a = mo9317a();
        SwitchPreference switchPreference = (SwitchPreference) a.mo2021c((CharSequence) getString(C0126R.string.car_pref_key_activity_recognition_auto_launch_preferences));
        this.f49873k = switchPreference;
        a.mo2020b((Preference) switchPreference);
        if (ccra.m131313e() && cesk.m138180c()) {
            this.f49873k.mo1994d((int) C0126R.string.car_driving_mode_audio_activity_recognition_auto_launch_summary);
        }
        MasterSwitchPreference masterSwitchPreference = (MasterSwitchPreference) mo9317a().mo2021c((CharSequence) getString(C0126R.string.car_pref_key_settings_autolaunch_preference));
        this.f49874l = masterSwitchPreference;
        masterSwitchPreference.f1600p = new vri(this);
        MasterSwitchPreference masterSwitchPreference2 = this.f49874l;
        masterSwitchPreference2.f31236c = new vrj(this);
        SwitchCompat switchCompat = masterSwitchPreference2.f31234a;
        if (switchCompat != null) {
            switchCompat.setOnCheckedChangeListener(masterSwitchPreference2.f31236c);
        }
        this.f49874l.mo1991c(false);
        SwitchPreference switchPreference2 = (SwitchPreference) a.mo2021c((CharSequence) getString(C0126R.string.car_pref_key_settings_add_device_preference));
        this.f49870h = switchPreference2;
        switchPreference2.f1600p = new vrk(this);
        this.f49870h.mo1991c(false);
        Preference c = mo9317a().mo2021c((CharSequence) getString(C0126R.string.car_pref_key_advanced_preferences));
        this.f49872j = c;
        c.f1600p = new vrl(this);
        if (!this.f49871i.mo28748b()) {
            Log.w("CAR.DRIVINGMODE", "Bluetooth not avaiable; remove bluetooth preferences.");
            this.f49865c.mo28758a(bpdi.DRIVING_MODE, bpdh.DRIVING_MODE_NO_BLUETOOTH_PERMISSION);
            a.mo2020b((Preference) this.f49874l);
            a.mo2020b((Preference) this.f49870h);
        }
    }

    /* renamed from: d */
    public final void mo17248d() {
        ArrayList arrayList = new ArrayList();
        if (this.f49866d.mo28792h()) {
            arrayList.add(getActivity().getString(C0126R.string.car_driving_mode_prompt_before_launch_title));
        }
        arrayList.add(getActivity().getString(C0126R.string.car_driving_mode_turn_on_bluetooth_title));
        if (this.f49866d.mo28788d()) {
            arrayList.add(getActivity().getString(C0126R.string.car_driving_mode_pocket_detection_title));
        }
        this.f49872j.mo1966a((CharSequence) bmxr.m108544a(", ").mo66874a((Iterable) arrayList));
        SwitchPreference switchPreference = this.f49867e;
        if (switchPreference != null) {
            switchPreference.mo1981a(true);
            this.f49867e.f1599o = new vrn(this);
            this.f49867e.mo2035i(this.f49866d.mo28793i());
        }
        SwitchPreference switchPreference2 = this.f49868f;
        if (switchPreference2 != null) {
            switchPreference2.mo1981a(true);
            this.f49868f.f1599o = new vro(this);
            this.f49868f.mo2035i(this.f49866d.mo28789e());
        }
        if (this.f49866d.mo28790f()) {
            mo9317a().mo2019a((Preference) this.f49873k);
            this.f49873k.mo1981a(true);
            this.f49873k.f1599o = new vrm(this);
            this.f49873k.mo2035i(this.f49866d.mo28791g());
        }
        if (this.f49871i.mo28748b()) {
            ArrayList a = bnkn.m109661a();
            List c = this.f49871i.mo28749c();
            int size = c.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) c.get(i);
                if (this.f49866d.mo28781a(vqw.m41076a(bluetoothDevice))) {
                    a.add(this.f49871i.mo28746a(bluetoothDevice));
                }
            }
            if (a.isEmpty()) {
                this.f49874l.mo1991c(false);
                this.f49870h.mo1991c(true);
                this.f49870h.mo2035i(false);
            } else {
                this.f49870h.mo1991c(false);
                this.f49874l.mo1991c(true);
                this.f49874l.mo18373i(this.f49866d.mo28787c());
                this.f49874l.mo1966a((CharSequence) bmxr.m108544a(", ").mo66874a((Iterable) a));
            }
            SwitchPreference switchPreference3 = this.f49869g;
            if (switchPreference3 != null) {
                switchPreference3.mo1981a(true);
                this.f49869g.f1599o = new vrp(this);
                SwitchPreference switchPreference4 = this.f49869g;
                try {
                    z = this.f49866d.f49901c.mo28886h();
                } catch (RemoteException e) {
                    Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e);
                }
                switchPreference4.mo2035i(z);
            }
        }
    }

    /* renamed from: e */
    public final vum mo28769e() {
        return ((vul) getActivity()).mo18365a();
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f49866d.mo28798n();
    }

    public final void onPause() {
        super.onPause();
        this.f49866d.mo28778a((vsh) null);
    }

    public final void onResume() {
        Log.i("CAR.DRIVINGMODE", "DrivingModeAutomaticRulesFragment#onResume");
        super.onResume();
        mo28769e().mo28863a((int) C0126R.string.car_driving_mode_automatic_rules_fragment_title);
        this.f49865c.mo28759a(bpeb.DRIVING_MODE, bpea.DRIVING_MODE_AUTOMATIC_RULES_SETTINGS);
        this.f49866d.mo28778a(this.f49875m);
    }
}
