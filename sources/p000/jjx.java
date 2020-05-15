package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import java.util.UUID;

/* renamed from: jjx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jjx extends aysr {

    /* renamed from: a */
    public aysp f22663a;

    /* renamed from: b */
    public byte[] f22664b = new byte[4];

    /* renamed from: d */
    private final UUID f22665d;

    public jjx(UUID uuid) {
        this.f22665d = uuid;
    }

    /* renamed from: a */
    public final void mo13807a(aysl aysl, int i, int i2, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (cchi.m129670b() && this.f22663a != null && bluetoothGattCharacteristic.getUuid().equals(this.f22665d)) {
            this.f22663a.mo54384a(aysl, i, 0, i2, this.f22664b);
        }
    }
}
