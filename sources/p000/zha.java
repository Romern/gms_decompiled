package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import android.content.Context;
import android.os.Handler;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: zha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zha implements zho {

    /* renamed from: a */
    public static final srn f55051a = zvt.m46581a();

    /* renamed from: b */
    static final UUID f55052b = UUID.fromString("00002902-0000-1000-8000-00805F9B34FB");

    /* renamed from: c */
    public final Queue f55053c = new ConcurrentLinkedDeque();

    /* renamed from: d */
    public final Set f55054d = bnpf.m110056b();

    /* renamed from: e */
    public final zhm f55055e;

    /* renamed from: f */
    public final zgt f55056f;

    /* renamed from: g */
    public final bqgy f55057g = bqgy.m112818c();

    /* renamed from: h */
    public final Object f55058h = new Object();

    /* renamed from: i */
    public zgu f55059i = new zgu(0, false, 0);

    /* renamed from: j */
    public final ConcurrentHashMap f55060j = new ConcurrentHashMap();

    /* renamed from: k */
    public final Object f55061k = new Object();

    /* renamed from: l */
    public zhn f55062l;

    /* renamed from: m */
    public final zhr f55063m;

    /* renamed from: n */
    private final bqgj f55064n;

    /* renamed from: o */
    private final Context f55065o;

    /* renamed from: p */
    private final Handler f55066p;

    /* renamed from: q */
    private final zhl f55067q;

    public zha(Context context, zhm zhm, zhl zhl, Handler handler, ExecutorService executorService, zgt zgt) {
        this.f55065o = context;
        this.f55055e = zhm;
        this.f55067q = zhl;
        this.f55066p = handler;
        this.f55063m = new zhr(handler);
        bmxy.m108582a(zgt, "Callback is not provided");
        this.f55056f = zgt;
        this.f55064n = bqgs.m112811a(executorService);
    }

    /* renamed from: a */
    public static boolean m45418a(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        return (bluetoothGattCharacteristic.getProperties() & i) > 0;
    }

    /* renamed from: c */
    public static void m45419c(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        ((bnsl) f55051a.mo68388c()).mo68420a("Cannot find read future for characteristic %s", bluetoothGattCharacteristic.getUuid());
    }

    /* renamed from: e */
    private static long m45420e() {
        return TimeUnit.SECONDS.toMillis(cdzd.m135476e());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final bqgg mo31110b(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        bluetoothGattCharacteristic.getUuid();
        bmxy.m108596a(m45418a(bluetoothGattCharacteristic, 2), "Characteristic %s does not have read property", bluetoothGattCharacteristic.getUuid());
        zgy zgy = new zgy(this, bluetoothGattCharacteristic);
        bqgy c = bqgy.m112818c();
        bqgy bqgy = (bqgy) this.f55060j.putIfAbsent(bluetoothGattCharacteristic.getUuid(), c);
        if (bqgy != null) {
            bluetoothGattCharacteristic.getUuid();
            return bqgy;
        }
        mo31108a(zgy);
        return c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        p000.bqga.m112781a(r3.f55064n.mo25819b(r0), new p000.yuf(r3), p000.bqfb.INSTANCE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r0 = (p000.zgw) r3.f55053c.poll();
     */
    /* renamed from: d */
    public final void mo31113d() {
        synchronized (this.f55058h) {
            if (this.f55059i.f55040a != 2) {
                mo31112c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bqgg mo31106a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        bluetoothGattCharacteristic.getUuid();
        if (m45418a(bluetoothGattCharacteristic, 2)) {
            return bqdx.m112673a(mo31110b(bluetoothGattCharacteristic), bmxm.m108539a(true), bqfb.INSTANCE);
        }
        if (m45418a(bluetoothGattCharacteristic, 16)) {
            bqgy c = bqgy.m112818c();
            mo31108a(new zgx(this, bluetoothGattCharacteristic, c));
            return c;
        }
        bluetoothGattCharacteristic.getUuid();
        return bqga.m112775a((Object) false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        return;
     */
    /* renamed from: c */
    public final void mo31112c() {
        boolean b;
        if (this.f55067q.mo31123a()) {
            synchronized (this.f55058h) {
                int i = this.f55059i.f55040a;
                if (i == 1) {
                    return;
                }
                if (i != 2) {
                    synchronized (this.f55061k) {
                        if (this.f55062l == null) {
                            this.f55062l = this.f55055e.mo31126a(this.f55065o, this);
                        }
                        b = this.f55062l.mo31132b();
                        if (!b) {
                            ((bnsl) f55051a.mo68388c()).mo68405a("Failed to initiate connection request.");
                        }
                    }
                    if (b) {
                        zgu a = this.f55059i.mo31098a(1).mo31099a(true);
                        this.f55059i = a;
                        this.f55066p.postDelayed(new zgs(this, a), m45420e());
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo31107a() {
        return this.f55055e.mo31127b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo31111b() {
        return this.f55055e.mo31125a();
    }

    /* renamed from: a */
    public final void mo31108a(zgw zgw) {
        this.f55053c.add(zgw);
        mo31113d();
    }

    /* renamed from: a */
    public final void mo31109a(boolean z) {
        synchronized (this.f55058h) {
            zgu a = this.f55059i.mo31098a(3).mo31099a(z);
            synchronized (this.f55061k) {
                if (this.f55062l != null) {
                    this.f55059i = a;
                    this.f55066p.postDelayed(new zgr(this, a), m45420e());
                    this.f55062l.mo31128a();
                }
            }
        }
    }
}
