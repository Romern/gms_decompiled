package p000;

import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;

/* renamed from: gdj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gdj implements BluetoothProfile.ServiceListener {

    /* renamed from: a */
    final /* synthetic */ gdk f17955a;

    public gdj(gdk gdk) {
        this.f17955a = gdk;
    }

    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        if (i == 1) {
            synchronized (this.f17955a.f17958c) {
                this.f17955a.f17957b = (BluetoothHeadset) bluetoothProfile;
            }
        }
    }

    public final void onServiceDisconnected(int i) {
        if (i == 1) {
            synchronized (this.f17955a.f17958c) {
                this.f17955a.f17957b = null;
            }
        }
    }
}
