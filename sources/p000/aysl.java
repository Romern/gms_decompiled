package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.content.Context;

/* renamed from: aysl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aysl {

    /* renamed from: a */
    public final BluetoothDevice f98419a;

    private aysl(BluetoothDevice bluetoothDevice) {
        this.f98419a = bluetoothDevice;
    }

    /* renamed from: a */
    public static aysl m84704a(BluetoothDevice bluetoothDevice) {
        return new aysl(bluetoothDevice);
    }

    /* renamed from: b */
    public final String mo54351b() {
        return this.f98419a.getAddress();
    }

    /* renamed from: c */
    public final int mo54352c() {
        return this.f98419a.getType();
    }

    /* renamed from: d */
    public final String mo54353d() {
        return this.f98419a.getName();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aysl) {
            return this.f98419a.equals(((aysl) obj).f98419a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f98419a.hashCode();
    }

    public final String toString() {
        return this.f98419a.toString();
    }

    /* renamed from: a */
    public final int mo54349a() {
        return this.f98419a.getBondState();
    }

    /* renamed from: a */
    public final aysm mo54350a(Context context, boolean z, ayso ayso) {
        BluetoothGatt connectGatt = this.f98419a.connectGatt(context, z, ayso.f98422b, 2);
        if (connectGatt != null) {
            return aysm.m84710a(connectGatt);
        }
        return null;
    }
}
