package p000;

import android.bluetooth.BluetoothDevice;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;

/* renamed from: vrg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vrg extends vsh {

    /* renamed from: a */
    final /* synthetic */ String f49842a;

    /* renamed from: b */
    final /* synthetic */ BluetoothDevice f49843b;

    /* renamed from: c */
    final /* synthetic */ boolean f49844c;

    /* renamed from: d */
    final /* synthetic */ vrh f49845d;

    public vrg(vrh vrh, String str, BluetoothDevice bluetoothDevice, boolean z) {
        this.f49845d = vrh;
        this.f49842a = str;
        this.f49843b = bluetoothDevice;
        this.f49844c = z;
    }

    /* renamed from: a */
    public final void mo28762a() {
        vrh vrh = this.f49845d;
        String str = this.f49842a;
        BluetoothDevice bluetoothDevice = this.f49843b;
        boolean z = this.f49844c;
        if (!"android.bluetooth.device.action.ACL_CONNECTED".equals(str)) {
            if ("android.bluetooth.device.action.ACL_DISCONNECTED".equals(str) && vrh.f49849d.mo28787c() && vrh.f49849d.mo28781a(vqw.m41076a(bluetoothDevice))) {
                String valueOf = String.valueOf(bluetoothDevice.getName());
                Log.i("CAR.DRIVINGMODE", valueOf.length() == 0 ? new String("Driving mode stopped by device: ") : "Driving mode stopped by device: ".concat(valueOf));
                vrh.f49848c.mo28758a(bpdi.DRIVING_MODE, bpdh.DRIVING_MODE_AUTOLAUNCH_BLUETOOTH_DISCONNECTED);
                if (!vrh.f49849d.mo28784b()) {
                    vrh.mo28765b();
                } else if (!vrh.f49849d.mo28785b(vuu.BLUETOOTH)) {
                    vrh.f49848c.mo28758a(bpdi.DRIVING_MODE, bpdh.DRIVING_MODE_AUTOLAUNCH_BLUETOOTH_DISCONNECT_IGNORED);
                }
                vrh.mo28763a();
            }
        } else if (vrh.f49849d.mo28787c() && vrh.f49849d.mo28781a(vqw.m41076a(bluetoothDevice))) {
            vrh.f49848c.mo28758a(bpdi.DRIVING_MODE, bpdh.DRIVING_MODE_AUTOLAUNCH_BLUETOOTH_CONNECTED);
            if (z) {
                vrs a = vrh.f49849d.mo28775a();
                if (a.mo28743c() == 2) {
                    ComponentName b = a.mo28741b(vrh.f49846a);
                    if (b == null) {
                        Log.w("CAR.DRIVINGMODE", "Invalid component name, dropping request to send intent.");
                        vrh.f49848c.mo28758a(bpdi.DRIVING_MODE, bpdh.DRIVING_MODE_CANNOT_RESOLVE_APP_LAUNCH_INTENT);
                        return;
                    }
                    vrh.f49846a.startActivity(new Intent("android.intent.action.MAIN").addCategory("com.google.android.gms.car.drivingMode.category.DEFAULT").setComponent(b).putExtra("com.google.android.gms.car.drivingMode", "BLUETOOTH_CONNECTED").putExtra("android.bluetooth.device.extra.DEVICE", bluetoothDevice).addFlags(268435456));
                    vrh.f49848c.mo28758a(bpdi.DRIVING_MODE, bpdh.DRIVING_MODE_AUTOLAUNCH_BLUETOOTH_CONNECTED_WIRELESS);
                }
            }
            String valueOf2 = String.valueOf(bluetoothDevice.getName());
            Log.i("CAR.DRIVINGMODE", valueOf2.length() == 0 ? new String("Auto-launch started by device: ") : "Auto-launch started by device: ".concat(valueOf2));
            vrh.mo28764a(vuu.BLUETOOTH);
        }
    }
}
