package p000;

import android.bluetooth.BluetoothSocket;

/* renamed from: aipp */
final /* synthetic */ class aipp implements Runnable {

    /* renamed from: a */
    private final BluetoothSocket f69446a;

    public aipp(BluetoothSocket bluetoothSocket) {
        this.f69446a = bluetoothSocket;
    }

    public final void run() {
        BluetoothSocket bluetoothSocket = this.f69446a;
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aipr", "c", 223, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68415a("L2capServerHandler timed out for handling incoming L2CAP socket after %d ms.", cfnv.m140784h());
        srz.m36171a(bluetoothSocket);
    }
}
