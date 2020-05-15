package p000;

import android.bluetooth.BluetoothDevice;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* renamed from: ahvx */
final /* synthetic */ class ahvx implements Runnable {

    /* renamed from: a */
    private final ahwb f68194a;

    /* renamed from: b */
    private final BluetoothDevice f68195b;

    /* renamed from: c */
    private final String f68196c;

    public ahvx(ahwb ahwb, BluetoothDevice bluetoothDevice, String str) {
        this.f68194a = ahwb;
        this.f68195b = bluetoothDevice;
        this.f68196c = str;
    }

    public final void run() {
        ahwb ahwb = this.f68194a;
        BluetoothDevice bluetoothDevice = this.f68195b;
        String str = this.f68196c;
        ahwa b = ahwb.mo37219b(bluetoothDevice);
        String str2 = b.f68202b;
        if (!str.equals(str2)) {
            if (b.f68204d > 0) {
                ((bnsl) ahsd.f67925a.mo68390d()).mo68424a("RetroactivePairManager: the ble address changed (%s -> %s)", b.f68202b, str);
            }
            b.f68205e = true;
            b.f68202b = str;
        }
        if (b.f68205e && b.f68204d > 0 && str2 != null) {
            ahwb.f68206a.startService(DiscoveryChimeraService.m67336a(ahwb.f68206a).setAction("com.google.android.gms.nearby.discovery:ACTION_CANCEL_FAST_PAIR").putExtra("com.google.android.gms.nearby.discovery.BLE_ADDRESS", str2));
        }
    }
}
