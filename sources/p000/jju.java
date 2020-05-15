package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.os.Handler;
import android.os.ParcelUuid;
import com.google.android.gms.auth.proximity.RemoteDevice;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: jju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jju {

    /* renamed from: a */
    public static final Logger f22638a = jsy.m17256a("BleForegroundAdvertiser");

    /* renamed from: b */
    static final ParcelUuid f22639b = new ParcelUuid(UUID.fromString("0000fe50-0000-1000-8000-00805f9b34fb"));

    /* renamed from: c */
    public final jio f22640c;

    /* renamed from: d */
    public final Set f22641d;

    /* renamed from: e */
    public final List f22642e;

    /* renamed from: f */
    public final List f22643f;

    /* renamed from: g */
    public final Map f22644g;

    /* renamed from: h */
    public final Map f22645h;

    /* renamed from: i */
    public final List f22646i;

    /* renamed from: j */
    public final Handler f22647j;

    /* renamed from: k */
    public final jnc f22648k;

    /* renamed from: l */
    public final jta f22649l;

    /* renamed from: m */
    public final Executor f22650m;

    /* renamed from: n */
    public jjt f22651n;

    /* renamed from: o */
    public jjs f22652o;

    /* renamed from: p */
    public byte[] f22653p;

    /* renamed from: q */
    public Map f22654q;

    /* renamed from: r */
    private final jkh f22655r;

    /* renamed from: s */
    private final BluetoothAdapter f22656s;

    /* renamed from: t */
    private final jla f22657t;

    /* renamed from: u */
    private final jmh f22658u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f22659v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f22660w;

    public jju() {
        jnc jnc;
        jkh a = jkh.m16839a();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        jla jla = new jla();
        adzt adzt = new adzt();
        jle jle = new jle();
        jnc jnc2 = null;
        if (jnc.f22856b != null) {
            jnc = (jnc) jnc.f22856b.get();
        } else {
            jnc = null;
        }
        if (jnc == null) {
            synchronized (jnc.class) {
                jnc2 = jnc.f22856b != null ? (jnc) jnc.f22856b.get() : jnc2;
                if (jnc2 == null) {
                    jnc2 = new jnc();
                    jnc.f22856b = new WeakReference(jnc2);
                }
            }
            jnc = jnc2;
        }
        jio jio = new jio();
        bqgj b = snp.m35704b(10);
        this.f22655r = a;
        this.f22656s = defaultAdapter;
        this.f22657t = jla;
        this.f22647j = adzt;
        this.f22658u = jle;
        this.f22648k = jnc;
        this.f22649l = jsz.m17257a();
        this.f22640c = jio;
        this.f22643f = new ArrayList();
        this.f22641d = new HashSet();
        this.f22642e = new ArrayList();
        this.f22646i = new ArrayList();
        this.f22644g = new C1223np();
        this.f22645h = new HashMap();
        this.f22659v = false;
        this.f22660w = false;
        this.f22650m = b;
    }

    /* renamed from: f */
    private final BluetoothLeAdvertiser m16805f() {
        BluetoothAdapter bluetoothAdapter = this.f22656s;
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.getBluetoothLeAdvertiser();
        }
        return null;
    }

    /* renamed from: c */
    public final void mo13802c() {
        if (this.f22642e.isEmpty()) {
            if (this.f22653p != null || this.f22659v) {
                mo13804e();
            } else {
                this.f22659v = true;
                this.f22658u.mo13848a(new jjl(this, this.f22647j));
            }
            if (!this.f22660w) {
                this.f22660w = true;
                jnc jnc = this.f22648k;
                jjm jjm = new jjm(this, this.f22647j);
                synchronized (jnc.f22859e) {
                    jnc.f22858d.add(jjm);
                    if (!jnc.f22861g) {
                        if (jnc.f22862h) {
                            jnc.f22861g = true;
                            bqga.m112781a(jnc.f22857c.mo25819b(jmy.f22848a), new jmz(jnc), bqfb.INSTANCE);
                        } else {
                            jnc.mo13894a(jnc.f22860f);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo13803d() {
        jjt jjt = this.f22651n;
        if (jjt != null) {
            jjt.mo7777b();
        }
    }

    /* renamed from: e */
    public final void mo13804e() {
        Map map;
        byte[] bArr;
        int i;
        jjp jjp;
        jta jta;
        Map map2;
        int i2;
        int i3;
        RemoteDevice remoteDevice;
        int i4;
        jkw jkw;
        int i5;
        boolean z;
        if (!this.f22659v && (map = this.f22654q) != null && (bArr = this.f22653p) != null) {
            int i6 = 1;
            int i7 = 0;
            if (!this.f22641d.isEmpty()) {
                for (String str : this.f22641d) {
                    if (!this.f22646i.contains(str)) {
                        jio jio = this.f22640c;
                        if (str != null) {
                            List list = jio.f22560b;
                            int size = list.size();
                            RemoteDevice remoteDevice2 = null;
                            for (int i8 = 0; i8 < size; i8++) {
                                RemoteDevice remoteDevice3 = (RemoteDevice) list.get(i8);
                                if (str.equals(remoteDevice3.f11138b)) {
                                    remoteDevice2 = remoteDevice3;
                                }
                            }
                            if (jio.f22560b.remove(remoteDevice2)) {
                                jio.f22560b.add(remoteDevice2);
                            }
                        }
                        if (this.f22644g.containsKey(str)) {
                            this.f22655r.mo13832b(str, 1);
                            mo13798a(str);
                        }
                    }
                }
                this.f22641d.clear();
            }
            jio jio2 = this.f22640c;
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder("Should advertise to the following device IDs: [");
            List list2 = jio2.f22560b;
            int size2 = list2.size();
            int i9 = 0;
            do {
                i = 2;
                if (i9 >= size2) {
                    break;
                }
                RemoteDevice remoteDevice4 = (RemoteDevice) list2.get(i9);
                arrayList.add(remoteDevice4);
                sb.append(remoteDevice4.mo7784a());
                sb.append(',');
                i9++;
            } while (arrayList.size() != 2);
            if (arrayList.isEmpty()) {
                jio.f22559a.mo25412b("No devices to which to advertise.", new Object[0]);
            } else {
                sb.replace(sb.length() - 1, sb.length(), "]");
                jio.f22559a.mo25412b(sb.toString(), new Object[0]);
            }
            sdo.m34970a(arrayList.size() <= 2);
            Iterator it = this.f22643f.iterator();
            while (it.hasNext()) {
                jjq jjq = (jjq) it.next();
                if (!arrayList.contains(jjq.f22631a) || System.currentTimeMillis() > jjq.f22633c) {
                    if (jjq != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sdo.m34974b(z);
                    String str2 = jjq.f22631a.f11138b;
                    mo13798a(str2);
                    this.f22645h.remove(str2);
                    if (this.f22643f.contains(jjq)) {
                        BluetoothLeAdvertiser f = m16805f();
                        if (f == null) {
                            f22638a.mo25416d("BLE advertising is not enabled; cannot stop advertising.", new Object[0]);
                        } else {
                            f.stopAdvertising(jjq.f22632b);
                        }
                    }
                    it.remove();
                }
            }
            int size3 = arrayList.size();
            int i10 = 0;
            while (i10 < size3) {
                RemoteDevice remoteDevice5 = (RemoteDevice) arrayList.get(i10);
                String str3 = remoteDevice5.f11138b;
                List list3 = this.f22643f;
                int size4 = list3.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size4) {
                        List list4 = (List) map.get(remoteDevice5.f11138b);
                        jta a = jsz.m17257a();
                        if (this.f22644g.containsKey(remoteDevice5.f11138b)) {
                            f22638a.mo25418e("Tried to advertise to a device already advertising.", new Object[i7]);
                            a.mo14047c(i6);
                            map2 = map;
                            i3 = i10;
                            i2 = size3;
                        } else {
                            jjp jjp2 = new jjp(remoteDevice5, this);
                            this.f22644g.put(remoteDevice5.f11138b, jjp2);
                            this.f22655r.mo13829a(remoteDevice5.f11138b, i6);
                            if (!mo13801b()) {
                                f22638a.mo25416d("BLE advertising is not enabled; cannot start advertising.", new Object[i7]);
                                a.mo14047c(3);
                                this.f22647j.post(jjp2);
                                map2 = map;
                                i3 = i10;
                                i2 = size3;
                            } else {
                                jla jla = this.f22657t;
                                jta a2 = jsz.m17257a();
                                if (list4 == null) {
                                    jla.f22734a.mo25418e("Tried to advertise with null beacon seeds.", new Object[i7]);
                                    a2.mo14063s(i6);
                                    map2 = map;
                                    jta = a;
                                    jjp = jjp2;
                                    i3 = i10;
                                    remoteDevice = remoteDevice5;
                                    i2 = size3;
                                    i5 = 3;
                                    jkw = null;
                                    i4 = 0;
                                } else {
                                    jkz a3 = jla.mo13843a(list4, cchi.m129674f());
                                    if (a3 == null) {
                                        a2.mo14063s(i);
                                        map2 = map;
                                        jta = a;
                                        jjp = jjp2;
                                        i3 = i10;
                                        remoteDevice = remoteDevice5;
                                        i2 = size3;
                                        i5 = 3;
                                        jkw = null;
                                        i4 = 0;
                                    } else {
                                        i2 = size3;
                                        map2 = map;
                                        i5 = 3;
                                        jta = a;
                                        jjp = jjp2;
                                        i3 = i10;
                                        remoteDevice = remoteDevice5;
                                        jkw = jla.mo13842a(bArr, list4, a3.f22727a, a3.f22728b);
                                        if (jkw == null) {
                                            a2.mo14063s(3);
                                            jkw = null;
                                            i4 = 0;
                                        } else {
                                            i4 = 0;
                                            a2.mo14063s(0);
                                        }
                                    }
                                }
                                if (jkw != null) {
                                    jjo jjo = new jjo(remoteDevice, this);
                                    jta.mo14047c(i4);
                                    m16805f().startAdvertising(new AdvertiseSettings.Builder().setAdvertiseMode(2).setConnectable(true).setTxPowerLevel(i5).build(), new AdvertiseData.Builder().addServiceUuid(f22639b).addServiceData(f22639b, jkw.f22722a).build(), jjo);
                                    this.f22643f.add(new jjq(remoteDevice, jjo, jkw.f22724c));
                                    this.f22647j.postDelayed(jjp, cchi.m129673e());
                                } else {
                                    f22638a.mo25416d("No EID seeds for device %s", remoteDevice.mo7784a());
                                    jta.mo14047c(4);
                                    this.f22647j.post(jjp);
                                }
                            }
                        }
                    } else {
                        map2 = map;
                        i3 = i10;
                        RemoteDevice remoteDevice6 = remoteDevice5;
                        i2 = size3;
                        int i12 = i11 + 1;
                        if (!str3.equals(((jjq) list3.get(i11)).f22631a.f11138b)) {
                            i11 = i12;
                            remoteDevice5 = remoteDevice6;
                            i10 = i3;
                            size3 = i2;
                            map = map2;
                            i6 = 1;
                            i7 = 0;
                            i = 2;
                        } else if (!this.f22644g.containsKey(remoteDevice6.f11138b)) {
                            jjp jjp3 = new jjp(remoteDevice6, this);
                            this.f22644g.put(remoteDevice6.f11138b, jjp3);
                            this.f22655r.mo13829a(remoteDevice6.f11138b, 1);
                            this.f22647j.postDelayed(jjp3, cchi.m129673e());
                        }
                    }
                }
                i10 = i3 + 1;
                size3 = i2;
                map = map2;
                i6 = 1;
                i7 = 0;
                i = 2;
            }
            this.f22654q = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13797a(RemoteDevice remoteDevice) {
        this.f22647j.post(new jjn(this, remoteDevice));
    }

    /* renamed from: b */
    public final boolean mo13801b() {
        return m16805f() != null;
    }

    /* renamed from: a */
    public final void mo13798a(String str) {
        if (this.f22644g.containsKey(str)) {
            ((jjp) this.f22644g.remove(str)).f22628a = true;
        }
    }

    /* renamed from: a */
    public final void mo13799a(List list) {
        this.f22647j.post(new jji(this, list));
    }

    /* renamed from: a */
    public final boolean mo13800a() {
        return this.f22640c.f22560b.size() != 0;
    }
}
