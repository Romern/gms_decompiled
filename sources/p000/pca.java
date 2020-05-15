package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import java.util.List;

/* renamed from: pca */
final /* synthetic */ class pca implements Runnable {

    /* renamed from: a */
    private final pcd f38805a;

    /* renamed from: b */
    private final BluetoothProfile f38806b;

    public pca(pcd pcd, BluetoothProfile bluetoothProfile) {
        this.f38805a = pcd;
        this.f38806b = bluetoothProfile;
    }

    public final void run() {
        pcd pcd = this.f38805a;
        BluetoothProfile bluetoothProfile = this.f38806b;
        pce pce = pcd.f38810a;
        pce.f38817g = (BluetoothHeadset) bluetoothProfile;
        pce.f38815e = pce.f38817g.getDevicesMatchingConnectionStates(pce.f38811a);
        pcd.f38810a.f38820j.mo22596a();
        List list = pcd.f38810a.f38815e;
        if (list != null && !list.isEmpty()) {
            pcd.f38810a.f38820j.mo22596a();
            List list2 = pcd.f38810a.f38815e;
            bmxy.m108581a(list2);
            pcd.f38810a.f38814d.post(new pcc(pcd, (BluetoothDevice) list2.get(0)));
            pce pce2 = pcd.f38810a;
            pce2.mo22901a(pce2.f38818h);
        }
    }
}
