package p000;

import android.bluetooth.BluetoothDevice;

/* renamed from: ahvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahvz extends buqn {

    /* renamed from: a */
    final /* synthetic */ BluetoothDevice f68199a;

    /* renamed from: b */
    final /* synthetic */ ahwb f68200b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahvz(ahwb ahwb, String str, BluetoothDevice bluetoothDevice) {
        super(str);
        this.f68200b = ahwb;
        this.f68199a = bluetoothDevice;
    }

    public final void run() {
        this.f68200b.mo37217a(this.f68199a);
    }
}
