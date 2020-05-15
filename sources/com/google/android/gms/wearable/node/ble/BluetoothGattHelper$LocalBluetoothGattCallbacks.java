package com.google.android.gms.wearable.node.ble;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BluetoothGattHelper$LocalBluetoothGattCallbacks extends BluetoothGattCallback {

    /* renamed from: a */
    final /* synthetic */ aybz f110990a;

    public BluetoothGattHelper$LocalBluetoothGattCallbacks(aybz aybz) {
        this.f110990a = aybz;
    }

    /* renamed from: a */
    private final void m94423a(BluetoothGatt bluetoothGatt, int i, UUID uuid) {
        String str;
        aybz aybz = this.f110990a;
        int i2 = aybz.f97089h;
        synchronized (aybz.f97092d) {
            try {
                BluetoothGatt a = this.f110990a.mo53875a(bluetoothGatt);
                aybz aybz2 = this.f110990a;
                if (i != 0) {
                    if (i != 0) {
                        str = i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? i != 7 ? i != 13 ? i != 15 ? i != 129 ? i != 133 ? i != 162 ? i != 257 ? "Unknown error code" : "GATT_FAILURE" : "ANCS_ERROR_INVALID_PARAMETER" : "GATT_ERROR" : "GATT_INTERNAL_ERROR" : "GATT_INSUFFICIENT_ENCRYPTION" : "GATT_INVALID_ATTRIBUTE_LENGTH" : "GATT_INVALID_OFFSET" : "GATT_REQUEST_NOT_SUPPORTED" : "GATT_INSUFFICIENT_AUTHENTICATION" : "GATT_WRITE_NOT_PERMITTED" : "GATT_READ_NOT_PERMITTED" : "GATT_INVALID_HANDLE";
                    } else {
                        str = "GATT_SUCCESS";
                    }
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[5];
                    int i3 = aybz2.f97095g;
                    String a2 = ayby.m83788a(i3);
                    if (i3 != 0) {
                        objArr[0] = a2;
                        objArr[1] = a.getDevice().getAddress();
                        objArr[2] = uuid;
                        objArr[3] = Integer.valueOf(i);
                        objArr[4] = str;
                        throw new aybx(String.format(locale, "Operation %s on device %s uuid %s failed: %d - %s", objArr), i);
                    }
                    throw null;
                }
                aybz2.mo53879c();
            } catch (aybx e) {
                aybz aybz3 = this.f110990a;
                Log.e("BluetoothGattHelper", e.getMessage());
                aybz3.f97094f = e;
                aybz3.mo53879c();
            }
        }
    }

    public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
        aybz aybz = this.f110990a;
        int i = aybz.f97089h;
        ayca ayca = aybz.f97090b;
    }

    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        super.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i);
        m94423a(bluetoothGatt, i, bluetoothGattCharacteristic.getUuid());
    }

    public final void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
        m94423a(bluetoothGatt, i, bluetoothGattCharacteristic.getUuid());
        aybz aybz = this.f110990a;
        int i2 = aybz.f97089h;
        ayca ayca = aybz.f97090b;
        bluetoothGattCharacteristic.getUuid();
    }

    public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
    }

    public final void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        throw new UnsupportedOperationException("We don't support descriptor reads");
    }

    public final void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
        aybz aybz = this.f110990a;
        String valueOf = String.valueOf(bluetoothGattDescriptor.getCharacteristic().getUuid());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
        sb.append("onDescriptorWrite callback. Status: ");
        sb.append(i);
        sb.append("uuid ");
        sb.append(valueOf);
        String sb2 = sb.toString();
        int i2 = aybz.f97089h;
        aybz.mo53877a(sb2);
        m94423a(bluetoothGatt, i, bluetoothGattDescriptor.getUuid());
    }

    public final void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
        super.onMtuChanged(bluetoothGatt, i, i2);
        aybz aybz = this.f110990a;
        StringBuilder sb = new StringBuilder(53);
        sb.append("onMtuChanged to MTU: ");
        sb.append(i);
        sb.append(". Status: ");
        sb.append(i2);
        String sb2 = sb.toString();
        int i3 = aybz.f97089h;
        aybz.mo53877a(sb2);
        this.f110990a.f97091c = i;
        mo60311a(bluetoothGatt, i2);
    }

    public final void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i, int i2) {
        throw new UnsupportedOperationException("We don't support read remote rssi");
    }

    public void onServiceChanged(BluetoothGatt bluetoothGatt) {
        if (!chna.m149009b()) {
            aybz aybz = this.f110990a;
            int i = aybz.f97089h;
            aybz.mo53877a("Ignoring onServiceChanged() callback because handling is disabled.");
            return;
        }
        aybz aybz2 = this.f110990a;
        int i2 = aybz.f97089h;
        synchronized (aybz2.f97092d) {
            try {
                this.f110990a.mo53875a(bluetoothGatt);
            } catch (aybx e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Unexpected exception ");
                sb.append(valueOf);
                sb.append(" onServiceChanged callback.");
                Log.w("BluetoothGattHelper", sb.toString());
                return;
            }
        }
        this.f110990a.mo53877a("Notifying listener of onServiceChanged()");
        ayca ayca = this.f110990a.f97090b;
        ((aybu) ayca).mo53866a("onServiceChanged");
        ((aycl) ayca).mo53895b(19);
    }

    public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
        super.onServicesDiscovered(bluetoothGatt, i);
        mo60311a(bluetoothGatt, i);
        aybz aybz = this.f110990a;
        int i2 = aybz.f97089h;
        ayca ayca = aybz.f97090b;
        ((aybu) ayca).mo53866a("onServicesDiscovered");
        ((aycl) ayca).mo53895b(10);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo60311a(BluetoothGatt bluetoothGatt, int i) {
        m94423a(bluetoothGatt, i, null);
    }
}
