package com.google.android.gms.drivingmode.autolaunch;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AutoLaunchServiceImpl extends Service {

    /* renamed from: a */
    public vrh f31242a;

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        vrh vrh = new vrh(this);
        this.f31242a = vrh;
        vrh.f49852g = new vuy(this);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null && ccra.m131312d()) {
            vrh vrh = this.f31242a;
            String action = intent.getAction();
            if ("com.google.android.gms.carsetup.drivingmode.ACTIVITY_TRANSITION_START".equals(action) || "com.google.android.gms.carsetup.drivingmode.ACTIVITY_TRANSITION_END".equals(action) || "com.google.android.gms.carsetup.drivingmode.LAUNCH_NOTIFICATION_ACCEPT".equals(action) || "com.google.android.gms.carsetup.drivingmode.LAUNCH_NOTIFICATION_TIMEOUT".equals(action) || "com.google.android.gms.carsetup.drivingmode.LAUNCH_NOTIFICATION_CANCEL".equals(action)) {
                String valueOf = String.valueOf(intent);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                sb.append("DrivingModeAutoLaunch received intent: ");
                sb.append(valueOf);
                Log.i("CAR.DRIVINGMODE", sb.toString());
                vrh.f49850e = true;
                vrh.f49849d.mo28778a(new vrf(vrh, action));
                vrh.f49849d.mo28795k();
            } else {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (bluetoothDevice == null) {
                    String valueOf2 = String.valueOf(intent);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 11);
                    sb2.append("No device: ");
                    sb2.append(valueOf2);
                    Log.i("CAR.DRIVINGMODE", sb2.toString());
                } else {
                    boolean booleanExtra = intent.getBooleanExtra("car_startup.HAS_WIFI", true);
                    if ((!ccul.f179984a.mo6606a().mo76839d() || bluetoothDevice.getBondState() != 10) && ("android.bluetooth.device.action.ACL_CONNECTED".equals(action) || "android.bluetooth.device.action.ACL_DISCONNECTED".equals(action))) {
                        vrh.f49850e = true;
                        vrh.f49849d.mo28778a(new vrg(vrh, action, bluetoothDevice, booleanExtra));
                        vrh.f49849d.mo28795k();
                    }
                }
            }
            return 1;
        }
        return 2;
    }
}
