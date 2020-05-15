package p000;

import android.bluetooth.BluetoothDevice;
import android.os.Bundle;

/* renamed from: aulm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aulm implements ause {

    /* renamed from: a */
    final /* synthetic */ auln f92040a;

    public aulm(auln auln) {
        this.f92040a = auln;
    }

    /* renamed from: a */
    public final void mo50658a(BluetoothDevice bluetoothDevice, String str) {
        auln.f92041a.mo50711a("failed to provision device %s; reason: %s", bluetoothDevice.getName(), str).mo50706a();
        this.f92040a.f92042d = null;
    }

    /* renamed from: a */
    public final void mo50659a(BluetoothDevice bluetoothDevice, String str, aury aury, bedt bedt) {
        this.f92040a.f92042d = new Bundle();
        this.f92040a.f92042d.putBoolean("trustagent.AddBluetoothDeviceOperation.eid_support", true);
        this.f92040a.f92042d.putParcelable("trustagent.AddBluetoothDeviceOperation.bluetooth_device", bluetoothDevice);
        this.f92040a.f92042d.putString("trustagent.addbluetoothdeviceoperation.eik_key", str);
        this.f92040a.f92042d.putBoolean("trustagent.addbluetoothdeviceoperation.on_body", aury.f92392a);
        this.f92040a.f92042d.putBoolean("trustagent.addbluetoothdeviceoperation.user_auth", aury.f92393b);
        beds beds = bedt.f106988b;
        bedn bedn = beds.f106985d;
        this.f92040a.f92042d.putLong("trustagent.addbluetoothdeviceoperation.initial_counter", bedn.f106978a);
        this.f92040a.f92042d.putBoolean("trustagent.addbluetoothdeviceoperation.initial_onbody_state", bedn.f106979b);
        this.f92040a.f92042d.putBoolean("trustagent.addbluetoothdeviceoperation.initial_userauth_state", bedn.f106980c);
        this.f92040a.f92042d.putLong("trustagent.addbluetoothdeviceoperation.initial_timestamp", beds.f106986e);
        this.f92040a.f92042d.putLong("trustagent.addbluetoothdeviceoperation.system_time", bedt.f106987a);
    }
}
