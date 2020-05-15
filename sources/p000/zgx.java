package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;

/* renamed from: zgx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zgx extends zgw {

    /* renamed from: a */
    final /* synthetic */ zha f55044a;

    /* renamed from: b */
    private final BluetoothGattCharacteristic f55045b;

    /* renamed from: c */
    private final bqgy f55046c;

    public zgx(zha zha, BluetoothGattCharacteristic bluetoothGattCharacteristic, bqgy bqgy) {
        this.f55044a = zha;
        this.f55045b = bluetoothGattCharacteristic;
        this.f55046c = bqgy;
    }

    /* renamed from: a */
    public final void mo31101a() {
        this.f55044a.f55063m.mo31140a(String.format("Enabling notifications for %s", this.f55045b.getUuid()));
        this.f55044a.f55054d.add(this.f55045b);
        synchronized (this.f55044a.f55061k) {
            if (this.f55044a.f55062l != null) {
                this.f55045b.getUuid();
                this.f55044a.f55062l.mo31130a(this.f55045b, false);
                if (!this.f55044a.f55062l.mo31130a(this.f55045b, true)) {
                    this.f55046c.mo69138b((Object) false);
                    return;
                }
                BluetoothGattDescriptor descriptor = this.f55045b.getDescriptor(zha.f55052b);
                if (descriptor == null) {
                    this.f55045b.getUuid();
                    this.f55044a.f55063m.mo31139a();
                    this.f55046c.mo69138b((Object) false);
                } else if (!descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE)) {
                    this.f55044a.f55063m.mo31139a();
                    this.f55046c.mo69138b((Object) false);
                } else if (!this.f55044a.f55062l.mo31131a(descriptor)) {
                    descriptor.getUuid();
                    this.f55046c.mo69138b((Object) false);
                    this.f55044a.f55063m.mo31139a();
                } else {
                    this.f55046c.mo69138b((Object) true);
                }
            } else {
                ((bnsl) zha.f55051a.mo68388c()).mo68405a("Not running listen, no GATT.");
                this.f55044a.f55063m.mo31139a();
                this.f55046c.mo69138b((Object) false);
            }
        }
    }

    public final String toString() {
        return String.format("ListenForCharacteristicChangesCommand{characteristic=%s}", this.f55045b);
    }
}
