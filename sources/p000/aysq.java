package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattServerCallback;
import android.bluetooth.BluetoothGattService;

/* renamed from: aysq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aysq extends BluetoothGattServerCallback {

    /* renamed from: a */
    final /* synthetic */ aysr f98424a;

    public aysq(aysr aysr) {
        this.f98424a = aysr;
    }

    public final void onCharacteristicReadRequest(BluetoothDevice bluetoothDevice, int i, int i2, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.f98424a.mo13807a(aysl.m84704a(bluetoothDevice), i, i2, bluetoothGattCharacteristic);
    }

    public final void onCharacteristicWriteRequest(BluetoothDevice bluetoothDevice, int i, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, boolean z2, int i2, byte[] bArr) {
        this.f98424a.mo54343a(aysl.m84704a(bluetoothDevice), i, bluetoothGattCharacteristic, z, z2, i2, bArr);
    }

    public final void onConnectionStateChange(BluetoothDevice bluetoothDevice, int i, int i2) {
        this.f98424a.mo54341a(aysl.m84704a(bluetoothDevice), i, i2);
    }

    public final void onDescriptorReadRequest(BluetoothDevice bluetoothDevice, int i, int i2, BluetoothGattDescriptor bluetoothGattDescriptor) {
        this.f98424a.mo54342a(aysl.m84704a(bluetoothDevice), i, i2, bluetoothGattDescriptor);
    }

    public final void onDescriptorWriteRequest(BluetoothDevice bluetoothDevice, int i, BluetoothGattDescriptor bluetoothGattDescriptor, boolean z, boolean z2, int i2, byte[] bArr) {
        this.f98424a.mo54344a(aysl.m84704a(bluetoothDevice), i, bluetoothGattDescriptor, z, z2, i2, bArr);
    }

    public final void onExecuteWrite(BluetoothDevice bluetoothDevice, int i, boolean z) {
        this.f98424a.mo54345a(aysl.m84704a(bluetoothDevice), i, z);
    }

    public final void onMtuChanged(BluetoothDevice bluetoothDevice, int i) {
        this.f98424a.mo54396b(aysl.m84704a(bluetoothDevice), i);
    }

    public final void onNotificationSent(BluetoothDevice bluetoothDevice, int i) {
        this.f98424a.mo54340a(aysl.m84704a(bluetoothDevice), i);
    }

    public final void onServiceAdded(int i, BluetoothGattService bluetoothGattService) {
        this.f98424a.mo54339a(i, bluetoothGattService);
    }
}
