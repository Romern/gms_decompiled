package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseSettings;
import java.util.UUID;

/* renamed from: xtl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xtl extends AdvertiseCallback {

    /* renamed from: a */
    final /* synthetic */ xwn f53064a;

    /* renamed from: b */
    final /* synthetic */ xwj f53065b;

    /* renamed from: c */
    final /* synthetic */ xtc f53066c;

    public xtl(xtc xtc, xwn xwn, xwj xwj) {
        this.f53066c = xtc;
        this.f53064a = xwn;
        this.f53065b = xwj;
    }

    public final void onStartFailure(int i) {
        StringBuilder sb = new StringBuilder(48);
        sb.append("Advertisement failed with errorCode= ");
        sb.append(i);
        this.f53064a.mo30185a(this.f53065b, new xju(sb.toString()), 51);
        this.f53066c.mo30117a();
    }

    public final void onStartSuccess(AdvertiseSettings advertiseSettings) {
        xtc xtc = this.f53066c;
        xtk.f53046k.mo25414c("  Advertisement started...  Starting GATT server.", new Object[0]);
        xtk xtk = xtc.f53030b;
        xjm xjm = xtc.f53029a;
        byte[] bArr = xjm.f52426a;
        byte[] bArr2 = xjm.f52429d;
        xtk.f53057l = new xuc(xtk.f53047a, xtk.f53048b, new xtd(xtk, xjm.f52430e), new xtx(bArr, bArr2), xtk.f53051e);
        xuc xuc = xtk.f53057l;
        bmxy.m108600b(xuc.f53128h == null);
        xuc.f53121o.mo25414c("CTAP GATT server started.", new Object[0]);
        xuc.f53127g = new BluetoothGattDescriptor(xiv.f52386g, 16);
        xuc.f53122b = new BluetoothGattCharacteristic(xiv.f52380a, 8, 16);
        xuc.f53123c = new BluetoothGattCharacteristic(xiv.f52383d, 16, 1);
        xuc.f53123c.addDescriptor(xuc.f53127g);
        xuc.f53124d = new BluetoothGattCharacteristic(xiv.f52381b, 2, 1);
        xuc.f53125e = new BluetoothGattCharacteristic(xiv.f52384e, 10, 17);
        xuc.f53125e.setValue(xuc.f53120a);
        xuc.f53126f = new BluetoothGattCharacteristic(xiv.f52385f, 2, 1);
        xuc.f53126f.setValue(bqcn.m112583a(3223088));
        xuc.f53129i = new BluetoothGattService(UUID.fromString(cdvk.f181807a.mo6606a().mo78371a()), 0);
        xuc.f53129i.addCharacteristic(xuc.f53122b);
        xuc.f53129i.addCharacteristic(xuc.f53123c);
        xuc.f53129i.addCharacteristic(xuc.f53124d);
        xuc.f53129i.addCharacteristic(xuc.f53125e);
        xuc.f53129i.addCharacteristic(xuc.f53126f);
        xuc.f53128h = ((BluetoothManager) xuc.f53130j.getSystemService("bluetooth")).openGattServer(xuc.f53130j, xuc);
        if (cdwu.m135190b() && xuc.f53128h == null) {
            xuc.f53121o.mo25418e("Unable to instantiate BLE GATT server", new Object[0]);
        } else {
            xuc.f53128h.addService(xuc.f53129i);
        }
    }
}
