package com.google.android.gms.nearby.bootstrap;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.text.TextUtils;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BluetoothScanner$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ ahci f80395a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluetoothScanner$1(ahci ahci, String str) {
        super(str);
        this.f80395a = ahci;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        char charAt;
        String action = intent.getAction();
        if ("android.bluetooth.device.action.FOUND".equals(action) || "android.bluetooth.device.action.NAME_CHANGED".equals(action)) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            String stringExtra = intent.getStringExtra("android.bluetooth.device.extra.NAME");
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = bluetoothDevice.getName();
            }
            if (!TextUtils.isEmpty(stringExtra)) {
                try {
                    int indexOf = stringExtra.indexOf("[");
                    int indexOf2 = stringExtra.indexOf("]");
                    if (indexOf == 0 && indexOf2 > 0 && (charAt = stringExtra.charAt(indexOf2 + 1)) <= '4' && charAt >= '0') {
                        String address = bluetoothDevice.getAddress();
                        Device device = new Device(ahcj.m55462a(stringExtra), ahcj.m55465b(stringExtra), address, ahcj.m55466c(stringExtra));
                        ahci ahci = this.f80395a;
                        bnsp bnsp = ahci.f66985a;
                        ahci.f66987c.put(address, bluetoothDevice);
                        if (this.f80395a.mo36295b()) {
                            ahci ahci2 = this.f80395a;
                            ahci2.f66989e.mo72972a(6, ahci2);
                            this.f80395a.f66986b.mo36362a(device);
                        }
                    }
                } catch (RemoteException | NullPointerException e) {
                    bnsl bnsl = (bnsl) ahci.f66985a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("com.google.android.gms.nearby.bootstrap.BluetoothScanner$1", "a", 131, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("BluetoothScanner: Fail to send scan result to listener.");
                }
            }
        } else if ("android.bluetooth.adapter.action.DISCOVERY_FINISHED".equals(action)) {
            this.f80395a.mo36286a();
        }
    }
}
