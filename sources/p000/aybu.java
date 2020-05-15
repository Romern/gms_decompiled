package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.node.ble.BleConnectionManager$1;
import com.google.android.gms.wearable.node.ble.BleConnectionManager$2;
import com.google.android.gms.wearable.service.WearableChimeraService;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aybu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aybu extends aycl implements aybl, ayca, ayjm {

    /* renamed from: z */
    public static final /* synthetic */ int f97038z = 0;

    /* renamed from: D */
    private final qxg f97039D = new qxg(300);

    /* renamed from: E */
    private final qxg f97040E = new qxg(50);

    /* renamed from: F */
    private final aybv f97041F;

    /* renamed from: G */
    private final ayce f97042G;

    /* renamed from: H */
    private final AtomicBoolean f97043H;

    /* renamed from: I */
    private final qxh f97044I;

    /* renamed from: J */
    private final qxm f97045J;

    /* renamed from: K */
    private final AtomicInteger f97046K;

    /* renamed from: L */
    private final AtomicInteger f97047L;

    /* renamed from: M */
    private final aybt f97048M;

    /* renamed from: N */
    private final aybr f97049N;

    /* renamed from: O */
    private final aybo f97050O;

    /* renamed from: a */
    public final Context f97051a;

    /* renamed from: b */
    public final BluetoothAdapter f97052b;

    /* renamed from: c */
    final ArrayBlockingQueue f97053c = new ArrayBlockingQueue(100);

    /* renamed from: d */
    public aybw f97054d;

    /* renamed from: e */
    public final aycf f97055e;

    /* renamed from: f */
    final aybz f97056f;

    /* renamed from: g */
    public volatile AtomicReference f97057g;

    /* renamed from: h */
    final AtomicBoolean f97058h;

    /* renamed from: i */
    final qxh f97059i;

    /* renamed from: j */
    final qxh f97060j;

    /* renamed from: k */
    final qxh f97061k;

    /* renamed from: l */
    final qxh f97062l;

    /* renamed from: m */
    final qxh f97063m;

    /* renamed from: n */
    final qxh f97064n;

    /* renamed from: o */
    final qxh f97065o;

    /* renamed from: p */
    final qxh f97066p;

    /* renamed from: q */
    public final AtomicInteger f97067q;

    /* renamed from: r */
    final BroadcastReceiver f97068r;

    /* renamed from: s */
    public final BroadcastReceiver f97069s;

    /* renamed from: t */
    public boolean f97070t;

    /* renamed from: u */
    final aybm f97071u;

    /* renamed from: v */
    public final aybp f97072v;

    /* renamed from: w */
    public final aybn f97073w;

    /* renamed from: x */
    public final aybq f97074x;

    /* renamed from: y */
    public final aybs f97075y;

    static {
        chnj.f188812a.mo6606a().mo85422au();
        chnj.f188812a.mo6606a().mo85423av();
    }

    public aybu(Context context, BluetoothAdapter bluetoothAdapter, aybv aybv, aybz aybz, aycf aycf, ayce ayce, Looper looper, ConnectionConfiguration connectionConfiguration) {
        super("BleConnectionManager", looper);
        boolean z = true;
        this.f97043H = new AtomicBoolean(true);
        this.f97057g = new AtomicReference();
        this.f97058h = new AtomicBoolean(false);
        this.f97046K = new AtomicInteger();
        this.f97047L = new AtomicInteger();
        this.f97067q = new AtomicInteger();
        this.f97068r = new BleConnectionManager$1(this, "wearable");
        this.f97069s = new BleConnectionManager$2(this, "wearable");
        new IntentFilter("android.intent.action.SCREEN_ON");
        this.f97070t = false;
        this.f97071u = new aybm(this);
        this.f97048M = new aybt(this);
        this.f97072v = new aybp(this);
        this.f97049N = new aybr(this);
        this.f97050O = new aybo(this);
        this.f97073w = new aybn(this);
        this.f97074x = new aybq(this);
        this.f97075y = new aybs(this);
        this.f97051a = context;
        this.f97052b = bluetoothAdapter;
        this.f97041F = aybv;
        this.f97055e = aycf;
        aybm aybm = this.f97071u;
        if (aycf.f97117j == null) {
            aycf.f97117j = aybm;
            this.f97057g.set(connectionConfiguration);
            this.f97042G = ayce;
            this.f97056f = aybz;
            aybz.f97090b = this;
            PowerManager powerManager = (PowerManager) context.getSystemService(PowerManager.class);
            axty axty = axty.f96348a;
            axty.mo53544a("bleconnectionmanager-reconnect-notification");
            axty.mo53544a("bleconnectionmanager-reset-notification");
            axty.mo53544a("bleconnectionmanager-reset-success");
            axty.mo53544a("bleconnectionmanager-reset-failure");
            this.f97059i = axty.mo53544a("bleconnectionmanager-refresh-currenttimeservice-not-found");
            this.f97060j = axty.mo53544a("bleconnectionmanager-refresh-gatt-invalid-handle");
            this.f97061k = axty.mo53544a("bleconnectionmanager-refresh-gatt-read-not-permitted");
            this.f97062l = axty.mo53544a("bleconnectionmanager-refresh-gatt-write-not-permitted");
            this.f97044I = axty.mo53544a("bleconnectionmanager-refresh-missing-clockwork-characteristics");
            this.f97063m = axty.mo53544a("bleconnectionmanager-refresh-invalid-decommission-bytes");
            this.f97064n = axty.mo53544a("bleconnectionmanager-refresh-service-not-found");
            this.f97065o = axty.mo53544a("bleconnectionmanager-refresh-time-characteristic-invalid");
            this.f97066p = axty.mo53544a("bleconnectionmanager-refresh-timezone-dst-offset-invalid");
            axty.mo53544a("bleconnectionmanager-onservicechanged-missing-clockwork-characteristics");
            axty.mo53544a("bleconnectionmanager-onservicechanged-missing-time-characteristics");
            axty.mo53544a("bleconnectionmanager-onservicechanged-missing-ancs-or-ams");
            axty.mo53544a("bleconnectionmanager-onservicechanged-rediscovery-failure");
            this.f97045J = axty.mo53545a("bleconnectionmanager-errors", this.f97039D);
            axty.mo53545a("bleconnectionmanager-onServiceChanged-before-connected", this.f97040E);
            AtomicBoolean atomicBoolean = this.f97043H;
            if (connectionConfiguration != null && !connectionConfiguration.f110871h) {
                z = false;
            }
            atomicBoolean.set(z);
            WearableChimeraService.m94433a("BleConnectionManager", this);
            mo53893a(this.f97048M);
            mo53893a(this.f97072v);
            mo53893a(this.f97049N);
            mo53893a(this.f97050O);
            mo53893a(this.f97073w);
            mo53893a(this.f97074x);
            mo53893a(this.f97075y);
            mo53894a(this.f97048M, this.f97072v);
            mo53894a(this.f97072v, this.f97049N);
            mo53894a(this.f97049N, this.f97050O);
            mo53894a(this.f97049N, this.f97074x);
            mo53894a(this.f97050O, this.f97073w);
            mo53894a(this.f97050O, this.f97074x);
            mo53894a(this.f97073w, this.f97074x);
            mo53894a(this.f97074x, this.f97072v);
            mo53894a(this.f97072v, this.f97048M);
            mo53894a(this.f97048M, this.f97075y);
            mo53894a(this.f97075y, this.f97048M);
            aybs aybs = this.f97075y;
            ayck ayck = this.f97141B;
            ayck.f97131c = aybs;
            ayck.f97133e.mo53887c();
            return;
        }
        throw new IllegalStateException("connectionManagerCallback should only be set once.");
    }

    /* renamed from: e */
    private final void m83772e(int i) {
        if (i == 1) {
            this.f97060j.mo24359a();
        } else if (i == 2) {
            this.f97061k.mo24359a();
        } else if (i == 3) {
            this.f97062l.mo24359a();
        } else if (i != 256) {
            switch (i) {
                case 258:
                    this.f97044I.mo24359a();
                    return;
                case 259:
                    this.f97063m.mo24359a();
                    return;
                case 260:
                    this.f97064n.mo24359a();
                    return;
                case 261:
                    this.f97065o.mo24359a();
                    return;
                case 262:
                    this.f97066p.mo24359a();
                    return;
                default:
                    StringBuilder sb = new StringBuilder(53);
                    sb.append("Failed to log exception with status code: ");
                    sb.append(i);
                    Log.w("BleConnectionManager", sb.toString());
                    return;
            }
        } else {
            this.f97059i.mo24359a();
        }
    }

    /* renamed from: f */
    private final void m83774f() {
        try {
            BluetoothGatt bluetoothGatt = this.f97056f.f97093e;
            mo53866a("Not disconnecting; already disconnected");
        } catch (aybx e) {
            Log.w("BleConnectionManager", "Bluetooth exception caught while disconnecting");
        } catch (Throwable th) {
            mo53892a(chnj.m149026b());
            throw th;
        }
        mo53892a(chnj.m149026b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo53864a(int i) {
        switch (i) {
            case 1:
                return "MSG_INIT";
            case 2:
                return "MSG_BT_ADAPTER_STATE_CHANGED";
            case 3:
                return "MSG_CONNECTION_CONFIG_UPDATE";
            case 4:
                return "MSG_START_SCAN";
            case 5:
                return "MSG_START_FORCED_SCAN";
            case 6:
                return "MSG_SCAN_FAILED";
            case 7:
                return "MSG_STOP_SCAN";
            case 8:
                return "MSG_RESCHEDULE_SCAN";
            case 9:
                return "MSG_RECONNECT_REQUESTED";
            case 10:
                return "MSG_SERVICE_DISCOVERY_COMPLETE";
            case 11:
                return "MSG_HANDLE_NOTIFICATION";
            case 12:
                return "MSG_DECOMMISSION_WATCH";
            case 13:
                return "MSG_RECONNECT_CHARACTERISTIC_CHANGED";
            case 14:
                return "MSG_ERROR";
            case 15:
                return "MSG_CONNECTION_THREAD_DONE";
            case 16:
                return "MSG_GATT_CONNECTION_CLOSED";
            case 17:
                return "MSG_CW_HOME_SETUP_DONE";
            case 18:
                return "MSG_UPDATE_TIME";
            case 19:
                return "MSG_ON_SERVICE_CHANGED";
            case 20:
                return "MSG_RESET_CHARACTERISTIC_CHANGED";
            case 21:
                return "MSG_RESET_CONNECTION";
            default:
                return "UNKNOWN";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo53868b() {
        mo53866a("onQuitting");
        mo53871d();
        m83774f();
        m83774f();
        aycf aycf = this.f97055e;
        aycf.f97109b = false;
        boolean z = aycf.f97112e;
        ContentObserver contentObserver = aycf.f97116i;
        Handler handler = aycf.f97115h;
        aybk aybk = aycf.f97113f;
        aybi aybi = aycf.f97114g;
        ayce ayce = this.f97042G;
        ayce.f97107b = false;
        Settings.System.putInt(ayce.f97106a, "sysproxy_psm_value", -1);
        aybw aybw = this.f97054d;
        if (aybw != null) {
            aybw.mo53872a();
        }
        if (this.f97058h.compareAndSet(true, false)) {
            this.f97051a.unregisterReceiver(this.f97068r);
        }
    }

    /* renamed from: c */
    public final void mo53870c() {
        if (((ConnectionConfiguration) this.f97057g.get()).f110868e) {
            if (this.f97058h.compareAndSet(false, true)) {
                IntentFilter intentFilter = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
                intentFilter.addAction("android.gms.wearable.altReconnect");
                this.f97051a.registerReceiver(this.f97068r, intentFilter);
            }
        } else if (this.f97058h.compareAndSet(true, false)) {
            this.f97051a.unregisterReceiver(this.f97068r);
        }
    }

    /* renamed from: d */
    public final void mo53871d() {
        aybv aybv = this.f97041F;
        if (aybv.f97080e.get()) {
            if (aybv.f97079d.mo49124e()) {
                aybv.f97079d.mo49120c();
            }
            String str = aybv.f97076a;
            StringBuilder sb = new StringBuilder(String.valueOf((Object) null).length() + 23);
            sb.append("Stopping scanning for null.");
            aybv.m83784a(sb.toString());
            BluetoothLeScanner bluetoothLeScanner = aybv.f97078c.getAdapter().getBluetoothLeScanner();
            if (aybv.f97078c.getAdapter().isEnabled() && bluetoothLeScanner != null) {
                ScanCallback scanCallback = aybv.f97077b;
                bluetoothLeScanner.stopScan((ScanCallback) null);
            }
            aybv.f97077b = null;
            aybv.f97080e.set(false);
            mo53866a("Stopped scan.");
            mo53898c(4);
            mo53898c(7);
            mo53898c(5);
            this.f97054d.mo53874b();
            return;
        }
        aybv.m83784a("Not scanning, returning.");
    }

    /* renamed from: a */
    public final void mo53865a(aybx aybx) {
        StringWriter stringWriter = new StringWriter();
        bqye.m113760a(aybx, new PrintWriter(stringWriter));
        String valueOf = String.valueOf(stringWriter);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("Got exception: ");
        sb.append(valueOf);
        Log.w("BleConnectionManager", sb.toString(), aybx);
        this.f97046K.incrementAndGet();
        int i = aybx.f97087a;
        if (i != 258) {
            this.f97047L.incrementAndGet();
            if (i == 1 || i == 2 || i == 3 || i == 259 || i == 262 || i == 261) {
                this.f97056f.mo53876a();
                m83772e(i);
            } else if (i == 256 || i == 260) {
                if (!m83773e()) {
                    this.f97056f.mo53876a();
                    m83772e(i);
                    return;
                }
                mo53866a("Service is missing when OnServiceChanged enabled.");
            } else if (!(aybx instanceof aycb)) {
                int i2 = aybx.f97087a;
                if (i2 == -1) {
                    String valueOf2 = String.valueOf(aybx);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 35);
                    sb2.append("Unable to log unhandled exception: ");
                    sb2.append(valueOf2);
                    Log.w("BleConnectionManager", sb2.toString());
                    return;
                }
                this.f97045J.mo24368a((long) i2);
            } else {
                this.f97045J.mo24368a(257);
            }
        } else if (m83773e()) {
            mo53866a("Clockwork service characteristics are missing.");
        } else {
            this.f97056f.mo53876a();
            m83772e(258);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo53869b(Message message) {
        return message.what != 11;
    }

    /* renamed from: e */
    public static boolean m83773e() {
        if (!chna.m149009b()) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        return true;
    }

    /* renamed from: a */
    public final void mo53866a(String str) {
        if (Log.isLoggable("BleConnectionManager", 3)) {
            Log.d("BleConnectionManager", str);
        }
    }

    /* renamed from: a */
    public final void mo53558a(ssb ssb, boolean z, boolean z2) {
        String str;
        String str2;
        int i;
        aych aych;
        ssb.mo26034a();
        String str3 = "disabled";
        if (this.f97057g == null) {
            str = "null";
        } else if (!((ConnectionConfiguration) this.f97057g.get()).f110868e) {
            str = str3;
        } else {
            str = "enabled";
        }
        ssb.println(str.length() == 0 ? new String("ConnectionConfig is ") : "ConnectionConfig is ".concat(str));
        ssb.println("=====");
        if (!m83773e()) {
            str2 = str3;
        } else {
            str2 = "enabled";
        }
        ssb.println(str2.length() == 0 ? new String("onServiceChanged() Connectivity Model is ") : "onServiceChanged() Connectivity Model is ".concat(str2));
        if (m83773e() && chna.f188801a.mo6606a().mo85368b()) {
            str3 = "enabled";
        }
        ssb.println(str3.length() == 0 ? new String("keepSystemServicesWhenCompanionDisconnected is ") : "keepSystemServicesWhenCompanionDisconnected is ".concat(str3));
        ssb.println("Current Connection States:");
        String valueOf = String.valueOf("is not connected.");
        ssb.println(valueOf.length() == 0 ? new String("iOS Companion App ") : "iOS Companion App ".concat(valueOf));
        boolean z3 = this.f97055e.f97109b;
        ssb.println("is not connected.".length() == 0 ? new String("iOS System Services ") : "iOS System Services ".concat("is not connected."));
        StringBuilder sb = new StringBuilder(27);
        sb.append("isWatchDecommissioned=false");
        ssb.println(sb.toString());
        ssb.println("BLE connection stats");
        ssb.mo26034a();
        Iterator it = this.f97053c.iterator();
        while (it.hasNext()) {
            ((aybw) it.next()).mo53873a(ssb);
        }
        ssb.mo26035b();
        ssb.println("BLE state machine log records");
        ssb.mo26034a();
        int i2 = 0;
        while (true) {
            ayck ayck = this.f97141B;
            if (ayck != null) {
                i = ayck.f97133e.mo53883a();
            } else {
                i = 0;
            }
            if (i2 < i) {
                ayck ayck2 = this.f97141B;
                if (ayck2 != null) {
                    aych = ayck2.f97133e.mo53884a(i2);
                } else {
                    aych = null;
                }
                ssb.println(aych.toString());
                i2++;
            } else {
                ssb.mo26035b();
                ssb.mo26035b();
                return;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo53867a(Message message) {
        aycg aycg;
        int i = message.what;
        if (i == 9 || i == 15) {
            return true;
        }
        ayck ayck = this.f97141B;
        if (ayck != null) {
            aycg = ayck.f97132d;
        } else {
            aycg = null;
        }
        String c = aycg.mo53863c();
        int i2 = message.what;
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 33);
        sb.append("[");
        sb.append(c);
        sb.append("] Unhandled message: ");
        sb.append(i2);
        mo53866a(sb.toString());
        return false;
    }
}
