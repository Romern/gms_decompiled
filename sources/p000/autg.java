package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.SharedPreferences;
import com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService;

/* renamed from: autg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class autg implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    final /* synthetic */ BluetoothTrustletChimeraService f92482a;

    public autg(BluetoothTrustletChimeraService bluetoothTrustletChimeraService) {
        this.f92482a = bluetoothTrustletChimeraService;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService.a(autr, boolean):void
     arg types: [autr, int]
     candidates:
      com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService.a(java.lang.String, org.json.JSONObject):void
      com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService.a(boolean, autr):void
      auou.a(java.lang.String, java.lang.String):void
      auou.a(java.lang.String, org.json.JSONObject):void
      auou.a(boolean, boolean):void
      com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService.a(autr, boolean):void */
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (!str.startsWith("auth_trust_agent_pref_bluetooth_device_needs_security_approval_key_")) {
            String a = auuj.m77855a(str);
            BluetoothTrustletChimeraService.f109169a.mo50711a("%s is added to shared pref", a);
            if (a == null) {
                return;
            }
            if (!this.f92482a.f109172d.contains(str) || !this.f92482a.f109172d.getBoolean(str, false)) {
                autr autr = (autr) this.f92482a.f109171c.get(a);
                this.f92482a.mo59563c(a);
                if (autr != null) {
                    this.f92482a.mo59561b("remove_a_bluetooth_device_from_trusted_devices", aumv.m77340a("trustlet_id", autr.f92510c.getAddress(), "trustlet_source", autr.f92509b));
                    return;
                }
                return;
            }
            BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(a);
            BluetoothTrustletChimeraService bluetoothTrustletChimeraService = this.f92482a;
            bluetoothTrustletChimeraService.mo59558a(autr.m77810a(remoteDevice, bluetoothTrustletChimeraService.f109173h), true);
            return;
        }
        String str2 = null;
        if (str != null && str.startsWith("auth_trust_agent_pref_bluetooth_device_needs_security_approval_key_")) {
            str2 = str.substring(67);
        }
        String b = auuj.m77858b(str2);
        if (str2 != null && this.f92482a.f109172d.contains(b)) {
            BluetoothDevice remoteDevice2 = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str2);
            BluetoothTrustletChimeraService bluetoothTrustletChimeraService2 = this.f92482a;
            bluetoothTrustletChimeraService2.mo59558a(autr.m77810a(remoteDevice2, bluetoothTrustletChimeraService2.f109173h), true);
        }
    }
}
