package p000;

import android.bluetooth.BluetoothAdapter;
import java.util.UUID;
import java.util.concurrent.Callable;

/* renamed from: asfg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asfg implements Callable {

    /* renamed from: a */
    final /* synthetic */ BluetoothAdapter f88833a;

    /* renamed from: b */
    final /* synthetic */ BluetoothAdapter.LeScanCallback f88834b;

    /* renamed from: c */
    final /* synthetic */ long f88835c;

    public asfg(BluetoothAdapter bluetoothAdapter, BluetoothAdapter.LeScanCallback leScanCallback, long j) {
        this.f88833a = bluetoothAdapter;
        this.f88834b = leScanCallback;
        this.f88835c = j;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        this.f88833a.startLeScan(new UUID[]{UUID.randomUUID()}, this.f88834b);
        Thread.sleep(this.f88835c);
        asfi.m73948a();
        this.f88833a.stopLeScan(this.f88834b);
        return null;
    }
}
