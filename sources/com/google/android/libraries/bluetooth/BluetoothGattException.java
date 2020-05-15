package com.google.android.libraries.bluetooth;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BluetoothGattException extends BluetoothException {

    /* renamed from: a */
    public final int f111041a;

    public BluetoothGattException(String str, int i) {
        super(str);
        this.f111041a = i;
    }

    public BluetoothGattException(String str, int i, Throwable th) {
        super(str, th);
        this.f111041a = i;
    }
}
