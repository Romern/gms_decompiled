package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import java.util.UUID;

/* renamed from: buwf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buwf {

    /* renamed from: a */
    public final UUID f155138a;

    /* renamed from: b */
    private final BluetoothAdapter f155139b;

    /* renamed from: c */
    private final String f155140c;

    public buwf(BluetoothAdapter bluetoothAdapter, String str, UUID uuid) {
        sdo.m34959a(bluetoothAdapter);
        this.f155139b = bluetoothAdapter;
        sdo.m34959a((Object) str);
        this.f155140c = str;
        sdo.m34959a(uuid);
        this.f155138a = uuid;
    }

    /* renamed from: a */
    public final BluetoothDevice mo73171a() {
        return this.f155139b.getRemoteDevice(this.f155140c);
    }
}
