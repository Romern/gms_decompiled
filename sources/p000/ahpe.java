package p000;

import android.bluetooth.BluetoothDevice;
import java.util.Iterator;

/* renamed from: ahpe */
final /* synthetic */ class ahpe implements Runnable {

    /* renamed from: a */
    private final ahpg f67706a;

    /* renamed from: b */
    private final BluetoothDevice f67707b;

    public ahpe(ahpg ahpg, BluetoothDevice bluetoothDevice) {
        this.f67706a = ahpg;
        this.f67707b = bluetoothDevice;
    }

    public final void run() {
        ahpg ahpg = this.f67706a;
        BluetoothDevice bluetoothDevice = this.f67707b;
        String name = bluetoothDevice.getName();
        if (!ahpg.f67710a.mo36728k()) {
            ((bnsl) ahkm.f67363a.mo68388c()).mo68420a("Skipping discovery of BluetoothDevice %s because we are no longer discovering.", name);
            return;
        }
        ahmr a = ahmr.m56189a(name);
        if (ahpg.mo36945a(a)) {
            ahpz ahpz = ahpg.f67714e;
            String str = a.f67568c;
            String address = bluetoothDevice.getAddress();
            ahpd ahpd = ahpz.f67767l;
            ahme ahme = null;
            if (ahpd != null) {
                Iterator it = ahpd.f67704e.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ahme ahme2 = (ahme) it.next();
                    if (!str.equals(ahme2.f67521b) && bmwb.m108443a(address, ahme2.f67518a.getAddress())) {
                        ahme = ahme2;
                        break;
                    }
                }
            }
            if (ahme == null) {
                ((bnsl) ahkm.f67363a.mo68390d()).mo68425a("Found BluetoothDeviceName %s (with EndpointId %s and EndpointInfo %s)", name, a.f67568c, ahkm.m55981a(a.f67570e));
                ahme ahme3 = new ahme(bluetoothDevice, a.f67568c, a.f67570e, ahpg.f67711b);
                ahpg.f67713d.put(name, ahme3);
                ahpg.f67714e.mo36851b(ahpg.f67710a, ahme3);
                ahpg.f67714e.mo36845a(ahpg.f67710a, a.f67568c, bvif.BLUETOOTH, 1);
                return;
            }
            ((bnsl) ahkm.f67363a.mo68388c()).mo68425a("Found duplicated Bluetooth endpoint from BLE's cache which have same MAC address (%s) but different endpointId (%s)/(%s)", bluetoothDevice.getAddress(), a.f67568c, ahme.f67521b);
        } else if (ahpg.f67710a.mo36731m() != null && ahpg.f67710a.mo36731m().f80468b) {
            srn srn = ahkm.f67363a;
            ahpg.f67710a.mo36693a(ahpg.f67711b, bluetoothDevice);
        }
    }
}
