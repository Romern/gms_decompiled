package p000;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.util.SparseArray;

/* renamed from: ahxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahxn implements ahxi {

    /* renamed from: a */
    public final Context f68294a;

    /* renamed from: b */
    public final ahxj f68295b;

    /* renamed from: c */
    public final ahst f68296c;

    /* renamed from: d */
    private final SparseArray f68297d;

    /* renamed from: e */
    private final buqh f68298e;

    public ahxn(Context context) {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(1, new ahxd());
        sparseArray.put(2, new ahxe());
        sparseArray.put(3, new ahxg());
        sparseArray.put(255, new ahxc());
        sparseArray.put(4, new ahxf());
        this.f68297d = sparseArray;
        this.f68294a = context;
        this.f68295b = (ahxj) ahgz.m55754a(context, ahxj.class);
        this.f68298e = (buqh) ahgz.m55754a(context, buqh.class);
        this.f68296c = (ahst) ahgz.m55754a(context, ahst.class);
    }

    /* renamed from: a */
    public final void mo37256a(BluetoothDevice bluetoothDevice) {
        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: EventStream for [%s] is connected.", bluetoothDevice);
        this.f68298e.mo72987c(new ahxm(this, String.format("SendDeviceInformation[%s]", bluetoothDevice), bluetoothDevice));
    }

    /* renamed from: b */
    public final void mo37258b(BluetoothDevice bluetoothDevice) {
        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: EventStream for [%s] is disconnected.", bluetoothDevice);
        if (cfoj.f184966a.mo6606a().mo82147bd()) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: EventStream listeners for [%s] are reset", bluetoothDevice);
            for (int i = 0; i < this.f68297d.size(); i++) {
                ((ahxh) this.f68297d.valueAt(i)).mo37254a(this.f68294a, bluetoothDevice);
            }
        }
    }

    /* renamed from: a */
    public final void mo37257a(Context context, BluetoothDevice bluetoothDevice, int i, int i2, byte[] bArr) {
        ahxh ahxh = (ahxh) this.f68297d.get(i);
        if (ahxh != null) {
            ahxh.mo37255a(context, bluetoothDevice, i2, bArr);
        }
    }
}
