package p000;

import android.bluetooth.BluetoothGattService;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zhc */
final /* synthetic */ class zhc implements bmxj {

    /* renamed from: a */
    private final zhi f55070a;

    public zhc(zhi zhi) {
        this.f55070a = zhi;
    }

    public final Object apply(Object obj) {
        zhi zhi = this.f55070a;
        ArrayList arrayList = new ArrayList();
        for (BluetoothGattService bluetoothGattService : (List) obj) {
            arrayList.addAll(bluetoothGattService.getCharacteristics());
        }
        zhi.mo31115a(arrayList);
        return arrayList;
    }
}
