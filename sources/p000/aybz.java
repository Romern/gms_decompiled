package p000;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.wearable.node.ble.BluetoothGattHelper$LocalBluetoothGattCallbacks;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: aybz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aybz {

    /* renamed from: a */
    static final long f97088a = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: h */
    public static final /* synthetic */ int f97089h = 0;

    /* renamed from: b */
    public ayca f97090b;

    /* renamed from: c */
    public int f97091c;

    /* renamed from: d */
    public final Object f97092d = new Object();

    /* renamed from: e */
    final BluetoothGatt f97093e = null;

    /* renamed from: f */
    public aybx f97094f = null;

    /* renamed from: g */
    public int f97095g = 1;

    /* renamed from: i */
    private final ReentrantLock f97096i;

    /* renamed from: j */
    private final long f97097j;

    static {
        chnj.f188812a.mo6606a().mo85421at();
    }

    public aybz(Context context, BluetoothManager bluetoothManager, ReentrantLock reentrantLock, Long l) {
        new BluetoothGattHelper$LocalBluetoothGattCallbacks(this);
        bmxy.m108581a(context);
        bmxy.m108581a(bluetoothManager);
        this.f97096i = reentrantLock;
        this.f97097j = l.longValue();
    }

    /* renamed from: e */
    private final void m83789e() {
        this.f97096i.unlock();
    }

    /* renamed from: a */
    public final BluetoothGatt mo53875a(BluetoothGatt bluetoothGatt) {
        throw new aybx(String.format(Locale.US, "Received an event for device %s when not connected.", bluetoothGatt.getDevice()));
    }

    /* renamed from: b */
    public final synchronized void mo53878b() {
        mo53880d();
    }

    /* renamed from: c */
    public final void mo53879c() {
        this.f97092d.notify();
        this.f97095g = 1;
    }

    /* renamed from: d */
    public final synchronized void mo53880d() {
        try {
            if (this.f97096i.tryLock(f97088a, TimeUnit.MILLISECONDS)) {
                try {
                    synchronized (this.f97092d) {
                        aybx aybx = this.f97094f;
                        if (aybx == null) {
                            throw new aybx("BluetoothGattHelper not connected");
                        }
                        try {
                            throw aybx;
                        } catch (Throwable th) {
                            this.f97094f = null;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    m83789e();
                    throw th2;
                }
            } else {
                throw new aycb(String.format(Locale.US, "Cannot acquire bluetooth operation lock after %dms.", Long.valueOf(f97088a)));
            }
        } catch (InterruptedException e) {
            throw new aybx("Got interrupted when acquiring lock", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo53876a() {
        Log.w("BluetoothGattHelper", "mBluetoothGatt is null, not refreshing GATT.");
    }

    /* renamed from: a */
    public final void mo53877a(String str) {
        if (Log.isLoggable("BluetoothGattHelper", 3)) {
            Log.d("BluetoothGattHelper", str);
        }
    }
}
