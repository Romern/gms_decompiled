package p000;

import android.bluetooth.BluetoothDevice;
import android.content.Context;

/* renamed from: ahul */
final /* synthetic */ class ahul implements Runnable {

    /* renamed from: a */
    private final Context f68097a;

    /* renamed from: b */
    private final ahyz f68098b;

    /* renamed from: c */
    private final buru f68099c;

    /* renamed from: d */
    private final BluetoothDevice f68100d;

    public ahul(Context context, ahyz ahyz, buru buru, BluetoothDevice bluetoothDevice) {
        this.f68097a = context;
        this.f68098b = ahyz;
        this.f68099c = buru;
        this.f68100d = bluetoothDevice;
    }

    public final void run() {
        ahur.m56670a(this.f68097a, this.f68098b, this.f68099c, this.f68100d);
    }
}
