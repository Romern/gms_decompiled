package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;

/* renamed from: zgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zgz extends zgw {

    /* renamed from: a */
    final /* synthetic */ zha f55049a;

    /* renamed from: b */
    private final BluetoothGattCharacteristic f55050b;

    public zgz(zha zha, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.f55049a = zha;
        this.f55050b = bluetoothGattCharacteristic;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0075, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo31101a() {
        zha zha = this.f55049a;
        srn srn = zha.f55051a;
        zha.f55063m.mo31140a(String.format("stopListening to characteristic %s", this.f55050b.getUuid()));
        synchronized (this.f55049a.f55061k) {
            zha zha2 = this.f55049a;
            zhn zhn = zha2.f55062l;
            if (zhn != null) {
                if (!zhn.mo31130a(this.f55050b, false)) {
                    this.f55050b.getUuid();
                }
                BluetoothGattDescriptor descriptor = this.f55050b.getDescriptor(zha.f55052b);
                if (descriptor == null) {
                    this.f55050b.getUuid();
                    this.f55049a.f55063m.mo31139a();
                } else if (!descriptor.setValue(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE)) {
                    descriptor.getUuid();
                    this.f55049a.f55063m.mo31139a();
                } else if (!this.f55049a.f55062l.mo31131a(descriptor)) {
                    descriptor.getUuid();
                    this.f55049a.f55063m.mo31139a();
                }
            } else {
                zha2.f55063m.mo31139a();
            }
        }
    }

    public final String toString() {
        return String.format("StopListeningCommand{characteristic=%s}", this.f55050b);
    }
}
