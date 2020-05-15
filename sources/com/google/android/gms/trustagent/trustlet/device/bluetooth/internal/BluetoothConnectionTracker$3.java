package com.google.android.gms.trustagent.trustlet.device.bluetooth.internal;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BluetoothConnectionTracker$3 extends aacn {

    /* renamed from: a */
    final /* synthetic */ ausz f109166a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluetoothConnectionTracker$3(ausz ausz, String str) {
        super(str);
        this.f109166a = ausz;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
            if (intExtra == 12) {
                aunw a = ausz.f92459a.mo50711a("Bluetooth adapter on", new Object[0]);
                a.mo50708c();
                a.mo50707b();
                this.f109166a.f92460b.mo50852a(true);
            } else if (intExtra == 10) {
                aunw a2 = ausz.f92459a.mo50711a("Bluetooth adapter off, revoking trust", new Object[0]);
                a2.mo50708c();
                a2.mo50707b();
                this.f109166a.f92460b.mo50852a(false);
            }
        } else if ("android.bluetooth.device.action.ACL_CONNECTED".equals(action)) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            ausz ausz = this.f109166a;
            aunx aunx = ausz.f92459a;
            ausz.f92460b.mo50851a(bluetoothDevice.getAddress());
            if (this.f109166a.f92460b.mo50853b(bluetoothDevice)) {
                ausz ausz2 = this.f109166a;
                if (ausz2.f92461c != null) {
                    ausz2.f92462d.mo50889a(bluetoothDevice.getAddress());
                }
            }
            this.f109166a.f92463e.mo50892b(bluetoothDevice.getAddress());
            aunw a3 = ausz.f92459a.mo50711a("Bluetooth connect broadast for %s %s", bluetoothDevice.getName(), bluetoothDevice.getAddress());
            a3.mo50708c();
            a3.mo50707b();
        } else if ("android.bluetooth.device.action.ACL_DISCONNECTED".equals(action)) {
            BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            aunw a4 = ausz.f92459a.mo50711a("Bluetooth disconnect broadast for %s %s", bluetoothDevice2.getName(), bluetoothDevice2.getAddress());
            a4.mo50708c();
            a4.mo50707b();
            if (this.f109166a.f92460b.mo50853b(bluetoothDevice2)) {
                this.f109166a.f92463e.mo50889a(bluetoothDevice2.getAddress());
            }
            this.f109166a.f92462d.mo50892b(bluetoothDevice2.getAddress());
            this.f109166a.f92460b.mo50851a(bluetoothDevice2.getAddress());
        } else if ("android.bluetooth.device.action.BOND_STATE_CHANGED".equals(action)) {
            ausz ausz3 = this.f109166a;
            aunx aunx2 = ausz.f92459a;
            ausz3.f92460b.mo50850a((BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE"));
        }
    }
}
