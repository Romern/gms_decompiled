package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import java.util.ArrayList;

/* renamed from: zhd */
final /* synthetic */ class zhd implements bqeh {

    /* renamed from: a */
    private final zhi f55071a;

    /* renamed from: b */
    private final caah f55072b;

    public zhd(zhi zhi, caah caah) {
        this.f55071a = zhi;
        this.f55072b = caah;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        zhi zhi = this.f55071a;
        bngm<BluetoothGattCharacteristic> g = ((bnht) obj).mo67692g(this.f55072b);
        ArrayList arrayList = new ArrayList();
        for (BluetoothGattCharacteristic bluetoothGattCharacteristic : g) {
            arrayList.add(zhi.f55081b.mo31106a(bluetoothGattCharacteristic));
        }
        return bqdx.m112673a(bqga.m112774a((Iterable) arrayList), zhe.f55073a, bqfb.INSTANCE);
    }
}
