package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
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

/* renamed from: bede */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bede implements AutoCloseable {

    /* renamed from: a */
    static final long f106935a = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: b */
    static final long f106936b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c */
    public volatile boolean f106937c = false;

    /* renamed from: d */
    public volatile boolean f106938d = true;

    /* renamed from: e */
    public final aysm f106939e;

    /* renamed from: f */
    public final ConcurrentMap f106940f = new ConcurrentHashMap();

    /* renamed from: g */
    public final List f106941g = new ArrayList();

    /* renamed from: h */
    public long f106942h = f106935a;

    /* renamed from: i */
    private volatile int f106943i = 23;

    /* renamed from: j */
    private final aytb f106944j;

    public bede(aysm aysm, aytb aytb) {
        this.f106939e = aysm;
        this.f106944j = aytb;
    }

    /* renamed from: a */
    public final BluetoothGattCharacteristic mo58563a(UUID uuid, UUID uuid2) {
        Object[] objArr = {uuid2, uuid};
        BluetoothGattCharacteristic bluetoothGattCharacteristic = null;
        for (BluetoothGattCharacteristic bluetoothGattCharacteristic2 : mo58564a(uuid).getCharacteristics()) {
            if (bluetoothGattCharacteristic2.getUuid().equals(uuid2)) {
                if (bluetoothGattCharacteristic == null) {
                    bluetoothGattCharacteristic = bluetoothGattCharacteristic2;
                } else {
                    throw new BluetoothException(String.format("More than one characteristic %s found on service %s on device %s.", uuid2, uuid, this.f106939e.mo54358a()));
                }
            }
        }
        if (bluetoothGattCharacteristic != null) {
            return bluetoothGattCharacteristic;
        }
        throw new BluetoothException(String.format("Characteristic %s not found on service %s of device %s.", uuid2, uuid, this.f106939e.mo54358a()));
    }

    /* renamed from: b */
    public final void mo58568b() {
        Log.i("Coffee-BluetoothGattConnection", "Starting services discovery.");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            this.f106944j.mo54415b(new becy(this, bedi.DISCOVER_SERVICES_INTERNAL, this.f106939e), f106936b);
            Log.i("Coffee-BluetoothGattConnection", String.format("Services discovered successfully in %s ms.", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
        } catch (BluetoothException e) {
            if (e instanceof BluetoothGattException) {
                throw new BluetoothGattException(String.format("Failed to discover services on device: %s.", this.f106939e.mo54358a()), ((BluetoothGattException) e).f111041a, e);
            } else {
                throw new BluetoothException(String.format("Failed to discover services on device: %s.", this.f106939e.mo54358a()), e);
            }
        }
    }

    /* renamed from: c */
    public final bedd mo58570c(UUID uuid, UUID uuid2) {
        BluetoothGattCharacteristic a = mo58563a(uuid, uuid2);
        return (bedd) this.f106944j.mo54409a(new bedc(this, new Object[]{bedi.NOTIFICATION_CHANGE, a}, a));
    }

    public final void close() {
        aysm aysm;
        try {
            if (this.f106938d) {
                this.f106944j.mo54415b(new becw(this, bedi.DISCONNECT, this.f106939e.mo54358a()), this.f106942h);
                aysm = this.f106939e;
            } else {
                aysm = this.f106939e;
            }
            aysm.mo54370f();
        } catch (Throwable th) {
            this.f106939e.mo54370f();
            throw th;
        }
    }

    /* renamed from: d */
    public final void mo58572d(UUID uuid, UUID uuid2) {
        BluetoothGattCharacteristic a = mo58563a(uuid, uuid2);
        this.f106944j.mo54416c(new becv(this, new Object[]{bedi.NOTIFICATION_CHANGE, a}, a));
    }

    /* renamed from: a */
    public final BluetoothGattService mo58564a(UUID uuid) {
        new Object[1][0] = uuid;
        if (!this.f106937c) {
            this.f106944j.mo54416c(new becx(this, bedi.DISCOVER_SERVICES));
        }
        BluetoothGattService bluetoothGattService = null;
        for (BluetoothGattService bluetoothGattService2 : this.f106939e.mo54363b()) {
            if (bluetoothGattService2.getUuid().equals(uuid)) {
                if (bluetoothGattService == null) {
                    bluetoothGattService = bluetoothGattService2;
                } else {
                    throw new BluetoothException(String.format("More than one service %s found on device %s.", uuid, this.f106939e.mo54358a()));
                }
            }
        }
        if (bluetoothGattService != null) {
            return bluetoothGattService;
        }
        throw new BluetoothException(String.format("Service %s not found on device %s.", uuid, this.f106939e.mo54358a()));
    }

    /* renamed from: b */
    public final byte[] mo58569b(UUID uuid, UUID uuid2) {
        BluetoothGattCharacteristic a = mo58563a(uuid, uuid2);
        try {
            return (byte[]) this.f106944j.mo54410a(new becz(this, new Object[]{bedi.READ_CHARACTERISTIC, this.f106939e, a}, a), this.f106942h);
        } catch (BluetoothException e) {
            throw new BluetoothException(String.format("Failed to read %s on device %s.", aysx.m84755b(a), this.f106939e.mo54358a()), e);
        }
    }

    /* renamed from: a */
    public final aysl mo58565a() {
        return this.f106939e.mo54358a();
    }

    /* renamed from: a */
    public final void mo58566a(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        boolean z2;
        String str;
        String str2;
        byte[] bArr;
        BluetoothGattCharacteristic bluetoothGattCharacteristic2 = bluetoothGattCharacteristic;
        int properties = bluetoothGattCharacteristic.getProperties();
        if ((properties & 16) != 0) {
            z2 = false;
        } else if ((properties & 32) != 0) {
            z2 = true;
        } else {
            throw new BluetoothException(String.format("%s on device %s supports neither notifications nor indications.", aysx.m84755b(bluetoothGattCharacteristic), this.f106939e.mo54358a()));
        }
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic2.getDescriptor(aynb.f98002a);
        if (descriptor != null) {
            long currentTimeMillis = System.currentTimeMillis();
            Object[] objArr = new Object[3];
            if (!z) {
                str = "Disabling";
            } else {
                str = "Enabling";
            }
            objArr[0] = str;
            if (!z2) {
                str2 = "notification";
            } else {
                str2 = "indication";
            }
            objArr[1] = str2;
            objArr[2] = bluetoothGattCharacteristic.getUuid();
            if (z) {
                this.f106939e.mo54359a(bluetoothGattCharacteristic2, true);
            }
            if (!z) {
                bArr = BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE;
            } else {
                bArr = !z2 ? BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE : BluetoothGattDescriptor.ENABLE_INDICATION_VALUE;
            }
            Object[] objArr2 = {Integer.valueOf(bArr.length), aysx.m84756b(descriptor), this.f106939e.mo54358a()};
            long currentTimeMillis2 = System.currentTimeMillis();
            try {
                this.f106944j.mo54415b(new bedb(this, new Object[]{bedi.WRITE_DESCRIPTOR, this.f106939e, descriptor}, descriptor, bArr), this.f106942h);
                new Object[1][0] = Long.valueOf(System.currentTimeMillis() - currentTimeMillis2);
                if (!z) {
                    this.f106939e.mo54359a(bluetoothGattCharacteristic2, false);
                }
                new Object[1][0] = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
            } catch (BluetoothException e) {
                throw new BluetoothException(String.format("Failed to write %s on device %s.", aysx.m84756b(descriptor), this.f106939e.mo54358a()), e);
            }
        } else {
            throw new BluetoothException(String.format("%s on device %s is missing client config descriptor.", aysx.m84755b(bluetoothGattCharacteristic), this.f106939e.mo54358a()));
        }
    }

    /* renamed from: a */
    public final void mo58567a(UUID uuid, UUID uuid2, byte[] bArr) {
        BluetoothGattCharacteristic a = mo58563a(uuid, uuid2);
        Object[] objArr = {Integer.valueOf(bArr.length), aysx.m84755b(a), this.f106939e.mo54358a()};
        if ((a.getProperties() & 12) != 0) {
            try {
                this.f106944j.mo54415b(new beda(this, new Object[]{bedi.WRITE_CHARACTERISTIC, this.f106939e, a}, a, bArr), this.f106942h);
            } catch (BluetoothException e) {
                throw new BluetoothException(String.format("Failed to write %s on device %s.", aysx.m84755b(a), this.f106939e.mo54358a()), e);
            }
        } else {
            throw new BluetoothException(String.format("%s is not writable!", a));
        }
    }
}
