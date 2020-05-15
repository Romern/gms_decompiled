package p000;

import android.bluetooth.BluetoothDevice;
import java.util.List;

/* renamed from: pcb */
final /* synthetic */ class pcb implements Runnable {

    /* renamed from: a */
    private final pcd f38807a;

    public pcb(pcd pcd) {
        this.f38807a = pcd;
    }

    public final void run() {
        pcd pcd = this.f38807a;
        pce pce = pcd.f38810a;
        int[] iArr = pce.f38811a;
        pce.f38820j.mo22596a();
        List list = pcd.f38810a.f38815e;
        if (list != null) {
            if (!list.isEmpty()) {
                pcd.f38810a.f38819i.mo22941a((BluetoothDevice) pcd.f38810a.f38815e.get(0));
            }
            List list2 = pcd.f38810a.f38815e;
            bmxy.m108581a(list2);
            list2.clear();
        }
    }
}
