package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Future;

/* renamed from: blvi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blvi extends ayso {

    /* renamed from: a */
    private final Context f127859a;

    /* renamed from: c */
    private final Integer f127860c;

    /* renamed from: d */
    private final int f127861d;

    /* renamed from: e */
    private final blvj f127862e;

    /* renamed from: f */
    private final UUID f127863f;

    /* renamed from: g */
    private final UUID f127864g;

    /* renamed from: h */
    private final UUID f127865h;

    /* renamed from: i */
    private final Map f127866i = new HashMap();

    /* renamed from: j */
    private final Map f127867j = new HashMap();

    /* renamed from: k */
    private final Set f127868k = new HashSet();

    public blvi(Context context, Integer num, blvj blvj, UUID uuid, UUID uuid2, UUID uuid3, int i) {
        this.f127859a = context;
        this.f127860c = num;
        this.f127862e = blvj;
        this.f127863f = uuid;
        this.f127864g = uuid2;
        this.f127865h = uuid3;
        this.f127861d = i;
    }

    /* renamed from: a */
    private final blvg m107656a(aysm aysm) {
        blvg blvg = (blvg) this.f127867j.get(aysm);
        if (blvg != null) {
            return blvg;
        }
        throw new IllegalStateException("missing BleConnection");
    }

    /* renamed from: b */
    private final blvh m107657b(aysm aysm) {
        blvh blvh = (blvh) this.f127866i.remove(aysm);
        if (blvh != null) {
            return blvh;
        }
        throw new IllegalStateException("missing PendingConnection");
    }

    /* renamed from: a */
    public final synchronized Future mo66750a(String str) {
        blvh blvh;
        try {
            aysm a = this.f127862e.mo13778a(this.f127859a, str, this);
            blvh = new blvh(a);
            this.f127866i.put(a, blvh);
        } catch (IOException e) {
            blvh blvh2 = new blvh(null);
            blvh2.mo66744a(e);
            return blvh2;
        }
        return blvh;
    }

    /* renamed from: b */
    public final void mo54329b(aysm aysm, int i, int i2) {
        int i3 = blvt.f127895c;
        new Object[1][0] = Integer.valueOf(i);
        if (i2 != 0) {
            blvt.f127894a.mo66761a("Failed to change mtu.");
        }
        if (this.f127868k.contains(aysm)) {
            blvt.f127894a.mo66761a("Duplicate onMtuChanged callback received.");
            return;
        }
        this.f127868k.add(aysm);
        Integer num = this.f127860c;
        if (num != null && !aysm.mo54360a(num.intValue())) {
            blvt.f127894a.mo66761a("request connection priority failed");
        }
        if (!aysm.mo54366c()) {
            m107657b(aysm).mo66744a(new IOException("service discovery failed"));
        }
    }

    /* renamed from: a */
    public final synchronized void mo54323a(aysm aysm, int i) {
        if (i == 0) {
            try {
                blut blut = null;
                for (BluetoothGattService bluetoothGattService : aysm.mo54363b()) {
                    if (bluetoothGattService.getUuid().equals(this.f127863f)) {
                        BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(this.f127864g);
                        if (characteristic == null) {
                            String valueOf = String.valueOf(this.f127864g);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                            sb.append("missing client tx characteristic ");
                            sb.append(valueOf);
                            blut = new blut(sb.toString());
                        } else {
                            BluetoothGattCharacteristic characteristic2 = bluetoothGattService.getCharacteristic(this.f127865h);
                            if (characteristic2 == null) {
                                String valueOf2 = String.valueOf(this.f127865h);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
                                sb2.append("missing client rx characteristic ");
                                sb2.append(valueOf2);
                                blut = new blut(sb2.toString());
                            } else {
                                BluetoothGattDescriptor descriptor = characteristic2.getDescriptor(blvs.f127893a);
                                if (descriptor == null) {
                                    blut = new blut("missing client characteristic configuration descriptor for client rx characteristic");
                                } else {
                                    blvh blvh = (blvh) this.f127866i.get(aysm);
                                    if (blvh != null) {
                                        blvh.f127856c = characteristic;
                                        descriptor.setValue(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
                                        aysm.mo54359a(characteristic2, true);
                                        aysm.mo54362a(descriptor);
                                    } else {
                                        throw new IllegalStateException("missing PendingConnection");
                                    }
                                }
                            }
                        }
                    }
                }
                if (blut == null) {
                    String valueOf3 = String.valueOf(this.f127863f);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 16);
                    sb3.append("missing service ");
                    sb3.append(valueOf3);
                    throw new blut(sb3.toString());
                }
                throw blut;
            } catch (IOException e) {
                blvt blvt = blvt.f127894a;
                if (Log.isLoggable(blvt.f127896b, 5)) {
                    Log.w(blvt.f127896b, e);
                }
                m107657b(aysm).mo66744a(e);
            } finally {
            }
        } else {
            StringBuilder sb4 = new StringBuilder(48);
            sb4.append("service discovery failed with status ");
            sb4.append(i);
            throw new IOException(sb4.toString());
        }
    }

    /* renamed from: b */
    public final synchronized void mo54330b(aysm aysm, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        bluu bluu;
        int i2 = blvt.f127895c;
        Object[] objArr = {bluetoothGattCharacteristic.getUuid(), Integer.valueOf(i)};
        if (!this.f127864g.equals(bluetoothGattCharacteristic.getUuid())) {
            blvt.f127894a.mo66762a("unrecognized characteristic written %s", bluetoothGattCharacteristic.getUuid());
            return;
        }
        blvg a = m107656a(aysm);
        if (i == 0) {
            bluu = bluu.m107619a();
        } else {
            StringBuilder sb = new StringBuilder(30);
            sb.append("failed with status ");
            sb.append(i);
            bluu = bluu.m107620a(new IOException(sb.toString()));
        }
        a.mo66701a(bluu);
    }

    /* renamed from: b */
    public final synchronized void mo54331b(aysm aysm, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        int i2 = blvt.f127895c;
        Object[] objArr = {bluetoothGattDescriptor.getUuid(), Integer.valueOf(i)};
        if (blvs.f127893a.equals(bluetoothGattDescriptor.getUuid())) {
            if (this.f127865h.equals(bluetoothGattDescriptor.getCharacteristic().getUuid())) {
                blvh b = m107657b(aysm);
                byte[] value = bluetoothGattDescriptor.getValue();
                if (!Arrays.equals(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE, value)) {
                    String valueOf = String.valueOf(Arrays.toString(value));
                    String str = valueOf.length() == 0 ? new String("unexpected descriptor value ") : "unexpected descriptor value ".concat(valueOf);
                    blvt.f127894a.mo66761a(str);
                    b.mo66744a(new blut(str));
                    return;
                }
                blvg blvg = new blvg(aysm, b.f127856c, this.f127861d - 3);
                this.f127867j.put(aysm, blvg);
                b.f127855b = blvg;
                b.f127854a.countDown();
                return;
            }
        }
        blvt.f127894a.mo66762a("unrecognized descriptor written %s for characteristic %s", bluetoothGattDescriptor.getUuid(), bluetoothGattDescriptor.getCharacteristic().getUuid());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0077, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo54324a(aysm aysm, int i, int i2) {
        int i3 = blvt.f127895c;
        Integer valueOf = Integer.valueOf(i2);
        Object[] objArr = {Integer.valueOf(i), valueOf};
        if (i == 0) {
            if (i2 == 2) {
                int i4 = Build.VERSION.SDK_INT;
                if (!aysm.mo54364b(this.f127861d)) {
                    blvt.f127894a.mo66761a("request mtu failed");
                    if (!aysm.mo54366c()) {
                        m107657b(aysm).mo66744a(new IOException("service discovery failed"));
                        return;
                    }
                }
            }
        }
        this.f127868k.remove(aysm);
        blvh blvh = (blvh) this.f127866i.remove(aysm);
        if (blvh != null) {
            blvh.mo66744a(new IOException(String.format(Locale.US, "Connection failed. status: %d, state: %d", Integer.valueOf(i), valueOf)));
        }
        blvg blvg = (blvg) this.f127867j.remove(aysm);
        if (blvg != null) {
            blvg.mo66710e();
        }
    }

    /* renamed from: a */
    public final synchronized void mo54325a(aysm aysm, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        int i = blvt.f127895c;
        Object[] objArr = {bluetoothGattCharacteristic.getUuid(), Arrays.toString(bluetoothGattCharacteristic.getValue())};
        if (!this.f127865h.equals(bluetoothGattCharacteristic.getUuid())) {
            blvt.f127894a.mo66762a("unrecognized characteristic changed %s", bluetoothGattCharacteristic.getUuid());
            return;
        }
        m107656a(aysm).mo66703a(bluetoothGattCharacteristic.getValue());
    }

    /* renamed from: a */
    public final synchronized void mo54326a(aysm aysm, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        int i2 = blvt.f127895c;
        Object[] objArr = {bluetoothGattCharacteristic.getUuid(), Integer.valueOf(i)};
    }

    /* renamed from: a */
    public final synchronized void mo54327a(aysm aysm, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        int i2 = blvt.f127895c;
        Object[] objArr = {bluetoothGattDescriptor.getUuid(), Integer.valueOf(i)};
    }
}
