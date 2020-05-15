package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: blvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blvp implements blun, blum {

    /* renamed from: a */
    public final aysp f127877a;

    /* renamed from: b */
    public final BluetoothGattCharacteristic f127878b;

    /* renamed from: c */
    public final aysl f127879c;

    /* renamed from: d */
    public blum f127880d;

    /* renamed from: e */
    private final Executor f127881e;

    /* renamed from: f */
    private final int f127882f;

    public blvp(aysp aysp, aysl aysl, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 20000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        this.f127877a = aysp;
        this.f127879c = aysl;
        this.f127878b = bluetoothGattCharacteristic;
        this.f127882f = i;
        this.f127881e = threadPoolExecutor;
    }

    /* renamed from: a */
    public final int mo66711a() {
        return this.f127882f;
    }

    /* renamed from: b */
    public final void mo66713b() {
        this.f127881e.execute(new blvl(this));
    }

    /* renamed from: c */
    public final String mo66756c() {
        return this.f127879c.mo54351b();
    }

    /* renamed from: e */
    public final void mo66710e() {
        this.f127881e.execute(new blvo(this));
    }

    /* renamed from: a */
    public final void mo66712a(blum blum) {
        if (this.f127880d == null) {
            this.f127880d = blum;
            return;
        }
        String valueOf = String.valueOf(blum);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb.append("initialize() already called: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    public final void mo66714b(byte[] bArr) {
        this.f127881e.execute(new blvk(this, bArr));
    }

    /* renamed from: a */
    public final void mo66701a(bluu bluu) {
        this.f127881e.execute(new blvm(this, bluu));
    }

    /* renamed from: a */
    public final void mo66703a(byte[] bArr) {
        this.f127881e.execute(new blvn(this, bArr));
    }
}
