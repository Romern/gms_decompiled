package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import com.google.android.libraries.bluetooth.BluetoothException;
import com.google.android.libraries.bluetooth.BluetoothGattException;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: ayrx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayrx implements Closeable {

    /* renamed from: a */
    public final List f98380a = new ArrayList();

    /* renamed from: b */
    public final aysl f98381b;

    /* renamed from: c */
    aytb f98382c = new aytb(1);

    /* renamed from: d */
    final Map f98383d = new HashMap();

    /* renamed from: e */
    final Map f98384e = new HashMap();

    /* renamed from: f */
    private final aysc f98385f;

    /* renamed from: g */
    private final Map f98386g;

    static {
        ayrx.class.getSimpleName();
        TimeUnit.SECONDS.toMillis(1);
    }

    public ayrx(aysc aysc, aysl aysl, ayrr ayrr) {
        new HashMap();
        this.f98385f = aysc;
        this.f98381b = aysl;
        HashMap hashMap = new HashMap();
        for (ayrq ayrq : ayrr.f98377a.values()) {
            hashMap.putAll(ayrq.f98376a);
        }
        this.f98386g = hashMap;
    }

    /* renamed from: a */
    public final aysd mo54337a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        aysd aysd = (aysd) this.f98386g.get(bluetoothGattCharacteristic);
        if (aysd != null) {
            return aysd;
        }
        throw new BluetoothGattException(String.format("No handler registered for characteristic %s.", bluetoothGattCharacteristic.getUuid()), 6);
    }

    public final void close() {
        try {
            aysc aysc = this.f98385f;
            aysl aysl = this.f98381b;
            aysp aysp = aysc.f98405j;
            if (aysp == null) {
                throw new BluetoothException("Server is not open.");
            } else if (aysc.f98402g.f98426a.getConnectionState(aysl.f98419a, 7) == 2) {
                aysc.f98400e.mo54415b(new ayrz(new Object[]{aysb.CLOSE_CONNECTION}, aysp, aysl), aysc.f98397b);
            }
        } catch (BluetoothException e) {
            throw new IOException("Failed to close connection", e);
        }
    }
}
