package com.google.android.gms.auth.proximity;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager;
import com.google.android.chimera.Service;
import com.google.android.gms.beacon.BleFilter;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BleCentralChimeraService extends Service {

    /* renamed from: a */
    public static final sek f11094a = jsy.m17256a("BleCentralService");

    /* renamed from: b */
    static final long f11095b = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: c */
    public final jla f11096c;

    /* renamed from: d */
    public final jta f11097d;

    /* renamed from: e */
    public final Handler f11098e;

    /* renamed from: f */
    public final Set f11099f;

    /* renamed from: g */
    private final jnj f11100g;

    /* renamed from: h */
    private final jkh f11101h;

    /* renamed from: i */
    private final aysk f11102i;

    /* renamed from: j */
    private final ExecutorService f11103j;

    /* renamed from: k */
    private final blvi f11104k;

    /* renamed from: l */
    private final jmh f11105l;

    /* renamed from: m */
    private final jiy f11106m;

    /* renamed from: n */
    private final Set f11107n;

    /* renamed from: o */
    private UpdateScanFilterReceiver f11108o;

    /* renamed from: p */
    private jky f11109p;

    /* renamed from: q */
    private jje f11110q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f11111r;

    /* renamed from: s */
    private jja f11112s;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class UpdateScanFilterReceiver extends aacn {

        /* renamed from: a */
        private final WeakReference f11113a;

        public UpdateScanFilterReceiver(BleCentralChimeraService bleCentralChimeraService) {
            super("auth_proximity");
            this.f11113a = new WeakReference(bleCentralChimeraService);
        }

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            BleCentralChimeraService bleCentralChimeraService = (BleCentralChimeraService) this.f11113a.get();
            if (bleCentralChimeraService == null) {
                BleCentralChimeraService.f11094a.mo25418e("UpdateScanFilterReceiver received broadcast after service died.", new Object[0]);
            } else if ("android.os.action.DEVICE_IDLE_MODE_CHANGED".equals(intent.getAction()) || "com.google.android.gms.auth.authzen.DEVICE_SYNC_FINISHED".equals(intent.getAction()) || "com.google.android.gms.auth.proximity.BleCentralChimeraService.ALARM".equals(intent.getAction())) {
                BleCentralChimeraService.f11094a.mo25412b("Received scan filter update Intent: %s", intent);
                if (!((PowerManager) context.getSystemService("power")).isDeviceIdleMode()) {
                    asfb asfb = new asfb(context, 1, "BleCentralService");
                    asfb.mo49111a(BleCentralChimeraService.f11095b);
                    bleCentralChimeraService.mo7771a(asfb);
                }
            }
        }
    }

    public BleCentralChimeraService() {
        this(jnj.m16961a(), jkh.m16839a(), aysk.m84701b(), new blvi(rpr.m34216b(), 1, new jjd(), UUID.fromString("b3b7e28e-a000-3e17-bd86-6e97b9e28c11"), UUID.fromString("00000100-0004-1000-8000-001A11000101"), UUID.fromString("00000100-0004-1000-8000-001A11000102"), 512), new jle(), new jla(), new jiy());
    }

    /* renamed from: a */
    public static Intent m6742a(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.auth.proximity.BleCentralService");
    }

    /* renamed from: b */
    static PendingIntent m6745b(Context context) {
        return PendingIntent.getBroadcast(context, 0, new Intent("com.google.android.gms.auth.proximity.BleCentralChimeraService.ALARM"), 134217728);
    }

    /* renamed from: c */
    private static final void m6746c() {
        rpr b = rpr.m34216b();
        new skc(b).mo25668a(m6745b(b));
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) "==== BleCentralService Dump ====\n\n");
        if (this.f11109p == null) {
            printWriter.append((CharSequence) "No current scan filter.\n");
            return;
        }
        printWriter.append((CharSequence) "Current EID:\n");
        printWriter.append((CharSequence) String.format("0x%s, start: %s (timestamp: %d), stop: %s (timestamp: %d)\n\n", srv.m36160a(this.f11109p.f22725a.f22722a), new Date(this.f11109p.f22725a.f22723b), Long.valueOf(this.f11109p.f22725a.f22723b), new Date(this.f11109p.f22725a.f22724c), Long.valueOf(this.f11109p.f22725a.f22724c)));
        printWriter.append((CharSequence) "Adjacent EID:\n");
        jkw jkw = this.f11109p.f22726b;
        if (jkw == null) {
            printWriter.append((CharSequence) "no adjacent EID\n");
        } else {
            printWriter.append((CharSequence) String.format("0x%s, start: %s (timestamp: %d), stop: %s (timestamp: %d)\n\n", srv.m36160a(jkw.f22722a), new Date(this.f11109p.f22726b.f22723b), Long.valueOf(this.f11109p.f22726b.f22723b), new Date(this.f11109p.f22726b.f22724c), Long.valueOf(this.f11109p.f22726b.f22724c)));
        }
        printWriter.append((CharSequence) "Active connection device IDs:\n");
        if (this.f11099f.isEmpty()) {
            printWriter.append((CharSequence) "[]\n");
            return;
        }
        StringBuilder sb = new StringBuilder("[");
        for (String str : this.f11099f) {
            sb.append(jkr.m16853a(str));
            sb.append(',');
        }
        sb.replace(sb.length() - 1, sb.length(), "]\n");
        printWriter.append((CharSequence) sb.toString());
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        f11094a.mo25412b("Service created and is listening for user presence changes as well as Cryptauth device syncs.", new Object[0]);
        int i = Build.VERSION.SDK_INT;
        UpdateScanFilterReceiver a = jjh.m16792a(this);
        this.f11108o = a;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.authzen.DEVICE_SYNC_FINISHED");
        intentFilter.addAction("com.google.android.gms.auth.proximity.BleCentralChimeraService.ALARM");
        intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        registerReceiver(a, intentFilter);
        this.f11110q = new jje(this, this.f11103j);
    }

    public final void onDestroy() {
        f11094a.mo25412b("Service destroyed.", new Object[0]);
        int i = Build.VERSION.SDK_INT;
        unregisterReceiver(this.f11108o);
        m6746c();
        mo7774b();
        this.f11110q = null;
        mo7770a();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        f11094a.mo25412b("BleCentralService starting...", new Object[0]);
        int i3 = Build.VERSION.SDK_INT;
        aysk aysk = this.f11102i;
        if (aysk == null || !aysk.mo54348a()) {
            f11094a.mo25412b("Bluetooth adapter disabled", new Object[0]);
            stopSelf();
            return 2;
        } else if (Role.m6775e(this.f11100g.mo13909c())) {
            mo7771a((asfb) null);
            return 2;
        } else {
            f11094a.mo25412b("No eligible devices", new Object[0]);
            stopSelf();
            return 2;
        }
    }

    /* renamed from: a */
    private static BleFilter m6743a(jkw jkw) {
        byte[] array = ByteBuffer.allocate(2).put(jkw.f22722a).array();
        neh neh = new neh();
        neh.mo20518a(jiy.f22589b, array);
        return neh.mo20515a();
    }

    /* renamed from: b */
    public final synchronized void mo7774b() {
        for (asfb asfb : this.f11107n) {
            if (asfb.mo49124e()) {
                asfb.mo49120c();
            }
        }
        this.f11107n.clear();
    }

    /* renamed from: a */
    public final void mo7770a() {
        if (this.f11112s != null) {
            jiy jiy = this.f11106m;
            jiy.f22591d.execute(new jiw(new jix(this.f11112s, null, null), nef.m26014a(this), jiy));
        }
        this.f11112s = null;
        this.f11109p = null;
    }

    public BleCentralChimeraService(jnj jnj, jkh jkh, aysk aysk, blvi blvi, jmh jmh, jla jla, jiy jiy) {
        this.f11100g = jnj;
        this.f11101h = jkh;
        this.f11102i = aysk;
        this.f11104k = blvi;
        this.f11105l = jmh;
        this.f11096c = jla;
        this.f11106m = jiy;
        this.f11103j = sne.m35694a(2, 10);
        this.f11098e = new adzt();
        this.f11099f = new HashSet();
        this.f11107n = new HashSet();
        this.f11097d = jsz.m17257a();
        this.f11111r = false;
    }

    /* renamed from: a */
    public final synchronized void mo7771a(asfb asfb) {
        if (asfb != null) {
            this.f11107n.add(asfb);
        }
        if (!this.f11111r) {
            this.f11111r = true;
            this.f11105l.mo13848a(new jiz(this, this.f11098e));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: jla.a(java.util.List, long, boolean):jkz
     arg types: [java.util.List, long, int]
     candidates:
      jla.a(java.util.List, long, long):jkw
      jla.a(java.util.List, long, boolean):jkz */
    /* renamed from: a */
    public final synchronized void mo7772a(String str, byte[] bArr, List list) {
        byte[] bArr2;
        qxo qxo;
        RemoteDevice remoteDevice;
        List list2;
        RemoteDevice remoteDevice2;
        int i;
        int i2;
        ArrayList arrayList;
        byte[] bArr3;
        ArrayList arrayList2;
        String str2 = str;
        byte[] bArr4 = bArr;
        synchronized (this) {
            qxo a = this.f11097d.mo14040a("central_role_advertisement_to_connection_time");
            jla jla = this.f11096c;
            List b = this.f11100g.mo13907b();
            if (bArr4 == null || bArr4.length < 4) {
                bArr2 = null;
            } else {
                bArr2 = Arrays.copyOf(bArr4, 4);
            }
            int size = b.size();
            int i3 = 0;
            loop0:
            while (true) {
                if (i3 >= size) {
                    qxo = a;
                    remoteDevice = null;
                    break;
                }
                RemoteDevice remoteDevice3 = (RemoteDevice) b.get(i3);
                byte[] bArr5 = remoteDevice3.f11141e;
                qxo = a;
                jkz a2 = jla.mo13844a(list, cchi.m129674f(), true);
                if (a2 == null) {
                    arrayList = new ArrayList();
                    remoteDevice2 = remoteDevice3;
                    i = i3;
                    i2 = size;
                    list2 = b;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    int i4 = size;
                    long j = a2.f22727a;
                    if (j != Long.MAX_VALUE) {
                        bArr3 = bArr5;
                        remoteDevice2 = remoteDevice3;
                        i = i3;
                        list2 = b;
                        arrayList2 = arrayList3;
                        i2 = i4;
                        jkw a3 = jla.mo13842a(bArr5, list, j, a2.f22728b);
                        if (a3 != null) {
                            arrayList2.add(a3.f22722a);
                        }
                    } else {
                        bArr3 = bArr5;
                        remoteDevice2 = remoteDevice3;
                        i = i3;
                        list2 = b;
                        i2 = i4;
                        arrayList2 = arrayList3;
                    }
                    jkw a4 = jla.mo13842a(bArr3, list, a2.f22729c, a2.f22730d);
                    if (a4 != null) {
                        arrayList2.add(a4.f22722a);
                    }
                    arrayList = arrayList2;
                }
                int size2 = arrayList.size();
                int i5 = 0;
                while (true) {
                    i3 = i + 1;
                    if (i5 >= size2) {
                        break;
                    }
                    int i6 = i5 + 1;
                    if (Arrays.equals((byte[]) arrayList.get(i5), bArr2)) {
                        remoteDevice = remoteDevice2;
                        break loop0;
                    }
                    i5 = i6;
                }
                a = qxo;
                size = i2;
                b = list2;
            }
            if (remoteDevice == null) {
                f11094a.mo25416d("Received advertisement from device with address %s but unable to match it to a registered device.", str2);
                this.f11097d.mo14053i(5);
                return;
            }
            if (cchi.m129675g()) {
                if (bArr4.length > 4 && (bArr4[4] & 1) != 0) {
                    boolean z = true;
                    boolean z2 = false;
                    for (Role role : this.f11100g.mo13902a(remoteDevice.f11138b)) {
                        boolean e = Role.m6775e(role.f11147c);
                        z2 |= e;
                        if (e && !Role.m6773c(role.f11147c)) {
                            jnp.m16984b().mo13914a(remoteDevice, new Role(role.f11146b, 4), new Role(role.f11146b, 32));
                            z = false;
                        }
                    }
                    if (!z2) {
                        f11094a.mo25418e("The device %s has not been registered for a BLE Central connection mode.", remoteDevice.mo7784a());
                        this.f11097d.mo14053i(4);
                        return;
                    } else if (z) {
                        this.f11097d.mo14053i(3);
                        return;
                    } else {
                        this.f11097d.mo14053i(1);
                        return;
                    }
                }
            }
            String str3 = remoteDevice.f11138b;
            if (this.f11099f.contains(str3)) {
                this.f11097d.mo14053i(2);
                return;
            }
            this.f11099f.add(str3);
            f11094a.mo25412b("Received advertisement from RemoteDevice; starting connection. RemoteDevice: %s", remoteDevice);
            this.f11097d.mo14053i(0);
            this.f11101h.mo13829a(remoteDevice.f11138b, 2);
            ((soc) this.f11103j).submit(jjf.m16790a(this.f11110q, remoteDevice, this.f11104k.mo66750a(str2), str, this.f11101h, this.f11098e, new jjc(this, str3), this.f11097d, qxo));
        }
    }

    /* renamed from: a */
    public final synchronized void mo7773a(jky jky, List list) {
        boolean z;
        boolean z2;
        BleFilter bleFilter;
        List list2;
        long j;
        sdo.m34959a(jky);
        if (!jky.equals(this.f11109p)) {
            if (this.f11109p != null) {
                sdo.m34959a(this.f11112s);
                mo7770a();
            }
            boolean z3 = true;
            sdo.m34974b(true);
            if (this.f11112s == null) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34970a(z);
            if (this.f11109p == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            sdo.m34970a(z2);
            f11094a.mo25412b("Starting scan.", new Object[0]);
            this.f11109p = jky;
            this.f11112s = new jja(this, list);
            jiy jiy = this.f11106m;
            neg a = nef.m26014a(this);
            jja jja = this.f11112s;
            sdo.m34974b(true);
            StringBuilder sb = new StringBuilder("Created scan filter(s): ");
            BleFilter a2 = m6743a(jky.f22725a);
            sb.append("0x");
            sb.append(srv.m36160a(a2.f29259f));
            jkw jkw = jky.f22726b;
            if (jkw != null) {
                bleFilter = m6743a(jkw);
                sb.append(" and 0x");
                sb.append(srv.m36160a(bleFilter.f29259f));
            } else {
                bleFilter = null;
            }
            f11094a.mo25414c(sb.toString(), new Object[0]);
            if (bleFilter == null) {
                list2 = Arrays.asList(a2);
            } else {
                list2 = Arrays.asList(a2, bleFilter);
            }
            jjb jjb = new jjb(this);
            bqgj bqgj = jiy.f22591d;
            nem nem = new nem();
            nem.mo20538b((int) cchi.f178978a.mo6606a().mo75952b());
            nem.mo20535a(0L);
            nem.mo20534a(1);
            nem.mo20537a(list2);
            nem.f35408a = 7;
            bqgj.execute(new jiw(new jix(jja, nem.mo20533a(), jjb), a, jiy));
            m6746c();
            jky jky2 = this.f11109p;
            if (jky2 == null) {
                z3 = false;
            }
            sdo.m34970a(z3);
            jkw jkw2 = jky2.f22726b;
            if (jkw2 != null) {
                if (jkw2.f22723b >= jky2.f22725a.f22723b) {
                    j = jkw2.f22724c - cchi.m129671c();
                    rpr b = rpr.m34216b();
                    new skc(b).mo25673a("BleCentralService", 0, j, m6745b(b));
                    return;
                }
            }
            j = jky2.f22725a.f22724c;
            rpr b2 = rpr.m34216b();
            new skc(b2).mo25673a("BleCentralService", 0, j, m6745b(b2));
            return;
        }
        mo7774b();
    }
}
