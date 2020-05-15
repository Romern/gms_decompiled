package p000;

import android.bluetooth.BluetoothDevice;

/* renamed from: ngf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ngf {

    /* renamed from: a */
    final BluetoothDevice f35479a;

    /* renamed from: b */
    final int f35480b;

    /* renamed from: c */
    final byte[] f35481c;

    /* renamed from: d */
    final long f35482d;

    public ngf(BluetoothDevice bluetoothDevice, int i, byte[] bArr, long j) {
        this.f35479a = bluetoothDevice;
        this.f35480b = i;
        this.f35481c = bArr;
        this.f35482d = j;
    }

    /* renamed from: a */
    public final String mo20591a() {
        String valueOf = String.valueOf(this.f35479a);
        long j = this.f35482d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 66);
        sb.append("UnprocessedSighting {device=");
        sb.append(valueOf);
        sb.append(", timestampNanos=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
