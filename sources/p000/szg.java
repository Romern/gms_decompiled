package p000;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import java.lang.ref.WeakReference;

/* renamed from: szg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class szg {

    /* renamed from: a */
    public static final Logger f45485a = tea.m36798a("cellular_networks_listener");

    /* renamed from: f */
    private static WeakReference f45486f = new WeakReference(null);

    /* renamed from: b */
    public int f45487b;

    /* renamed from: c */
    public long f45488c;

    /* renamed from: d */
    public int f45489d;

    /* renamed from: e */
    public long f45490e;

    /* renamed from: g */
    private boolean f45491g = false;

    /* renamed from: h */
    private final ConnectivityManager.NetworkCallback f45492h = new szf(this);

    private szg() {
    }

    /* renamed from: a */
    public static synchronized szg m36644a() {
        szg szg;
        synchronized (szg.class) {
            szg = (szg) f45486f.get();
            if (szg == null) {
                szg = new szg();
                f45486f = new WeakReference(szg);
            }
        }
        return szg;
    }

    /* renamed from: d */
    public static boolean m36645d() {
        if (cdfn.m132939b()) {
            szr.m36692a();
            szr.f45526a.logVerbose("Getting count of successful CellularNetworkEvents for subscriptionId %d", -1);
            if (szr.m36688a(-1, 1) < cdfn.f180658a.mo6606a().mo77407i()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final synchronized void mo26268c() {
        if (this.f45491g) {
            f45485a.mo25412b("Stopping CellularNetworkEvents listener.", new Object[0]);
            ((ConnectivityManager) rpr.m34216b().getSystemService("connectivity")).unregisterNetworkCallback(this.f45492h);
            this.f45491g = false;
            return;
        }
        f45485a.mo25412b("CellularNetworkEvents listener already stopped.", new Object[0]);
    }

    /* renamed from: b */
    public final void mo26267b() {
        rpr.m34216b();
        if (m36645d()) {
            mo26266a(cdfn.f180658a.mo6606a().mo77406h(), (int) cdfn.f180658a.mo6606a().mo77405g());
        } else {
            f45485a.logVerbose("Cellular network signals disabled.", new Object[0]);
        }
    }

    /* renamed from: a */
    public final synchronized void mo26266a(long j, int i) {
        this.f45487b = i;
        this.f45488c = j;
        this.f45489d = 0;
        this.f45490e = System.currentTimeMillis() / 1000;
        if (!this.f45491g) {
            f45485a.mo25412b("Starting CellularNetworkEvents listener.", new Object[0]);
            ((ConnectivityManager) rpr.m34216b().getSystemService("connectivity")).registerNetworkCallback(new NetworkRequest.Builder().addTransportType(0).build(), this.f45492h);
            this.f45491g = true;
            return;
        }
        f45485a.mo25412b("CellularNetworkEvents listener already started.", new Object[0]);
    }
}
