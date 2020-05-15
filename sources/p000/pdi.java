package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;

/* renamed from: pdi */
public final /* synthetic */ class pdi implements Runnable {

    /* renamed from: a */
    private final pdz f38871a;

    /* renamed from: b */
    private final BluetoothDevice f38872b;

    public pdi(pdz pdz, BluetoothDevice bluetoothDevice) {
        this.f38871a = pdz;
        this.f38872b = bluetoothDevice;
    }

    public final void run() {
        pdz pdz = this.f38871a;
        BluetoothDevice bluetoothDevice = this.f38872b;
        pdz.f38944u.postDelayed(pdz.f38909M, 25000);
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        int profileConnectionState = defaultAdapter.getProfileConnectionState(1);
        int profileConnectionState2 = defaultAdapter.getProfileConnectionState(2);
        pdz.f38912P.mo22596a();
        if (profileConnectionState == 2 || profileConnectionState2 == 2 || pcm.m30211a(pdz.f38906J, bluetoothDevice)) {
            pdz.f38936m = bluetoothDevice;
            pdz.mo22948a(dcm.BT_HFP_A2DP_CONNECTED);
            pdz.mo22952a(false);
            return;
        }
        pce pce = pdz.f38903G;
        pdf pdf = new pdf(pdz);
        pce.f38818h.clear();
        pce.f38818h.add(pdf);
    }
}
