package p000;

import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattServerCallback;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.content.Context;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: arrv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arrv {

    /* renamed from: a */
    public static final UUID f88188a = UUID.fromString("d2c86762-1035-4d49-948b-f9447afdf495");

    /* renamed from: b */
    public static final UUID f88189b = UUID.fromString("f25241e6-6622-497a-b333-a68e37443243");

    /* renamed from: c */
    public static final UUID f88190c = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");

    /* renamed from: d */
    public static final Charset f88191d = Charset.forName("UTF-8");

    /* renamed from: j */
    public static final Logger f88192j = ascp.m73787a("FastPair", "BleAdvertiser");

    /* renamed from: e */
    public BluetoothLeAdvertiser f88193e;

    /* renamed from: f */
    public final BluetoothManager f88194f;

    /* renamed from: g */
    public final Context f88195g;

    /* renamed from: h */
    public BluetoothGattServer f88196h;

    /* renamed from: i */
    public AdvertiseCallback f88197i;

    /* renamed from: k */
    public final BluetoothGattServerCallback f88198k = new arru(this);

    public arrv(Context context) {
        this.f88194f = (BluetoothManager) context.getSystemService("bluetooth");
        this.f88195g = context;
    }

    /* renamed from: a */
    public static byte[] m73361a(int i) {
        return new byte[]{(byte) (i >> 8), (byte) i};
    }

    /* renamed from: b */
    public final void mo48779b() {
        f88192j.mo25414c("Stop gatt server.", new Object[0]);
        BluetoothGattServer bluetoothGattServer = this.f88196h;
        if (bluetoothGattServer != null) {
            bluetoothGattServer.close();
            this.f88196h = null;
        }
    }

    /* renamed from: a */
    public final void mo48778a() {
        AdvertiseCallback advertiseCallback;
        BluetoothLeAdvertiser bluetoothLeAdvertiser = this.f88193e;
        if (bluetoothLeAdvertiser != null && (advertiseCallback = this.f88197i) != null) {
            bluetoothLeAdvertiser.stopAdvertising(advertiseCallback);
            this.f88197i = null;
            f88192j.mo25412b("stopped advertising.", new Object[0]);
        }
    }
}
