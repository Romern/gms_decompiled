package p000;

import android.bluetooth.BluetoothDevice;

/* renamed from: bedw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bedw {

    /* renamed from: a */
    final /* synthetic */ bedy f106992a;

    public bedw(bedy bedy) {
        this.f106992a = bedy;
    }

    /* renamed from: a */
    public final void mo58594a() {
        bedy bedy = this.f106992a;
        synchronized (bedy.f106995a) {
            ausd ausd = bedy.f107000f;
            if (ausd != null) {
                ausd.f92402b.mo50870b(ausd.f92401a);
                aurv aurv = ausd.f92403c;
                BluetoothDevice bluetoothDevice = ausd.f92401a;
                aunx aunx = aurw.f92381a;
                String valueOf = String.valueOf(bluetoothDevice.getName());
                aunx.mo50711a(valueOf.length() == 0 ? new String("Received connection close for the device") : "Received connection close for the device".concat(valueOf), new Object[0]);
                aurv.f92380a.mo50856a(bluetoothDevice);
                aurv.f92380a.mo50855a();
            }
        }
    }
}
