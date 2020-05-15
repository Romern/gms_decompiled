package p000;

import android.bluetooth.BluetoothDevice;

/* renamed from: aurr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aurr {

    /* renamed from: a */
    public final bedk f92376a;

    public aurr(BluetoothDevice bluetoothDevice, aurx aurx, bedl bedl) {
        this.f92376a = new bedk(aysl.m84704a(bluetoothDevice), new bedm(aurx.f92391a), bedl);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aurr) {
            return this.f92376a.equals(((aurr) obj).f92376a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f92376a.hashCode();
    }

    public final String toString() {
        return this.f92376a.toString();
    }
}
