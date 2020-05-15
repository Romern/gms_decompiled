package p000;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;

/* renamed from: xgm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xgm {

    /* renamed from: a */
    public final SharedPreferences f52212a;

    /* renamed from: b */
    public final Object f52213b = new Object();

    public xgm(Context context) {
        this.f52212a = context.getSharedPreferences("com.google.android.gms.fido.BluetoothDeviceStore", 0);
    }

    /* renamed from: a */
    public final void mo29736a(BluetoothDevice bluetoothDevice) {
        synchronized (this.f52213b) {
            Set<String> stringSet = this.f52212a.getStringSet("known_u2f_devices", new HashSet());
            stringSet.add(bluetoothDevice.getAddress());
            this.f52212a.edit().putStringSet("known_u2f_devices", stringSet).commit();
        }
    }
}
