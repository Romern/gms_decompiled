package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.beacon.BleSettings;
import com.google.location.nearby.direct.bluetooth.state.BluetoothEventReceiverLogger;
import com.google.location.nearby.direct.bluetooth.state.BluetoothMedium$1;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: buxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buxb {

    /* renamed from: a */
    public static final UUID f155203a = UUID.fromString("0000FEF3-0000-1000-8000-00805F9B34FB");

    /* renamed from: b */
    public static final UUID f155204b = UUID.fromString("00000100-0004-1000-8000-001A11000100");

    /* renamed from: c */
    public static final UUID f155205c = UUID.fromString("00000100-0004-1000-8000-001A11000102");

    /* renamed from: d */
    public static final UUID f155206d;

    /* renamed from: e */
    public static final UUID f155207e = f155205c;

    /* renamed from: f */
    public static final UUID f155208f;

    /* renamed from: g */
    public final buwt f155209g;

    /* renamed from: h */
    public final buxv f155210h;

    /* renamed from: i */
    public final Context f155211i;

    /* renamed from: j */
    public final bvbu f155212j;

    /* renamed from: k */
    public final Handler f155213k;

    /* renamed from: l */
    public final buwo f155214l;

    /* renamed from: m */
    public final bvdt f155215m;

    /* renamed from: n */
    public boolean f155216n;

    /* renamed from: o */
    public boolean f155217o;

    /* renamed from: p */
    public final bnmu f155218p;

    /* renamed from: q */
    public nej f155219q;

    /* renamed from: r */
    public BleSettings f155220r;

    /* renamed from: s */
    private final buqh f155221s;

    /* renamed from: t */
    private final AtomicInteger f155222t;

    /* renamed from: u */
    private final bvch f155223u;

    /* renamed from: v */
    private final BroadcastReceiver f155224v = new BluetoothEventReceiverLogger(new BluetoothMedium$1(this, "nearby"));

    /* renamed from: w */
    private boolean f155225w;

    /* renamed from: x */
    private boolean f155226x;

    /* renamed from: y */
    private final bvcd f155227y = new buwx(this);

    /* renamed from: z */
    private final bvcd f155228z = new buwy(this);

    static {
        UUID fromString = UUID.fromString("00000100-0004-1000-8000-001A11000101");
        f155206d = fromString;
        f155208f = fromString;
    }

    public buxb(Context context) {
        srn srn = bvcm.f155598a;
        buqh buqh = (buqh) ahgz.m55754a(context, buqh.class);
        this.f155221s = buqh;
        this.f155213k = buqh.mo72986c();
        this.f155209g = new buwt(context);
        this.f155211i = context;
        this.f155212j = (bvbu) ahgz.m55754a(context, bvbu.class);
        this.f155225w = false;
        this.f155216n = false;
        this.f155217o = false;
        this.f155222t = new AtomicInteger(0);
        this.f155215m = new bvdt(this, this.f155221s, new buwu(this));
        this.f155218p = bnge.m109299s();
        if (this.f155209g.mo73203b()) {
            this.f155214l = new buwo(context, this.f155209g);
        } else {
            this.f155214l = null;
        }
        buxv buxv = new buxv(context, this.f155209g, context.getSharedPreferences("copresence_user_bluetooth_adapter_state", 0), this.f155214l);
        this.f155210h = buxv;
        mo73221a((bvda) null, buxv.f155273q);
        this.f155223u = new bvch(this.f155213k);
    }

    /* renamed from: a */
    public static final bvda m120647a(bvcb bvcb) {
        return new buxa(bvcb);
    }

    /* renamed from: d */
    private final void m120650d(bvda bvda) {
        mo73221a(bvda, this.f155210h.f155263g);
    }

    /* renamed from: j */
    private final void m120651j() {
        if (this.f155225w) {
            srn srn = bvcm.f155598a;
            try {
                this.f155211i.unregisterReceiver(this.f155224v);
            } catch (IllegalArgumentException e) {
                bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
                bnsl.mo68432a("buxb", "j", 362, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Unregistered bluetooth broadcast receiver when it wasn't registered.");
            }
            this.f155225w = false;
        }
    }

    /* renamed from: k */
    private final bvbz m120652k() {
        byyg byyg = this.f155212j.f155567b;
        byyb byyb = byyg.f168924g;
        if (byyb == null) {
            byyb = byyb.f168875j;
        }
        long j = byyb.f168881e;
        byyb byyb2 = byyg.f168924g;
        if (byyb2 == null) {
            byyb2 = byyb.f168875j;
        }
        return new bvbz(j, byyb2.f168882f);
    }

    /* renamed from: l */
    private final bvbz m120653l() {
        byyg byyg = this.f155212j.f155567b;
        byya byya = byyg.f168925h;
        if (byya == null) {
            byya = byya.f168860j;
        }
        long j = byya.f168863b;
        byya byya2 = byyg.f168925h;
        if (byya2 == null) {
            byya2 = byya.f168860j;
        }
        return new bvbz(j, byya2.f168864c);
    }

    /* renamed from: b */
    public final void mo73225b(bvda bvda) {
        synchronized (this.f155222t) {
            if (this.f155222t.get() <= 0) {
                bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
                bnsl.mo68432a("buxb", "b", 330, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("BluetoothMedium: Bluetooth released more than requested");
                bvda.mo73127b();
            } else if (this.f155222t.decrementAndGet() == 0) {
                mo73229c(bvda);
            } else {
                bvda.mo73126a();
            }
        }
    }

    /* renamed from: c */
    public final boolean mo73228c() {
        return this.f155209g.mo73203b();
    }

    /* renamed from: e */
    public final boolean mo73231e() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        synchronized (this.f155222t) {
            this.f155222t.getAndIncrement();
            m120650d(new buwv(this, atomicBoolean, countDownLatch));
        }
        try {
            byyg byyg = this.f155212j.f155567b;
            byyb byyb = byyg.f168924g;
            if (byyb == null) {
                byyb = byyb.f168875j;
            }
            long j = byyb.f168880d;
            byyb byyb2 = byyg.f168924g;
            if (byyb2 == null) {
                byyb2 = byyb.f168875j;
            }
            countDownLatch.await(j + byyb2.f168879c, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            srn srn = bvcm.f155598a;
        }
        return atomicBoolean.get();
    }

    /* renamed from: f */
    public final void mo73232f() {
        bvbz bvbz;
        srn srn = bvcm.f155598a;
        if (!this.f155226x) {
            this.f155226x = true;
            if (this.f155219q != null) {
                bvbz = m120652k();
                bvbz a = this.f155223u.mo73309a(this.f155228z);
                if (a != null && !a.equals(m120653l())) {
                    nej nej = this.f155219q;
                    BleSettings bleSettings = this.f155220r;
                    mo73234h();
                    mo73223a(nej, bleSettings);
                }
            } else {
                bvbz = new bvbz(cfoa.m141097d(), cfoa.m141097d());
            }
            this.f155223u.mo73310a(this.f155227y, bvbz, this.f155228z);
        }
    }

    /* renamed from: g */
    public final void mo73233g() {
        srn srn = bvcm.f155598a;
        this.f155226x = false;
        this.f155223u.mo73312b(this.f155227y);
    }

    /* renamed from: h */
    public final void mo73234h() {
        srn srn = bvcm.f155598a;
        this.f155219q = null;
        this.f155223u.mo73312b(this.f155228z);
    }

    /* renamed from: i */
    public final void mo73235i() {
        if (!this.f155226x && this.f155222t.get() == 0 && this.f155219q == null && this.f155210h.f155271o.mo73237b() && this.f155210h.f155269m.mo73237b() && this.f155210h.f155270n.mo73237b()) {
            mo73229c(null);
        }
    }

    /* renamed from: a */
    public static final bvda m120648a(bvcc bvcc) {
        return new buwz(bvcc);
    }

    /* renamed from: c */
    public final boolean mo73229c(bvda bvda) {
        if (this.f155210h.f155273q.mo73237b()) {
            this.f155216n = false;
            this.f155217o = false;
            m120651j();
            if (bvda != null) {
                bvda.mo73126a();
            }
            return false;
        }
        mo73221a(bvda, this.f155210h.f155273q);
        return true;
    }

    /* renamed from: d */
    public final void mo73230d() {
        bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
        bnsl.mo68432a("buxb", "d", 237, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("BluetoothMedium: BluetoothMedium state transition has failed!");
        bvdt bvdt = this.f155215m;
        bvdt.f155672c.clear();
        bvdt.f155671b.mo72989e(bvdt.f155677h);
        bvdt.f155673d = 0;
        bvdt.f155674e = 0;
        bvdt.f155675f = SystemClock.elapsedRealtime();
        for (bvda bvda : this.f155218p.mo67317p()) {
            bvda.mo73127b();
        }
        this.f155218p.mo67270d();
        if (!this.f155217o) {
            bnsl bnsl2 = (bnsl) bvcm.f155598a.mo68388c();
            bnsl2.mo68432a("buxb", "d", 246, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("BluetoothMedium: Attempting to revert: STATE_MACHINE_FAILURE");
            this.f155217o = true;
            mo73234h();
            this.f155226x = false;
            mo73221a((bvda) null, this.f155210h.f155267k);
            mo73221a((bvda) null, this.f155210h.f155270n);
            mo73229c(null);
            return;
        }
        bnsl bnsl3 = (bnsl) bvcm.f155598a.mo68387b();
        bnsl3.mo68432a("buxb", "d", 241, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl3.mo68405a("BluetoothMedium: Bluetooth stack is in an unrecoverable state!");
        m120651j();
        this.f155216n = false;
        this.f155217o = false;
    }

    /* renamed from: a */
    public static boolean m120649a(Context context) {
        return BluetoothAdapter.getDefaultAdapter() != null && context.getPackageManager().hasSystemFeature("android.hardware.bluetooth");
    }

    /* renamed from: a */
    public final void mo73220a(bvda bvda) {
        synchronized (this.f155222t) {
            this.f155222t.getAndIncrement();
            m120650d(new buww(this, bvda));
        }
    }

    /* renamed from: a */
    public final void mo73221a(bvda bvda, bvdu... bvduArr) {
        if (!this.f155225w) {
            this.f155225w = true;
            srn srn = bvcm.f155598a;
            IntentFilter intentFilter = new IntentFilter();
            for (String str : BluetoothEventReceiverLogger.f191761a) {
                intentFilter.addAction(str);
            }
            this.f155211i.registerReceiver(this.f155224v, intentFilter, null, this.f155213k);
        }
        for (bvdu bvdu : bvduArr) {
            srn srn2 = bvcm.f155598a;
            String str2 = bvdu.f155681e;
            if (bvda != null) {
                this.f155218p.mo67268a(bvdu, bvda);
            }
        }
        this.f155215m.mo73347b(bvduArr);
        this.f155215m.mo73345a(bvduArr);
    }

    /* renamed from: b */
    public final void mo73226b(bvdu bvdu) {
        for (bvda bvda : ((bndq) this.f155218p).mo67272e(bvdu)) {
            bvda.mo73127b();
        }
    }

    /* renamed from: b */
    public final boolean mo73227b() {
        return this.f155209g.mo73204c();
    }

    /* renamed from: a */
    public final void mo73222a(bvdu bvdu) {
        this.f155215m.mo73347b(bvdu);
        mo73226b(bvdu);
    }

    /* renamed from: a */
    public final void mo73223a(nej nej, BleSettings bleSettings) {
        bvbz bvbz;
        sdo.m34959a(nej);
        nej nej2 = this.f155219q;
        if (!(nej2 == null || nej2 == nej)) {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
            bnsl.mo68437a(new IllegalStateException());
            bnsl.mo68432a("buxb", "a", 534, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("BluetoothMedium only supports one ble callback for now.");
        }
        if (this.f155219q == null) {
            this.f155219q = nej;
            this.f155220r = bleSettings;
            if (this.f155226x) {
                bvbz = m120653l();
                bvbz a = this.f155223u.mo73309a(this.f155227y);
                if (a != null && !a.equals(m120652k())) {
                    mo73233g();
                    mo73232f();
                }
            } else {
                bvbz = new bvbz(cfoa.m141096c(), cfoa.m141096c());
            }
            this.f155223u.mo73310a(this.f155228z, bvbz, this.f155227y);
        }
    }

    /* renamed from: a */
    public final boolean mo73224a() {
        return this.f155209g.mo73197a();
    }
}
