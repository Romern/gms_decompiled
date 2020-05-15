package p000;

import android.bluetooth.BluetoothDevice;

/* renamed from: pdy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pdy {

    /* renamed from: a */
    final /* synthetic */ pdz f38895a;

    public pdy(pdz pdz) {
        this.f38895a = pdz;
    }

    /* renamed from: a */
    public final void mo22941a(BluetoothDevice bluetoothDevice) {
        this.f38895a.f38912P.mo22596a();
        if (this.f38895a.f38936m != null && bluetoothDevice.getAddress() != null && this.f38895a.f38936m.getAddress() != null && bluetoothDevice.getAddress().equals(this.f38895a.f38936m.getAddress())) {
            this.f38895a.f38912P.mo22596a();
            pdz pdz = this.f38895a;
            pdz.f38937n = true;
            pdz.f38948y.removeCallbacks(pdz.f38908L);
            synchronized (this.f38895a.f38925b) {
                if (dcm.CONNECTING_BT.equals(this.f38895a.f38927d)) {
                    this.f38895a.f38927d = dcm.IDLE;
                    pdz pdz2 = this.f38895a;
                    pdz2.mo22948a(pdz2.f38927d);
                }
            }
        }
    }
}
