package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Build;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aiof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiof {

    /* renamed from: a */
    public final Context f69320a;

    /* renamed from: b */
    public final aioz f69321b;

    /* renamed from: c */
    public final WifiManager f69322c;

    /* renamed from: d */
    public final ConnectivityManager f69323d;

    /* renamed from: e */
    public final WifiP2pManager f69324e;

    /* renamed from: f */
    public final airs f69325f;

    /* renamed from: g */
    public aint f69326g;

    /* renamed from: h */
    public ServerSocket f69327h;

    /* renamed from: i */
    public airo f69328i;

    /* renamed from: j */
    public airo f69329j;

    /* renamed from: k */
    public airo f69330k;

    /* renamed from: l */
    public final bqgj f69331l = ahhr.m55806b();

    /* renamed from: m */
    private ains f69332m;

    /* renamed from: n */
    private final AtomicBoolean f69333n = new AtomicBoolean();

    public aiof(Context context, aioz aioz, airs airs) {
        Context applicationContext = context.getApplicationContext();
        this.f69320a = applicationContext;
        this.f69321b = aioz;
        this.f69322c = (WifiManager) applicationContext.getSystemService("wifi");
        this.f69323d = (ConnectivityManager) this.f69320a.getSystemService("connectivity");
        this.f69324e = (WifiP2pManager) this.f69320a.getSystemService("wifip2p");
        this.f69325f = airs;
    }

    /* renamed from: a */
    public static WifiConfiguration m57536a(String str, String str2, boolean z) {
        WifiConfiguration wifiConfiguration = new WifiConfiguration();
        wifiConfiguration.SSID = str;
        wifiConfiguration.preSharedKey = str2;
        wifiConfiguration.allowedAuthAlgorithms.set(0);
        if (z) {
            wifiConfiguration.allowedKeyManagement.set(1);
        } else {
            int i = Build.VERSION.SDK_INT;
            wifiConfiguration.allowedKeyManagement.set(4);
        }
        return wifiConfiguration;
    }

    /* renamed from: b */
    static String m57543b(String str) {
        return m57544c(str) ? str.substring(1, str.length() - 1) : str;
    }

    /* renamed from: c */
    static boolean m57544c(String str) {
        if (str.length() >= 2 && str.charAt(0) == '\"' && str.charAt(str.length() - 1) == '\"') {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private final void m57545k() {
        airo airo = this.f69329j;
        if (airo != null) {
            this.f69325f.mo37910c(airo);
            this.f69329j = null;
            if (!this.f69321b.mo37789a()) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                bnsl.mo68432a("aiof", "k", 437, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to turn Wifi back on after stopping the Wifi Soft AP hotspot.");
            }
        }
    }

    /* renamed from: l */
    private final void m57546l() {
        if (this.f69330k == null) {
            return;
        }
        if (!mo37749d()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aiof", "l", 494, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Can't stop Wifi Direct hotspot because Wifi Direct is not supported.");
            return;
        }
        this.f69325f.mo37910c(this.f69330k);
        this.f69330k = null;
    }

    /* renamed from: n */
    private final void m57548n() {
        airo airo = this.f69328i;
        if (airo != null) {
            this.f69325f.mo37910c(airo);
            this.f69328i = null;
            if (!this.f69321b.mo37789a()) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                bnsl.mo68432a("aiof", "n", 587, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to turn Wifi back on after stopping the local only Wifi hotspot.");
            }
        }
    }

    /* renamed from: o */
    private final boolean m57549o() {
        return this.f69332m != null;
    }

    /* renamed from: b */
    public final synchronized boolean mo37747b() {
        return this.f69326g != null;
    }

    /* renamed from: c */
    public final synchronized aint mo37748c() {
        return this.f69326g;
    }

    /* renamed from: d */
    public final boolean mo37749d() {
        int i = Build.VERSION.SDK_INT;
        return this.f69320a.getPackageManager().hasSystemFeature("android.hardware.wifi.direct") && this.f69324e != null;
    }

    /* renamed from: e */
    public final void mo37750e() {
        mo37755j();
        synchronized (this) {
            if (mo37747b()) {
                if (this.f69330k != null) {
                    if (!mo37749d()) {
                        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
                        bnsl.mo68432a("aiof", "l", 494, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("Can't stop Wifi Direct hotspot because Wifi Direct is not supported.");
                    } else {
                        this.f69325f.mo37910c(this.f69330k);
                        this.f69330k = null;
                    }
                }
                airo airo = this.f69328i;
                if (airo != null) {
                    this.f69325f.mo37910c(airo);
                    this.f69328i = null;
                    if (!this.f69321b.mo37789a()) {
                        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
                        bnsl2.mo68432a("aiof", "n", 587, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68405a("Failed to turn Wifi back on after stopping the local only Wifi hotspot.");
                    }
                }
                airo airo2 = this.f69329j;
                if (airo2 != null) {
                    this.f69325f.mo37910c(airo2);
                    this.f69329j = null;
                    if (!this.f69321b.mo37789a()) {
                        bnsl bnsl3 = (bnsl) ailf.f69111a.mo68388c();
                        bnsl3.mo68432a("aiof", "k", 437, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68405a("Failed to turn Wifi back on after stopping the Wifi Soft AP hotspot.");
                    }
                }
                srn srn = ailf.f69111a;
                String str = this.f69326g.f69286a;
                this.f69326g = null;
                return;
            }
            bnsl bnsl4 = (bnsl) ailf.f69111a.mo68390d();
            bnsl4.mo68432a("aiof", "e", 597, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68405a("Can't stop the Wifi hotspot because it was never turned on.");
        }
    }

    /* renamed from: f */
    public final boolean mo37751f() {
        return this.f69327h != null;
    }

    /* renamed from: g */
    public final void mo37752g() {
        mo37755j();
        synchronized (this) {
            if (!mo37751f()) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
                bnsl.mo68432a("aiof", "g", 756, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Can't stop accepting Wifi connections because it was never started.");
                return;
            }
            try {
                this.f69327h.close();
                this.f69327h = null;
                ails.m57447b();
                srn srn = ailf.f69111a;
            } catch (IOException e) {
                try {
                    bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                    bnsl2.mo68437a(e);
                    bnsl2.mo68432a("aiof", "g", 773, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Failed to close existing Wifi server socket.");
                    this.f69327h = null;
                    ails.m57447b();
                } catch (Throwable th) {
                    this.f69327h = null;
                    ails.m57447b();
                    srn srn2 = ailf.f69111a;
                    throw th;
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo37753h() {
        mo37755j();
        synchronized (this) {
            if (!m57549o()) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
                bnsl.mo68432a("aiof", "h", 936, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Cannot disconnect from the Wifi hotspot when it was never connected.");
                return;
            }
            this.f69325f.mo37910c(this.f69332m);
            this.f69332m = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo37754i() {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
        bnsl.mo68432a("aiof", "i", 470, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Wifi Direct channel has disconnected.");
        mo37750e();
    }

    /* renamed from: j */
    public final void mo37755j() {
        this.f69333n.set(true);
        srn srn = ailf.f69111a;
    }

    /* renamed from: m */
    private final boolean m57547m() {
        int i = Build.VERSION.SDK_INT;
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aiof", "m", 516, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Attempting to start a local only hotspot.");
        if (!cfnv.m140739A()) {
            int i2 = Build.VERSION.SDK_INT;
        } else if (!this.f69321b.mo37790b()) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
            bnsl2.mo68432a("aiof", "m", 525, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to start a local-only hotspot because we failed to turn Wifi off before starting it up.");
            return false;
        }
        bqgy c = bqgy.m112818c();
        ainu ainu = new ainu(this.f69322c, c, new ainm(this, c));
        if (airr.SUCCESS != this.f69325f.mo37908b(ainu)) {
            this.f69321b.mo37789a();
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68388c();
            bnsl3.mo68432a("aiof", "m", 564, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Unable to start the Local only hotspot because registration failed.");
            return false;
        }
        this.f69328i = ainu;
        this.f69326g = ainu.f69291a;
        return true;
    }

    /* renamed from: a */
    static String m57537a(String str) {
        if (m57544c(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2);
        sb.append("\"");
        sb.append(str);
        sb.append("\"");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        r2 = r6;
     */
    /* renamed from: a */
    public static InetAddress m57538a(WifiManager wifiManager) {
        int ipAddress = wifiManager.getConnectionInfo().getIpAddress();
        if (ipAddress != 0) {
            return ails.m57449c(ipAddress);
        }
        ArrayList list = Collections.list(NetworkInterface.getNetworkInterfaces());
        int size = list.size();
        int i = 0;
        while (i < size) {
            ArrayList list2 = Collections.list(((NetworkInterface) list.get(i)).getInetAddresses());
            int size2 = list2.size();
            int i2 = 0;
            while (true) {
                int i3 = i + 1;
                if (i2 >= size2) {
                    break;
                }
                InetAddress inetAddress = (InetAddress) list2.get(i2);
                if (!inetAddress.isLoopbackAddress() && (inetAddress instanceof Inet4Address)) {
                    return inetAddress;
                }
                i2++;
            }
        }
        throw new IOException("Failed to find my own IPv4 address.");
    }

    /* renamed from: a */
    public static void m57539a(WifiConfiguration wifiConfiguration, WifiConfiguration wifiConfiguration2) {
        wifiConfiguration2.preSharedKey = wifiConfiguration.preSharedKey;
        wifiConfiguration2.allowedAuthAlgorithms = (BitSet) wifiConfiguration.allowedAuthAlgorithms.clone();
        wifiConfiguration2.allowedKeyManagement = (BitSet) wifiConfiguration.allowedKeyManagement.clone();
    }

    /* renamed from: a */
    public static void m57540a(WifiManager wifiManager, String str) {
        List<WifiConfiguration> configuredNetworks = wifiManager.getConfiguredNetworks();
        if (configuredNetworks != null) {
            for (WifiConfiguration wifiConfiguration : configuredNetworks) {
                if (m57543b(wifiConfiguration.SSID).equals(m57543b(str))) {
                    wifiManager.removeNetwork(wifiConfiguration.networkId);
                    wifiManager.saveConfiguration();
                    srn srn = ailf.f69111a;
                    return;
                }
            }
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aiof", "a", 920, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to forget SSID %s. Unable to find it in the list of configured Wifi networks.", str);
            return;
        }
        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
        bnsl2.mo68432a("aiof", "a", 925, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68420a("Failed to forget SSID %s because wifiManager.getConfiguredNetworks() returned null.", str);
    }

    /* renamed from: a */
    private final boolean m57541a(ahfk ahfk) {
        if (!this.f69321b.mo37790b()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("aiof", "a", 404, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to start a Wifi AP because we failed to turn Wifi off before starting it up.");
            return false;
        }
        ainz ainz = new ainz(this.f69320a, this.f69322c, this.f69323d, ahfk);
        if (airr.SUCCESS != this.f69325f.mo37908b(ainz)) {
            this.f69321b.mo37789a();
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
            bnsl2.mo68432a("aiof", "a", 415, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Unable to start a Soft AP Wifi Hotspot because registration failed.");
            return false;
        }
        this.f69326g = ainz.f69302b;
        this.f69329j = ainz;
        return true;
    }

    /* renamed from: a */
    private final boolean m57542a(boolean z) {
        if (!mo37749d()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aiof", "a", 458, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Wifi Direct is not supported.");
            return false;
        }
        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
        bnsl2.mo68432a("aiof", "a", 462, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("Attempting to start a wifi direct hotspot.");
        aioe aioe = new aioe(this.f69320a, this.f69324e, new ainf(this), this.f69322c, z);
        if (this.f69325f.mo37908b(aioe) != airr.SUCCESS) {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68388c();
            bnsl3.mo68432a("aiof", "a", 478, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Unable to start Wifi Direct hotspot because registration failed");
            return false;
        }
        this.f69326g = aioe.f69314b;
        this.f69330k = aioe;
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* renamed from: a */
    public final synchronized aiwd mo37741a(String str, String str2, String str3, int i, ahfk ahfk) {
        String str4 = str;
        int i2 = i;
        synchronized (this) {
            if (str4 == null || str2 == null) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                bnsl.mo68432a("aiof", "a", 797, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Refusing to connect to Wifi hotspot because at least one of ssid or password is null.");
                return null;
            }
            this.f69333n.set(false);
            if (m57549o()) {
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                bnsl2.mo68432a("aiof", "a", 809, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68422a("Refusing to connect to Wifi hotspot (%s, %d) because we're already connected to another one.", (Object) str4, i2);
                return null;
            } else if (!mo37744a()) {
                bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
                bnsl3.mo68432a("aiof", "a", 817, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68422a("Failed to connect to Wifi hotspot (%s, %d) because WifiHotspot is not available.", (Object) str4, i2);
                return null;
            } else {
                if (mo37747b()) {
                    bnsl bnsl4 = (bnsl) ailf.f69111a.mo68390d();
                    bnsl4.mo68432a("aiof", "a", 831, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    aint aint = this.f69326g;
                    bnsl4.mo68426a("Attempting to stop own Wifi hotspot (%s, %d) before trying to connect to another hotspot (%s, %d).", aint.f69286a, Integer.valueOf(aint.f69290e), str, Integer.valueOf(i));
                    mo37752g();
                    mo37750e();
                }
                ahfk.mo36399a(new aing(this));
                ains ains = new ains(this.f69322c, this.f69323d, this.f69333n, str, str2, i, str3);
                ainh ainh = new ainh(this, ains, str4, i2);
                butj butj = new butj(new aini(this));
                butj.f154849a = this.f69333n;
                if (airr.SUCCESS != ((airr) butl.m120433a(ainh, "ConnectToHotspot", butj.mo73110a()))) {
                    bnsl bnsl5 = (bnsl) ailf.f69111a.mo68388c();
                    bnsl5.mo68432a("aiof", "a", 873, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl5.mo68405a("Failed to create client WifiHotspot socket because we failed to register the MediumOperation.");
                    return null;
                }
                aiwd aiwd = ains.f69280c;
                aiwd.mo37637a(new ainj(this, ains));
                srn srn = ailf.f69111a;
                this.f69332m = ains;
                return aiwd;
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo37742a(airo airo) {
        this.f69325f.mo37910c(airo);
        ails.m57447b();
    }

    /* renamed from: a */
    public final void mo37743a(Runnable runnable) {
        this.f69331l.execute(runnable);
    }

    /* renamed from: a */
    public final boolean mo37744a() {
        return cfnv.f184625a.mo6606a().mo81752aK() && this.f69320a.getPackageManager().hasSystemFeature("android.hardware.wifi") && this.f69322c != null && this.f69323d != null;
    }

    /* renamed from: a */
    public final boolean mo37745a(ahoc ahoc) {
        if (ahoc == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aiof", "a", 616, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Refusing to start accepting Wifi connections because acceptedConnectionCallback is null.");
            return false;
        }
        mo37755j();
        synchronized (this) {
            if (mo37751f()) {
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                bnsl2.mo68432a("aiof", "a", 626, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Refusing to start accepting Wifi connections because another Wifi server is already in-progress.");
                return false;
            } else if (!mo37747b()) {
                bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
                bnsl3.mo68432a("aiof", "a", 634, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("Can't start accepting Wifi connections without hosting a hotspot.");
                return false;
            } else if (!mo37744a()) {
                bnsl bnsl4 = (bnsl) ailf.f69111a.mo68390d();
                bnsl4.mo68432a("aiof", "a", 639, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("Failed to start accepting Wifi connections because WifiHotspot is not available.");
                return false;
            } else {
                try {
                    ails.m57439a();
                    ServerSocket serverSocket = new ServerSocket();
                    serverSocket.bind(new InetSocketAddress(this.f69326g.f69288c, 0));
                    this.f69326g.f69290e = serverSocket.getLocalPort();
                    new ainp(this, 9, serverSocket, ahoc).start();
                    this.f69327h = serverSocket;
                    srn srn = ailf.f69111a;
                    String str = this.f69326g.f69286a;
                    return true;
                } catch (IOException e) {
                    bnsl bnsl5 = (bnsl) ailf.f69111a.mo68387b();
                    bnsl5.mo68437a(e);
                    bnsl5.mo68432a("aiof", "a", 660, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl5.mo68405a("Failed to start accepting Wifi connections.");
                    return false;
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo37746a(boolean z, ahfk ahfk) {
        mo37755j();
        synchronized (this) {
            if (mo37747b()) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                bnsl.mo68432a("aiof", "a", 310, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Refusing to start a Wifi hotspot because we're already hosting a Wifi hotspot with SSID %s.", mo37748c().f69286a);
                return false;
            } else if (!mo37744a()) {
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
                bnsl2.mo68432a("aiof", "a", 318, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Failed to start a Wifi hotspot because WifiHotspot is not available.");
                return false;
            } else {
                if (cfnv.f184625a.mo6606a().mo81759aR()) {
                    if (mo37749d()) {
                        bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
                        bnsl3.mo68432a("aiof", "a", 462, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68405a("Attempting to start a wifi direct hotspot.");
                        aioe aioe = new aioe(this.f69320a, this.f69324e, new ainf(this), this.f69322c, z);
                        if (this.f69325f.mo37908b(aioe) != airr.SUCCESS) {
                            bnsl bnsl4 = (bnsl) ailf.f69111a.mo68388c();
                            bnsl4.mo68432a("aiof", "a", 478, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl4.mo68405a("Unable to start Wifi Direct hotspot because registration failed");
                        } else {
                            this.f69326g = aioe.f69314b;
                            this.f69330k = aioe;
                            bnsl bnsl5 = (bnsl) ailf.f69111a.mo68390d();
                            bnsl5.mo68432a("aiof", "a", 324, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl5.mo68405a("Successfully started a Wifi Direct hotspot");
                            return true;
                        }
                    } else {
                        bnsl bnsl6 = (bnsl) ailf.f69111a.mo68390d();
                        bnsl6.mo68432a("aiof", "a", 458, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl6.mo68405a("Wifi Direct is not supported.");
                    }
                    bnsl bnsl7 = (bnsl) ailf.f69111a.mo68390d();
                    bnsl7.mo68432a("aiof", "a", 327, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl7.mo68405a("Failed to start a Wifi Direct hotspot");
                }
                if (cfnv.f184625a.mo6606a().mo81758aQ()) {
                    int i = Build.VERSION.SDK_INT;
                    bnsl bnsl8 = (bnsl) ailf.f69111a.mo68390d();
                    bnsl8.mo68432a("aiof", "m", 516, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl8.mo68405a("Attempting to start a local only hotspot.");
                    if (!cfnv.m140739A()) {
                        int i2 = Build.VERSION.SDK_INT;
                    } else if (!this.f69321b.mo37790b()) {
                        bnsl bnsl9 = (bnsl) ailf.f69111a.mo68388c();
                        bnsl9.mo68432a("aiof", "m", 525, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl9.mo68405a("Failed to start a local-only hotspot because we failed to turn Wifi off before starting it up.");
                        bnsl bnsl10 = (bnsl) ailf.f69111a.mo68390d();
                        bnsl10.mo68432a("aiof", "a", 336, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl10.mo68405a("Failed to start a local only hotspot");
                    }
                    bqgy c = bqgy.m112818c();
                    ainu ainu = new ainu(this.f69322c, c, new ainm(this, c));
                    if (airr.SUCCESS != this.f69325f.mo37908b(ainu)) {
                        this.f69321b.mo37789a();
                        bnsl bnsl11 = (bnsl) ailf.f69111a.mo68388c();
                        bnsl11.mo68432a("aiof", "m", 564, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl11.mo68405a("Unable to start the Local only hotspot because registration failed.");
                        bnsl bnsl102 = (bnsl) ailf.f69111a.mo68390d();
                        bnsl102.mo68432a("aiof", "a", 336, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl102.mo68405a("Failed to start a local only hotspot");
                    } else {
                        this.f69328i = ainu;
                        this.f69326g = ainu.f69291a;
                        bnsl bnsl12 = (bnsl) ailf.f69111a.mo68390d();
                        bnsl12.mo68432a("aiof", "a", 333, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl12.mo68405a("Successfully started a local only hotspot");
                        return true;
                    }
                }
                if (cfnv.f184625a.mo6606a().mo81760aS()) {
                    if (!this.f69321b.mo37790b()) {
                        bnsl bnsl13 = (bnsl) ailf.f69111a.mo68388c();
                        bnsl13.mo68432a("aiof", "a", 404, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl13.mo68405a("Failed to start a Wifi AP because we failed to turn Wifi off before starting it up.");
                    } else {
                        ainz ainz = new ainz(this.f69320a, this.f69322c, this.f69323d, ahfk);
                        if (airr.SUCCESS == this.f69325f.mo37908b(ainz)) {
                            this.f69326g = ainz.f69302b;
                            this.f69329j = ainz;
                            bnsl bnsl14 = (bnsl) ailf.f69111a.mo68390d();
                            bnsl14.mo68432a("aiof", "a", 342, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl14.mo68405a("Successfully started a Wifi SoftAP hotspot");
                            return true;
                        }
                        this.f69321b.mo37789a();
                        bnsl bnsl15 = (bnsl) ailf.f69111a.mo68388c();
                        bnsl15.mo68432a("aiof", "a", 415, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl15.mo68405a("Unable to start a Soft AP Wifi Hotspot because registration failed.");
                    }
                    bnsl bnsl16 = (bnsl) ailf.f69111a.mo68390d();
                    bnsl16.mo68432a("aiof", "a", 345, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl16.mo68405a("Failed to start a Wifi SoftAP hotspot");
                }
                bnsl bnsl17 = (bnsl) ailf.f69111a.mo68387b();
                bnsl17.mo68432a("aiof", "a", 349, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl17.mo68405a("Failed to start a Wifi hotspot");
                return false;
            }
        }
    }
}
