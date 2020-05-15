package p000;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;

/* renamed from: zhz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zhz extends BluetoothGattCallback {

    /* renamed from: a */
    private final zho f55119a;

    public zhz(zho zho) {
        this.f55119a = zho;
    }

    public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        zho zho = this.f55119a;
        bluetoothGattCharacteristic.getUuid();
        ((zha) zho).f55056f.mo31097a(bluetoothGattCharacteristic);
    }

    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        zha zha = (zha) this.f55119a;
        zha.f55063m.mo31139a();
        bqgy bqgy = (bqgy) zha.f55060j.remove(bluetoothGattCharacteristic.getUuid());
        if (i == 0) {
            bluetoothGattCharacteristic.getUuid();
            if (bqgy == null) {
                zha.m45419c(bluetoothGattCharacteristic);
            } else {
                bqgy.mo69138b(bluetoothGattCharacteristic);
            }
            zha.f55056f.mo31097a(bluetoothGattCharacteristic);
        } else if (bqgy != null) {
            bqgy.mo69136a((Throwable) new IllegalStateException(String.format("Failed to read characteristic %s with status %s", bluetoothGattCharacteristic.getUuid(), Integer.valueOf(i))));
        } else {
            zha.m45419c(bluetoothGattCharacteristic);
        }
    }

    public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
        int i3;
        zgu zgu;
        zho zho = this.f55119a;
        if (i != 0 && i2 == 2) {
            i3 = 0;
        } else {
            i3 = i2;
        }
        if (i2 != i3) {
            synchronized (((zha) zho).f55058h) {
                ((bnsl) zha.f55051a.mo68388c()).mo68426a("onConnectionStateChange: status=0x%04X newState=%s correctedNewState=%s oldState=%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(((zha) zho).f55059i.f55040a));
            }
        }
        zha zha = (zha) zho;
        synchronized (zha.f55058h) {
            if (i3 == 2) {
                try {
                    ((zha) zho).f55059i = ((zha) zho).f55059i.mo31098a(2);
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            } else if (i3 == 0) {
                ((zha) zho).f55059i = ((zha) zho).f55059i.mo31098a(0);
            }
            zgu = ((zha) zho).f55059i;
        }
        if (i3 == 0) {
            if (zgu.f55041b) {
                zha.mo31112c();
            }
            if (!zha.f55054d.isEmpty()) {
                zha.mo31112c();
                for (BluetoothGattCharacteristic bluetoothGattCharacteristic : zha.f55054d) {
                    zha.mo31106a(bluetoothGattCharacteristic);
                }
            }
        } else if (i3 == 2) {
            zha.mo31113d();
        }
    }

    public final void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        ((zha) this.f55119a).f55063m.mo31139a();
        if (i == 0) {
            bluetoothGattDescriptor.getUuid();
        }
    }

    public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
        zho zho = this.f55119a;
        zhn a = zib.m45491a(bluetoothGatt);
        zha zha = (zha) zho;
        zha.f55063m.mo31139a();
        if (i == 0) {
            zha.f55057g.mo69138b(a.mo31134d());
        }
    }
}
