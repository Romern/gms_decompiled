package p000;

import android.bluetooth.BluetoothAdapter;

/* renamed from: aysk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aysk {

    /* renamed from: a */
    public final BluetoothAdapter f98418a;

    private aysk(BluetoothAdapter bluetoothAdapter) {
        this.f98418a = bluetoothAdapter;
    }

    /* renamed from: a */
    public static aysk m84700a(BluetoothAdapter bluetoothAdapter) {
        if (bluetoothAdapter != null) {
            return new aysk(bluetoothAdapter);
        }
        return null;
    }

    /* renamed from: b */
    public static aysk m84701b() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            return new aysk(defaultAdapter);
        }
        return null;
    }

    /* renamed from: a */
    public final aysl mo54347a(String str) {
        return aysl.m84704a(this.f98418a.getRemoteDevice(str));
    }

    /* renamed from: a */
    public final boolean mo54348a() {
        return this.f98418a.isEnabled();
    }
}
