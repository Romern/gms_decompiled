package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: blvr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blvr extends aysr {

    /* renamed from: a */
    private final UUID f127883a;

    /* renamed from: b */
    private final UUID f127884b;

    /* renamed from: d */
    private final UUID f127885d;

    /* renamed from: e */
    private boolean f127886e = false;

    /* renamed from: f */
    private boolean f127887f = false;

    /* renamed from: g */
    private aysp f127888g;

    /* renamed from: h */
    private blvq f127889h;

    /* renamed from: i */
    private final aysr f127890i;

    /* renamed from: j */
    private final Map f127891j = new HashMap();

    /* renamed from: k */
    private final Map f127892k = new HashMap();

    public blvr(UUID uuid, UUID uuid2, UUID uuid3, aysr aysr) {
        this.f127883a = uuid;
        this.f127884b = uuid2;
        this.f127885d = uuid3;
        this.f127890i = aysr;
    }

    /* renamed from: a */
    public final void mo66757a() {
        mo66759a(true);
    }

    /* renamed from: b */
    public final void mo54396b(aysl aysl, int i) {
        int i2 = blvt.f127895c;
        Integer valueOf = Integer.valueOf(i);
        Object[] objArr = {aysl.mo54351b(), valueOf};
        this.f127892k.put(aysl.mo54351b(), valueOf);
        if (this.f127891j.containsKey(aysl.mo54351b())) {
            blvt.f127894a.mo66761a("MTU changed after BluetoothGattServerConnection has been created. The max packet size will not be changed");
        }
        this.f127890i.mo54396b(aysl, i);
    }

    /* renamed from: a */
    public final void mo54339a(int i, BluetoothGattService bluetoothGattService) {
        int i2 = blvt.f127895c;
        Object[] objArr = {bluetoothGattService.getUuid(), Integer.valueOf(i)};
        this.f127890i.mo54339a(i, bluetoothGattService);
    }

    /* renamed from: a */
    public final void mo54340a(aysl aysl, int i) {
        bluu bluu;
        String b = aysl.mo54351b();
        int i2 = blvt.f127895c;
        Object[] objArr = {b, Integer.valueOf(i)};
        this.f127890i.mo54340a(aysl, i);
        blvp blvp = (blvp) this.f127891j.get(b);
        if (blvp == null) {
            String valueOf = String.valueOf(b);
            if (valueOf.length() == 0) {
                new String("Notified unconnected device: ");
            } else {
                "Notified unconnected device: ".concat(valueOf);
            }
        } else {
            if (i != 0) {
                StringBuilder sb = new StringBuilder(30);
                sb.append("failed with status ");
                sb.append(i);
                bluu = bluu.m107620a(new IOException(sb.toString()));
            } else {
                bluu = bluu.m107619a();
            }
            blvp.mo66701a(bluu);
        }
    }

    /* renamed from: b */
    public final synchronized void mo66760b(aysp aysp, blvq blvq) {
        if (!this.f127887f) {
            int i = blvt.f127895c;
            this.f127888g = aysp;
            this.f127889h = blvq;
            this.f127887f = true;
        } else {
            throw new IllegalStateException("GattServer already initialized");
        }
    }

    /* renamed from: a */
    public final void mo54341a(aysl aysl, int i, int i2) {
        String b = aysl.mo54351b();
        int i3 = blvt.f127895c;
        Object[] objArr = {b, Integer.valueOf(i), Integer.valueOf(i2)};
        this.f127890i.mo54341a(aysl, i, i2);
        if (i == 0 && i2 == 2) {
            new Object[1][0] = b;
            return;
        }
        new Object[1][0] = b;
        this.f127892k.remove(b);
        blvp blvp = (blvp) this.f127891j.remove(b);
        if (blvp != null) {
            blvp.mo66710e();
            this.f127888g.mo54383a(aysl);
        }
        if (this.f127886e && this.f127891j.isEmpty()) {
            this.f127886e = false;
            this.f127888g.mo54382a();
        }
    }

    /* renamed from: a */
    public final void mo13807a(aysl aysl, int i, int i2, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        int i3 = blvt.f127895c;
        Object[] objArr = {aysl.mo54351b(), bluetoothGattCharacteristic.getUuid(), Integer.valueOf(i), Integer.valueOf(i2)};
        this.f127890i.mo13807a(aysl, i, i2, bluetoothGattCharacteristic);
    }

    /* renamed from: a */
    public final void mo54342a(aysl aysl, int i, int i2, BluetoothGattDescriptor bluetoothGattDescriptor) {
        int i3 = blvt.f127895c;
        Object[] objArr = {aysl.mo54351b(), bluetoothGattDescriptor.getUuid(), Integer.valueOf(i), Integer.valueOf(i2)};
        this.f127890i.mo54342a(aysl, i, i2, bluetoothGattDescriptor);
    }

    /* renamed from: a */
    public final void mo54343a(aysl aysl, int i, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, boolean z2, int i2, byte[] bArr) {
        String b = aysl.mo54351b();
        int i3 = blvt.f127895c;
        Object[] objArr = {b, bluetoothGattCharacteristic.getUuid(), Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z), Boolean.valueOf(z2), Arrays.toString(bArr)};
        this.f127890i.mo54343a(aysl, i, bluetoothGattCharacteristic, z, z2, i2, bArr);
        if (z2) {
            this.f127888g.mo54384a(aysl, i, 0, i2, null);
        }
        if (!this.f127885d.equals(bluetoothGattCharacteristic.getUuid())) {
            blvt.f127894a.mo66762a("unrecognized characteristic written %s", bluetoothGattCharacteristic.getUuid());
            return;
        }
        blvp blvp = (blvp) this.f127891j.get(b);
        if (blvp == null) {
            blvt.f127894a.mo66762a("Device %s not connected yet", b);
            return;
        }
        blvp.mo66703a(bArr);
    }

    /* renamed from: a */
    public final void mo54344a(aysl aysl, int i, BluetoothGattDescriptor bluetoothGattDescriptor, boolean z, boolean z2, int i2, byte[] bArr) {
        int i3;
        String b = aysl.mo54351b();
        int i4 = blvt.f127895c;
        Object[] objArr = {b, bluetoothGattDescriptor.getUuid(), Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z), Boolean.valueOf(z2), Arrays.toString(bArr)};
        this.f127890i.mo54344a(aysl, i, bluetoothGattDescriptor, z, z2, i2, bArr);
        if (z2) {
            this.f127888g.mo54384a(aysl, i, 0, i2, null);
        }
        if (this.f127891j.containsKey(b)) {
            blvt.f127894a.mo66762a("Device %s already connected and subscribed to indications", b);
        } else if (!bluetoothGattDescriptor.getCharacteristic().getUuid().equals(this.f127884b)) {
        } else {
            if (!Arrays.equals(bArr, BluetoothGattDescriptor.ENABLE_INDICATION_VALUE) || !bluetoothGattDescriptor.getUuid().equals(blvs.f127893a)) {
                this.f127889h.mo13806a(new blut(String.format("Device %s wrote an unexpected descriptor value", b)));
                return;
            }
            if (aysl.mo54352c() == 2) {
                this.f127888g.mo54386b(aysl);
            } else {
                new Object[1][0] = Integer.valueOf(aysl.mo54352c());
            }
            BluetoothGattCharacteristic characteristic = bluetoothGattDescriptor.getCharacteristic();
            aysp aysp = this.f127888g;
            String b2 = aysl.mo54351b();
            if (this.f127892k.containsKey(b2)) {
                i3 = ((Integer) this.f127892k.get(b2)).intValue() - 3;
            } else {
                i3 = 20;
            }
            blvp blvp = new blvp(aysp, aysl, characteristic, i3);
            this.f127891j.put(b, blvp);
            this.f127889h.mo13805a(blvp);
        }
    }

    /* renamed from: a */
    public final void mo54345a(aysl aysl, int i, boolean z) {
        int i2 = blvt.f127895c;
        Object[] objArr = {aysl.mo54351b(), Integer.valueOf(i), Boolean.valueOf(z)};
        this.f127890i.mo54345a(aysl, i, z);
    }

    /* renamed from: a */
    public final synchronized void mo66758a(aysp aysp, blvq blvq) {
        if (!this.f127887f) {
            int i = blvt.f127895c;
            this.f127888g = aysp;
            this.f127889h = blvq;
            BluetoothGattService bluetoothGattService = new BluetoothGattService(this.f127883a, 0);
            BluetoothGattDescriptor bluetoothGattDescriptor = new BluetoothGattDescriptor(blvs.f127893a, 16);
            BluetoothGattCharacteristic bluetoothGattCharacteristic = new BluetoothGattCharacteristic(this.f127884b, 32, 0);
            bluetoothGattCharacteristic.addDescriptor(bluetoothGattDescriptor);
            BluetoothGattCharacteristic bluetoothGattCharacteristic2 = new BluetoothGattCharacteristic(this.f127885d, 8, 16);
            bluetoothGattService.addCharacteristic(bluetoothGattCharacteristic);
            bluetoothGattService.addCharacteristic(bluetoothGattCharacteristic2);
            this.f127888g.mo54385a(bluetoothGattService);
            this.f127887f = true;
            this.f127886e = false;
        } else {
            throw new IllegalStateException("GattServer already initialized");
        }
    }

    /* renamed from: a */
    public final void mo66759a(boolean z) {
        int i = blvt.f127895c;
        if (this.f127888g == null) {
            return;
        }
        if (!this.f127891j.isEmpty()) {
            this.f127886e = true;
            if (z) {
                for (blvp blvp : this.f127891j.values()) {
                    blvp.mo66713b();
                }
                return;
            }
            return;
        }
        this.f127888g.mo54382a();
    }
}
