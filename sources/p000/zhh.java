package p000;

import android.bluetooth.BluetoothGattCharacteristic;

/* renamed from: zhh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zhh implements bqfp {

    /* renamed from: a */
    final /* synthetic */ caah f55077a;

    /* renamed from: b */
    final /* synthetic */ zhi f55078b;

    public zhh(zhi zhi, caah caah) {
        this.f55078b = zhi;
        this.f55077a = caah;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        bnrd a = ((bnht) obj).mo67692g(this.f55077a).iterator();
        while (a.hasNext()) {
            BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) a.next();
            zha zha = this.f55078b.f55081b;
            if (zha.m45418a(bluetoothGattCharacteristic, 16)) {
                zha.f55054d.remove(bluetoothGattCharacteristic);
                zha.mo31108a(new zgz(zha, bluetoothGattCharacteristic));
            } else {
                bluetoothGattCharacteristic.getUuid();
            }
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bnsl bnsl = (bnsl) zhi.f55079a.mo68387b();
        bnsl.mo68437a(th);
        bnsl.mo68405a("Failed to resolve gatt characteristics");
    }
}
