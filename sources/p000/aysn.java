package p000;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;

/* renamed from: aysn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aysn extends BluetoothGattCallback {

    /* renamed from: a */
    final /* synthetic */ ayso f98421a;

    public aysn(ayso ayso) {
        this.f98421a = ayso;
    }

    public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.f98421a.mo54325a(aysm.m84710a(bluetoothGatt), bluetoothGattCharacteristic);
    }

    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        this.f98421a.mo54326a(aysm.m84710a(bluetoothGatt), bluetoothGattCharacteristic, i);
    }

    public final void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        this.f98421a.mo54330b(aysm.m84710a(bluetoothGatt), bluetoothGattCharacteristic, i);
    }

    public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
        this.f98421a.mo54324a(aysm.m84710a(bluetoothGatt), i, i2);
    }

    public final void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        this.f98421a.mo54327a(aysm.m84710a(bluetoothGatt), bluetoothGattDescriptor, i);
    }

    public final void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        this.f98421a.mo54331b(aysm.m84710a(bluetoothGatt), bluetoothGattDescriptor, i);
    }

    public final void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
        this.f98421a.mo54329b(aysm.m84710a(bluetoothGatt), i, i2);
    }

    public final void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i, int i2) {
        this.f98421a.mo54332c(aysm.m84710a(bluetoothGatt), i, i2);
    }

    public final void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i) {
        this.f98421a.mo54328b(aysm.m84710a(bluetoothGatt), i);
    }

    public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
        this.f98421a.mo54323a(aysm.m84710a(bluetoothGatt), i);
    }
}
