package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: blvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blvg implements blun, blum {

    /* renamed from: a */
    public final aysm f127849a;

    /* renamed from: b */
    public final BluetoothGattCharacteristic f127850b;

    /* renamed from: c */
    public blum f127851c;

    /* renamed from: d */
    private final int f127852d;

    /* renamed from: e */
    private final Executor f127853e;

    public blvg(aysm aysm, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 20000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        this.f127849a = aysm;
        this.f127850b = bluetoothGattCharacteristic;
        this.f127852d = i;
        this.f127853e = threadPoolExecutor;
    }

    /* renamed from: a */
    public final int mo66711a() {
        return this.f127852d;
    }

    /* renamed from: b */
    public final void mo66713b() {
        this.f127853e.execute(new blvc(this));
    }

    /* renamed from: e */
    public final void mo66710e() {
        this.f127853e.execute(new blvf(this));
    }

    /* renamed from: a */
    public final void mo66712a(blum blum) {
        if (this.f127851c == null) {
            this.f127851c = blum;
            return;
        }
        throw new IllegalStateException("initialize() already called");
    }

    /* renamed from: b */
    public final void mo66714b(byte[] bArr) {
        this.f127853e.execute(new blvb(this, bArr));
    }

    /* renamed from: a */
    public final void mo66701a(bluu bluu) {
        this.f127853e.execute(new blvd(this, bluu));
    }

    /* renamed from: a */
    public final void mo66703a(byte[] bArr) {
        this.f127853e.execute(new blve(this, bArr));
    }
}
