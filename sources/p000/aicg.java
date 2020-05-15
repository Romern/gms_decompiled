package p000;

import android.bluetooth.BluetoothDevice;
import android.content.Context;

/* renamed from: aicg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aicg extends buqn {

    /* renamed from: a */
    final /* synthetic */ BluetoothDevice f68675a;

    /* renamed from: b */
    final /* synthetic */ aics f68676b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aicg(aics aics, String str, BluetoothDevice bluetoothDevice) {
        super(str);
        this.f68676b = aics;
        this.f68675a = bluetoothDevice;
    }

    public final void run() {
        aics aics = this.f68676b;
        Context context = aics.f68708e;
        BluetoothDevice bluetoothDevice = this.f68675a;
        ahur.m56672a(context, bluetoothDevice, aics.f68705b.mo37033a(bluetoothDevice.getAddress()), this.f68676b.f68710g);
    }
}
