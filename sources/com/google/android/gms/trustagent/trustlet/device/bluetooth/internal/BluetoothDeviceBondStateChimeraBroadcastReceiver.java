package com.google.android.gms.trustagent.trustlet.device.bluetooth.internal;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BluetoothDeviceBondStateChimeraBroadcastReceiver extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", -1);
        if (bluetoothDevice != null && intExtra == 10) {
            SharedPreferences.Editor edit = aupo.m77578a(this).edit();
            edit.remove(auuj.m77863d(bluetoothDevice));
            edit.remove(auuj.m77865e(bluetoothDevice));
            edit.commit();
        }
    }
}
