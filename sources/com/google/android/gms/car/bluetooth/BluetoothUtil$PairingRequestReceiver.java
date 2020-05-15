package com.google.android.gms.car.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.car.compat.TracingBroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BluetoothUtil$PairingRequestReceiver extends TracingBroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ nyr f29471a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluetoothUtil$PairingRequestReceiver(nyr nyr) {
        super("car");
        this.f29471a = nyr;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        bnsn bnsn = nyr.f36964a;
        intent.getAction();
        if (this.f29471a.f36977n != 0) {
            return;
        }
        if (!"android.bluetooth.device.action.PAIRING_REQUEST".equals(intent.getAction())) {
            bnsi b = nyr.f36964a.mo68387b();
            b.mo68432a("com.google.android.gms.car.bluetooth.BluetoothUtil$PairingRequestReceiver", "a", 651, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("PairingRequestReceiver: Wrong intent. This shouldn't happen");
            return;
        }
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (!this.f29471a.mo21858a(bluetoothDevice)) {
            bnsi b2 = nyr.f36964a.mo68387b();
            b2.mo68432a("com.google.android.gms.car.bluetooth.BluetoothUtil$PairingRequestReceiver", "a", 657, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b2.mo68420a("Wrong device is being paired: %s", bluetoothDevice);
            return;
        }
        int intExtra = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_VARIANT", Integer.MIN_VALUE);
        if (intExtra == Integer.MIN_VALUE) {
            bnsi b3 = nyr.f36964a.mo68387b();
            b3.mo68432a("com.google.android.gms.car.bluetooth.BluetoothUtil$PairingRequestReceiver", "a", 665, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b3.mo68405a("Wrong Bluetooth pairing method");
            return;
        }
        int intExtra2 = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_KEY", Integer.MIN_VALUE);
        nyr nyr = this.f29471a;
        nyr.f36979p = intExtra;
        nyr.f36980q = intExtra2;
        nuu.m27792a(new nyq(nyr));
        abortBroadcast();
    }
}
