package p000;

import android.bluetooth.BluetoothGattCharacteristic;

/* renamed from: zgy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zgy extends zgw {

    /* renamed from: a */
    final /* synthetic */ zha f55047a;

    /* renamed from: b */
    private final BluetoothGattCharacteristic f55048b;

    public zgy(zha zha, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.f55047a = zha;
        this.f55048b = bluetoothGattCharacteristic;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo31101a() {
        this.f55047a.f55063m.mo31140a(String.format("listenOrRead on characteristic %s", this.f55048b.getUuid()));
        synchronized (this.f55047a.f55061k) {
            zha zha = this.f55047a;
            if (zha.f55062l != null) {
                this.f55048b.getUuid();
                if (!this.f55047a.f55062l.mo31129a(this.f55048b)) {
                    this.f55048b.getUuid();
                    this.f55047a.f55063m.mo31139a();
                }
            } else {
                zha.f55063m.mo31139a();
            }
        }
    }

    public final String toString() {
        return String.format("ReadCharacteristicCommand{characteristic=%s}", this.f55048b);
    }
}
