package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;

/* renamed from: busv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class busv implements busx {

    /* renamed from: a */
    final /* synthetic */ int f154824a;

    /* renamed from: b */
    final /* synthetic */ bqgy f154825b;

    public busv(int i, bqgy bqgy) {
        this.f154824a = i;
        this.f154825b = bqgy;
    }

    /* renamed from: a */
    public final void mo37228a() {
    }

    /* renamed from: a */
    public final void mo37229a(int i, int i2, int i3, BluetoothDevice bluetoothDevice) {
    }

    /* renamed from: a */
    public final void mo37230a(int i, BluetoothProfile bluetoothProfile) {
        if (i == this.f154824a && bluetoothProfile != null) {
            this.f154825b.mo69138b(bluetoothProfile.getConnectedDevices());
        }
    }
}
