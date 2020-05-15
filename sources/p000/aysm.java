package p000;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.UUID;

/* renamed from: aysm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aysm {

    /* renamed from: a */
    public final BluetoothGatt f98420a;

    private aysm(BluetoothGatt bluetoothGatt) {
        this.f98420a = bluetoothGatt;
    }

    /* renamed from: a */
    public static aysm m84710a(BluetoothGatt bluetoothGatt) {
        return new aysm(bluetoothGatt);
    }

    /* renamed from: b */
    public final List mo54363b() {
        return this.f98420a.getServices();
    }

    /* renamed from: c */
    public final boolean mo54366c() {
        return this.f98420a.discoverServices();
    }

    /* renamed from: d */
    public final boolean mo54367d() {
        try {
            return ((Boolean) BluetoothGatt.class.getMethod("refresh", new Class[0]).invoke(this.f98420a, new Object[0])).booleanValue();
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
            return false;
        }
    }

    /* renamed from: e */
    public final void mo54368e() {
        this.f98420a.disconnect();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aysm) {
            return this.f98420a.equals(((aysm) obj).f98420a);
        }
        return false;
    }

    /* renamed from: f */
    public final void mo54370f() {
        this.f98420a.close();
    }

    public final int hashCode() {
        return this.f98420a.hashCode();
    }

    /* renamed from: a */
    public final BluetoothGattService mo54357a(UUID uuid) {
        return this.f98420a.getService(uuid);
    }

    /* renamed from: b */
    public final boolean mo54364b(int i) {
        return this.f98420a.requestMtu(i);
    }

    /* renamed from: a */
    public final aysl mo54358a() {
        return aysl.m84704a(this.f98420a.getDevice());
    }

    /* renamed from: b */
    public final boolean mo54365b(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return this.f98420a.writeCharacteristic(bluetoothGattCharacteristic);
    }

    /* renamed from: a */
    public final void mo54359a(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        this.f98420a.setCharacteristicNotification(bluetoothGattCharacteristic, z);
    }

    /* renamed from: a */
    public final boolean mo54360a(int i) {
        return this.f98420a.requestConnectionPriority(i);
    }

    /* renamed from: a */
    public final boolean mo54361a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return this.f98420a.readCharacteristic(bluetoothGattCharacteristic);
    }

    /* renamed from: a */
    public final boolean mo54362a(BluetoothGattDescriptor bluetoothGattDescriptor) {
        return this.f98420a.writeDescriptor(bluetoothGattDescriptor);
    }
}
