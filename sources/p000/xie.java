package p000;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import java.util.Locale;

/* renamed from: xie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xie extends BluetoothGattCallback {

    /* renamed from: a */
    final /* synthetic */ xig f52329a;

    public xie(xig xig) {
        this.f52329a = xig;
    }

    public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
        byte[] value = bluetoothGattCharacteristic.getValue();
        this.f52329a.f52343d.mo29819a(new xiu(bluetoothGattCharacteristic), value);
        xig.f52339h.mo25412b("Characteristic %s %d bytes changed", bluetoothGattCharacteristic.getUuid(), Integer.valueOf(value.length));
        this.f52329a.f52342c.mo29810b(xif.CHARACTERISTIC_CHANGED, new xiu(bluetoothGattCharacteristic));
    }

    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        super.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i);
        if (i == 0) {
            byte[] value = bluetoothGattCharacteristic.getValue();
            this.f52329a.f52343d.mo29819a(new xiu(bluetoothGattCharacteristic), value);
            xig.f52339h.mo25412b("Read %d bytes on characteristic %s", Integer.valueOf(value.length), bluetoothGattCharacteristic.getUuid());
        } else {
            this.f52329a.f52342c.f52358b = new xij(String.format(Locale.US, "Read characteristic failed with error code: %d", Integer.valueOf(i)), this.f52329a.f52342c.f52357a, bluetoothGattCharacteristic);
        }
        this.f52329a.f52342c.mo29810b(xif.READ_CHARACTERISTIC, new xiu(bluetoothGattCharacteristic));
    }

    public final void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
        if (i == 0) {
            xig.f52339h.mo25412b("Write on characteristic %s completed", bluetoothGattCharacteristic.getUuid());
        } else {
            this.f52329a.f52342c.f52358b = new xij(String.format(Locale.US, "Write on characteristic %s failed with error code: %d", bluetoothGattCharacteristic.getUuid(), Integer.valueOf(i)), this.f52329a.f52342c.f52357a, bluetoothGattCharacteristic);
        }
        this.f52329a.f52342c.mo29810b(xif.WRITE_CHARACTERISTIC, new xiu(bluetoothGattCharacteristic));
    }

    public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
        boolean z = true;
        if (i2 == 0) {
            xig.f52339h.mo25414c("State change: disconnected", new Object[0]);
            if (!(this.f52329a.f52342c.f52357a == xif.DISCONNECT && i == 0)) {
                this.f52329a.f52342c.f52358b = new xij(String.format(Locale.US, "Disconnected from Bluetooth LE device with status %d", Integer.valueOf(i)), this.f52329a.f52342c.f52357a);
            }
            this.f52329a.f52342c.mo29809b(xif.DISCONNECT);
        } else if (i2 != 2) {
            this.f52329a.f52342c.f52358b = new xij(String.format(Locale.US, "Invalid connection state: %d", Integer.valueOf(i2)), this.f52329a.f52342c.f52357a);
        } else {
            xig.f52339h.mo25414c("State change: connected", new Object[0]);
            if (i == 0) {
                xig.f52339h.mo25414c("Connected to BLE device.", new Object[0]);
                BluetoothGatt bluetoothGatt2 = this.f52329a.f52344e;
                if (bluetoothGatt2 == null || !bluetoothGatt2.requestConnectionPriority(1)) {
                    z = false;
                }
                xig.f52339h.mo25414c(!z ? "Failed to request high connection priority" : "Requested high connection priority", new Object[0]);
                synchronized (this.f52329a.f52341b) {
                    if (bluetoothGatt.discoverServices()) {
                        xig.f52339h.mo25412b("Service discovery initiated", new Object[0]);
                        return;
                    }
                    this.f52329a.f52342c.f52358b = new xij("Failed to start service discovery", this.f52329a.f52342c.f52357a);
                }
            } else {
                this.f52329a.f52342c.f52358b = new xij(String.format(Locale.US, "Connection state change failed with error: %d", Integer.valueOf(i)), this.f52329a.f52342c.f52357a);
            }
            this.f52329a.f52342c.mo29809b(xif.CONNECT);
        }
    }

    public final void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
        if (i == 0) {
            xig.f52339h.mo25412b("Write on Gatt descriptor %s succeeded", bluetoothGattDescriptor.getUuid());
        } else {
            this.f52329a.f52342c.f52358b = new xij(String.format(Locale.US, "Write on Gatt descriptor %s failed with error code: %d", bluetoothGattDescriptor.getUuid(), Integer.valueOf(i)), this.f52329a.f52342c.f52357a, bluetoothGattDescriptor);
        }
        this.f52329a.f52342c.mo29809b(xif.WRITE_DESCRIPTOR);
    }

    public final void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
        if (i2 != 0) {
            xig.f52339h.mo25418e("MTU size change failed", new Object[0]);
            this.f52329a.f52342c.f52358b = new xij("MTU size change failed", this.f52329a.f52342c.f52357a);
        } else {
            xig.f52339h.mo25412b("MTU size changed to %d", Integer.valueOf(i));
            this.f52329a.f52345f = i;
        }
        this.f52329a.f52342c.mo29809b(xif.CHANGE_MTU);
    }

    public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
        if (i != 0) {
            this.f52329a.f52342c.f52358b = new xij(String.format(Locale.US, "Service discovery failed with error code: %d", Integer.valueOf(i)), this.f52329a.f52342c.f52357a);
        } else {
            xig.f52339h.mo25412b("BLE service discovered.", new Object[0]);
        }
        this.f52329a.f52342c.mo29809b(xif.CONNECT);
    }
}
