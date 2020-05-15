package p000;

import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import com.google.android.gms.cast.discovery.DiscoveryManager$DiscoveryManagerReceiver;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: pmh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pmh {

    /* renamed from: b */
    public static final long f39672b = ccxm.f180167a.mo6606a().mo76986c();

    /* renamed from: c */
    public static final long f39673c = ccxm.f180167a.mo6606a().mo76988e();

    /* renamed from: d */
    static final boolean f39674d = ccxm.f180167a.mo6606a().mo76987d();

    /* renamed from: o */
    private static final long f39675o = cczx.f180351a.mo6606a().mo77145d();

    /* renamed from: a */
    public final qav f39676a = new qav("DiscoveryManager");

    /* renamed from: e */
    public final Context f39677e;

    /* renamed from: f */
    public final pqb f39678f;

    /* renamed from: g */
    public final ScheduledExecutorService f39679g;

    /* renamed from: h */
    public final pma f39680h;

    /* renamed from: i */
    public final pnl f39681i;

    /* renamed from: j */
    public final Map f39682j;

    /* renamed from: k */
    public Set f39683k;

    /* renamed from: l */
    public int f39684l;

    /* renamed from: m */
    public ScheduledFuture f39685m;

    /* renamed from: n */
    public ScheduledFuture f39686n;

    /* renamed from: p */
    private final phy f39687p;

    /* renamed from: q */
    private final qat f39688q;

    /* renamed from: r */
    private final BroadcastReceiver f39689r;

    /* renamed from: s */
    private final List f39690s = new ArrayList();

    /* renamed from: t */
    private boolean f39691t = false;

    /* renamed from: u */
    private boolean f39692u;

    /* renamed from: v */
    private final pmn f39693v;

    /* renamed from: w */
    private final poj f39694w;

    public pmh(Context context, ScheduledExecutorService scheduledExecutorService, pnl pnl, poj poj, pma pma, pmn pmn, phy phy, qat qat) {
        Context context2 = context;
        ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
        poj poj2 = poj;
        this.f39677e = context2;
        this.f39679g = scheduledExecutorService2;
        this.f39681i = pnl;
        this.f39680h = pma;
        this.f39687p = phy;
        this.f39688q = qat;
        this.f39694w = poj2;
        this.f39693v = pmn;
        if (cczx.f180351a.mo6606a().mo77146e()) {
            this.f39690s.add(new pmt(context2, scheduledExecutorService2, poj2, this.f39687p));
        }
        if (qay.m31788b()) {
            this.f39690s.add(new pnj(context, scheduledExecutorService, this.f39687p, poj, pmn));
            this.f39676a.mo23673b("WifiGuestModeDeviceScanner enabled.", new Object[0]);
        }
        int i = Build.VERSION.SDK_INT;
        this.f39690s.add(new plr(this.f39677e, this.f39679g, this.f39687p, poj, (BluetoothManager) this.f39677e.getSystemService("bluetooth"), this.f39693v));
        if (this.f39690s.isEmpty()) {
            this.f39676a.mo23677d("There aren't any device scanners registered.", new Object[0]);
        }
        this.f39689r = new DiscoveryManager$DiscoveryManagerReceiver(this);
        this.f39682j = new HashMap();
        this.f39678f = cczq.m132285d() ? new pqb(context2) : null;
    }

    /* renamed from: a */
    private final void m30817a(bpew bpew) {
        ScheduledFuture scheduledFuture = this.f39685m;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f39687p.mo23131a(this.f39683k, bpew);
    }

    /* renamed from: b */
    private final void m30819b() {
        this.f39687p.mo23130a(this.f39683k);
        ScheduledExecutorService scheduledExecutorService = this.f39679g;
        phy phy = this.f39687p;
        phy.getClass();
        pmc pmc = new pmc(phy);
        long j = f39675o;
        this.f39685m = scheduledExecutorService.scheduleWithFixedDelay(pmc, j, j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public final void mo23410a() {
        ScheduledFuture scheduledFuture = this.f39686n;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* renamed from: a */
    public final void mo23411a(String str, int i) {
        if (cdbk.f180424a.mo6606a().mo77201a()) {
            try {
                this.f39679g.execute(new pmf(this, new InetSocketAddress(InetAddress.getByName(str), i)));
            } catch (IllegalArgumentException | SecurityException | UnknownHostException e) {
                this.f39676a.mo23674b(e, "Failed to create InetSocketAddress", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public final void mo23412a(Set set, Map map, int i) {
        if (set == null) {
            if (!this.f39691t) {
                this.f39676a.mo23675c("BroadcastReceiver not registered", new Object[0]);
            } else {
                try {
                    this.f39677e.unregisterReceiver(this.f39689r);
                } catch (IllegalArgumentException e) {
                }
                this.f39691t = false;
            }
        } else if (!this.f39691t) {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            this.f39677e.registerReceiver(this.f39689r, intentFilter);
            this.f39691t = true;
        } else {
            this.f39676a.mo23675c("BroadcastReceiver is already registered", new Object[0]);
        }
        this.f39679g.execute(new pmb(this, set, i, map));
    }

    /* renamed from: a */
    public final void mo23413a(boolean z) {
        boolean z2;
        bpew bpew;
        Set set = this.f39683k;
        int i = Build.VERSION.SDK_INT;
        boolean isInteractive = ((PowerManager) this.f39677e.getSystemService("power")).isInteractive();
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f39688q.f40829b.getSystemService("connectivity")).getActiveNetworkInfo();
        int i2 = 0;
        if (activeNetworkInfo == null) {
            z2 = false;
        } else if (!activeNetworkInfo.isConnected()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (ccyz.m132249b()) {
            pma pma = this.f39680h;
            Set set2 = this.f39683k;
            Map map = this.f39682j;
            pma.f39647a.mo23858a("updateDiscoveryState(). Criteria: %s. Screen on: %b. Has connectivity: %b.", set2, Boolean.valueOf(isInteractive), Boolean.valueOf(z2));
            pma.f39653g = isInteractive;
            pma.f39654h = z2;
            pma.f39649c.clear();
            pma.f39649c.putAll(map);
            if (set2 != null) {
                pma.f39652f = new HashSet(set2);
            } else {
                pma.f39652f = null;
            }
            pma.mo23401d();
            if (pma.mo23398a()) {
                pma.mo23402e();
                pma.mo23400c();
                pma.mo23399b();
            } else {
                pma.mo23400c();
            }
            pma.mo23403f();
        }
        if (z && qay.m31788b()) {
            this.f39694w.mo23519a(System.currentTimeMillis()).mo23522a();
            pmn pmn = this.f39693v;
            Set set3 = this.f39683k;
            if (pmn.f39712b) {
                pmn.mo23425b(set3);
            }
        }
        if (set != null && isInteractive && z2) {
            if (!this.f39692u) {
                this.f39692u = true;
                m30819b();
                this.f39687p.mo23144h();
            } else if (z) {
                m30817a(bpew.DISCOVERY_STOP_CRITERIA_CHANGED);
                m30819b();
            }
            List list = this.f39690s;
            int size = list.size();
            while (i2 < size) {
                ply ply = (ply) list.get(i2);
                Set set4 = this.f39683k;
                int i3 = this.f39684l;
                if (!ply.f39645j) {
                    ply.f39645j = ply.mo23386b(set4, i3);
                } else {
                    ply.mo23384a(set4, i3);
                }
                i2++;
            }
            if (f39674d) {
                this.f39679g.execute(new pme(this));
            }
        } else if (this.f39692u) {
            this.f39692u = false;
            if (set == null) {
                bpew = bpew.DISCOVERY_STOP_CRITERIA_CHANGED;
            } else if (isInteractive) {
                bpew = bpew.DISCOVERY_STOP_NETWORK_CHANGE;
            } else {
                bpew = bpew.DISCOVERY_STOP_SCREEN_OFF;
            }
            m30817a(bpew);
            List list2 = this.f39690s;
            int size2 = list2.size();
            while (i2 < size2) {
                ((ply) list2.get(i2)).mo23394d();
                i2++;
            }
        }
    }
}
