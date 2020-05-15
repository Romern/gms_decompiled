package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import java.util.HashSet;
import java.util.Set;

/* renamed from: bgja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgja {

    /* renamed from: a */
    public final BluetoothAdapter f116582a;

    public bgja(BluetoothAdapter bluetoothAdapter) {
        bmxy.m108581a(bluetoothAdapter);
        this.f116582a = bluetoothAdapter;
    }

    /* renamed from: a */
    public final Set mo62877a() {
        Set<BluetoothDevice> bondedDevices = this.f116582a.getBondedDevices();
        if (bondedDevices == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (BluetoothDevice bluetoothDevice : bondedDevices) {
            bgma a = bgkx.f116729g.mo62943a(bluetoothDevice);
            if (a != null) {
                hashSet.add(a);
            }
        }
        return hashSet;
    }
}
