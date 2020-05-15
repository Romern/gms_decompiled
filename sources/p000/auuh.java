package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.preference.Preference;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.trustagent.trustlet.device.p073ui.TrustedDeviceSelectionFragment$1;

/* renamed from: auuh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auuh extends aupc implements aoa {

    /* renamed from: c */
    private Preference f92540c;

    /* renamed from: d */
    private BroadcastReceiver f92541d;

    /* renamed from: a */
    public final void mo50932a(boolean z, String str) {
        this.f92540c.mo1981a(z);
        this.f92540c.mo1966a((CharSequence) str);
    }

    /* renamed from: a */
    public final boolean mo2219a(Preference preference) {
        return false;
    }

    /* renamed from: c */
    public final void mo9322c() {
        mo9318a((int) C0126R.xml.trusted_device_selection_preferences);
        this.f92540c = mo2204a((CharSequence) "auth_trust_agent_pref_trusted_devices_select_bluetooth_key");
        if (!aupq.m77579a().f92275a) {
            mo50932a(false, getString(C0126R.string.auth_trust_agent_dpm_disabled));
        }
        String string = getString(C0126R.string.f7388xf59a0055);
        if (!getActivity().getIntent().getExtras().getBoolean("bluetooth_is_enabled_for_security", true)) {
            this.f92540c.mo2018u();
            this.f92540c.mo1981a(false);
            this.f92540c.mo1966a((CharSequence) getString(C0126R.string.common_disabled));
        }
        if (this.f92540c.mo2005i() && BluetoothAdapter.getDefaultAdapter().getState() != 12) {
            mo50932a(false, string);
        }
        this.f92541d = new TrustedDeviceSelectionFragment$1(this, "trustagent", string);
        getActivity().registerReceiver(this.f92541d, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
    }

    public final void onDestroy() {
        super.onDestroy();
        getActivity().unregisterReceiver(this.f92541d);
        this.f92541d = null;
    }

    /* renamed from: c */
    public final boolean mo2233c(Preference preference) {
        if (!"auth_trust_agent_pref_trusted_devices_select_bluetooth_key".equals(preference.f1603s)) {
            return false;
        }
        Intent intent = new Intent();
        intent.setClassName(getActivity(), "com.google.android.gms.trustagent.BluetoothDeviceSelectionActivity");
        intent.putExtra("bluetooth_addresses_to_exclude", getActivity().getIntent().getExtras().getStringArray("bluetooth_addresses_to_exclude"));
        getActivity().startActivityForResult(intent, 1002);
        return false;
    }
}
