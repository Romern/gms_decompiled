package p000;

import android.bluetooth.BluetoothAdapter;

/* renamed from: rrs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rrs {

    /* renamed from: a */
    private final BluetoothAdapter f43559a;

    public rrs(BluetoothAdapter bluetoothAdapter) {
        sdo.m34959a(bluetoothAdapter);
        this.f43559a = bluetoothAdapter;
    }

    /* renamed from: a */
    public static rrs m34317a() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            return new rrs(defaultAdapter);
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo25052b() {
        return this.f43559a.isEnabled();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass().equals(obj.getClass()) && this.f43559a.equals(((rrs) obj).f43559a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f43559a.hashCode();
    }
}
