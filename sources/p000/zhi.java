package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: zhi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zhi implements zgf, zgt {

    /* renamed from: a */
    public static final srn f55079a = zvt.m46581a();

    /* renamed from: j */
    private static final bnic f55080j = bnic.m109494a(yqj.MANUFACTURER_NAME.f54404j, yqj.DEVICE_NAME.f54404j, yqj.MODEL_NUMBER.f54404j, yqj.FIRMWARE_REVISION.f54404j, yqj.HARDWARE_REVISION.f54404j, yqj.SOFTWARE_REVISION.f54404j, new UUID[0]);

    /* renamed from: b */
    public final zha f55081b;

    /* renamed from: c */
    public final zlf f55082c;

    /* renamed from: d */
    public String f55083d;

    /* renamed from: e */
    public String f55084e;

    /* renamed from: f */
    public String f55085f;

    /* renamed from: g */
    public String f55086g;

    /* renamed from: h */
    public String f55087h;

    /* renamed from: i */
    public String f55088i;

    /* renamed from: k */
    private final bngx f55089k;

    /* renamed from: l */
    private final zgq f55090l;

    /* renamed from: m */
    private final bnmu f55091m;

    /* renamed from: n */
    private final bqgy f55092n;

    /* renamed from: o */
    private final bnmu f55093o;

    /* renamed from: p */
    private final Map f55094p = new HashMap();

    public zhi(Context context, Handler handler, zhm zhm, zhl zhl, List list) {
        int i;
        int i2;
        soc soc = new soc(1, 10);
        soc.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
        this.f55081b = new zha(context, zhm, zhl, handler, soc, this);
        this.f55089k = bngx.m109368a((Collection) list);
        this.f55091m = bnge.m109299s();
        this.f55092n = bqgy.m112818c();
        this.f55093o = bnge.m109299s();
        bngs j = bngx.m109377j();
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            yqo yqo = (yqo) list.get(i4);
            bnrd a = yqo.mo30678e().iterator();
            while (true) {
                i2 = i4 + 1;
                if (!a.hasNext()) {
                    break;
                }
                j.mo67668c(yqo.mo30674a((caah) a.next()));
            }
            i4 = i2;
        }
        yqg yqg = new yqg(1, 1, Long.MAX_VALUE, TimeUnit.MICROSECONDS, false, false);
        HashMap hashMap = new HashMap();
        int size2 = list.size();
        while (i3 < size2) {
            yqo yqo2 = (yqo) list.get(i3);
            bnrd a2 = yqo2.mo30676c().values().iterator();
            while (a2.hasNext()) {
                caah caah = (caah) a2.next();
                hashMap.put(caah, (yqg) yqo2.mo30677d().get(caah));
            }
            bnrd a3 = yqo2.mo30678e().iterator();
            while (true) {
                i = i3 + 1;
                if (!a3.hasNext()) {
                    break;
                }
                hashMap.put((caah) a3.next(), yqg);
            }
            i3 = i;
        }
        this.f55082c = zlf.m45677a(context, this, bnhe.m109413a(hashMap));
        this.f55090l = new zgq(this.f55082c, j.mo67664a(), zhm.mo31125a());
    }

    /* renamed from: a */
    private final caae m45434a(caah caah, caaq caaq) {
        String str = this.f55083d;
        if (str == null) {
            str = this.f55081b.mo31107a();
        }
        yyc a = yyd.m44987a();
        a.mo30856a(caad.RAW);
        a.mo30857a(caah);
        a.mo30858a(caaq);
        a.mo30860b(str);
        a.mo30859a(bmxx.m108578b(str));
        return a.mo30854a();
    }

    /* renamed from: b */
    private final synchronized void m45435b(List list) {
        bnhp b = bnht.m109442b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) it.next();
            bnre i = this.f55089k.listIterator();
            while (true) {
                if (i.hasNext()) {
                    yqo yqo = (yqo) i.next();
                    if (yqo.mo30676c().containsKey(bluetoothGattCharacteristic.getUuid())) {
                        UUID uuid = bluetoothGattCharacteristic.getUuid();
                        caah caah = (caah) yqo.mo30676c().get(bluetoothGattCharacteristic.getUuid());
                        synchronized (this.f55093o) {
                            this.f55093o.mo67268a(uuid, caah);
                        }
                        this.f55094p.put(new zhp(uuid, caah), yqo);
                        b.mo67730b(caah, bluetoothGattCharacteristic);
                        if (this.f55091m.mo67271d(caah)) {
                            this.f55081b.mo31106a(bluetoothGattCharacteristic);
                        }
                    }
                }
            }
            while (true) {
            }
        }
        this.f55092n.mo69138b(b.mo67731c());
    }

    /* renamed from: c */
    private final synchronized void m45436c() {
        if (this.f55091m.mo67314m()) {
            this.f55081b.mo31109a(false);
        }
    }

    /* renamed from: d */
    private final caaq m45438d() {
        String b = bmxx.m108578b(this.f55085f);
        String str = this.f55084e;
        if (str == null && (str = this.f55083d) == null) {
            str = bmxx.m108578b(this.f55081b.mo31107a());
        }
        return yyh.m45003a(b, str, this.f55081b.mo31111b(), caap.UNKNOWN, 2);
    }

    /* renamed from: a */
    public final bqgg mo19154a() {
        return zge.m45363a();
    }

    /* renamed from: c */
    private final boolean m45437c(caah caah) {
        bnre i = this.f55089k.listIterator();
        while (i.hasNext()) {
            if (((yqo) i.next()).mo30678e().contains(caah)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final bqgg mo31114a(cacv cacv) {
        zha zha = this.f55081b;
        zha.mo31108a(new zgv(zha));
        return bqdx.m112674a(bqdx.m112673a(zha.f55057g, new zhc(this), bqfb.INSTANCE), new zhb(this, cacv), bqfb.INSTANCE);
    }

    /* renamed from: b */
    public final bngx mo19161b(caah caah) {
        if (!mo19159a(caah)) {
            return bngx.m109376e();
        }
        if (m45437c(caah)) {
            return this.f55090l.mo19161b(caah);
        }
        bngx a = bngx.m109356a(m45434a(caah, m45438d()));
        a.size();
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo31116b() {
        bnic a;
        zgq zgq = this.f55090l;
        synchronized (zgq) {
            a = bnic.m109495a((Collection) zgq.f55173c.keySet());
        }
        bnrd a2 = a.iterator();
        while (a2.hasNext()) {
            zgq.mo19160a((zgg) a2.next());
        }
        for (zgg zgg : this.f55091m.mo67317p()) {
            mo19160a(zgg);
        }
        m45436c();
    }

    /* renamed from: a */
    public final bqgg mo31115a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) it.next();
            if (f55080j.contains(bluetoothGattCharacteristic.getUuid())) {
                arrayList.add(this.f55081b.mo31110b(bluetoothGattCharacteristic));
            }
        }
        m45435b(list);
        return bqga.m112774a((Iterable) arrayList);
    }

    /* renamed from: a */
    public final synchronized bqgg mo19155a(zgh zgh) {
        caae caae = zgh.f55011a;
        if (mo19158a(caae)) {
            caah caah = caae.f172330f;
            if (caah == null) {
                caah = caah.f172333d;
            }
            if (!m45437c(caah)) {
                this.f55091m.mo67268a(caah, zgh.f55012b);
                return bqdx.m112674a(this.f55092n, new zhd(this, caah), bqfb.INSTANCE);
            }
            return this.f55090l.mo19155a(zgh);
        }
        return bqga.m112775a((Object) false);
    }

    /* renamed from: a */
    public final void mo31097a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        bngx a;
        if (f55080j.contains(bluetoothGattCharacteristic.getUuid())) {
            if (yqj.MANUFACTURER_NAME.f54404j.equals(bluetoothGattCharacteristic.getUuid())) {
                this.f55085f = bluetoothGattCharacteristic.getStringValue(0);
            }
            if (yqj.DEVICE_NAME.f54404j.equals(bluetoothGattCharacteristic.getUuid())) {
                this.f55083d = bluetoothGattCharacteristic.getStringValue(0);
            }
            if (yqj.MODEL_NUMBER.f54404j.equals(bluetoothGattCharacteristic.getUuid())) {
                this.f55084e = bluetoothGattCharacteristic.getStringValue(0);
            }
            if (yqj.FIRMWARE_REVISION.f54404j.equals(bluetoothGattCharacteristic.getUuid())) {
                this.f55087h = bluetoothGattCharacteristic.getStringValue(0);
            }
            if (yqj.HARDWARE_REVISION.f54404j.equals(bluetoothGattCharacteristic.getUuid())) {
                this.f55086g = bluetoothGattCharacteristic.getStringValue(0);
            }
            if (yqj.SOFTWARE_REVISION.f54404j.equals(bluetoothGattCharacteristic.getUuid())) {
                this.f55088i = bluetoothGattCharacteristic.getStringValue(0);
            }
            zgq zgq = this.f55090l;
            caaq d = m45438d();
            bnre i = zgq.f55172b.listIterator();
            while (i.hasNext()) {
                ((yqm) ((yqf) i.next())).mo30671a(d);
            }
        }
        synchronized (this.f55093o) {
            a = bngx.m109368a((Collection) ((bndq) this.f55093o).mo67127c(bluetoothGattCharacteristic.getUuid()));
        }
        if (!a.isEmpty()) {
            bnre i2 = a.listIterator();
            while (i2.hasNext()) {
                caah caah = (caah) i2.next();
                zhp zhp = new zhp(bluetoothGattCharacteristic.getUuid(), caah);
                synchronized (this) {
                    if (this.f55091m.mo67271d(caah)) {
                        bngx a2 = bngx.m109368a((Collection) ((bndq) this.f55091m).mo67127c(caah));
                        yqo yqo = (yqo) this.f55094p.get(zhp);
                        cadn a3 = yqo.mo30672a(m45434a(caah, m45438d()), bluetoothGattCharacteristic);
                        if (a3 != null) {
                            bnre i3 = a2.listIterator();
                            while (i3.hasNext()) {
                                try {
                                    ((zgg) i3.next()).mo30949a(bngx.m109356a(a3));
                                } catch (RemoteException e) {
                                    bnsl bnsl = (bnsl) f55079a.mo68387b();
                                    bnsl.mo68437a(e);
                                    bnsl.mo68424a("Bluetooth device: %s : %s", this.f55081b.mo31107a(), "Exception while notifying listeners");
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo19156a(PrintWriter printWriter) {
        zha zha = this.f55081b;
        synchronized (zha.f55058h) {
            printWriter.append((CharSequence) "  BleDeviceConnectionManager[");
            zhr zhr = zha.f55063m;
            printWriter.append((CharSequence) "    GattRequestPermit[");
            printWriter.append((CharSequence) "      requestPermitQueueLength=").append((CharSequence) Integer.toString(zhr.f55099b.getQueueLength())).append((CharSequence) "\n");
            printWriter.append((CharSequence) "      config[bleRequestTimeoutSecs=").append((CharSequence) Integer.toString((int) cdzd.m135476e())).append((CharSequence) "]\n");
            printWriter.append((CharSequence) "      requestPermitHolder=").append((CharSequence) zhr.f55100c).append((CharSequence) "\n");
            printWriter.append((CharSequence) "    ]\n");
            printWriter.append((CharSequence) "    BluetoothDevice=").append((CharSequence) zha.f55055e.toString()).append((CharSequence) "\n");
            printWriter.append((CharSequence) "    GattState=").append((CharSequence) Integer.toString(zha.f55059i.f55040a)).append((CharSequence) "\n");
            printWriter.append((CharSequence) "    ServicesFuture[isDone=").append((CharSequence) Boolean.toString(zha.f55057g.isDone())).append((CharSequence) "]\n");
            printWriter.append((CharSequence) "    EnqueuedGattCommands=[");
            for (zgw zgw : zha.f55053c) {
                printWriter.append((CharSequence) zgw.toString()).append((CharSequence) ",");
            }
            printWriter.append((CharSequence) "    ]\n");
            printWriter.append((CharSequence) "  ]\n");
        }
    }

    /* renamed from: a */
    public final boolean mo19158a(caae caae) {
        if ((caae.f172325a & 32) == 0) {
            return false;
        }
        String b = this.f55081b.mo31111b();
        caaq caaq = caae.f172331g;
        if (caaq == null) {
            caaq = caaq.f172356h;
        }
        if (b.equals(caaq.f172359b)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo19159a(caah caah) {
        if (m45437c(caah)) {
            return true;
        }
        bnre i = this.f55089k.listIterator();
        while (i.hasNext()) {
            if (((yqo) i.next()).mo30676c().values().contains(caah)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final synchronized boolean mo19160a(zgg zgg) {
        boolean a;
        HashSet<caah> hashSet;
        a = this.f55090l.mo19160a(zgg);
        hashSet = new HashSet();
        for (Map.Entry entry : ((bndq) this.f55091m).mo67315n()) {
            if (((zgg) entry.getValue()).equals(zgg)) {
                hashSet.add((caah) entry.getKey());
            }
        }
        for (caah caah : hashSet) {
            this.f55091m.mo67310c(caah, zgg);
            if (((bndq) this.f55091m).mo67127c(caah).isEmpty()) {
                bqga.m112781a(this.f55092n, new zhh(this, caah), bqfb.INSTANCE);
            }
        }
        return !hashSet.isEmpty() || a;
    }
}
