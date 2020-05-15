package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Intent;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.felicanetworks.mfc.C0126R;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: autt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class autt extends aupc implements aoa {

    /* renamed from: c */
    private static final aunx f92523c = new aunx("TrustAgent", "BluetoothDeviceSelectionFragment");

    /* renamed from: a */
    public final boolean mo2219a(Preference preference) {
        return false;
    }

    /* renamed from: c */
    public final void mo9322c() {
        mo9318a((int) C0126R.xml.trusted_bluetooth_selection_preferences);
    }

    public final void onResume() {
        super.onResume();
        f92523c.mo50711a("on resume", new Object[0]);
        BluetoothAdapter adapter = ((BluetoothManager) getActivity().getSystemService("bluetooth")).getAdapter();
        if (adapter == null) {
            String string = getString(C0126R.string.f7388xf59a0055);
            ((PreferenceScreen) mo2204a((CharSequence) "auth_trust_agent_trusted_bluetooth_choose_list_key")).mo2025v();
            new Preference(getActivity()).mo1986b((CharSequence) string);
            return;
        }
        Set<BluetoothDevice> bondedDevices = adapter.getBondedDevices();
        String[] stringArray = getActivity().getIntent().getExtras().getStringArray("bluetooth_addresses_to_exclude");
        HashSet hashSet = new HashSet();
        if (stringArray != null) {
            Collections.addAll(hashSet, stringArray);
        }
        PreferenceScreen preferenceScreen = (PreferenceScreen) mo2204a((CharSequence) "auth_trust_agent_trusted_bluetooth_choose_list_key");
        preferenceScreen.mo2025v();
        for (BluetoothDevice bluetoothDevice : bondedDevices) {
            if (!hashSet.contains(bluetoothDevice.getAddress())) {
                Preference preference = new Preference(getActivity());
                preference.f1571A = C0126R.C0128layout.preference_material;
                preference.mo1990c(bluetoothDevice.getAddress());
                preference.f1607w = false;
                preference.mo2018u();
                preference.mo1986b((CharSequence) auuj.m77854a(bluetoothDevice));
                if (aupq.m77579a().f92282h.contains(Integer.valueOf(bluetoothDevice.getBluetoothClass().getMajorDeviceClass()))) {
                    preference.mo1981a(false);
                    preference.mo1994d((int) C0126R.string.auth_trust_agent_dpm_disabled);
                }
                preferenceScreen.mo2019a(preference);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo2233c(Preference preference) {
        Intent intent = new Intent("com.google.android.gms.auth.trustagent.ADD_DEVICE");
        intent.putExtra("bluetooth_device_address", preference.f1603s);
        getActivity().setResult(-1, intent);
        getActivity().finish();
        return false;
    }
}
