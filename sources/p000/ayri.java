package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.util.Log;
import com.google.android.libraries.bluetooth.BluetoothException;
import com.google.android.libraries.bluetooth.BluetoothGattException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

/* renamed from: ayri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayri implements AutoCloseable {

    /* renamed from: a */
    public static final String f98333a = ayri.class.getSimpleName();

    /* renamed from: b */
    static final long f98334b = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: c */
    static final long f98335c = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: d */
    public final aysm f98336d;

    /* renamed from: e */
    public final aytb f98337e;

    /* renamed from: f */
    public final ayrl f98338f;

    /* renamed from: g */
    public volatile boolean f98339g = false;

    /* renamed from: h */
    public volatile boolean f98340h = false;

    /* renamed from: i */
    public final ConcurrentMap f98341i = new ConcurrentHashMap();

    /* renamed from: j */
    public final List f98342j = new ArrayList();

    /* renamed from: k */
    public long f98343k = f98334b;

    /* renamed from: l */
    private volatile int f98344l = 23;

    public ayri(aysm aysm, aytb aytb, ayrl ayrl) {
        this.f98336d = aysm;
        this.f98337e = aytb;
        this.f98338f = ayrl;
    }

    /* renamed from: a */
    public final BluetoothGattCharacteristic mo54310a(UUID uuid, UUID uuid2) {
        Object[] objArr = {uuid2, uuid};
        if (!this.f98339g) {
            mo54311a();
        }
        ArrayList arrayList = new ArrayList();
        for (BluetoothGattService bluetoothGattService : this.f98336d.mo54363b()) {
            if (bluetoothGattService.getUuid().equals(uuid)) {
                arrayList.addAll(bluetoothGattService.getCharacteristics());
            }
        }
        int size = arrayList.size();
        BluetoothGattCharacteristic bluetoothGattCharacteristic = null;
        for (int i = 0; i < size; i++) {
            BluetoothGattCharacteristic bluetoothGattCharacteristic2 = (BluetoothGattCharacteristic) arrayList.get(i);
            if (bluetoothGattCharacteristic2.getUuid().equals(uuid2)) {
                if (bluetoothGattCharacteristic == null) {
                    bluetoothGattCharacteristic = bluetoothGattCharacteristic2;
                } else {
                    throw new BluetoothException(String.format("More than one characteristic %s found on service %s on device %s.", uuid2, uuid, this.f98336d.mo54358a()));
                }
            }
        }
        if (bluetoothGattCharacteristic != null) {
            return bluetoothGattCharacteristic;
        }
        throw new BluetoothException(String.format("Characteristic %s not found on service %s of device %s.", uuid2, uuid, this.f98336d.mo54358a()));
    }

    /* renamed from: b */
    public final void mo54314b() {
        Log.i(f98333a, "Starting services discovery.");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            this.f98337e.mo54415b(new ayrb(this, ayro.DISCOVER_SERVICES_INTERNAL, this.f98336d), f98335c);
            Log.i(f98333a, String.format("Services discovered successfully in %s ms.", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
        } catch (BluetoothException e) {
            if (e instanceof BluetoothGattException) {
                throw new BluetoothGattException(String.format("Failed to discover services on device: %s.", this.f98336d.mo54358a()), ((BluetoothGattException) e).f111041a, e);
            } else {
                throw new BluetoothException(String.format("Failed to discover services on device: %s.", this.f98336d.mo54358a()), e);
            }
        }
    }

    /* renamed from: c */
    public final ayrh mo54316c(UUID uuid, UUID uuid2) {
        BluetoothGattCharacteristic a = mo54310a(uuid, uuid2);
        return (ayrh) this.f98337e.mo54409a(new ayrg(this, new Object[]{ayro.NOTIFICATION_CHANGE, a}, a));
    }

    /* renamed from: c */
    public final void mo54317c() {
        this.f98340h = true;
    }

    public final void close() {
        aysm aysm;
        try {
            if (this.f98340h) {
                this.f98337e.mo54415b(new ayqz(this, ayro.DISCONNECT, this.f98336d.mo54358a()), this.f98343k);
                aysm = this.f98336d;
            } else {
                aysm = this.f98336d;
            }
            aysm.mo54370f();
        } catch (Throwable th) {
            this.f98336d.mo54370f();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo54311a() {
        this.f98337e.mo54416c(new ayra(this, ayro.DISCOVER_SERVICES));
    }

    /* renamed from: b */
    public final byte[] mo54315b(UUID uuid, UUID uuid2) {
        BluetoothGattCharacteristic a = mo54310a(uuid, uuid2);
        try {
            return (byte[]) this.f98337e.mo54410a(new ayrc(this, new Object[]{ayro.READ_CHARACTERISTIC, this.f98336d, a}, a), this.f98343k);
        } catch (BluetoothException e) {
            throw new BluetoothException(String.format("Failed to read %s on device %s.", aysx.m84755b(a), this.f98336d.mo54358a()), e);
        }
    }

    /* renamed from: a */
    public final void mo54312a(long j) {
        bmxy.m108589a(j > 0, "invalid time out value");
        this.f98343k = j;
    }

    /* renamed from: a */
    public final void mo54313a(UUID uuid, UUID uuid2, byte[] bArr) {
        BluetoothGattCharacteristic a = mo54310a(uuid, uuid2);
        Object[] objArr = {Integer.valueOf(bArr.length), aysx.m84755b(a), this.f98336d.mo54358a()};
        if ((a.getProperties() & 12) != 0) {
            try {
                this.f98337e.mo54415b(new ayrd(this, new Object[]{ayro.WRITE_CHARACTERISTIC, this.f98336d, a}, a, bArr), this.f98343k);
            } catch (BluetoothException e) {
                throw new BluetoothException(String.format("Failed to write %s on device %s.", aysx.m84755b(a), this.f98336d.mo54358a()), e);
            }
        } else {
            throw new BluetoothException(String.format("%s is not writable!", a));
        }
    }
}
