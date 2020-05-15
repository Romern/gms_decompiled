package p000;

import android.bluetooth.BluetoothSocket;
import android.os.SystemClock;

/* renamed from: aipq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aipq extends soa {

    /* renamed from: a */
    final /* synthetic */ BluetoothSocket f69447a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aipq(BluetoothSocket bluetoothSocket) {
        super(9);
        this.f69447a = bluetoothSocket;
    }

    public final void run() {
        SystemClock.sleep(cfnv.m140783g());
        srz.m36171a(this.f69447a);
    }
}
